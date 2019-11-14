package net.code;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @Autowired
    private TrSellItemsService sellItemsService;

    @Autowired
    private HttpSession session;

    @RequestMapping("/")
    public String showTopPage(Model model) {

        // 全販売商品取得
        List<TrSellItemsEntity> sellItemsList = sellItemsService.findAll();

        // 取得した全販売商品データをModelに保存
        model.addAttribute("sellItemsList", sellItemsList);

        return "index";
    }

    @RequestMapping("/items/{id}")
    public String showItemPage(@PathVariable int id, Model model) {

        // 指定されたIDの商品を取得
        TrSellItemsEntity selectedItem = sellItemsService.getOne(id);

        // EntityをModelに登録
        model.addAttribute("selectedItem", selectedItem);

        return "items";
    }

    @RequestMapping("/cart")
    public String showCartItem() {

        return "cart";
    }

    @RequestMapping("/cart/add/{id}")
    public String addCartItem(@PathVariable int id) {

        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            // セッションにカートの登録がなければ新規作成
            cart = new Cart();
        }

        // カートにアイテムを追加
        TrSellItemsEntity selectedItem = sellItemsService.getOne(id);
        CartItem cartItem = new CartItem(selectedItem);
        cart.addCartItem(cartItem);

        // カートをセッションに保存
        session.setAttribute("cart", cart);

        return "redirect:/cart";
    }

    @RequestMapping("/cart/remove/{id}")
    public String removeCartItem(@PathVariable int id) {

        // カートからアイテムを削除
        Cart cart = (Cart) session.getAttribute("cart");
        cart.removeCartItem(id);

        // カートをセッションに保存
        session.setAttribute("cart", cart);

        return "redirect:/cart";
    }
}

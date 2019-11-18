package net.code;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @InitBinder
    public void InitBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, editor);
    }

    @RequestMapping("/showform")
    public String showForm(Model model) {

        // 支払情報オブジェクトを作成してモデルに登録
        model.addAttribute("checkout", new Checkout());

         return "checkout";
    }

    @RequestMapping("/purchase")
    public String purchase(
            @Valid @ModelAttribute("checkout") Checkout checkout,
            BindingResult result) {

        if (result.hasErrors()) {
            // 元の画面にエラーメッセージを表示
            return "checkout";
        }

        // カートの中身を初期化
        Cart cart = new Cart();
        session.setAttribute("cart", cart);

        return "purchase";
    }
}

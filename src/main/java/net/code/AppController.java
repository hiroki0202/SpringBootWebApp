package net.code;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @Autowired
    private TrSellItemsService sellItemsService;

    // セッションスコープ
    @Autowired
    HttpSession session;

    @RequestMapping("/")
    public String showTopPage() {

        // 全販売商品取得
        List<TrSellItemsEntity> sellItemsList = sellItemsService.findAll();
        for (int i = 0; i < sellItemsList.size(); i++) {
            System.out.println("取得したファイル名：");
            System.out.println(sellItemsList.get(i).getSellItemsImageFileName1());
        }

        // 取得した全販売商品データをセッションスコープに保存
        session.setAttribute("sellItemsList", sellItemsList);

        return "index";
    }
}

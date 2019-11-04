package net.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class AppController {

    @Autowired
    private TrSellItemsService sellItemsService;

//    @Autowired
//    HttpSession session;

    @RequestMapping("/")
    public String showTopPage() {

        // 販売商品取得
        List<TrSellItemsEntity> sellItemsList = sellItemsService.findAll();
        for (int i=0; i<sellItemsList.size(); i++) {
            System.out.println(sellItemsList.get(i).getItemsNum());
        }
//        session.setAttribute("sellItemsList", sellItemsList);

        return "WEB-INF/index.jsp";
    }
}

package com.letaotao.controller;
import com.letaotao.pojo.Items;
import com.letaotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:LiuRuidong
 * @Description:
 * @Date: Created in 2:25 2018/4/8
 * @Modified By:
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/items")
    @ResponseBody
    public Items fun(String itemsId){
        System.out.println("haha");
        System.out.println(itemService.getItemsById(itemsId).toString()+"****");
        return itemService.getItemsById(itemsId);
    }
}

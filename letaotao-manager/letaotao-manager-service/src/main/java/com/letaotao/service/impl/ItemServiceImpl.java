package com.letaotao.service.impl;

import com.letaotao.mappper.ItemsMapper;
import com.letaotao.pojo.Items;
import com.letaotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:LiuRuidong
 * @Description:
 * @Date: Created in 2:24 2018/4/8
 * @Modified By:
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public Items getItemsById(String itemId) {
        return itemsMapper.loadById(itemId);
    }
}

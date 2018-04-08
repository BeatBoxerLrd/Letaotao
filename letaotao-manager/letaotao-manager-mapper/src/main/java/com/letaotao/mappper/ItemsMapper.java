package com.letaotao.mappper;




import com.letaotao.pojo.Items;

import java.util.List;


public interface ItemsMapper {

    /**
     * 查询商品信息
     * @param itemsId 通过商品Id
     * @return 返回商品
     */
    Items loadById(String itemsId);

    /**
     * 查询吃点啥
     * @return 返回所有吃的东西
     */
    List<Items> selectEat();
    /**
     * 查询喝点啥
     * @return 返回所有喝的东西
     */
    List<Items> selectDrink();
    /**
     * 查询DIY
     * @return 返回所有商品
     */
    List<Items> selectAll();

    /**
     * 查询上新的商品，
     * 目的是给前台上新管理里边放，
     * 并且给后台的商品上新管理里边显示用
     * @return
     */
    List<Items> selectNewImage();

    /**
     * 查询轮播的商品
     * @return 轮播的商品
     */
    List<Items> selectItemsCarousel();
    /**
     * @Author：LiuRuidong
     * @Description: 查询未上新的商品，供后台管理上新商品时选择用
     * @Date:2018/2/2 20:54
     * @Param:
     * @return 返回查询到的所有商品
     */
    List<Items> selectNotNewImage();

    /**
     * @Author：LiuRuidong
     * @Description: 查询未轮播的商品
     * @Date:2018/2/2 20:56
     * @Param:
     * @return 返回查询到的商品
     */
    List<Items> selectNotCarousel();

    /**
     * @Author：LiuRuidong
     * @Description: 当后台要更新上新商品时
     * @Date:2018/2/2 20:47
     * @Param: 商品ID
     * @return  返回被修改的次数
     */
    int updateChooseNewItems(String itemsId);

    /**
     * @Author：LiuRuidong
     * @Description: 当后台要更新轮播图商品时
     * @Date:2018/2/2 20:49
     * @Param: 商品ID
     * @return  返回被修改的行数
     */
    int updateChooseCarouselItems(String itemsId);
    /**
     * @Author：LiuRuidong
     * @Description: 确认上新商品时
     * @Date:2018/2/2 20:52
     * @Param: 商品的ID
     * @return  返回被修改的条数
     */
    int updateConfirmNewItems(String itemsId);
    /**
     * @Author：LiuRuidong
     * @Description: 确认轮播的商品
     * @Date:2018/2/2 20:53
     * @Param: 商品Id
     * @return  返回被修改的次数
     */
    int updateConfirmCarouselItems(String itemsId);

}
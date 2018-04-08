package com.letaotao.pojo;



import lombok.Data;

import java.util.Date;

/**
 * 商品表
 */
@Data
public class Items {

    private String itemsId;//商品Id

    private String itemsName;//商品名

    private double itemsPrice;//商品价格

    private String itemsPicture;//商品图片

    private long itemsSaleCount;//销售量

    private Byte itemsHandle;//商品上下架的标识

    private Byte itemsType;//商品类型（吃、喝）

    private String itemsInfo;//商品信息

    private Double itemsDiscount;//商品折扣

    private Byte itemsCarousel;//商品是否轮播

    private String carouselPicture;//商品轮播图片

    private Byte itemsOnthenew;//是否上新

    private Date CreateTime;//创建时间

    private Date updateTime;//更新时间

}
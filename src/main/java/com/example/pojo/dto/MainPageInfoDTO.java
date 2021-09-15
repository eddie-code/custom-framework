package com.example.pojo.dto;

import com.example.pojo.bo.HeadLine;
import com.example.pojo.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.pojo.dto
 * @ClassName MainPageInfoDTO
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:45
 * @modified by
 */
@Data
public class MainPageInfoDTO {

    private List<HeadLine> headLineList;

    private List<ShopCategory> shopCategoryList;

}

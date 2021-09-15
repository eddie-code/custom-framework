package com.example.service.combine;

import com.example.pojo.bo.HeadLine;
import com.example.pojo.bo.ShopCategory;
import com.example.pojo.dto.MainPageInfoDTO;
import com.example.pojo.dto.Result;

import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.service.combine
 * @ClassName HeadLineShopCategoryCombineService
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:44
 * @modified by
 */
public interface HeadLineShopCategoryCombineService {

	Result<MainPageInfoDTO> getMainPageInfo();


}

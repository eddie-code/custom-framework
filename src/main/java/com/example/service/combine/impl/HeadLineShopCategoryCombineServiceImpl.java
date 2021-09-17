package com.example.service.combine.impl;

import com.example.pojo.bo.HeadLine;
import com.example.pojo.bo.ShopCategory;
import com.example.pojo.dto.MainPageInfoDTO;
import com.example.pojo.dto.Result;
import com.example.service.combine.HeadLineShopCategoryCombineService;
import com.example.service.solo.HeadLineService;
import com.example.service.solo.ShopCategoryService;
import org.simpleframework.core.annotation.Service;

import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.service.combine
 * @ClassName HeadLineShopCategoryCombineServiceImpl
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:47
 * @modified by
 */
@Service
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

	private HeadLineService headLineService;

	private ShopCategoryService shopCategoryService;

	@Override
	public Result<MainPageInfoDTO> getMainPageInfo() {
		// 1. 获取头条列表
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(HeadLine.builder().enableStatus(1).build(), 1, 4);

        // 2. 获取店铺类别列表
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(ShopCategory.builder().build(), 1, 100);

        // 3. 合并两者并返回
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult,shopCategoryResult);
		return result;
	}

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
	    return null;
    }

}

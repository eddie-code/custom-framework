package com.example.service.solo.impl;

import com.example.pojo.bo.ShopCategory;
import com.example.pojo.dto.Result;
import com.example.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.service.solo.impl
 * @ClassName ShopCategoryServiceImpl
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:42
 * @modified by
 */
public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
		return null;
    }

    @Override
    public Result<Boolean> deleteShopCategory(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> updateShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<ShopCategory> queryShopCategoryById(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize) {
        return null;
    }
}

package com.example.service.solo;

import com.example.pojo.bo.ShopCategory;
import com.example.pojo.dto.Result;

import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.service.solo
 * @ClassName ShopCategoryService
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:27
 * @modified by
 */
public interface ShopCategoryService {

    /**
     * 添加操作
     * @param shopCategory
     * @return
     */
	Result<Boolean> addShopCategory(ShopCategory shopCategory);

    /**
     * 删除操作
     * @param shopCategoryId
     * @return
     */
	Result<Boolean> deleteShopCategory(int shopCategoryId);

    /**
     * 修改操作
     * @param shopCategory
     * @return
     */
	Result<Boolean> updateShopCategory(ShopCategory shopCategory);

    /**
     * 根据id查询
     * @param shopCategoryId
     * @return
     */
	Result<ShopCategory> queryShopCategoryById(int shopCategoryId);

    /**
     * 根据条件查询返回列表
     * @param shopCategoryCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
	Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}

package com.example.controller.superadmin;

import com.example.pojo.bo.ShopCategory;
import com.example.pojo.dto.Result;
import com.example.service.solo.ShopCategoryService;
import org.simpleframework.core.annotation.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.controller.superadmin
 * @ClassName ShopCategoryOperationController
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 19:30
 * @modified by
 */
@Controller
public class ShopCategoryOperationController {

    private ShopCategoryService shopCategoryService;

    public Result<Boolean> addShopCategory(HttpServletRequest req, HttpServletResponse resp){
        return shopCategoryService.addShopCategory(new ShopCategory());
    }
    public Result<Boolean> deleteShopCategory(HttpServletRequest req, HttpServletResponse resp){
        return shopCategoryService.deleteShopCategory(1);
    }
    public Result<Boolean> updateShopCategory(HttpServletRequest req, HttpServletResponse resp){
        return shopCategoryService.updateShopCategory(new ShopCategory());
    }
    public Result<ShopCategory> queryShopCategoryById(HttpServletRequest req, HttpServletResponse resp){
        return shopCategoryService.queryShopCategoryById(1);
    }
    public Result<List<ShopCategory>> queryShopCategory(HttpServletRequest req, HttpServletResponse resp){
        return shopCategoryService.queryShopCategory(null, 1, 100);
    }
}

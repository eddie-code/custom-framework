package com.example.controller.frontend;

import com.example.pojo.dto.MainPageInfoDTO;
import com.example.pojo.dto.Result;
import com.example.service.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.controller.frontend
 * @ClassName MainPageController
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 19:19
 * @modified by
 */
public class MainPageController {

    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest request, HttpServletResponse response) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }

}

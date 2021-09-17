package com.example.controller.superadmin;

import com.example.pojo.bo.HeadLine;
import com.example.pojo.dto.Result;
import com.example.service.solo.HeadLineService;
import org.simpleframework.core.annotation.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.controller.superadmin
 * @ClassName HeadLineOperationController
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 19:21
 * @modified by
 */
@Controller
public class HeadLineOperationController {

    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(HttpServletRequest request, HttpServletResponse response) {
        return headLineService.addHeadLine(new HeadLine());
    }

    public Result<Boolean> deleteHeadLineById(HttpServletRequest request, HttpServletResponse response) {
        return headLineService.deleteHeadLineById(1);
    }

    public Result<Boolean> updateHeadLine(HttpServletRequest request, HttpServletResponse response) {
        return headLineService.updateHeadLine(new HeadLine());
    }

    public Result<HeadLine> queryHeadLineById(HttpServletRequest request, HttpServletResponse response) {
        return headLineService.queryHeadLineById(1);
    }

    public Result<List<HeadLine>> queryHeadLine(HttpServletRequest request, HttpServletResponse response) {
        return headLineService.queryHeadLine(null,1,100);
    }

}

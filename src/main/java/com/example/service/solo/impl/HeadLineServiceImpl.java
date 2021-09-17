package com.example.service.solo.impl;

import com.example.pojo.bo.HeadLine;
import com.example.pojo.dto.Result;
import com.example.service.solo.HeadLineService;
import org.simpleframework.core.annotation.Service;

import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.service.solo.impl
 * @ClassName HeadLineServiceImpl
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:42
 * @modified by
 */
@Service
public class HeadLineServiceImpl implements HeadLineService {

    @Override
    public Result<Boolean> addHeadLine(HeadLine headLine) {
		return null;
    }

    @Override
    public Result<Boolean> deleteHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<Boolean> updateHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<HeadLine> queryHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize) {
        return null;
    }
}

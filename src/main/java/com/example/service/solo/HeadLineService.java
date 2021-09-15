package com.example.service.solo;

import com.example.pojo.bo.HeadLine;
import com.example.pojo.dto.Result;

import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.service.solo
 * @ClassName HeadLineService
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:27
 * @modified by
 */
public interface HeadLineService {

	/**
	 * 添加操作
	 * @param headLine
	 * @return
	 */
	Result<Boolean> addHeadLine(HeadLine headLine);

    /**
     * 删除操作
     * @param headLineId
     * @return
     */
	Result<Boolean> deleteHeadLineById(int headLineId);

    /**
     * 修改操作
     * @param headLine
     * @return
     */
	Result<Boolean> updateHeadLine(HeadLine headLine);

    /**
     * 根据ID查询
     * @param headLineId
     * @return
     */
	Result<HeadLine> queryHeadLineById(int headLineId);

    /**
     * 根据条件返回列表
     * @param headLineCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
	Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);

}

package com.example.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.pojo.bo
 * @ClassName ShopCategory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 9:49
 * @modified by
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShopCategory {
	/**
	 * 主键ID
	 */
	private Long shopCategoryId;
	/**
	 * 类别名
	 */
	private String shopCategoryName;
	/**
	 * 类别描述
	 */
	private String shopCategoryDesc;
	/**
	 * 类别图片（针对一级类别）
	 */
	private String shopCategoryImg;
	/**
	 * 权重。越大越排前显示
	 */
	private Integer priority;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 最近的更新时间
	 */
	private Date updateTime;
	/**
	 * 父类别
	 */
	private ShopCategory parent;

}

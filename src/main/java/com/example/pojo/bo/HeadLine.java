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
 * @ClassName HeadLine
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 9:47
 * @modified by
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HeadLine {
	/**
	 * 主键ID
	 */
	private Long lineId;
	/**
	 * 头条名字
	 */
	private String lineName;
	/**
	 * 头条链接，点击头条会进入对应的链接中
	 */
	private String lineLink;
	/**
	 * 头条图片
	 */
	private String lineImg;
	/**
	 * 权重，越大排的越靠前
	 */
	private Integer priority;
	/**
	 * 0 不可用 1 可用
	 */
	private Integer enableStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
}

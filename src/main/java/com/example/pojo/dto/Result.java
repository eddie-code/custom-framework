package com.example.pojo.dto;

import lombok.Data;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.pojo.dto
 * @ClassName Result
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 14:23
 * @modified by
 */
@Data
public class Result<T> {

	/**
	 * 请求结果的状态码
	 */
	private int code;

	/**
	 * 请求结果的详情
	 */
	private String message;

	/**
	 * 请求返回的结果集
	 */
	private T data;

}

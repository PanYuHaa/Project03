package com.atguigu.team.service;

/**
 * 项目名称 ： Project03
 * 类名称 ： Status
 * 类描述 ：枚举类
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午2:03:33
 * @version
 */
public class Status {
	private final String NAME;
	private Status(String name) {
		this.NAME = name;
	}
	
	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");
	
	public String getNAME() {
		return NAME;
	}
	
	@Override
	public String toString() {
		return NAME;
	}
}

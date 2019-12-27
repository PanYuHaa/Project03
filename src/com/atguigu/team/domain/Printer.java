package com.atguigu.team.domain;

/**
 * 项目名称 ： Project03
 * 类名称 ： Printer
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午1:05:06
 * @version
 */
public class Printer implements Equipment{
	
	private String name;//机器型号
	private String type;//机器类型
	
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name + "(" + type + ")";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public Printer() {
		super();
	}



	public Printer(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	
	
}

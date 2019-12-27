package com.atguigu.team.domain;

/**
 * 项目名称 ： Project03
 * 类名称 ： PC
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午12:25:54
 * @version
 */
public class PC implements Equipment{

	private String model;//表示机器的型号
	private String display;//表示显示器的名称

	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return model + "(" + display + ")";
	}



	public PC() {
		super();
	}



	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}



	public String getDisplay() {
		return display;
	}



	public void setDisplay(String display) {
		this.display = display;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}
	

}

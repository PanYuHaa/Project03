package com.atguigu.team.domain;

/**
 * 项目名称 ： Project03
 * 类名称 ： Notebook
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午12:59:49
 * @version
 */
public class NoteBook implements Equipment{

	private String model;//机器的型号
	private double price;//价格
	
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return model + "(" + price + ")";
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public NoteBook() {
		super();
	}



	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	

}

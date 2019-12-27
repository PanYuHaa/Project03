package com.atguigu.team.domain;

/**
 * 项目名称 ： Project03
 * 类名称 ： Architect
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午2:44:56
 * @version
 */
public class Architect extends Designer {
	
	private int stock;

	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
	}
	
	public String getDetailsForTeam() {
		return getTeamBaseDetail() + "\t架构师\t" + getBonus() + getStock();
	}
}

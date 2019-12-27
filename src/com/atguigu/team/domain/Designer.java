package com.atguigu.team.domain;

/**
 * 项目名称 ： Project03
 * 类名称 ： Designer
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午2:40:18
 * @version
 */
public class Designer extends Programmer {
	private double bonus;//奖金

	public Designer() {
		super();
	}



	public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}



	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	@Override
	public String toString() {
		return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
	}
	
	public String getDetailsForTeam() {
		return getTeamBaseDetail() + "\t设计师\t" + getBonus();
	}
}

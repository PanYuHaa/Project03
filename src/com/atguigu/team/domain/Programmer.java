package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

/**
 * 项目名称 ： Project03
 * 类名称 ： Programmer
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午1:59:08
 * @version
 */
public class Programmer extends Employee{

	private int memberId;//开发团队中的id
	private Status status = Status.FREE;//成员的在开发团队中的状态 (枚举类)
	private Equipment equipment;
	
	public Programmer() {
		super();
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public int getMemberid() {
		return memberId;
	}

	public void setMemberid(int memberid) {
		this.memberId = memberid;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	@Override
	public String toString() {
		return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
	}

	public String getTeamBaseDetail() {
		return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
	}
	
	public String getDetailsForTeam() {
		return getTeamBaseDetail() + "\t程序员";
	}
	
}

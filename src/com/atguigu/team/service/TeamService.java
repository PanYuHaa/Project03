package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * 项目名称 ： Project03
 * 类名称 ： TeamService
 * 类描述 ：关于开发团队成员的管理：添加、删除等。
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月26日下午2:17:12
 * @version
 */
public class TeamService {
	
	private static int counter = 1;//给memberId赋值使用
	private final int MAX_MEMBER = 5;//限制开发团队的人数
	private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队的成员
	private int total = 0;//记录开发团的人数
	
	
	public TeamService() {
		super();
	}
	/*
	 * 获取开发团队中的所有成员
	 */
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for(int i = 0;i < team.length;i++) {
			team[i] = this.team[i];
		}
		return team;
	}
	/*
	 * 将指定的员工添加到我们的开发团队当中
	 */
	public void addMember(Employee e) throws TeamException {
//		成员已满，无法添加
		if(total >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		}
//		该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}
//		该员工已在本开发团队中
		if(isExist(e)) {
			throw new TeamException("该员工已在本开发团队中");
		}
//		该员工已是某团队成员 
//		该员正在休假，无法添加
		
		Programmer p = (Programmer)e;
		if("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {//if(p.getStatus().getNAME().equals("BUSY")) {
			throw new TeamException("该员工已是某团队成员");
		}else if("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {
			throw new TeamException("该员正在休假，无法添加");
		}
		
//		团队中至多只能有一名架构师
//		团队中至多只能有两名设计师
//		团队中至多只能有三名程序员
		
		//获取Team已有成员中架构师，设计师，程序员的人数
		int numOfArch = 0,numOfDes = 0,numOfPro = 0;
		for(int i = 0;i < total;i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			}else if(team[i] instanceof Designer) {
				numOfDes++;
			}else if(team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		
		if(p instanceof Architect) {
			if(numOfArch >= 1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}else if(p instanceof Designer) {
				if(numOfDes >= 2) {
					throw new TeamException("团队中至多只能有两名设计师");
				}else if(p instanceof Programmer) {
					if(numOfPro >= 3) {
						throw new TeamException("团队中至多只能有三名程序员");
					}
				}
			}
		}
		
		//将p（或者e）添加到现有的team中
		team[total++] = p;
		//开发团队中p的属性赋值
		p.setStatus(Status.BUSY);
		p.setMemberid(counter++);
		
	}
	/*
	 * 判断指定员工是否已经存在于现有的开发团队当中
	 */
	private boolean isExist(Employee e) {
		
		for(int i = 0;i < total;i++) {
				return team[i].getId() == e.getId();
		}
		
		return false;
	}
	/*
	 * 将指定员工通过id来删除在员工列表当中
	 */
	public void removeMember(int memberId) throws TeamException {
		int i = 0;
		for(;i < total;i++) {
			if(team[i].getMemberid() == memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}

		}
		
		if(i == total){
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}
//		for(int j = i;j < total;j++) {
//			team[j-1]=team[j];
//		}
		for(int j = i;j < total-1;j++) {
			team[j] = team[j+1];
		}
		
		team[--total] = null;//相当于team[total-1] = null
		
		
	}
}

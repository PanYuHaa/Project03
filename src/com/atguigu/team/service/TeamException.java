package com.atguigu.team.service;

/**
 * 项目名称 ： Project03
 * 类名称 ： TeamExpection
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月24日下午8:33:46
 * @version
 */
public class TeamException extends Exception{
	 static final long serialVersionUID = -3387516993124229948L;
	 
	 public TeamException() {
		 super();
	 }
	 
	 public TeamException(String msg) {
		 super(msg);
	 }
}

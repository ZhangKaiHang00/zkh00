package com.zhangkaihang.test;

import org.apache.ibatis.session.SqlSessionFactory;

import org.junit.Test;

import com.zhangkaihang.senior1.week1.domain.Goods;

public class Dome {

	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void add() {
		sqlSessionFactory.getConfiguration();
		Goods goods = new Goods();
		goods.setGname("张三");
		goods.setDatea("2019-5-5");
		goods.setPrice(Double.parseDouble("50"));
		add();
	}
	@Test
	public void del() {
		sqlSessionFactory.getConfiguration();
		del();
	}
	@Test
	public void upd() {
		
		sqlSessionFactory.getConfiguration();
		Goods goods = new Goods();
		goods.setGname("张三");
		goods.setDatea("2019-5-5");
		goods.setPrice(Double.parseDouble("50"));
		
		upd();
	}
	
}

package com.zhangkaihang.senior1.week1.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.zhangkaihang.senior1.week1.domain.Goods;
import com.zhangkaihang.senior1.week1.service.GoodsService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsServiceImplTest {

	@Resource
	private GoodsService goodsss;
	
	@Test
	public void testSelects() {
		PageInfo selects = goodsss.selects(null, 3);
		System.out.println(selects.getList());
	}
	
	@Test
	public void testAdd(Goods goods) {
		   goodsss.add(goods);
		
	}

}

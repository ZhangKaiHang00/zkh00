package com.zhangkaihang.senior1.week1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangkaihang.senior1.week1.dao.GoodsMapper;
import com.zhangkaihang.senior1.week1.domain.Brands;
import com.zhangkaihang.senior1.week1.domain.Goods;
import com.zhangkaihang.senior1.week1.domain.Kinds;
import com.zhangkaihang.senior1.week1.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper mapper;

	@Override
	public PageInfo selects(String gname, int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 3);
		List list = mapper.selects(gname);
		PageInfo info = new PageInfo(list);
		return info;
	}

	@Override
	public List<Brands> getBrandsList() {
		// TODO Auto-generated method stub
		return mapper.getBrandsList();
	}

	@Override
	public List<Kinds> getKindsList() {
		// TODO Auto-generated method stub
		return mapper.getKindsList();
	}

	@Override
	public Goods select(Integer gid) {
		// TODO Auto-generated method stub
		return mapper.select(gid);
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		mapper.add(goods);
	}

	@Override
	public void upd(Goods goods) {
		// TODO Auto-generated method stub
		mapper.upd(goods);
	}

	@Override
	public void updstatus(String gid) {
		// TODO Auto-generated method stub
		mapper.updstatus(gid);
	}
	
	
	
}

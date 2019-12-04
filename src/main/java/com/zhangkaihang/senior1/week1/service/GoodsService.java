package com.zhangkaihang.senior1.week1.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangkaihang.senior1.week1.domain.Brands;
import com.zhangkaihang.senior1.week1.domain.Goods;
import com.zhangkaihang.senior1.week1.domain.Kinds;

public interface GoodsService {

	//列表+分页+模糊
	PageInfo selects(String gname,int pageNum);
	//所有的品牌
	List<Brands> getBrandsList();
	//所欲的分类
	List<Kinds> getKindsList();
	//查询详情
	Goods select(Integer gid);
	
	//添加
	void add(Goods goods);
	//修改
	void upd(Goods goods);
	//修改状态
	void updstatus(String gid);
	
}

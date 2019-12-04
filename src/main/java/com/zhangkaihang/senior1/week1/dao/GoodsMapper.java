package com.zhangkaihang.senior1.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangkaihang.senior1.week1.domain.Brands;
import com.zhangkaihang.senior1.week1.domain.Goods;
import com.zhangkaihang.senior1.week1.domain.Kinds;

public interface GoodsMapper {

	//列表
	List selects(@Param("gname")String gname);
	//所有品牌
	List<Brands> getBrandsList();
	//所有分类
	List<Kinds> getKindsList();
	//查询详情
	Goods select(@Param("gid")Integer gid);
	//添加
	void add(Goods goods);
	//修改
	void upd(Goods goods);
	//修改状态
	void updstatus(@Param("gid")String gid);
	
}

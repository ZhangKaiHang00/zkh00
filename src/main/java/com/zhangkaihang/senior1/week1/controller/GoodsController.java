package com.zhangkaihang.senior1.week1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhangkaihang.senior1.week1.domain.Brands;
import com.zhangkaihang.senior1.week1.domain.Goods;
import com.zhangkaihang.senior1.week1.domain.Kinds;
import com.zhangkaihang.senior1.week1.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	//列表+分页+模糊
	@RequestMapping("selects")
	public String selects(Model model,@RequestParam(defaultValue = "1")int pageNum,String gname) {
		PageInfo info = service.selects(gname, pageNum);
		model.addAttribute("info", info);
		model.addAttribute("gname", gname);
		return "selects";
	}
	//详情
	@RequestMapping("select")
	public String select(Model model,Integer gid) {
		Goods goods = service.select(gid);
		model.addAttribute("goods", goods);
		return "select";
	}
	//跳转到添加页面
	@RequestMapping("toadd")
	public String toadd(Model model) {
		List<Brands> brands = service.getBrandsList();
		List<Kinds> kinds = service.getKindsList();
		model.addAttribute("brands", brands);
		model.addAttribute("kinds", kinds);
		
		return "add";
	}

	//添加
	@ResponseBody
	@RequestMapping("add")
	public boolean add(Goods goods) {
		try {
			service.add(goods);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	//修改
	@ResponseBody
	@RequestMapping("upd")
	public boolean upd(Goods goods) {
		try {
			service.upd(goods);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	//跳转到修改页面
	@RequestMapping("toupd")
	public String toupd(Model model ,Integer gid) {
		List<Brands> brands = service.getBrandsList();
		List<Kinds> kinds = service.getKindsList();
		Goods goods = service.select(gid);
		model.addAttribute("brands", brands);
		model.addAttribute("kinds", kinds);
		model.addAttribute("goods", goods);
		
		return "upd";
	}
	
	//修改状态
	@ResponseBody
	@RequestMapping("updstatus")
	public boolean updstatus(String gid) {
		try {
			service.updstatus(gid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}

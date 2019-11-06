package com.bwei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bwei.beans.Goods;
import com.bwei.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Resource
	private GoodsService ser;
	//查询所有数据
	@RequestMapping("/getGoodsAll")
	public ModelAndView getGoodsAll(@RequestParam(defaultValue="1")Integer pageNum,Goods goods){
		
		ModelAndView mv = new ModelAndView();
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = ser.getGoodsAll(goods);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mv.getModelMap().addAttribute("page", page);
		mv.setViewName("jsp/goodList");
		return mv;
		
	}
	
	@RequestMapping("/getGoodsAlla")
	public ModelAndView getGoodsAlla(@RequestParam(defaultValue="1")Integer pageNum,Goods goods){
		
		ModelAndView mv = new ModelAndView();
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = ser.getGoodsAlla(goods);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mv.getModelMap().addAttribute("page", page);
		mv.setViewName("jsp/goodList");
		return mv;
		
	}
	
	@RequestMapping("/getGoodsAllb")
	public ModelAndView getGoodsAllb(@RequestParam(defaultValue="1")Integer pageNum,Goods goods){
		
		ModelAndView mv = new ModelAndView();
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = ser.getGoodsAllb(goods);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mv.getModelMap().addAttribute("page", page);
		mv.setViewName("jsp/goodList");
		return mv;
		
	}
	@RequestMapping("/getGoodsAllc")
	public ModelAndView getGoodsAllc(@RequestParam(defaultValue="1")Integer pageNum,Goods goods){
		
		ModelAndView mv = new ModelAndView();
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = ser.getGoodsAllc(goods);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mv.getModelMap().addAttribute("page", page);
		mv.setViewName("jsp/goodList");
		return mv;
		
	}
	
	@RequestMapping("/deleGoodsByGid")
	@ResponseBody
	public int deleGoodsByGid(String gid){
		ser.deleGoodsByGid(gid);
		return 1;
		
	}
}

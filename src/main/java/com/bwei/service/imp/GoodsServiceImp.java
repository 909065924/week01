package com.bwei.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bwei.beans.Goods;
import com.bwei.dao.GoodsDao;
import com.bwei.service.GoodsService;
@Service
public class GoodsServiceImp implements GoodsService {

	@Resource
	private GoodsDao dao;

	public List<Goods> getGoodsAll(Goods goods) {
		// TODO Auto-generated method stub
		return dao.getGoodsAll(goods);
	}

	public void addGoods(Goods goods) {
		// TODO Auto-generated method stub
		dao.addGoods(goods);
	}

	public void deleGoodsByGid(String gid) {
		// TODO Auto-generated method stub
		dao.deleGoodsByGid(gid);
	}

	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		dao.updateGoods(goods);
	}

	public Goods getGoodsByGid(Integer gid) {
		// TODO Auto-generated method stub
		return dao.getGoodsByGid(gid);
	}

	public List<Goods> getGoodsAlla(Goods goods) {
		// TODO Auto-generated method stub
		return dao.getGoodsAlla(goods);
	}

	public List<Goods> getGoodsAllb(Goods goods) {
		// TODO Auto-generated method stub
		return dao.getGoodsAllb(goods);
	}

	public List<Goods> getGoodsAllc(Goods goods) {
		// TODO Auto-generated method stub
		return dao.getGoodsAllc(goods);
	}
	
	
}

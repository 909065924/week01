package com.bwei.dao;

import java.util.List;

import com.bwei.beans.Goods;

public interface GoodsDao {
	
	List<Goods> getGoodsAll(Goods goods);
	
	void addGoods(Goods goods);
	
	void deleGoodsByGid(String gid);
	
	void updateGoods(Goods goods);
	
	Goods getGoodsByGid(Integer gid);

	List<Goods> getGoodsAlla(Goods goods);
	
	List<Goods> getGoodsAllb(Goods goods);
	
	List<Goods> getGoodsAllc(Goods goods);

}

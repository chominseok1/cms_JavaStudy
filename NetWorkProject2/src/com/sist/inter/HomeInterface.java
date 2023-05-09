package com.sist.inter;

import java.util.List;

import com.sist.manager.TravelVO;

public interface HomeInterface {
	public void cardPrint(List<TravelVO> list);
	public void cardInit(List<TravelVO> list);
}

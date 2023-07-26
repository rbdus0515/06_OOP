package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	Snack s = new Snack();
	
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		return kind + name + flavor + numOf + price;
	}
	
	public String confirmData() {
		return "";
	}

	
	
	
}

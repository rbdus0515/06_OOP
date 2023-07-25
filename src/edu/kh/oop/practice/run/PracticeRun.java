package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.HeroService;

import edu.kh.oop.practice.model.service.BookService;

public class PracticeRun {

	public static void main(String[] args) {

		HeroService heroSV = new HeroService();
		
		//heroSV.practice();
		
		BookService BS = new BookService();
		BS.practice();
	}

}

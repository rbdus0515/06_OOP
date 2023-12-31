package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero; // ctrl + shift + O = 자동 import
										  // 쓰지 않는 import 삭제

public class HeroService {

	public void practice() {
		
		Hero h1 = new Hero();
		
		h1.setJob("워리어");
		h1.setHp(18000);
		h1.setMp(5000);
		h1.setGender('남');
		h1.setLevel(5);
		
		System.out.println("직업 : " + h1.getJob());
		System.out.println("hp : " + h1.getHp());
		System.out.println("mp : " + h1.getMp());
		System.out.println("성별 : " + h1.getGender());
		System.out.println("현재 레벨은 " + h1.getLevel() + " 입니다.");
		
		System.out.println();
		System.out.println();
		
		Hero h2 = new Hero();
		
		h2.setJob("마법사");
		h2.setHp(5000);
		h2.setMp(25000);
		h2.setGender('여');
		h2.setLevel(2);
		
		System.out.println("직업 : " + h2.getJob());
		System.out.println("hp : " + h2.getHp());
		System.out.println("mp : " + h2.getMp());
		System.out.println("성별 : " + h2.getGender());
		System.out.println("현재 레벨은 " + h2.getLevel() + " 입니다.");
		
		System.out.println();
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		System.out.println();
		
		h2.attack(); // Hero 클래스에서 attack메서드 가져오기
		System.out.println();
		
		h1.setJob("워리어");
		h1.setHp(h1.getHp() - 150); // 감소된 값 그냥 입력하지 말고 위 결과값 받아서 계산식 만들기
		h1.setMp(5000);
		h1.setGender('남');
		h1.setLevel(5);
		
		System.out.println("직업 : " + h1.getJob());
		System.out.println("hp : " + h1.getHp());
		System.out.println("mp : " + h1.getMp());
		System.out.println("성별 : " + h1.getGender());
		System.out.println("현재 레벨은 " + h1.getLevel() + " 입니다.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=====================================================");
		
		Hero h3 = new Hero();
		
		h3.setJob("힐러");
		h3.setHp(10000);
		h3.setMp(50000);
		h3.setGender('남');
		h3.setLevel(10);
		
		System.out.println("직업 : " + h3.getJob());
		System.out.println("hp : " + h3.getHp());
		System.out.println("mp : " + h3.getMp());
		System.out.println("성별 : " + h3.getGender());
		System.out.println("현재 레벨은 " + h3.getLevel() + " 입니다.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		h3.jump(); // Hero 클래스에서 jump메서드 가져오기
	}
}

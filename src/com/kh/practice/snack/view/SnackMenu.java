package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	Scanner sc = new Scanner(System.in);
	
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String str1 = sc.next();
		
		System.out.print("이름 : ");
		String str2 = sc.next();
		
		System.out.print("맛 : ");
		String str3 = sc.next();
		
		System.out.print("개수 : ");
		int i1 = sc.nextInt();
		
		System.out.print("가격 : ");
		int i2 = sc.nextInt();
		
		scr.saveData(str1, str2, str3, i1, i2);
		
		System.out.println(scr.saveData(str1, str2, str3, i1, i2));
		
		System.out.println("저장이 완료되었습니다.");
		
		System.out.println("저장한 정보를 확인하시겠습니까? (y/n) : ");
		String yn = sc.next();
		
		if(yn == "y") {
			System.out.println(scr.confirmData());
		} System.out.println();
	}

}

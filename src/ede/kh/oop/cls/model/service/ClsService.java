package ede.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
// import edu.kh.oop.cls.model.vo.Student;

public class ClsService {

	public void ex1() {
		// 클래스 접근 제한자 확인하기
		
		
		Student std = new Student();
		// public class인 Student는 inport가 가능
		
		// test = new TestVo();
		// (default) class인 TextVO는 import 불가(다른 패키지)
		
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public만 에러 X
		
		
		// System.out.println(std.v2);
		// System.out.println(std.v3);
		// System.out.println(std.v4);
	}
}

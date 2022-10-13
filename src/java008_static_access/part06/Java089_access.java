package java008_static_access.part06;

import java008_static_access.part05.Java087_access;
//사용하려는 다른 패키지의 위치를 알려줌 (import)
//여러번 사용 가능

/*
 * 클래스 관계
 * 1. has a : 포함관계
 * 2. is a : 상속관계
 * 
 * UML(Unified Modeling Language : 통합 모델링 언어)
 * 1. UML은 소프트웨어 시스템을 개발할 때 팀원 간의 아이디어를 도출하거나,
 * 개발할 시스템의 구조와 시스템의 동적인 관점을 표현할 대 사용하는
 * 모델링 언어이다.
 * 
 * 2.
 * 
 */

public class Java089_access extends Java087_access{

	public static void main(String[] args) {
//		Java087_access p = new Java087_access();
		Java089_access p = new Java089_access();
//		 System.out.printf("var_private:%d\n", p.var_private);
		 //패키지가 다른경우 private는 접근 불가
//		System.out.printf("var_default:%d\n", p.var_default);
		System.out.printf("var_protected:%d\n", p.var_protected);
		System.out.printf("var_public:%d\n", p.var_public);

	}
}

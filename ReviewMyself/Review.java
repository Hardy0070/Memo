package test;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		제 조 반 :
//
//			제어문:
//			 - 조건문
//			 - 반복문
//
//			조건문:
//			 - if문 :
//			 - 사용법 : [ if() {} ]
//			 - 원리 : [ if( A; ) { B; } ] 일 때 A가 true라면 B를 실행
//			 - 특징 : 실행문이 한 줄이라면 {}을 생략할 수 있다. [ if() 구현부 ]처럼
//			 - 사용법 : 
				 if(true) {
					 System.out.println(1);
				 }
					 
//			 - else if문 :
//			 - 사용법 : [ if() {} else if() {} ]
//			 - 원리 : [ if( A; ) { C; } else if( B; ) { D; } ] 일 때 A가 false라면 else if로 간다. B가 true라면 D를 실행
//			 - 특징 : 중첩 가능. 마지막에 else문 사용가능. else문은 (조건부)가 없음.
//			 - 사용법 :
				if(true) {
					System.out.println(1);
				} else if(!true) {
					System.out.println(2);
				} else {
					System.out.println(3);
				}
			
//
//			 - switch~case문 :
//			 - 사용법 : [ switch() { case 1: break; case 2: break; default : break; } ]
//			 - 원리 : [ switch( A ) { case 1: B break; case 2: C break; default : break; } ] 
//				=> ( ) 값에 따라 출력 한다.
//				=> break; 를 만나면 switch문을 빠져 나간다.
//				=> break; 를 쓰지 않으면 다음 case로 간다.
//				=> default는 어떤 case도 해당되지 않을 때 실행 된다.
//			 - 특징 :( ) 값을 사용자 입력 값으로 사용하면 메뉴 선택 코딩 가능.
//			 - 사용법 : [ switch() { case 1: break; case 2: break; default : break; } ]
				int num = 1;
				
				switch(num) {
					case 1: System.out.println(1);
					break;
					
					case 2: System.out.println(2);
					break;
					
					default: System.out.println(3);
					break;
				}
//
//			 반복문:
//			 - for문 :
//			 - 사용법 : [ for( 초기화식; 조건식; 증감식; ) { 구현부; } ]
//			 - 원리 : [ for( 초기화식; A; B; ) { C; } ] 일 때 A가 true라면 시작 C를 실행, 그리고 B로 돌아가 증감한다. A가 true라면 C를 또 실행, B로 돌아가 … A가 false일 때 까지 반복 …
//				=> 조건식 true => 구현부 => 증감식 => 조건식 => … 반복
//
//			 - 특징 : for문 안에 break; 가 있다면 해당 for문을 빠져 나간다.
//
//			 - 중첩 for문 : 
//			 - 사용법 : [ for( ; ; ) { for( ; ; ) { }} ]
//			 - 원리 : [ for( ; A; B ) { C for( ; D; E) { F } G } ] 일 때 A가 true라면 C로 가서 내부 for문을 동작 시킨다. D가 true라면 F를 동작, E로 돌아가 증감 후 D로 가서 비교하고 true라면 F 반복 실행 … D가 false일 때 내부 for문을 빠져 나가 G를 실행 한다. 그리고 B로 돌아가 증감 후 A로 가서 비교, true라면 C로 가서 내부 for문 반복
//			 - 특징 : 내부 반복이 끝나면 외부 구현부 실행 !
//
//			 - while문:
//			 - 사용법 : [ while( 조건식 ) { 구현부 } ]
//			 - 원리 : [ while( A ) { B; } ] 일 때 A가 true라면 B 반복
//			 - 특징 : while(true) {} 처럼 무한루프가 가능하다. 구현부에 break; 조건을 사용해 종료 시킨다.
//
//			 - do~while문:
//			 - 사용법 : [ do { 구현부 } while( 조건식 ); ]
//			 - 원리 : [ do { A } while( B ); ] 일 때 A를 먼저 실행하고 B로 가서 true와 false를 따진다.
//			 - 특징 : 구현부를 꼭 한 번 먼저 실행
//
//			 - break; 와 continue;
//			 - 원리 : break;를 만나면 해당 문이 종료 된다. => 다음 문 실행. 내부라면 내부를 종료하고 외부 실행.
//				   : for문에서 continue;를 만나면 증감식으로 이동, while문에서 for문을 만나면 조건식으로 이동.
//
//
//			배열 : 
//
//			 - 선언법 : [ int[] 변수명 = new int[길이]; ]
//			 - 초기화 : [ 변수명[자리값] = 값; ] 
//			    For문을 이용한 초기화 : [ for( int i = 0; i < 변수명.length; i++) { (i + 1) * 10; } ]
//			 - 특징 : 배열의 길이 - 변수명 .length, 
//					배열의 자리값 - 변수명[?], 
//					자리값의 요소 등이 존재 - ? = 20
//
//			 - Advanced for문 :
//			 - 사용법 : [ for( int 자리값넣을곳 : 배열변수명 ) { 구현부; }
//			 - 원리 : 배열변수명에서 0부터 순차적으로 자리값넣을곳으로 자리값의 요소로 접근한다.




	}

}

package chap13_nestedclass;

import chap13_nestedclass.nestedclass.AnonymousNestedClass;

public class _03_AnonymousNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 익명 중첩 클래스
		
		// 익명 중첩 클래스는 인터페이스나 추상클래스를 상속 받은 자식 클래스를 만들지 않고
		// 객체를 생성할 때 사용한다.
		
		// 별도로 클래스를 생성하지 않기 때문에 클래스의 이름이 없다. 따라서, 익명 중첩 클래스라고 한다.
		
		// 인터페이스나 추상클래스는 객체를 생성할 수 없지만
		// 인터페이스나 추상클래스의 생성자를 호출 하면서 추상메소드들을 모두 구현해주면
		// 상속 받아서 구현된 자식클래스 없이도 인터페이스나 추상클래스가 구현된 객체를 생성할 수 있게 된다.
		AnonymousNestedClass anonymousNestedClass = new AnonymousNestedClass () { // 인터페이스 호출

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}

			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}

			@Override
			public int mul(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}

			@Override
			public double div(int a, int b) {
				// TODO Auto-generated method stub
				return (double)a/b;
			}

			@Override
			public int mod(int a, int b) {
				// TODO Auto-generated method stub
				return a%b;
			}
			
	};

	
	int result = anonymousNestedClass. add(10, 20);
	System.out.println(result);
	
	 result = anonymousNestedClass.sub(10, 20);
	System.out.println(result);
	
	 result = anonymousNestedClass.mul(10, 20);
	System.out.println(result);
	
	// 다른 타입이라 변수명을 바꾸어야 함.
	double dResult = anonymousNestedClass.div(10, 20); 
	System.out.println(result);
	
	result = anonymousNestedClass.mod(10, 20);
	System.out.println(result);
	

	
 }

}
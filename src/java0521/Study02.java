package java0521;

public class Study02 {

	public static void main(String[] args) {
		/***********************************************
		 * 문제1) 인덱스와 값을 곱하여 다시 배열에 값넣기
		 * 출력 예시)
		 * 인덱스		초기값	곱셈할값		배열에들어갈 값
		 * 0		0		9			(0 * 9) = 0
		 * 1		1		8			(1 * 8) = 8
		 * 2		2		7			(2 * 7) = 14
		 * 3		3		6			(3 * 6) = 18
		 * 4		4		5			(4 * 5) = 20
		 * 5		5		4			(5 * 4) = 20
		 * 6		6		3			(6 * 3) = 18
		 * 7		7		2			(7 * 2) = 14
		 * 8		8		1			(8 * 1) = 8
		 * 9		9		0			(9 * 0) = 0
		 ************************************************/		
		int[] 배열 = new int[10];
		int a = 9;
		
		System.out.println("인덱스\t초기값\t곱셈할값\t배열에들어갈 값");
		
		for(int i = 0; i < 배열.length; i++) {
			배열[i] = i;
			System.out.print(i + "\t" + i + "\t" + a + "\t");
			System.out.println("(" + i + " * " + a + ") = " + i * a);
			a--;
		}

	}

}
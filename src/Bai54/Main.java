package Bai54;

import java.util.List;

public class Main extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt;
		int a[] = new int[5];
		a[0] = 9;
		a[1] = 8;
		a[2] = 19;
		a[3] = 99;
		a[4] = 7;
		
		listInt = khoiTao(a);
		inAn(listInt);
		System.out.println("So so chan trong list la: "+ demChan(listInt));
		sXepGiam(listInt);
		inAn(listInt);
		
	
	}

}

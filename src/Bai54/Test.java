package Bai54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	List<Integer> list;
	
	static List<Integer> khoiTao(int a[]) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
	return list;
	}
	static void inAn(List<Integer> list) {
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	static int demChan(List<Integer> list) {
		int count = 0;
		for (Integer integer : list) {
			if(integer %2 == 0) {
				count++;
			}
		}
		return count;
	}
	static void sXepGiam(List<Integer> list){
		
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer a0, Integer a1) {
				// TODO Auto-generated method stub
				if (a0 < a1) {
					return 1;
				}else if (a0 == a1) {
					return 0;
				}else {
					return -1;
				}
			}
			
		});
	
	
}
}

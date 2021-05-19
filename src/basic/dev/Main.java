package basic.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				List<Person> listPer = new ArrayList<Person>();
				Person p = new Person("Du", 9);
				Person p1 = new Person("Du", 16);
				Person p2 = new Person("Thai Nguyen", 12);
				Person p3 = new Person("Du", 7);
				listPer.add(p);
				listPer.add(p1);
				listPer.add(p2);
				listPer.add(p3);
				
				for (Person per : listPer) {
					System.out.println(per.age);
				}
				System.out.println("==============");
				Collections.sort(listPer, new Comparator<Person>() {

					@Override
					public int compare(Person a0, Person a1) {
						// TODO Auto-generated method stub
						if(a0.getName().compareTo(a1.getName()) < 0) {
							return -1;
						}else if(a0.getName().compareTo(a1.getName()) > 0) {
							return 1;
						} else {
							return a0.age - a1.age;
						}
					}
				});
				for (Person per : listPer) {
					System.out.println(per.name+" "+per.age);
				}
				
				List<Integer> listInt = new ArrayList<Integer>();
				listInt.add(9);
				listInt.add(3);
				listInt.add(5);
				listInt.add(11);
				listInt.add(94);
				listInt.add(95);
				listInt.add(92);
				listInt.add(90);
				listInt.add(89);
				System.out.println("==============");
			for (Integer integer : listInt) {
				System.out.println(integer);
			}	
			System.out.println("==============");
			Collections.sort(listInt,new Comparator<Integer>() {

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
			for (Integer integer : listInt) {
				System.out.println(integer);
			}
	}

}

package sortDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setName("Zbi");
		s1.setRollNo(1);
		s2.setName("Arul");
		s2.setRollNo(20);
		s3.setName("Arun");
		s3.setRollNo(3);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("List of Student in Ascending ROll Number Order");
		Collections.sort(list, Student.AesRollNoComparator);
		/*
		 * Collections.sort(list, Comparator.comparing(Student::getName)); for
		 * (Iterator iterator = list.iterator(); iterator.hasNext();) { Student
		 * student = (Student) iterator.next(); student.dis();
		 * 
		 * } Collections.sort(list);
		 */

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			student.dis();
		}
		System.out.println("List of Student in Descending ROll Number Order");
		Collections.sort(list, Student.DesRollNoComparator);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			student.dis();
		}
		// Collections.reverse(list); //To reverse the COllection
		System.out.println("Name of Student in Descending Order");
		Collections.sort(list, Student.DesNameComparator);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			student.dis();

		}
		Collections.sort(list, Student.NameComparator);
		System.out.println("Sorting using Name");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			student.dis();

		}

	}
}

package sortDemo;

import java.util.Comparator;

public class Student implements Comparator {
	private String name;
	private int rollNo;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo
	 *            the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void dis() {

		System.out.println(this.getRollNo() + "   " + this.getName());
		/*
		 * System.out.println("   Roll No "+this.getRollNo());
		 * System.out.println("   Name  "+this.getName());
		 * System.out.println("*******************");
		 */
	}

	public static Comparator<Student> AesRollNoComparator = new Comparator<Student>() {

		public int compare(Student stud1, Student stud2) {

			/*
			 * if(stud1.getRollNo()>stud2.getRollNo()) { return 0; }
			 */
			return stud1.getRollNo() - stud2.getRollNo();

		}
	};

	public static Comparator<Student> DesRollNoComparator = new Comparator<Student>() {

		public int compare(Student stud1, Student stud2) {

			/*
			 * if(stud1.getRollNo()>stud2.getRollNo()) { return 0; }
			 */
			return stud2.getRollNo() - stud1.getRollNo();

		}
	};

	public static Comparator<Student> NameComparator = new Comparator<Student>() {

		public int compare(Student stud1, Student stud2) {

			/*
			 * if(stud1.getRollNo()>stud2.getRollNo()) { return 0; }
			 */
			String name1=stud1.getName().toUpperCase();
			String name2=stud2.getName().toUpperCase();
			return name1.compareTo(name2);

		}
	};
	public static Comparator<Student> DesNameComparator = new Comparator<Student>() {

		public int compare(Student stud1, Student stud2) {

			/*
			 * if(stud1.getRollNo()>stud2.getRollNo()) { return 0; }
			 */
			String name1=stud1.getName().toUpperCase();
			String name2=stud2.getName().toUpperCase();
			return name2.compareTo(name1);

		}
	};

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

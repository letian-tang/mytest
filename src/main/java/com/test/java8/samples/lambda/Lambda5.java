package com.test.java8.samples.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 这个例子使用
 * Predicate接口实现类的test()方法判断输入的Student对象是否拥有费用打折的资格，
 * 然后使用Consumer接口的实现类更新输入的Student对象的折扣。
 * @author tdy
 *
 */
public class Lambda5 {

	public static void main(String[] args) {
		Student student1 = new Student("Ashok", "Kumar", 9.5);

		student1 = updateStudentFee(student1,
				student -> student.grade > 8.5,
				student -> student.feeDiscount = 30.0);

		student1.printFee();

		Student student2 = new Student("Rajat", "Verma", 8.0);

		student2 = updateStudentFee(student2, student -> student.grade >= 8, student -> student.feeDiscount = 20.0);

		student2.printFee();
	}

	public static Student updateStudentFee(Student student, Predicate<Student> predicate, Consumer<Student> consumer) {


		if (predicate.test(student)) {
			consumer.accept(student);
		}
		return student;
	}
}

class Student {

	String firstName;

	String lastName;

	Double grade;

	Double feeDiscount = 0.0;

	Double baseFee = 20000.0;

	public Student(String firstName, String lastName, Double grade) {

		this.firstName = firstName;

		this.lastName = lastName;

		this.grade = grade;
	}

	public void printFee() {

		Double newFee = baseFee - ((baseFee * feeDiscount) / 100);

		System.out.println("The fee after discount: " + newFee);

	}

}
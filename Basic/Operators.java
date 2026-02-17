package Basics;

public class Operators {

	public static void main(String[] args) {

		// In java there is 6 types of operators

		// 1. Arithmetic operator -> Used for mathematical calculations.

		int a = 10;
		int b = 20;

//		int c = a + b;
//		int d = a - b;
//		int e = a * b;
//		int f = b / a;
//		int g = a % b;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(a % b);

		// 2. Assignment operator -> used to assign the value

		int c = 20; // a = 20;

		System.out.println(a);
		a += b; // a = a + b;
		System.out.println(a); // a = 30

		a -= b; // a = a - b;
		System.out.println(a); // a = 10

		a *= b; // a = a * b;
		System.out.println(a); // a = 200;

		a /= b; // a = a / b;
		System.out.println(a); // 10

		a %= b; // a = a % b;
		System.out.println(a); // 10

		// 3. Relational (Comparison) Operators -> Used to compare two values. Return
		// type → boolean

		int num1 = 20;
		int num2 = 30;

		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		System.out.println(num1 > num2); // false
		System.out.println(num1 < num2); // true
		System.out.println(num1 <= num2); // true
		System.out.println(num1 >= num2); // false

		// 4. Logical operator -> perform logical operations

		boolean firstExpressions = true;
		boolean secondExpressions = false;

		System.out.println(" Hello sam !! " + (firstExpressions && secondExpressions)); // if both true then it return
																						// true otherwise false
		System.out.println(firstExpressions || secondExpressions); // if both false then it return false otherwise true
		System.out.println(!firstExpressions); // it will toggle the value

		// Unary operators -> Operate on single operand.

		System.out.println("b: " + b); // 20

		b++; // b = b + 1;
		System.out.println("b: " + b); // 21

		b--; // b = b - 1;
		System.out.println("b: " + b); // 20

		// 6. Ternary Operator -> Short form of if-else.

		int num = 5;

		String result = (num > 10) ? "Greater" : "Shorter";
		System.out.println("result: " + result);

		// TODO 7. Bitwise Operators -> Used with integers (binary level).

	}

}

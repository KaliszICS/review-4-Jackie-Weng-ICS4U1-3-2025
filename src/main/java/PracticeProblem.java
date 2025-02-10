import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String userInput = scanner.nextLine();
		String modifiedinput  = "5" + userInput;
		int finalnumber = Integer.parseInt(modifiedinput);
		finalnumber += 5;
		System.out.println(finalnumber);
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		String userInput = scanner.nextLine();
		String modifiedinput  = "4" + userInput + "3";
		double finalnumber = Double.parseDouble(modifiedinput);
		finalnumber += 3.4;
		System.out.println(finalnumber);
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String userInput = scanner.nextLine();
		boolean finalnumber = Boolean.parseBoolean(userInput);
		boolean swap = !finalnumber;
		System.out.println(swap);
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String userInput = scanner.nextLine();
		String modifiedinput  = userInput + "3";
		int finalnumber = Integer.parseInt(modifiedinput);
		int number2 = finalnumber +2;
		char letter = (char) number2;
		System.out.println(letter);
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String userInput = scanner.nextLine();
		String modifiedinput  = userInput + "1";
		int finalnumber = Integer.parseInt(modifiedinput);
		int number2 = finalnumber /2;
		double convertjndasd = (double) number2;
		System.out.println(convertjndasd);
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		String userInput = scanner.nextLine();
		String modifiedinput  = "1" + userInput;
		double doublevalue = Double.parseDouble(modifiedinput);
		int intValue = (int) doublevalue;
		System.out.println(intValue);

	}

}

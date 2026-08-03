package corejava;

	import java.util.Scanner;

	public class StudentUtility {

	    // Factorial Method
	    static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }
	        return fact;
	    }

	    // Prime Method
	    static boolean prime(int n) {
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }

	    // Maximum Method
	    static int maximum(int a, int b) {
	        if (a > b)
	            return a;
	        else
	            return b;
	    }

	    // Area of Circle Method
	    static double area(double r) {
	        return 3.14 * r * r;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("===== Student Utility Program =====");

	        System.out.println("1. Student Details");
	        System.out.println("2. Even or Odd");
	        System.out.println("3. Largest of Three Numbers");
	        System.out.println("4. Grade");
	        System.out.println("5. Day");
	        System.out.println("6. Multiplication Table");
	        System.out.println("7. Numbers 1 to N");
	        System.out.println("8. Sum of N Numbers");
	        System.out.println("9. Fibonacci");
	        System.out.println("10. Factorial");
	        System.out.println("11. Prime");
	        System.out.println("12. Maximum of Two Numbers");
	        System.out.println("13. Area of Circle");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        switch (choice) {

	            case 1:
	                sc.nextLine();

	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Roll No: ");
	                int roll = sc.nextInt();

	                System.out.print("Enter Marks 1: ");
	                int m1 = sc.nextInt();

	                System.out.print("Enter Marks 2: ");
	                int m2 = sc.nextInt();

	                System.out.print("Enter Marks 3: ");
	                int m3 = sc.nextInt();

	                int total = m1 + m2 + m3;
	                double per = total / 3.0;

	                System.out.println("Name : " + name);
	                System.out.println("Roll No : " + roll);
	                System.out.println("Total : " + total);
	                System.out.println("Percentage : " + per);
	                break;

	            case 2:
	                System.out.print("Enter Number: ");
	                int num = sc.nextInt();

	                if (num % 2 == 0)
	                    System.out.println("Even");
	                else
	                    System.out.println("Odd");
	                break;

	            case 3:
	                System.out.print("Enter Three Numbers: ");
	                int a = sc.nextInt();
	                int b = sc.nextInt();
	                int c = sc.nextInt();

	                if (a >= b && a >= c)
	                    System.out.println("Largest = " + a);
	                else if (b >= c)
	                    System.out.println("Largest = " + b);
	                else
	                    System.out.println("Largest = " + c);
	                break;

	            case 4:
	                System.out.print("Enter Percentage: ");
	                int p = sc.nextInt();

	                if (p >= 90)
	                    System.out.println("Grade A");
	                else if (p >= 75)
	                    System.out.println("Grade B");
	                else if (p >= 60)
	                    System.out.println("Grade C");
	                else if (p >= 40)
	                    System.out.println("Grade D");
	                else
	                    System.out.println("Fail");
	                break;

	            case 5:
	                System.out.print("Enter Day Number (1-7): ");
	                int day = sc.nextInt();

	                switch (day) {
	                    case 1:
	                        System.out.println("Monday");
	                        break;
	                    case 2:
	                        System.out.println("Tuesday");
	                        break;
	                    case 3:
	                        System.out.println("Wednesday");
	                        break;
	                    case 4:
	                        System.out.println("Thursday");
	                        break;
	                    case 5:
	                        System.out.println("Friday");
	                        break;
	                    case 6:
	                        System.out.println("Saturday");
	                        break;
	                    case 7:
	                        System.out.println("Sunday");
	                        break;
	                    default:
	                        System.out.println("Invalid Day");
	                }
	                break;

	            case 6:
	                System.out.print("Enter Number: ");
	                int t = sc.nextInt();

	                for (int i = 1; i <= 10; i++)
	                    System.out.println(t + " x " + i + " = " + (t * i));
	                break;

	            case 7:
	                System.out.print("Enter N: ");
	                int n = sc.nextInt();

	                for (int i = 1; i <= n; i++)
	                    System.out.print(i + " ");
	                break;

	            case 8:
	                System.out.print("Enter N: ");
	                int x = sc.nextInt();

	                int sum = 0;
	                for (int i = 1; i <= x; i++)
	                    sum = sum + i;

	                System.out.println("Sum = " + sum);
	                break;

	            case 9:
	                System.out.print("Enter Number of Terms: ");
	                int terms = sc.nextInt();

	                int first = 0, second = 1;

	                for (int i = 1; i <= terms; i++) {
	                    System.out.print(first + " ");
	                    int next = first + second;
	                    first = second;
	                    second = next;
	                }
	                break;

	            case 10:
	                System.out.print("Enter Number: ");
	                int f = sc.nextInt();

	                System.out.println("Factorial = " + factorial(f));
	                break;

	            case 11:
	                System.out.print("Enter Number: ");
	                int primeNum = sc.nextInt();

	                if (prime(primeNum))
	                    System.out.println("Prime Number");
	                else
	                    System.out.println("Not Prime Number");
	                break;

	            case 12:
	                System.out.print("Enter Two Numbers: ");
	                int num1 = sc.nextInt();
	                int num2 = sc.nextInt();

	                System.out.println("Maximum = " + maximum(num1, num2));
	                break;

	            case 13:
	                System.out.print("Enter Radius: ");
	                double r = sc.nextDouble();

	                System.out.println("Area = " + area(r));
	                break;

	            default:
	                System.out.println("Invalid Choice");
	        }

	        sc.close();
	    }
	}


import java.nio.Buffer;
import java.util.Scanner;
public class myPractice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       /* Write a program that takes a word W as input and prints "Hello" followed by the given word W.
        String a = input.next();
        System.out.println("Hello "+ a);

        Write a program that reads a single line of input and print the given input.
        String a = input.next();
        System.out.println(a);

        For this problem, you need to write code to read a single line of input and print the line after the message "Given input: ".
        String a = input.next();
        System.out.println("Given input: "+a);

        For this problem, you need to write code to read two lines of input and print the second line of input.
        String a = input.nextLine();
        String b = input.nextLine();
        System.out.println(b);

        Write a program that reads two lines of input and prints those two lines in the reverse order. (Print the message given in the second line of input before the first line of input)
        String a = input.nextLine();
        String b = input.nextLine();
        System.out.println(b);
        System.out.println(a);

        Write a program to print the given input word three times in a single line separated by spaces
        String a = input.nextLine();
        int b = input.nextInt();
        System.out.println((a + " ").repeat(b));

        Write a program to reverse the digits of a given two-digit number.
        String a = input.next();
        Character b = a.charAt(1);
        Character c = a.charAt(0);
        System.out.println(b+""+c);

        Write a program to print the sum of two integer inputs A and B.
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+b);

        Given a word W and an integer N, write a program to print the character present at the index N in the word W.
        String a = input.nextLine();
        int b = input.nextInt();
        System.out.println(a.charAt(b));

        Write a program which prints the last character of a given word.
        String a = input.nextLine();
        int len = a.length();
        System.out.println(a.charAt(len-1));

        Write a program which prints the first half of the given input string.
        You can assume that the length of the input string will always be an even number.
        String a = input.nextLine();
        int b = a.length();
        System.out.println(a.substring(0,b/2));

        Given a word and a number N, write a program to print the given word, N number of times in a single line.
        String a = input.nextLine();
        int b = input.nextInt();
        System.out.println(a.repeat(b));

        Given a word and a number (N), write a program to print the last three characters of the word N times in a single line.
        String b = input.nextLine();
        int a = input.nextInt();
        System.out.println((b.substring((b.length())-3)).repeat(a));

        Write a program that prints the sum of the digits of a given three-digit number.
        String a = input.nextLine();
        char e = a.charAt(0);
        char f = a.charAt(1);
        char g = a.charAt(2);
        int b = Integer.parseInt(String.valueOf(e));
        int c = Integer.parseInt(String.valueOf(f));
        int d = Integer.parseInt(String.valueOf(g));
        System.out.println(b+c+d);

        Write a program to take two integer inputs (say A and B) and print the result of the following operations:
        1. Addition
        2. Subtraction
        3. Multiplication
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        Write a program to calculate the area of the Rectangle.
        Note: Area of Rectangle = Length of Rectangle x Breadth of Rectangle
        int length = input.nextInt();
        int breadth = input.nextInt();
        System.out.println(length*breadth);

        Write a program to calculate the perimeter of a rectangle.
        Note: Perimeter of Rectangle = 2(Length of Rectangle + Breadth of Rectangle)
        int length = input.nextInt();
        int breadth = input.nextInt();
        System.out.println(2*(length*breadth));

        Write a program to take the number of kilometers as input and convert into meters and print the number of meters.
        Note: 1 Kilometer = 1000 Meters
        System.out.print("enter number of kilometers: ");
        int a = input.nextInt();
        System.out.println(a*1000 + " Meters.");

        Write a program to read a single line of input and print the number of characters in the input.
        Note: Spaces are also characters.
        String a= input.nextLine();
        System.out.println(a.length());

        Write a program to read a single line of input and print the first three characters in it.
        String a = input.nextLine();
        System.out.println(a.substring(0,3));

        Write a program to check if the first three characters in the two given strings are the same.
        String a = input.nextLine();
        String b = input.nextLine();
        String c = a.substring(0,3);
        String d = b.substring(0,3);
        System.out.println(c.equals(d));

        Write a program to check if both of the given numbers are positive and if at least one of them is greater than 5
        Note: Zero is not a positive number.
        int a = input.nextInt();
        int b = input.nextInt();
        boolean c = a>0 && b>0;
        boolean d = a>5 || b>5;
        boolean e = c && d;
        System.out.println(e);

        Write a program to check if the given two digit number is greater than 25 and its first digit is greater than its second digit.*/
        String a = input.nextLine();
        int b = Integer.parseInt(String.valueOf(a.charAt(0)));
        int c = Integer.parseInt(String.valueOf(a.charAt(1)));
        boolean d = Integer.parseInt(a)>25;
        boolean e = b>c;
        boolean f = d && e;
        System.out.println(f);
    }
}

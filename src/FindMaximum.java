import java.util.Scanner;

public class FindMaximum {
    public static <T> void Maximum(T num1, T num2, T num3) {
        T max;
        if(((Float)num1)>((Float)num2)&&((Float)num1)>((Float)num3))
			max = num1;
        else if (((Float)num2)>((Float)num1)&&((Float)num2)>((Float)num3)) {
            max = num2;
        }
		else
            max=num3;
            System.out.println(max+" is Maximum");
        
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		Float num1 = scan.nextFloat();
		
		System.out.print("Enter the Second Number : ");
		Float num2 = scan.nextFloat();
		
		System.out.print("Enter the Third Number : ");
		Float num3 = scan.nextFloat();
        scan.close();
		Maximum(num1, num2, num3);
	}
}

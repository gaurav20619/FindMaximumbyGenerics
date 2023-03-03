import java.util.Scanner;

public class FindMaximum {
    public static <T> void Maximum(T num1, T num2, T num3) {
		T max = num1;
		if(((Integer)num2)>((Integer)max)&&((Integer)num2)>((Integer)num3))
			max = num2;
		else
            max=num3;
            System.out.println(max+" is Maximum");
        
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		Integer num1 = scan.nextInt();
		
		System.out.print("Enter the Second Number : ");
		Integer num2 = scan.nextInt();
		
		System.out.print("Enter the Third Number : ");
		Integer num3 = scan.nextInt();
        scan.close();
		Maximum(num1, num2, num3);
	}
}

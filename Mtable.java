import java.util.Scanner;
 class Mtable 
{
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for(int i = 1;i<=10;i++){
        	System.out.println(num +"*"+ i +"=" + (num * i));
        }
	}
}
package practice1;

public class MultiplesOf3or5 {

	public static int multiplesOf3or5(int number) {
		int sum=0;
		for (int i = 1; i < number; i++) {
			if (i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		
		int result=multiplesOf3or5(1000);
	}
}

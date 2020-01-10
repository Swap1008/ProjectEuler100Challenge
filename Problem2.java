package practice1;


public class FiboSumEven {

	public static int fiboSum(int n) {
		int n1=0;
		int n2=1;
		int n3;
		int sum=0;
		for (int i = 2; i <= n; i++) {
			n3=n1+n2;
			System.out.print("\t"+n3);
			if (n3%2==0) {
				sum=sum+n3;
			}
			n1=n2;
			n2=n3;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		fiboSum(10);
	}
}

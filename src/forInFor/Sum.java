package forInFor;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n = sc.nextInt();
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=n);
		System.out.println(sum);
	}
}

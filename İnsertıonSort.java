import java.util.Scanner;

public class İnsertıonSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entry a array lenght : ");
		int n = sc.nextInt();
		int dizi[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("entry a value : ");
			dizi[i] = sc.nextInt();
		}

		insertSort(dizi, n);
		System.out.println("Insert sort is successful!!");
		for (int i = 0; i < n; i++) {
			System.out.print(dizi[i]+" ");
		}
	}

	private static void insertSort(int[] dizi, int n) {

		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (dizi[j] < dizi[j - 1]) {
					int temp = dizi[j];
					dizi[j] = dizi[j - 1];
					dizi[j - 1] = temp;

				}
			}
		}
	}

}

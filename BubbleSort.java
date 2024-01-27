import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("entry a array lenght : ");
		n = sc.nextInt();
		int dizi[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("entry a number :");
			dizi[i] = sc.nextInt();
		}

		bubblesort(dizi, n);
		System.out.println("bubble sort is here..");

		for (int i = 0; i < n; i++) {
			System.out.print(dizi[i] + " ");
		}

	}

	private static void bubblesort(int[] dizi, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (dizi[j] > dizi[j + 1]) {
					int temp = dizi[j];
					dizi[j] = dizi[j + 1];
					dizi[j + 1] = temp;
				}
			}
		}

	}

}

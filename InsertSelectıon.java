import java.util.Scanner;

public class InsertSelectıon {
	// selection sort : en küçük sayıyı bul başa taşı (yer değiştir)

	// 7 3 5 1 2
	// 1 3 5 7 2
	// 1 2 5 7 3
	// 1 2 3 7 5
	// 1 2 3 5 7
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("entry a array length : ");
		n = sc.nextInt();

		int dizi[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("entry a number :");
			dizi[i] = sc.nextInt();
		}
		selectionSort(dizi, n);
		System.out.println("successful");
		for (int i = 0; i < n; i++) {
			System.out.print(dizi[i] + " ");
		}

	}

	private static void selectionSort(int[] dizi, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < (n - 1); i++) {
			int min = i;
			for (int j = i; j < n; j++) {
				if (dizi[min] > dizi[j]) {
					min = j;
				}
				
			}
			int temp = dizi[min];
			dizi[min] = dizi[i];
			dizi[i] = temp;
		}

	}

}

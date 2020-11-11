package by.academy.homework.homework2;

public class Task0 {

	// Complete the pairs function below.
		static int pairs(int k, int[] arr) {
			int pairsCount = 0;
			// write code here
			return pairsCount;
		}

		private static final Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) throws IOException {

			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);

			int[] arr = new int[n];

			String[] arrItems = scanner.nextLine().split(" ");

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(arrItems[i]);
				System.out.println(arr[i]);
			}

			int result = pairs(k, arr);
			System.out.println(result);

			scanner.close();
		}

	}

}

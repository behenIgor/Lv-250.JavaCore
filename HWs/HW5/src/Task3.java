
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, -2, 3, -4, 5 };

		int n = 0;
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				n++;
				if (n == 2) {
					p = i + 1;
					System.out.println("position of second positive number " + p);
					break;
				}
			}
		}

		
		
		int min = arr[0];
		int imin = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");

	}

}

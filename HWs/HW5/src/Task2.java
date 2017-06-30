

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int m = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (array1[i] > 0) {
				sum += array1[i];
			} else {
				m = 1;
				break;
			}
		}
			System.out.println("Sum:"+sum);
			
			
			int product = 1;
			if (m == 1) {
				for (int j = 5; j < 10; j++) {
                product*=array1[j];
				}
				System.out.println("Product: "+product);
			}
			
		
	}

}

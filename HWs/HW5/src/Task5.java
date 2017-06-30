import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
      Car[] auto = new Car[4];
      
      auto[0] = new Car("Honda",2006,2.1);
      auto[1] = new Car("Bugatti",1939,2.0); 
      auto[2] = new Car("Ferrari",2017,1.9);  
      auto[3] = new Car("Skoda",2009,1.5);
       
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter year of car production");
		int year = Integer.parseInt(br.readLine());
		
		for(int i=0; i<auto.length;i++)
		{
			if(auto[i].getYear_of_production() == year )
			{
				System.out.println(auto[i]);
				break;
			}
		}
		    System.out.println("Cars ordered by the field year");
		Car tmp;
		for (int i = 0; i < auto.length - 1; i++) {
			for (int j = i + 1; j < auto.length; j++) {
				if (auto[i].getYear_of_production() < auto[j].getYear_of_production()) {
					tmp = auto[i];
					auto[i] = auto[j];
					auto[j] = tmp;
				}
			}
		}
		for (int i = 0; i < auto.length; i++) {
			System.out.println(auto[i]);
		}

		
		
      
	}

}

import java.io.IOException;

public class Persons {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
       Person per1 = new Person();
       per1.setName("Nazar");
       per1.setBirthYear(1997);
       Person per2 = new Person("Oleg",1991);
       Person per3 = new Person("Jorge",2000);
       Person per4 = new Person("Roman",2017);
       Person per5 = new Person("Max",1988);
   
       per1.input();
       per2.input();
       per3.input();
       per4.input();
       per5.input();
       
       int age1=  per1.age(2017);
       int age2=  per2.age(2017);
       int age3= per3.age(2017);
       int age4= per4.age(2017);
       int age5= per5.age(2017);
       
       per1.output(age1);
       per2.output(age2);
       per3.output(age3);
       per4.output(age4);
       per5.output(age5);
	}

}

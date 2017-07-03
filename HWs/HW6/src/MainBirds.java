
public class MainBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird[] abird  = new Bird[4];
		
		abird[0] = new Eagle("gray","25 days");
		abird[1] = new Swallow("white","30 days");
		abird[2] = new Penguin("blackandwhite","31 days");
		abird[3] = new Kiwi("brown","15 days");
		
		abird[0].fly();
		abird[1].fly();
		abird[2].fly();
		abird[3].fly();
		
		for(int i=0; i<abird.length; i++)
		{
		   System.out.println(abird[i]);	
		}
	}

}

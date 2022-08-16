
public class StaticDemo {
	 static int counter=0;
	StaticDemo(){
		counter++;// 1+1//2
	}

	public static void main(String[] args) {
		StaticDemo sdObj1=new StaticDemo();
		StaticDemo sdObj2=new StaticDemo();
		
		System.out.println(sdObj1.counter);
	}
}

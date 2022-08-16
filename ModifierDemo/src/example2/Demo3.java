package example2;

// public protected private
// public protected private - not used - default
class Demo4{
	void displayDemo4() {
		Demo3 demo3Obj=new Demo3();
		
	}
}

public class Demo3 {
 int x=90;// instance 
 static int y=90;//static variable
 static Demo3 d3Obj=new Demo3(); // static reference variable
 
	// non-static // concrete method
	void callDisplayDemo3() {
		displayDemo3();
	}
	
	private void displayDemo3() {
		Demo4 demo4Obj=new Demo4();
		demo4Obj.displayDemo4();
		print();
	}
	//static method
	static void print() {
		
		d3Obj.displayDemo3();
	}
	static void hello() {
		
		d3Obj.displayDemo3();
		print();
		
	}

}


public class SwitchDemo2 {
public static void main(String[] args) {
	int day=1;
	String switchReturnValue=switch(day) {
	case 1->"Mon";
	case 2->"Tue";
	default->"Not a valid day";
	
	};
	
	System.out.println(switchReturnValue);
}
}

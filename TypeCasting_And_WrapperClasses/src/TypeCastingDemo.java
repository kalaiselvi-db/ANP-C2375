

/*
 * class Integer{
 * int intData
 * public Integer(int a){
 * intData=a;
 * }
 * 
 * }
 */
public class TypeCastingDemo {
public static void main(String[] args) {
	//-128 to 127
	byte byteVar1=34;
	int intVar1=223;
	
	int intVar2=byteVar1; // Implicit type casting
	
	byte byteVar2=(byte)intVar1; // Explicit type casting
	System.out.println(byteVar2);

	Integer iObj1=new Integer(34); // prior java 5
	
	Integer iObj2=56; // Autoboxing
	
	Double dObj1=45.67;
	
	Float fObj1=34.56f;
	
	Integer iObj3=intVar1;
}
}

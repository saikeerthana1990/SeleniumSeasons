package oct18th;

public class VarArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum obj=new Sum();
		
		obj.add(10, 20);
		
		obj.add(10, 20,30);
		
		obj.add(10,20,30,40,50);
		
		obj.add(10,20,30,40,50,10,20,30,40,50);

	}

}

package single;

public class empdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee empdata = new employee();
		empdata.setName("raghuveer");
		empdata.setAge(23);
		empdata.setempID("emp101");
		
		System.out.println(empdata.getName());
		System.out.println(empdata.getAge());
		System.out.println(empdata.getempID());
	}

}

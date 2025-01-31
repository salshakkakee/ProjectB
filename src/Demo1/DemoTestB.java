package Demo1;

public class DemoTestB {
	public static void main(String[] args) {
		getData("Sally", 31, 'F', "Tampa", true, 50.00);
		getData("Zaid", 36, 'M', "Tampa", true, 70.00);
	}

	public static void getData(String name, int age, char gender, String city, boolean isCitizen, double salary) {

		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(city);
		System.out.println(isCitizen);
		System.out.println(salary);

	}
}

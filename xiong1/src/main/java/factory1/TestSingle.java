package factory1;

public class TestSingle {
	public static void main(String[] args) {
		SingleDemo s=SingleDemo.getSingleDemo();
		SingleDemo s1=SingleDemo.getSingleDemo();
		System.out.println(s==s1);
	}

}

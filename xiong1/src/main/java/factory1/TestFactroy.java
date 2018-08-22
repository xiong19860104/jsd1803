package factory1;

public class TestFactroy {
	public static void main(String[] args) {
	   ICarDao dao=CarDaoFactory.getCarDaoInstance(new BenChi());
	}

}

package factory1;

public abstract class CarDaoFactory {
	public static ICarDao getCarDaoInstance(ICarDao  dao){
		if(dao  instanceof BaoMa) {
			//
			System.out.println("����");
			return new BaoMa();
			
		}else if(dao  instanceof BenChi) {
			System.out.println("����");
			return new BenChi();
			
		}
		return dao;
		
	}

}

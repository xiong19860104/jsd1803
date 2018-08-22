package factory1;

public abstract class CarDaoFactory {
	public static ICarDao getCarDaoInstance(ICarDao  dao){
		if(dao  instanceof BaoMa) {
			//
			System.out.println("±¦Âí");
			return new BaoMa();
			
		}else if(dao  instanceof BenChi) {
			System.out.println("±¼³Û");
			return new BenChi();
			
		}
		return dao;
		
	}

}

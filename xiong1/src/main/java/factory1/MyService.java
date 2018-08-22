package factory1;

public class MyService {
	public void login(){
       IDao mysql=DaoFactory.getInstanceDao(new MysqlDao());
	}

}

package factory1;

public abstract class DaoFactory implements IDao {
	public static IDao getInstanceDao(IDao dao) {
		if (dao instanceof MysqlDao) {
			System.out.println("mysql");
		    MysqlDao mysql=	new MysqlDao();
		    return mysql;

		} else if (dao instanceof OracleDao) {
			return new OracleDao();
		} else {
			return null;
		}
	}

	

}

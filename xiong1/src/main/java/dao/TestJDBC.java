package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class TestJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	   //加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="123456";
		Connection conn=DriverManager.getConnection
				(url, user, password);
		//System.out.println(conn);
		CallableStatement cs=
				conn.prepareCall("{call user_login(?,?,?)}");
		cs.setString(1, "xig");
		cs.setString(2, "123456");
	
		//注册out参数
		cs.registerOutParameter(3,Types.INTEGER);
		//执行存储过程
		cs.execute();
		//的到注册out参数的值
		int count=cs.getInt(3);
		if(count>0){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
		
		
		
		
	}

}

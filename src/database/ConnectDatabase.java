package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://DESKTOP-K4JVGQP\\QUOCBAO:1433; databaseName = FAST_FOOD; trustServerCertificate = true";
			String username = "sa";
			String password = "123";
			
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Ket Noi Thanh Cong!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}



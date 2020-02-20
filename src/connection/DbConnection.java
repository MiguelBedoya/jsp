package connection;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DbConnection {

	private DbConnection() {
		throw new IllegalStateException("Utility class");
	}

	static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	static final String SERVER_USER = "admin";
	static final String SERVER_PASS = "admin";
	static final String SERVER_HOST_DATABASE = "jdbc:mysql://172.19.5.216:3306/natillera";

	private static BasicDataSource dataSource = null;

	private static DataSource getDataSource() {

		if (dataSource == null) {
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName(DRIVER_NAME);
			dataSource.setUsername(SERVER_USER);
			dataSource.setPassword(SERVER_PASS);
			dataSource.setUrl(SERVER_HOST_DATABASE);
			dataSource.setInitialSize(20);
			dataSource.setMaxIdle(15);
			dataSource.setMaxTotal(20);
			dataSource.setMaxWaitMillis(5000);
		}

		return dataSource;
	}

	public static Connection getConnection() throws SQLException {
		return getDataSource().getConnection();
	}

	public void desconnectDb() throws SQLException {
		if (getConnection() != null) {
			getConnection().close();
		}
	}
}
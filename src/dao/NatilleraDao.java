package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Person;
import connection.*;

public class NatilleraDao {

	private Connection connection;
	private PreparedStatement statement;
	private boolean operationState;

	// Guardar

	public boolean save(Person person) throws SQLException {

		String sql = null;
		operationState = false;
		connection = getCon();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO tbl_personas (sPersona, sTipoDocumento, sDocIdentififcacion,"
					+ " sNombre, sApellido, sNumCuentaBanc," + " biTipoCuentaBanc, mDato, dCreatedAt,"
					+ " dUpdatedAt, bisActive) VALUES (?,?,?,?,?,?,?,?,?,?,?)";			
			
			statement = connection.prepareStatement(sql);
			statement.setString(1, person.getsPerson());
			statement.setByte(2, person.getcDocumentType()); // pendiente por revisar
			statement.setString(3, person.getsDocument());
			statement.setString(4, person.getsName());
			statement.setString(5, person.getsLastName());
			statement.setString(6, person.getsAccountNumber());
			statement.setBoolean(7, person.getbiAccountType());
			statement.setString(8, person.getmDato());
			statement.setDate(9, person.getdCreatedAt());
			statement.setDate(10, person.getdUpdatedAt());
			statement.setBoolean(11, person.getIsActive());
			
			operationState = statement.executeUpdate() > 0;

			connection.commit();
			statement.close();
			connection.close();

			return operationState;
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return operationState;

	}

	// Editar

	public boolean edit(Person person) {
		return true;
	}

	// Eliminar

	public boolean remove(String sPersona) {
		return true;
	}

	// Listar

	public List<Person> list() throws SQLException {
		ResultSet resultSet = null;
		List<Person> listPersons = new ArrayList<>();
		
		String query = null;
		operationState = false;
		connection = getCon();
		
		try {
			query="SELECT * FROM tbl_personas";
			statement=connection.prepareStatement(query);
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				Person per = new Person();
				
				per.setsPerson(resultSet.getString(1));
				per.setcDocumentType(resultSet.getByte(2));
				per.setsDocument(resultSet.getString(3));
				per.setsName(resultSet.getString(4));
				per.setsLastName(resultSet.getString(5));
				per.setsAccountNumber(resultSet.getString(6));
				per.setcAccountType(resultSet.getBoolean(7));
				per.setmDato(resultSet.getString(8));
				per.setdCreatedAt(resultSet.getDate(9));
				per.setdUpdatedAt(resultSet.getDate(10));
				per.setIsActive(resultSet.getBoolean(11));
				
				listPersons.add(per);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listPersons;
		
	}

	// Lista por id

	public Person getPerson(String sPersona) {
		return null;
	}

	// Obtener método pool

	private Connection getCon() throws SQLException {
		return DbConnection.getConnection();
	}
}

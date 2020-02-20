package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NatilleraDao;
import model.Person;

/**
 * Servlet implementation class PersonController
 */
@WebServlet("/Person")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String option = request.getParameter("option");
		if (option.equals("create")) {
			System.out.println("Creando");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/create.jsp");
			requestDispatcher.forward(request, response);
			
		} else if (option.equals("list")) {
			System.out.println("Listando");
		}
		
		
		NatilleraDao natilleraDao = new NatilleraDao();
		List<Person> read = new ArrayList<>();
		
		try {
			read = natilleraDao.list();
			for (Person person : read) {
				System.out.println(person);
			}

		request.setAttribute("list", read);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/list.jsp");
		requestDispatcher.forward(request, response);
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String option = request.getParameter("option");
		NatilleraDao natilleraDao = new NatilleraDao();
		Person people = new Person();
		
		
		Date date = new Date(0);
		long d = System.currentTimeMillis();
		date.setTime(d);
//
		UUID uuid = UUID.randomUUID();
		String subUuid = uuid.toString().replace("-", "").substring(0, 19);
		
		people.setsPerson(subUuid);
		people.setsName(request.getParameter("name"));
		people.setsLastName(request.getParameter("lastName"));
//		people.setcDocumentType((Byte.parseByte(request.getParameter("documentTy"))));
		people.setsDocument(request.getParameter("numberDoc"));
//		people.setcAccountType((Boolean.parseBoolean(request.getParameter("accountTy"))));
		people.setsAccountNumber(request.getParameter("numberCue"));
		
		char com = '"';
		char co = ',';
		String mD = "{" + com + "birthDate" + com + ":" + com + request.getParameter("birthDate") + com + 
				co + com + "Age" + com + ":" + com + request.getParameter("Age") + com +
				co + com + "Address" + com + ":" + com + request.getParameter("Address") + com +
				co + com + "Depart" + com + ":" + com + request.getParameter("") + com +
				co + com + "City" + com + ":" + com + request.getParameter("") + com + "}";
		
		people.setmDato(mD);
		people.setdCreatedAt(date);
		people.setdUpdatedAt(date);
		people.getIsActive();
	
		try {
			natilleraDao.save(people);
			System.out.println("Se guardó el registro");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
//		doGet(request, response);
	}
	
//	documentTy

}


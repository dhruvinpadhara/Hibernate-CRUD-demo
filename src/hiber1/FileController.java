package hiber1;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hiber1.model1.User_model;


public class FileController extends HttpServlet {
    public FileController() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String name="";
		dao d=new daoimpl();
		
		byte i=Byte.parseByte(request.getParameter("i"));
		switch (i) {
		case 1:
			name="insert.jsp";
			break;
		case 2:
			List<model> li=d.view("model");
			request.setAttribute("v", li);
			name="view.jsp";
			break;
		case 3:
			
			int id=Integer.parseInt(request.getParameter("id"));
			model m=d.getData(new model(), id);
			request.setAttribute("read", m);
			
			name="update.jsp";
			break;
		case 4:
			li=d.view("model");
			request.setAttribute("list", li);
			name="insert1.jsp";
			break;
		case 6:
			List<model> ls=d.view("model");
			request.setAttribute("list", ls);
			name="insert1.jsp";
			break;
		case 5:
			
			/*if(request.getParameter("id")!=null){
				id=Integer.parseInt(request.getParameter("id"));
				smodel sm=d.getData(new smodel(), id);
				request.setAttribute("list", sm);
			}*/
			name="simple_insert.jsp";
			break;
		case 7:
			List<model> sm=d.view("smodel");
			request.setAttribute("view", sm);
			name="show.jsp";
			break;
		case 8:
			name="sample.jsp";
			break;
		case 9:
			name="form.jsp";
			break;
		case 10:
			List<User_model> user=d.view("User_model");
			request.setAttribute("user", user);
			name="user.jsp";
			break;
		default:
			break;
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(name);
		rd.forward(request, response);
	}

}

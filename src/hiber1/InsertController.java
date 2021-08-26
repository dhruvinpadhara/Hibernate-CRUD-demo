package hiber1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hiber1.model1.Hobby_model1;
import hiber1.model1.User_model;


public class InsertController extends HttpServlet {
       
    
	private static final long serialVersionUID = 1L;
	public InsertController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	dao d=new daoimpl();
    	byte i=Byte.parseByte(request.getParameter("i"));
		switch (i) {
		case 1:
			int id=Integer.parseInt(request.getParameter("id"));
			model m=new model(id);
			d.delete(m);
			response.sendRedirect("file?i=2");
			break;
		case 2:
			int userid=Integer.parseInt(request.getParameter("id"));
			User_model um=new User_model(userid);
			d.delete(um);
			response.sendRedirect("file?i=10");
			break;
		default:
			break;
		}
	
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		byte i=Byte.parseByte(request.getParameter("i"));
		dao d=new daoimpl();
		switch (i) {
		case 1:
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			model m=new model(fname,lname);
			d.insert(m);
			break;
		case 2:
			int id=Integer.parseInt(request.getParameter("id"));
			String Fname=request.getParameter("fname");
			String Lname=request.getParameter("lname");
			model l=new model(id,Fname,Lname);
			d.update(l);
			response.sendRedirect("file?i=2");
			break;
		case 3:
			String tname=request.getParameter("uname");
			long mno=Long.parseLong(request.getParameter("mno"));
			int sid=Integer.parseInt(request.getParameter("id"));
			System.out.println(tname+" "+mno+" "+sid);
			model m1=new model(sid);
			onem om=new onem(tname,mno,m1);
			d.insert(om);
			break;
		case 4:
			String name1[]=request.getParameterValues("fname");
			String name2[]=request.getParameterValues("lname");
			for (int j = 0; j < name2.length; j++) {
				sample s1=new sample(name1[j],name2[j]);
				d.insert(s1);

			}
			break;
		case 5:
			String idd=request.getParameter("id");
			String name=request.getParameter("name");
			long number=Long.parseLong(request.getParameter("number"));
			String hobby[]=request.getParameterValues("hobby");
			int id1=0;
			if(!idd.isEmpty()){
				id1=Integer.parseInt(request.getParameter("id"));
			}
			Form_model fm=new Form_model(id1,name,number);
			if(!idd.isEmpty()){
				d.update(fm);
			}
			else{
				d.insert(fm);
			/*String hb="";*/
				if(fm!=null){
					fm=new Form_model(id1);
						for (int j = 0; j < hobby.length; j++) {
							/*hb+=hobby[j]+",";*/
							Hobby_model hm=new Hobby_model(hobby[j],fm);
							d.insert(hm);
							
						}
						/*System.out.println(hb);*/
					}
			}
			break;
			/*case 5:
				String idd=request.getParameter("id");
				String name=request.getParameter("name");
				long number=Long.parseLong(request.getParameter("number"));
				String hobby[]=request.getParameterValues("hobby");
				String hb="";
				for (int j = 0; j < hobby.length; j++) {
					hb+=hobby[j];
				
				}
				System.out.println(hb);
				
				int id1=0;
				if(!idd.isEmpty()){
					id1=Integer.parseInt(request.getParameter("id"));
				}
				Form_model1 fm=new Form_model1(id1,name,number,hb);
				if(!idd.isEmpty()){
					d.update(fm);
				}
				d.insert(fm);
				
				break;*/
		/*case 4:
			String idd=request.getParameter("id");
			String name=request.getParameter("name");
			long no=Long.parseLong(request.getParameter("mno"));
			id=0;
			if(!idd.isEmpty()){
				id=Integer.parseInt(request.getParameter("id"));
			}
			smodel sm=new smodel(id,name,no);
			if(!idd.isEmpty()){
				d.update(sm);
			}
			d.insert(sm);
			response.sendRedirect("file?i=7");
			break;*/
		case 6:
			String id4=request.getParameter("id");
			String name4=request.getParameter("username");
			long number4=Long.parseLong(request.getParameter("usernumber"));
			int id5=0;
			if(!id4.isEmpty()){
				System.out.println("hello");
				id5=Integer.parseInt(request.getParameter("id"));
			}
			User_model um=new User_model(name4, number4);
			if(!id4.isEmpty()){
				d.update(um);
			}
			else{
				d.insert(um);
			/*String hb="";*/
			}
			response.sendRedirect("file?i=10");
			break;
		case 7:
			String iddd=request.getParameter("id");
			int unname=Integer.parseInt(request.getParameter("username"));
			String hob[]=request.getParameterValues("hobby");
			User_model uname=new User_model(unname);
			for (int j = 0; j < hob.length; j++) {
				Hobby_model1 hbm=new Hobby_model1(hob[j], uname);
				d.insert(hbm);
			}
			response.sendRedirect("file?i=10");
			break;
		default:
			break;
		}
	}

}

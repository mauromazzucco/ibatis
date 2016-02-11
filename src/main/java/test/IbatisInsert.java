package test;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class IbatisInsert {
	private static SqlSessionFactory factory;

	   public static void main(String[] args)throws IOException,SQLException, ParseException{
		      Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");		      
		      factory = new SqlSessionFactoryBuilder().build(rd);	      
		      DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		      String daST = "20-04-1985";
		      Date myDate = formatter.parse(daST);
		      Funcionario f = new Funcionario("Zara", "Ali", myDate); 		  		      
		      SqlSession session = factory.openSession();
		      session.insert("test.Funcionario.insert", f);
		      session.commit();
		      session.close();

		   }

}

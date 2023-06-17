package hibernate2.hibernate2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try{
        	SessionFactory sf=hibernate2config.getSessionFactory();
        	Session session=sf.openSession();
        	Transaction tx=session.beginTransaction();
        	String cous[]={"kl","op","ji"};
        	List<String>ems=new ArrayList<String>();
        	ems.add("aa@jtc");
        	ems.add("bb@jtc"); 
        	ems.add("cc@jtc");
        	List<Integer>maks=new ArrayList<Integer>();
        	maks.add(new Integer(100));
        	maks.add(new Integer(99));
        	maks.add(new Integer(100));
        	Set<Long>phs=new HashSet<Long>();
        	phs.add(new Long(1111));
        	phs.add(new Long(2222));
        	phs.add(new Long(3333));
        	Map<String,Long>refs=new HashMap<String,Long>();
        	refs.put("aaa",new Long(1111));
        	refs.put("bbb",new Long(2222));
        	refs.put("ccc",new Long(3333));
        	student stu=new student(1, "som","10-10-10","M.Sc",cous,ems,maks,phs,refs);
        	session.save(stu);
        	tx.commit(); 
        	session.close();
        	}catch(Exception e)
        {
        		e.printStackTrace();
        } 
        }
    

        	}
    


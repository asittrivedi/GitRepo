package hibernate2.hibernate2;


	
	import java.util.Properties;
	import org.hibernate.SessionFactory;
		import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
		import org.hibernate.cfg.Configuration;
		import org.hibernate.cfg.Environment;
		import org.hibernate.service.ServiceRegistry;

		import  hibernate2.hibernate2.student;
		//import  hibernate1.hibernate1.li;
		public class hibernate2config {
		
		    private static SessionFactory sessionFactory;
		    public static SessionFactory getSessionFactory() {
		        if (sessionFactory == null) {
		            try {
		                Configuration configuration = new Configuration();
		                Properties settings = new Properties();
		                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		                settings.put(Environment.URL, "jdbc:mysql://localhost:3308/hiber4");
		                settings.put(Environment.USER, "root");
		                settings.put(Environment.PASS, "root");

		                settings.put(Environment.SHOW_SQL, "true");

		                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

		                settings.put(Environment.HBM2DDL_AUTO, "create-drop");

		                configuration.setProperties(settings);

		                configuration.addAnnotatedClass(student.class);
		                configuration.addAnnotatedClass(model.class);
		                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		                        .applySettings(configuration.getProperties()).build();

		                    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }
		            }
		            return sessionFactory;
		        }
		            
		            
		            
		            
		            }




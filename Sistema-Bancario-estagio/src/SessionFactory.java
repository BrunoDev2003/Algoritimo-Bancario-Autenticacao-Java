import javax.naming.ConfigurationException;

public class SessionFactory {
	static SessionFactory sessionFactory = null;

    static {
        try{
            sessionFactory = new ConfigurationException().configure().buildSessionFactory();
        }catch (Throwable ex) { 
           System.err.println("Failed to create sessionFactory object." + ex);
           throw new ExceptionInInitializerError(ex); 
        }
    }

    public static void addToDatabase(String something) {
        
    }
}

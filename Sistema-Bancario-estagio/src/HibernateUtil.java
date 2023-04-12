
public class HibernateUtil {

	public static SessionFactory SessionFactory() {
		// TODO Auto-generated method stub
		try {
			
		} catch (HibernateException he) {
			System.err.println("Error creating Session: " + he);
			throw new ExceptionInInitializerError();
		}
		return null;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}

import java.lang.module.Configuration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory SessionFactory() {
		// TODO Auto-generated method stub
		try {
			Configuration configuration = new Configuration().configurations();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
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

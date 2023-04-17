import javax.naming.ConfigurationException;

public class SessionFactory {
	static SessionFactory sessionFactory = null;

	 if (sessionFactory == null) {
         Configuration configuration = new Configuration().configure();
         ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
         registry.applySettings(configuration.getProperties());
         ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
          
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
     }
      
     return sessionFactory;
 }
    }

    public static void addToDatabase(String something) {
        
    }
}

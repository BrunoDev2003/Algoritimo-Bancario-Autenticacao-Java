
public class DAO {
	public Usuario pesquisaUsuarioLogin(String login, String senha) {
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		Session session = HibernateUtil.getSessionFactory().openSession();
		return usuario;
		
	}
}

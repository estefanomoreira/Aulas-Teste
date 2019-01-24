package br.com.maratona.javacore.Npolimorfismo.test;

import br.com.maratona.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.maratona.javacore.Npolimorfismo.classes.DatabaseDAOImpl;
import br.com.maratona.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
	public static void main(String[] args) {
		GenericDAO arquivoDao = new ArquivoDAOImpl();
		arquivoDao.save();
		GenericDAO arquivoDao1 = new DatabaseDAOImpl();
		arquivoDao1.save();
	}
}

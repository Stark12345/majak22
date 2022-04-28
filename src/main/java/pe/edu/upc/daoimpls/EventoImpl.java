package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.CEventoDao;
import pe.edu.upc.entities.Evento;

public class EventoImpl implements CEventoDao {
	@PersistenceContext(unitName = "majak")
	private EntityManager em;

	@Transactional
	public void insert(Evento ev) {

		try {

			em.persist(ev);
		} catch (Exception e) {
			System.out.println("Error al insertar persona en DAO");

		}
	}

	@SuppressWarnings("unchecked")
	public List<Evento> list() {
		List<Evento> listaEventos = new ArrayList<Evento>();
		try {
			Query jpql = em.createQuery("from Evento ev");
			listaEventos = (List<Evento>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de persona");
		}
		return listaEventos;
	}

	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		Evento even = em.find(Evento.class, id);

		em.remove(even);
	}
}

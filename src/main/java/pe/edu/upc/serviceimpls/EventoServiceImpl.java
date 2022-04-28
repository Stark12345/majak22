package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.CEventoDao;
import pe.edu.upc.serviceinterfaces.CEventoService;
import pe.edu.upc.entities.Evento;

@Named
public class EventoServiceImpl implements CEventoService {
//inject para utilizar una variable
	@Inject
	private CEventoDao eDao;

	public void insert(Evento ev) {

		eDao.insert(ev);
	}

	public List<Evento> list() {
		// TODO Auto-generated method stub
		return eDao.list();
	}

	public void delete(int id) {
		eDao.delete(id);
	}

}

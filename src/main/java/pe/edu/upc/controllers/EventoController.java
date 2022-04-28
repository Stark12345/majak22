package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entities.Evento;
import pe.edu.upc.serviceinterfaces.CEventoService;

@Named
@RequestScoped
public class EventoController {

	private CEventoService uService;
	private Evento ev;
	List<Evento> listaEventos;

	@PostConstruct
	public void init() {
		this.listaEventos = new ArrayList<Evento>();
		this.ev = new Evento();
		this.list();
	}

	public String newEvento() {
		this.setE(new Evento());
		return "evento.xhtml";
	}

	public void insert() {
		try {
			evService.insert(ev);
		} catch (Exception e) {
			System.out.println("Error ocurrió en el controlador de usuario al insertar!!");
		}
	}

	public void list() {
		try {
			listaEventos = evService.list();
		} catch (Exception e) {
			System.out.println("Error al listar personas en el controller!! ");
		}
	}

	public void delete(Evento eve) {

		uService.delete(eve.getCodigoEvento());
		list();

	}

	public Evento getE() {
		return ev;
	}

	public void setU(Evento ev) {
		this.ev = ev;
	}

	public List<Evento> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}

}
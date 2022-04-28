package pe.edu.upc.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CodigoEvento;
	
	@Column(name = "NombreEvento", nullable = false, length = 47)
	private String NombreEvento;
	
	@Column(name = "DescripcionEvento", nullable = false, length = 100)
	private String DescripcionEvento;
	
	@Column(name = "DInicioEvento", nullable = false)
	private Date DInicioEvento;
	
	@Column(name = "DFinEvento", nullable = false)
	private Date DFinEvento;
	
	@Column(name = "NAfectadosEvento", nullable = false, length = 10)
	private int NAfectadosEvento;

	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento(int codigoEvento, String nombreEvento, String descripcionEvento, Date dInicioEvento, Date dFinEvento,
			int nAfectadosEvento) {
		super();
		CodigoEvento = codigoEvento;
		NombreEvento = nombreEvento;
		DescripcionEvento = descripcionEvento;
		DInicioEvento = dInicioEvento;
		DFinEvento = dFinEvento;
		NAfectadosEvento = nAfectadosEvento;
	}

	public int getCodigoEvento() {
		return CodigoEvento;
	}

	public void setCodigoEvento(int codigoEvento) {
		CodigoEvento = codigoEvento;
	}

	public String getNombreEvento() {
		return NombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		NombreEvento = nombreEvento;
	}

	public String getDescripcionEvento() {
		return DescripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		DescripcionEvento = descripcionEvento;
	}

	public Date getDInicioEvento() {
		return DInicioEvento;
	}

	public void setDInicioEvento(Date dInicioEvento) {
		DInicioEvento = dInicioEvento;
	}

	public Date getDFinEvento() {
		return DFinEvento;
	}

	public void setDFinEvento(Date dFinEvento) {
		DFinEvento = dFinEvento;
	}

	public int getNAfectadosEvento() {
		return NAfectadosEvento;
	}

	public void setNAfectadosEvento(int nAfectadosEvento) {
		NAfectadosEvento = nAfectadosEvento;
	}

}

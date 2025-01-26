package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_producto database table.
 * 
 */
@Entity
@Table(name="tbl_producto")
@NamedQuery(name="TblProducto.findAll", query="SELECT t FROM TblProducto t")
public class TblProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductot1;

	private String descripciont1;

	private String estadot1;

	@Temporal(TemporalType.DATE)
	private Date fechafabrit1;

	@Temporal(TemporalType.DATE)
	private Date fechavencit1;

	private String nombret1;

	private double preciot1;

	public TblProducto() {
	}

	public int getIdproductot1() {
		return this.idproductot1;
	}

	public void setIdproductot1(int idproductot1) {
		this.idproductot1 = idproductot1;
	}

	public String getDescripciont1() {
		return this.descripciont1;
	}

	public void setDescripciont1(String descripciont1) {
		this.descripciont1 = descripciont1;
	}

	public String getEstadot1() {
		return this.estadot1;
	}

	public void setEstadot1(String estadot1) {
		this.estadot1 = estadot1;
	}

	public Date getFechafabrit1() {
		return this.fechafabrit1;
	}

	public void setFechafabrit1(Date fechafabrit1) {
		this.fechafabrit1 = fechafabrit1;
	}

	public Date getFechavencit1() {
		return this.fechavencit1;
	}

	public void setFechavencit1(Date fechavencit1) {
		this.fechavencit1 = fechavencit1;
	}

	public String getNombret1() {
		return this.nombret1;
	}

	public void setNombret1(String nombret1) {
		this.nombret1 = nombret1;
	}

	public double getPreciot1() {
		return this.preciot1;
	}

	public void setPreciot1(double preciot1) {
		this.preciot1 = preciot1;
	}

}
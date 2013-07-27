package me.sivanagireddy.cars.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the car database table.
 * 
 */
@Entity
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="create_date")
	private Timestamp createDate;

	private String make;

	@Column(name="mod_date")
	private Timestamp modDate;

	private String model;

	@Temporal(TemporalType.DATE)
	private Date year;

	//bi-directional many-to-one association to CarType
	@ManyToOne
	@JoinColumn(name="car_type")
	private CarType carTypeBean;

	public Car() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Timestamp getModDate() {
		return this.modDate;
	}

	public void setModDate(Timestamp modDate) {
		this.modDate = modDate;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public CarType getCarTypeBean() {
		return this.carTypeBean;
	}

	public void setCarTypeBean(CarType carTypeBean) {
		this.carTypeBean = carTypeBean;
	}

	
}
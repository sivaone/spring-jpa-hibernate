package me.sivanagireddy.cars.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the car_types database table.
 * 
 */
@Entity
@Table(name="car_types")
public class CarType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="mod_date")
	private Timestamp modDate;

	private String type;

	//bi-directional many-to-one association to Car
	@OneToMany(mappedBy="carTypeBean")
	private List<Car> cars;

	public CarType() {
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

	public Timestamp getModDate() {
		return this.modDate;
	}

	public void setModDate(Timestamp modDate) {
		this.modDate = modDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	
	public Car addCars(Car cars) {
		getCars().add(cars);
		cars.setCarTypeBean(this);

		return cars;
	}

	public Car removeCars(Car cars) {
		getCars().remove(cars);
		cars.setCarTypeBean(null);

		return cars;
	}
}
/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Motorcycle {
	@Id
	@GeneratedValue
	private long id;
	private String make;
	private String model;
	private String color;
	private int displacement;
	/**
	 * @param id
	 * @param make
	 * @param model
	 * @param color
	 * @param displacement
	 */
	public Motorcycle(long id, String make, String model, String color, int displacement) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.color = color;
		this.displacement = displacement;
	}
	/**
	 * @param make
	 * @param model
	 * @param color
	 * @param displacement
	 */
	public Motorcycle(String make, String model, String color, int displacement) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.displacement = displacement;
	}
	/**
	 * 
	 */
	public Motorcycle() {
		super();
		this.make = "Suzuki";
		this.model = "VStrom";
		this.color = "Black";
		this.displacement = 1000;
	}
	/**
	 * @param make
	 * @param model
	 */
	public Motorcycle(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the displacement
	 */
	public int getDisplacement() {
		return displacement;
	}
	/**
	 * @param displacement the displacement to set
	 */
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", displacement="
				+ displacement + "]";
	}
	
	
	
	
}

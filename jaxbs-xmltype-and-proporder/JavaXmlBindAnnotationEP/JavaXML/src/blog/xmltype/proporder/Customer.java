package blog.xmltype.proporder;

import javax.xml.bind.annotation.*;

/**
 * @author Chris Wong
 *
 */
@XmlRootElement
@XmlType(propOrder = {"Id", "firstName", "lastName"})
public class Customer {
	private String firstName;
	private String lastName;
	private int id;

	/**
	 * @return first name of customer
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName	first name of customer
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return last name of customer
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName last name of customer
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return	ID of customer
	 */
	public int getID() {
		return id;
	}

	/**
	 * @param id	ID of customer
	 */
	public void setID(int id) {
		this.id = id;
	}
}

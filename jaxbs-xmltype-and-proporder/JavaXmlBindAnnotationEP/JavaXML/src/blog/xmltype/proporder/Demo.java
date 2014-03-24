package blog.xmltype.proporder;

import javax.xml.bind.*;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(Customer.class);
			Customer customer = new Customer();
			customer.setFirstName("Jane");
			customer.setLastName("Doe");
			customer.setID(123);

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(customer, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

package blog.xmltype.proporder;

import javax.xml.bind.*;

/**
 * @author Chris Wong
 * <p>
 *  <a href="http://blog.bdoughan.com/2012/02/jaxbs-xmltype-and-proporder.html">Demo</a>
 * </p>
 *
 */
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
			customer.setFirstName("Chris");
			customer.setLastName("Wong");
			customer.setID(924);

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(customer, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

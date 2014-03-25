<p><h1>Console</h1></p>
<p>javax.xml.bind.MarshalException</p>
<p> - with linked exception:</p>
<p>[com.sun.istack.internal.SAXException2: unable to marshal type "blog.xmltype.proporder.Customer" as an element because it is missing an @XmlRootElement annotati</p>
<p>on]</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.write(MarshallerImpl.java:311)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.marshal(MarshallerImpl.java:236)</p>
<p>	at javax.xml.bind.helpers.AbstractMarshallerImpl.marshal(AbstractMarshallerImpl.java:95)</p>
<p>	at blog.xmltype.proporder.Demo.main(Demo.java:29)</p>
<p>Caused by: com.sun.istack.internal.SAXException2: unable to marshal type "blog.xmltype.proporder.Customer" as an element because it is missing an @XmlRootElemen</p>
<p>t annotation</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.XMLSerializer.reportError(XMLSerializer.java:237)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.ClassBeanInfoImpl.serializeRoot(ClassBeanInfoImpl.java:322)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.XMLSerializer.childAsRoot(XMLSerializer.java:483)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.write(MarshallerImpl.java:308)</p>
<p>	... 3 more</p>
</br>
<p><h1>Customer.java</h1></p>
<p>@XmlRootElement</p>
<p>@XmlType(propOrder = {"ID", "firstName", "lastName"})</p>


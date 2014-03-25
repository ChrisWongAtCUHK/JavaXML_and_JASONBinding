<p><h1>Console</h1></p>

<p>com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationsException: 2 counts of IllegalAnnotationExceptions</p>
<p>Property ID is present but not specified in @XmlType.propOrder</p>
<p>	this problem is related to the following location:</p>
<p>		at public int blog.xmltype.proporder.Customer.getID()</p>
<p>		at blog.xmltype.proporder.Customer</p>
<p>Property Id appears in @XmlType.propOrder, but no such property exists. Maybe you meant ID?</p>
<p>	this problem is related to the following location:</p>
<p>		at blog.xmltype.proporder.Customer</p>
<p></p>
<p>	at com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationsException$Builder.check(IllegalAnnotationsException.java:91)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl.getTypeInfoSet(JAXBContextImpl.java:450)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl.<init>(JAXBContextImpl.java:282)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl.<init>(JAXBContextImpl.java:125)</p>
<p>	at com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl$JAXBContextBuilder.build(JAXBContextImpl.java:1147)</p>
<p>	at com.sun.xml.internal.bind.v2.ContextFactory.createContext(ContextFactory.java:130)</p>
<p>	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)</p>
<p>	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)</p>
<p>	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)</p>
<p>	at java.lang.reflect.Method.invoke(Method.java:606)</p>
<p>	at javax.xml.bind.ContextFinder.newInstance(ContextFinder.java:248)</p>
<p>	at javax.xml.bind.ContextFinder.newInstance(ContextFinder.java:235)</p>
<p>	at javax.xml.bind.ContextFinder.find(ContextFinder.java:445)</p>
<p>	at javax.xml.bind.JAXBContext.newInstance(JAXBContext.java:637)</p>
<p>	at javax.xml.bind.JAXBContext.newInstance(JAXBContext.java:584)</p>
<p>	at blog.xmltype.proporder.Demo.main(Demo.java:21)</p>

<p><h1>Customer.java: 10</h1></p>
<p>@XmlType(propOrder = {"Id", "firstName", "lastName"})</p>

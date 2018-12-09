package REST;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;


import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class libraryApi {
	@Test
	public void lib() throws XmlException, IOException, SoapUIException {
		
		WsdlProject project=new WsdlProject("/home/parinder/SoapUI/Library-API---REST-soapui-project.xml");
		
		WsdlTestSuite testsuite=project.getTestSuiteByName("Library_TestSuite");
		int testCaseCount= testsuite.getTestCaseCount();
		
		for(int i=0;i<testCaseCount;i++) {
			
			WsdlTestCase testcase=testsuite.getTestCaseAt(i);
			
			TestRunner runner=testcase.run(new PropertiesMap(), false);
			
			
			
			
		}
		
		
	}

}

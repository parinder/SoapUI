package SOAP;

import java.io.IOException;
import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;



public class EmpPortal {
	
	
	@Test
	public void emp() throws XmlException, IOException, SoapUIException {
		// TODO Auto-generated method stub

		// 1. Grab the Project
		WsdlProject project = new WsdlProject(
				"/home/parinder/SoapUI/EmployeePortal-Framework-soapui-project.xml");
		// 2. Grab the TestSuite
		WsdlTestSuite testsuite = project.getTestSuiteByName("Framework_TestSuite");
		System.out.println(testsuite.getTestCaseCount());

		// 3. Grab the TestCase
		WsdlTestCase testcase = testsuite.getTestCaseByName("Script");

		// 4. Run the TestCase
		TestRunner runner=testcase.run(new PropertiesMap(), false);
		Assert.assertEquals(Status.FINISHED, runner.getStatus());
	}

}

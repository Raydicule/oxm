package com.evolvus.training.oxm.domain.test;

import java.io.FileOutputStream;

import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evolvus.training.oxm.domain.BranchData2;
import com.evolvus.training.oxm.domain.PostalAddress6;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/test-config.xml" })
public class BranchData2Test {

	@Autowired
	private Marshaller castorMarshaller;

	@Test
	public void testBranchData() throws Exception {
		PostalAddress6 result = new PostalAddress6();
		result.setAddressLine1("314, Dayakamal Towers");
		result.setAddressLine2("Mayuri Marg");

		BranchData2 branchId = new BranchData2();
		branchId.setIdentification("ENBDDUB");
		branchId.setName("ENBD Dubai Branch");
		branchId.setPostalAddress(result);

		String FILE_NAME = "BranchData2.xml";
		FileOutputStream os = null;
		os = new FileOutputStream(FILE_NAME);
		this.castorMarshaller.marshal(branchId, new StreamResult(os));
		os.close();
	}
}

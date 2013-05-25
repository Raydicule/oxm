package com.evolvus.training.oxm.domain.test;

import java.io.FileOutputStream;

import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evolvus.training.oxm.domain.PostalAddress6;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/test-config.xml" })
public class PostalAddress6Test {

	@Autowired
	private Marshaller castorMarshaller;

	@Test
	public void testPostalAddress() throws Exception {
		PostalAddress6 result = new PostalAddress6();
		result.setAddressLine1("314, Dayakamal Towers");
		result.setAddressLine2("Mayuri Marg");
		
		String FILE_NAME = "PostalAddress6.xml";
		FileOutputStream os = null;
		os = new FileOutputStream(FILE_NAME);
		this.castorMarshaller.marshal(result, new StreamResult(os));
		os.close();
	}
}

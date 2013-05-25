package com.evolvus.training.oxm.domain.test;

import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evolvus.training.oxm.domain.ContactDetails2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/test-config.xml" })
public class ContactDetails2Test {

	@Autowired
	private Validator validator;

	@Autowired
	private Marshaller castorMarshaller;

	@Test
	public void testContactDetails2ValidationsNoData() {
		ContactDetails2 result = new ContactDetails2();
		Set<ConstraintViolation<ContactDetails2>> violations = validator
				.validate(result);

		assertTrue("No validations performed on null data",
				violations.size() == 0);
	}

	@Test
	public void testNmPrfxValidation() {
		ContactDetails2 result = new ContactDetails2();
		result.setNmPrfx("Hello World!");

		Set<ConstraintViolation<ContactDetails2>> violations = validator
				.validate(result);

		assertTrue("One validation exception should happen: ",
				violations.size() == 1);
		for (ConstraintViolation<ContactDetails2> violation : violations) {
			String propertyPath = violation.getPropertyPath().toString();
			String message = violation.getMessage();
			System.out.println("invalid value for: '" + propertyPath + "': "
					+ message);
		}

		result.setNmPrfx("DOCT");
		violations = validator.validate(result);
		assertTrue("Validation should be successful: ", violations.size() == 0);
	}

	@Test
	public void testPhoneNumberValidations() {
		ContactDetails2 result = new ContactDetails2();
		result.setPhneNb("+91-(988)506-017");
		Set<ConstraintViolation<ContactDetails2>> violations = validator
				.validate(result);

		for (ConstraintViolation<ContactDetails2> violation : violations) {
			String propertyPath = violation.getPropertyPath().toString();
			String message = violation.getMessage();
			System.out.println("invalid value for: '" + propertyPath + "': "
					+ message);
		}
		assertTrue("No validations performed on null data",
				violations.size() == 0);
	}

	@Test
	public void testMarshalling() throws Exception {
		ContactDetails2 result = new ContactDetails2();
		result.setPhneNb("+91-(988)506-017");
		String FILE_NAME = "ContactDetails2.xml";

		FileOutputStream os = null;
		os = new FileOutputStream(FILE_NAME);
		this.castorMarshaller.marshal(result, new StreamResult(os));
		os.close();
	}
}

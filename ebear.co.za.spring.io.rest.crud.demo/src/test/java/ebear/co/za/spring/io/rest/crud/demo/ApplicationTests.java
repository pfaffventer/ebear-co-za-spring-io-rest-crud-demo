package ebear.co.za.spring.io.rest.crud.demo;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;
import ebear.co.za.spring.io.rest.crud.demo.supplier.model.Supplier;
import ebear.co.za.spring.io.rest.crud.demo.supplier.repository.CrudRepository_Supplier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	CrudRepository_Supplier supplierRepository;
	
	public static final String REST_SERVICE_URI = "http://localhost:8080";

	/*
	 * TEST - create & delete
	 */
	@Test
	public void testSupplierCreateDelete() {
		RestTemplate restTemplate = new RestTemplate();
		String result = "";
		
		System.out.println(":) Testing /supplier/create/supplierCode ***");
		result = (String) restTemplate.getForObject(REST_SERVICE_URI + "/supplier/create/supplierCode?supplierCode=NEW777", String.class);
		System.out.println(":) DONE TESTING: " + result);

		System.out.println(":) Testing /supplier/delete/supplierCode ***");
		result = (String) restTemplate.getForObject(REST_SERVICE_URI + "/supplier/delete/supplierCode?supplierCode=NEW777", String.class);
		System.out.println(":) DONE TESTING: " + result);

		System.out.println(":) Testing /supplier/create ***");
		Supplier newSupplier = new Supplier(new LogRecord("test"),"NEW777","TEST CREATE");
		Supplier supplier = restTemplate.postForObject(REST_SERVICE_URI + "/supplier/create/", newSupplier, Supplier.class);
		System.out.println(":) DONE TESTING: " + supplier.getId());

		System.out.println(":) Testing /supplier/delete/id ***");
		result = (String) restTemplate.getForObject(REST_SERVICE_URI + "/supplier/delete/id?id=" + supplier.getId(), String.class);
		System.out.println(":) DONE TESTING: " + result);
	}

	/*
	 * TEST - read
	 */
	@Test
	public void testSupplierReadID() {
		RestTemplate restTemplate = new RestTemplate();

		System.out.println(":) Testing /supplier/read/id ***");
		restTemplate = new RestTemplate();
		Supplier supplier = restTemplate.getForObject(REST_SERVICE_URI + "/supplier/read/id?id=1", Supplier.class);
		System.out.println(":) DONE TESTING: " + supplier.getId());

		System.out.println(":) Testing /supplier/read/supplierCode ***");
		restTemplate = new RestTemplate();
		supplier = restTemplate.getForObject(REST_SERVICE_URI + "/supplier/read/supplierCode?supplierCode=MSB001", Supplier.class);
		System.out.println(":) DONE TESTING: " + supplier.getSupplierCode());
	}

	/*
	 * TEST - save
	 */
	@Test
	public void testSupplierSave() {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(":) Testing /supplier/save/ ***");
		Supplier testUpdate = supplierRepository.findById(1);
		testUpdate.setSupplierDescription("Nome Fisheries AK");
		Supplier supplier = restTemplate.postForObject(REST_SERVICE_URI + "/supplier/save/", testUpdate, Supplier.class);
		System.out.println(":) DONE TESTING: " + supplier.getSupplierDescription());
	}

}

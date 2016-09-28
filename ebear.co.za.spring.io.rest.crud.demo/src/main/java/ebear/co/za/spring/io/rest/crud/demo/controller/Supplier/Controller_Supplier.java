package ebear.co.za.spring.io.rest.crud.demo.controller.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ebear.co.za.spring.io.rest.crud.demo.repository.supplier.CrudRepository_Supplier;

@RestController
public class Controller_Supplier {

	@Autowired
	CrudRepository_Supplier supplierRepository;

	@RequestMapping("/create")
	public String create(long id) {
		try {

		} catch (Exception e) {
			return "Error creating supplier: " + e.toString();
		}
		return "Supplier id: " + id + " succesfully created";
	}


	@RequestMapping("/delete")
	public String delete(long id) {
		try {
		}
		catch (Exception e) {
			return "Error deleting supplier:" + e.toString();
		}
		return "Supplier id: " + id + " succesfully created";
	}



}

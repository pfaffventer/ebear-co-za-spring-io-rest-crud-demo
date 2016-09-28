package ebear.co.za.spring.io.rest.crud.demo.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ebear.co.za.spring.io.rest.crud.demo.supplier.repository.CrudRepository_Supplier;

@RestController
public class Controller_Supplier {

	@Autowired
	CrudRepository_Supplier supplierRepository;

	@RequestMapping("/create")
	public String create(String code) {
		try {
		} catch (Exception e) {
			return "Error creating supplier: " + e.toString();
		}
		return "Supplier id: " + code + " succesfully created";
	}


	@RequestMapping("/delete")
	public String delete(String code) {
		try {
		}
		catch (Exception e) {
			return "Error deleting supplier:" + e.toString();
		}
		return "Supplier id: " + code + " succesfully created";
	}

}

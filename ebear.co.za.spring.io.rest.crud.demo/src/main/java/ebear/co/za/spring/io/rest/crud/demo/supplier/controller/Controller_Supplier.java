package ebear.co.za.spring.io.rest.crud.demo.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;
import ebear.co.za.spring.io.rest.crud.demo.supplier.model.Supplier;
import ebear.co.za.spring.io.rest.crud.demo.supplier.repository.CrudRepository_Supplier;

@RestController
public class Controller_Supplier {

	@Autowired
	CrudRepository_Supplier supplierRepository;

	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * CREATE NEW SUPPLIER
	 *
	 * GET - create a default supplier supplierCode = ?
	 */
	@RequestMapping("/supplier/create/supplierCode")
	public String create(String supplierCode) {
		try {
			supplierRepository.save(new Supplier(new LogRecord(System.getProperty("user.name")),supplierCode,"DESCRIPTION FOR (" + supplierCode + ")"));
		} catch (Exception e) {
			return "Error creating supplier: " + e.toString();
		}
		return "Supplier: " + supplierCode + " succesfully created";
	}

	/*
	 * POST - create new supplier = ?
	 */
	@RequestMapping("/supplier/create/")
	public ResponseEntity<Supplier> create(@RequestBody Supplier newSupplier) {
		Supplier supplier = null;
		try {
			supplier = supplierRepository.save(newSupplier);
		} catch (Exception e) {
			return new ResponseEntity<Supplier>(supplier, HttpStatus.NOT_EXTENDED);	
		}
		return new ResponseEntity<Supplier>(supplier, HttpStatus.OK);		
	}

	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * DELETE SUPPLIER
	 *
	 * GET - delete a supplier where supplier_id = ? 
	 */
	@RequestMapping("/supplier/delete/id")
	public String delete(long id) {
		try {
			supplierRepository.delete(supplierRepository.findById(id));
		}
		catch (Exception e) {
			return "Error deleting supplier: " + "[" + id + "] "+ e.toString();
		}
		return "Supplier: " + id + " succesfully deleted";
	}

	/*
	 * GET - delete a supplier where supplier_code = ? 
	 */
	@RequestMapping("/supplier/delete/supplierCode")
	public String delete(String supplierCode) {
		try {
			supplierRepository.delete(supplierRepository.findBySupplierCode(supplierCode));
		}
		catch (Exception e) {
			return "Error deleting supplier: " + "[" + supplierCode + "] "+ e.toString();
		}
		return "Supplier: " + supplierCode + " succesfully deleted";
	}


	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * READ SUPPLIER
	 *
	 * GET - read supplier where supplier_id = ?
	 */
	@RequestMapping("/supplier/read/id")
	public ResponseEntity<Supplier> read(long id) {
		Supplier supplier = null;
		try {
			supplier = supplierRepository.findById(id);
			if(supplier==null) {
				return new ResponseEntity<Supplier>(supplier, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<Supplier>(supplier, HttpStatus.NOT_EXTENDED);	

		}
		return new ResponseEntity<Supplier>(supplier, HttpStatus.OK);		
	}

	/*
	 * GET - read supplier where supplier_code = ?
	 */
	@RequestMapping("/supplier/read/supplierCode")
	public ResponseEntity<Supplier> read(String supplierCode) {
		Supplier supplier = null;
		try {
			supplier = supplierRepository.findBySupplierCode(supplierCode);
			if(supplier==null) {
				return new ResponseEntity<Supplier>(supplier, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<Supplier>(supplier, HttpStatus.NOT_EXTENDED);	

		}
		return new ResponseEntity<Supplier>(supplier, HttpStatus.OK);		
	}


	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * READ SUPPLIER
	 *
	 * POST - read supplier where supplier_id = ?
	 */
	@RequestMapping("/supplier/save/")
	public ResponseEntity<Supplier> save(@RequestBody Supplier supplierToSave) {
		Supplier currentSupplier = null;
		Supplier savedSupplier = null;
		try {
			currentSupplier = supplierRepository.findBySupplierCode(supplierToSave.getSupplierCode());
			currentSupplier.setSupplierDescription(supplierToSave.getSupplierDescription());
			savedSupplier = supplierRepository.save(currentSupplier);
		} catch (Exception e) {
			return new ResponseEntity<Supplier>(savedSupplier, HttpStatus.NOT_EXTENDED);	
		}
		return new ResponseEntity<Supplier>(savedSupplier, HttpStatus.OK);		
	}


}

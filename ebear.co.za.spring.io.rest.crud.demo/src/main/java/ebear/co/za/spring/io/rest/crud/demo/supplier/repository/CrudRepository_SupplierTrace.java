package ebear.co.za.spring.io.rest.crud.demo.supplier.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.supplier.model.SupplierShadow;

@Transactional
public interface CrudRepository_SupplierTrace extends CrudRepository<SupplierShadow, Long> {

}

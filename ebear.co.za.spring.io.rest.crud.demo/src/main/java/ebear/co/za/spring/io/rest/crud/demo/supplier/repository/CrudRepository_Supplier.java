package ebear.co.za.spring.io.rest.crud.demo.supplier.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.supplier.model.Supplier;

@Transactional
public interface CrudRepository_Supplier extends CrudRepository<Supplier, Long> {

	Supplier findById(@Param("id") long id);

	Supplier findByCode(@Param("code") String code);

}

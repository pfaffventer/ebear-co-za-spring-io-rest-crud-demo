package ebear.co.za.spring.io.rest.crud.demo.repository.supplier;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.model.supplier.Supplier;

@Transactional
public interface CrudRepository_Supplier extends CrudRepository<Supplier, Long> {

	List<Supplier> findById(@Param("id") long id);

}

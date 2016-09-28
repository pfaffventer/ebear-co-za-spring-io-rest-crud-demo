package ebear.co.za.spring.io.rest.crud.demo.repository.trade.item;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.model.trade.item.TradeItemCategory;

@Transactional
public interface CrudRepository_TradeItemCategory extends CrudRepository<TradeItemCategory, Long> {

	List<TradeItemCategory> findById(@Param("id") long id);

}

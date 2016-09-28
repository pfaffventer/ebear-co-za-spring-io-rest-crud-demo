package ebear.co.za.spring.io.rest.crud.demo.trade.item.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.trade.item.model.TradeItemCategory;

@Transactional
public interface CrudRepository_TradeItemCategory extends CrudRepository<TradeItemCategory, Long> {

	TradeItemCategory findById(@Param("id") long id);

}

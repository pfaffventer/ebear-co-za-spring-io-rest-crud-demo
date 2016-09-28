package ebear.co.za.spring.io.rest.crud.demo.repository.trade.item;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.model.trade.item.TradeItem;

@Transactional
public interface CrudRepository_TradeItem extends CrudRepository<TradeItem, Long> {

	TradeItem findById(@Param("id") long id);
	
	List<TradeItem> findAll();

}

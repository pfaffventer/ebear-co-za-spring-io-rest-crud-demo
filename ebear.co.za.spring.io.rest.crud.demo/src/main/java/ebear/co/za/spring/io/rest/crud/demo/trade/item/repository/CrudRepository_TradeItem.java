package ebear.co.za.spring.io.rest.crud.demo.trade.item.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.trade.item.model.TradeItem;

@Transactional
public interface CrudRepository_TradeItem extends CrudRepository<TradeItem, Long> {

	TradeItem findById(@Param("id") long id);

	TradeItem findByItemCode(@Param("itemCode") String itemCode);
}

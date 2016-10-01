package ebear.co.za.spring.io.rest.crud.demo.trade.item.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.transaction.annotation.Transactional;

import ebear.co.za.spring.io.rest.crud.demo.trade.item.model.TradeItemShadow;

@Transactional
public interface CrudRepository_TradeItemShadow extends CrudRepository<TradeItemShadow, Long> {

}

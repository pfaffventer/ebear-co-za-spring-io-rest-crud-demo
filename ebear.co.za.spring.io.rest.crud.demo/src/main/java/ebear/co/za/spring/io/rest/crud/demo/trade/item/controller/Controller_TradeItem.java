package ebear.co.za.spring.io.rest.crud.demo.trade.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ebear.co.za.spring.io.rest.crud.demo.trade.item.repository.CrudRepository_TradeItem;

@RestController
public class Controller_TradeItem {

	@Autowired
	CrudRepository_TradeItem tradeItemRepository;

//	@RequestMapping("/tradeItems/findall")
//	TradeItem tradeItemQuery() {
//		return tradeItemRepository.findById(1);
//	}

}

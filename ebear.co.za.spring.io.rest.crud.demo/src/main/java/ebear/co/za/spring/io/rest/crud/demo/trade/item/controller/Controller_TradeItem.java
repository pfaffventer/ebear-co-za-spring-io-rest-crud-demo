package ebear.co.za.spring.io.rest.crud.demo.trade.item.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;
import ebear.co.za.spring.io.rest.crud.demo.constant.CrudAction;
import ebear.co.za.spring.io.rest.crud.demo.trade.item.model.TradeItem;
import ebear.co.za.spring.io.rest.crud.demo.trade.item.model.TradeItemShadow;
import ebear.co.za.spring.io.rest.crud.demo.trade.item.repository.CrudRepository_TradeItem;
import ebear.co.za.spring.io.rest.crud.demo.trade.item.repository.CrudRepository_TradeItemCategory;
import ebear.co.za.spring.io.rest.crud.demo.trade.item.repository.CrudRepository_TradeItemShadow;

@Transactional
@RestController
public class Controller_TradeItem {

	@Autowired
	CrudRepository_TradeItem tradeItemRepository;

	@Autowired
	CrudRepository_TradeItemShadow tradeItemShadowRepository;

	@Autowired
	CrudRepository_TradeItemCategory tradeItemCategoryRepository;


	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * CREATE NEW TRADE ITEM
	 *
	 * GET - create a default trade item itemCode = ?
	 */
	@RequestMapping("/trade/item/create/itemCode")
	public String create(String itemCode) {
		try {
			tradeItemRepository.save(new TradeItem(new LogRecord(System.getProperty("user.name")),itemCode,"DESCRIPTION FOR (" + itemCode + ")",tradeItemCategoryRepository.findById(1)));
		} catch (Exception e) {
			return "Error creating trade item: " + e.toString();
		}
		return "Trade item: " + itemCode + " succesfully created";
	}

	
	
	
	
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * DELETE TRADE ITEM
	 *
	 * GET - delete a trade item where ite_id = ? 
	 */
	@RequestMapping("/trade/item/delete/id")
	public String delete(long id) {
		try {
			tradeItemShadowRepository.save(new TradeItemShadow(System.getProperty("user.name"),CrudAction.DELETE,tradeItemRepository.findById(id)));
			tradeItemRepository.delete(tradeItemRepository.findById(id));
		}
		catch (Exception e) {
			return "Error deleting trade item: " + "[" + id + "] "+ e.toString();
		}
		return "Trade item: " + id + " succesfully deleted";
	}

	/*
	 * GET - delete a trade item where item_code = ? 
	 */
	@RequestMapping("/trade/item/delete/itemCode")
	public String delete(String itemCode) {
		try {
			tradeItemShadowRepository.save(new TradeItemShadow(System.getProperty("user.name"),CrudAction.DELETE,tradeItemRepository.findByItemCode(itemCode)));
			tradeItemRepository.delete(tradeItemRepository.findByItemCode(itemCode));
		}
		catch (Exception e) {
			return "Error deleting trade item: " + "[" + itemCode + "] "+ e.toString();
		}
		return "Trade item: " + itemCode + " succesfully deleted";
	}

}

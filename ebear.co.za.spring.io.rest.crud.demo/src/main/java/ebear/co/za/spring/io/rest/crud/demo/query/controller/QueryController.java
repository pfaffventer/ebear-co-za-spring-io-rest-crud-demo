package ebear.co.za.spring.io.rest.crud.demo.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ebear.co.za.spring.io.rest.crud.demo.query.model.TradeItemQuery;
import ebear.co.za.spring.io.rest.crud.demo.query.repository.QueryRepository;

@RestController
public class QueryController {

	private final QueryRepository queryRepository;

	@Autowired
	QueryController(QueryRepository queryRepository) {
		this.queryRepository = queryRepository;

	}

	@RequestMapping("/tradeItems/query")
	List<TradeItemQuery> commodityQuery() {
		return queryRepository.tradeItemQuery();
	}

}

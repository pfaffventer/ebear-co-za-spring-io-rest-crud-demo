package ebear.co.za.spring.io.rest.crud.demo.query.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import ebear.co.za.spring.io.rest.crud.demo.query.model.TradeItemQuery;

@Service
public class QueryRepository implements Repository<String, Long> {

	private String sql;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public QueryRepository() {
		super();
	}

	public List<TradeItemQuery> tradeItemQuery() {
		sql = "select"
				+ "  i.item_code"
				+ " ,i.item_description"
				+ " ,i.log_time"
				+ " ,i.log_user"
				+ " from trade_item i";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<TradeItemQuery>(TradeItemQuery.class));
	}

}

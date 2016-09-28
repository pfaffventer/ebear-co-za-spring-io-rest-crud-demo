package ebear.co.za.spring.io.rest.crud.demo.query.model;

import java.sql.Timestamp;

public class TradeItemQuery {
	
	private String itemCode;
	private String description;
	private Timestamp logTime;
	private String logUser;

	public TradeItemQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradeItemQuery(String itemCode, String description, Timestamp logTime, String logUser) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.logTime = logTime;
		this.logUser = logUser;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getLogTime() {
		return logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	public String getLogUser() {
		return logUser;
	}

	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}

}

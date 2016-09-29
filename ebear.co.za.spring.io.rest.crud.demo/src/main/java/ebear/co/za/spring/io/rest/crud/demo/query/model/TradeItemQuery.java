package ebear.co.za.spring.io.rest.crud.demo.query.model;

import java.sql.Timestamp;

public class TradeItemQuery {
	
	private String tradeItemCode;
	private String tradeItemDescription;
	private Timestamp logTime;
	private String logUser;

	public TradeItemQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradeItemQuery(String tradeItemCode, String tradeItemDescription, Timestamp logTime, String logUser) {
		super();
		this.tradeItemCode = tradeItemCode;
		this.tradeItemDescription = tradeItemDescription;
		this.logTime = logTime;
		this.logUser = logUser;
	}

	public String getTradeItemCode() {
		return tradeItemCode;
	}

	public void setTradeItemCode(String tradeItemCode) {
		this.tradeItemCode = tradeItemCode;
	}

	public String getTradeItemDescription() {
		return tradeItemDescription;
	}

	public void setTradeItemDescription(String tradeItemDescription) {
		this.tradeItemDescription = tradeItemDescription;
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

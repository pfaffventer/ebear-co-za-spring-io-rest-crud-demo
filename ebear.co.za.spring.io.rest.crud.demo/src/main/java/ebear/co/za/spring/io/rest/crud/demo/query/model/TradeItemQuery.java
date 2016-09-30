package ebear.co.za.spring.io.rest.crud.demo.query.model;

import java.sql.Timestamp;

public class TradeItemQuery {
	
	private String tradeItemCode;
	private String tradeItemDescription;
	private Timestamp createTime;
	private String createUser;

	public TradeItemQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradeItemQuery(String tradeItemCode, String tradeItemDescription, Timestamp createTime, String createUser) {
		super();
		this.tradeItemCode = tradeItemCode;
		this.tradeItemDescription = tradeItemDescription;
		this.createTime = createTime;
		this.createUser = createUser;
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

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

}

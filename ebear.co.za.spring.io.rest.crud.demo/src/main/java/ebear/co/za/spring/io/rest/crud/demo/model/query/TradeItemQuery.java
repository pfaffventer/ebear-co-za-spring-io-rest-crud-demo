package ebear.co.za.spring.io.rest.crud.demo.model.query;

import java.sql.Timestamp;

public class TradeItemQuery {
	
	private String code;
	private String description;
	private Timestamp logTime;
	private String logUser;

	public TradeItemQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradeItemQuery(String code, String description, Timestamp logTime, String logUser) {
		super();
		this.code = code;
		this.description = description;
		this.logTime = logTime;
		this.logUser = logUser;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

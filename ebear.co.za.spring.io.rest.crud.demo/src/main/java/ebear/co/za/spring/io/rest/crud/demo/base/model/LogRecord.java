package ebear.co.za.spring.io.rest.crud.demo.base.model;

public class LogRecord {

	private String logUser;
	private String code;
	private String description;
	
	public LogRecord(String logUser, String code, String description) {
		super();
		this.logUser = logUser;
		this.code = code;
		this.description = description;
	}

	public String getLogUser() {
		return logUser;
	}

	public void setLogUser(String logUser) {
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

}

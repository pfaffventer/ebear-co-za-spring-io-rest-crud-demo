package ebear.co.za.spring.io.rest.crud.demo.base.model;

public class LogRecord {

	private String logUser;
	
	public LogRecord(String logUser) {
		super();
		this.logUser = logUser;
	}

	public String getLogUser() {
		return logUser;
	}

	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}

}

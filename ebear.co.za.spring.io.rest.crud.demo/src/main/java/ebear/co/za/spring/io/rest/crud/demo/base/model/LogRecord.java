package ebear.co.za.spring.io.rest.crud.demo.base.model;

public class LogRecord {

	private String createUser;
	
	public LogRecord(String createUser) {
		super();
		this.createUser = createUser;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

}

package ebear.co.za.spring.io.rest.crud.demo.base.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class LogModel {

	@Column(name = "CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String code;

	@Column(name = "DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String description;

	@Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp logTime;
	
	@Column(columnDefinition = "VARCHAR(255) NOT NULL")
	private String logUser;

	public LogModel() {}
	
	public LogModel(LogRecord log) {
		super();
		this.logUser = log.getLogUser();
		this.code = log.getCode();
		this.description = log.getDescription();
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

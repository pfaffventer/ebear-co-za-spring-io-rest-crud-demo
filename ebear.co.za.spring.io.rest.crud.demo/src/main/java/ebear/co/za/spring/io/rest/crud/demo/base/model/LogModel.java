package ebear.co.za.spring.io.rest.crud.demo.base.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class LogModel {

	@Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp createTime;
	
	@Column(columnDefinition = "VARCHAR(255) NOT NULL")
	private String createUser;

	public LogModel() {}
	
	public LogModel(LogRecord log) {
		super();
		this.createUser = log.getCreateUser();
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

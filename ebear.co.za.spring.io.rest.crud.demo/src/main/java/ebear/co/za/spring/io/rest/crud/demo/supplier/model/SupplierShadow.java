package ebear.co.za.spring.io.rest.crud.demo.supplier.model;

import java.sql.Timestamp;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPLIER_SHADOW")
public class SupplierShadow {

	//SHADOW START
	
	@Id
    @Column(name = "SHADOW_ID")
    @GeneratedValue
    private long id;

	@Column(name = "SHADOW_USER",columnDefinition = "VARCHAR(255) NOT NULL")
	private String shadowUser;

	@Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp shadowTime;
	
	//SHADOW END

	//DEFAULT START
	
	@Column(columnDefinition = "TIMESTAMP NULL DEFAULT NULL")
	private Timestamp logTime;
	
	@Column(columnDefinition = "VARCHAR(255) NOT NULL")
	private String logUser;

	//DEFAULT START

	@Column(name = "SUPPLIER_ID",columnDefinition = "BIGINT(20)")
	private long supplierId;

	@Column(name = "SUPPLIER_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String supplierCode;

	@Column(name = "SUPPLIER_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String supplierDescription;

	public SupplierShadow() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShadowUser() {
		return shadowUser;
	}

	public void setShadowUser(String shadowUser) {
		this.shadowUser = shadowUser;
	}

	public Timestamp getShadowTime() {
		return shadowTime;
	}

	public void setShadowTime(Timestamp shadowTime) {
		this.shadowTime = shadowTime;
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

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierDescription() {
		return supplierDescription;
	}

	public void setSupplierDescription(String supplierDescription) {
		this.supplierDescription = supplierDescription;
	}


}

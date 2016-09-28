package ebear.co.za.spring.io.rest.crud.demo.model.supplier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.crud.demo.model.base.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.model.base.LogRecord;

@Entity
@Table(name = "SUPPLIER", uniqueConstraints=@UniqueConstraint(columnNames={"SUPPLIER_CODE"}))
public class Supplier extends LogModel {

	@Id
    @Column(name = "SUPPLIER_ID")
    @GeneratedValue
    private long id;

	@Column(name = "SUPPLIER_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String supplierCode;

	@Column(name = "DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String description;
	
	public Supplier() {}

	public Supplier(LogRecord log, String supplierCode, String description) {
		super(log);
		this.supplierCode = supplierCode;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

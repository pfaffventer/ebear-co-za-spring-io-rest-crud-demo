package ebear.co.za.spring.io.rest.crud.demo.supplier.model;

import java.sql.Timestamp;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * - NOTE:
 * - remove unique constraint
 * - remove constructor (note: keep default)
 * - add default constructor
 * - remove primary key from "_ID" & rename id = _id
 * - change create time to @Column(columnDefinition = "TIMESTAMP NULL DEFAULT NULL")
 * - recreate getters and setters
 */

@Entity
@Table(name = "SUPPLIER_TRACE")
public class SupplierTrace {

	/*
	 * Trace entity columns
	 */

	@Id
    @Column(name = "TRACE_ID")
    @GeneratedValue
    private long id;

	@Column(name = "TRACE_USER",columnDefinition = "VARCHAR(255) NOT NULL")
	private String traceUser;

	@Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp traceTime;

	@Column(name = "TRACE_ACTION",columnDefinition = "VARCHAR(10) NOT NULL")
	private String traceAction;

	/*
	 * Default columns (LogModel.java)
	 */

	@Column(columnDefinition = "TIMESTAMP NULL DEFAULT NULL")
	private Timestamp createTime;
	
	@Column(columnDefinition = "VARCHAR(255) NOT NULL")
	private String createUser;

	/*
	 * Entity columns
	 */

    @Column(name = "SUPPLIER_ID")
    private long supplier_id;

	@Column(name = "SUPPLIER_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String supplierCode;

	@Column(name = "SUPPLIER_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String supplierDescription;

	public SupplierTrace() {}

	/*
	 * constructor to create trace from entity
	 */
	public SupplierTrace(String traceUser,String traceAction, Supplier supplier) {
		this.traceUser = traceUser;
		this.traceAction = traceAction;
		this.createUser = supplier.getCreateUser();
		this.createTime = supplier.getCreateTime();
		this.supplier_id = supplier.getId();
		this.supplierCode = supplier.getSupplierCode();
		this.supplierDescription  = supplier.getSupplierDescription();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTraceUser() {
		return traceUser;
	}

	public void setTraceUser(String traceUser) {
		this.traceUser = traceUser;
	}

	public Timestamp getTraceTime() {
		return traceTime;
	}

	public void setTraceTime(Timestamp traceTime) {
		this.traceTime = traceTime;
	}

	public String getTraceAction() {
		return traceAction;
	}

	public void setTraceAction(String traceAction) {
		this.traceAction = traceAction;
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

	public long getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(long supplier_id) {
		this.supplier_id = supplier_id;
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

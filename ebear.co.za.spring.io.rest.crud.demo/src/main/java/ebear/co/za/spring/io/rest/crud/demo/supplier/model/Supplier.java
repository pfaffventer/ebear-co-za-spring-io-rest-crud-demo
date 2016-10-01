package ebear.co.za.spring.io.rest.crud.demo.supplier.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;
import ebear.co.za.spring.io.rest.crud.demo.sipplier.item.model.SupplierItem;

@Entity
@Table(name = "SUPPLIER", uniqueConstraints=@UniqueConstraint(columnNames={"SUPPLIER_CODE"}))
public class Supplier extends LogModel {

	@Id
    @Column(name = "SUPPLIER_ID")
    @GeneratedValue
    private long id;

	@Column(name = "SUPPLIER_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String supplierCode;

	@Column(name = "SUPPLIER_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String supplierDescription;

	public Supplier() {}
	
	@OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
	private Set<SupplierItem> tradeItems;

	public Supplier(LogRecord log, String supplierCode, String supplierDescription) {
		super(log);
		this.supplierCode = supplierCode;
		this.supplierDescription = supplierDescription;
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

	public String getSupplierDescription() {
		return supplierDescription;
	}

	public void setSupplierDescription(String supplierDescription) {
		this.supplierDescription = supplierDescription;
	}

	public Set<SupplierItem> getTradeItems() {
		return tradeItems;
	}

	public void setTradeItems(Set<SupplierItem> tradeItems) {
		this.tradeItems = tradeItems;
	}

}

package ebear.co.za.spring.io.rest.crud.demo.supplier.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;

@Entity
@Table(name = "SUPPLIER", uniqueConstraints=@UniqueConstraint(columnNames={"CODE"}))
public class Supplier extends LogModel {

	@Id
    @Column(name = "SUPPLIER_ID")
    @GeneratedValue
    private long id;

	public Supplier() {}

	public Supplier(LogRecord log) {
		super(log);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

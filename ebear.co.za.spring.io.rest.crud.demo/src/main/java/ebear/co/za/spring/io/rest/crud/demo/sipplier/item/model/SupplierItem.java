package ebear.co.za.spring.io.rest.crud.demo.sipplier.item.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;
import ebear.co.za.spring.io.rest.crud.demo.supplier.model.Supplier;
import ebear.co.za.spring.io.rest.crud.demo.trade.item.model.TradeItem;

@Entity
@Table(name = "SUPPLIER_ITEM")
public class SupplierItem  extends LogModel {

	@Id
    @Column(name = "SUPPLIER_ITEM_ID")
    @GeneratedValue
    private long id;
	
	@ManyToOne
	@JoinColumn(name = "SUPPLIER_ID")
    private Supplier supplier;

	@ManyToOne
	@JoinColumn(name = "ITEM_ID")
    private TradeItem tradeItem;

	public SupplierItem() {}

	public SupplierItem(LogRecord log, Supplier supplier, TradeItem tradeItem) {
		super(log);
		this.supplier = supplier;
		this.tradeItem = tradeItem;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public TradeItem getTradeItem() {
		return tradeItem;
	}

	public void setTradeItem(TradeItem tradeItem) {
		this.tradeItem = tradeItem;
	}

}

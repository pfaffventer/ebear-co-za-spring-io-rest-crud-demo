package ebear.co.za.spring.io.rest.crud.demo.trade.item.model;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;

@Entity
@Table(name = "TRADE_ITEM", uniqueConstraints=@UniqueConstraint(columnNames={"ITEM_CODE"}))
public class TradeItem extends LogModel {

	@Id
    @Column(name = "ITEM_ID")
    @GeneratedValue
    private long id;

	@Column(name = "ITEM_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String itemCode;

	@Column(name = "ITEM_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String itemDescription;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	private TradeItemCategory tradeItemCategory;
	
	public TradeItem() {}

	public TradeItem(LogRecord log, String itemCode, String itemDescription, TradeItemCategory tradeItemCategory) {
		super(log);
		this.itemCode = itemCode;
		this.itemDescription = itemDescription;
		this.tradeItemCategory = tradeItemCategory;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public TradeItemCategory getTradeItemCategory() {
		return tradeItemCategory;
	}

	public void setTradeItemCategory(TradeItemCategory tradeItemCategory) {
		this.tradeItemCategory = tradeItemCategory;
	}

}

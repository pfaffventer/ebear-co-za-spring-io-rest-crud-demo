package ebear.co.za.spring.io.rest.crud.demo.model.trade.item;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.crud.demo.model.base.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.model.base.LogRecord;

@Entity
@Table(name = "TRADE_ITEM", uniqueConstraints=@UniqueConstraint(columnNames={"CODE"}))
public class TradeItem extends LogModel {

	@Id
    @Column(name = "ITEM_ID")
    @GeneratedValue
    private long id;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	private TradeItemCategory tradeItemCategory;
	
	public TradeItem() {}

	public TradeItem(LogRecord log, TradeItemCategory tradeItemCategory) {
		super(log);
		this.tradeItemCategory = tradeItemCategory;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TradeItemCategory getTradeItemCategory() {
		return tradeItemCategory;
	}

	public void setTradeItemCategory(TradeItemCategory tradeItemCategory) {
		this.tradeItemCategory = tradeItemCategory;
	}

	
	
}

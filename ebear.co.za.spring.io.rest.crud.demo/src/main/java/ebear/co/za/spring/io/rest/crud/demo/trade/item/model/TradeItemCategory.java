package ebear.co.za.spring.io.rest.crud.demo.trade.item.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ebear.co.za.spring.io.rest.crud.demo.model.base.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.model.base.LogRecord;

@Entity
@Table(name = "TRADE_ITEM_CATEGORY", uniqueConstraints=@UniqueConstraint(columnNames={"CODE"}))
public class TradeItemCategory extends LogModel {

	@Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue
    private long id;

	@OneToMany(mappedBy = "tradeItemCategory", cascade = CascadeType.ALL)
	private Set<TradeItem> tradeItems;
	
	public TradeItemCategory() {}

	public TradeItemCategory(LogRecord log) {
		super(log);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<TradeItem> getTradeItems() {
		return tradeItems;
	}

	public void setTradeItems(Set<TradeItem> tradeItems) {
		this.tradeItems = tradeItems;
	}

}

package ebear.co.za.spring.io.rest.crud.demo.model.trade.item;

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
@Table(name = "TRADE_ITEM_CATEGORY", uniqueConstraints=@UniqueConstraint(columnNames={"CATEGORY_CODE"}))
public class TradeItemCategory extends LogModel {

	@Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue
    private long id;

	@Column(name = "CATEGORY_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String categoryCode;

	@Column(name = "DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String description;

	@OneToMany(mappedBy = "tradeItemCategory", cascade = CascadeType.ALL)
	private Set<TradeItem> tradeItems;
	
	public TradeItemCategory() {}

	public TradeItemCategory(LogRecord log, String categoryCode, String description) {
		super(log);
		this.categoryCode = categoryCode;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<TradeItem> getTradeItems() {
		return tradeItems;
	}

	public void setTradeItems(Set<TradeItem> tradeItems) {
		this.tradeItems = tradeItems;
	}

}

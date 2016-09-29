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

import ebear.co.za.spring.io.rest.crud.demo.base.model.LogModel;
import ebear.co.za.spring.io.rest.crud.demo.base.model.LogRecord;

@Entity
@Table(name = "TRADE_ITEM_CATEGORY", uniqueConstraints=@UniqueConstraint(columnNames={"CATEGORY_CODE"}))
public class TradeItemCategory extends LogModel {

	@Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue
    private long id;

	@Column(name = "CATEGORY_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String categoryCode;

	@Column(name = "CATEGORY_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String categoryDescription;

	
	@OneToMany(mappedBy = "tradeItemCategory", cascade = CascadeType.ALL)
	private Set<TradeItem> tradeItems;
	
	public TradeItemCategory() {}

	public TradeItemCategory(LogRecord logRecord, String categoryCode, String categoryDescription) {
		super(logRecord);
		this.categoryCode = categoryCode;
		this.categoryDescription = categoryDescription;
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

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public Set<TradeItem> getTradeItems() {
		return tradeItems;
	}

	public void setTradeItems(Set<TradeItem> tradeItems) {
		this.tradeItems = tradeItems;
	}

}

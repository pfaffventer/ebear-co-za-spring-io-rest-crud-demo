package ebear.co.za.spring.io.rest.crud.demo.trade.item.model;

import java.sql.Timestamp;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TRADE_ITEM_SHADOW")
public class TradeItemShadow {

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

	@Column(name = "ITEM_ID")
    private long item_id;

	@Column(name = "ITEM_CODE",columnDefinition = "VARCHAR(50) NOT NULL")
	private String itemCode;

	@Column(name = "ITEM_DESCRIPTION",columnDefinition = "VARCHAR(255) NOT NULL")
	private String itemDescription;

	@JoinColumn(name = "CATEGORY_ID")
	 private long categoryId;

	public TradeItemShadow() {}

	/*
	 * constructor to create trace from entity
	 */
	public TradeItemShadow(String traceUser,String traceAction, TradeItem tradeItem) {
		this.traceUser = traceUser;
		this.traceAction = traceAction;
		this.createUser = tradeItem.getCreateUser();
		this.createTime = tradeItem.getCreateTime();
		this.item_id = tradeItem.getId();
		this.itemCode = tradeItem.getItemCode();
		this.itemDescription  = tradeItem.getItemDescription();
		this.categoryId  = tradeItem.getTradeItemCategory().getId();
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

	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
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

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

}

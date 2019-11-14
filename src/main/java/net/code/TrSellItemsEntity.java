package net.code;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tr_sell_items")
public class TrSellItemsEntity {

    @Id
    @Column(name="sell_items_num")
	private int sellItemsNum;

    @Column(name="sell_items_category")
	private int sellItemsCategory;

    @Column(name="sell_items_price")
	private int sellItemsPrice;

    @Column(name="sell_items_name")
	private String sellItemsName;

    @Column(name="sell_items_image_file_name1")
	private String sellItemsImageFileName1;

    @Column(name="sell_items_image_file_name2")
	private String sellItemsImageFileName2;

    @Column(name="sell_items_image_file_name3")
	private String sellItemsImageFileName3;

    @Column(name="sell_items_image_file_name4")
	private String sellItemsImageFileName4;

    @Column(name="sell_items_description")
	private String sellItemsDescription;

    @Column(name="show_flag")
	private int showFlag;

    @Column(name="insert_date")
	private Timestamp insertDate;

    @Column(name="update_date")
	private Timestamp updateDate;

    @Column(name="delete_date")
	private Timestamp deleteDate;

	public int getSellItemsNum() {
		return sellItemsNum;
	}

	public void setSellItemsNum(int sellItemsNum) {
		this.sellItemsNum = sellItemsNum;
	}

	public int getSellItemsCategory() {
		return sellItemsCategory;
	}

	public void setSellItemsCategory(int sellItemsCategory) {
		this.sellItemsCategory = sellItemsCategory;
	}

	public int getSellItemsPrice() {
		return sellItemsPrice;
	}

	public void setSellItemsPrice(int sellItemsPrice) {
		this.sellItemsPrice = sellItemsPrice;
	}

	public String getSellItemsName() {
		return sellItemsName;
	}

	public void setSellItemsName(String sellItemsName) {
		this.sellItemsName = sellItemsName;
	}

	public String getSellItemsImageFileName1() {
		return sellItemsImageFileName1;
	}

	public void setSellItemsImageFileName1(String sellItemsImageFileName1) {
		this.sellItemsImageFileName1 = sellItemsImageFileName1;
	}

	public String getSellItemsImageFileName2() {
		return sellItemsImageFileName2;
	}

	public void setSellItemsImageFileName2(String sellItemsImageFileName2) {
		this.sellItemsImageFileName2 = sellItemsImageFileName2;
	}

	public String getSellItemsImageFileName3() {
		return sellItemsImageFileName3;
	}

	public void setSellItemsImageFileName3(String sellItemsImageFileName3) {
		this.sellItemsImageFileName3 = sellItemsImageFileName3;
	}

	public String getSellItemsImageFileName4() {
		return sellItemsImageFileName4;
	}

	public void setSellItemsImageFileName4(String sellItemsImageFileName4) {
		this.sellItemsImageFileName4 = sellItemsImageFileName4;
	}

	public String getSellItemsDescription() {
		return sellItemsDescription;
	}

	public void setSellItemsDescription(String sellItemsDescription) {
		this.sellItemsDescription = sellItemsDescription;
	}

	public int getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(int showFlag) {
		this.showFlag = showFlag;
	}

	public Timestamp getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public Timestamp getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}
}
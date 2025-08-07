package com.example.dto;

import java.math.BigDecimal;

public class InventoryDTO {
    private int id;
    private String code;
    private String description;
    private String details;
    private Integer inStock;
    private String typeName;
    private String supplierName;
    private BigDecimal rateValue;
    private Boolean isHardware;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Integer getInStock() {
		return inStock;
	}
	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public BigDecimal getRateValue() {
		return rateValue;
	}
	public void setRateValue(BigDecimal rateValue) {
		this.rateValue = rateValue;
	}
	public Boolean getIsHardware() {
		return isHardware;
	}
	public void setIsHardware(Boolean isHardware) {
		this.isHardware = isHardware;
	}

   
}

package com.project.dto;

public class ProductSearchByRoleAdminDto {
    private String productName;
    private String categoryName;
    private String sellerName;
    private Double minPrice;
    private Double maxPrice;
    private String auctionStatusName;

    public ProductSearchByRoleAdminDto() {
    }

    public ProductSearchByRoleAdminDto(String productName, String categoryName, String sellerName, Double minPrice, Double maxPrice, String auctionStatusName) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.sellerName = sellerName;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.auctionStatusName = auctionStatusName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getAuctionStatusName() {
        return auctionStatusName;
    }

    public void setAuctionStatusName(String auctionStatusName) {
        this.auctionStatusName = auctionStatusName;
    }
}

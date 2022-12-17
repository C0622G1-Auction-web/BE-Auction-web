package com.project.dto.product;
<<<<<<< HEAD
=======

import com.project.model.auction.Auction;
import com.project.model.product.*;
import com.project.model.users.User;

import java.util.Set;
>>>>>>> d9627a690292327b68a518cbd50cd346503713c6

import com.project.dto.user.UserDto;
import com.project.model.auction.Auction;
import com.project.model.product.*;
import com.project.model.users.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class ProductDto implements Validator {
    private int id;
    private String fullName;
    private Double maxCurrentPrice;

    @NotNull(message = "Name of product not null")
    @NotBlank(message = "Please input Name of Product")
    private String name;

    @NotNull(message = "Description of product not null")
    @NotBlank(message = "Please input Description of Product")
    private String description;

    @NotNull(message = "Initial Price of product not null")
    @NotBlank(message = "Please input initial Price of Product")
    private Double initialPrice;

    @NotNull(message = "Start Time of product not null")
    @NotBlank(message = "Please input start time to auction Product")
    private String startTime;

    @NotNull(message = "End Time of product not null")
    @NotBlank(message = "Please input end time to auction Product")
    private String endTime;

    @NotBlank(message = "Please input step price to auction Product")
    private PriceStepDto priceStepDto;

    @NotBlank(message = "Please select options category to auction Product")
    private CategoryDto categoryDto;

    private UserDto userDto;

<<<<<<< HEAD
=======

>>>>>>> d9627a690292327b68a518cbd50cd346503713c6
    private Boolean deleteStatus;
    private String registerDay;
    private PriceStep priceStep;
    private ReviewStatus reviewStatus;
    private AuctionStatus auctionStatus;
    private Category category;
    private Set<ImgUrlProduct> imgUrlProducts;
    private Set<Auction> auctions;
    private User user;

    public ProductDto() {
    }

    public ProductDto(int id, String name, String description, Double initialPrice, String startTime, String endTime, PriceStepDto priceStepDto, CategoryDto categoryDto, UserDto userDto) {

        this.description = description;
        this.initialPrice = initialPrice;
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(Double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    public void setPriceStep(PriceStepDto priceStepDto) {
        this.priceStepDto = priceStepDto;
    }


    public void setCategory(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }


    public void setUser(UserDto userDto) {
        this.userDto = userDto;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductDto productDto = (ProductDto) target;

        if (!productDto.name.matches("[A-Za-z ]+")) {
            errors.rejectValue("name", "name.invalidFormat");
        }
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(String registerDay) {
        this.registerDay = registerDay;
    }

    public PriceStep getPriceStep() {
        return priceStep;
    }

    public void setPriceStep(PriceStep priceStep) {
        this.priceStep = priceStep;
    }

    public ReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(ReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public AuctionStatus getAuctionStatus() {
        return auctionStatus;
    }

    public void setAuctionStatus(AuctionStatus auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<ImgUrlProduct> getImgUrlProducts() {
        return imgUrlProducts;
    }

    public void setImgUrlProducts(Set<ImgUrlProduct> imgUrlProducts) {
        this.imgUrlProducts = imgUrlProducts;
    }

    public Set<Auction> getAuctions() {
        return auctions;
    }

    public void setAuctions(Set<Auction> auctions) {
        this.auctions = auctions;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public PriceStepDto getPriceStepDto() {
        return priceStepDto;
    }

    public void setPriceStepDto(PriceStepDto priceStepDto) {
        this.priceStepDto = priceStepDto;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public Double getMaxCurrentPrice() {
        return maxCurrentPrice;
    }

    public void setMaxCurrentPrice(Double maxCurrentPrice) {
        this.maxCurrentPrice = maxCurrentPrice;
    }
}

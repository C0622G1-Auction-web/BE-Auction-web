package com.project.dto.payment;

public interface IPaymentAddressDto {
    Integer getCode();

    String getFirstName();

    String getLastName();

    String getCity();

    String getDistrict();

    String getAddress();

    String getCountry();

    String getProductName();

    Double getProductPrice();

    String getDescription();

    Integer getProductId();
}

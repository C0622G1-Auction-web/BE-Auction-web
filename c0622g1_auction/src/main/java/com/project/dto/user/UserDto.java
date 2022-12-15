package com.project.dto.user;

<<<<<<< HEAD
=======
import com.project.dto.product.ProductDto;
import com.project.model.account.Account;
import com.project.model.auction.Auction;
import com.project.model.product.Product;
import com.project.model.users.Address;
>>>>>>> 14a5abf94087479d86462c46f3e7e5fff1310c4b
import com.project.model.users.UserType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

<<<<<<< HEAD
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class UserDto implements Validator {
    private Integer id;
    @NotEmpty(message = "Họ không được để trống")
    private String firstName;
    @NotEmpty(message = "Tên không được để trống")
    private String lastName;
    @NotEmpty(message = "Email không được để trống")
    private String email;
    @NotEmpty(message = "Số điện thoại không được để trống")
    private String phone;
    @NotNull(message = "Điểm cống hiến không được bỏ trống")
    @Min(value = 0, message = "Điểm cống hiến không được bé thua 0")
    @Max(value = 500, message = "Điểm cống hiến không được lớn hơn 500")
    private Double pointDedication;
    @NotEmpty(message = "Ngày sinh không được để trống")
    private String birthDay;
    @NotEmpty(message = "CMND không được để trống")
    private String idCard;
    @NotEmpty(message = "Avatar được để trống")
    private String avatar;
    @NotEmpty(message = "Địa chỉ được để trống")
    private String detailAddress;
    @NotEmpty(message = "Phường xã được để trống")
    private String town;
    @NotEmpty(message = "Quận huyên được để trống")
    private String district;
    @NotEmpty(message = "Tỉnh được để trống")
    private String city;
    @NotEmpty(message = "Đất nước được để trống")
    private String country;
    @NotEmpty(message = "Tên đăng nhập được để trống")
    private String username;
    @NotEmpty(message = "Mật khẩu được để trống")
    private String password;
    private List<String> emailList;
    private UserType userType;

    public UserDto() {
    }

=======
import java.util.Set;
import com.project.model.account.Account;
import com.project.model.users.Address;
public class UserDto implements Validator {


    private  AccountDto accountDto;
    private  AddressDto addressDto;
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Double pointDedication;
    private String birthDay;
    private String idCard;
    private String avatar;

    private Boolean deleteStatus;

    private Address address;

    private UserType userType;

    private Set<Auction> auctions;

    private Account account;

    private Set<ProductDto> productDtos;

    public UserDto() {
    }

    public UserDto(Integer id, String firstName, String lastName, String email, String phone, Double pointDedication, String birthDay, String idCard, String avatar, Boolean deleteStatus, Address address, UserType userType, Set<Auction> auctions, Account account, Set<ProductDto> productDtos) {
        this.id = id;
    }

    public UserDto(String firstName, String lastName, String email, String phone, Double pointDedication, String birthDay, String idCard, String avatar, AddressDto addressDto, AccountDto accountDto) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.pointDedication = pointDedication;
        this.birthDay = birthDay;
        this.idCard = idCard;
        this.avatar = avatar;
        this.deleteStatus = deleteStatus;
        this.address = address;
        this.userType = userType;
        this.auctions = auctions;
        this.account = account;
        this.productDtos = productDtos;
        this.addressDto = addressDto;
        this.accountDto = accountDto;
    }

>>>>>>> 14a5abf94087479d86462c46f3e7e5fff1310c4b
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getPointDedication() {
        return pointDedication;
    }

    public void setPointDedication(Double pointDedication) {
        this.pointDedication = pointDedication;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

<<<<<<< HEAD
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<String> emailList) {
        this.emailList = emailList;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
=======
    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
>>>>>>> 14a5abf94087479d86462c46f3e7e5fff1310c4b
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

<<<<<<< HEAD
=======
    public Set<Auction> getAuctions() {
        return auctions;
    }

    public void setAuctions(Set<Auction> auctions) {
        this.auctions = auctions;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<ProductDto> getProductDtos() {
        return productDtos;
    }

    public void setProductDtos(Set<ProductDto> productDtos) {
        this.productDtos = productDtos;
    }
>>>>>>> 14a5abf94087479d86462c46f3e7e5fff1310c4b

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

<<<<<<< HEAD

    /**
     * Create by: TruongLH
     * Date created: 13/12/2022
     * Function: to validate all field in user
     */
    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        if (userDto.getFirstName().equals("")) {
            errors.rejectValue("firstName", "firstName", "Họ không được bỏ trống");
        } else {
            if (!userDto.getFirstName().matches("^[a-zA-Z_ÀÁÂÃÈÉÊẾÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêếìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]{2,30}$")) {
                errors.rejectValue("firstName", "firstName", "Họ không đúng định dạng !");
            }
        }
        if (userDto.getLastName().equals("")) {
            errors.rejectValue("lastName", "lastName", "Tên không được bỏ trống");
        } else {
            if (!userDto.getLastName().matches("^[a-zA-Z_ÀÁÂÃÈÉÊẾÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêếìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]{2,30}$")) {
                errors.rejectValue("lastName", "lastName", "Tên không đúng định dạng !");
            }
        }
        for (String email : userDto.emailList) {
            if (email.equals(userDto.getEmail())) {
                errors.rejectValue("email", "email", "Email đã tồn tại");
            }
        }
        if (userDto.getEmail().equals("")) {
            errors.rejectValue("email", "email", "Email không được bỏ trông");
        } else {
            if (!userDto.getEmail().matches("^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
                errors.rejectValue("email", "email", "Email must be valid");
            }
        }
        if (userDto.getIdCard().equals("")) {
            errors.rejectValue("idCard", "idCard", "CMND không được bỏ trống");
        } else {
            if (!(userDto.getIdCard().matches("\\d{9}") ||
                    userDto.getIdCard().matches("\\d{12}"))) {
                errors.rejectValue("idCard", "idCard", "CMND chỉ có 9 số hoặc 12 số");
            }
        }
        if (userDto.getPhone().equals("")) {
            errors.rejectValue("phoneNumber", "phoneNumber", "Số điện thoại không được để trống");
        } else {
            if (!(userDto.getPhone().matches("[0][9][0]\\d{7}") ||
                    userDto.getPhone().matches("[0][9][1]\\d{7}") ||
                    userDto.getPhone().matches("[(][8][4][)][+][9][0]\\d{7}") ||
                    userDto.getPhone().matches("[(][8][4][)][+][9][1]\\d{7}"))) {
                errors.rejectValue("phone", "phone", "Số điện thoại có định dang  (090xxxxxxx) hoặc (091xxxxxxx) hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx");
            }
        }
        if (userDto.getAvatar().equals("")) {
            errors.rejectValue("avatar", "avatar", "Avatar không được để trống");
        }
        for (String username : userDto.emailList) {
            if (username.equals(userDto.getUsername())) {
                errors.rejectValue("username", "username", "Tên đăng nhập đã tồn tại đã tồn tại");
            }
        }
        if (userDto.getTown().equals("")) {
            errors.rejectValue("town", "town", "Phường xã không được để trống");
        } else {
            if (!(userDto.getTown().matches("\"^[a-zA-Z_ÀÁÂÃÈÉÊẾÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêếìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]{5,30}$"))) {
                errors.rejectValue("town", "town", "Phường xã nhập từ 5 tới 30 kí tự");
            }
        }
        if (userDto.getDistrict().equals("")) {
            errors.rejectValue("district", "district", "Quận huyện không được để trống");
        } else {
            if (!(userDto.getTown().matches("\"^[a-zA-Z_ÀÁÂÃÈÉÊẾÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêếìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]{5,30}$"))) {
                errors.rejectValue("district", "district", "Quận huyện nhập từ 5 tới 30 kí tự");
            }
        }
        if (userDto.getCity().equals("")) {
            errors.rejectValue("city", "city", "Tỉnh thành không được để trống");
        } else {
            if (!(userDto.getTown().matches("\"^[a-zA-Z_ÀÁÂÃÈÉÊẾÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêếìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]{5,30}$"))) {
                errors.rejectValue("city", "city", "Tỉnh thành nhập từ 5 tới 30 kí tự");
            }
        }
        if (userDto.getCountry().equals("")) {
            errors.rejectValue("country", "country", "Đất Nước không được để trống");
        } else {
            if (!(userDto.getTown().matches("\"^[a-zA-Z_ÀÁÂÃÈÉÊẾÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêếìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]{5,30}$"))) {
                errors.rejectValue("country", "country", "Quốc gia nhập từ 5 tới 30 kí tự");
            }
        }
=======
    @Override
    public void validate(Object target, Errors errors) {}

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public AccountDto getAccountDto() {
        return accountDto;
    }

    public void setAccountDto(AccountDto accountDto) {
        this.accountDto = accountDto;
>>>>>>> 14a5abf94087479d86462c46f3e7e5fff1310c4b
    }
}

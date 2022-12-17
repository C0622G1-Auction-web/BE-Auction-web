package com.project.service.users.impl;
<<<<<<< HEAD
import com.project.dto.user.UserTopDto;
import com.project.model.account.Account;
import com.project.model.users.User;
=======

import com.project.model.users.User;
import com.project.dto.user.UserTopDto;
import com.project.model.users.Address;
import com.project.model.account.Account;

>>>>>>> d3bd5434618c40e2cd8ecdf37cc9e5f5bb88fbdc
import com.project.repository.users.IUserRepository;
import com.project.service.users.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    /**
     * Create by: TruongLH
     * Date created: 13/12/2022
     * Function: to update user
     *
     * @param user
     * @return User
     */

    @Override
<<<<<<< HEAD
    public void updateUser(User user) {
        userRepository.updateUser(
                user.getAvatar(),
                user.getBirthDay(),
                user.getDeleteStatus(),
                user.getEmail(),
                user.getFirstName(),
                user.getIdCard(),
                user.getLastName(),
                user.getPhone(),
                user.getPointDedication(),
                user.getAccount(),
                user.getAddress(),
                user.getUserType(),
                user.getId());
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    /**
     * Create by: TruongLH
     * Date created: 13/12/2022
     * Function: to create user
     *
     * @param
     * @return User
     */


    public void saveUser(User user, Integer addressId, Integer accountId, Integer userType) {
=======


    public void saveUser(User user, Integer addressId, Integer accountId,Integer userType) {

>>>>>>> d3bd5434618c40e2cd8ecdf37cc9e5f5bb88fbdc
        userRepository.createUser(
                user.getAvatar(),
                user.getBirthDay(),
                user.getDeleteStatus(),
                user.getEmail(),
                user.getFirstName(),
                user.getIdCard(),
                user.getLastName(),
                user.getPhone(),
                user.getPointDedication(),
<<<<<<< HEAD
                user.getAccount(),
                user.getAddress(),
                user.getUserType());
=======
                accountId,
                addressId,
                userType);
>>>>>>> d3bd5434618c40e2cd8ecdf37cc9e5f5bb88fbdc
    }

    /**
     * Create by: TruongLH
     * Date created: 13/12/2022
     * Function: to find user by id
     *
     * @param id
     * @return User
     */

    @Override
    public Optional<User> findUserById(int id) {
        return userRepository.findUserById(id);
    }


    /**
     * Create by: HaiNT
     * Date created: 13/12/2022
     *
     * @param id
     * @param name
     * @param email
     * @param userTypeId
     * @param address
     * @return List of users by param
     */

    @Override
    public List<User> getUserBy(String id, String name, String email, String userTypeId, String address) {
        return userRepository.getUserBy(id, name, email, userTypeId, address);
    }


    /**
     * Create by: TruongLH
     * Date created: 13/12/2022
     * Function: to find all user list
     *
     * @return List<User>
     */

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }




    /**
     * Create by: HaiNT
     * Date created: 13/12/2022
     *
     * @param user
     */
    @Override
    public void updateAddress(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<Object> findById(int id) {
        return Optional.empty();
    }


    /**
     * Create by: HaiNT
     * Date created: 13/12/2022
     *
     * @param id
     * @return User object by id
     */

    @Override
    public List<User> findByIdList(List<Integer> id) {
        return userRepository.findUserByIdList(id);
    }


    /**
     * Create by: HaiNT
     * Date created: 13/12/2022
     *
     * @param idList
     */
    @Override
    public void unlockUser(List<Integer> idList) {
        userRepository.unlockAccount(idList);
    }

<<<<<<< HEAD
=======

>>>>>>> d3bd5434618c40e2cd8ecdf37cc9e5f5bb88fbdc
    /**
     * Created: SangDD
     * Created date: 13/12/2022
     * Function: get Top 10 users with the highest total money auction
     *
     * @param quality user quality
     * @return List<User>
     */

    @Override

    public List<UserTopDto> getTopAuctionUser(String quality) {

        return userRepository.getTopAuctionUser(quality);
    }

<<<<<<< HEAD
    /**
     * Created by UyenNC
     * Date created 13/12/2022
     * Function Find user by account
     *
     * @param account
     * @return User
     */

=======

    /**
     * Created by UyenNC
     * Date created 13/12/2022
     * Function Find user by account
     *
     * @param account
     * @return User
     */

>>>>>>> d3bd5434618c40e2cd8ecdf37cc9e5f5bb88fbdc
    @Override
    public User findUserByAccount(Account account) {
        String id = account.getId() + "";
        return userRepository.findUserByAccount(id);
    }

}

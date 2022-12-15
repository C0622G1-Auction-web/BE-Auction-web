package com.project.repository.account;

import com.project.model.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Modifying;
>>>>>>> 503fa03357badf99ebaebfdca637bc0cf1c5b5c5
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface IAccountRepository extends JpaRepository<Account, Integer> {
<<<<<<< HEAD
<<<<<<< HEAD
=======
    /**
     * Created by UyenNC
     * Date created: 13/12/2022
     * Function: Search account by  username
     *
     * @param username
     * @return Account
     */
    @Query(value = "select * from account " +
            "where account.username =:username " +
            "and delete_status = 0 " +
            "and status_lock = 0", nativeQuery = true)
    Account findAccountByUsername(@Param(value = "username") String username);

    /**
     * Created by UyenNC
     * Date created 13/12/2022
     * Function Find all valid account
     *
     * @return List<Account>
     */
    @Query(value = "select * from account " +
            "where delete_status = 0 " +
            "and status_lock = 0;", nativeQuery = true)
    List<Account> findAllAccount();

    /**Created by UyenNC
     * Date created 13/12/2022
     * Function Update password for account with given id
     *
     * @param accountId
     * @param password
     */
    @Query(value = "update `account` " +
            "set `password` =:password " +
            "where (`id` =:accountId );", nativeQuery = true)
    void updateAccount(@Param(value = "accountId") Integer accountId, @Param(value = "password") String password);

    /**Created by UyenNC
     * Date created 13/12/2022
     * Function Find account by given id
     * @param id
     * @return account
     */
    @Query(value = "select * from account " +
            "where id =:id " +
            "and delete_status = 0 " +
            "and status_lock = 0;", nativeQuery = true)
    Account findAccountById(@Param(value = "id") Integer id);
>>>>>>> 25b5aa6fad5671e6ad979ca4d7bde7f115716f31
=======


    @Query(
            value = " select * " +
                    " from account " +
                    " where username = :username ",
            nativeQuery = true
    )
    Account findAccountByUsername(@Param("username") String username);

    /**
     * Create by: TruongLH
     * Date created: 13/12/2022
     *
     * @param username,password
     * Function: to create account
     * @return Account
     */
    @Modifying
    @Query(value = "insert into " +
                     "account(username," +
                     "password," +
                     " values(:username," +
                     ":password)",
            nativeQuery = true)
    Account createAccount(@Param("username") String username,
                          @Param("password") String password);

    /**
     * Create by: TruongLH
     * Date created: 13/12/2022
     *
     * @param username,password Function: to update account
     * @return Account
     */
    @Modifying
    @Query(value = " update `account` " +
                    "set `username` = :username, " +
                       " `password` = :password",
            nativeQuery = true)
    Account updateAccount(@Param("username") String username,
                          @Param("password") String password);

=======
>>>>>>> 14a5abf94087479d86462c46f3e7e5fff1310c4b
>>>>>>> 503fa03357badf99ebaebfdca637bc0cf1c5b5c5
}

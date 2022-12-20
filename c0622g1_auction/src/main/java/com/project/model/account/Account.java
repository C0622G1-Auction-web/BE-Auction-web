package com.project.model.account;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.model.users.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;

    private String password;
    @Column(columnDefinition = "boolean default true")
    private Boolean statusLock;

    @Column(columnDefinition = "boolean default true")
    private Boolean deleteStatus;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "account")
    @JsonBackReference
    private Set<AccountRole> accountRoles;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "account")
    @JsonBackReference
    private Set<PasswordResetToken> passwordResetTokens;
    @OneToOne(mappedBy = "account")
    @JsonBackReference
    private User user;
    @OneToOne(mappedBy = "account")
    @JsonBackReference
    private LockAccount lockAccount;

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Boolean getStatusLock() {
        return statusLock;
    }

    public void setStatusLock(Boolean statusLock) {
        this.statusLock = statusLock;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Set<com.project.model.account.AccountRole> getAccountRoles() {
        return accountRoles;
    }

    public void setAccountRoles(Set<com.project.model.account.AccountRole> accountRoles) {
        this.accountRoles = accountRoles;
    }

    public Set<com.project.model.account.PasswordResetToken> getPasswordResetTokens() {
        return passwordResetTokens;
    }

    public void setPasswordResetTokens(Set<com.project.model.account.PasswordResetToken> passwordResetTokens) {
        this.passwordResetTokens = passwordResetTokens;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public com.project.model.account.LockAccount getLockAccount() {
        return lockAccount;
    }

    public void setLockAccount(com.project.model.account.LockAccount lockAccount) {
        this.lockAccount = lockAccount;
    }
}

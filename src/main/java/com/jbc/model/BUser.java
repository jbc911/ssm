package com.jbc.model;

public class BUser {
    private Integer userId;

    private String userName;

    private String userPassword;

    private Integer userLevel;

    private String userDes;

    private String userTel;

    private String userAddress;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserDes() {
        return userDes;
    }

    public void setUserDes(String userDes) {
        this.userDes = userDes == null ? null : userDes.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

	@Override
	public String toString() {
		return "BUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userLevel="
				+ userLevel + ", userDes=" + userDes + ", userTel=" + userTel + ", userAddress=" + userAddress + "]";
	}
    
}
package com.rafael.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
private UUID userProfileID;
private String username;
private String userProfileImageLink; //S3 key


    public UserProfile(UUID userProfileID, String username, String userProfileImageLink) {
        this.userProfileID = userProfileID;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileID() {
        return userProfileID;
    }

    public void setUserProfileID(UUID userProfileID) {
        this.userProfileID = userProfileID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileID, that.userProfileID) &&
                Objects.equals(username ,that.username) &&
                Objects.equals(userProfileImageLink,that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileID, username, userProfileImageLink);
    }
}

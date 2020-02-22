package com.logos.social_network.service;

import com.logos.social_network.entity.User;

import java.io.IOException;
import java.util.List;


public interface NetworkService {
    List<User> addToFriends(User user);
    void acceptFriend(User user);
    void addAvatar(String avararURL);
}

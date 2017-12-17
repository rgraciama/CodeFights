/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codefight.java.challenge;

/**
 *
 * @author Rulo
 */
public class BestFriendsNames {
boolean bestFriendNames(String n, String m){
    if (r(n)==r(m))return true;
    return false;
}
int r(String n){
    int r=0;
    for(char c:n.toLowerCase().toCharArray())if(c!=' ')r+=(int)c-96;
    return r;
}
}

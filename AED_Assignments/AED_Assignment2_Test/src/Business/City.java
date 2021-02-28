/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Urvi
 */
public class City {
    private ArrayList<Community> communityList;

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public City(){
        communityList = new ArrayList<>();
    }
    
    public Community addCommunity(Community community){
        communityList.add(community);
        return community;
    }
}

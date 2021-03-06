package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);

    Ad findById(long id);

    List<Ad> adsByUser(long Id);


   Ad editAdTitle(long id, String title);
    Ad editAdDescription(long id, String description);

    Ad deleteAd(long id);
    List<Ad> search(String query);

}

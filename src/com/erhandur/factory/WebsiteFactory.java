package com.erhandur.factory;

import com.erhandur.collection.Blog;
import com.erhandur.collection.Crud;
import com.erhandur.collection.Website;
import com.erhandur.typeofpage.WebsiteType;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch(siteType) {
            case CRUD : {
                return new Crud();
            }

            case BLOG : {
                return new Blog();
            }

            default : {
                return null;
            }
        }
    }
}

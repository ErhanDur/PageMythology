package com.erhandur.main;

import com.erhandur.collection.Website;
import com.erhandur.factory.WebsiteFactory;
import com.erhandur.typeofpage.WebsiteType;

public class Main {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.CRUD);

        System.out.println(site.getPages());
    }

}

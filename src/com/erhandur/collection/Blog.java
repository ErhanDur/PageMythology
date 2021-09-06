package com.erhandur.collection;

import com.erhandur.subclasses.*;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        getPages().add(new ItemPage());
        getPages().add(new PostPage());
    }
}

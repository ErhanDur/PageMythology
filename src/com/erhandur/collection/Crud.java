package com.erhandur.collection;

import com.erhandur.subclasses.CreatePage;
import com.erhandur.subclasses.DeletePage;
import com.erhandur.subclasses.ReadPage;
import com.erhandur.subclasses.UpdatePage;

public class Crud extends Website{
    @Override
    public void createWebsite() {
        getPages().add(new CreatePage());
        getPages().add(new ReadPage());
        getPages().add(new UpdatePage());
        getPages().add(new DeletePage());
    }

}

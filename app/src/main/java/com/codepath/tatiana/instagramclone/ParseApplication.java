package com.codepath.tatiana.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7E81rv1t3JlavVBE0C3x1P93q3Bv7GCFM4mzxhIY")
                .clientKey("HE2vYQs7Vkeq2jGtPeVtnPbV9DZF4iifwBzBdAAx")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

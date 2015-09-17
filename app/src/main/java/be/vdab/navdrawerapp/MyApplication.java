package be.vdab.navdrawerapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by jeansmits on 17/09/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "CZSKaFgv02Ilx3t9z5Kb6pQLX5NyaqztMxOODlTH", "GyCwlihNc2JrAPSyPQlmrchHBDLrHyg5n9lzZ388");
        ParseInstallation.getCurrentInstallation().saveInBackground();


    }
}

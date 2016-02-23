package com.prabhav.login;

/**
 * Created by Prabhav on 10-05-2015.
 */


        import android.app.Application;

        import com.parse.Parse;


public class SampleApplication extends Application {

    public void onCreate(){
        Parse.initialize(this, "8TUxv6ZFCPGeO4VPmptd5fpWMx9MlK29nTAonqq8", "dcPjNdMcUcJMz8H4y3YkzTIkUmfPFJ7sjIyOZiDm");
    }
}

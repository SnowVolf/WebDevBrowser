package org.softeg.morphinebrowser.pageviewcontrol;

import android.content.Context;

import org.softeg.morphinebrowser.controls.AppWebView;


/*
 * Created by slinkin on 02.10.2014.
 */
public interface IWebViewClientListener {
    void setSupportProgressBarIndeterminateVisibility(boolean b);



    Context getContext();

    AppWebView getWebView();
}

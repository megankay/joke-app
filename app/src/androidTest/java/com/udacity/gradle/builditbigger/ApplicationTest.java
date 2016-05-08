package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application>
        implements EndpointsAsyncTask.EndPointsAsyncTaskCallback {

    public ApplicationTest() {
        super(Application.class);
    }

    public void testJokeReceived() throws Throwable {
        new EndpointsAsyncTask().execute();
    }

    @Override
    public void onComplete(String result) {
        boolean stringNotNull = false;

        if(result != null) {
            stringNotNull = true;
        }
        assertEquals(true, stringNotNull);
    }
}
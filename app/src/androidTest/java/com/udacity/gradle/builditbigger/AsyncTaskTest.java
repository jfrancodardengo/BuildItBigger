package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by GUTO on 19/03/2018.
 */

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest extends AndroidTestCase implements TaskCompleted {

    @Test
    public void testDoInBackground() throws Exception{
        String joke;
        try {
            EndpointAsyncTask asyncTask = (EndpointAsyncTask) new EndpointAsyncTask(this).execute();
            joke = asyncTask.get(30, TimeUnit.SECONDS);
            assertThat(joke,notNullValue());
            assertTrue(joke.length() > 0);
        }catch (Exception e){
            fail("Timed Out.");
        }
    }

    @Override
    public void onTaskCompleted(String response) {

    }
}

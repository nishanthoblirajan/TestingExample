package com.zaptrapp.nishanth.testingexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Nishanth on 01-Oct-17.
 */


@RunWith(AndroidJUnit4.class)
public class MockitoInstrumentedTest {

    @Test
    public void shouldContainCorrectExtras() throws Exception{
        Context context = mock(Context.class);
        Intent intent = MainActivity.createQuery(context,"query","value");
        assertNotNull(intent);
        Bundle bundle = intent.getExtras();
        assertEquals("query",bundle.getString("QUERY"));
        assertEquals("value",bundle.getString("VALUE"));
    }

}

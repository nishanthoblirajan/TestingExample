package com.zaptrapp.nishanth.testingexample;

import android.content.Context;
import android.support.annotation.Keep;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Nishanth on 01-Oct-17.
 */

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
    private static final String FAKE_STRING = "HELLO WORLD";
    private static final String NEW_STRING = "NEW WORLD";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext(){
        MainActivity mainActivity = new MainActivity();
        when(mMockContext.getString(R.string.hello_world)).thenReturn(NEW_STRING);

        System.out.println(mMockContext.getString(R.string.hello_world));
        String result = mainActivity.getHelloWorldString();
        assertThat(result, is(FAKE_STRING));
        System.out.println(FAKE_STRING);
    }

    @Mock
    SimpleMath simpleMath = new SimpleMath();

    @Test
    public void add() throws Exception {
        int sum = simpleMath.add(1,2);
        int sum2 = simpleMath.add(2,2);
        when(simpleMath.add(1,2)).thenReturn(3);
        when(simpleMath.add(2,2)).thenReturn(4);
        //The below code will result in an error because the @Mock MockObject doesn't know what to return
        //KEEP IN MIND: If you remove the @Mock then only the below two lines will work properly
        assertEquals(sum,3);
        assertEquals(sum2,4);
        //Check if the sample method was called
        verify(simpleMath).add(2,2);
        verify(simpleMath).add(1,2);
        verify(simpleMath).add(1,2);
    }


    //spy test
    @Test
    public void TestSpyList(){
        List<String> list = new LinkedList<>();
        List<String> spy = spy(list);

//        when(spy.get(0)).thenReturn("foo");
//        assertEquals("foo", spy.get(0));
        doReturn("foo").when(spy).get(0);
        assertEquals("foo", spy.get(0));
    }
}

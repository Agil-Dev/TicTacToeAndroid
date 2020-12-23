package com.example.tictactoeandroid;

import android.support.v4.app.INotificationSideChannel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FieldTest {
    @Test
    public void testGetFieldsByValue() {
        assertEquals(Field.Empty,  Field.byValue(-1));
        assertEquals(Field.Circle, Field.byValue(0));
        assertEquals(Field.Cross,  Field.byValue(1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testTryGetFieldsByWrongValue() {
        Field.byValue(Integer.MAX_VALUE);
    }
}

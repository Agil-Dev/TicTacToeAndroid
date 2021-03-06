package com.tictactoeandroid.activities.listener;

import android.view.View;

import com.tictactoeandroid.activities.GameActivity;

public class FieldOnClickListenerBuilder {
    public View.OnClickListener build(int x, int y, GameActivity game) {
        return (View v) -> game.play(x, y);
    }
}

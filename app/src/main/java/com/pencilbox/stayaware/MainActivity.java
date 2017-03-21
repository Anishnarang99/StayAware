package com.pencilbox.stayaware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;


import com.wenchao.cardstack.CardStack;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;




public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {

    private CardStack card_stack;
    private CardAdapter card_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImages();

        card_stack = (CardStack) findViewById(R.id.card_stack);
        card_stack.setContentResource(R.layout.card_layout);
        card_stack.setStackMargin(20);
        card_stack.setAdapter(card_adapter);

        card_stack.setListener(this);


    }

    private void initImages() {
        card_adapter = new CardAdapter(getApplicationContext(), 0);
        card_adapter.add(R.drawable.image1);
        card_adapter.add(R.drawable.image2);

    }

    @Override

    public boolean swipeEnd(int i, float v)

    {
        return (v > 300) ? true : false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }

}






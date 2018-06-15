package com.example.arnold.myapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.arnold.MyApp.R;

public class FirstActivity extends Activity {
    static final int PICK_CONTACT_REQUEST=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    public void showCapricciosa(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("position", 0);
        startActivity(intent);
    }
    public void showHamburger(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("position", 1);
        startActivity(intent);
    }
    public void showFishnChips(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("position", 2);
        startActivity(intent);
    }
}

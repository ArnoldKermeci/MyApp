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
    private int a;
    private float b;
    private String c;
    private int[] d = {0, 1, 2, 3, 4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            this.a = savedInstanceState.getInt("a");
            this.b = savedInstanceState.getFloat("b");
            this.c = savedInstanceState.getString("c");
            this.d = savedInstanceState.getIntArray("d");
        }
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
        savedInstanceState.putInt("a", a);
        savedInstanceState.putFloat("b", b);
        savedInstanceState.putString("c", c);
        savedInstanceState.putIntArray("d", d);
    }
    public void btnStartActivityClicked(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }
    public void btnSelectContactClicked(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
        intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        startActivityForResult(intent, PICK_CONTACT_REQUEST);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_CONTACT_REQUEST) {
            if (resultCode == RESULT_OK) {
                Uri contactUri = data.getData();
                Toast.makeText(this, "Contact URI: " + contactUri, Toast.LENGTH_SHORT).show();
            }
        }
    }
}

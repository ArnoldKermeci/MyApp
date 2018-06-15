package com.example.arnold.myapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arnold.MyApp.R;
import com.example.arnold.myapp.model.Food;

import java.io.IOException;
import java.io.InputStream;

import static com.example.arnold.myapp.activities.FirstActivity.PICK_CONTACT_REQUEST;

public class SecondActivity extends Activity {
    private int position = 0;

    private Food[] foods = new Food[]{
            new Food("capricciosa.jpg", "Pizza", "Pizza Capricciosa", "Pizza", "Pizza ingredients", "500", 4.0f),
            new Food("hamburger.jpg", "Hamburger", "A Burger in a bun", "Hamburger", "Meat and bun", "450", 5.0f),
            new Food("fishnchips.jpg", "Fish and Chips", "Deep fried fish and fried potato", "Fishfood", "Fish and potato", "300", 3.5f)
    };
    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final int position = getIntent().getIntExtra("position", 0);
        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(foods[position].getName());

        TextView tvDescription = (TextView) findViewById(R.id.tv_description);
        tvDescription.setText(foods[position].getDescription());

        TextView tvIngredients = (TextView) findViewById(R.id.tv_ingredients);
        tvIngredients.setText(foods[position].getIngredients());

        TextView tvCalories = (TextView) findViewById(R.id.tv_calories);
        tvCalories.setText(foods[position].getCalories());

        RatingBar rbRating = (RatingBar) findViewById(R.id.rb_rating);
        rbRating.setRating(foods[position].getRating());

        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;

        try {
            is = getAssets().open(foods[position].getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Button btnBuy = (Button) findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "You've bought " + foods[position].getName() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
    @Override
    protected void onStart() { super.onStart();    }
    @Override
    protected void onRestart() { super.onRestart();    }
    @Override
    protected void onResume() { super.onResume();    }
    @Override
    protected void onPause() { super.onPause();    }
    @Override
    protected void onStop() { super.onStop();    }
    @Override
    protected void onDestroy() { super.onDestroy();    }
}
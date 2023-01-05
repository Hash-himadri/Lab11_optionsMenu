package com.himadri_parikh.lab11_optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = findViewById(R.id.myLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_options_menu, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menubg1:
                myLayout.setBackgroundResource(R.drawable.cat);
                return true;
            case R.id.menubg2:
                myLayout.setBackgroundResource(R.drawable.download);
                return true;
            case R.id.menuMore:
                Toast.makeText(this, "More Options", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuBlue:
                myLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.menuBrown:
                myLayout.setBackgroundColor(Color.BLACK);
                return true;
            case R.id.menuMagenta:
                myLayout.setBackgroundColor(Color.MAGENTA);
                return true;

            case R.id.menuRed:
                myLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuYellow:
                myLayout.setBackgroundColor(Color.YELLOW);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
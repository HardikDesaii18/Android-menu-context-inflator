package com.example.hardikdesaii.menuinflatercontextinflaterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    b1=(Button)findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
        b1.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(1,101,10,"Menu 1");
        menu.add(1,102,20,"Menu 2");
        menu.add(1,103,30,"Menu 3");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == 101) {
            Toast.makeText(MainActivity.this, "Menu 1", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == 102) {
            Toast.makeText(MainActivity.this, "Menu 2", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == 103) {
            Toast.makeText(MainActivity.this, "Menu 3", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            Toast.makeText(MainActivity.this, "Done as favourite", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menu2) {
            Toast.makeText(MainActivity.this, "Zooming in", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menu3) {
            Toast.makeText(MainActivity.this, "zooming out", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

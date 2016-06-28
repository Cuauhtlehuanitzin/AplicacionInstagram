package com.anncode.aplicacioncontactos.Activities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.anncode.aplicacioncontactos.adapter.PageAdapter;
import com.anncode.aplicacioncontactos.vista.fragment.PerfilFragment;
import com.anncode.aplicacioncontactos.vista.fragment.RecyclerViewFragment;
import com.anncode.recyclerviewfragments.R;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String KEY_EXTRA_NAME = "name";
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mAbout:
                Intent intent = new Intent(this, ActivityAbout.class);
                startActivity(intent);
                break;

            case R.id.mSettings:
                Intent intent2 = new Intent(this, ActivitySettings.class);
                startActivity(intent2);
                break;

            case R.id.mConfig:
                Intent intent3 = new Intent(this, ActivityConfigurarCuenta.class);
                startActivity(intent3);
                break;

        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        Log.e("MainActivity", "onCreate");
        setUpViewPager();


        if (toolbar != null){
            setSupportActionBar(toolbar);
        }



    }

    private ArrayList<Fragment> agregarFragments(){
        Log.e("MainActivity", "agregarFragments");
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_contacts);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_name);
    }


}

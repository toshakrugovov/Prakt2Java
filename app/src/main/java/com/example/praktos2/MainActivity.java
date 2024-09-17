package com.example.praktos2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<State> states = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAddapter addapter = new RecyclerAddapter(this, states);
        recyclerView.setAdapter(addapter);
    }

    private void setInitialData() {
        states.add(new State("Такса", "Порода", R.drawable.taksa, "Сосиска"));
        states.add(new State("Джек Рассел", "Порода", R.drawable.dzhekrassel11, "Топ"));
        states.add(new State("Мопс", "Порода", R.drawable.mops, "Храпун"));
    }

}

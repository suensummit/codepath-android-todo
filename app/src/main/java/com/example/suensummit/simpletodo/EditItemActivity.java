package com.example.suensummit.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        EditText itemEdit = (EditText) findViewById(R.id.etEditItem);
        itemEdit.setText(getIntent().getStringExtra("itemEdit"));
    }

    public void onEditItem(View v) {
        EditText etEditItem = (EditText) findViewById(R.id.etEditItem);
        Intent data = new Intent();
        data.putExtra("itemEdit", etEditItem.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}

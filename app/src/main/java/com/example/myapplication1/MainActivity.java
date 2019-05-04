package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AlertDialogLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText name;
    EditText password;
    Button b1;
    Intent i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ranaahmad();
    }
    public void ranaahmad()
    {
        name= (EditText) findViewById(R.id.ed1);
        password=(EditText) findViewById(R.id.ed2);
        b1=(Button) findViewById(R.id.b11);
    }
public void ahmad(View V)
{
    String text=name.getText().toString();
    String pass=password.getText().toString();
    /*
    if(text.equals("Rana")&&pass.equals("123"))
    {
*/

i=new Intent(V.getContext(),SecondActivity.class);
    i.putExtra("myuser",text);
    i.putExtra("pass",pass);
startActivity(i);

/*
}
    else
    {
        showInvalidUserDialog();
    }
*/
}
/*
    public void showInvalidUserDialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Error Login");

        builder.setMessage("Invalid UserName or Password!");
        builder.setPositiveButton("OK", null);

        AlertDialog dialog=builder.create();
        dialog.show();

    }
    */

}

package com.taxue.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textName;
    private TextView textPosition;
    private TextView textCompany;
    private TextView textOther;
    public String name = "李沁联";
    public String company = "浙江大学";
    public String address = "杭州市西湖区浙大路38号";
    public String position = "本科在读";
    public String email = "taxuezju18@gmail.com";
    public String telephone = "18868102293";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image);
        textName = (TextView) findViewById(R.id.name);
        textCompany = (TextView) findViewById(R.id.company);
        textPosition = (TextView) findViewById(R.id.position);
        textOther = (TextView) findViewById(R.id.otherinfo);

        textName.setText(name);
        textPosition.setText(position+"  ");
        textCompany.setText(company);
        textOther.setText(address+"\n"+"E-mail : "+email+"\n"+"Tele : "+telephone);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

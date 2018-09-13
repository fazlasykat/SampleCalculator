package com.example.laptop.samplecalculator;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Developar extends AppCompatActivity {

    private ImageButton facebookButton,twitterButton,linkedinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_developar );

        facebookButton = findViewById(R.id.facebookButtonId);
        twitterButton = findViewById(R.id.twitterButtonId);
        linkedinButton = findViewById(R.id.linkedidButtonId);



        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData( Uri.parse("https://www.facebook.com/profile.php?id=100003601384024"));
                startActivity(intent);

            }
        });


        twitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com"));
                startActivity(intent);

            }
        });

        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com"));
                startActivity(intent);

            }
        });

    }
}

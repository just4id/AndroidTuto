package com.airtoy.android;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;

public class HelloActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
//        Intent dialInt = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:13564667450"));
        Intent dialInt = new Intent(Intent.ACTION_CALL, Uri.parse("tel:13564667450"));
        dialInt.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(dialInt);
    }
}
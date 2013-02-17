package com.airtoy.android.tuto;

import com.airtoy.android.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class CallActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /**
         */
        Intent dialInt = new Intent(Intent.ACTION_CALL, Uri.parse("tel:15907437491"));
        dialInt.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(dialInt);
    }
}

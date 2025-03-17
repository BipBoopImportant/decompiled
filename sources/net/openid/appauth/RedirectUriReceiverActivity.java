package net.openid.appauth;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class RedirectUriReceiverActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(AuthorizationManagementActivity.x(this, getIntent().getData()));
        finish();
    }
}

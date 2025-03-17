package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import nts.C3727;
import nts.C3730;
import nts.C3734;
import nts.C4158;

public class ClientOutOfBandChallengeListener extends C4158 implements View.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public static final String f120786w = C3727.m1052("\u0016\r/\u0019\u000f\u000f\u000b\u0016\u0012\u00123\u0006\u001c\u001f3\u0011\u0001\u0005,\u001c\u001brjnwmun/wampsv", 0, 21, 106);

    /* renamed from: v  reason: collision with root package name */
    public boolean f120787v;

    public void onClick(View view) {
        m3496("", (String) null, (AppCompatActivity) this, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f120787v = bundle.getBoolean(f120786w);
        }
        Uri data = getIntent().getData();
        if (!this.f120787v && data != null) {
            String scheme = data.getScheme();
            if (scheme.equals(C3727.m1052("\u0016\r/\u0019\u000f\u000f\u000b\u0016\u0012\u00123\u0006\u001c\u001f3\u0011\u0001\u0005,\u001c\u001brjnwmun/wampsv", 21, 10, 4)) || scheme.startsWith(C3727.m1052("\u0016\r/\u0019\u000f\u000f\u000b\u0016\u0012\u00123\u0006\u001c\u001f3\u0011\u0001\u0005,\u001c\u001brjnwmun/wampsv", 31, 4, 30))) {
                finish();
                return;
            }
        }
        m3490((AppCompatActivity) this, (Context) this, (View.OnClickListener) this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m3490((AppCompatActivity) this, (Context) this, (View.OnClickListener) this);
    }

    public void onResume() {
        super.onResume();
        C3734 r02 = C3734.f1057;
        if (r02.f1066 && this.f120787v) {
            r02.m1121();
            C3730 r03 = r02.f1064;
            int r12 = r03.m1106();
            if (r12 == 0 && r03.m1112().length() > 0) {
                m3490((AppCompatActivity) this, (Context) this, (View.OnClickListener) this);
            }
            this.f120787v = false;
            if (this.f3798) {
                return;
            }
            if (1 == r12 || 2 == r12) {
                m3496("", (String) null, (AppCompatActivity) this, 3);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(f120786w, this.f120787v);
    }

    public void onStop() {
        super.onStop();
        if (!isChangingConfigurations()) {
            this.f120787v = true;
        }
    }
}

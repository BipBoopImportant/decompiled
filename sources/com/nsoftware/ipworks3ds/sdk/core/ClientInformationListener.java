package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import nts.C4158;

public class ClientInformationListener extends C4158 {

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public AppCompatActivity f120781a;

        public a(AppCompatActivity appCompatActivity) {
            this.f120781a = appCompatActivity;
        }

        public void onClick(View view) {
            ClientInformationListener.this.m3496("", (String) null, this.f120781a, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3490((AppCompatActivity) this, (Context) this, (View.OnClickListener) new a(this));
    }
}

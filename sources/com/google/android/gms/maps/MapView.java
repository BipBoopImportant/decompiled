package com.google.android.gms.maps;

import K9.C6620s;
import T9.a;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import oa.C8622f;

public class MapView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final d f49482a;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49482a = new d(this, context, GoogleMapOptions.U(context, attributeSet));
        setClickable(true);
    }

    public void a(C8622f fVar) {
        C6620s.e("getMapAsync() must be called on the main thread");
        C6620s.m(fVar, "callback must not be null.");
        this.f49482a.r(fVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f49482a.c(bundle);
            if (this.f49482a.b() == null) {
                a.k(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f49482a.d();
    }

    public void d() {
        this.f49482a.e();
    }

    public void e() {
        this.f49482a.f();
    }

    public void f() {
        this.f49482a.g();
    }

    public void g(Bundle bundle) {
        this.f49482a.h(bundle);
    }

    public void h() {
        this.f49482a.i();
    }

    public void i() {
        this.f49482a.j();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f49482a = new d(this, context, googleMapOptions);
        setClickable(true);
    }
}

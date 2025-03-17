package com.google.android.material.appbar;

import I2.C4600b0;
import android.view.View;

class f {

    /* renamed from: a  reason: collision with root package name */
    private final View f65983a;

    /* renamed from: b  reason: collision with root package name */
    private int f65984b;

    /* renamed from: c  reason: collision with root package name */
    private int f65985c;

    /* renamed from: d  reason: collision with root package name */
    private int f65986d;

    /* renamed from: e  reason: collision with root package name */
    private int f65987e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f65988f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f65989g = true;

    public f(View view) {
        this.f65983a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f65983a;
        C4600b0.Z(view, this.f65986d - (view.getTop() - this.f65984b));
        View view2 = this.f65983a;
        C4600b0.Y(view2, this.f65987e - (view2.getLeft() - this.f65985c));
    }

    public int b() {
        return this.f65986d;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f65984b = this.f65983a.getTop();
        this.f65985c = this.f65983a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f65989g || this.f65987e == i10) {
            return false;
        }
        this.f65987e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f65988f || this.f65986d == i10) {
            return false;
        }
        this.f65986d = i10;
        a();
        return true;
    }
}

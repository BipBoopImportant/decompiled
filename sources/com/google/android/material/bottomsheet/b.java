package com.google.android.material.bottomsheet;

import Fa.C9081a;
import I2.C0;
import I2.C4628p0;
import android.view.View;
import java.util.Iterator;
import java.util.List;

class b extends C4628p0.b {

    /* renamed from: c  reason: collision with root package name */
    private final View f66181c;

    /* renamed from: d  reason: collision with root package name */
    private int f66182d;

    /* renamed from: e  reason: collision with root package name */
    private int f66183e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f66184f = new int[2];

    public b(View view) {
        super(0);
        this.f66181c = view;
    }

    public void c(C4628p0 p0Var) {
        this.f66181c.setTranslationY(0.0f);
    }

    public void d(C4628p0 p0Var) {
        this.f66181c.getLocationOnScreen(this.f66184f);
        this.f66182d = this.f66184f[1];
    }

    public C0 e(C0 c02, List<C4628p0> list) {
        Iterator<C4628p0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4628p0 next = it.next();
            if ((next.c() & C0.l.c()) != 0) {
                this.f66181c.setTranslationY((float) C9081a.c(this.f66183e, 0, next.b()));
                break;
            }
        }
        return c02;
    }

    public C4628p0.a f(C4628p0 p0Var, C4628p0.a aVar) {
        this.f66181c.getLocationOnScreen(this.f66184f);
        int i10 = this.f66182d - this.f66184f[1];
        this.f66183e = i10;
        this.f66181c.setTranslationY((float) i10);
        return aVar;
    }
}

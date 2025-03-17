package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.T1;

public class T1<M extends T1<M>> extends X1 {

    /* renamed from: b  reason: collision with root package name */
    protected U1 f48261b;

    public void a(R1 r12) {
        if (this.f48261b != null) {
            for (int i10 = 0; i10 < this.f48261b.b(); i10++) {
                this.f48261b.c(i10).b(r12);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int d() {
        if (this.f48261b != null) {
            for (int i10 = 0; i10 < this.f48261b.b(); i10++) {
                this.f48261b.c(i10).c();
            }
        }
        return 0;
    }

    public /* synthetic */ X1 e() {
        return (T1) clone();
    }

    /* renamed from: f */
    public M clone() {
        M m10 = (T1) super.clone();
        W1.h(this, m10);
        return m10;
    }
}

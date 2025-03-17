package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.c4  reason: case insensitive filesystem */
final class C7267c4 extends C7285e4 {

    /* renamed from: a  reason: collision with root package name */
    private int f48869a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f48870b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7276d4 f48871c;

    C7267c4(C7276d4 d4Var) {
        this.f48871c = d4Var;
        this.f48870b = d4Var.x();
    }

    public final boolean hasNext() {
        return this.f48869a < this.f48870b;
    }

    public final byte zza() {
        int i10 = this.f48869a;
        if (i10 < this.f48870b) {
            this.f48869a = i10 + 1;
            return this.f48871c.t(i10);
        }
        throw new NoSuchElementException();
    }
}

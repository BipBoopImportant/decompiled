package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.vision.h0  reason: case insensitive filesystem */
final class C7493h0 extends C7501j0 {

    /* renamed from: a  reason: collision with root package name */
    private int f49328a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f49329b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7497i0 f49330c;

    C7493h0(C7497i0 i0Var) {
        this.f49330c = i0Var;
        this.f49329b = i0Var.i();
    }

    public final boolean hasNext() {
        return this.f49328a < this.f49329b;
    }

    public final byte zza() {
        int i10 = this.f49328a;
        if (i10 < this.f49329b) {
            this.f49328a = i10 + 1;
            return this.f49330c.t(i10);
        }
        throw new NoSuchElementException();
    }
}

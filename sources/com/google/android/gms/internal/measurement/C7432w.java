package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.w  reason: case insensitive filesystem */
final class C7432w implements Iterator<C7400s> {

    /* renamed from: a  reason: collision with root package name */
    private int f49107a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7416u f49108b;

    C7432w(C7416u uVar) {
        this.f49108b = uVar;
    }

    public final boolean hasNext() {
        return this.f49107a < this.f49108b.f49084a.length();
    }

    public final /* synthetic */ Object next() {
        if (this.f49107a < this.f49108b.f49084a.length()) {
            String b10 = this.f49108b.f49084a;
            int i10 = this.f49107a;
            this.f49107a = i10 + 1;
            return new C7416u(String.valueOf(b10.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}

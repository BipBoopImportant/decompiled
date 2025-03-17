package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.i  reason: case insensitive filesystem */
final /* synthetic */ class C7191i implements C7206n {

    /* renamed from: a  reason: collision with root package name */
    private final String f48406a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f48407b = false;

    C7191i(String str, boolean z10) {
        this.f48406a = str;
    }

    public final Object j() {
        return Boolean.valueOf(A2.h(C7182f.f48357i.getContentResolver(), this.f48406a, this.f48407b));
    }
}

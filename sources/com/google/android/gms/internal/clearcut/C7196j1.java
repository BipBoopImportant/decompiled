package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.j1  reason: case insensitive filesystem */
final class C7196j1 extends C7214p1 {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7187g1 f48416b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C7196j1(C7187g1 g1Var) {
        super(g1Var, (C7190h1) null);
        this.f48416b = g1Var;
    }

    public final Iterator iterator() {
        return new C7193i1(this.f48416b, (C7190h1) null);
    }

    /* synthetic */ C7196j1(C7187g1 g1Var, C7190h1 h1Var) {
        this(g1Var);
    }
}

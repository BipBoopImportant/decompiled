package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b6  reason: case insensitive filesystem */
final class C7260b6 extends Z5<C7269c6, C7269c6> {
    C7260b6() {
    }

    private static void m(Object obj, C7269c6 c6Var) {
        ((L4) obj).zzb = c6Var;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int a(Object obj) {
        return ((C7269c6) obj).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(Object obj, Object obj2) {
        C7269c6 c6Var = (C7269c6) obj;
        C7269c6 c6Var2 = (C7269c6) obj2;
        return C7269c6.k().equals(c6Var2) ? c6Var : C7269c6.k().equals(c6Var) ? C7269c6.c(c6Var, c6Var2) : c6Var.b(c6Var2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Object obj, int i10, C7276d4 d4Var) {
        ((C7269c6) obj).e((i10 << 3) | 2, d4Var);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Object obj, C7399r6 r6Var) {
        ((C7269c6) obj).g(r6Var);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int e(Object obj) {
        return ((C7269c6) obj).i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Object obj, int i10, long j10) {
        ((C7269c6) obj).e(i10 << 3, Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(Object obj, C7399r6 r6Var) {
        ((C7269c6) obj).j(r6Var);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (C7269c6) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object i(Object obj) {
        C7269c6 c6Var = ((L4) obj).zzb;
        if (c6Var != C7269c6.k()) {
            return c6Var;
        }
        C7269c6 l10 = C7269c6.l();
        m(obj, l10);
        return l10;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (C7269c6) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object k(Object obj) {
        return ((L4) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final void l(Object obj) {
        ((L4) obj).zzb.m();
    }
}

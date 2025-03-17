package androidx.transition;

import D2.e;

/* renamed from: androidx.transition.d  reason: case insensitive filesystem */
public final /* synthetic */ class C7018d implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f44667a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C7026l f44668b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f44669c;

    public /* synthetic */ C7018d(Runnable runnable, C7026l lVar, Runnable runnable2) {
        this.f44667a = runnable;
        this.f44668b = lVar;
        this.f44669c = runnable2;
    }

    public final void onCancel() {
        FragmentTransitionSupport.E(this.f44667a, this.f44668b, this.f44669c);
    }
}

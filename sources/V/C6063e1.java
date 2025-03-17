package v;

import java.util.LinkedHashSet;
import v.C6066f1;

/* renamed from: v.e1  reason: case insensitive filesystem */
public final /* synthetic */ class C6063e1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f30541a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30542b;

    public /* synthetic */ C6063e1(LinkedHashSet linkedHashSet, int i10) {
        this.f30541a = linkedHashSet;
        this.f30542b = i10;
    }

    public final void run() {
        C6066f1.a.f(this.f30541a, this.f30542b);
    }
}

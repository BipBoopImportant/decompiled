package v;

import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.r;

/* renamed from: v.r  reason: case insensitive filesystem */
public final /* synthetic */ class C6100r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5040p f30657a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30658b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f30659c;

    public /* synthetic */ C6100r(C5040p pVar, int i10, r rVar) {
        this.f30657a = pVar;
        this.f30658b = i10;
        this.f30659c = rVar;
    }

    public final void run() {
        this.f30657a.c(this.f30658b, this.f30659c);
    }
}

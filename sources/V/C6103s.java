package v;

import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5059z;

/* renamed from: v.s  reason: case insensitive filesystem */
public final /* synthetic */ class C6103s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5040p f30663a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30664b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C5059z f30665c;

    public /* synthetic */ C6103s(C5040p pVar, int i10, C5059z zVar) {
        this.f30663a = pVar;
        this.f30664b = i10;
        this.f30665c = zVar;
    }

    public final void run() {
        this.f30663a.b(this.f30664b, this.f30665c);
    }
}

package v;

import C.C4402k;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.X;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import u.C5965a;
import v.C6109u;
import w.B;

/* renamed from: v.j1  reason: case insensitive filesystem */
public class C6078j1 {

    /* renamed from: a  reason: collision with root package name */
    private final C6109u f30590a;

    /* renamed from: b  reason: collision with root package name */
    private final C6081k1 f30591b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f30592c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30593d = false;

    /* renamed from: e  reason: collision with root package name */
    private c.a<Integer> f30594e;

    /* renamed from: f  reason: collision with root package name */
    private C6109u.c f30595f;

    C6078j1(C6109u uVar, B b10, Executor executor) {
        this.f30590a = uVar;
        this.f30591b = new C6081k1(b10, 0);
        this.f30592c = executor;
    }

    private void a() {
        c.a<Integer> aVar = this.f30594e;
        if (aVar != null) {
            aVar.f(new C4402k.a("Cancelled by another setExposureCompensationIndex()"));
            this.f30594e = null;
        }
        C6109u.c cVar = this.f30595f;
        if (cVar != null) {
            this.f30590a.m0(cVar);
            this.f30595f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z10) {
        if (z10 != this.f30593d) {
            this.f30593d = z10;
            if (!z10) {
                this.f30591b.b(0);
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(C5965a.C0464a aVar) {
        aVar.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f30591b.a()), X.c.REQUIRED);
    }
}

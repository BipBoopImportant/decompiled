package v;

import C.C4391e0;
import C.C4402k;
import G.p;
import I.n;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.c;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import java.util.Objects;
import java.util.concurrent.Executor;
import ob.C10101e;
import w.B;
import z.g;

final class f2 {

    /* renamed from: a  reason: collision with root package name */
    private final C6109u f30552a;

    /* renamed from: b  reason: collision with root package name */
    private final K<Integer> f30553b = new K<>(0);

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30554c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f30555d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30556e;

    /* renamed from: f  reason: collision with root package name */
    c.a<Void> f30557f;

    /* renamed from: g  reason: collision with root package name */
    boolean f30558g;

    f2(C6109u uVar, B b10, Executor executor) {
        this.f30552a = uVar;
        this.f30555d = executor;
        Objects.requireNonNull(b10);
        this.f30554c = g.a(new C6046X(b10));
        uVar.A(new e2(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object h(boolean z10, c.a aVar) {
        this.f30555d.execute(new d2(this, aVar, z10));
        return "enableTorch: " + z10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f30557f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f30558g) {
                this.f30557f.c(null);
                this.f30557f = null;
            }
        }
        return false;
    }

    private <T> void k(K<T> k10, T t10) {
        if (p.c()) {
            k10.setValue(t10);
        } else {
            k10.postValue(t10);
        }
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> d(boolean z10) {
        if (!this.f30554c) {
            C4391e0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return n.n(new IllegalStateException("No flash unit"));
        }
        k(this.f30553b, Integer.valueOf(z10 ? 1 : 0));
        return c.a(new c2(this, z10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void g(c.a<Void> aVar, boolean z10) {
        if (!this.f30554c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f30556e) {
            k(this.f30553b, 0);
            if (aVar != null) {
                aVar.f(new C4402k.a("Camera is not active."));
            }
        } else {
            this.f30558g = z10;
            this.f30552a.D(z10);
            k(this.f30553b, Integer.valueOf(z10 ? 1 : 0));
            c.a<Void> aVar2 = this.f30557f;
            if (aVar2 != null) {
                aVar2.f(new C4402k.a("There is a new enableTorch being set"));
            }
            this.f30557f = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public F<Integer> f() {
        return this.f30553b;
    }

    /* access modifiers changed from: package-private */
    public void j(boolean z10) {
        if (this.f30556e != z10) {
            this.f30556e = z10;
            if (!z10) {
                if (this.f30558g) {
                    this.f30558g = false;
                    this.f30552a.D(false);
                    k(this.f30553b, 0);
                }
                c.a<Void> aVar = this.f30557f;
                if (aVar != null) {
                    aVar.f(new C4402k.a("Camera is not active."));
                    this.f30557f = null;
                }
            }
        }
    }
}

package v;

import H2.i;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v.C6054b1;

/* renamed from: v.I0  reason: case insensitive filesystem */
public class C6032I0 implements T0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f30218a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private C6054b1 f30219b;

    /* renamed from: c  reason: collision with root package name */
    private List<a1> f30220c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f30221d;

    /* renamed from: e  reason: collision with root package name */
    private volatile X0 f30222e;

    public C6032I0(C6054b1 b1Var, List<a1> list) {
        boolean z10 = false;
        this.f30221d = false;
        z10 = b1Var.f30501i == C6054b1.c.OPENED ? true : z10;
        i.b(z10, "CaptureSession state must be OPENED. Current state:" + b1Var.f30501i);
        this.f30219b = b1Var;
        this.f30220c = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        synchronized (this.f30218a) {
            this.f30221d = true;
            this.f30219b = null;
            this.f30222e = null;
            this.f30220c = null;
        }
    }

    public void b(X0 x02) {
        synchronized (this.f30218a) {
            this.f30222e = x02;
        }
    }
}

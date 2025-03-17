package v;

import C.B;
import C.C;
import C.C4391e0;
import C.C4397h0;
import C.C4402k;
import I.n;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.r;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ob.C10101e;
import u.C5965a;
import v.C6109u;
import z.l;

/* renamed from: v.y1  reason: case insensitive filesystem */
class C6123y1 {

    /* renamed from: x  reason: collision with root package name */
    private static final MeteringRectangle[] f30750x = new MeteringRectangle[0];

    /* renamed from: a  reason: collision with root package name */
    private final C6109u f30751a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f30752b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f30753c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f30754d = false;

    /* renamed from: e  reason: collision with root package name */
    private volatile Rational f30755e = null;

    /* renamed from: f  reason: collision with root package name */
    private final l f30756f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f30757g = false;

    /* renamed from: h  reason: collision with root package name */
    Integer f30758h = 0;

    /* renamed from: i  reason: collision with root package name */
    private ScheduledFuture<?> f30759i;

    /* renamed from: j  reason: collision with root package name */
    private ScheduledFuture<?> f30760j;

    /* renamed from: k  reason: collision with root package name */
    long f30761k = 0;

    /* renamed from: l  reason: collision with root package name */
    boolean f30762l = false;

    /* renamed from: m  reason: collision with root package name */
    boolean f30763m = false;

    /* renamed from: n  reason: collision with root package name */
    private int f30764n = 1;

    /* renamed from: o  reason: collision with root package name */
    private C6109u.c f30765o = null;

    /* renamed from: p  reason: collision with root package name */
    private C6109u.c f30766p = null;

    /* renamed from: q  reason: collision with root package name */
    private MeteringRectangle[] f30767q;

    /* renamed from: r  reason: collision with root package name */
    private MeteringRectangle[] f30768r;

    /* renamed from: s  reason: collision with root package name */
    private MeteringRectangle[] f30769s;

    /* renamed from: t  reason: collision with root package name */
    c.a<C> f30770t;

    /* renamed from: u  reason: collision with root package name */
    c.a<Void> f30771u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f30772v;

    /* renamed from: w  reason: collision with root package name */
    private C6109u.c f30773w;

    /* renamed from: v.y1$a */
    class a extends C5040p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f30774a;

        a(c.a aVar) {
            this.f30774a = aVar;
        }

        public void a(int i10) {
            c.a aVar = this.f30774a;
            if (aVar != null) {
                aVar.f(new C4402k.a("Camera is closed"));
            }
        }

        public void b(int i10, C5059z zVar) {
            c.a aVar = this.f30774a;
            if (aVar != null) {
                aVar.c(zVar);
            }
        }

        public void c(int i10, r rVar) {
            c.a aVar = this.f30774a;
            if (aVar != null) {
                aVar.f(new F.c(rVar));
            }
        }
    }

    /* renamed from: v.y1$b */
    class b extends C5040p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f30776a;

        b(c.a aVar) {
            this.f30776a = aVar;
        }

        public void a(int i10) {
            c.a aVar = this.f30776a;
            if (aVar != null) {
                aVar.f(new C4402k.a("Camera is closed"));
            }
        }

        public void b(int i10, C5059z zVar) {
            if (this.f30776a != null) {
                C4391e0.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f30776a.c(null);
            }
        }

        public void c(int i10, r rVar) {
            c.a aVar = this.f30776a;
            if (aVar != null) {
                aVar.f(new F.c(rVar));
            }
        }
    }

    C6123y1(C6109u uVar, ScheduledExecutorService scheduledExecutorService, Executor executor, R0 r02) {
        MeteringRectangle[] meteringRectangleArr = f30750x;
        this.f30767q = meteringRectangleArr;
        this.f30768r = meteringRectangleArr;
        this.f30769s = meteringRectangleArr;
        this.f30770t = null;
        this.f30771u = null;
        this.f30772v = false;
        this.f30773w = null;
        this.f30751a = uVar;
        this.f30752b = executor;
        this.f30753c = scheduledExecutorService;
        this.f30756f = new l(r02);
    }

    private Rational B() {
        if (this.f30755e != null) {
            return this.f30755e;
        }
        Rect F10 = this.f30751a.F();
        return new Rational(F10.width(), F10.height());
    }

    private static PointF C(C4397h0 h0Var, Rational rational, Rational rational2, int i10, l lVar) {
        if (h0Var.b() != null) {
            rational2 = h0Var.b();
        }
        PointF a10 = lVar.a(h0Var, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a10.y = (((float) ((((double) doubleValue) - 1.0d) / 2.0d)) + a10.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                a10.x = (((float) ((((double) doubleValue2) - 1.0d) / 2.0d)) + a10.x) * (1.0f / doubleValue2);
            }
        }
        return a10;
    }

    private static MeteringRectangle D(C4397h0 h0Var, PointF pointF, Rect rect) {
        int width = (int) (((float) rect.left) + (pointF.x * ((float) rect.width())));
        int height = (int) (((float) rect.top) + (pointF.y * ((float) rect.height())));
        int a10 = ((int) (h0Var.a() * ((float) rect.width()))) / 2;
        int a11 = ((int) (h0Var.a() * ((float) rect.height()))) / 2;
        Rect rect2 = new Rect(width - a10, height - a11, width + a10, height + a11);
        rect2.left = V(rect2.left, rect.right, rect.left);
        rect2.right = V(rect2.right, rect.right, rect.left);
        rect2.top = V(rect2.top, rect.bottom, rect.top);
        rect2.bottom = V(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private List<MeteringRectangle> E(List<C4397h0> list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (C4397h0 next : list) {
            if (arrayList.size() == i10) {
                break;
            } else if (H(next)) {
                MeteringRectangle D10 = D(next, C(next, rational2, rational, i11, this.f30756f), rect);
                if (!(D10.getWidth() == 0 || D10.getHeight() == 0)) {
                    arrayList.add(D10);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean F() {
        return this.f30751a.Q(1) == 1;
    }

    private static boolean H(C4397h0 h0Var) {
        return h0Var.c() >= 0.0f && h0Var.c() <= 1.0f && h0Var.d() >= 0.0f && h0Var.d() <= 1.0f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean I(int i10, long j10, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !C6109u.a0(totalCaptureResult, j10)) {
            return false;
        }
        t();
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(boolean z10, c.a aVar) {
        this.f30751a.m0(this.f30773w);
        this.f30772v = z10;
        w(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object K(boolean z10, c.a aVar) {
        this.f30752b.execute(new C6099q1(this, z10, aVar));
        return "enableExternalFlashAeMode";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean L(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        C4391e0.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != this.f30772v || !C6109u.a0(totalCaptureResult, j10)) {
            return false;
        }
        C4391e0.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(long j10) {
        if (j10 == this.f30761k) {
            q();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N(long j10) {
        this.f30752b.execute(new C6087m1(this, j10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean O(boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (Z()) {
            if (!z10 || num == null) {
                this.f30763m = true;
                this.f30762l = true;
            } else if (this.f30758h.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.f30763m = true;
                    this.f30762l = true;
                } else if (num.intValue() == 5) {
                    this.f30763m = false;
                    this.f30762l = true;
                }
            }
        }
        if (!this.f30762l || !C6109u.a0(totalCaptureResult, j10)) {
            if (!this.f30758h.equals(num) && num != null) {
                this.f30758h = num;
            }
            return false;
        }
        s(this.f30763m);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(long j10) {
        if (j10 == this.f30761k) {
            this.f30763m = false;
            s(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q(long j10) {
        this.f30752b.execute(new C6090n1(this, j10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object S(B b10, long j10, c.a aVar) {
        this.f30752b.execute(new C6111u1(this, aVar, b10, j10));
        return "startFocusAndMetering";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object U(c.a aVar) {
        this.f30752b.execute(new C6102r1(this, aVar));
        return "triggerAePrecapture";
    }

    private static int V(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    private boolean Z() {
        return this.f30767q.length > 0;
    }

    private void r() {
        ScheduledFuture<?> scheduledFuture = this.f30760j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f30760j = null;
        }
    }

    private void t() {
        c.a<Void> aVar = this.f30771u;
        if (aVar != null) {
            aVar.c(null);
            this.f30771u = null;
        }
    }

    private void u() {
        ScheduledFuture<?> scheduledFuture = this.f30759i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f30759i = null;
        }
    }

    private void w(c.a<Void> aVar) {
        if (this.f30754d) {
            C6105s1 s1Var = new C6105s1(this, this.f30751a.v0(), aVar);
            this.f30773w = s1Var;
            this.f30751a.A(s1Var);
        } else if (aVar != null) {
            aVar.f(new C4402k.a("Camera is not active."));
        }
    }

    private void x(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, B b10, long j10) {
        long j11;
        this.f30751a.m0(this.f30765o);
        u();
        r();
        this.f30767q = meteringRectangleArr;
        this.f30768r = meteringRectangleArr2;
        this.f30769s = meteringRectangleArr3;
        if (Z()) {
            this.f30757g = true;
            this.f30762l = false;
            this.f30763m = false;
            j11 = this.f30751a.v0();
            f0((c.a<C5059z>) null, true);
        } else {
            this.f30757g = false;
            this.f30762l = true;
            this.f30763m = false;
            j11 = this.f30751a.v0();
        }
        this.f30758h = 0;
        C6114v1 v1Var = new C6114v1(this, F(), j11);
        this.f30765o = v1Var;
        this.f30751a.A(v1Var);
        long j12 = this.f30761k + 1;
        this.f30761k = j12;
        C6117w1 w1Var = new C6117w1(this, j12);
        ScheduledExecutorService scheduledExecutorService = this.f30753c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f30760j = scheduledExecutorService.schedule(w1Var, j10, timeUnit);
        if (b10.e()) {
            this.f30759i = this.f30753c.schedule(new C6120x1(this, j12), b10.a(), timeUnit);
        }
    }

    private void y(String str) {
        this.f30751a.m0(this.f30765o);
        c.a<C> aVar = this.f30770t;
        if (aVar != null) {
            aVar.f(new C4402k.a(str));
            this.f30770t = null;
        }
    }

    private void z(String str) {
        this.f30751a.m0(this.f30766p);
        c.a<Void> aVar = this.f30771u;
        if (aVar != null) {
            aVar.f(new C4402k.a(str));
            this.f30771u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public int A() {
        return this.f30764n != 3 ? 4 : 3;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f30772v;
    }

    /* access modifiers changed from: package-private */
    public void W(boolean z10) {
        if (z10 != this.f30754d) {
            this.f30754d = z10;
            if (!this.f30754d) {
                q();
            }
        }
    }

    public void X(Rational rational) {
        this.f30755e = rational;
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10) {
        this.f30764n = i10;
    }

    /* access modifiers changed from: package-private */
    public C10101e<C> a0(B b10) {
        return b0(b10, 5000);
    }

    /* access modifiers changed from: package-private */
    public C10101e<C> b0(B b10, long j10) {
        return c.a(new C6108t1(this, b10, j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void R(c.a<C> aVar, B b10, long j10) {
        if (!this.f30754d) {
            aVar.f(new C4402k.a("Camera is not active."));
            return;
        }
        Rect F10 = this.f30751a.F();
        Rational B10 = B();
        Rational rational = B10;
        Rect rect = F10;
        List<MeteringRectangle> E10 = E(b10.c(), this.f30751a.J(), rational, rect, 1);
        List<MeteringRectangle> E11 = E(b10.b(), this.f30751a.I(), rational, rect, 2);
        List<MeteringRectangle> E12 = E(b10.d(), this.f30751a.K(), rational, rect, 4);
        if (!E10.isEmpty() || !E11.isEmpty() || !E12.isEmpty()) {
            y("Cancelled by another startFocusAndMetering()");
            z("Cancelled by another startFocusAndMetering()");
            u();
            this.f30770t = aVar;
            MeteringRectangle[] meteringRectangleArr = f30750x;
            x((MeteringRectangle[]) E10.toArray(meteringRectangleArr), (MeteringRectangle[]) E11.toArray(meteringRectangleArr), (MeteringRectangle[]) E12.toArray(meteringRectangleArr), b10, j10);
            return;
        }
        aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> d0() {
        return c.a(new C6096p1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void T(c.a<Void> aVar) {
        C4391e0.a("FocusMeteringControl", "triggerAePrecapture");
        if (this.f30754d) {
            V.a aVar2 = new V.a();
            aVar2.v(this.f30764n);
            aVar2.w(true);
            C5965a.C0464a aVar3 = new C5965a.C0464a();
            aVar3.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            aVar2.e(aVar3.b());
            aVar2.c(new b(aVar));
            this.f30751a.t0(Collections.singletonList(aVar2.h()));
        } else if (aVar != null) {
            aVar.f(new C4402k.a("Camera is not active."));
        }
    }

    /* access modifiers changed from: package-private */
    public void f0(c.a<C5059z> aVar, boolean z10) {
        if (this.f30754d) {
            V.a aVar2 = new V.a();
            aVar2.v(this.f30764n);
            aVar2.w(true);
            C5965a.C0464a aVar3 = new C5965a.C0464a();
            aVar3.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z10) {
                aVar3.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f30751a.O(1)), X.c.HIGH_PRIORITY_REQUIRED);
            }
            aVar2.e(aVar3.b());
            aVar2.c(new a(aVar));
            this.f30751a.t0(Collections.singletonList(aVar2.h()));
        } else if (aVar != null) {
            aVar.f(new C4402k.a("Camera is not active."));
        }
    }

    /* access modifiers changed from: package-private */
    public void n(C5965a.C0464a aVar) {
        int A10 = this.f30757g ? 1 : A();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer valueOf = Integer.valueOf(this.f30751a.Q(A10));
        X.c cVar = X.c.REQUIRED;
        aVar.g(key, valueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f30767q;
        if (meteringRectangleArr.length != 0) {
            aVar.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f30768r;
        if (meteringRectangleArr2.length != 0) {
            aVar.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f30769s;
        if (meteringRectangleArr3.length != 0) {
            aVar.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10, boolean z11) {
        if (this.f30754d) {
            V.a aVar = new V.a();
            aVar.w(true);
            aVar.v(this.f30764n);
            C5965a.C0464a aVar2 = new C5965a.C0464a();
            if (z10) {
                aVar2.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                aVar2.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(aVar2.b());
            this.f30751a.t0(Collections.singletonList(aVar.h()));
        }
    }

    /* access modifiers changed from: package-private */
    public void p(c.a<Void> aVar) {
        z("Cancelled by another cancelFocusAndMetering()");
        y("Cancelled by cancelFocusAndMetering()");
        this.f30771u = aVar;
        u();
        r();
        if (Z()) {
            o(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f30750x;
        this.f30767q = meteringRectangleArr;
        this.f30768r = meteringRectangleArr;
        this.f30769s = meteringRectangleArr;
        this.f30757g = false;
        long v02 = this.f30751a.v0();
        if (this.f30771u != null) {
            C6093o1 o1Var = new C6093o1(this, this.f30751a.Q(A()), v02);
            this.f30766p = o1Var;
            this.f30751a.A(o1Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        p((c.a<Void>) null);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        r();
        c.a<C> aVar = this.f30770t;
        if (aVar != null) {
            aVar.c(C.a(z10));
            this.f30770t = null;
        }
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> v(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return n.p(null);
        } else if (this.f30751a.O(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return n.p(null);
        } else {
            Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
            return c.a(new C6084l1(this, z10));
        }
    }
}

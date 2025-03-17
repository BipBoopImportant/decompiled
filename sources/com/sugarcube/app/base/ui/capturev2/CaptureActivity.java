package com.sugarcube.app.base.ui.capturev2;

import JF.T;
import JF.Z;
import QE.C13424a;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YH.C16877v;
import android.app.Activity;
import android.view.OrientationEventListener;
import android.view.View;
import androidx.activity.j;
import androidx.activity.v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.L;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import eF.U;
import hF.C14540b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tF.C15078c;
import x4.C8937a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR.\u0010'\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@DX\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010/\u001a\u0004\u0018\u00010(2\b\u0010 \u001a\u0004\u0018\u00010(8\u0006@DX\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008FX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8FX\u0002¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/CaptureActivity;", "Lcom/sugarcube/app/base/ui/BaseLocaleActivity;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LQE/a;", "binding", "LXH/N;", "K0", "(LQE/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "finish", "Ljava/util/UUID;", "G0", "()Ljava/util/UUID;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "value", "C", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "getArControl", "()Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "setArControl", "(Lcom/sugarcube/app/base/ui/capturev2/ArControl;)V", "arControl", "Lcom/sugarcube/app/base/ui/capturev2/q;", "D", "Lcom/sugarcube/app/base/ui/capturev2/q;", "D0", "()Lcom/sugarcube/app/base/ui/capturev2/q;", "setArSurface", "(Lcom/sugarcube/app/base/ui/capturev2/q;)V", "arSurface", "Lcom/sugarcube/app/base/ui/capturev2/h1;", "E", "LXH/o;", "E0", "()Lcom/sugarcube/app/base/ui/capturev2/h1;", "model", "Landroid/view/OrientationEventListener;", "F", "Landroid/view/OrientationEventListener;", "orientationEventListener", "G", "Z", "wasPaused", "Lcom/sugarcube/app/base/ui/capturev2/U;", "H", "F0", "()Lcom/sugarcube/app/base/ui/capturev2/U;", "sensor", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CaptureActivity extends Hilt_CaptureActivity implements SystemUiDelegate {

    /* renamed from: B  reason: collision with root package name */
    private final /* synthetic */ T f123388B = new T();

    /* renamed from: C  reason: collision with root package name */
    private ArControl f123389C;

    /* renamed from: D  reason: collision with root package name */
    private C14228q f123390D;

    /* renamed from: E  reason: collision with root package name */
    private final C16824o f123391E = new h0(P.b(h1.class), new f(this), new e(this), new g((C17631a) null, this));

    /* renamed from: F  reason: collision with root package name */
    private OrientationEventListener f123392F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f123393G;

    /* renamed from: H  reason: collision with root package name */
    private final C16824o f123394H = C16825p.b(new E(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f123395a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                eF.U[] r0 = eF.U.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                eF.U r1 = eF.U.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                eF.U r1 = eF.U.DARK_ROOM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                eF.U r1 = eF.U.ROTATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f123395a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.CaptureActivity.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CaptureActivity f123396a;

        b(CaptureActivity captureActivity) {
            this.f123396a = captureActivity;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1387031107, i10, -1, "com.sugarcube.app.base.ui.capturev2.CaptureActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CaptureActivity.kt:91)");
                }
                C15078c.b(this.f123396a.E0().n1(), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f123397a;

        c(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f123397a = lVar;
        }

        public final C16818i<?> c() {
            return this.f123397a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f123397a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/capturev2/CaptureActivity$d", "Landroid/view/OrientationEventListener;", "", "orientation", "LXH/N;", "onOrientationChanged", "(I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends OrientationEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CaptureActivity f123398a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CaptureActivity captureActivity) {
            super(captureActivity);
            this.f123398a = captureActivity;
        }

        public void onOrientationChanged(int i10) {
            this.f123398a.E0().T(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f123399c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(j jVar) {
            super(0);
            this.f123399c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f123399c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f123400c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(j jVar) {
            super(0);
            this.f123400c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f123400c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f123402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, j jVar) {
            super(0);
            this.f123401c = aVar;
            this.f123402d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f123401c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f123402d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.CaptureActivity.g.invoke():l3.a");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N H0(CaptureActivity captureActivity, v vVar) {
        C17542s.j(vVar, "$this$addCallback");
        captureActivity.E0().v1();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(CaptureActivity captureActivity, C16807N n10) {
        captureActivity.finish();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final U J0(CaptureActivity captureActivity) {
        h1.R1(captureActivity.E0(), "lazy init CaptureSensor", (Throwable) null, 2, (Object) null);
        return new U(captureActivity, captureActivity.E0());
    }

    private final void K0(C13424a aVar) {
        aVar.f114497c.f114690d.setOnClickListener(new H(this));
        aVar.getRoot().addOnLayoutChangeListener(new I(aVar));
        aVar.f114499e.f114693b.setOnClickListener(new J(this));
        E0().O().observe(this, new c(new K(aVar, new M(), this, new M())));
        this.f123392F = new d(this);
    }

    /* access modifiers changed from: private */
    public static final void L0(C13424a aVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C17542s.g(view);
        Z.g(view, C16877v.e(aVar.f114499e.f114693b));
    }

    /* access modifiers changed from: private */
    public static final void M0(CaptureActivity captureActivity, View view) {
        h1.y1(captureActivity.E0(), (C14540b) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(C13424a aVar, M m10, CaptureActivity captureActivity, M m11, U u10) {
        int i10 = u10 == null ? -1 : a.f123395a[u10.ordinal()];
        if (i10 == 1) {
            aVar.f114499e.getRoot().setVisibility(8);
            aVar.f114497c.getRoot().setVisibility(8);
            aVar.f114498d.setVisibility(0);
        } else if (i10 == 2) {
            if (aVar.f114497c.getRoot().getVisibility() != 0) {
                int i11 = m10.f144346a;
                if (i11 < 5) {
                    m10.f144346a = i11 + 1;
                    h1 E02 = captureActivity.E0();
                    E02.o1().b().captureWarningLighting(E02.r1(), E02.l1(), E02.W0(), E02.V0());
                }
                h1.R1(captureActivity.E0(), "low light warning", (Throwable) null, 2, (Object) null);
            }
            aVar.f114497c.getRoot().setVisibility(0);
            aVar.f114499e.getRoot().setVisibility(8);
            aVar.f114498d.setVisibility(4);
        } else if (i10 == 3) {
            if (aVar.f114499e.getRoot().getVisibility() != 0) {
                int i12 = m11.f144346a;
                if (i12 < 5) {
                    m11.f144346a = i12 + 1;
                    h1 E03 = captureActivity.E0();
                    E03.o1().b().captureWarningRotation(E03.r1(), E03.l1(), E03.W0(), E03.V0());
                }
                h1.R1(captureActivity.E0(), "rotation warning", (Throwable) null, 2, (Object) null);
            }
            aVar.f114499e.getRoot().setVisibility(0);
            aVar.f114497c.getRoot().setVisibility(8);
            aVar.f114498d.setVisibility(4);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void O0(CaptureActivity captureActivity, View view) {
        captureActivity.E0().K();
    }

    public final C14228q D0() {
        return this.f123390D;
    }

    public final h1 E0() {
        return (h1) this.f123391E.getValue();
    }

    public final U F0() {
        return (U) this.f123394H.getValue();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.UUID G0() {
        /*
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            android.net.Uri r0 = r0.getData()
            r1 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0026
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.C17542s.i(r0, r3)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r3 = "sessionUuid"
            java.lang.String r2 = r2.getStringExtra(r3)
            if (r2 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x003a
            java.lang.String r2 = r0.getQueryParameter(r3)
            goto L_0x003b
        L_0x003a:
            r2 = r1
        L_0x003b:
            com.sugarcube.app.base.ui.capturev2.h1 r0 = r5.E0()
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ": "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
            r4 = 2
            com.sugarcube.app.base.ui.capturev2.h1.R1(r0, r3, r1, r4, r1)
            java.util.UUID r1 = java.util.UUID.fromString(r2)     // Catch:{ IllegalFormatException -> 0x0064 }
            goto L_0x0085
        L_0x0064:
            r0 = move-exception
            com.sugarcube.app.base.ui.capturev2.h1 r2 = r5.E0()
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " could not parse sessionUuid"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.Q1(r3, r0)
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.CaptureActivity.G0():java.util.UUID");
    }

    public void finish() {
        super.finish();
        C8937a.f57483e.a(this);
        h1 E02 = E0();
        String simpleName = getClass().getSimpleName();
        UUID r12 = E0().r1();
        h1.R1(E02, simpleName + " finish " + r12, (Throwable) null, 2, (Object) null);
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f123388B.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
        r1 = r1.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            com.sugarcube.app.base.ui.capturev2.h1 r13 = r12.E0()
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.content.Intent r1 = r12.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002c
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x002c
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " extras "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r1 = 2
            com.sugarcube.app.base.ui.capturev2.h1.R1(r13, r0, r3, r1, r3)
            java.util.UUID r13 = r12.G0()
            if (r13 == 0) goto L_0x005c
            com.sugarcube.app.base.ui.capturev2.h1 r0 = r12.E0()
            r0.P1(r13, r12)
            goto L_0x005f
        L_0x005c:
            r12.finish()
        L_0x005f:
            r10 = 24
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r12
            r5 = r12
            r6 = r12
            com.sugarcube.app.base.ui.utils.SystemUiDelegate.a.a(r4, r5, r6, r7, r8, r9, r10, r11)
            com.sugarcube.app.base.ui.capturev2.h1 r13 = r12.E0()
            com.sugarcube.app.base.ui.capturev2.h1 r0 = r12.E0()
            boolean r0 = r0.P()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "model.isLandscape = "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.sugarcube.app.base.ui.capturev2.h1.R1(r13, r0, r3, r1, r3)
            android.view.LayoutInflater r13 = r12.getLayoutInflater()
            QE.a r13 = QE.C13424a.c(r13)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.getRoot()
            r12.setContentView((android.view.View) r0)
            androidx.fragment.app.FragmentManager r0 = r12.getSupportFragmentManager()
            int r4 = OE.C13317i.f113091w1
            androidx.fragment.app.o r0 = r0.p0(r4)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"
            kotlin.jvm.internal.C17542s.h(r0, r4)
            androidx.navigation.fragment.NavHostFragment r0 = (androidx.navigation.fragment.NavHostFragment) r0
            x4.o r4 = r0.o0()
            com.sugarcube.app.base.navigation.Kreativ$Capture$V2$h r5 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.h.INSTANCE
            java.lang.Class<com.sugarcube.app.base.navigation.Kreativ$Capture$V2> r6 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.class
            uI.d r6 = kotlin.jvm.internal.P.b(r6)
            java.util.Map r7 = YH.X.j()
            x4.J r4 = r4.O()
            x4.y r8 = new x4.y
            r8.<init>((x4.J) r4, (java.lang.Object) r5, (uI.C18055d<?>) r6, (java.util.Map<uI.C18068q, x4.F<?>>) r7)
            bF.C14011b.a(r8)
            x4.x r4 = r8.c()
            x4.o r0 = r0.o0()
            r0.F0(r4, r3)
            androidx.compose.ui.platform.ComposeView r0 = r13.f114496b
            androidx.compose.ui.platform.s1$b r4 = androidx.compose.ui.platform.s1.b.f19575b
            r0.setViewCompositionStrategy(r4)
            com.sugarcube.app.base.ui.capturev2.CaptureActivity$b r4 = new com.sugarcube.app.base.ui.capturev2.CaptureActivity$b
            r4.<init>(r12)
            r5 = -1387031107(0xffffffffad5395bd, float:-1.202721E-11)
            r6 = 1
            c1.a r4 = c1.c.c(r5, r6, r4)
            r0.setContent(r4)
            com.sugarcube.app.base.ui.capturev2.h1 r0 = r12.E0()
            com.sugarcube.app.base.ui.capturev2.ArControl r0 = r0.N0()
            r12.f123389C = r0
            if (r0 == 0) goto L_0x0108
            com.sugarcube.app.base.ui.capturev2.q r4 = new com.sugarcube.app.base.ui.capturev2.q
            android.opengl.GLSurfaceView r5 = r13.f114500f
            java.lang.String r6 = "surfaceView"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            r4.<init>(r12, r5, r0)
            r12.f123390D = r4
            android.opengl.GLSurfaceView r0 = r13.f114500f
            r0.setVisibility(r2)
        L_0x0108:
            kotlin.jvm.internal.C17542s.g(r13)
            r12.K0(r13)
            androidx.activity.w r4 = r12.getOnBackPressedDispatcher()
            java.lang.String r13 = "<get-onBackPressedDispatcher>(...)"
            kotlin.jvm.internal.C17542s.i(r4, r13)
            com.sugarcube.app.base.ui.capturev2.F r7 = new com.sugarcube.app.base.ui.capturev2.F
            r7.<init>(r12)
            r8 = 2
            r9 = 0
            r6 = 0
            r5 = r12
            androidx.activity.y.b(r4, r5, r6, r7, r8, r9)
            com.sugarcube.app.base.ui.capturev2.h1 r13 = r12.E0()
            androidx.lifecycle.F r13 = r13.a1()
            com.sugarcube.app.base.ui.capturev2.G r0 = new com.sugarcube.app.base.ui.capturev2.G
            r0.<init>(r12)
            com.sugarcube.app.base.ui.capturev2.CaptureActivity$c r2 = new com.sugarcube.app.base.ui.capturev2.CaptureActivity$c
            r2.<init>(r0)
            r13.observe(r12, r2)
            android.view.Window r13 = r12.getWindow()
            if (r13 == 0) goto L_0x0143
            r0 = 128(0x80, float:1.794E-43)
            r13.addFlags(r0)
        L_0x0143:
            com.sugarcube.app.base.ui.capturev2.h1 r13 = r12.E0()
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            com.sugarcube.app.base.ui.capturev2.h1 r2 = r12.E0()
            java.util.UUID r2 = r2.m1()
            com.sugarcube.app.base.ui.capturev2.h1 r4 = r12.E0()
            java.util.UUID r4 = r4.r1()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = " onCreate sesssion="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " uuid="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            com.sugarcube.app.base.ui.capturev2.h1.R1(r13, r0, r3, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.CaptureActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.f123392F;
        if (orientationEventListener == null) {
            C17542s.z("orientationEventListener");
            orientationEventListener = null;
        }
        orientationEventListener.disable();
        this.f123393G = true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        OrientationEventListener orientationEventListener = this.f123392F;
        OrientationEventListener orientationEventListener2 = null;
        if (orientationEventListener == null) {
            C17542s.z("orientationEventListener");
            orientationEventListener = null;
        }
        if (orientationEventListener.canDetectOrientation()) {
            OrientationEventListener orientationEventListener3 = this.f123392F;
            if (orientationEventListener3 == null) {
                C17542s.z("orientationEventListener");
            } else {
                orientationEventListener2 = orientationEventListener3;
            }
            orientationEventListener2.enable();
        }
        if (this.f123393G) {
            this.f123393G = false;
            E0().C1();
        }
    }
}

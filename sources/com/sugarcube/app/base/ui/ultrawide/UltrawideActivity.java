package com.sugarcube.app.base.ui.ultrawide;

import JF.Z;
import OE.C13317i;
import QE.C13426c;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16814e;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YE.C13868b;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.Window;
import androidx.activity.j;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.navigation.fragment.NavHostFragment;
import bF.C14010a;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.core.logger.AnyKt;
import eF.U;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tF.C15078c;
import uI.C18055d;
import uI.C18068q;
import x4.C8937a;
import x4.C8951o;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018FX\u0002¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideActivity;", "Lcom/sugarcube/app/base/ui/BaseLocaleActivity;", "<init>", "()V", "Landroid/net/Uri;", "uri", "LXH/N;", "U0", "(Landroid/net/Uri;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onBackPressed", "finish", "", "pixelIntensity", "G0", "(F)V", "Lcom/google/ar/core/TrackingState;", "state", "Lcom/google/ar/core/TrackingFailureReason;", "reason", "W0", "(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)V", "Lcom/sugarcube/app/base/ui/ultrawide/I0;", "B", "LXH/o;", "L0", "()Lcom/sugarcube/app/base/ui/ultrawide/I0;", "viewModel", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "C", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "J0", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "setFirebaseInteractions", "(Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "firebaseInteractions", "Landroid/view/OrientationEventListener;", "D", "Landroid/view/OrientationEventListener;", "orientationEventListener", "Landroid/opengl/GLSurfaceView;", "E", "Landroid/opengl/GLSurfaceView;", "surfaceView", "Lcom/sugarcube/app/base/ui/ultrawide/j;", "F", "I0", "()Lcom/sugarcube/app/base/ui/ultrawide/j;", "arSurface", "Landroid/hardware/SensorManager;", "G", "K0", "()Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorEventListener;", "H", "Landroid/hardware/SensorEventListener;", "sensorListener", "I", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideActivity extends Hilt_UltrawideActivity {

    /* renamed from: I  reason: collision with root package name */
    public static final a f125419I = new a((DefaultConstructorMarker) null);

    /* renamed from: J  reason: collision with root package name */
    public static final int f125420J = 8;

    /* renamed from: B  reason: collision with root package name */
    private final C16824o f125421B = new h0(P.b(I0.class), new h(this), new g(this), new i((C17631a) null, this));

    /* renamed from: C  reason: collision with root package name */
    public FirebaseInteractions f125422C;

    /* renamed from: D  reason: collision with root package name */
    private OrientationEventListener f125423D;

    /* renamed from: E  reason: collision with root package name */
    private GLSurfaceView f125424E;

    /* renamed from: F  reason: collision with root package name */
    private final C16824o f125425F = C16825p.b(new C14314q(this));

    /* renamed from: G  reason: collision with root package name */
    private final C16824o f125426G = C16825p.b(new r(this));

    /* renamed from: H  reason: collision with root package name */
    private final SensorEventListener f125427H = new f(this);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Context context) {
            C17542s.j(context, "context");
            return I0.f125247A1.d(context);
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f125428a;

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
                f125428a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideActivity.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/UltrawideActivity$c", "Landroid/view/OrientationEventListener;", "", "orientation", "LXH/N;", "onOrientationChanged", "(I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends OrientationEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UltrawideActivity f125429a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UltrawideActivity ultrawideActivity) {
            super(ultrawideActivity);
            this.f125429a = ultrawideActivity;
        }

        public void onOrientationChanged(int i10) {
            this.f125429a.L0().T(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UltrawideActivity f125430a;

        d(UltrawideActivity ultrawideActivity) {
            this.f125430a = ultrawideActivity;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1370166847, i10, -1, "com.sugarcube.app.base.ui.ultrawide.UltrawideActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (UltrawideActivity.kt:179)");
                }
                C15078c.b(this.f125430a.L0().t1(), mVar, 0);
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
    static final class e implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f125431a;

        e(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f125431a = lVar;
        }

        public final C16818i<?> c() {
            return this.f125431a;
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
            this.f125431a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/UltrawideActivity$f", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "LXH/N;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements SensorEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UltrawideActivity f125432a;

        f(UltrawideActivity ultrawideActivity) {
            this.f125432a = ultrawideActivity;
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && sensor.getType() == 5) {
                float[] fArr = sensorEvent.values;
                C17542s.i(fArr, "values");
                Float g02 = C16870n.g0(fArr);
                if (g02 != null) {
                    UltrawideActivity ultrawideActivity = this.f125432a;
                    ultrawideActivity.L0().W(g02.floatValue());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f125433c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(j jVar) {
            super(0);
            this.f125433c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f125433c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f125434c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(j jVar) {
            super(0);
            this.f125434c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f125434c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f125435c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f125436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17631a aVar, j jVar) {
            super(0);
            this.f125435c = aVar;
            this.f125436d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f125435c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f125436d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideActivity.i.invoke():l3.a");
        }
    }

    /* access modifiers changed from: private */
    public static final C14304j H0(UltrawideActivity ultrawideActivity) {
        Log.d(AnyKt.SUGARCUBE_TAG, "lazy init UltrawideARSurface");
        GLSurfaceView gLSurfaceView = ultrawideActivity.f125424E;
        if (gLSurfaceView == null) {
            C17542s.z("surfaceView");
            gLSurfaceView = null;
        }
        return new C14304j(ultrawideActivity, gLSurfaceView, ultrawideActivity.J0());
    }

    private final SensorManager K0() {
        return (SensorManager) this.f125426G.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(UltrawideActivity ultrawideActivity) {
        I0 L02 = ultrawideActivity.L0();
        L02.u1().b().captureBackExit(L02.a1(), L02.Z0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(C13426c cVar, M m10, UltrawideActivity ultrawideActivity, M m11, U u10) {
        int i10 = u10 == null ? -1 : b.f125428a[u10.ordinal()];
        if (i10 == 1) {
            cVar.f114535e.getRoot().setVisibility(8);
            cVar.f114533c.getRoot().setVisibility(8);
            cVar.f114534d.setVisibility(0);
        } else if (i10 == 2) {
            if (cVar.f114533c.getRoot().getVisibility() != 0) {
                int i11 = m10.f144346a;
                if (i11 < 5) {
                    m10.f144346a = i11 + 1;
                    I0 L02 = ultrawideActivity.L0();
                    L02.u1().b().captureWarningLighting(L02.x1(), L02.p1(), L02.a1(), L02.Z0());
                }
                C13868b.f118106a.b("low light warning", YE.e.Capture);
            }
            cVar.f114533c.getRoot().setVisibility(0);
            cVar.f114535e.getRoot().setVisibility(8);
            cVar.f114534d.setVisibility(4);
        } else if (i10 == 3) {
            if (cVar.f114535e.getRoot().getVisibility() != 0) {
                int i12 = m11.f144346a;
                if (i12 < 5) {
                    m11.f144346a = i12 + 1;
                    I0 L03 = ultrawideActivity.L0();
                    L03.u1().b().captureWarningRotation(L03.x1(), L03.p1(), L03.a1(), L03.Z0());
                }
                C13868b.f118106a.b("rotation warning", YE.e.Capture);
            }
            cVar.f114535e.getRoot().setVisibility(0);
            cVar.f114533c.getRoot().setVisibility(8);
            cVar.f114534d.setVisibility(4);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(UltrawideActivity ultrawideActivity, C16807N n10) {
        ultrawideActivity.finish();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(UltrawideActivity ultrawideActivity, Uri uri) {
        if (uri != null) {
            ultrawideActivity.U0(uri);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Q0(UltrawideActivity ultrawideActivity, View view) {
        ultrawideActivity.L0().K();
    }

    /* access modifiers changed from: private */
    public static final void R0(C13426c cVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C17542s.g(view);
        Z.g(view, C16877v.e(cVar.f114535e.f114693b));
    }

    /* access modifiers changed from: private */
    public static final void S0(UltrawideActivity ultrawideActivity, View view) {
        ultrawideActivity.L0().A1(new C14316t());
    }

    /* access modifiers changed from: private */
    public static final C16807N T0() {
        return C16807N.f139792a;
    }

    private final void U0(Uri uri) {
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(uri);
            C17542s.i(data, "setData(...)");
            startActivity(data);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            L0().J1();
            throw th2;
        }
        L0().J1();
    }

    /* access modifiers changed from: private */
    public static final SensorManager V0(UltrawideActivity ultrawideActivity) {
        Object systemService = ultrawideActivity.getSystemService("sensor");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    public final void G0(float f10) {
        L0().F(f10);
    }

    public final C14304j I0() {
        return (C14304j) this.f125425F.getValue();
    }

    public final FirebaseInteractions J0() {
        FirebaseInteractions firebaseInteractions = this.f125422C;
        if (firebaseInteractions != null) {
            return firebaseInteractions;
        }
        C17542s.z("firebaseInteractions");
        return null;
    }

    public final I0 L0() {
        return (I0) this.f125421B.getValue();
    }

    public final void W0(TrackingState trackingState, TrackingFailureReason trackingFailureReason) {
        C17542s.j(trackingState, "state");
        C17542s.j(trackingFailureReason, "reason");
        L0().X(trackingState, trackingFailureReason);
    }

    public void finish() {
        super.finish();
        C8937a.f57483e.a(this);
    }

    @C16814e
    public void onBackPressed() {
        if (!L0().z1(new C14315s(this))) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13426c c10 = C13426c.c(getLayoutInflater());
        setContentView((View) c10.getRoot());
        C5187o p02 = getSupportFragmentManager().p0(C13317i.f113091w1);
        C17542s.h(p02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) p02;
        C8951o o02 = navHostFragment.o0();
        y yVar = new y(o02.O(), (Object) Kreativ.Capture.d.h.INSTANCE, (C18055d<?>) P.b(Kreativ.Capture.d.class), (Map<C18068q, F<?>>) X.j());
        C14010a.j(yVar);
        navHostFragment.o0().F0(yVar.c(), (Bundle) null);
        this.f125424E = c10.f114536f;
        boolean D10 = I0().D();
        Log.d(AnyKt.SUGARCUBE_TAG, "surfaceCreated = " + D10);
        c10.f114533c.f114690d.setOnClickListener(new C14306k(this));
        c10.getRoot().addOnLayoutChangeListener(new C14308l(c10));
        c10.f114535e.f114693b.setOnClickListener(new C14310m(this));
        L0().O().observe(this, new e(new C14311n(c10, new M(), this, new M())));
        this.f125423D = new c(this);
        L0().e1().observe(this, new e(new C14312o(this)));
        e0.a(L0().o1()).observe(this, new e(new C14313p(this)));
        ComposeView composeView = c10.f114532b;
        composeView.setViewCompositionStrategy(s1.b.f19575b);
        composeView.setContent(c1.c.c(-1370166847, true, new d(this)));
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.f125423D;
        if (orientationEventListener == null) {
            C17542s.z("orientationEventListener");
            orientationEventListener = null;
        }
        orientationEventListener.disable();
        K0().unregisterListener(this.f125427H);
        L0().C1();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        OrientationEventListener orientationEventListener = this.f125423D;
        OrientationEventListener orientationEventListener2 = null;
        if (orientationEventListener == null) {
            C17542s.z("orientationEventListener");
            orientationEventListener = null;
        }
        if (orientationEventListener.canDetectOrientation()) {
            OrientationEventListener orientationEventListener3 = this.f125423D;
            if (orientationEventListener3 == null) {
                C17542s.z("orientationEventListener");
            } else {
                orientationEventListener2 = orientationEventListener3;
            }
            orientationEventListener2.enable();
        }
        K0().registerListener(this.f125427H, K0().getDefaultSensor(5), 3);
    }
}

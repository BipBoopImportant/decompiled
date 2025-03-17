package com.sugarcube.app.base.ui.hybrid;

import JF.Z;
import OE.C13317i;
import QE.C13425b;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16814e;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YE.C13868b;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
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
import com.google.ar.core.ArCoreApk;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import eF.U;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
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

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@BX.¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridActivity;", "Lcom/sugarcube/app/base/ui/BaseLocaleActivity;", "<init>", "()V", "Landroid/net/Uri;", "uri", "LXH/N;", "T0", "(Landroid/net/Uri;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onBackPressed", "finish", "Lcom/sugarcube/app/base/ui/hybrid/E0;", "B", "LXH/o;", "K0", "()Lcom/sugarcube/app/base/ui/hybrid/E0;", "viewModel", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "C", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "I0", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "setFirebaseInteractions", "(Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "firebaseInteractions", "Lcom/sugarcube/app/base/ui/hybrid/o;", "value", "D", "Lcom/sugarcube/app/base/ui/hybrid/o;", "H0", "()Lcom/sugarcube/app/base/ui/hybrid/o;", "arSurface", "Landroid/view/OrientationEventListener;", "E", "Landroid/view/OrientationEventListener;", "orientationEventListener", "Landroid/hardware/SensorManager;", "F", "J0", "()Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorEventListener;", "G", "Landroid/hardware/SensorEventListener;", "sensorListener", "H", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridActivity extends Hilt_HybridActivity {

    /* renamed from: H  reason: collision with root package name */
    public static final a f124750H = new a((DefaultConstructorMarker) null);

    /* renamed from: I  reason: collision with root package name */
    public static final int f124751I = 8;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public static ArCoreApk.Availability f124752J = ArCoreApk.Availability.UNKNOWN_TIMED_OUT;

    /* renamed from: B  reason: collision with root package name */
    private final C16824o f124753B = new h0(P.b(E0.class), new h(this), new g(this), new i((C17631a) null, this));

    /* renamed from: C  reason: collision with root package name */
    public FirebaseInteractions f124754C;

    /* renamed from: D  reason: collision with root package name */
    private C14275o f124755D;

    /* renamed from: E  reason: collision with root package name */
    private OrientationEventListener f124756E;

    /* renamed from: F  reason: collision with root package name */
    private final C16824o f124757F = C16825p.b(new C14277q(this));

    /* renamed from: G  reason: collision with root package name */
    private final SensorEventListener f124758G = new f(this);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8FX\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/ar/core/ArCoreApk$Availability;", "c", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "a", "", "b", "()Z", "isSupported$annotations", "isSupported", "", "ENABLE_AUTO_CAPTURE", "Ljava/lang/String;", "arCoreAvailability", "Lcom/google/ar/core/ArCoreApk$Availability;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/google/ar/core/ArCoreApk$Availability;", "<anonymous>", "(LQJ/Q;)Lcom/google/ar/core/ArCoreApk$Availability;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridActivity$Companion$updateAvailability$2", f = "HybridActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.hybrid.HybridActivity$a$a  reason: collision with other inner class name */
        static final class C3062a extends l implements p<Q, C17164e<? super ArCoreApk.Availability>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124759c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Context f124760d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3062a(Context context, C17164e<? super C3062a> eVar) {
                super(2, eVar);
                this.f124760d = context;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3062a(this.f124760d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super ArCoreApk.Availability> eVar) {
                return ((C3062a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f124759c == 0) {
                    y.b(obj);
                    ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(this.f124760d);
                    C17542s.i(checkAvailability, "checkAvailability(...)");
                    String name = checkAvailability.name();
                    Log.d(AnyKt.SUGARCUBE_TAG, "ArCoreApk availability is " + name);
                    HybridActivity.f124752J = checkAvailability;
                    return checkAvailability;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object c(Context context, C17164e<? super ArCoreApk.Availability> eVar) {
            return C16310i.g(C16311i0.a(), new C3062a(context, (C17164e<? super C3062a>) null), eVar);
        }

        public final Object a(Context context, C17164e<? super ArCoreApk.Availability> eVar) {
            return HybridActivity.f124752J.isSupported() ? HybridActivity.f124752J : c(context, eVar);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28 && HybridActivity.f124752J.isSupported();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124761a;

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
                f124761a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.HybridActivity.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridActivity$c", "Landroid/view/OrientationEventListener;", "", "orientation", "LXH/N;", "onOrientationChanged", "(I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends OrientationEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridActivity f124762a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(HybridActivity hybridActivity) {
            super(hybridActivity);
            this.f124762a = hybridActivity;
        }

        public void onOrientationChanged(int i10) {
            this.f124762a.K0().T(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridActivity f124763a;

        d(HybridActivity hybridActivity) {
            this.f124763a = hybridActivity;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(5322753, i10, -1, "com.sugarcube.app.base.ui.hybrid.HybridActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HybridActivity.kt:198)");
                }
                C15078c.b(this.f124763a.K0().v1(), mVar, 0);
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
        private final /* synthetic */ C17642l f124764a;

        e(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124764a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124764a;
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
            this.f124764a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridActivity$f", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "LXH/N;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements SensorEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridActivity f124765a;

        f(HybridActivity hybridActivity) {
            this.f124765a = hybridActivity;
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            Float g02;
            if (sensorEvent != null) {
                HybridActivity hybridActivity = this.f124765a;
                if (sensorEvent.sensor.getType() == 5 && (fArr = sensorEvent.values) != null && (g02 = C16870n.g0(fArr)) != null) {
                    hybridActivity.K0().W(g02.floatValue());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f124766c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(j jVar) {
            super(0);
            this.f124766c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f124766c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f124767c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(j jVar) {
            super(0);
            this.f124767c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f124767c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124768c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f124769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17631a aVar, j jVar) {
            super(0);
            this.f124768c = aVar;
            this.f124769d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f124768c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f124769d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.HybridActivity.i.invoke():l3.a");
        }
    }

    private final SensorManager J0() {
        return (SensorManager) this.f124757F.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(HybridActivity hybridActivity) {
        E0 K02 = hybridActivity.K0();
        K02.w1().b().captureBackExit(K02.e1(), K02.d1());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(C13425b bVar, M m10, HybridActivity hybridActivity, M m11, U u10) {
        int i10 = u10 == null ? -1 : b.f124761a[u10.ordinal()];
        if (i10 == 1) {
            bVar.f114514e.getRoot().setVisibility(8);
            bVar.f114512c.getRoot().setVisibility(8);
            bVar.f114513d.setVisibility(0);
        } else if (i10 == 2) {
            if (bVar.f114512c.getRoot().getVisibility() != 0) {
                int i11 = m10.f144346a;
                if (i11 < 5) {
                    m10.f144346a = i11 + 1;
                    E0 K02 = hybridActivity.K0();
                    K02.w1().b().captureWarningLighting(K02.y1(), K02.r1(), K02.e1(), K02.d1());
                }
                C13868b.f118106a.b("low light warning", YE.e.Capture);
            }
            bVar.f114512c.getRoot().setVisibility(0);
            bVar.f114514e.getRoot().setVisibility(8);
            bVar.f114513d.setVisibility(4);
        } else if (i10 == 3) {
            if (bVar.f114514e.getRoot().getVisibility() != 0) {
                int i12 = m11.f144346a;
                if (i12 < 5) {
                    m11.f144346a = i12 + 1;
                    E0 K03 = hybridActivity.K0();
                    K03.w1().b().captureWarningRotation(K03.y1(), K03.r1(), K03.e1(), K03.d1());
                }
                C13868b.f118106a.b("rotation warning", YE.e.Capture);
            }
            bVar.f114514e.getRoot().setVisibility(0);
            bVar.f114512c.getRoot().setVisibility(8);
            bVar.f114513d.setVisibility(4);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(HybridActivity hybridActivity, C16807N n10) {
        hybridActivity.finish();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(HybridActivity hybridActivity, Uri uri) {
        if (uri != null) {
            hybridActivity.T0(uri);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void P0(HybridActivity hybridActivity, View view) {
        hybridActivity.K0().K();
    }

    /* access modifiers changed from: private */
    public static final void Q0(C13425b bVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C17542s.g(view);
        Z.g(view, C16877v.e(bVar.f114514e.f114693b));
    }

    /* access modifiers changed from: private */
    public static final void R0(HybridActivity hybridActivity, View view) {
        hybridActivity.K0().C1(new C14283x());
    }

    /* access modifiers changed from: private */
    public static final C16807N S0() {
        return C16807N.f139792a;
    }

    private final void T0(Uri uri) {
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(uri);
            C17542s.i(data, "setData(...)");
            startActivity(data);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            K0().O1();
            throw th2;
        }
        K0().O1();
    }

    /* access modifiers changed from: private */
    public static final SensorManager U0(HybridActivity hybridActivity) {
        Object systemService = hybridActivity.getSystemService("sensor");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    public final C14275o H0() {
        C14275o oVar = this.f124755D;
        if (oVar != null) {
            return oVar;
        }
        C17542s.z("arSurface");
        return null;
    }

    public final FirebaseInteractions I0() {
        FirebaseInteractions firebaseInteractions = this.f124754C;
        if (firebaseInteractions != null) {
            return firebaseInteractions;
        }
        C17542s.z("firebaseInteractions");
        return null;
    }

    public final E0 K0() {
        return (E0) this.f124753B.getValue();
    }

    public void finish() {
        super.finish();
        C8937a.f57483e.a(this);
    }

    @C16814e
    public void onBackPressed() {
        if (!K0().B1(new C14276p(this))) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C13425b c10 = C13425b.c(getLayoutInflater());
        setContentView((View) c10.getRoot());
        C5187o p02 = getSupportFragmentManager().p0(C13317i.f113091w1);
        C17542s.h(p02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) p02;
        C8951o o02 = navHostFragment.o0();
        x4.y yVar = new x4.y(o02.O(), (Object) Kreativ.Capture.Hybrid.d.INSTANCE, (C18055d<?>) P.b(Kreativ.Capture.Hybrid.class), (Map<C18068q, F<?>>) X.j());
        C14010a.e(yVar);
        Uri uri = null;
        navHostFragment.o0().F0(yVar.c(), (Bundle) null);
        Uri data = getIntent().getData();
        if (data != null) {
            String uri2 = data.toString();
            C17542s.i(uri2, "toString(...)");
            if (uri2.length() > 0) {
                String uri3 = data.toString();
                C17542s.i(uri3, "toString(...)");
                uri = Uri.parse(uri3);
            }
        }
        Bundle extras = getIntent().getExtras();
        String str2 = "";
        if (extras != null) {
            if (uri == null || (str = uri.getQueryParameter("roomType")) == null) {
                str = str2;
            }
            String string = extras.getString("roomType", str);
            if (string != null) {
                str2 = string;
            }
        }
        RoomType typeFromKey = RoomType.Companion.getTypeFromKey(str2);
        String apiKey = typeFromKey.getApiKey();
        Log.d(AnyKt.SUGARCUBE_TAG, "Room Type: " + apiKey);
        E0 K02 = K0();
        RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
        Resources resources = getResources();
        C17542s.i(resources, "getResources(...)");
        K02.b2(typeFromKey, roomTypeRenderer.getTitle(typeFromKey, resources));
        GLSurfaceView gLSurfaceView = c10.f114515f;
        C17542s.i(gLSurfaceView, "surfaceView");
        this.f124755D = new C14275o(this, gLSurfaceView, I0());
        c10.f114512c.f114690d.setOnClickListener(new r(this));
        c10.getRoot().addOnLayoutChangeListener(new C14278s(c10));
        c10.f114514e.f114693b.setOnClickListener(new C14279t(this));
        K0().O().observe(this, new e(new C14280u(c10, new M(), this, new M())));
        this.f124756E = new c(this);
        K0().i1().observe(this, new e(new C14281v(this)));
        e0.a(K0().q1()).observe(this, new e(new C14282w(this)));
        ComposeView composeView = c10.f114511b;
        composeView.setViewCompositionStrategy(s1.b.f19575b);
        composeView.setContent(c1.c.c(5322753, true, new d(this)));
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.f124756E;
        if (orientationEventListener == null) {
            C17542s.z("orientationEventListener");
            orientationEventListener = null;
        }
        orientationEventListener.disable();
        J0().unregisterListener(this.f124758G);
        K0().E1();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        OrientationEventListener orientationEventListener = this.f124756E;
        OrientationEventListener orientationEventListener2 = null;
        if (orientationEventListener == null) {
            C17542s.z("orientationEventListener");
            orientationEventListener = null;
        }
        if (orientationEventListener.canDetectOrientation()) {
            OrientationEventListener orientationEventListener3 = this.f124756E;
            if (orientationEventListener3 == null) {
                C17542s.z("orientationEventListener");
            } else {
                orientationEventListener2 = orientationEventListener3;
            }
            orientationEventListener2.enable();
        }
        J0().registerListener(this.f124758G, J0().getDefaultSensor(5), 3);
    }
}

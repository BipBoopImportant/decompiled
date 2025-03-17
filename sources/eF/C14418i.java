package eF;

import XH.C16807N;
import XH.C16818i;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.f0;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 K2\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010\u001bR\u001a\u0010&\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0006R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010$R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010$R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010:\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00107R\"\u0010<\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u00107R\"\u0010>\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u00107R\"\u0010@\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u00107R\"\u0010B\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u00107R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070C8\u0006¢\u0006\f\n\u0004\bG\u0010E\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"LeF/i;", "Landroidx/lifecycle/f0;", "<init>", "()V", "", "Q", "()Z", "LeF/U;", "N", "()LeF/U;", "LXH/N;", "L", "M", "value", "S", "(Z)V", "V", "R", "U", "K", "", "angle", "T", "(I)V", "", "pixelIntensity", "F", "(F)V", "Lcom/google/ar/core/TrackingState;", "state", "Lcom/google/ar/core/TrackingFailureReason;", "reason", "X", "(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)V", "W", "m", "Z", "P", "isLandscape", "", "n", "Ljava/util/List;", "pixelIntensityList", "o", "I", "pixelIntensityIndex", "p", "previousIntensityState", "q", "previousLightSensorState", "r", "previousRotationState", "Landroidx/lifecycle/K;", "kotlin.jvm.PlatformType", "s", "Landroidx/lifecycle/K;", "warningsEnabled", "t", "rotationDetected", "u", "darkRoomDetectionEnabled", "v", "lowLightDetected", "w", "insufficientLightDetected", "x", "sensorLowLightDetected", "Landroidx/lifecycle/F;", "y", "Landroidx/lifecycle/F;", "darkRoomDetected", "z", "O", "()Landroidx/lifecycle/F;", "warningState", "A", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eF.i  reason: case insensitive filesystem */
public class C14418i extends f0 {

    /* renamed from: A  reason: collision with root package name */
    public static final a f126704A = new a((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final int f126705B = 8;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f126706m;

    /* renamed from: n  reason: collision with root package name */
    private List<Float> f126707n;

    /* renamed from: o  reason: collision with root package name */
    private int f126708o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f126709p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f126710q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f126711r;

    /* renamed from: s  reason: collision with root package name */
    private final K<Boolean> f126712s;

    /* renamed from: t  reason: collision with root package name */
    private final K<Boolean> f126713t;

    /* renamed from: u  reason: collision with root package name */
    private final K<Boolean> f126714u;

    /* renamed from: v  reason: collision with root package name */
    private final K<Boolean> f126715v;

    /* renamed from: w  reason: collision with root package name */
    private final K<Boolean> f126716w;

    /* renamed from: x  reason: collision with root package name */
    private final K<Boolean> f126717x;

    /* renamed from: y  reason: collision with root package name */
    private final F<Boolean> f126718y;

    /* renamed from: z  reason: collision with root package name */
    private final F<U> f126719z;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LeF/i$a;", "", "<init>", "()V", "", "PIXEL_INTENSITY_THRESHOLD", "F", "SENSOR_LIGHT_THRESHOLD", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eF.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eF.i$b */
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f126720a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f126720a = lVar;
        }

        public final C16818i<?> c() {
            return this.f126720a;
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
            this.f126720a.invoke(obj);
        }
    }

    public C14418i() {
        ArrayList arrayList = new ArrayList(30);
        for (int i10 = 0; i10 < 30; i10++) {
            arrayList.add(Float.valueOf(1.0f));
        }
        this.f126707n = arrayList;
        Boolean bool = Boolean.FALSE;
        K<Boolean> k10 = new K<>(bool);
        this.f126712s = k10;
        K<Boolean> k11 = new K<>(bool);
        this.f126713t = k11;
        K<Boolean> k12 = new K<>(Boolean.TRUE);
        this.f126714u = k12;
        K<Boolean> k13 = new K<>(bool);
        this.f126715v = k13;
        K<Boolean> k14 = new K<>(bool);
        this.f126716w = k14;
        K<Boolean> k15 = new K<>(bool);
        this.f126717x = k15;
        I i11 = new I();
        i11.b(k12, new b(new C14411b(i11, this)));
        i11.b(k13, new b(new C14412c(i11, this)));
        i11.b(k14, new b(new C14413d(i11, this)));
        i11.b(k15, new b(new C14414e(i11, this)));
        this.f126718y = i11;
        I i12 = new I();
        i12.b(k10, new b(new C14415f(i12, this)));
        i12.b(i11, new b(new C14416g(i12, this)));
        i12.b(k11, new b(new C14417h(i12, this)));
        this.f126719z = i12;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(I i10, C14418i iVar, Boolean bool) {
        i10.setValue(Boolean.valueOf(iVar.Q()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(I i10, C14418i iVar, Boolean bool) {
        i10.setValue(Boolean.valueOf(iVar.Q()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(I i10, C14418i iVar, Boolean bool) {
        i10.setValue(Boolean.valueOf(iVar.Q()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(I i10, C14418i iVar, Boolean bool) {
        i10.setValue(Boolean.valueOf(iVar.Q()));
        return C16807N.f139792a;
    }

    private final U N() {
        Boolean value = this.f126712s.getValue();
        Boolean bool = Boolean.TRUE;
        return C17542s.e(value, bool) ? C17542s.e(this.f126713t.getValue(), bool) ? U.ROTATED : C17542s.e(this.f126718y.getValue(), bool) ? U.DARK_ROOM : U.NONE : U.NONE;
    }

    private final boolean Q() {
        Boolean value = this.f126714u.getValue();
        Boolean bool = Boolean.TRUE;
        if (C17542s.e(value, bool)) {
            return C17542s.e(this.f126715v.getValue(), bool) || C17542s.e(this.f126716w.getValue(), bool) || C17542s.e(this.f126717x.getValue(), bool);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(I i10, C14418i iVar, Boolean bool) {
        i10.setValue(iVar.N());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z(I i10, C14418i iVar, Boolean bool) {
        i10.setValue(iVar.N());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(I i10, C14418i iVar, Boolean bool) {
        i10.setValue(iVar.N());
        return C16807N.f139792a;
    }

    public final void F(float f10) {
        List<Float> list = this.f126707n;
        int i10 = this.f126708o;
        this.f126708o = i10 + 1;
        list.set(i10, Float.valueOf(f10));
        boolean z10 = false;
        if (this.f126708o >= this.f126707n.size()) {
            this.f126708o = 0;
        }
        if (C16877v.i0(this.f126707n) <= 0.25d) {
            z10 = true;
        }
        if (z10 != this.f126709p) {
            this.f126709p = z10;
            S(z10);
        }
    }

    public final void K() {
        this.f126714u.postValue(Boolean.FALSE);
    }

    public final void L() {
        this.f126712s.postValue(Boolean.FALSE);
    }

    public final void M() {
        this.f126712s.postValue(Boolean.TRUE);
    }

    public final F<U> O() {
        return this.f126719z;
    }

    public boolean P() {
        return this.f126706m;
    }

    public final void R(boolean z10) {
        this.f126716w.postValue(Boolean.valueOf(z10));
    }

    public final void S(boolean z10) {
        this.f126715v.postValue(Boolean.valueOf(z10));
    }

    public final void T(int i10) {
        boolean z10 = true;
        if (!P() ? i10 >= 0 && (i10 <= 70 || i10 > 290) : i10 >= 250 && i10 <= 290) {
            z10 = false;
        }
        if (z10 != this.f126711r) {
            this.f126711r = z10;
            U(z10);
        }
    }

    public final void U(boolean z10) {
        this.f126713t.postValue(Boolean.valueOf(z10));
    }

    public final void V(boolean z10) {
        this.f126717x.postValue(Boolean.valueOf(z10));
    }

    public final void W(float f10) {
        boolean z10 = f10 < 1.0f;
        if (z10 != this.f126710q) {
            this.f126710q = z10;
            V(z10);
        }
    }

    public final void X(TrackingState trackingState, TrackingFailureReason trackingFailureReason) {
        C17542s.j(trackingState, "state");
        C17542s.j(trackingFailureReason, "reason");
        boolean z10 = false;
        if (trackingState != TrackingState.TRACKING && trackingFailureReason == TrackingFailureReason.INSUFFICIENT_LIGHT) {
            z10 = true;
        }
        R(z10);
    }
}

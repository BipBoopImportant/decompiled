package lG;

import A1.B;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineTouchInteractions;
import com.sugarcube.decorate.v2.internal.manager.touch.TouchManager;
import dI.C17164e;
import eI.C17187b;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import o1.C5667g;
import tI.C17978n;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 A2\u00020\u0001:\u0002\b/B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0015J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010)J7\u0010.\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u00102R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b098\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"LlG/a;", "Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "<init>", "()V", "", "zoom", "effectiveRotation", "LlG/a$b;", "b", "(FF)LlG/a$b;", "rotation", "", "c", "(F)Z", "d", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineTouchInteractions;", "interactions", "LXH/N;", "registerTouchInteractions", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineTouchInteractions;)V", "isTapGesturesEnabled", "()Z", "Lo1/g;", "offset", "onTap-k-4lQ0M", "(J)V", "onTap", "onDoubleTap-k-4lQ0M", "onDoubleTap", "onLongPress-k-4lQ0M", "onLongPress", "isDragGestureEnabled", "LA1/B;", "change", "dragAmount", "onDrag-Uv8p0NA", "(LA1/B;J)V", "onDrag", "isMultiTouchTransformGesturesEnabled", "isActive", "isTransforming", "(Z)V", "centroid", "pan", "onMultiTouchTransformGesture-IUXd7x4", "(JJFFF)V", "onMultiTouchTransformGesture", "a", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineTouchInteractions;", "engineTouchInteractions", "J", "startDragOffset", "LlG/a$b;", "activeMultiTouchGestureType", "LTJ/B;", "LTJ/B;", "_isTransformingFlow", "LTJ/g;", "e", "LTJ/g;", "isTransformingFlow", "()LTJ/g;", "f", "Z", "isMultiTouching", "g", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lG.a  reason: case insensitive filesystem */
public final class C17550a implements TouchManager {

    /* renamed from: g  reason: collision with root package name */
    public static final C3523a f144391g = new C3523a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f144392h = 8;

    /* renamed from: a  reason: collision with root package name */
    private EngineTouchInteractions f144393a;

    /* renamed from: b  reason: collision with root package name */
    private long f144394b = C5667g.f26701b.b();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b f144395c = b.NONE;

    /* renamed from: d  reason: collision with root package name */
    private final C16505B<Boolean> f144396d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<Boolean> f144397e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f144398f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LlG/a$a;", "", "<init>", "()V", "", "ZOOM_TOUCH_SLOP_LOWER_BOUNDS", "F", "ZOOM_TOUCH_SLOP_UPPER_BOUNDS", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lG.a$a  reason: collision with other inner class name */
    public static final class C3523a {
        public /* synthetic */ C3523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3523a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LlG/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "PAN", "ZOOM", "ROTATE", "NONE", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lG.a$b */
    private enum b {
        PAN,
        ZOOM,
        ROTATE,
        NONE;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lG.a$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f144399a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                lG.a$b[] r0 = lG.C17550a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lG.a$b r1 = lG.C17550a.b.PAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lG.a$b r1 = lG.C17550a.b.ZOOM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                lG.a$b r1 = lG.C17550a.b.ROTATE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f144399a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lG.C17550a.c.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isTransforming", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.manager.touch.TouchManagerImpl$isTransformingFlow$1", f = "TouchManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lG.a$d */
    static final class d extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f144400c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f144401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17550a f144402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17550a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f144402e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f144402e, eVar);
            dVar.f144401d = ((Boolean) obj).booleanValue();
            return dVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((d) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f144400c == 0) {
                y.b(obj);
                if (!this.f144401d) {
                    this.f144402e.f144395c = b.NONE;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C17550a() {
        C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
        this.f144396d = a10;
        this.f144397e = C16534i.R(a10, new d(this, (C17164e<? super d>) null));
    }

    private final b b(float f10, float f11) {
        b bVar = this.f144395c;
        if (bVar != b.NONE) {
            return bVar;
        }
        isTransforming(true);
        this.f144398f = true;
        return f11 == 0.0f ? d(f10) ? b.PAN : b.ZOOM : c(f11) ? b.ROTATE : this.f144395c;
    }

    private final boolean c(float f10) {
        return true;
    }

    private final boolean d(float f10) {
        return C17978n.c(0.985f, 1.015f).b(Float.valueOf(f10));
    }

    public boolean isDragGestureEnabled() {
        return true;
    }

    public boolean isMultiTouchTransformGesturesEnabled() {
        return true;
    }

    public boolean isTapGesturesEnabled() {
        return true;
    }

    public void isTransforming(boolean z10) {
        this.f144396d.a(Boolean.valueOf(z10));
        if (!z10) {
            this.f144394b = C5667g.f26701b.b();
            this.f144398f = false;
        }
    }

    public C16532g<Boolean> isTransformingFlow() {
        return this.f144397e;
    }

    /* renamed from: onDoubleTap-k-4lQ0M  reason: not valid java name */
    public void m85onDoubleTapk4lQ0M(long j10) {
        EngineTouchInteractions engineTouchInteractions = this.f144393a;
        if (engineTouchInteractions == null) {
            C17542s.z("engineTouchInteractions");
            engineTouchInteractions = null;
        }
        engineTouchInteractions.m59processDoubleTapEventk4lQ0M(j10);
    }

    /* renamed from: onDrag-Uv8p0NA  reason: not valid java name */
    public void m86onDragUv8p0NA(B b10, long j10) {
        C17542s.j(b10, "change");
        if (!this.f144398f) {
            if (C5667g.j(this.f144394b, C5667g.f26701b.b())) {
                this.f144394b = b10.k();
            }
            isTransforming(true);
            EngineTouchInteractions engineTouchInteractions = this.f144393a;
            if (engineTouchInteractions == null) {
                C17542s.z("engineTouchInteractions");
                engineTouchInteractions = null;
            }
            engineTouchInteractions.m60processDragEvent3MmeM6k(this.f144394b, b10);
        }
    }

    /* renamed from: onLongPress-k-4lQ0M  reason: not valid java name */
    public void m87onLongPressk4lQ0M(long j10) {
        EngineTouchInteractions engineTouchInteractions = this.f144393a;
        if (engineTouchInteractions == null) {
            C17542s.z("engineTouchInteractions");
            engineTouchInteractions = null;
        }
        engineTouchInteractions.m61processLongPressEventk4lQ0M(j10);
    }

    /* renamed from: onMultiTouchTransformGesture-IUXd7x4  reason: not valid java name */
    public void m88onMultiTouchTransformGestureIUXd7x4(long j10, long j11, float f10, float f11, float f12) {
        b b10 = b(f10, f11);
        this.f144395c = b10;
        int i10 = c.f144399a[b10.ordinal()];
        EngineTouchInteractions engineTouchInteractions = null;
        if (i10 == 1) {
            EngineTouchInteractions engineTouchInteractions2 = this.f144393a;
            if (engineTouchInteractions2 == null) {
                C17542s.z("engineTouchInteractions");
            } else {
                engineTouchInteractions = engineTouchInteractions2;
            }
            engineTouchInteractions.m62processPanEventk4lQ0M(j11);
        } else if (i10 == 2) {
            EngineTouchInteractions engineTouchInteractions3 = this.f144393a;
            if (engineTouchInteractions3 == null) {
                C17542s.z("engineTouchInteractions");
            } else {
                engineTouchInteractions = engineTouchInteractions3;
            }
            engineTouchInteractions.m64processZoomEvent3MmeM6k(j10, f10);
        } else if (i10 == 3) {
            EngineTouchInteractions engineTouchInteractions4 = this.f144393a;
            if (engineTouchInteractions4 == null) {
                C17542s.z("engineTouchInteractions");
            } else {
                engineTouchInteractions = engineTouchInteractions4;
            }
            engineTouchInteractions.processRotateEvent(f12);
        }
    }

    /* renamed from: onTap-k-4lQ0M  reason: not valid java name */
    public void m89onTapk4lQ0M(long j10) {
        EngineTouchInteractions engineTouchInteractions = this.f144393a;
        if (engineTouchInteractions == null) {
            C17542s.z("engineTouchInteractions");
            engineTouchInteractions = null;
        }
        engineTouchInteractions.m63processTapEventk4lQ0M(j10);
    }

    public void registerTouchInteractions(EngineTouchInteractions engineTouchInteractions) {
        C17542s.j(engineTouchInteractions, "interactions");
        this.f144393a = engineTouchInteractions;
    }
}

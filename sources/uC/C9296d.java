package Uc;

import QJ.C16320n;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.x;
import XH.y;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import dI.C17164e;
import f1.C5309k;
import f1.C5310l;
import f1.m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import oa.C8617a;
import oa.C8619c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002%\u001dB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR+\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@@X\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010*\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$8F@@X\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010/\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028@@@X\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0005R\u0014\u00102\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b8B@BX\u0002¢\u0006\u0012\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0016R/\u0010;\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u001e\u001a\u0004\b8\u00109\"\u0004\b:\u0010\nR/\u0010A\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00018B@BX\u0002¢\u0006\u0012\n\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00028F@FX\u000e¢\u0006\f\u001a\u0004\bC\u0010-\"\u0004\bD\u0010\u0005¨\u0006F"}, d2 = {"LUc/d;", "", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "<init>", "(Lcom/google/android/gms/maps/model/CameraPosition;)V", "LUc/d$b;", "callback", "LXH/N;", "o", "(LUc/d$b;)V", "Loa/c;", "map", "Loa/a;", "update", "", "durationMs", "LQJ/n;", "continuation", "w", "(Loa/c;Loa/a;ILQJ/n;)V", "z", "(Loa/c;)V", "m", "(Loa/a;ILdI/e;)Ljava/lang/Object;", "v", "(Loa/a;)V", "", "<set-?>", "a", "LU0/r0;", "u", "()Z", "B", "(Z)V", "isMoving", "LUc/a;", "b", "getCameraMoveStartedReason", "()LUc/a;", "x", "(LUc/a;)V", "cameraMoveStartedReason", "c", "t", "()Lcom/google/android/gms/maps/model/CameraPosition;", "D", "rawPosition", "d", "LXH/N;", "lock", "e", "p", "()Loa/c;", "y", "f", "r", "()LUc/d$b;", "C", "onMapChanged", "g", "q", "()Ljava/lang/Object;", "A", "(Ljava/lang/Object;)V", "movementOwner", "value", "s", "setPosition", "h", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.d  reason: case insensitive filesystem */
public final class C9296d {

    /* renamed from: h  reason: collision with root package name */
    public static final a f64230h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f64231i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final C5309k<C9296d, CameraPosition> f64232j = C5310l.a(new C9290b(), new C9293c());

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f64233a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f64234b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f64235c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16807N f64236d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f64237e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f64238f;

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f64239g;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LUc/d$a;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "LUc/d;", "b", "(Lcom/google/android/gms/maps/model/CameraPosition;)LUc/d;", "Lf1/k;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C9296d c(a aVar, CameraPosition cameraPosition, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cameraPosition = new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f);
            }
            return aVar.b(cameraPosition);
        }

        public final C5309k<C9296d, CameraPosition> a() {
            return C9296d.f64232j;
        }

        public final C9296d b(CameraPosition cameraPosition) {
            C17542s.j(cameraPosition, "position");
            return new C9296d(cameraPosition, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bâ\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUc/d$b;", "", "Loa/c;", "newMap", "LXH/N;", "b", "(Loa/c;)V", "a", "()V", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.d$b */
    private interface b {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Uc.d$b$a */
        public static final class a {
            public static void a(b bVar) {
            }
        }

        void a();

        void b(C8619c cVar);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.CameraPositionState", f = "CameraPositionState.kt", l = {335}, m = "animate")
    /* renamed from: Uc.d$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f64240c;

        /* renamed from: d  reason: collision with root package name */
        Object f64241d;

        /* renamed from: e  reason: collision with root package name */
        Object f64242e;

        /* renamed from: f  reason: collision with root package name */
        int f64243f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f64244g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C9296d f64245h;

        /* renamed from: i  reason: collision with root package name */
        int f64246i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C9296d dVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f64245h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f64244g = obj;
            this.f64246i |= Integer.MIN_VALUE;
            return this.f64245h.m((C8617a) null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.d$d  reason: collision with other inner class name */
    static final class C1119d implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9296d f64247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f64248b;

        C1119d(C9296d dVar, e eVar) {
            this.f64247a = dVar;
            this.f64248b = eVar;
        }

        public final void a(Throwable th2) {
            this.f64247a.f64236d;
            C16807N n10 = C16807N.f139792a;
            C9296d dVar = this.f64247a;
            e eVar = this.f64248b;
            synchronized (n10) {
                if (dVar.r() == eVar) {
                    dVar.C((b) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Uc/d$e", "LUc/d$b;", "Loa/c;", "newMap", "LXH/N;", "b", "(Loa/c;)V", "a", "()V", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.d$e */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<C16807N> f64249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C9296d f64250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8617a f64251c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f64252d;

        e(C16320n<? super C16807N> nVar, C9296d dVar, C8617a aVar, int i10) {
            this.f64249a = nVar;
            this.f64250b = dVar;
            this.f64251c = aVar;
            this.f64252d = i10;
        }

        public void a() {
            C16320n<C16807N> nVar = this.f64249a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(new CancellationException("Animation cancelled"))));
        }

        public void b(C8619c cVar) {
            if (cVar != null) {
                this.f64250b.w(cVar, this.f64251c, this.f64252d, this.f64249a);
                return;
            }
            C16320n<C16807N> nVar = this.f64249a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(new CancellationException("internal error; no GoogleMap available"))));
            throw new IllegalStateException("internal error; no GoogleMap available to animate position");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.d$f */
    static final class f implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8617a f64253a;

        f(C8617a aVar) {
            this.f64253a = aVar;
        }

        public void a() {
            b.a.a(this);
        }

        public final void b(C8619c cVar) {
            if (cVar != null) {
                cVar.h(this.f64253a);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.d$g */
    static final class g implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8619c f64254a;

        g(C8619c cVar) {
            this.f64254a = cVar;
        }

        public void a() {
            b.a.a(this);
        }

        public final void b(C8619c cVar) {
            if (cVar == null) {
                this.f64254a.Q();
                return;
            }
            throw new IllegalStateException("New GoogleMap unexpectedly set while an animation was still running");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Uc/d$h", "Loa/c$a;", "LXH/N;", "onCancel", "()V", "a", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.d$h */
    public static final class h implements C8619c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<C16807N> f64255a;

        h(C16320n<? super C16807N> nVar) {
            this.f64255a = nVar;
        }

        public void a() {
            C16320n<C16807N> nVar = this.f64255a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(C16807N.f139792a));
        }

        public void onCancel() {
            C16320n<C16807N> nVar = this.f64255a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(new CancellationException("Animation cancelled"))));
        }
    }

    public /* synthetic */ C9296d(CameraPosition cameraPosition, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraPosition);
    }

    /* access modifiers changed from: private */
    public final void A(Object obj) {
        this.f64239g.setValue(obj);
    }

    /* access modifiers changed from: private */
    public final void C(b bVar) {
        this.f64238f.setValue(bVar);
    }

    /* access modifiers changed from: private */
    public static final CameraPosition c(m mVar, C9296d dVar) {
        C17542s.j(mVar, "$this$Saver");
        C17542s.j(dVar, "it");
        return dVar.s();
    }

    /* access modifiers changed from: private */
    public static final C9296d d(CameraPosition cameraPosition) {
        C17542s.j(cameraPosition, "it");
        return new C9296d(cameraPosition);
    }

    public static /* synthetic */ Object n(C9296d dVar, C8617a aVar, int i10, C17164e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return dVar.m(aVar, i10, eVar);
    }

    /* access modifiers changed from: private */
    public final void o(b bVar) {
        b r10 = r();
        if (r10 != null) {
            r10.a();
        }
        C(bVar);
    }

    /* access modifiers changed from: private */
    public final C8619c p() {
        return (C8619c) this.f64237e.getValue();
    }

    private final Object q() {
        return this.f64239g.getValue();
    }

    /* access modifiers changed from: private */
    public final b r() {
        return (b) this.f64238f.getValue();
    }

    /* access modifiers changed from: private */
    public final void w(C8619c cVar, C8617a aVar, int i10, C16320n<? super C16807N> nVar) {
        h hVar = new h(nVar);
        if (i10 == Integer.MAX_VALUE) {
            cVar.d(aVar, hVar);
        } else {
            cVar.c(aVar, i10, hVar);
        }
        o(new g(cVar));
    }

    private final void y(C8619c cVar) {
        this.f64237e.setValue(cVar);
    }

    public final void B(boolean z10) {
        this.f64233a.setValue(Boolean.valueOf(z10));
    }

    public final void D(CameraPosition cameraPosition) {
        C17542s.j(cameraPosition, "<set-?>");
        this.f64235c.setValue(cameraPosition);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final java.lang.Object m(oa.C8617a r8, int r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof Uc.C9296d.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Uc.d$c r0 = (Uc.C9296d.c) r0
            int r1 = r0.f64246i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f64246i = r1
            goto L_0x0018
        L_0x0013:
            Uc.d$c r0 = new Uc.d$c
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f64244g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f64246i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.lang.Object r8 = r0.f64242e
            QJ.F0 r8 = (QJ.F0) r8
            java.lang.Object r9 = r0.f64241d
            oa.a r9 = (oa.C8617a) r9
            java.lang.Object r9 = r0.f64240c
            Uc.d r9 = (Uc.C9296d) r9
            XH.y.b(r10)     // Catch:{ all -> 0x0037 }
            goto L_0x00a6
        L_0x0037:
            r10 = move-exception
            goto L_0x00c7
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            XH.y.b(r10)
            dI.i r10 = r0.getContext()
            QJ.F0$b r2 = QJ.F0.f137562d0
            dI.i$b r10 = r10.get(r2)
            QJ.F0 r10 = (QJ.F0) r10
            r0.f64240c = r7     // Catch:{ all -> 0x009b }
            r0.f64241d = r8     // Catch:{ all -> 0x009b }
            r0.f64242e = r10     // Catch:{ all -> 0x009b }
            r0.f64243f = r9     // Catch:{ all -> 0x009b }
            r0.f64246i = r4     // Catch:{ all -> 0x009b }
            QJ.p r2 = new QJ.p     // Catch:{ all -> 0x009b }
            dI.e r5 = eI.C17187b.c(r0)     // Catch:{ all -> 0x009b }
            r2.<init>(r5, r4)     // Catch:{ all -> 0x009b }
            r2.C()     // Catch:{ all -> 0x009b }
            r7.f64236d     // Catch:{ all -> 0x009b }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x009b }
            monitor-enter(r4)     // Catch:{ all -> 0x009b }
            r7.A(r10)     // Catch:{ all -> 0x0087 }
            oa.c r5 = r7.p()     // Catch:{ all -> 0x0087 }
            if (r5 != 0) goto L_0x0089
            Uc.d$e r5 = new Uc.d$e     // Catch:{ all -> 0x0087 }
            r5.<init>(r2, r7, r8, r9)     // Catch:{ all -> 0x0087 }
            r7.o(r5)     // Catch:{ all -> 0x0087 }
            Uc.d$d r8 = new Uc.d$d     // Catch:{ all -> 0x0087 }
            r8.<init>(r7, r5)     // Catch:{ all -> 0x0087 }
            r2.K(r8)     // Catch:{ all -> 0x0087 }
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            goto L_0x00c5
        L_0x0089:
            r7.w(r5, r8, r9, r2)     // Catch:{ all -> 0x0087 }
        L_0x008c:
            monitor-exit(r4)     // Catch:{ all -> 0x009b }
            java.lang.Object r8 = r2.w()     // Catch:{ all -> 0x009b }
            java.lang.Object r9 = eI.C17187b.f()     // Catch:{ all -> 0x009b }
            if (r8 != r9) goto L_0x00a1
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x009b }
            goto L_0x00a1
        L_0x009b:
            r8 = move-exception
            r9 = r7
            r6 = r10
            r10 = r8
            r8 = r6
            goto L_0x00c7
        L_0x00a1:
            if (r8 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r9 = r7
            r8 = r10
        L_0x00a6:
            XH.N r10 = r9.f64236d
            monitor-enter(r10)
            if (r8 == 0) goto L_0x00c1
            java.lang.Object r0 = r9.q()     // Catch:{ all -> 0x00be }
            if (r0 != r8) goto L_0x00c1
            r9.A(r3)     // Catch:{ all -> 0x00be }
            oa.c r8 = r9.p()     // Catch:{ all -> 0x00be }
            if (r8 == 0) goto L_0x00c1
            r8.Q()     // Catch:{ all -> 0x00be }
            goto L_0x00c1
        L_0x00be:
            r8 = move-exception
            monitor-exit(r10)
            throw r8
        L_0x00c1:
            monitor-exit(r10)
            XH.N r8 = XH.C16807N.f139792a
            return r8
        L_0x00c5:
            monitor-exit(r4)     // Catch:{ all -> 0x009b }
            throw r8     // Catch:{ all -> 0x009b }
        L_0x00c7:
            XH.N r0 = r9.f64236d
            monitor-enter(r0)
            if (r8 == 0) goto L_0x00e1
            java.lang.Object r1 = r9.q()     // Catch:{ all -> 0x00df }
            if (r1 != r8) goto L_0x00e1
            r9.A(r3)     // Catch:{ all -> 0x00df }
            oa.c r8 = r9.p()     // Catch:{ all -> 0x00df }
            if (r8 == 0) goto L_0x00e1
            r8.Q()     // Catch:{ all -> 0x00df }
            goto L_0x00e1
        L_0x00df:
            r8 = move-exception
            goto L_0x00e5
        L_0x00e1:
            XH.N r8 = XH.C16807N.f139792a     // Catch:{ all -> 0x00df }
            monitor-exit(r0)
            throw r10
        L_0x00e5:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.C9296d.m(oa.a, int, dI.e):java.lang.Object");
    }

    public final CameraPosition s() {
        return t();
    }

    public final CameraPosition t() {
        return (CameraPosition) this.f64235c.getValue();
    }

    public final boolean u() {
        return ((Boolean) this.f64233a.getValue()).booleanValue();
    }

    public final void v(C8617a aVar) {
        C17542s.j(aVar, "update");
        synchronized (this.f64236d) {
            try {
                C8619c p10 = p();
                A((Object) null);
                if (p10 == null) {
                    o(new f(aVar));
                } else {
                    p10.h(aVar);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x(C9287a aVar) {
        C17542s.j(aVar, "<set-?>");
        this.f64234b.setValue(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(oa.C8619c r4) {
        /*
            r3 = this;
            XH.N r0 = r3.f64236d
            monitor-enter(r0)
            oa.c r1 = r3.p()     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x000d
            if (r4 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            oa.c r1 = r3.p()     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0020
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "CameraPositionState may only be associated with one GoogleMap at a time"
            r4.<init>(r1)     // Catch:{ all -> 0x001e }
            throw r4     // Catch:{ all -> 0x001e }
        L_0x001e:
            r4 = move-exception
            goto L_0x0046
        L_0x0020:
            r3.y(r4)     // Catch:{ all -> 0x001e }
            if (r4 != 0) goto L_0x002a
            r1 = 0
            r3.B(r1)     // Catch:{ all -> 0x001e }
            goto L_0x0035
        L_0x002a:
            com.google.android.gms.maps.model.CameraPosition r1 = r3.s()     // Catch:{ all -> 0x001e }
            oa.a r1 = oa.C8618b.a(r1)     // Catch:{ all -> 0x001e }
            r4.h(r1)     // Catch:{ all -> 0x001e }
        L_0x0035:
            Uc.d$b r1 = r3.r()     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0044
            r2 = 0
            r3.C(r2)     // Catch:{ all -> 0x001e }
            r1.b(r4)     // Catch:{ all -> 0x001e }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x001e }
        L_0x0044:
            monitor-exit(r0)
            return
        L_0x0046:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.C9296d.z(oa.c):void");
    }

    private C9296d(CameraPosition cameraPosition) {
        this.f64233a = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        this.f64234b = u1.e(C9287a.NO_MOVEMENT_YET, (o1) null, 2, (Object) null);
        this.f64235c = u1.e(cameraPosition, (o1) null, 2, (Object) null);
        this.f64236d = C16807N.f139792a;
        this.f64237e = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f64238f = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f64239g = u1.e((Object) null, (o1) null, 2, (Object) null);
    }
}

package v0;

import U0.T0;
import android.view.Choreographer;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0012\u0019B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lv0/a;", "Lv0/P;", "LU0/T0;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "LXH/N;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "Lv0/N;", "prefetchRequest", "a", "(Lv0/N;)V", "w0", "o1", "c1", "Landroid/view/View;", "LW0/b;", "b", "LW0/b;", "prefetchRequests", "", "c", "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "d", "Landroid/view/Choreographer;", "choreographer", "e", "isActive", "f", "J", "frameStartTimeNanos", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.a  reason: case insensitive filesystem */
public final class C6135a implements P, T0, Runnable, Choreographer.FrameCallback {

    /* renamed from: g  reason: collision with root package name */
    public static final C0475a f30839g = new C0475a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f30840h = 8;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static long f30841i;

    /* renamed from: a  reason: collision with root package name */
    private final View f30842a;

    /* renamed from: b  reason: collision with root package name */
    private final W0.b<N> f30843b = new W0.b<>(new N[16], 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f30844c;

    /* renamed from: d  reason: collision with root package name */
    private final Choreographer f30845d = Choreographer.getInstance();

    /* renamed from: e  reason: collision with root package name */
    private boolean f30846e;

    /* renamed from: f  reason: collision with root package name */
    private long f30847f;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv0/a$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "LXH/N;", "b", "(Landroid/view/View;)V", "", "frameIntervalNs", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.a$a  reason: collision with other inner class name */
    public static final class C0475a {
        public /* synthetic */ C0475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
            if (r5 >= 30.0f) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = v0.C6135a.f30841i
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x002c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L_0x0021
                if (r0 == 0) goto L_0x0021
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = 1114636288(0x42700000, float:60.0)
            L_0x0023:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                v0.C6135a.f30841i = r0
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.C6135a.C0475a.b(android.view.View):void");
        }

        private C0475a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lv0/a$b;", "Lv0/O;", "", "nextFrameTimeNs", "<init>", "(J)V", "a", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.a$b */
    public static final class b implements O {

        /* renamed from: a  reason: collision with root package name */
        private final long f30848a;

        public b(long j10) {
            this.f30848a = j10;
        }

        public long a() {
            return Math.max(0, this.f30848a - System.nanoTime());
        }
    }

    public C6135a(View view) {
        this.f30842a = view;
        f30839g.b(view);
    }

    public void a(N n10) {
        this.f30843b.b(n10);
        if (!this.f30844c) {
            this.f30844c = true;
            this.f30842a.post(this);
        }
    }

    public void c1() {
    }

    public void doFrame(long j10) {
        if (this.f30846e) {
            this.f30847f = j10;
            this.f30842a.post(this);
        }
    }

    public void o1() {
        this.f30846e = false;
        this.f30842a.removeCallbacks(this);
        this.f30845d.removeFrameCallback(this);
    }

    public void run() {
        if (this.f30843b.t() || !this.f30844c || !this.f30846e || this.f30842a.getWindowVisibility() != 0) {
            this.f30844c = false;
            return;
        }
        b bVar = new b(this.f30847f + f30841i);
        boolean z10 = false;
        while (this.f30843b.v() && !z10) {
            if (bVar.a() <= 0 || ((N) this.f30843b.q()[0]).b(bVar)) {
                z10 = true;
            } else {
                this.f30843b.B(0);
            }
        }
        if (z10) {
            this.f30845d.postFrameCallback(this);
        } else {
            this.f30844c = false;
        }
    }

    public void w0() {
        this.f30846e = true;
    }
}

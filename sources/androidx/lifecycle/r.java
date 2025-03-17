package androidx.lifecycle;

import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\r\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\bRR\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000b8G@GX\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/r;", "", "<init>", "()V", "Landroidx/lifecycle/x;", "observer", "LXH/N;", "c", "(Landroidx/lifecycle/x;)V", "g", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/lifecycle/AtomicReference;", "<set-?>", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "f", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "internalScopeRef", "Landroidx/lifecycle/r$b;", "d", "()Landroidx/lifecycle/r$b;", "currentState", "LTJ/P;", "e", "()LTJ/P;", "currentStateFlow", "b", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private AtomicReference<Object> f22338a = new AtomicReference<>((Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/r$a;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/r$b;", "j", "()Landroidx/lifecycle/r$b;", "targetState", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0348a Companion = null;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/r$a$a;", "", "<init>", "()V", "Landroidx/lifecycle/r$b;", "state", "Landroidx/lifecycle/r$a;", "a", "(Landroidx/lifecycle/r$b;)Landroidx/lifecycle/r$a;", "b", "c", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.r$a$a  reason: collision with other inner class name */
        public static final class C0348a {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.r$a$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0349a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f22339a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.r$b[] r0 = androidx.lifecycle.r.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f22339a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r.a.C0348a.C0349a.<clinit>():void");
                }
            }

            public /* synthetic */ C0348a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(b bVar) {
                C17542s.j(bVar, "state");
                int i10 = C0349a.f22339a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                C17542s.j(bVar, "state");
                int i10 = C0349a.f22339a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b bVar) {
                C17542s.j(bVar, "state");
                int i10 = C0349a.f22339a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0348a() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22340a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f22340a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r.a.b.<clinit>():void");
            }
        }

        static {
            Companion = new C0348a((DefaultConstructorMarker) null);
        }

        public static final a b(b bVar) {
            return Companion.a(bVar);
        }

        public static final a m(b bVar) {
            return Companion.c(bVar);
        }

        public final b j() {
            switch (b.f22340a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/r$b;", "", "<init>", "(Ljava/lang/String;I)V", "state", "", "b", "(Landroidx/lifecycle/r$b;)Z", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean b(b bVar) {
            C17542s.j(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    /* access modifiers changed from: private */
    public static final void b(C16505B b10, C5221y yVar, a aVar) {
        C17542s.j(b10, "$mutableStateFlow");
        C17542s.j(yVar, "<anonymous parameter 0>");
        C17542s.j(aVar, "event");
        b10.setValue(aVar.j());
    }

    public abstract void c(C5220x xVar);

    public abstract b d();

    public C16519P<b> e() {
        C16505B a10 = C16521S.a(d());
        c(new C5214q(a10));
        return C16534i.c(a10);
    }

    public final AtomicReference<Object> f() {
        return this.f22338a;
    }

    public abstract void g(C5220x xVar);
}

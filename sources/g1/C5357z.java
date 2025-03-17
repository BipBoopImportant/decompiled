package g1;

import U0.C0;
import U0.C4863c;
import U0.C4895p;
import U0.I;
import U0.J;
import U0.o1;
import U0.p1;
import W0.f;
import XH.C16807N;
import XH.C16820k;
import YH.C16870n;
import YH.C16877v;
import d0.i;
import j0.K;
import j0.N;
import j0.O;
import j0.Q;
import j0.Z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001'B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001e\u001a\u00020\u0004\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\fR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010)j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00105\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0004018\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0018088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010/R\u0018\u0010C\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010E¨\u0006G"}, d2 = {"Lg1/z;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "LXH/N;", "onChangedExecutor", "<init>", "(LnI/l;)V", "", "m", "()Z", "r", "()V", "", "set", "i", "(Ljava/util/Set;)V", "p", "()Ljava/util/Set;", "", "q", "()Ljava/lang/Void;", "T", "onChanged", "Lg1/z$a;", "n", "(LnI/l;)Lg1/z$a;", "scope", "onValueChangedForScope", "block", "o", "(Ljava/lang/Object;LnI/l;LnI/a;)V", "k", "(Ljava/lang/Object;)V", "predicate", "l", "s", "t", "j", "a", "LnI/l;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "Lg1/k;", "d", "LnI/p;", "applyObserver", "e", "readObserver", "LW0/b;", "f", "LW0/b;", "observedScopeMaps", "Lg1/f;", "g", "Lg1/f;", "applyUnsubscribe", "h", "isPaused", "Lg1/z$a;", "currentMap", "", "J", "currentMapThreadId", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.z  reason: case insensitive filesystem */
public final class C5357z {

    /* renamed from: k  reason: collision with root package name */
    public static final int f23455k = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C17631a<C16807N>, C16807N> f23456a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Object> f23457b = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f23458c;

    /* renamed from: d  reason: collision with root package name */
    private final p<Set<? extends Object>, C5342k, C16807N> f23459d = new b(this);

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<Object, C16807N> f23460e = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final W0.b<a> f23461f = new W0.b<>(new a[16], 0);

    /* renamed from: g  reason: collision with root package name */
    private C5337f f23462g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f23463h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public a f23464i;

    /* renamed from: j  reason: collision with root package name */
    private long f23465j = -1;

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J7\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0011J!\u0010\u001d\u001a\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00032\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0003¢\u0006\u0004\b*\u0010!R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R&\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b078\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u00103R$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030&048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105R<\u0010J\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\u0006\u0012\u0004\u0018\u00010\u00010Gj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\u0006\u0012\u0004\u0018\u00010\u0001`H8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010I¨\u0006K"}, d2 = {"Lg1/z$a;", "", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(LnI/l;)V", "value", "", "currentToken", "currentScope", "Lj0/K;", "recordedValues", "l", "(Ljava/lang/Object;ILjava/lang/Object;Lj0/K;)V", "scope", "d", "(Ljava/lang/Object;)V", "m", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "readObserver", "Lkotlin/Function0;", "block", "i", "(Ljava/lang/Object;LnI/l;LnI/a;)V", "e", "", "predicate", "n", "g", "()Z", "c", "()V", "", "changes", "j", "(Ljava/util/Set;)Z", "LU0/I;", "derivedState", "o", "(LU0/I;)V", "h", "a", "LnI/l;", "f", "()LnI/l;", "b", "Ljava/lang/Object;", "Lj0/K;", "currentScopeReads", "I", "LW0/f;", "LW0/f;", "valueToScopes", "Lj0/N;", "Lj0/N;", "scopeToValues", "Lj0/O;", "Lj0/O;", "invalidated", "LW0/b;", "LW0/b;", "statesToReread", "LU0/J;", "LU0/J;", "getDerivedStateObserver", "()LU0/J;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g1.z$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C17642l<Object, C16807N> f23466a;

        /* renamed from: b  reason: collision with root package name */
        private Object f23467b;

        /* renamed from: c  reason: collision with root package name */
        private K<Object> f23468c;

        /* renamed from: d  reason: collision with root package name */
        private int f23469d = -1;

        /* renamed from: e  reason: collision with root package name */
        private final f<Object, Object> f23470e = new f<>();

        /* renamed from: f  reason: collision with root package name */
        private final N<Object, K<Object>> f23471f = new N<>(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        private final O<Object> f23472g = new O<>(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        private final W0.b<I<?>> f23473h = new W0.b<>(new I[16], 0);

        /* renamed from: i  reason: collision with root package name */
        private final J f23474i = new C0380a(this);
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f23475j;

        /* renamed from: k  reason: collision with root package name */
        private final f<Object, I<?>> f23476k = new f<>();

        /* renamed from: l  reason: collision with root package name */
        private final HashMap<I<?>, Object> f23477l = new HashMap<>();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"g1/z$a$a", "LU0/J;", "LU0/I;", "derivedState", "LXH/N;", "a", "(LU0/I;)V", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: g1.z$a$a  reason: collision with other inner class name */
        public static final class C0380a implements J {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f23478a;

            C0380a(a aVar) {
                this.f23478a = aVar;
            }

            public void a(I<?> i10) {
                a aVar = this.f23478a;
                aVar.f23475j = aVar.f23475j + 1;
            }

            public void b(I<?> i10) {
                a aVar = this.f23478a;
                aVar.f23475j = aVar.f23475j - 1;
            }
        }

        public a(C17642l<Object, C16807N> lVar) {
            this.f23466a = lVar;
        }

        private final void d(Object obj) {
            int i10 = this.f23469d;
            K<Object> k10 = this.f23468c;
            if (k10 != null) {
                long[] jArr = k10.f24551a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j10) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj2 = k10.f24552b[i14];
                                    boolean z10 = k10.f24553c[i14] != i10;
                                    Object obj3 = obj;
                                    if (z10) {
                                        m(obj3, obj2);
                                    }
                                    if (z10) {
                                        k10.q(i14);
                                    }
                                } else {
                                    Object obj4 = obj;
                                }
                                j10 >>= 8;
                            }
                            Object obj5 = obj;
                            if (i12 != 8) {
                                return;
                            }
                        } else {
                            Object obj6 = obj;
                        }
                        if (i11 != length) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        private final void l(Object obj, int i10, Object obj2, K<Object> k10) {
            int i11;
            int i12;
            Object obj3 = obj;
            int i13 = i10;
            if (this.f23475j <= 0) {
                int p10 = k10.p(obj3, i13, -1);
                if (!(obj3 instanceof I) || p10 == i13) {
                    i11 = -1;
                } else {
                    I.a r10 = ((I) obj3).r();
                    this.f23477l.put(obj3, r10.a());
                    Q<C5326G> b10 = r10.b();
                    f<Object, I<?>> fVar = this.f23476k;
                    fVar.g(obj3);
                    Object[] objArr = b10.f24552b;
                    long[] jArr = b10.f24551a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j10 = jArr[i14];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j10 & 255) < 128) {
                                        C5326G g10 = (C5326G) objArr[(i14 << 3) + i17];
                                        if (g10 instanceof C5327H) {
                                            ((C5327H) g10).s(C5338g.a(2));
                                        }
                                        fVar.a(g10, obj3);
                                        i12 = 8;
                                    } else {
                                        i12 = i15;
                                    }
                                    j10 >>= i12;
                                    i17++;
                                    i15 = i12;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                        }
                    }
                    i11 = -1;
                }
                if (p10 == i11) {
                    if (obj3 instanceof C5327H) {
                        ((C5327H) obj3).s(C5338g.a(2));
                    }
                    this.f23470e.a(obj3, obj2);
                }
            }
        }

        private final void m(Object obj, Object obj2) {
            this.f23470e.f(obj2, obj);
            if ((obj2 instanceof I) && !this.f23470e.c(obj2)) {
                this.f23476k.g(obj2);
                this.f23477l.remove(obj2);
            }
        }

        public final void c() {
            this.f23470e.b();
            this.f23471f.i();
            this.f23476k.b();
            this.f23477l.clear();
        }

        public final void e(Object obj) {
            Object obj2 = obj;
            K p10 = this.f23471f.p(obj2);
            if (p10 != null) {
                Object[] objArr = p10.f24552b;
                int[] iArr = p10.f24553c;
                long[] jArr = p10.f24551a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj3 = objArr[i13];
                                    int i14 = iArr[i13];
                                    m(obj2, obj3);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                return;
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final C17642l<Object, C16807N> f() {
            return this.f23466a;
        }

        public final boolean g() {
            return this.f23471f.g();
        }

        public final void h() {
            O<Object> o10 = this.f23472g;
            C17642l<Object, C16807N> lVar = this.f23466a;
            Object[] objArr = o10.f24576b;
            long[] jArr = o10.f24575a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                lVar.invoke(objArr[(i10 << 3) + i12]);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            o10.m();
        }

        /* JADX INFO: finally extract failed */
        public final void i(Object obj, C17642l<Object, C16807N> lVar, C17631a<C16807N> aVar) {
            Object obj2 = this.f23467b;
            K<Object> k10 = this.f23468c;
            int i10 = this.f23469d;
            this.f23467b = obj;
            this.f23468c = this.f23471f.c(obj);
            if (this.f23469d == -1) {
                this.f23469d = C5347p.H().f();
            }
            J j10 = this.f23474i;
            W0.b<J> c10 = p1.c();
            try {
                c10.b(j10);
                C5342k.f23395e.h(lVar, (C17642l<Object, C16807N>) null, aVar);
                c10.B(c10.r() - 1);
                Object obj3 = this.f23467b;
                C17542s.g(obj3);
                d(obj3);
                this.f23467b = obj2;
                this.f23468c = k10;
                this.f23469d = i10;
            } catch (Throwable th2) {
                c10.B(c10.r() - 1);
                throw th2;
            }
        }

        public final boolean j(Set<? extends Object> set) {
            boolean z10;
            Iterator it;
            String str;
            HashMap<I<?>, Object> hashMap;
            Object obj;
            char c10;
            Object c11;
            char c12;
            HashMap<I<?>, Object> hashMap2;
            Object[] objArr;
            long[] jArr;
            Iterator it2;
            HashMap<I<?>, Object> hashMap3;
            Object obj2;
            f<Object, I<?>> fVar;
            long[] jArr2;
            Object[] objArr2;
            int i10;
            String str2;
            long[] jArr3;
            long[] jArr4;
            char c13;
            f<Object, Object> fVar2;
            f<Object, I<?>> fVar3;
            String str3;
            Object[] objArr3;
            long[] jArr5;
            HashMap<I<?>, Object> hashMap4;
            int i11;
            long[] jArr6;
            f<Object, I<?>> fVar4;
            HashMap<I<?>, Object> hashMap5;
            f<Object, Object> fVar5;
            Object[] objArr4;
            String str4;
            int i12;
            int i13;
            long j10;
            int i14;
            Object obj3;
            char c14;
            Object c15;
            char c16;
            HashMap<I<?>, Object> hashMap6;
            Object[] objArr5;
            f<Object, I<?>> fVar6;
            HashMap<I<?>, Object> hashMap7;
            f<Object, Object> fVar7;
            String str5;
            long j11;
            Object obj4;
            Object[] objArr6;
            f<Object, Object> fVar8;
            char c17;
            Set<? extends Object> set2 = set;
            f<Object, I<?>> fVar9 = this.f23476k;
            HashMap<I<?>, Object> hashMap8 = this.f23477l;
            f<Object, Object> fVar10 = this.f23470e;
            O<Object> o10 = this.f23472g;
            String str6 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            char c18 = 7;
            long j12 = -9187201950435737472L;
            int i15 = 0;
            if (set2 instanceof W0.d) {
                Z b10 = ((W0.d) set2).b();
                Object[] objArr7 = b10.f24576b;
                long[] jArr7 = b10.f24575a;
                int length = jArr7.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    z10 = false;
                    while (true) {
                        long j13 = jArr7[i16];
                        int i17 = length;
                        if ((((~j13) << c18) & j13 & j12) != j12) {
                            int i18 = 8 - ((~(i16 - i17)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j13 & 255) < 128) {
                                    Object obj5 = objArr7[(i16 << 3) + i19];
                                    if (!(obj5 instanceof C5327H) || ((C5327H) obj5).d(C5338g.a(2))) {
                                        if (!fVar9.c(obj5) || (c15 = fVar9.d().c(obj5)) == null) {
                                            jArr6 = jArr7;
                                            fVar4 = fVar9;
                                            hashMap5 = hashMap8;
                                            fVar5 = fVar10;
                                            objArr4 = objArr7;
                                            str4 = str6;
                                            i12 = i18;
                                            i13 = i19;
                                            j10 = j13;
                                            i14 = i16;
                                            obj3 = obj5;
                                        } else if (c15 instanceof O) {
                                            O o11 = (O) c15;
                                            Object[] objArr8 = o11.f24576b;
                                            long[] jArr8 = o11.f24575a;
                                            jArr6 = jArr7;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                objArr4 = objArr7;
                                                i12 = i18;
                                                i13 = i19;
                                                int i20 = 0;
                                                while (true) {
                                                    long j14 = jArr8[i20];
                                                    long[] jArr9 = jArr8;
                                                    i14 = i16;
                                                    if ((((~j14) << 7) & j14 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                        int i22 = 0;
                                                        while (i22 < i21) {
                                                            if ((j14 & 255) < 128) {
                                                                objArr6 = objArr8;
                                                                I i23 = (I) objArr8[(i20 << 3) + i22];
                                                                C17542s.h(i23, str6);
                                                                str5 = str6;
                                                                Object obj6 = hashMap8.get(i23);
                                                                o1 c19 = i23.c();
                                                                if (c19 == null) {
                                                                    c19 = p1.s();
                                                                }
                                                                fVar6 = fVar9;
                                                                j11 = j13;
                                                                if (!c19.b(i23.r().a(), obj6)) {
                                                                    Object c20 = fVar10.d().c(i23);
                                                                    if (c20 != null) {
                                                                        if (c20 instanceof O) {
                                                                            O o12 = (O) c20;
                                                                            Object[] objArr9 = o12.f24576b;
                                                                            long[] jArr10 = o12.f24575a;
                                                                            int length3 = jArr10.length - 2;
                                                                            if (length3 >= 0) {
                                                                                obj4 = obj5;
                                                                                int i24 = 0;
                                                                                while (true) {
                                                                                    long j15 = jArr10[i24];
                                                                                    long[] jArr11 = jArr10;
                                                                                    hashMap7 = hashMap8;
                                                                                    if ((((~j15) << 7) & j15 & -9187201950435737472L) != -9187201950435737472L) {
                                                                                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                                                                        int i26 = 0;
                                                                                        while (i26 < i25) {
                                                                                            if ((j15 & 255) < 128) {
                                                                                                fVar8 = fVar10;
                                                                                                o10.h(objArr9[(i24 << 3) + i26]);
                                                                                                c17 = 8;
                                                                                                z10 = true;
                                                                                            } else {
                                                                                                fVar8 = fVar10;
                                                                                                c17 = 8;
                                                                                            }
                                                                                            j15 >>= c17;
                                                                                            i26++;
                                                                                            fVar10 = fVar8;
                                                                                        }
                                                                                        fVar7 = fVar10;
                                                                                        if (i25 != 8) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        fVar7 = fVar10;
                                                                                    }
                                                                                    if (i24 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i24++;
                                                                                    hashMap8 = hashMap7;
                                                                                    jArr10 = jArr11;
                                                                                    fVar10 = fVar7;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            hashMap7 = hashMap8;
                                                                            fVar7 = fVar10;
                                                                            obj4 = obj5;
                                                                            o10.h(c20);
                                                                            z10 = true;
                                                                        }
                                                                    }
                                                                    hashMap7 = hashMap8;
                                                                    fVar7 = fVar10;
                                                                    obj4 = obj5;
                                                                } else {
                                                                    hashMap7 = hashMap8;
                                                                    fVar7 = fVar10;
                                                                    obj4 = obj5;
                                                                    this.f23473h.b(i23);
                                                                }
                                                            } else {
                                                                fVar6 = fVar9;
                                                                hashMap7 = hashMap8;
                                                                fVar7 = fVar10;
                                                                str5 = str6;
                                                                j11 = j13;
                                                                obj4 = obj5;
                                                                objArr6 = objArr8;
                                                            }
                                                            j14 >>= 8;
                                                            i22++;
                                                            str6 = str5;
                                                            objArr8 = objArr6;
                                                            obj5 = obj4;
                                                            fVar9 = fVar6;
                                                            j13 = j11;
                                                            hashMap8 = hashMap7;
                                                            fVar10 = fVar7;
                                                        }
                                                        fVar4 = fVar9;
                                                        hashMap6 = hashMap8;
                                                        fVar5 = fVar10;
                                                        str4 = str6;
                                                        j10 = j13;
                                                        obj3 = obj5;
                                                        objArr5 = objArr8;
                                                        if (i21 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        fVar4 = fVar9;
                                                        hashMap6 = hashMap8;
                                                        fVar5 = fVar10;
                                                        str4 = str6;
                                                        j10 = j13;
                                                        obj3 = obj5;
                                                        objArr5 = objArr8;
                                                    }
                                                    if (i20 == length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    i16 = i14;
                                                    jArr8 = jArr9;
                                                    str6 = str4;
                                                    objArr8 = objArr5;
                                                    obj5 = obj3;
                                                    fVar9 = fVar4;
                                                    j13 = j10;
                                                    hashMap8 = hashMap6;
                                                    fVar10 = fVar5;
                                                }
                                            } else {
                                                fVar4 = fVar9;
                                                hashMap6 = hashMap8;
                                                fVar5 = fVar10;
                                                objArr4 = objArr7;
                                                str4 = str6;
                                                i12 = i18;
                                                i13 = i19;
                                                j10 = j13;
                                                i14 = i16;
                                                obj3 = obj5;
                                            }
                                            hashMap5 = hashMap6;
                                        } else {
                                            jArr6 = jArr7;
                                            fVar4 = fVar9;
                                            fVar5 = fVar10;
                                            objArr4 = objArr7;
                                            str4 = str6;
                                            i12 = i18;
                                            i13 = i19;
                                            j10 = j13;
                                            i14 = i16;
                                            obj3 = obj5;
                                            I i27 = (I) c15;
                                            hashMap5 = hashMap8;
                                            Object obj7 = hashMap5.get(i27);
                                            o1 c21 = i27.c();
                                            if (c21 == null) {
                                                c21 = p1.s();
                                            }
                                            if (!c21.b(i27.r().a(), obj7)) {
                                                Object c22 = fVar5.d().c(i27);
                                                if (c22 != null) {
                                                    if (c22 instanceof O) {
                                                        O o13 = (O) c22;
                                                        Object[] objArr10 = o13.f24576b;
                                                        long[] jArr12 = o13.f24575a;
                                                        int length4 = jArr12.length - 2;
                                                        if (length4 >= 0) {
                                                            int i28 = 0;
                                                            while (true) {
                                                                long j16 = jArr12[i28];
                                                                if ((((~j16) << 7) & j16 & -9187201950435737472L) != -9187201950435737472L) {
                                                                    int i29 = 8 - ((~(i28 - length4)) >>> 31);
                                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                                        if ((j16 & 255) < 128) {
                                                                            o10.h(objArr10[(i28 << 3) + i30]);
                                                                            c16 = 8;
                                                                            z10 = true;
                                                                        } else {
                                                                            c16 = 8;
                                                                        }
                                                                        j16 >>= c16;
                                                                    }
                                                                    if (i29 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i28 == length4) {
                                                                    break;
                                                                }
                                                                i28++;
                                                            }
                                                        }
                                                    } else {
                                                        o10.h(c22);
                                                        z10 = true;
                                                    }
                                                }
                                            } else {
                                                this.f23473h.b(i27);
                                            }
                                        }
                                        Object c23 = fVar5.d().c(obj3);
                                        if (c23 != null) {
                                            if (c23 instanceof O) {
                                                O o14 = (O) c23;
                                                Object[] objArr11 = o14.f24576b;
                                                long[] jArr13 = o14.f24575a;
                                                int length5 = jArr13.length - 2;
                                                if (length5 >= 0) {
                                                    int i31 = 0;
                                                    while (true) {
                                                        long j17 = jArr13[i31];
                                                        if ((((~j17) << 7) & j17 & -9187201950435737472L) != -9187201950435737472L) {
                                                            int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                            for (int i33 = 0; i33 < i32; i33++) {
                                                                if ((j17 & 255) < 128) {
                                                                    o10.h(objArr11[(i31 << 3) + i33]);
                                                                    c14 = 8;
                                                                    z10 = true;
                                                                } else {
                                                                    c14 = 8;
                                                                }
                                                                j17 >>= c14;
                                                            }
                                                            if (i32 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i31 == length5) {
                                                            break;
                                                        }
                                                        i31++;
                                                    }
                                                }
                                            } else {
                                                o10.h(c23);
                                                z10 = true;
                                            }
                                        }
                                        j13 = j10 >> 8;
                                        i19 = i13 + 1;
                                        hashMap8 = hashMap5;
                                        jArr7 = jArr6;
                                        objArr7 = objArr4;
                                        i18 = i12;
                                        i16 = i14;
                                        str6 = str4;
                                        fVar9 = fVar4;
                                        fVar10 = fVar5;
                                    }
                                }
                                jArr6 = jArr7;
                                fVar4 = fVar9;
                                hashMap5 = hashMap8;
                                fVar5 = fVar10;
                                objArr4 = objArr7;
                                str4 = str6;
                                i12 = i18;
                                i13 = i19;
                                j10 = j13;
                                i14 = i16;
                                j13 = j10 >> 8;
                                i19 = i13 + 1;
                                hashMap8 = hashMap5;
                                jArr7 = jArr6;
                                objArr7 = objArr4;
                                i18 = i12;
                                i16 = i14;
                                str6 = str4;
                                fVar9 = fVar4;
                                fVar10 = fVar5;
                            }
                            jArr5 = jArr7;
                            fVar3 = fVar9;
                            hashMap4 = hashMap8;
                            fVar2 = fVar10;
                            objArr3 = objArr7;
                            str3 = str6;
                            int i34 = i16;
                            if (i18 != 8) {
                                break;
                            }
                            length = i17;
                            i11 = i34;
                        } else {
                            jArr5 = jArr7;
                            fVar3 = fVar9;
                            hashMap4 = hashMap8;
                            fVar2 = fVar10;
                            objArr3 = objArr7;
                            str3 = str6;
                            length = i17;
                            i11 = i16;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i16 = i11 + 1;
                        hashMap8 = hashMap4;
                        jArr7 = jArr5;
                        objArr7 = objArr3;
                        str6 = str3;
                        fVar9 = fVar3;
                        fVar10 = fVar2;
                        c18 = 7;
                        j12 = -9187201950435737472L;
                    }
                } else {
                    z10 = false;
                }
            } else {
                f<Object, I<?>> fVar11 = fVar9;
                HashMap<I<?>, Object> hashMap9 = hashMap8;
                f<Object, Object> fVar12 = fVar10;
                String str7 = str6;
                Iterator it3 = set2.iterator();
                z10 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof C5327H) || ((C5327H) next).d(C5338g.a(2))) {
                        f<Object, I<?>> fVar13 = fVar11;
                        if (!fVar13.c(next) || (c11 = fVar13.d().c(next)) == null) {
                            it = it3;
                            hashMap = hashMap9;
                            obj = next;
                            fVar11 = fVar13;
                            str = str7;
                        } else if (c11 instanceof O) {
                            O o15 = (O) c11;
                            Object[] objArr12 = o15.f24576b;
                            long[] jArr14 = o15.f24575a;
                            int length6 = jArr14.length - 2;
                            if (length6 >= 0) {
                                int i35 = 0;
                                while (true) {
                                    long j18 = jArr14[i35];
                                    if ((((~j18) << 7) & j18 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                                        int i37 = 0;
                                        while (i37 < i36) {
                                            if ((j18 & 255) < 128) {
                                                I i38 = (I) objArr12[(i35 << 3) + i37];
                                                str2 = str7;
                                                C17542s.h(i38, str2);
                                                it2 = it3;
                                                Object obj8 = hashMap9.get(i38);
                                                o1 c24 = i38.c();
                                                if (c24 == null) {
                                                    c24 = p1.s();
                                                }
                                                fVar = fVar13;
                                                jArr2 = jArr14;
                                                if (!c24.b(i38.r().a(), obj8)) {
                                                    Object c25 = fVar12.d().c(i38);
                                                    if (c25 != null) {
                                                        if (c25 instanceof O) {
                                                            O o16 = (O) c25;
                                                            Object[] objArr13 = o16.f24576b;
                                                            long[] jArr15 = o16.f24575a;
                                                            int length7 = jArr15.length - 2;
                                                            if (length7 >= 0) {
                                                                hashMap3 = hashMap9;
                                                                obj2 = next;
                                                                int i39 = 0;
                                                                while (true) {
                                                                    long j19 = jArr15[i39];
                                                                    objArr2 = objArr12;
                                                                    i10 = length6;
                                                                    if ((((~j19) << 7) & j19 & -9187201950435737472L) != -9187201950435737472L) {
                                                                        int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                                        int i41 = 0;
                                                                        while (i41 < i40) {
                                                                            if ((j19 & 255) < 128) {
                                                                                jArr4 = jArr15;
                                                                                o10.h(objArr13[(i39 << 3) + i41]);
                                                                                c13 = 8;
                                                                                z10 = true;
                                                                            } else {
                                                                                jArr4 = jArr15;
                                                                                c13 = 8;
                                                                            }
                                                                            j19 >>= c13;
                                                                            i41++;
                                                                            jArr15 = jArr4;
                                                                        }
                                                                        jArr3 = jArr15;
                                                                        if (i40 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr15;
                                                                    }
                                                                    if (i39 == length7) {
                                                                        break;
                                                                    }
                                                                    i39++;
                                                                    objArr12 = objArr2;
                                                                    length6 = i10;
                                                                    jArr15 = jArr3;
                                                                }
                                                            }
                                                        } else {
                                                            hashMap3 = hashMap9;
                                                            obj2 = next;
                                                            objArr2 = objArr12;
                                                            i10 = length6;
                                                            o10.h(c25);
                                                            z10 = true;
                                                        }
                                                    }
                                                    hashMap3 = hashMap9;
                                                    obj2 = next;
                                                    objArr2 = objArr12;
                                                    i10 = length6;
                                                } else {
                                                    hashMap3 = hashMap9;
                                                    obj2 = next;
                                                    objArr2 = objArr12;
                                                    i10 = length6;
                                                    this.f23473h.b(i38);
                                                }
                                            } else {
                                                it2 = it3;
                                                hashMap3 = hashMap9;
                                                obj2 = next;
                                                fVar = fVar13;
                                                jArr2 = jArr14;
                                                objArr2 = objArr12;
                                                i10 = length6;
                                                str2 = str7;
                                            }
                                            j18 >>= 8;
                                            i37++;
                                            it3 = it2;
                                            str7 = str2;
                                            next = obj2;
                                            jArr14 = jArr2;
                                            objArr12 = objArr2;
                                            length6 = i10;
                                            fVar13 = fVar;
                                            hashMap9 = hashMap3;
                                        }
                                        it = it3;
                                        hashMap2 = hashMap9;
                                        obj = next;
                                        fVar11 = fVar13;
                                        jArr = jArr14;
                                        objArr = objArr12;
                                        int i42 = length6;
                                        str = str7;
                                        if (i36 != 8) {
                                            break;
                                        }
                                        length6 = i42;
                                    } else {
                                        it = it3;
                                        hashMap2 = hashMap9;
                                        obj = next;
                                        fVar11 = fVar13;
                                        jArr = jArr14;
                                        objArr = objArr12;
                                        str = str7;
                                    }
                                    if (i35 == length6) {
                                        break;
                                    }
                                    i35++;
                                    it3 = it;
                                    str7 = str;
                                    next = obj;
                                    jArr14 = jArr;
                                    objArr12 = objArr;
                                    fVar13 = fVar11;
                                    hashMap9 = hashMap2;
                                }
                            } else {
                                it = it3;
                                hashMap2 = hashMap9;
                                obj = next;
                                fVar11 = fVar13;
                                str = str7;
                            }
                            hashMap = hashMap2;
                        } else {
                            it = it3;
                            obj = next;
                            fVar11 = fVar13;
                            str = str7;
                            I i43 = (I) c11;
                            hashMap = hashMap9;
                            Object obj9 = hashMap.get(i43);
                            o1 c26 = i43.c();
                            if (c26 == null) {
                                c26 = p1.s();
                            }
                            if (!c26.b(i43.r().a(), obj9)) {
                                Object c27 = fVar12.d().c(i43);
                                if (c27 != null) {
                                    if (c27 instanceof O) {
                                        O o17 = (O) c27;
                                        Object[] objArr14 = o17.f24576b;
                                        long[] jArr16 = o17.f24575a;
                                        int length8 = jArr16.length - 2;
                                        if (length8 >= 0) {
                                            int i44 = 0;
                                            while (true) {
                                                long j20 = jArr16[i44];
                                                if ((((~j20) << 7) & j20 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i45 = 8 - ((~(i44 - length8)) >>> 31);
                                                    for (int i46 = 0; i46 < i45; i46++) {
                                                        if ((j20 & 255) < 128) {
                                                            o10.h(objArr14[(i44 << 3) + i46]);
                                                            c12 = 8;
                                                            z10 = true;
                                                        } else {
                                                            c12 = 8;
                                                        }
                                                        j20 >>= c12;
                                                    }
                                                    if (i45 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i44 == length8) {
                                                    break;
                                                }
                                                i44++;
                                            }
                                        }
                                    } else {
                                        o10.h(c27);
                                        z10 = true;
                                    }
                                }
                            } else {
                                this.f23473h.b(i43);
                            }
                        }
                        Object c28 = fVar12.d().c(obj);
                        if (c28 != null) {
                            if (c28 instanceof O) {
                                O o18 = (O) c28;
                                Object[] objArr15 = o18.f24576b;
                                long[] jArr17 = o18.f24575a;
                                int length9 = jArr17.length - 2;
                                if (length9 >= 0) {
                                    int i47 = 0;
                                    while (true) {
                                        long j21 = jArr17[i47];
                                        if ((((~j21) << 7) & j21 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i48 = 8 - ((~(i47 - length9)) >>> 31);
                                            for (int i49 = 0; i49 < i48; i49++) {
                                                if ((j21 & 255) < 128) {
                                                    o10.h(objArr15[(i47 << 3) + i49]);
                                                    c10 = 8;
                                                    z10 = true;
                                                } else {
                                                    c10 = 8;
                                                }
                                                j21 >>= c10;
                                            }
                                            if (i48 != 8) {
                                                break;
                                            }
                                        }
                                        if (i47 == length9) {
                                            break;
                                        }
                                        i47++;
                                    }
                                }
                            } else {
                                o10.h(c28);
                                z10 = true;
                            }
                            hashMap9 = hashMap;
                            str7 = str;
                            it3 = it;
                        }
                    } else {
                        it = it3;
                        hashMap = hashMap9;
                        str = str7;
                    }
                    hashMap9 = hashMap;
                    str7 = str;
                    it3 = it;
                }
            }
            if (this.f23473h.v()) {
                W0.b<I<?>> bVar = this.f23473h;
                int r10 = bVar.r();
                if (r10 > 0) {
                    Object[] q10 = bVar.q();
                    while (true) {
                        o((I) q10[i15]);
                        int i50 = i15 + 1;
                        if (i50 >= r10) {
                            break;
                        }
                        i15 = i50;
                    }
                }
                this.f23473h.k();
            }
            return z10;
        }

        public final void k(Object obj) {
            Object obj2 = this.f23467b;
            C17542s.g(obj2);
            int i10 = this.f23469d;
            K<Object> k10 = this.f23468c;
            if (k10 == null) {
                k10 = new K<>(0, 1, (DefaultConstructorMarker) null);
                this.f23468c = k10;
                this.f23471f.s(obj2, k10);
                C16807N n10 = C16807N.f139792a;
            }
            l(obj, i10, obj2, k10);
        }

        public final void n(C17642l<Object, Boolean> lVar) {
            long[] jArr;
            int i10;
            long j10;
            int i11;
            int i12;
            long[] jArr2;
            long j11;
            int i13;
            N<Object, K<Object>> n10 = this.f23471f;
            long[] jArr3 = n10.f24568a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j12 = jArr3[i14];
                    long j13 = -9187201950435737472L;
                    if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j12 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                Object obj = n10.f24569b[i18];
                                K k10 = (K) n10.f24570c[i18];
                                Boolean invoke = lVar.invoke(obj);
                                if (invoke.booleanValue()) {
                                    Object[] objArr = k10.f24552b;
                                    int[] iArr = k10.f24553c;
                                    long[] jArr4 = k10.f24551a;
                                    int length2 = jArr4.length - 2;
                                    jArr2 = jArr3;
                                    if (length2 >= 0) {
                                        i12 = i16;
                                        int i19 = 0;
                                        while (true) {
                                            long j14 = jArr4[i19];
                                            i11 = i14;
                                            j10 = j12;
                                            j11 = -9187201950435737472L;
                                            if ((((~j14) << 7) & j14 & -9187201950435737472L) != -9187201950435737472L) {
                                                int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                for (int i21 = 0; i21 < i20; i21++) {
                                                    if ((j14 & 255) < 128) {
                                                        int i22 = (i19 << 3) + i21;
                                                        Object obj2 = objArr[i22];
                                                        int i23 = iArr[i22];
                                                        m(obj, obj2);
                                                    }
                                                    j14 >>= 8;
                                                }
                                                if (i20 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i19 == length2) {
                                                break;
                                            }
                                            i19++;
                                            i14 = i11;
                                            j12 = j10;
                                        }
                                    } else {
                                        i11 = i14;
                                        j10 = j12;
                                        i12 = i16;
                                        j11 = -9187201950435737472L;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i11 = i14;
                                    j10 = j12;
                                    i12 = i16;
                                    j11 = j13;
                                }
                                if (invoke.booleanValue()) {
                                    n10.q(i18);
                                }
                                i13 = 8;
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                j10 = j12;
                                i12 = i16;
                                j11 = j13;
                                i13 = i15;
                            }
                            j12 = j10 >> i13;
                            i17++;
                            i15 = i13;
                            j13 = j11;
                            jArr3 = jArr2;
                            i16 = i12;
                            i14 = i11;
                        }
                        jArr = jArr3;
                        int i24 = i14;
                        if (i16 == i15) {
                            i10 = i24;
                        } else {
                            return;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = i14;
                    }
                    if (i10 != length) {
                        i14 = i10 + 1;
                        jArr3 = jArr;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void o(I<?> i10) {
            long[] jArr;
            long[] jArr2;
            int i11;
            K k10;
            I<?> i12 = i10;
            N<Object, K<Object>> n10 = this.f23471f;
            int f10 = C5347p.H().f();
            Object c10 = this.f23470e.d().c(i12);
            if (c10 == null) {
                return;
            }
            if (c10 instanceof O) {
                O o10 = (O) c10;
                Object[] objArr = o10.f24576b;
                long[] jArr3 = o10.f24575a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr3[i13];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    Object obj = objArr[(i13 << 3) + i16];
                                    K c11 = n10.c(obj);
                                    jArr2 = jArr3;
                                    if (c11 == null) {
                                        k10 = new K(0, 1, (DefaultConstructorMarker) null);
                                        n10.s(obj, k10);
                                        C16807N n11 = C16807N.f139792a;
                                    } else {
                                        k10 = c11;
                                    }
                                    l(i12, f10, obj, k10);
                                    i11 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i11 = i14;
                                }
                                j10 >>= i11;
                                i16++;
                                i14 = i11;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i15 != i14) {
                                return;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i13 != length) {
                            i13++;
                            jArr3 = jArr;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                K c12 = n10.c(c10);
                if (c12 == null) {
                    c12 = new K(0, 1, (DefaultConstructorMarker) null);
                    n10.s(c10, c12);
                    C16807N n12 = C16807N.f139792a;
                }
                l(i12, f10, c10, c12);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Lg1/k;", "<anonymous parameter 1>", "LXH/N;", "a", "(Ljava/util/Set;Lg1/k;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.z$b */
    static final class b extends C17544u implements p<Set<? extends Object>, C5342k, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5357z f23479c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5357z zVar) {
            super(2);
            this.f23479c = zVar;
        }

        public final void a(Set<? extends Object> set, C5342k kVar) {
            this.f23479c.i(set);
            if (this.f23479c.m()) {
                this.f23479c.r();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Set) obj, (C5342k) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.z$c */
    static final class c extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5357z f23480c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5357z zVar) {
            super(1);
            this.f23480c = zVar;
        }

        public final void a(Object obj) {
            if (!this.f23480c.f23463h) {
                W0.b d10 = this.f23480c.f23461f;
                C5357z zVar = this.f23480c;
                synchronized (d10) {
                    a c10 = zVar.f23464i;
                    C17542s.g(c10);
                    c10.k(obj);
                    C16807N n10 = C16807N.f139792a;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.z$d */
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5357z f23481c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5357z zVar) {
            super(0);
            this.f23481c = zVar;
        }

        public final void invoke() {
            do {
                W0.b d10 = this.f23481c.f23461f;
                C5357z zVar = this.f23481c;
                synchronized (d10) {
                    try {
                        if (!zVar.f23458c) {
                            zVar.f23458c = true;
                            W0.b d11 = zVar.f23461f;
                            int r10 = d11.r();
                            if (r10 > 0) {
                                Object[] q10 = d11.q();
                                int i10 = 0;
                                do {
                                    ((a) q10[i10]).h();
                                    i10++;
                                } while (i10 < r10);
                            }
                            zVar.f23458c = false;
                        }
                        C16807N n10 = C16807N.f139792a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (this.f23481c.m());
        }
    }

    public C5357z(C17642l<? super C17631a<C16807N>, C16807N> lVar) {
        this.f23456a = lVar;
    }

    /* access modifiers changed from: private */
    public final void i(Set<? extends Object> set) {
        Object obj;
        Collection collection;
        do {
            obj = this.f23457b.get();
            if (obj == null) {
                collection = set;
            } else if (obj instanceof Set) {
                collection = C16877v.q(obj, set);
            } else if (obj instanceof List) {
                collection = C16877v.V0((Collection) obj, C16877v.e(set));
            } else {
                q();
                throw new C16820k();
            }
        } while (!i.a(this.f23457b, obj, collection));
    }

    /* access modifiers changed from: private */
    public final boolean m() {
        boolean z10;
        synchronized (this.f23461f) {
            z10 = this.f23458c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set<Object> p10 = p();
            if (p10 == null) {
                return z11;
            }
            synchronized (this.f23461f) {
                try {
                    W0.b<a> bVar = this.f23461f;
                    int r10 = bVar.r();
                    if (r10 > 0) {
                        Object[] q10 = bVar.q();
                        int i10 = 0;
                        do {
                            if (!((a) q10[i10]).j(p10)) {
                                if (!z11) {
                                    z11 = false;
                                    i10++;
                                }
                            }
                            z11 = true;
                            i10++;
                        } while (i10 < r10);
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> g1.C5357z.a n(nI.C17642l<? super T, XH.C16807N> r6) {
        /*
            r5 = this;
            W0.b<g1.z$a> r0 = r5.f23461f
            int r1 = r0.r()
            if (r1 <= 0) goto L_0x001d
            java.lang.Object[] r0 = r0.q()
            r2 = 0
        L_0x000d:
            r3 = r0[r2]
            r4 = r3
            g1.z$a r4 = (g1.C5357z.a) r4
            nI.l r4 = r4.f()
            if (r4 != r6) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x000d
        L_0x001d:
            r3 = 0
        L_0x001e:
            g1.z$a r3 = (g1.C5357z.a) r3
            if (r3 != 0) goto L_0x0039
            g1.z$a r0 = new g1.z$a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            kotlin.jvm.internal.C17542s.h(r6, r1)
            r1 = 1
            java.lang.Object r6 = kotlin.jvm.internal.W.g(r6, r1)
            nI.l r6 = (nI.C17642l) r6
            r0.<init>(r6)
            W0.b<g1.z$a> r6 = r5.f23461f
            r6.b(r0)
            return r0
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C5357z.n(nI.l):g1.z$a");
    }

    private final Set<Object> p() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.f23457b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                q();
                throw new C16820k();
            }
        } while (!i.a(this.f23457b, obj, obj2));
        return set;
    }

    private final Void q() {
        C4895p.t("Unexpected notification");
        throw new C16820k();
    }

    /* access modifiers changed from: private */
    public final void r() {
        this.f23456a.invoke(new d(this));
    }

    public final void j() {
        synchronized (this.f23461f) {
            try {
                W0.b<a> bVar = this.f23461f;
                int r10 = bVar.r();
                if (r10 > 0) {
                    Object[] q10 = bVar.q();
                    int i10 = 0;
                    do {
                        ((a) q10[i10]).c();
                        i10++;
                    } while (i10 < r10);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(Object obj) {
        synchronized (this.f23461f) {
            try {
                W0.b<a> bVar = this.f23461f;
                int r10 = bVar.r();
                int i10 = 0;
                for (int i11 = 0; i11 < r10; i11++) {
                    a aVar = (a) bVar.q()[i11];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.q()[i11 - i10] = bVar.q()[i11];
                    }
                }
                int i12 = r10 - i10;
                C16870n.x(bVar.q(), null, i12, r10);
                bVar.F(i12);
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
    }

    public final void l(C17642l<Object, Boolean> lVar) {
        synchronized (this.f23461f) {
            try {
                W0.b<a> bVar = this.f23461f;
                int r10 = bVar.r();
                int i10 = 0;
                for (int i11 = 0; i11 < r10; i11++) {
                    a aVar = (a) bVar.q()[i11];
                    aVar.n(lVar);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.q()[i11 - i10] = bVar.q()[i11];
                    }
                }
                int i12 = r10 - i10;
                C16870n.x(bVar.q(), null, i12, r10);
                bVar.F(i12);
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
    }

    public final <T> void o(T t10, C17642l<? super T, C16807N> lVar, C17631a<C16807N> aVar) {
        a n10;
        synchronized (this.f23461f) {
            n10 = n(lVar);
        }
        boolean z10 = this.f23463h;
        a aVar2 = this.f23464i;
        long j10 = this.f23465j;
        if (j10 != -1) {
            if (!(j10 == C4863c.a())) {
                C0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + C4863c.a() + ", name=" + C4863c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f23463h = false;
            this.f23464i = n10;
            this.f23465j = C4863c.a();
            n10.i(t10, this.f23460e, aVar);
        } finally {
            this.f23464i = aVar2;
            this.f23463h = z10;
            this.f23465j = j10;
        }
    }

    public final void s() {
        this.f23462g = C5342k.f23395e.j(this.f23459d);
    }

    public final void t() {
        C5337f fVar = this.f23462g;
        if (fVar != null) {
            fVar.b();
        }
    }
}

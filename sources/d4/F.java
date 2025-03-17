package D4;

import D4.C6447v;
import D4.E;
import QJ.C16283A;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16423B;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u001f!#B^\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u0017*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0011R9\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010(R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0\u00178\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"LD4/F;", "", "Key", "Value", "Lkotlin/Function1;", "LdI/e;", "LD4/P;", "pagingSourceFactory", "initialKey", "LD4/L;", "config", "LD4/S;", "remoteMediator", "<init>", "(LnI/l;Ljava/lang/Object;LD4/L;LD4/S;)V", "LXH/N;", "k", "()V", "LD4/G;", "LQJ/F0;", "job", "LD4/T;", "accessor", "LTJ/g;", "LD4/E;", "j", "(LD4/G;LQJ/F0;LD4/T;)LTJ/g;", "previousPagingSource", "h", "(LD4/P;LdI/e;)Ljava/lang/Object;", "l", "a", "LnI/l;", "b", "Ljava/lang/Object;", "c", "LD4/L;", "LD4/h;", "", "d", "LD4/h;", "refreshEvents", "e", "retryEvents", "LD4/M;", "f", "LTJ/g;", "i", "()LTJ/g;", "flow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C17164e<? super P<Key, Value>>, Object> f33905a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Key f33906b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final L f33907c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C6434h<Boolean> f33908d = new C6434h<>((Object) null, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C6434h<C16807N> f33909e = new C6434h<>((Object) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private final C16532g<M<Value>> f33910f;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"LD4/F$a;", "", "Key", "Value", "LD4/G;", "snapshot", "LD4/Q;", "state", "LQJ/F0;", "job", "<init>", "(LD4/G;LD4/Q;LQJ/F0;)V", "a", "LD4/G;", "b", "()LD4/G;", "LD4/Q;", "c", "()LD4/Q;", "LQJ/F0;", "()LQJ/F0;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        private final G<Key, Value> f33911a;

        /* renamed from: b  reason: collision with root package name */
        private final Q<Key, Value> f33912b;

        /* renamed from: c  reason: collision with root package name */
        private final F0 f33913c;

        public a(G<Key, Value> g10, Q<Key, Value> q10, F0 f02) {
            C17542s.j(g10, "snapshot");
            C17542s.j(f02, "job");
            this.f33911a = g10;
            this.f33912b = q10;
            this.f33913c = f02;
        }

        public final F0 a() {
            return this.f33913c;
        }

        public final G<Key, Value> b() {
            return this.f33911a;
        }

        public final Q<Key, Value> c() {
            return this.f33912b;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B\u001d\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LD4/F$b;", "", "Key", "Value", "LD4/q;", "LD4/G;", "pageFetcherSnapshot", "<init>", "(LD4/F;LD4/G;)V", "LD4/d0;", "viewportHint", "LXH/N;", "a", "(LD4/d0;)V", "LD4/G;", "getPageFetcherSnapshot$paging_common", "()LD4/G;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b<Key, Value> implements C6443q {

        /* renamed from: a  reason: collision with root package name */
        private final G<Key, Value> f33914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F<Key, Value> f33915b;

        public b(F f10, G<Key, Value> g10) {
            C17542s.j(g10, "pageFetcherSnapshot");
            this.f33915b = f10;
            this.f33914a = g10;
        }

        public void a(d0 d0Var) {
            C17542s.j(d0Var, "viewportHint");
            this.f33914a.o(d0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"LD4/F$c;", "LD4/b0;", "LD4/h;", "LXH/N;", "retryEventBus", "<init>", "(LD4/F;LD4/h;)V", "a", "()V", "b", "LD4/h;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class c implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final C6434h<C16807N> f33916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F<Key, Value> f33917b;

        public c(F f10, C6434h<C16807N> hVar) {
            C17542s.j(hVar, "retryEventBus");
            this.f33917b = f10;
            this.f33916a = hVar;
        }

        public void a() {
            this.f33916a.b(C16807N.f139792a);
        }

        public void b() {
            this.f33917b.l();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/W;", "LD4/M;", "LXH/N;", "<anonymous>", "(LD4/W;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {136}, m = "invokeSuspend")
    static final class d extends l implements p<W<M<Value>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33918c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f33919d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F<Key, Value> f33920e;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {63, 63}, m = "invokeSuspend")
        static final class a extends l implements p<C16533h<? super Boolean>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f33921c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f33922d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ T<Key, Value> f33923e;

            a(T<Key, Value> t10, C17164e<? super a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f33923e, eVar);
                aVar.f33922d = obj;
                return aVar;
            }

            public final Object invoke(C16533h<? super Boolean> hVar, C17164e<? super C16807N> eVar) {
                return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: TJ.h} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r6.f33921c
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0023
                    if (r1 == r4) goto L_0x001b
                    if (r1 != r3) goto L_0x0013
                    XH.y.b(r7)
                    goto L_0x0053
                L_0x0013:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x001b:
                    java.lang.Object r1 = r6.f33922d
                    TJ.h r1 = (TJ.C16533h) r1
                    XH.y.b(r7)
                    goto L_0x003a
                L_0x0023:
                    XH.y.b(r7)
                    java.lang.Object r7 = r6.f33922d
                    r1 = r7
                    TJ.h r1 = (TJ.C16533h) r1
                    D4.T<Key, Value> r7 = r6.f33923e
                    if (r7 == 0) goto L_0x003d
                    r6.f33922d = r1
                    r6.f33921c = r4
                    java.lang.Object r7 = r7.a(r6)
                    if (r7 != r0) goto L_0x003a
                    return r0
                L_0x003a:
                    D4.S$a r7 = (D4.S.a) r7
                    goto L_0x003e
                L_0x003d:
                    r7 = r2
                L_0x003e:
                    D4.S$a r5 = D4.S.a.LAUNCH_INITIAL_REFRESH
                    if (r7 != r5) goto L_0x0043
                    goto L_0x0044
                L_0x0043:
                    r4 = 0
                L_0x0044:
                    java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r6.f33922d = r2
                    r6.f33921c = r3
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L_0x0053
                    return r0
                L_0x0053:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.F.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Key", "Value", "LD4/F$a;", "previousGeneration", "", "triggerRemoteRefresh", "<anonymous>", "(LD4/F$a;Z)LD4/F$a;"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {73, 77}, m = "invokeSuspend")
        static final class b extends l implements q<a<Key, Value>, Boolean, C17164e<? super a<Key, Value>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f33924c;

            /* renamed from: d  reason: collision with root package name */
            int f33925d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f33926e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ boolean f33927f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ T<Key, Value> f33928g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ F<Key, Value> f33929h;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
                a(Object obj) {
                    super(0, obj, F.class, "refresh", "refresh()V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    t();
                    return C16807N.f139792a;
                }

                public final void t() {
                    ((F) this.receiver).l();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(T<Key, Value> t10, F<Key, Value> f10, C17164e<? super b> eVar) {
                super(3, eVar);
                this.f33929h = f10;
            }

            public final Object i(a<Key, Value> aVar, boolean z10, C17164e<? super a<Key, Value>> eVar) {
                b bVar = new b(this.f33928g, this.f33929h, eVar);
                bVar.f33926e = aVar;
                bVar.f33927f = z10;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i((a) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
            }

            /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x00b1  */
            /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
            /* JADX WARNING: Removed duplicated region for block: B:62:0x00cf  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r14.f33925d
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x002b
                    if (r1 == r3) goto L_0x0023
                    if (r1 != r2) goto L_0x001b
                    java.lang.Object r0 = r14.f33924c
                    D4.P r0 = (D4.P) r0
                    java.lang.Object r1 = r14.f33926e
                    D4.F$a r1 = (D4.F.a) r1
                    XH.y.b(r15)
                    goto L_0x0074
                L_0x001b:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L_0x0023:
                    java.lang.Object r1 = r14.f33926e
                    D4.F$a r1 = (D4.F.a) r1
                    XH.y.b(r15)
                    goto L_0x005b
                L_0x002b:
                    XH.y.b(r15)
                    java.lang.Object r15 = r14.f33926e
                    D4.F$a r15 = (D4.F.a) r15
                    boolean r1 = r14.f33927f
                    if (r1 == 0) goto L_0x003d
                    D4.T<Key, Value> r1 = r14.f33928g
                    if (r1 == 0) goto L_0x003d
                    r1.c()
                L_0x003d:
                    D4.F<Key, Value> r1 = r14.f33929h
                    if (r15 == 0) goto L_0x004c
                    D4.G r5 = r15.b()
                    if (r5 == 0) goto L_0x004c
                    D4.P r5 = r5.v()
                    goto L_0x004d
                L_0x004c:
                    r5 = r4
                L_0x004d:
                    r14.f33926e = r15
                    r14.f33925d = r3
                    java.lang.Object r1 = r1.h(r5, r14)
                    if (r1 != r0) goto L_0x0058
                    return r0
                L_0x0058:
                    r13 = r1
                    r1 = r15
                    r15 = r13
                L_0x005b:
                    D4.P r15 = (D4.P) r15
                    if (r1 == 0) goto L_0x0078
                    D4.G r5 = r1.b()
                    if (r5 == 0) goto L_0x0078
                    r14.f33926e = r1
                    r14.f33924c = r15
                    r14.f33925d = r2
                    java.lang.Object r2 = r5.r(r14)
                    if (r2 != r0) goto L_0x0072
                    return r0
                L_0x0072:
                    r0 = r15
                    r15 = r2
                L_0x0074:
                    D4.Q r15 = (D4.Q) r15
                    r7 = r0
                    goto L_0x007a
                L_0x0078:
                    r7 = r15
                    r15 = r4
                L_0x007a:
                    if (r15 == 0) goto L_0x0081
                    java.util.List r0 = r15.d()
                    goto L_0x0082
                L_0x0081:
                    r0 = r4
                L_0x0082:
                    java.util.Collection r0 = (java.util.Collection) r0
                    if (r0 == 0) goto L_0x008c
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x00a7
                L_0x008c:
                    if (r1 == 0) goto L_0x00a7
                    D4.Q r0 = r1.c()
                    if (r0 == 0) goto L_0x00a7
                    java.util.List r0 = r0.d()
                    if (r0 == 0) goto L_0x00a7
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = r0.isEmpty()
                    r0 = r0 ^ r3
                    if (r0 != r3) goto L_0x00a7
                    D4.Q r15 = r1.c()
                L_0x00a7:
                    if (r15 == 0) goto L_0x00ae
                    java.lang.Integer r0 = r15.c()
                    goto L_0x00af
                L_0x00ae:
                    r0 = r4
                L_0x00af:
                    if (r0 != 0) goto L_0x00c5
                    if (r1 == 0) goto L_0x00be
                    D4.Q r0 = r1.c()
                    if (r0 == 0) goto L_0x00be
                    java.lang.Integer r0 = r0.c()
                    goto L_0x00bf
                L_0x00be:
                    r0 = r4
                L_0x00bf:
                    if (r0 == 0) goto L_0x00c5
                    D4.Q r15 = r1.c()
                L_0x00c5:
                    if (r15 != 0) goto L_0x00cf
                    D4.F<Key, Value> r0 = r14.f33929h
                    java.lang.Object r0 = r0.f33906b
                L_0x00cd:
                    r6 = r0
                    goto L_0x00fd
                L_0x00cf:
                    java.lang.Object r0 = r7.d(r15)
                    D4.y r2 = D4.C6451z.a()
                    if (r2 == 0) goto L_0x00cd
                    r5 = 3
                    boolean r6 = r2.b(r5)
                    if (r6 != r3) goto L_0x00cd
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r8 = "Refresh key "
                    r6.append(r8)
                    r6.append(r0)
                    java.lang.String r8 = " returned from PagingSource "
                    r6.append(r8)
                    r6.append(r7)
                    java.lang.String r6 = r6.toString()
                    r2.a(r5, r6, r4)
                    goto L_0x00cd
                L_0x00fd:
                    if (r1 == 0) goto L_0x0108
                    D4.G r0 = r1.b()
                    if (r0 == 0) goto L_0x0108
                    r0.p()
                L_0x0108:
                    if (r1 == 0) goto L_0x0113
                    QJ.F0 r0 = r1.a()
                    if (r0 == 0) goto L_0x0113
                    QJ.F0.a.a(r0, r4, r3, r4)
                L_0x0113:
                    D4.F$a r0 = new D4.F$a
                    D4.F<Key, Value> r1 = r14.f33929h
                    D4.L r8 = r1.f33907c
                    D4.F<Key, Value> r1 = r14.f33929h
                    D4.h r1 = r1.f33909e
                    TJ.g r9 = r1.a()
                    D4.F$d$b$a r12 = new D4.F$d$b$a
                    D4.F<Key, Value> r1 = r14.f33929h
                    r12.<init>(r1)
                    D4.G r1 = new D4.G
                    D4.T<Key, Value> r10 = r14.f33928g
                    r5 = r1
                    r11 = r15
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                    QJ.A r2 = QJ.J0.b(r4, r3, r4)
                    r0.<init>(r1, r15, r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.F.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/E;", "it", "LXH/N;", "<anonymous>", "(LD4/E;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
        static final class c extends l implements p<E<Value>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f33930c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f33931d;

            c(C17164e<? super c> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                c cVar = new c(eVar);
                cVar.f33931d = obj;
                return cVar;
            }

            /* renamed from: i */
            public final Object invoke(E<Value> e10, C17164e<? super C16807N> eVar) {
                return ((c) create(e10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f33930c == 0) {
                    y.b(obj);
                    E e10 = (E) this.f33931d;
                    C6450y a10 = C6451z.a();
                    if (a10 != null && a10.b(2)) {
                        a10.a(2, "Sent " + e10, (Throwable) null);
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: D4.F$d$d  reason: collision with other inner class name */
        /* synthetic */ class C0522d implements C16533h, C17537m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ W<M<Value>> f33932a;

            C0522d(W<M<Value>> w10) {
                this.f33932a = w10;
            }

            public final C16818i<?> c() {
                return new C17540p(2, this.f33932a, W.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            /* renamed from: d */
            public final Object emit(M<Value> m10, C17164e<? super C16807N> eVar) {
                Object y10 = this.f33932a.y(m10, eVar);
                return y10 == C17187b.f() ? y10 : C16807N.f139792a;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C16533h) || !(obj instanceof C17537m)) {
                    return false;
                }
                return C17542s.e(c(), ((C17537m) obj).c());
            }

            public final int hashCode() {
                return c().hashCode();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, d2 = {"T", "R", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {106}, m = "invokeSuspend")
        public static final class e extends l implements q<C16533h<? super M<Value>>, a<Key, Value>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f33933c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f33934d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f33935e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ F f33936f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ T f33937g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(C17164e eVar, F f10, T t10) {
                super(3, eVar);
                this.f33936f = f10;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super M<Value>> hVar, a<Key, Value> aVar, C17164e<? super C16807N> eVar) {
                e eVar2 = new e(eVar, this.f33936f, this.f33937g);
                eVar2.f33934d = hVar;
                eVar2.f33935e = aVar;
                return eVar2.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f33933c;
                if (i10 == 0) {
                    y.b(obj);
                    a aVar = (a) this.f33935e;
                    C16532g R10 = C16534i.R(this.f33936f.j(aVar.b(), aVar.a(), this.f33937g), new c((C17164e<? super c>) null));
                    F f11 = this.f33936f;
                    M m10 = new M(R10, new c(f11, f11.f33909e), new b(this.f33936f, aVar.b()), (C17631a) null, 8, (DefaultConstructorMarker) null);
                    this.f33933c = 1;
                    if (((C16533h) this.f33934d).emit(m10, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(S<Key, Value> s10, F<Key, Value> f10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f33920e = f10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d((S) null, this.f33920e, eVar);
            dVar.f33919d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(W<M<Value>> w10, C17164e<? super C16807N> eVar) {
            return ((d) create(w10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f33918c;
            if (i10 == 0) {
                y.b(obj);
                C16532g d10 = C6439m.d(C16534i.A(C6439m.c(C16534i.S(this.f33920e.f33908d.a(), new a((T) null, (C17164e<? super a>) null)), null, new b((T) null, this.f33920e, (C17164e<? super b>) null))), new e((C17164e) null, this.f33920e, (T) null));
                C0522d dVar = new C0522d((W) this.f33919d);
                this.f33918c = 1;
                if (d10.collect(dVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {210}, m = "generateNewPagingSource")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f33938c;

        /* renamed from: d  reason: collision with root package name */
        Object f33939d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f33940e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ F<Key, Value> f33941f;

        /* renamed from: g  reason: collision with root package name */
        int f33942g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(F<Key, Value> f10, C17164e<? super e> eVar) {
            super(eVar);
            this.f33941f = f10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f33940e = obj;
            this.f33942g |= Integer.MIN_VALUE;
            return this.f33941f.h((P) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {
        f(Object obj) {
            super(0, obj, F.class, "invalidate", "invalidate()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((F) this.receiver).k();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class g extends C17540p implements C17631a<C16807N> {
        g(Object obj) {
            super(0, obj, F.class, "invalidate", "invalidate()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((F) this.receiver).k();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/W;", "LD4/E;", "LXH/N;", "<anonymous>", "(LD4/W;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {203}, m = "invokeSuspend")
    static final class h extends l implements p<W<E<Value>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33943c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f33944d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T<Key, Value> f33945e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f33946f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C f33947g;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/E;", "it", "LXH/N;", "c", "(LD4/E;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ W<E<Value>> f33948a;

            a(W<E<Value>> w10) {
                this.f33948a = w10;
            }

            /* renamed from: c */
            public final Object emit(E<Value> e10, C17164e<? super C16807N> eVar) {
                Object y10 = this.f33948a.y(e10, eVar);
                return y10 == C17187b.f() ? y10 : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "LD4/W;", "LXH/N;", "<anonymous>", "(LD4/W;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {162}, m = "invokeSuspend")
        public static final class b extends l implements p<W<E<Value>>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f33949c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f33950d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16532g f33951e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C16532g f33952f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C f33953g;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H@"}, d2 = {"T1", "T2", "R", "t1", "t2", "LD4/f;", "updateFrom", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {142}, m = "invokeSuspend")
            public static final class a extends l implements r<C6448w, E<Value>, C6432f, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f33954c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f33955d;

                /* renamed from: e  reason: collision with root package name */
                /* synthetic */ Object f33956e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f33957f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ W<E<Value>> f33958g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C f33959h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(W w10, C17164e eVar, C c10) {
                    super(4, eVar);
                    this.f33959h = c10;
                    this.f33958g = w10;
                }

                /* renamed from: i */
                public final Object l(C6448w wVar, E<Value> e10, C6432f fVar, C17164e<? super C16807N> eVar) {
                    a aVar = new a(this.f33958g, eVar, this.f33959h);
                    aVar.f33955d = wVar;
                    aVar.f33956e = e10;
                    aVar.f33957f = fVar;
                    return aVar.invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f33954c;
                    if (i10 == 0) {
                        y.b(obj);
                        Object obj2 = this.f33955d;
                        Object obj3 = this.f33956e;
                        C6432f fVar = (C6432f) this.f33957f;
                        W<E<Value>> w10 = this.f33958g;
                        Object obj4 = (E) obj3;
                        C6448w wVar = (C6448w) obj2;
                        if (fVar == C6432f.RECEIVER) {
                            obj4 = new E.c(this.f33959h.d(), wVar);
                        } else if (obj4 instanceof E.b) {
                            E.b bVar = (E.b) obj4;
                            this.f33959h.b(bVar.k());
                            obj4 = E.b.e(bVar, (C6449x) null, (List) null, 0, 0, bVar.k(), wVar, 15, (Object) null);
                        } else if (obj4 instanceof E.a) {
                            this.f33959h.c(((E.a) obj4).c(), C6447v.c.f34457b.b());
                        } else if (obj4 instanceof E.c) {
                            E.c cVar = (E.c) obj4;
                            this.f33959h.b(cVar.d());
                            obj4 = new E.c(cVar.d(), wVar);
                        } else if (obj4 instanceof E.d) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        } else {
                            throw new t();
                        }
                        this.f33954c = 1;
                        if (w10.y(obj4, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {148}, m = "invokeSuspend")
            /* renamed from: D4.F$h$b$b  reason: collision with other inner class name */
            public static final class C0523b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f33960c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ W<E<Value>> f33961d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C16532g f33962e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ AtomicInteger f33963f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ c0 f33964g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ int f33965h;

                @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: D4.F$h$b$b$a */
                public static final class a<T> implements C16533h {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c0 f33966a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f33967b;

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: D4.F$h$b$b$a$a  reason: collision with other inner class name */
                    static final class C0524a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: c  reason: collision with root package name */
                        /* synthetic */ Object f33968c;

                        /* renamed from: d  reason: collision with root package name */
                        int f33969d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ a f33970e;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C0524a(a aVar, C17164e eVar) {
                            super(eVar);
                            this.f33970e = aVar;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.f33968c = obj;
                            this.f33969d |= Integer.MIN_VALUE;
                            return this.f33970e.emit((Object) null, this);
                        }
                    }

                    public a(c0 c0Var, int i10) {
                        this.f33966a = c0Var;
                        this.f33967b = i10;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
                    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(java.lang.Object r6, dI.C17164e<? super XH.C16807N> r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof D4.F.h.b.C0523b.a.C0524a
                            if (r0 == 0) goto L_0x0013
                            r0 = r7
                            D4.F$h$b$b$a$a r0 = (D4.F.h.b.C0523b.a.C0524a) r0
                            int r1 = r0.f33969d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.f33969d = r1
                            goto L_0x0018
                        L_0x0013:
                            D4.F$h$b$b$a$a r0 = new D4.F$h$b$b$a$a
                            r0.<init>(r5, r7)
                        L_0x0018:
                            java.lang.Object r7 = r0.f33968c
                            java.lang.Object r1 = eI.C17187b.f()
                            int r2 = r0.f33969d
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L_0x0038
                            if (r2 == r4) goto L_0x0034
                            if (r2 != r3) goto L_0x002c
                            XH.y.b(r7)
                            goto L_0x0051
                        L_0x002c:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L_0x0034:
                            XH.y.b(r7)
                            goto L_0x0048
                        L_0x0038:
                            XH.y.b(r7)
                            D4.c0 r7 = r5.f33966a
                            int r2 = r5.f33967b
                            r0.f33969d = r4
                            java.lang.Object r6 = r7.a(r2, r6, r0)
                            if (r6 != r1) goto L_0x0048
                            return r1
                        L_0x0048:
                            r0.f33969d = r3
                            java.lang.Object r6 = QJ.s1.a(r0)
                            if (r6 != r1) goto L_0x0051
                            return r1
                        L_0x0051:
                            XH.N r6 = XH.C16807N.f139792a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: D4.F.h.b.C0523b.a.emit(java.lang.Object, dI.e):java.lang.Object");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0523b(C16532g gVar, AtomicInteger atomicInteger, W w10, c0 c0Var, int i10, C17164e eVar) {
                    super(2, eVar);
                    this.f33962e = gVar;
                    this.f33963f = atomicInteger;
                    this.f33964g = c0Var;
                    this.f33965h = i10;
                    this.f33961d = w10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0523b(this.f33962e, this.f33963f, this.f33961d, this.f33964g, this.f33965h, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0523b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f33960c;
                    if (i10 == 0) {
                        y.b(obj);
                        C16532g gVar = this.f33962e;
                        a aVar = new a(this.f33964g, this.f33965h);
                        this.f33960c = 1;
                        if (gVar.collect(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        try {
                            y.b(obj);
                        } catch (Throwable th2) {
                            if (this.f33963f.decrementAndGet() == 0) {
                                C16423B.a.a(this.f33961d, (Throwable) null, 1, (Object) null);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (this.f33963f.decrementAndGet() == 0) {
                        C16423B.a.a(this.f33961d, (Throwable) null, 1, (Object) null);
                    }
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T1", "T2", "R", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class c extends C17544u implements C17631a<C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C16283A f33971c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public c(C16283A a10) {
                    super(0);
                    this.f33971c = a10;
                }

                public final void invoke() {
                    F0.a.a(this.f33971c, (CancellationException) null, 1, (Object) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C16532g gVar, C16532g gVar2, C17164e eVar, C c10) {
                super(2, eVar);
                this.f33951e = gVar;
                this.f33952f = gVar2;
                this.f33953g = c10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f33951e, this.f33952f, eVar, this.f33953g);
                bVar.f33950d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(W<E<Value>> w10, C17164e<? super C16807N> eVar) {
                return ((b) create(w10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                int i10 = 0;
                Object f10 = C17187b.f();
                int i11 = this.f33949c;
                if (i11 == 0) {
                    y.b(obj);
                    W w10 = (W) this.f33950d;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    c0 c0Var = new c0(new a(w10, (C17164e) null, this.f33953g));
                    C16283A b10 = J0.b((F0) null, 1, (Object) null);
                    C16532g[] gVarArr = {this.f33951e, this.f33952f};
                    int i12 = 0;
                    while (i10 < 2) {
                        F0 unused = C16314k.d(w10, b10, (T) null, new C0523b(gVarArr[i10], atomicInteger, w10, c0Var, i12, (C17164e) null), 2, (Object) null);
                        i10++;
                        i12++;
                        gVarArr = gVarArr;
                    }
                    c cVar = new c(b10);
                    this.f33949c = 1;
                    if (w10.v(cVar, this) == f10) {
                        return f10;
                    }
                } else if (i11 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(T<Key, Value> t10, G<Key, Value> g10, C c10, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f33946f = g10;
            this.f33947g = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f33945e, this.f33946f, this.f33947g, eVar);
            hVar.f33944d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(W<E<Value>> w10, C17164e<? super C16807N> eVar) {
            return ((h) create(w10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f33943c;
            if (i10 == 0) {
                y.b(obj);
                C16532g a10 = V.a(new b(this.f33945e.getState(), this.f33946f.u(), (C17164e) null, this.f33947g));
                a aVar = new a((W) this.f33944d);
                this.f33943c = 1;
                if (a10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public F(C17642l<? super C17164e<? super P<Key, Value>>, ? extends Object> lVar, Key key, L l10, S<Key, Value> s10) {
        C17542s.j(lVar, "pagingSourceFactory");
        C17542s.j(l10, "config");
        this.f33905a = lVar;
        this.f33906b = key;
        this.f33907c = l10;
        this.f33910f = V.a(new d(s10, this, (C17164e<? super d>) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(D4.P<Key, Value> r5, dI.C17164e<? super D4.P<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof D4.F.e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            D4.F$e r0 = (D4.F.e) r0
            int r1 = r0.f33942g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f33942g = r1
            goto L_0x0018
        L_0x0013:
            D4.F$e r0 = new D4.F$e
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f33940e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f33942g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f33939d
            D4.P r5 = (D4.P) r5
            java.lang.Object r0 = r0.f33938c
            D4.F r0 = (D4.F) r0
            XH.y.b(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            XH.y.b(r6)
            nI.l<dI.e<? super D4.P<Key, Value>>, java.lang.Object> r6 = r4.f33905a
            r0.f33938c = r4
            r0.f33939d = r5
            r0.f33942g = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            D4.P r6 = (D4.P) r6
            boolean r1 = r6 instanceof D4.C6446u
            if (r1 == 0) goto L_0x005c
            r1 = r6
            D4.u r1 = (D4.C6446u) r1
            D4.L r2 = r0.f33907c
            int r2 = r2.f34121a
            r1.k(r2)
        L_0x005c:
            if (r6 == r5) goto L_0x0098
            D4.F$f r1 = new D4.F$f
            r1.<init>(r0)
            r6.g(r1)
            if (r5 == 0) goto L_0x0070
            D4.F$g r1 = new D4.F$g
            r1.<init>(r0)
            r5.h(r1)
        L_0x0070:
            if (r5 == 0) goto L_0x0075
            r5.e()
        L_0x0075:
            D4.y r5 = D4.C6451z.a()
            if (r5 == 0) goto L_0x0097
            r0 = 3
            boolean r1 = r5.b(r0)
            if (r1 != r3) goto L_0x0097
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Generated new PagingSource "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r5.a(r0, r1, r2)
        L_0x0097:
            return r6
        L_0x0098:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.F.h(D4.P, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C16532g<E<Value>> j(G<Key, Value> g10, F0 f02, T<Key, Value> t10) {
        return t10 == null ? g10.u() : C6430d.a(f02, new h(t10, g10, new C(), (C17164e<? super h>) null));
    }

    /* access modifiers changed from: private */
    public final void k() {
        this.f33908d.b(Boolean.FALSE);
    }

    public final C16532g<M<Value>> i() {
        return this.f33910f;
    }

    public final void l() {
        this.f33908d.b(Boolean.TRUE);
    }
}

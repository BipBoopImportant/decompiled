package BH;

import AH.C15412c;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import pH.C17746a;
import qH.C17777b;
import qH.C17779d;
import sH.C17902f;
import vH.C18174m;
import vH.C18175n;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b*\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"LBH/g;", "", "LAH/c;", "builder", "LpH/a;", "client", "<init>", "(LAH/c;LpH/a;)V", "LXH/N;", "a", "()V", "T", "Lkotlin/Function2;", "LBH/c;", "LdI/e;", "block", "d", "(LnI/p;LdI/e;)Ljava/lang/Object;", "c", "(LdI/e;)Ljava/lang/Object;", "e", "b", "(LBH/c;LdI/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "LAH/c;", "LpH/a;", "getClient", "()LpH/a;", "getClient$annotations", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: BH.g  reason: case insensitive filesystem */
public final class C15462g {

    /* renamed from: a  reason: collision with root package name */
    private final C15412c f133252a;

    /* renamed from: b  reason: collision with root package name */
    private final C17746a f133253b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {126}, m = "cleanup")
    /* renamed from: BH.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f133254c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f133255d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15462g f133256e;

        /* renamed from: f  reason: collision with root package name */
        int f133257f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15462g gVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f133256e = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f133255d = obj;
            this.f133257f |= Integer.MIN_VALUE;
            return this.f133256e.b((C15458c) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {47, 50, 52, 52}, m = "execute")
    /* renamed from: BH.g$b */
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f133258c;

        /* renamed from: d  reason: collision with root package name */
        Object f133259d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f133260e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C15462g f133261f;

        /* renamed from: g  reason: collision with root package name */
        int f133262g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15462g gVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f133261f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f133260e = obj;
            this.f133262g |= Integer.MIN_VALUE;
            return this.f133261f.d((p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LBH/c;", "it", "<anonymous>", "(LBH/c;)LBH/c;"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.statement.HttpStatement$execute$4", f = "HttpStatement.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: BH.g$c */
    static final class c extends l implements p<C15458c, C17164e<? super C15458c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133263c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f133264d;

        c(C17164e<? super c> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(eVar);
            cVar.f133264d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C15458c cVar, C17164e<? super C15458c> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f133263c;
            if (i10 == 0) {
                y.b(obj);
                C17777b h02 = ((C15458c) this.f133264d).h0();
                this.f133263c = 1;
                obj = C17779d.a(h02, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((C17777b) obj).f();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {108}, m = "executeUnsafe")
    /* renamed from: BH.g$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f133265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15462g f133266d;

        /* renamed from: e  reason: collision with root package name */
        int f133267e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C15462g gVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f133266d = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f133265c = obj;
            this.f133267e |= Integer.MIN_VALUE;
            return this.f133266d.e(this);
        }
    }

    public C15462g(C15412c cVar, C17746a aVar) {
        C17542s.j(cVar, "builder");
        C17542s.j(aVar, "client");
        this.f133252a = cVar;
        this.f133253b = aVar;
        a();
    }

    private final void a() {
        Set keySet;
        Map map = (Map) this.f133252a.c().e(C17902f.a());
        if (map != null && (keySet = map.keySet()) != null) {
            ArrayList<C18174m> arrayList = new ArrayList<>();
            for (Object next : keySet) {
                if (next instanceof C18174m) {
                    arrayList.add(next);
                }
            }
            for (C18174m mVar : arrayList) {
                if (C18175n.c(this.f133253b, mVar) == null) {
                    throw new IllegalArgumentException(("Consider installing " + mVar + " plugin because the request requires it to be installed").toString());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(BH.C15458c r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof BH.C15462g.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            BH.g$a r0 = (BH.C15462g.a) r0
            int r1 = r0.f133257f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f133257f = r1
            goto L_0x0018
        L_0x0013:
            BH.g$a r0 = new BH.g$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f133255d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f133257f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f133254c
            QJ.A r5 = (QJ.C16283A) r5
            XH.y.b(r6)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            XH.y.b(r6)
            dI.i r6 = r5.getCoroutineContext()
            QJ.F0$b r2 = QJ.F0.f137562d0
            dI.i$b r6 = r6.get(r2)
            kotlin.jvm.internal.C17542s.g(r6)
            QJ.A r6 = (QJ.C16283A) r6
            r6.l()
            io.ktor.utils.io.g r5 = r5.b()     // Catch:{ all -> 0x0051 }
            io.ktor.utils.io.i.a(r5)     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0.f133254c = r6
            r0.f133257f = r3
            java.lang.Object r5 = r6.j0(r0)
            if (r5 != r1) goto L_0x005c
            return r1
        L_0x005c:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: BH.C15462g.b(BH.c, dI.e):java.lang.Object");
    }

    public final Object c(C17164e<? super C15458c> eVar) {
        return d(new c((C17164e<? super c>) null), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095 A[Catch:{ CancellationException -> 0x0040 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096 A[Catch:{ CancellationException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object d(nI.p<? super BH.C15458c, ? super dI.C17164e<? super T>, ? extends java.lang.Object> r10, dI.C17164e<? super T> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof BH.C15462g.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            BH.g$b r0 = (BH.C15462g.b) r0
            int r1 = r0.f133262g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f133262g = r1
            goto L_0x0018
        L_0x0013:
            BH.g$b r0 = new BH.g$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f133260e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f133262g
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0066
            if (r2 == r7) goto L_0x005a
            if (r2 == r6) goto L_0x0049
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0037
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            java.lang.Object r10 = r0.f133258c
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            XH.y.b(r11)     // Catch:{ CancellationException -> 0x0040 }
            goto L_0x00a6
        L_0x0040:
            r10 = move-exception
            goto L_0x00a7
        L_0x0043:
            java.lang.Object r10 = r0.f133258c
            XH.y.b(r11)     // Catch:{ CancellationException -> 0x0040 }
            goto L_0x0097
        L_0x0049:
            java.lang.Object r10 = r0.f133259d
            BH.c r10 = (BH.C15458c) r10
            java.lang.Object r2 = r0.f133258c
            BH.g r2 = (BH.C15462g) r2
            XH.y.b(r11)     // Catch:{ all -> 0x0055 }
            goto L_0x0089
        L_0x0055:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x0099
        L_0x005a:
            java.lang.Object r10 = r0.f133259d
            nI.p r10 = (nI.p) r10
            java.lang.Object r2 = r0.f133258c
            BH.g r2 = (BH.C15462g) r2
            XH.y.b(r11)     // Catch:{ CancellationException -> 0x0040 }
            goto L_0x0077
        L_0x0066:
            XH.y.b(r11)
            r0.f133258c = r9     // Catch:{ CancellationException -> 0x0040 }
            r0.f133259d = r10     // Catch:{ CancellationException -> 0x0040 }
            r0.f133262g = r7     // Catch:{ CancellationException -> 0x0040 }
            java.lang.Object r11 = r9.e(r0)     // Catch:{ CancellationException -> 0x0040 }
            if (r11 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r2 = r9
        L_0x0077:
            BH.c r11 = (BH.C15458c) r11     // Catch:{ CancellationException -> 0x0040 }
            r0.f133258c = r2     // Catch:{ all -> 0x0098 }
            r0.f133259d = r11     // Catch:{ all -> 0x0098 }
            r0.f133262g = r6     // Catch:{ all -> 0x0098 }
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch:{ all -> 0x0098 }
            if (r10 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0089:
            r0.f133258c = r11     // Catch:{ CancellationException -> 0x0040 }
            r0.f133259d = r3     // Catch:{ CancellationException -> 0x0040 }
            r0.f133262g = r5     // Catch:{ CancellationException -> 0x0040 }
            java.lang.Object r10 = r2.b(r10, r0)     // Catch:{ CancellationException -> 0x0040 }
            if (r10 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r10 = r11
        L_0x0097:
            return r10
        L_0x0098:
            r10 = move-exception
        L_0x0099:
            r0.f133258c = r10     // Catch:{ CancellationException -> 0x0040 }
            r0.f133259d = r3     // Catch:{ CancellationException -> 0x0040 }
            r0.f133262g = r4     // Catch:{ CancellationException -> 0x0040 }
            java.lang.Object r11 = r2.b(r11, r0)     // Catch:{ CancellationException -> 0x0040 }
            if (r11 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            throw r10     // Catch:{ CancellationException -> 0x0040 }
        L_0x00a7:
            java.lang.Throwable r10 = CH.C15492d.a(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: BH.C15462g.d(nI.p, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(dI.C17164e<? super BH.C15458c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof BH.C15462g.d
            if (r0 == 0) goto L_0x0013
            r0 = r5
            BH.g$d r0 = (BH.C15462g.d) r0
            int r1 = r0.f133267e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f133267e = r1
            goto L_0x0018
        L_0x0013:
            BH.g$d r0 = new BH.g$d
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f133265c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f133267e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            XH.y.b(r5)     // Catch:{ CancellationException -> 0x0029 }
            goto L_0x004c
        L_0x0029:
            r5 = move-exception
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            XH.y.b(r5)
            AH.c r5 = new AH.c     // Catch:{ CancellationException -> 0x0029 }
            r5.<init>()     // Catch:{ CancellationException -> 0x0029 }
            AH.c r2 = r4.f133252a     // Catch:{ CancellationException -> 0x0029 }
            AH.c r5 = r5.p(r2)     // Catch:{ CancellationException -> 0x0029 }
            pH.a r2 = r4.f133253b     // Catch:{ CancellationException -> 0x0029 }
            r0.f133267e = r3     // Catch:{ CancellationException -> 0x0029 }
            java.lang.Object r5 = r2.c(r5, r0)     // Catch:{ CancellationException -> 0x0029 }
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            qH.b r5 = (qH.C17777b) r5     // Catch:{ CancellationException -> 0x0029 }
            BH.c r5 = r5.f()     // Catch:{ CancellationException -> 0x0029 }
            return r5
        L_0x0053:
            java.lang.Throwable r5 = CH.C15492d.a(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: BH.C15462g.e(dI.e):java.lang.Object");
    }

    public String toString() {
        return "HttpStatement[" + this.f133252a.i() + ']';
    }
}

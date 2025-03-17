package xq;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import x5.C8954b;
import y5.C8981d;
import yq.C12499b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH@¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001c"}, d2 = {"Lxq/e;", "Lxq/d;", "Ly5/d;", "sqlDriver", "<init>", "(Ly5/d;)V", "", "episodEvent", "LXH/N;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "d", "(LdI/e;)Ljava/lang/Object;", "c", "LTJ/g;", "", "b", "()LTJ/g;", "Ly5/d;", "Lyq/b;", "LXH/o;", "f", "()Lyq/b;", "database", "LbK/a;", "LbK/a;", "mutex", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xq.e  reason: case insensitive filesystem */
public final class C12336e implements C12335d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C8981d f106255a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f106256b = C16825p.b(new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final C17052a f106257c = g.b(false, 1, (Object) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lyq/b;", "b", "()Lyq/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xq.e$a */
    static final class a extends C17544u implements C17631a<C12499b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12336e f106258c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12336e eVar) {
            super(0);
            this.f106258c = eVar;
        }

        /* renamed from: b */
        public final C12499b invoke() {
            return C12499b.f107208a.b(this.f106258c.f106255a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "com.ingka.ikea.episod.datalayer.datasource.local.LocalDataSourceImpl", f = "LocalDataSourceImpl.kt", l = {40}, m = "deleteAllItems")
    /* renamed from: xq.e$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f106259c;

        /* renamed from: d  reason: collision with root package name */
        Object f106260d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f106261e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12336e f106262f;

        /* renamed from: g  reason: collision with root package name */
        int f106263g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12336e eVar, C17164e<? super b> eVar2) {
            super(eVar2);
            this.f106262f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106261e = obj;
            this.f106263g |= Integer.MIN_VALUE;
            return this.f106262f.c(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "com.ingka.ikea.episod.datalayer.datasource.local.LocalDataSourceImpl", f = "LocalDataSourceImpl.kt", l = {40}, m = "getAllItems")
    /* renamed from: xq.e$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f106264c;

        /* renamed from: d  reason: collision with root package name */
        Object f106265d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f106266e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12336e f106267f;

        /* renamed from: g  reason: collision with root package name */
        int f106268g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C12336e eVar, C17164e<? super c> eVar2) {
            super(eVar2);
            this.f106267f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106266e = obj;
            this.f106268g |= Integer.MIN_VALUE;
            return this.f106267f.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xq.e$d */
    public static final class d implements C16532g<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f106269a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: xq.e$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f106270a;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @f(c = "com.ingka.ikea.episod.datalayer.datasource.local.LocalDataSourceImpl$getItemsCount$$inlined$map$1$2", f = "LocalDataSourceImpl.kt", l = {219}, m = "emit")
            /* renamed from: xq.e$d$a$a  reason: collision with other inner class name */
            public static final class C2530a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f106271c;

                /* renamed from: d  reason: collision with root package name */
                int f106272d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f106273e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2530a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f106273e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f106271c = obj;
                    this.f106272d |= Integer.MIN_VALUE;
                    return this.f106273e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f106270a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof xq.C12336e.d.a.C2530a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    xq.e$d$a$a r0 = (xq.C12336e.d.a.C2530a) r0
                    int r1 = r0.f106272d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f106272d = r1
                    goto L_0x0018
                L_0x0013:
                    xq.e$d$a$a r0 = new xq.e$d$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f106271c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f106272d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0050
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f106270a
                    w5.c r7 = (w5.c) r7
                    java.lang.Object r7 = r7.c()
                    java.lang.Number r7 = (java.lang.Number) r7
                    long r4 = r7.longValue()
                    int r7 = (int) r4
                    java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.e(r7)
                    r0.f106272d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: xq.C12336e.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f106269a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f106269a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "com.ingka.ikea.episod.datalayer.datasource.local.LocalDataSourceImpl", f = "LocalDataSourceImpl.kt", l = {40}, m = "saveItem")
    /* renamed from: xq.e$e  reason: collision with other inner class name */
    static final class C2531e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f106274c;

        /* renamed from: d  reason: collision with root package name */
        Object f106275d;

        /* renamed from: e  reason: collision with root package name */
        Object f106276e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f106277f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12336e f106278g;

        /* renamed from: h  reason: collision with root package name */
        int f106279h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2531e(C12336e eVar, C17164e<? super C2531e> eVar2) {
            super(eVar2);
            this.f106278g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106277f = obj;
            this.f106279h |= Integer.MIN_VALUE;
            return this.f106278g.a((String) null, this);
        }
    }

    public C12336e(C8981d dVar) {
        C17542s.j(dVar, "sqlDriver");
        this.f106255a = dVar;
    }

    private final C12499b f() {
        return (C12499b) this.f106256b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xq.C12336e.C2531e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            xq.e$e r0 = (xq.C12336e.C2531e) r0
            int r1 = r0.f106279h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106279h = r1
            goto L_0x0018
        L_0x0013:
            xq.e$e r0 = new xq.e$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f106277f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f106279h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f106276e
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r1 = r0.f106275d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f106274c
            xq.e r0 = (xq.C12336e) r0
            XH.y.b(r7)
            r7 = r6
            r6 = r1
            goto L_0x0055
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            XH.y.b(r7)
            bK.a r7 = r5.f106257c
            r0.f106274c = r5
            r0.f106275d = r6
            r0.f106276e = r7
            r0.f106279h = r3
            java.lang.Object r0 = r7.e(r4, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r5
        L_0x0055:
            yq.b r0 = r0.f()     // Catch:{ all -> 0x0066 }
            yq.a r0 = r0.a()     // Catch:{ all -> 0x0066 }
            r0.h(r6)     // Catch:{ all -> 0x0066 }
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0066 }
            r7.d(r4)
            return r6
        L_0x0066:
            r6 = move-exception
            r7.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xq.C12336e.a(java.lang.String, dI.e):java.lang.Object");
    }

    public C16532g<Integer> b() {
        return new d(C8954b.a(f().a().e()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(dI.C17164e<? super XH.C16807N> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xq.C12336e.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xq.e$b r0 = (xq.C12336e.b) r0
            int r1 = r0.f106263g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106263g = r1
            goto L_0x0018
        L_0x0013:
            xq.e$b r0 = new xq.e$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f106261e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f106263g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f106260d
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r0 = r0.f106259c
            xq.e r0 = (xq.C12336e) r0
            XH.y.b(r6)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            XH.y.b(r6)
            bK.a r6 = r5.f106257c
            r0.f106259c = r5
            r0.f106260d = r6
            r0.f106263g = r3
            java.lang.Object r0 = r6.e(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            yq.b r6 = r0.f()     // Catch:{ all -> 0x005f }
            yq.a r6 = r6.a()     // Catch:{ all -> 0x005f }
            r6.d()     // Catch:{ all -> 0x005f }
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x005f }
            r1.d(r4)
            return r6
        L_0x005f:
            r6 = move-exception
            r1.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xq.C12336e.c(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[Catch:{ all -> 0x0083 }, LOOP:0: B:18:0x006f->B:20:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(dI.C17164e<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xq.C12336e.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xq.e$c r0 = (xq.C12336e.c) r0
            int r1 = r0.f106268g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106268g = r1
            goto L_0x0018
        L_0x0013:
            xq.e$c r0 = new xq.e$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f106266e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f106268g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f106265d
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r0 = r0.f106264c
            xq.e r0 = (xq.C12336e) r0
            XH.y.b(r6)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            XH.y.b(r6)
            bK.a r6 = r5.f106257c
            r0.f106264c = r5
            r0.f106265d = r6
            r0.f106268g = r3
            java.lang.Object r0 = r6.e(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            yq.b r6 = r0.f()     // Catch:{ all -> 0x0083 }
            yq.a r6 = r6.a()     // Catch:{ all -> 0x0083 }
            w5.c r6 = r6.f()     // Catch:{ all -> 0x0083 }
            java.util.List r6 = r6.b()     // Catch:{ all -> 0x0083 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0083 }
            r2 = 10
            int r2 = YH.C16877v.y(r6, r2)     // Catch:{ all -> 0x0083 }
            r0.<init>(r2)     // Catch:{ all -> 0x0083 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0083 }
        L_0x006f:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0083 }
            yq.c r2 = (yq.C12500c) r2     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r2.a()     // Catch:{ all -> 0x0083 }
            r0.add(r2)     // Catch:{ all -> 0x0083 }
            goto L_0x006f
        L_0x0083:
            r6 = move-exception
            goto L_0x0089
        L_0x0085:
            r1.d(r4)
            return r0
        L_0x0089:
            r1.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xq.C12336e.d(dI.e):java.lang.Object");
    }
}

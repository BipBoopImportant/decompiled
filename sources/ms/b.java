package Ms;

import Ps.d;
import Ps.g;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\"\u0010\u0012J\u0010\u0010#\u001a\u00020!H@¢\u0006\u0004\b#\u0010 J\u001e\u0010%\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)¨\u0006*"}, d2 = {"LMs/b;", "LMs/a;", "LIs/a;", "inboxDao", "LLs/c;", "inboxNotificationMapper", "LLs/a;", "inboxNotificationEntityMapper", "<init>", "(LIs/a;LLs/c;LLs/a;)V", "LTJ/g;", "", "LPs/d;", "a", "()LTJ/g;", "LPs/b;", "id", "c", "(LPs/b;LdI/e;)Ljava/lang/Object;", "LGs/a;", "feature", "LPs/g;", "source", "LPs/c;", "messages", "", "replaceAllExisting", "LMs/c;", "f", "(LGs/a;LPs/g;Ljava/util/List;ZLdI/e;)Ljava/lang/Object;", "", "e", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "d", "b", "sources", "g", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LIs/a;", "LLs/c;", "LLs/a;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Is.a f83665a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Ls.c f83666b;

    /* renamed from: c  reason: collision with root package name */
    private final Ls.a f83667c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f83668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f83669b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ms.b$a$a  reason: collision with other inner class name */
        public static final class C1677a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f83670a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f83671b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.inboxrepository.impl.source.InboxLocalSourceImpl$getAllNotifications$$inlined$map$1$2", f = "InboxLocalSource.kt", l = {50}, m = "emit")
            /* renamed from: Ms.b$a$a$a  reason: collision with other inner class name */
            public static final class C1678a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f83672c;

                /* renamed from: d  reason: collision with root package name */
                int f83673d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1677a f83674e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1678a(C1677a aVar, C17164e eVar) {
                    super(eVar);
                    this.f83674e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f83672c = obj;
                    this.f83673d |= Integer.MIN_VALUE;
                    return this.f83674e.emit((Object) null, this);
                }
            }

            public C1677a(C16533h hVar, b bVar) {
                this.f83670a = hVar;
                this.f83671b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Ms.b.a.C1677a.C1678a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Ms.b$a$a$a r0 = (Ms.b.a.C1677a.C1678a) r0
                    int r1 = r0.f83673d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f83673d = r1
                    goto L_0x0018
                L_0x0013:
                    Ms.b$a$a$a r0 = new Ms.b$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f83672c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f83673d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x006c
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f83670a
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    Ms.b r2 = r6.f83671b
                    Ls.c r2 = r2.f83666b
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = YH.C16877v.y(r7, r5)
                    r4.<init>(r5)
                    java.util.Iterator r7 = r7.iterator()
                L_0x004f:
                    boolean r5 = r7.hasNext()
                    if (r5 == 0) goto L_0x0063
                    java.lang.Object r5 = r7.next()
                    Is.e r5 = (Is.e) r5
                    Ps.d r5 = r2.a(r5)
                    r4.add(r5)
                    goto L_0x004f
                L_0x0063:
                    r0.f83673d = r3
                    java.lang.Object r7 = r8.emit(r4, r0)
                    if (r7 != r1) goto L_0x006c
                    return r1
                L_0x006c:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Ms.b.a.C1677a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, b bVar) {
            this.f83668a = gVar;
            this.f83669b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f83668a.collect(new C1677a(hVar, this.f83669b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inboxrepository.impl.source.InboxLocalSourceImpl", f = "InboxLocalSource.kt", l = {55}, m = "getNotification")
    /* renamed from: Ms.b$b  reason: collision with other inner class name */
    static final class C1679b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f83675c;

        /* renamed from: d  reason: collision with root package name */
        Object f83676d;

        /* renamed from: e  reason: collision with root package name */
        Object f83677e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f83678f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f83679g;

        /* renamed from: h  reason: collision with root package name */
        int f83680h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1679b(b bVar, C17164e<? super C1679b> eVar) {
            super(eVar);
            this.f83679g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83678f = obj;
            this.f83680h |= Integer.MIN_VALUE;
            return this.f83679g.c((Ps.b) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inboxrepository.impl.source.InboxLocalSourceImpl", f = "InboxLocalSource.kt", l = {79}, m = "insertNotifications")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f83681c;

        /* renamed from: d  reason: collision with root package name */
        Object f83682d;

        /* renamed from: e  reason: collision with root package name */
        Object f83683e;

        /* renamed from: f  reason: collision with root package name */
        Object f83684f;

        /* renamed from: g  reason: collision with root package name */
        Object f83685g;

        /* renamed from: h  reason: collision with root package name */
        Object f83686h;

        /* renamed from: i  reason: collision with root package name */
        Object f83687i;

        /* renamed from: j  reason: collision with root package name */
        Object f83688j;

        /* renamed from: k  reason: collision with root package name */
        Object f83689k;

        /* renamed from: l  reason: collision with root package name */
        Object f83690l;

        /* renamed from: m  reason: collision with root package name */
        Object f83691m;

        /* renamed from: n  reason: collision with root package name */
        boolean f83692n;

        /* renamed from: o  reason: collision with root package name */
        int f83693o;

        /* renamed from: p  reason: collision with root package name */
        int f83694p;

        /* renamed from: q  reason: collision with root package name */
        int f83695q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f83696r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b f83697s;

        /* renamed from: t  reason: collision with root package name */
        int f83698t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f83697s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83696r = obj;
            this.f83698t |= Integer.MIN_VALUE;
            return this.f83697s.f((Gs.a) null, (g) null, (List<Ps.c>) null, false, this);
        }
    }

    public b(Is.a aVar, Ls.c cVar, Ls.a aVar2) {
        C17542s.j(aVar, "inboxDao");
        C17542s.j(cVar, "inboxNotificationMapper");
        C17542s.j(aVar2, "inboxNotificationEntityMapper");
        this.f83665a = aVar;
        this.f83666b = cVar;
        this.f83667c = aVar2;
    }

    public C16532g<List<d>> a() {
        return new a(this.f83665a.d(), this);
    }

    public Object b(C17164e<? super C16807N> eVar) {
        Object a10 = this.f83665a.a(eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(Ps.b r7, dI.C17164e<? super Ps.d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Ms.b.C1679b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Ms.b$b r0 = (Ms.b.C1679b) r0
            int r1 = r0.f83680h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f83680h = r1
            goto L_0x0018
        L_0x0013:
            Ms.b$b r0 = new Ms.b$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f83678f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f83680h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r7 = r0.f83677e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f83676d
            Ps.b r7 = (Ps.b) r7
            java.lang.Object r7 = r0.f83675c
            Ms.b r7 = (Ms.b) r7
            XH.y.b(r1)
            goto L_0x005a
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            XH.y.b(r1)
            Is.a r1 = r6.f83665a
            java.lang.String r3 = r7.b()
            java.lang.String r5 = r7.a()
            r0.f83675c = r6
            r0.f83676d = r7
            r0.f83677e = r8
            r0.f83680h = r4
            java.lang.Object r1 = r1.f(r3, r5, r0)
            if (r1 != r2) goto L_0x0059
            return r2
        L_0x0059:
            r7 = r6
        L_0x005a:
            Is.e r1 = (Is.e) r1
            if (r1 == 0) goto L_0x0065
            Ls.c r7 = r7.f83666b
            Ps.d r7 = r7.a(r1)
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ms.b.c(Ps.b, dI.e):java.lang.Object");
    }

    public Object d(Ps.b bVar, C17164e<? super C16807N> eVar) {
        Object l10 = Is.a.l(this.f83665a, bVar.b(), bVar.a(), false, eVar, 4, (Object) null);
        return l10 == C17187b.f() ? l10 : C16807N.f139792a;
    }

    public Object e(C17164e<? super Integer> eVar) {
        return this.f83665a.g(eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(Gs.a r20, Ps.g r21, java.util.List<Ps.c> r22, boolean r23, dI.C17164e<? super Ms.c> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            boolean r5 = r4 instanceof Ms.b.c
            if (r5 == 0) goto L_0x001d
            r5 = r4
            Ms.b$c r5 = (Ms.b.c) r5
            int r6 = r5.f83698t
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f83698t = r6
            goto L_0x0022
        L_0x001d:
            Ms.b$c r5 = new Ms.b$c
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f83696r
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f83698t
            r9 = 1
            if (r8 == 0) goto L_0x0068
            if (r8 != r9) goto L_0x0060
            java.lang.Object r1 = r5.f83691m
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r5.f83690l
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r5.f83689k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r5.f83688j
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r5.f83687i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f83686h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.f83685g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f83684f
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f83683e
            Ps.g r1 = (Ps.g) r1
            java.lang.Object r1 = r5.f83682d
            Gs.a r1 = (Gs.a) r1
            java.lang.Object r1 = r5.f83681c
            Ms.b r1 = (Ms.b) r1
            XH.y.b(r6)
            goto L_0x00f2
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0068:
            XH.y.b(r6)
            java.lang.String r6 = r20.d()
            int r8 = r20.getVersion()
            r15 = r2
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r14 = new java.util.ArrayList
            r10 = 10
            int r10 = YH.C16877v.y(r15, r10)
            r14.<init>(r10)
            java.util.Iterator r13 = r15.iterator()
        L_0x0085:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L_0x00b9
            java.lang.Object r10 = r13.next()
            r11 = r10
            Ps.c r11 = (Ps.c) r11
            Ls.a r10 = r0.f83667c
            java.util.Map r12 = r11.c()
            java.lang.String r16 = r1.a(r12)
            r12 = r21
            r9 = r13
            r13 = r6
            r17 = r7
            r7 = r14
            r14 = r8
            r18 = r8
            r8 = r15
            r15 = r16
            Is.e r10 = r10.a(r11, r12, r13, r14, r15)
            r7.add(r10)
            r14 = r7
            r15 = r8
            r13 = r9
            r7 = r17
            r8 = r18
            r9 = 1
            goto L_0x0085
        L_0x00b9:
            r17 = r7
            r18 = r8
            r9 = r13
            r7 = r14
            r8 = r15
            Is.a r10 = r0.f83665a
            r5.f83681c = r0
            r5.f83682d = r1
            r1 = r21
            r5.f83683e = r1
            r5.f83684f = r2
            r5.f83685g = r4
            r5.f83686h = r6
            r5.f83687i = r7
            r5.f83688j = r8
            r5.f83689k = r8
            r5.f83690l = r7
            r5.f83691m = r9
            r5.f83692n = r3
            r1 = r18
            r5.f83693o = r1
            r1 = 0
            r5.f83694p = r1
            r5.f83695q = r1
            r1 = 1
            r5.f83698t = r1
            java.lang.Object r6 = r10.i(r6, r7, r3, r5)
            r1 = r17
            if (r6 != r1) goto L_0x00f1
            return r1
        L_0x00f1:
            r1 = r0
        L_0x00f2:
            Js.a r6 = (Js.a) r6
            boolean r2 = r6 instanceof Js.a.C1629a
            if (r2 == 0) goto L_0x00fb
            Ms.c$a r1 = Ms.c.a.f83699a
            goto L_0x011e
        L_0x00fb:
            boolean r2 = r6 instanceof Js.a.b
            if (r2 == 0) goto L_0x0102
            Ms.c$b r1 = Ms.c.b.f83700a
            goto L_0x011e
        L_0x0102:
            boolean r2 = r6 instanceof Js.a.c
            if (r2 == 0) goto L_0x011f
            Ms.c$c r2 = new Ms.c$c
            Ls.c r1 = r1.f83666b
            Js.a$c r6 = (Js.a.c) r6
            java.util.List r3 = r6.a()
            java.util.List r1 = Ls.e.a(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            KJ.f r1 = KJ.C15985a.l(r1)
            r2.<init>(r1)
            r1 = r2
        L_0x011e:
            return r1
        L_0x011f:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ms.b.f(Gs.a, Ps.g, java.util.List, boolean, dI.e):java.lang.Object");
    }

    public Object g(List<? extends g> list, C17164e<? super C16807N> eVar) {
        Object c10 = this.f83665a.c(list, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}

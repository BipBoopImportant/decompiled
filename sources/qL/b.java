package Ql;

import Il.d;
import Sl.g;
import Sl.h;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import YH.C16877v;
import com.ingka.ikea.appconfig.model.UrlConfig;
import dI.C17164e;
import eI.C17187b;
import fI.C17220a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LQl/b;", "LSl/b;", "LIl/d;", "marketConfigRepository", "<init>", "(LIl/d;)V", "", "LSl/g;", "filters", "LTJ/g;", "", "LSl/h;", "a", "([LSl/g;)LTJ/g;", "LIl/d;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Sl.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f85955a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends UrlConfig>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f85956a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ql.b$a$a  reason: collision with other inner class name */
        public static final class C1759a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f85957a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.appconfig.impl.usecase.GetMarketLinksUseCaseImpl$invoke$$inlined$map$1$2", f = "GetMarketLinksUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Ql.b$a$a$a  reason: collision with other inner class name */
            public static final class C1760a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f85958c;

                /* renamed from: d  reason: collision with root package name */
                int f85959d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1759a f85960e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1760a(C1759a aVar, C17164e eVar) {
                    super(eVar);
                    this.f85960e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f85958c = obj;
                    this.f85959d |= Integer.MIN_VALUE;
                    return this.f85960e.emit((Object) null, this);
                }
            }

            public C1759a(C16533h hVar) {
                this.f85957a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ql.b.a.C1759a.C1760a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ql.b$a$a$a r0 = (Ql.b.a.C1759a.C1760a) r0
                    int r1 = r0.f85959d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f85959d = r1
                    goto L_0x0018
                L_0x0013:
                    Ql.b$a$a$a r0 = new Ql.b$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f85958c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f85959d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f85957a
                    Rl.e r5 = (Rl.e) r5
                    if (r5 == 0) goto L_0x003f
                    java.util.List r5 = r5.t()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f85959d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ql.b.a.C1759a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f85956a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f85956a.collect(new C1759a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ql.b$b  reason: collision with other inner class name */
    public static final class C1761b implements C16532g<List<? extends h>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f85961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f85962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f85963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f85964d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ql.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f85965a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f85966b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f85967c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f85968d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.appconfig.impl.usecase.GetMarketLinksUseCaseImpl$invoke$$inlined$map$2$2", f = "GetMarketLinksUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Ql.b$b$a$a  reason: collision with other inner class name */
            public static final class C1762a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f85969c;

                /* renamed from: d  reason: collision with root package name */
                int f85970d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f85971e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1762a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f85971e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f85969c = obj;
                    this.f85970d |= Integer.MIN_VALUE;
                    return this.f85971e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, List list, b bVar, List list2) {
                this.f85965a = hVar;
                this.f85966b = list;
                this.f85967c = bVar;
                this.f85968d = list2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x0164  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x0167 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r23, dI.C17164e r24) {
                /*
                    r22 = this;
                    r0 = r22
                    r1 = r24
                    boolean r2 = r1 instanceof Ql.b.C1761b.a.C1762a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    Ql.b$b$a$a r2 = (Ql.b.C1761b.a.C1762a) r2
                    int r3 = r2.f85970d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f85970d = r3
                    goto L_0x001c
                L_0x0017:
                    Ql.b$b$a$a r2 = new Ql.b$b$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f85969c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f85970d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x01d2
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f85965a
                    r4 = r23
                    java.util.List r4 = (java.util.List) r4
                    if (r4 == 0) goto L_0x01c4
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    java.util.Iterator r4 = r4.iterator()
                L_0x004c:
                    boolean r7 = r4.hasNext()
                    if (r7 == 0) goto L_0x016c
                    java.lang.Object r7 = r4.next()
                    r8 = r7
                    com.ingka.ikea.appconfig.model.UrlConfig r8 = (com.ingka.ikea.appconfig.model.UrlConfig) r8
                    java.util.List r9 = r0.f85966b
                    java.lang.String r10 = r8.b()
                    boolean r9 = r9.contains(r10)
                    r10 = 0
                    if (r9 != 0) goto L_0x014b
                    Ql.b r11 = r0.f85967c
                    XH.u r15 = new XH.u
                    java.lang.String r12 = r8.b()
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    r13.append(r12)
                    java.lang.String r12 = " is not supported"
                    r13.append(r12)
                    java.lang.String r12 = r13.toString()
                    r15.<init>(r12)
                    qv.e r14 = qv.e.WARN
                    qv.d r12 = qv.d.f102012a
                    java.util.List r12 = r12.a()
                    java.lang.Iterable r12 = (java.lang.Iterable) r12
                    java.util.ArrayList r13 = new java.util.ArrayList
                    r13.<init>()
                    java.util.Iterator r12 = r12.iterator()
                L_0x0095:
                    boolean r16 = r12.hasNext()
                    if (r16 == 0) goto L_0x00b1
                    java.lang.Object r5 = r12.next()
                    r23 = r4
                    r4 = r5
                    qv.b r4 = (qv.C11819b) r4
                    boolean r4 = r4.b(r14, r10)
                    if (r4 == 0) goto L_0x00ad
                    r13.add(r5)
                L_0x00ad:
                    r4 = r23
                    r5 = 1
                    goto L_0x0095
                L_0x00b1:
                    r23 = r4
                    java.util.Iterator r4 = r13.iterator()
                    r5 = 0
                    r12 = r5
                    r13 = r12
                L_0x00ba:
                    boolean r16 = r4.hasNext()
                    if (r16 == 0) goto L_0x014d
                    java.lang.Object r16 = r4.next()
                    qv.b r16 = (qv.C11819b) r16
                    if (r12 != 0) goto L_0x00d4
                    java.lang.String r12 = qv.C11818a.a(r5, r15)
                    if (r12 != 0) goto L_0x00d0
                    goto L_0x014d
                L_0x00d0:
                    java.lang.String r12 = qv.C11820c.a(r12)
                L_0x00d4:
                    r18 = r12
                    if (r13 != 0) goto L_0x012b
                    java.lang.Class r12 = r11.getClass()
                    java.lang.String r12 = r12.getName()
                    kotlin.jvm.internal.C17542s.g(r12)
                    r13 = 36
                    r10 = 2
                    java.lang.String r13 = HJ.C15854t.s1(r12, r13, r5, r10, r5)
                    r19 = r4
                    r4 = 46
                    java.lang.String r4 = HJ.C15854t.o1(r13, r4, r5, r10, r5)
                    int r10 = r4.length()
                    if (r10 != 0) goto L_0x00f9
                    goto L_0x00ff
                L_0x00f9:
                    java.lang.String r10 = "Kt"
                    java.lang.String r12 = HJ.C15854t.P0(r4, r10)
                L_0x00ff:
                    java.lang.Thread r4 = java.lang.Thread.currentThread()
                    java.lang.String r4 = r4.getName()
                    java.lang.String r10 = "main"
                    r13 = 1
                    boolean r4 = HJ.C15854t.b0(r4, r10, r13)
                    if (r4 == 0) goto L_0x0113
                    java.lang.String r4 = "m"
                    goto L_0x0115
                L_0x0113:
                    java.lang.String r4 = "b"
                L_0x0115:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r4)
                    java.lang.String r4 = "|"
                    r10.append(r4)
                    r10.append(r12)
                    java.lang.String r13 = r10.toString()
                L_0x0129:
                    r4 = r13
                    goto L_0x012e
                L_0x012b:
                    r19 = r4
                    goto L_0x0129
                L_0x012e:
                    r10 = 0
                    r12 = r16
                    r13 = r14
                    r20 = r14
                    r14 = r4
                    r21 = r15
                    r15 = r10
                    r16 = r21
                    r17 = r18
                    r12.a(r13, r14, r15, r16, r17)
                    r13 = r4
                    r12 = r18
                    r4 = r19
                    r14 = r20
                    r15 = r21
                    r10 = 0
                    goto L_0x00ba
                L_0x014b:
                    r23 = r4
                L_0x014d:
                    if (r9 == 0) goto L_0x0161
                    java.util.List r4 = r0.f85968d
                    if (r4 == 0) goto L_0x015c
                    java.lang.String r5 = r8.b()
                    boolean r13 = r4.contains(r5)
                    goto L_0x015d
                L_0x015c:
                    r13 = 1
                L_0x015d:
                    if (r13 == 0) goto L_0x0161
                    r10 = 1
                    goto L_0x0162
                L_0x0161:
                    r10 = 0
                L_0x0162:
                    if (r10 == 0) goto L_0x0167
                    r6.add(r7)
                L_0x0167:
                    r4 = r23
                    r5 = 1
                    goto L_0x004c
                L_0x016c:
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = YH.C16877v.y(r6, r5)
                    r4.<init>(r5)
                    java.util.Iterator r5 = r6.iterator()
                L_0x017b:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L_0x01c2
                    java.lang.Object r6 = r5.next()
                    com.ingka.ikea.appconfig.model.UrlConfig r6 = (com.ingka.ikea.appconfig.model.UrlConfig) r6
                    java.lang.String r7 = r6.a()
                    java.lang.String r8 = r6.c()
                    fI.a r9 = Sl.g.b()
                    java.util.Iterator r9 = r9.iterator()
                L_0x0197:
                    boolean r10 = r9.hasNext()
                    if (r10 == 0) goto L_0x01ba
                    java.lang.Object r10 = r9.next()
                    Sl.g r10 = (Sl.g) r10
                    java.lang.String r11 = r10.j()
                    java.lang.String r12 = r6.b()
                    boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
                    if (r11 == 0) goto L_0x0197
                    Sl.h r6 = new Sl.h
                    r6.<init>(r7, r8, r10)
                    r4.add(r6)
                    goto L_0x017b
                L_0x01ba:
                    java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                    java.lang.String r2 = "Collection contains no element matching the predicate."
                    r1.<init>(r2)
                    throw r1
                L_0x01c2:
                    r5 = 1
                    goto L_0x01c9
                L_0x01c4:
                    java.util.List r4 = YH.C16877v.n()
                    goto L_0x01c2
                L_0x01c9:
                    r2.f85970d = r5
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L_0x01d2
                    return r3
                L_0x01d2:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: Ql.b.C1761b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1761b(C16532g gVar, List list, b bVar, List list2) {
            this.f85961a = gVar;
            this.f85962b = list;
            this.f85963c = bVar;
            this.f85964d = list2;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f85961a.collect(new a(hVar, this.f85962b, this.f85963c, this.f85964d), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(d dVar) {
        C17542s.j(dVar, "marketConfigRepository");
        this.f85955a = dVar;
    }

    public C16532g<List<h>> a(g... gVarArr) {
        C17542s.j(gVarArr, "filters");
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (g j10 : gVarArr) {
            arrayList.add(j10.j());
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        C17220a<g> b10 = g.b();
        ArrayList arrayList2 = new ArrayList(C16877v.y(b10, 10));
        for (g j11 : b10) {
            arrayList2.add(j11.j());
        }
        return new C1761b(new a(this.f85955a.d()), arrayList2, this, arrayList);
    }
}

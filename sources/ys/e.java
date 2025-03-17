package Ys;

import HJ.C15854t;
import am.C11070a;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LYs/e;", "LVs/a;", "LYs/f;", "installReferrerParameterUseCase", "LXs/a;", "installReferrerStorage", "Lam/a;", "appApi", "LYs/h;", "utmMapper", "LWs/a;", "installReferrerAnalytics", "<init>", "(LYs/f;LXs/a;Lam/a;LYs/h;LWs/a;)V", "LXH/N;", "a", "()V", "LVs/b;", "b", "(LdI/e;)Ljava/lang/Object;", "LYs/f;", "LXs/a;", "c", "Lam/a;", "d", "LYs/h;", "e", "LWs/a;", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements Vs.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f89731a;

    /* renamed from: b  reason: collision with root package name */
    private final Xs.a f89732b;

    /* renamed from: c  reason: collision with root package name */
    private final C11070a f89733c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final h f89734d;

    /* renamed from: e  reason: collision with root package name */
    private final Ws.a f89735e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.installreferrer.impl.domain.InstallReferrerImpl", f = "InstallReferrerImpl.kt", l = {43}, m = "getApplink")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f89736c;

        /* renamed from: d  reason: collision with root package name */
        Object f89737d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f89738e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f89739f;

        /* renamed from: g  reason: collision with root package name */
        int f89740g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f89739f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89738e = obj;
            this.f89740g |= Integer.MIN_VALUE;
            return this.f89739f.b(this);
        }
    }

    public e(f fVar, Xs.a aVar, C11070a aVar2, h hVar, Ws.a aVar3) {
        C17542s.j(fVar, "installReferrerParameterUseCase");
        C17542s.j(aVar, "installReferrerStorage");
        C17542s.j(aVar2, "appApi");
        C17542s.j(hVar, "utmMapper");
        C17542s.j(aVar3, "installReferrerAnalytics");
        this.f89731a = fVar;
        this.f89732b = aVar;
        this.f89733c = aVar2;
        this.f89734d = hVar;
        this.f89735e = aVar3;
    }

    public void a() {
        if (this.f89733c.b()) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Install referrer analytics not sent on debug apps", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = e.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return;
        }
        this.f89735e.a(this.f89734d.c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super Vs.b> r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof Ys.e.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Ys.e$a r2 = (Ys.e.a) r2
            int r3 = r2.f89740g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f89740g = r3
            goto L_0x001c
        L_0x0017:
            Ys.e$a r2 = new Ys.e$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f89738e
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f89740g
            r6 = 1
            if (r5 == 0) goto L_0x003d
            if (r5 != r6) goto L_0x0035
            java.lang.Object r1 = r2.f89737d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f89736c
            Ys.e r1 = (Ys.e) r1
            XH.y.b(r3)
            goto L_0x0062
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            XH.y.b(r3)
            am.a r3 = r0.f89733c
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x0234
            Xs.a r3 = r0.f89732b
            boolean r3 = r3.m()
            if (r3 == 0) goto L_0x0052
            goto L_0x0234
        L_0x0052:
            Ys.f r3 = r0.f89731a
            r2.f89736c = r0
            r2.f89737d = r1
            r2.f89740g = r6
            java.lang.Object r3 = r3.a(r2)
            if (r3 != r4) goto L_0x0061
            return r4
        L_0x0061:
            r1 = r0
        L_0x0062:
            Ys.f$a r3 = (Ys.f.a) r3
            Ys.f$a$a r2 = Ys.f.a.C1920a.f89741a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r3, r2)
            if (r2 == 0) goto L_0x0075
            Xs.a r1 = r1.f89732b
            r1.n()
            Vs.b$c r1 = Vs.b.c.f88785a
            goto L_0x022d
        L_0x0075:
            Ys.f$a$b r2 = Ys.f.a.b.f89742a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r3, r2)
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r7 = "m"
            java.lang.String r8 = "main"
            java.lang.String r9 = "Kt"
            r11 = 36
            r12 = 0
            r13 = 2
            r14 = 0
            if (r2 == 0) goto L_0x013a
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x009f:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x00b7
            java.lang.Object r6 = r3.next()
            r10 = r6
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r2, r12)
            if (r10 == 0) goto L_0x00b5
            r15.add(r6)
        L_0x00b5:
            r6 = 1
            goto L_0x009f
        L_0x00b7:
            java.util.Iterator r3 = r15.iterator()
            r6 = r14
            r10 = r6
        L_0x00bd:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0131
            java.lang.Object r12 = r3.next()
            r15 = r12
            qv.b r15 = (qv.C11819b) r15
            r12 = 0
            if (r6 != 0) goto L_0x00da
            java.lang.String r6 = "Referrer no utm parameters"
            java.lang.String r6 = qv.C11818a.a(r6, r12)
            if (r6 != 0) goto L_0x00d6
            goto L_0x0131
        L_0x00d6:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x00da:
            if (r10 != 0) goto L_0x0120
            java.lang.Class r10 = r1.getClass()
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            java.lang.String r12 = HJ.C15854t.s1(r10, r11, r14, r13, r14)
            r11 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r11, r14, r13, r14)
            int r11 = r12.length()
            if (r11 != 0) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            java.lang.String r10 = HJ.C15854t.P0(r12, r9)
        L_0x00fc:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r12 = 1
            boolean r11 = HJ.C15854t.b0(r11, r8, r12)
            if (r11 == 0) goto L_0x010d
            r11 = r7
            goto L_0x010e
        L_0x010d:
            r11 = r5
        L_0x010e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r4)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
        L_0x0120:
            r18 = 0
            r16 = r2
            r17 = r10
            r11 = 0
            r19 = r11
            r20 = r6
            r15.a(r16, r17, r18, r19, r20)
            r11 = 36
            goto L_0x00bd
        L_0x0131:
            Xs.a r1 = r1.f89732b
            r1.n()
            Vs.b$c r1 = Vs.b.c.f88785a
            goto L_0x022d
        L_0x013a:
            Ys.f$a$c r2 = Ys.f.a.c.f89743a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r3, r2)
            if (r2 == 0) goto L_0x0146
            Vs.b$c r1 = Vs.b.c.f88785a
            goto L_0x022d
        L_0x0146:
            boolean r2 = r3 instanceof Ys.f.a.d
            if (r2 == 0) goto L_0x022e
            Xs.a r2 = r1.f89732b
            r2.n()
            Ys.h r2 = r1.f89734d
            Ys.f$a$d r3 = (Ys.f.a.d) r3
            java.lang.String r3 = r3.a()
            r2.b(r3)
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x016d:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0184
            java.lang.Object r10 = r3.next()
            r11 = r10
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r2, r12)
            if (r11 == 0) goto L_0x016d
            r6.add(r10)
            goto L_0x016d
        L_0x0184:
            java.util.Iterator r3 = r6.iterator()
            r6 = r14
            r10 = r6
        L_0x018a:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x021c
            java.lang.Object r11 = r3.next()
            r15 = r11
            qv.b r15 = (qv.C11819b) r15
            r11 = 0
            if (r6 != 0) goto L_0x01c3
            Ys.h r6 = r1.f89734d
            Ys.j r6 = r6.c()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Referrer utm parameters: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = " "
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            java.lang.String r6 = qv.C11818a.a(r6, r11)
            if (r6 != 0) goto L_0x01bf
            goto L_0x021c
        L_0x01bf:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x01c3:
            if (r10 != 0) goto L_0x020b
            java.lang.Class<Ys.e> r10 = Ys.e.class
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r12 = 36
            r13 = 2
            java.lang.String r11 = HJ.C15854t.s1(r10, r12, r14, r13, r14)
            r12 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r12, r14, r13, r14)
            int r16 = r11.length()
            if (r16 != 0) goto L_0x01e2
            goto L_0x01e6
        L_0x01e2:
            java.lang.String r10 = HJ.C15854t.P0(r11, r9)
        L_0x01e6:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r12 = 1
            boolean r11 = HJ.C15854t.b0(r11, r8, r12)
            if (r11 == 0) goto L_0x01f7
            r11 = r7
            goto L_0x01f8
        L_0x01f7:
            r11 = r5
        L_0x01f8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r4)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            goto L_0x020c
        L_0x020b:
            r13 = 2
        L_0x020c:
            r18 = 0
            r16 = r2
            r17 = r10
            r11 = 0
            r19 = r11
            r20 = r6
            r15.a(r16, r17, r18, r19, r20)
            goto L_0x018a
        L_0x021c:
            Ys.h r1 = r1.f89734d
            java.lang.String r1 = r1.a()
            if (r1 == 0) goto L_0x022b
            Vs.b$b r2 = new Vs.b$b
            r2.<init>(r1)
            r1 = r2
            goto L_0x022d
        L_0x022b:
            Vs.b$c r1 = Vs.b.c.f88785a
        L_0x022d:
            return r1
        L_0x022e:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0234:
            Vs.b$a r1 = Vs.b.a.f88783a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ys.e.b(dI.e):java.lang.Object");
    }
}

package xu;

import XH.x;
import am.C11070a;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tu.C11995a;
import zu.C12555a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxu/a;", "Lzu/a;", "Ltu/a;", "wayfindingRepository", "Lam/a;", "appApi", "<init>", "(Ltu/a;Lam/a;)V", "", "storeId", "LXH/x;", "Lyu/a;", "invoke-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "invoke", "a", "Ltu/a;", "b", "Lam/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xu.a  reason: case insensitive filesystem */
public final class C12343a implements C12555a {

    /* renamed from: a  reason: collision with root package name */
    private final C11995a f106283a;

    /* renamed from: b  reason: collision with root package name */
    private final C11070a f106284b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.wayfinding.datalayer.impl.usecase.GetWayfindingDetailsUseCaseImpl", f = "GetWayfindingDetailsUseCaseImpl.kt", l = {20}, m = "invoke-gIAlu-s")
    /* renamed from: xu.a$a  reason: collision with other inner class name */
    static final class C2533a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f106285c;

        /* renamed from: d  reason: collision with root package name */
        Object f106286d;

        /* renamed from: e  reason: collision with root package name */
        Object f106287e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f106288f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12343a f106289g;

        /* renamed from: h  reason: collision with root package name */
        int f106290h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2533a(C12343a aVar, C17164e<? super C2533a> eVar) {
            super(eVar);
            this.f106289g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106288f = obj;
            this.f106290h |= Integer.MIN_VALUE;
            Object r22 = this.f106289g.m15invokegIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C12343a(C11995a aVar, C11070a aVar2) {
        C17542s.j(aVar, "wayfindingRepository");
        C17542s.j(aVar2, "appApi");
        this.f106283a = aVar;
        this.f106284b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m15invokegIAlus(java.lang.String r24, dI.C17164e<? super XH.x<yu.C12516a>> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            boolean r3 = r2 instanceof xu.C12343a.C2533a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            xu.a$a r3 = (xu.C12343a.C2533a) r3
            int r4 = r3.f106290h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f106290h = r4
            goto L_0x001e
        L_0x0019:
            xu.a$a r3 = new xu.a$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f106288f
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f106290h
            r7 = 1
            if (r6 == 0) goto L_0x0049
            if (r6 != r7) goto L_0x0041
            java.lang.Object r1 = r3.f106287e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f106286d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.f106285c
            xu.a r2 = (xu.C12343a) r2
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r3 = r4.j()
            goto L_0x005e
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0049:
            XH.y.b(r4)
            tu.a r4 = r0.f106283a
            r3.f106285c = r0
            r3.f106286d = r1
            r3.f106287e = r2
            r3.f106290h = r7
            java.lang.Object r3 = r4.b(r1, r3)
            if (r3 != r5) goto L_0x005d
            return r5
        L_0x005d:
            r2 = r0
        L_0x005e:
            java.lang.Throwable r4 = XH.x.e(r3)
            java.lang.String r5 = "|"
            java.lang.String r6 = "b"
            java.lang.String r14 = "m"
            java.lang.String r15 = "main"
            java.lang.String r13 = "Kt"
            r12 = 46
            r11 = 36
            r8 = 0
            r10 = 2
            r9 = 0
            if (r4 != 0) goto L_0x0130
            yu.a r3 = (yu.C12516a) r3
            am.a r1 = r2.f106284b
            boolean r1 = r1.b()
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = XH.x.b(r3)
            goto L_0x0210
        L_0x0089:
            qv.e r1 = qv.e.INFO
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x009c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b4
            java.lang.Object r4 = r2.next()
            r7 = r4
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r1, r8)
            if (r7 == 0) goto L_0x00b2
            r3.add(r4)
        L_0x00b2:
            r7 = 1
            goto L_0x009c
        L_0x00b4:
            java.util.Iterator r2 = r3.iterator()
            r3 = r9
            r4 = r3
        L_0x00ba:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x012a
            java.lang.Object r7 = r2.next()
            r16 = r7
            qv.b r16 = (qv.C11819b) r16
            r7 = 0
            if (r3 != 0) goto L_0x00d8
            java.lang.String r3 = "Wayfinding deactivated for build"
            java.lang.String r3 = qv.C11818a.a(r3, r7)
            if (r3 != 0) goto L_0x00d4
            goto L_0x012a
        L_0x00d4:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00d8:
            if (r4 != 0) goto L_0x011a
            java.lang.Class<xu.a> r4 = xu.C12343a.class
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            java.lang.String r8 = HJ.C15854t.s1(r4, r11, r9, r10, r9)
            java.lang.String r8 = HJ.C15854t.o1(r8, r12, r9, r10, r9)
            int r17 = r8.length()
            if (r17 != 0) goto L_0x00f2
            goto L_0x00f6
        L_0x00f2:
            java.lang.String r4 = HJ.C15854t.P0(r8, r13)
        L_0x00f6:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r12 = 1
            boolean r8 = HJ.C15854t.b0(r8, r15, r12)
            if (r8 == 0) goto L_0x0107
            r8 = r14
            goto L_0x0108
        L_0x0107:
            r8 = r6
        L_0x0108:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            r12.append(r5)
            r12.append(r4)
            java.lang.String r4 = r12.toString()
        L_0x011a:
            r19 = 0
            r17 = r1
            r18 = r4
            r20 = r7
            r21 = r3
            r16.a(r17, r18, r19, r20, r21)
            r12 = 46
            goto L_0x00ba
        L_0x012a:
            java.lang.Object r1 = XH.x.b(r9)
            goto L_0x0210
        L_0x0130:
            qv.e r3 = qv.e.WARN
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0143:
            boolean r16 = r7.hasNext()
            if (r16 == 0) goto L_0x015c
            java.lang.Object r9 = r7.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r3, r8)
            if (r10 == 0) goto L_0x0159
            r12.add(r9)
        L_0x0159:
            r9 = 0
            r10 = 2
            goto L_0x0143
        L_0x015c:
            java.util.Iterator r7 = r12.iterator()
            r8 = 0
            r9 = 0
        L_0x0162:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0206
            java.lang.Object r10 = r7.next()
            qv.b r10 = (qv.C11819b) r10
            if (r8 != 0) goto L_0x018d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "Unable to get wayfinding details for store "
            r8.append(r12)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = qv.C11818a.a(r8, r4)
            if (r8 != 0) goto L_0x0189
            goto L_0x0206
        L_0x0189:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x018d:
            r17 = r8
            if (r9 != 0) goto L_0x01db
            java.lang.Class r8 = r2.getClass()
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r9 = 0
            r12 = 2
            java.lang.String r0 = HJ.C15854t.s1(r8, r11, r9, r12, r9)
            r11 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r11, r9, r12, r9)
            int r16 = r0.length()
            if (r16 != 0) goto L_0x01af
            goto L_0x01b3
        L_0x01af:
            java.lang.String r8 = HJ.C15854t.P0(r0, r13)
        L_0x01b3:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r11 = 1
            boolean r0 = HJ.C15854t.b0(r0, r15, r11)
            if (r0 == 0) goto L_0x01c4
            r0 = r14
            goto L_0x01c5
        L_0x01c4:
            r0 = r6
        L_0x01c5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r5)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r16 = r9
            r0 = 0
            goto L_0x01e0
        L_0x01db:
            r0 = 0
            r11 = 1
            r12 = 2
            r16 = r9
        L_0x01e0:
            r18 = 0
            r8 = r10
            r9 = r3
            r19 = r12
            r10 = r16
            r20 = r11
            r12 = 46
            r21 = 36
            r11 = r18
            r18 = r12
            r12 = r4
            r22 = r13
            r13 = r17
            r8.a(r9, r10, r11, r12, r13)
            r0 = r23
            r9 = r16
            r8 = r17
            r11 = r21
            r13 = r22
            goto L_0x0162
        L_0x0206:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r4)
            java.lang.Object r1 = XH.x.b(r0)
        L_0x0210:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.C12343a.m15invokegIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}

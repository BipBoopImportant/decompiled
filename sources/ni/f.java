package ni;

import BA.C12609a;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lni/f;", "Lni/e;", "LBA/a;", "shareRepository", "<init>", "(LBA/a;)V", "", "itemNo", "itemType", "Lni/i;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LBA/a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C12609a f75661a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v3.usecase.GetShareItemUrlUseCaseImpl", f = "GetShareItemUrlUseCase.kt", l = {20}, m = "get")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f75662c;

        /* renamed from: d  reason: collision with root package name */
        Object f75663d;

        /* renamed from: e  reason: collision with root package name */
        Object f75664e;

        /* renamed from: f  reason: collision with root package name */
        Object f75665f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f75666g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f75667h;

        /* renamed from: i  reason: collision with root package name */
        int f75668i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f75667h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f75666g = obj;
            this.f75668i |= Integer.MIN_VALUE;
            return this.f75667h.a((String) null, (String) null, this);
        }
    }

    public f(C12609a aVar) {
        C17542s.j(aVar, "shareRepository");
        this.f75661a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r19, java.lang.String r20, dI.C17164e<? super ni.i> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof ni.f.a
            if (r4 == 0) goto L_0x001b
            r4 = r3
            ni.f$a r4 = (ni.f.a) r4
            int r5 = r4.f75668i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f75668i = r5
            goto L_0x0020
        L_0x001b:
            ni.f$a r4 = new ni.f$a
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f75666g
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f75668i
            r8 = 1
            if (r7 == 0) goto L_0x0054
            if (r7 != r8) goto L_0x004c
            java.lang.Object r1 = r4.f75665f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f75664e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.f75663d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.f75662c
            ni.f r3 = (ni.f) r3
            XH.y.b(r5)
            XH.x r5 = (XH.x) r5
            java.lang.Object r4 = r5.j()
            r17 = r2
            r2 = r1
            r1 = r17
            goto L_0x006d
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0054:
            XH.y.b(r5)
            BA.a r5 = r0.f75661a
            CA.b r7 = CA.C12683b.PIP
            r4.f75662c = r0
            r4.f75663d = r1
            r4.f75664e = r2
            r4.f75665f = r3
            r4.f75668i = r8
            java.lang.Object r4 = r5.a(r1, r2, r7, r4)
            if (r4 != r6) goto L_0x006c
            return r6
        L_0x006c:
            r3 = r0
        L_0x006d:
            java.lang.Throwable r5 = XH.x.e(r4)
            if (r5 != 0) goto L_0x007c
            java.lang.String r4 = (java.lang.String) r4
            ni.i$b r1 = new ni.i$b
            r1.<init>(r4)
            goto L_0x0148
        L_0x007c:
            qv.e r4 = qv.e.WARN
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x008f:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00a7
            java.lang.Object r9 = r6.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            r11 = 0
            boolean r10 = r10.b(r4, r11)
            if (r10 == 0) goto L_0x008f
            r7.add(r9)
            goto L_0x008f
        L_0x00a7:
            java.util.Iterator r6 = r7.iterator()
            r7 = 0
            r9 = r7
            r10 = r9
        L_0x00ae:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0143
            java.lang.Object r11 = r6.next()
            qv.b r11 = (qv.C11819b) r11
            if (r9 != 0) goto L_0x00e1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Failed to share item: itemNo: "
            r9.append(r12)
            r9.append(r1)
            java.lang.String r12 = " itemType: "
            r9.append(r12)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r5)
            if (r9 != 0) goto L_0x00dd
            goto L_0x0143
        L_0x00dd:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x00e1:
            r15 = r9
            if (r10 != 0) goto L_0x0132
            java.lang.Class r9 = r3.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r10 = 36
            r12 = 2
            java.lang.String r10 = HJ.C15854t.s1(r9, r10, r7, r12, r7)
            r13 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r13, r7, r12, r7)
            int r12 = r10.length()
            if (r12 != 0) goto L_0x0103
            goto L_0x0109
        L_0x0103:
            java.lang.String r9 = "Kt"
            java.lang.String r9 = HJ.C15854t.P0(r10, r9)
        L_0x0109:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r12 = "main"
            boolean r10 = HJ.C15854t.b0(r10, r12, r8)
            if (r10 == 0) goto L_0x011c
            java.lang.String r10 = "m"
            goto L_0x011e
        L_0x011c:
            java.lang.String r10 = "b"
        L_0x011e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = "|"
            r12.append(r10)
            r12.append(r9)
            java.lang.String r10 = r12.toString()
        L_0x0132:
            r16 = r10
            r12 = 0
            r9 = r11
            r10 = r4
            r11 = r16
            r13 = r5
            r14 = r15
            r9.a(r10, r11, r12, r13, r14)
            r9 = r15
            r10 = r16
            goto L_0x00ae
        L_0x0143:
            ni.i$a r1 = new ni.i$a
            r1.<init>(r5)
        L_0x0148:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.f.a(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}

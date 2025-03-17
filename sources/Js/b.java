package Js;

import Is.e;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LJs/b;", "", "LIs/a;", "inboxDao", "<init>", "(LIs/a;)V", "", "featureName", "", "LIs/e;", "notifications", "", "removeEntriesNotInList", "LJs/a;", "a", "(Ljava/lang/String;Ljava/util/List;ZLdI/e;)Ljava/lang/Object;", "LIs/a;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Is.a f82723a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inboxrepository.impl.data.transaction.InsertOrReplaceAllTransaction", f = "InsertOrReplaceAllTransaction.kt", l = {18, 36, 39}, m = "execute")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f82724c;

        /* renamed from: d  reason: collision with root package name */
        Object f82725d;

        /* renamed from: e  reason: collision with root package name */
        Object f82726e;

        /* renamed from: f  reason: collision with root package name */
        Object f82727f;

        /* renamed from: g  reason: collision with root package name */
        Object f82728g;

        /* renamed from: h  reason: collision with root package name */
        Object f82729h;

        /* renamed from: i  reason: collision with root package name */
        Object f82730i;

        /* renamed from: j  reason: collision with root package name */
        Object f82731j;

        /* renamed from: k  reason: collision with root package name */
        Object f82732k;

        /* renamed from: l  reason: collision with root package name */
        Object f82733l;

        /* renamed from: m  reason: collision with root package name */
        Object f82734m;

        /* renamed from: n  reason: collision with root package name */
        Object f82735n;

        /* renamed from: o  reason: collision with root package name */
        boolean f82736o;

        /* renamed from: p  reason: collision with root package name */
        int f82737p;

        /* renamed from: q  reason: collision with root package name */
        int f82738q;

        /* renamed from: r  reason: collision with root package name */
        int f82739r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f82740s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ b f82741t;

        /* renamed from: u  reason: collision with root package name */
        int f82742u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f82741t = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82740s = obj;
            this.f82742u |= Integer.MIN_VALUE;
            return this.f82741t.a((String) null, (List<e>) null, false, this);
        }
    }

    public b(Is.a aVar) {
        C17542s.j(aVar, "inboxDao");
        this.f82723a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0121 A[LOOP:0: B:21:0x011b->B:23:0x0121, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0153 A[LOOP:1: B:25:0x014d->B:27:0x0153, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0283 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r36, java.util.List<Is.e> r37, boolean r38, dI.C17164e<? super Js.a> r39) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r39
            boolean r3 = r2 instanceof Js.b.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Js.b$a r3 = (Js.b.a) r3
            int r4 = r3.f82742u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f82742u = r4
            goto L_0x001e
        L_0x0019:
            Js.b$a r3 = new Js.b$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f82740s
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f82742u
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00e3
            if (r6 == r9) goto L_0x00c8
            if (r6 == r8) goto L_0x006e
            if (r6 != r7) goto L_0x0066
            java.lang.Object r1 = r3.f82735n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f82734m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f82733l
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f82732k
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f82731j
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f82730i
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r3.f82729h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r3.f82728g
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r3.f82727f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r3.f82726e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r3.f82725d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.f82724c
            Js.b r3 = (Js.b) r3
            XH.y.b(r4)
            goto L_0x0286
        L_0x0066:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006e:
            int r1 = r3.f82739r
            int r2 = r3.f82738q
            int r6 = r3.f82737p
            boolean r8 = r3.f82736o
            java.lang.Object r9 = r3.f82735n
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r3.f82734m
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r3.f82733l
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r3.f82732k
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r13 = r3.f82731j
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r3.f82730i
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r15 = r3.f82729h
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r7 = r3.f82728g
            java.util.Map r7 = (java.util.Map) r7
            r36 = r1
            java.lang.Object r1 = r3.f82727f
            dI.e r1 = (dI.C17164e) r1
            r37 = r1
            java.lang.Object r1 = r3.f82726e
            java.util.List r1 = (java.util.List) r1
            r38 = r1
            java.lang.Object r1 = r3.f82725d
            java.lang.String r1 = (java.lang.String) r1
            r39 = r1
            java.lang.Object r1 = r3.f82724c
            Js.b r1 = (Js.b) r1
            XH.y.b(r4)
            r4 = r36
            r0 = r39
            r16 = r14
            r17 = r15
            r14 = r12
            r15 = r13
            r13 = r7
            r12 = r11
            r7 = r2
            r11 = r10
            r2 = r37
            r10 = r9
            r9 = r8
            r8 = r6
            r6 = r38
            goto L_0x0219
        L_0x00c8:
            boolean r1 = r3.f82736o
            java.lang.Object r2 = r3.f82727f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r6 = r3.f82726e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f82725d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r3.f82724c
            Js.b r9 = (Js.b) r9
            XH.y.b(r4)
            r33 = r7
            r7 = r1
            r1 = r33
            goto L_0x0100
        L_0x00e3:
            XH.y.b(r4)
            Is.a r4 = r0.f82723a
            r3.f82724c = r0
            r3.f82725d = r1
            r6 = r37
            r3.f82726e = r6
            r3.f82727f = r2
            r7 = r38
            r3.f82736o = r7
            r3.f82742u = r9
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 != r5) goto L_0x00ff
            return r5
        L_0x00ff:
            r9 = r0
        L_0x0100:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r10 = 10
            int r11 = YH.C16877v.y(r4, r10)
            int r11 = YH.X.e(r11)
            r12 = 16
            int r11 = tI.C17978n.e(r11, r12)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r11)
            java.util.Iterator r4 = r4.iterator()
        L_0x011b:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x0130
            java.lang.Object r11 = r4.next()
            r14 = r11
            Is.e r14 = (Is.e) r14
            Ps.b r14 = Is.f.a(r14)
            r13.put(r14, r11)
            goto L_0x011b
        L_0x0130:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r4 = r6
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            int r10 = YH.C16877v.y(r4, r10)
            int r10 = YH.X.e(r10)
            int r10 = tI.C17978n.e(r10, r12)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r10)
            java.util.Iterator r4 = r4.iterator()
        L_0x014d:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0162
            java.lang.Object r10 = r4.next()
            r11 = r10
            Is.e r11 = (Is.e) r11
            Ps.b r11 = Is.f.a(r11)
            r12.put(r11, r10)
            goto L_0x014d
        L_0x0162:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r4 = r12.size()
            int r4 = YH.X.e(r4)
            r11.<init>(r4)
            java.util.Set r4 = r12.entrySet()
            r10 = r4
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r4 = r10.iterator()
        L_0x017a:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x01da
            java.lang.Object r14 = r4.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r8 = r14.getKey()
            java.lang.Object r17 = r14.getKey()
            r0 = r17
            Ps.b r0 = (Ps.b) r0
            java.lang.Object r14 = r14.getValue()
            Is.e r14 = (Is.e) r14
            java.lang.Object r0 = r13.get(r0)
            Is.e r0 = (Is.e) r0
            if (r0 != 0) goto L_0x01a3
            r15.add(r14)
        L_0x01a3:
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r0.l()
        L_0x01a9:
            r25 = r0
            goto L_0x01b1
        L_0x01ac:
            boolean r0 = r14.l()
            goto L_0x01a9
        L_0x01b1:
            r31 = 8063(0x1f7f, float:1.1299E-41)
            r32 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r17 = r14
            Is.e r0 = Is.e.b(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r11.put(r8, r0)
            r0 = r35
            r8 = 2
            goto L_0x017a
        L_0x01da:
            r0 = 0
            if (r7 == 0) goto L_0x0233
            Is.a r8 = r9.f82723a
            r3.f82724c = r9
            r3.f82725d = r1
            r3.f82726e = r6
            r3.f82727f = r2
            r3.f82728g = r13
            r3.f82729h = r15
            r3.f82730i = r11
            r3.f82731j = r12
            r3.f82732k = r12
            r3.f82733l = r11
            r3.f82734m = r10
            r3.f82735n = r4
            r3.f82736o = r7
            r3.f82737p = r0
            r3.f82738q = r0
            r3.f82739r = r0
            r14 = 2
            r3.f82742u = r14
            java.lang.Object r8 = r8.b(r1, r3)
            if (r8 != r5) goto L_0x0209
            return r5
        L_0x0209:
            r8 = r0
            r16 = r11
            r14 = r12
            r17 = r15
            r0 = r1
            r1 = r9
            r15 = r14
            r9 = r7
            r11 = r10
            r12 = r16
            r7 = r8
            r10 = r4
            r4 = r7
        L_0x0219:
            r18 = r7
            r33 = r2
            r2 = r0
            r0 = r8
            r8 = r6
            r6 = r33
            r34 = r11
            r11 = r1
            r1 = r16
            r16 = r5
            r5 = r15
            r15 = r17
            r17 = r4
            r4 = r14
            r14 = r12
            r12 = r34
            goto L_0x0244
        L_0x0233:
            r17 = r0
            r18 = r17
            r16 = r5
            r8 = r6
            r14 = r11
            r5 = r12
            r6 = r2
            r2 = r1
            r1 = r14
            r11 = r9
            r9 = r7
            r12 = r10
            r10 = r4
            r4 = r5
        L_0x0244:
            Is.a r7 = r11.f82723a
            java.util.Collection r19 = r1.values()
            java.lang.Iterable r19 = (java.lang.Iterable) r19
            r20 = r7
            java.util.List r7 = YH.C16877v.t1(r19)
            r3.f82724c = r11
            r3.f82725d = r2
            r3.f82726e = r8
            r3.f82727f = r6
            r3.f82728g = r13
            r3.f82729h = r15
            r3.f82730i = r1
            r3.f82731j = r5
            r3.f82732k = r4
            r3.f82733l = r14
            r3.f82734m = r12
            r3.f82735n = r10
            r3.f82736o = r9
            r3.f82737p = r0
            r0 = r18
            r3.f82738q = r0
            r0 = r17
            r3.f82739r = r0
            r0 = 3
            r3.f82742u = r0
            r0 = r20
            java.lang.Object r0 = r0.h(r7, r3)
            r2 = r16
            if (r0 != r2) goto L_0x0284
            return r2
        L_0x0284:
            r5 = r13
            r2 = r15
        L_0x0286:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0295
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0295
            Js.a$a r0 = Js.a.C1629a.f82720a
            goto L_0x02a9
        L_0x0295:
            boolean r0 = kotlin.jvm.internal.C17542s.e(r5, r1)
            if (r0 != 0) goto L_0x02a7
            Js.a$c r0 = new Js.a$c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            KJ.f r1 = KJ.C15985a.l(r2)
            r0.<init>(r1)
            goto L_0x02a9
        L_0x02a7:
            Js.a$b r0 = Js.a.b.f82721a
        L_0x02a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Js.b.a(java.lang.String, java.util.List, boolean, dI.e):java.lang.Object");
    }
}

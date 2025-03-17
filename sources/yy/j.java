package Yy;

import TJ.C16532g;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import fz.C14492e;
import gz.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.M;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0012\u0010\nJ\u001e\u0010\u0015\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH@¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"LYy/j;", "LYy/i;", "Lfz/e;", "dao", "<init>", "(Lfz/e;)V", "", "coupon", "LXH/N;", "d", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lgz/d;", "c", "(Lgz/d;LdI/e;)Ljava/lang/Object;", "", "coupons", "e", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "b", "Lrz/M;", "skippedCoupons", "f", "LTJ/g;", "a", "()LTJ/g;", "g", "(LdI/e;)Ljava/lang/Object;", "Lfz/e;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final C14492e f118257a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCouponLocalDataSourceImpl", f = "ScanAndGoCouponLocalDataSource.kt", l = {83}, m = "getNonSkippedCouponCodes")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f118258c;

        /* renamed from: d  reason: collision with root package name */
        Object f118259d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f118260e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f118261f;

        /* renamed from: g  reason: collision with root package name */
        int f118262g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f118261f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118260e = obj;
            this.f118262g |= Integer.MIN_VALUE;
            return this.f118261f.g(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCouponLocalDataSourceImpl", f = "ScanAndGoCouponLocalDataSource.kt", l = {59, 76}, m = "updateWithSkippedInformation")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f118263c;

        /* renamed from: d  reason: collision with root package name */
        Object f118264d;

        /* renamed from: e  reason: collision with root package name */
        Object f118265e;

        /* renamed from: f  reason: collision with root package name */
        Object f118266f;

        /* renamed from: g  reason: collision with root package name */
        Object f118267g;

        /* renamed from: h  reason: collision with root package name */
        Object f118268h;

        /* renamed from: i  reason: collision with root package name */
        Object f118269i;

        /* renamed from: j  reason: collision with root package name */
        Object f118270j;

        /* renamed from: k  reason: collision with root package name */
        Object f118271k;

        /* renamed from: l  reason: collision with root package name */
        Object f118272l;

        /* renamed from: m  reason: collision with root package name */
        int f118273m;

        /* renamed from: n  reason: collision with root package name */
        int f118274n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f118275o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j f118276p;

        /* renamed from: q  reason: collision with root package name */
        int f118277q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f118276p = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118275o = obj;
            this.f118277q |= Integer.MIN_VALUE;
            return this.f118276p.f((List<M>) null, this);
        }
    }

    public j(C14492e eVar) {
        C17542s.j(eVar, "dao");
        this.f118257a = eVar;
    }

    public C16532g<List<gz.d>> a() {
        return this.f118257a.a();
    }

    public Object b(String str, C17164e<? super C16807N> eVar) {
        Object e10 = this.f118257a.e(str, eVar);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    public Object c(gz.d dVar, C17164e<? super C16807N> eVar) {
        Object d10 = this.f118257a.d(dVar, eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    public Object d(String str, C17164e<? super C16807N> eVar) {
        Object c10 = c(new gz.d(str, false, (g) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object e(List<gz.d> list, C17164e<? super C16807N> eVar) {
        Object c10 = this.f118257a.c(list, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac A[LOOP:0: B:19:0x00a6->B:21:0x00ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.util.List<rz.M> r17, dI.C17164e<? super XH.C16807N> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof Yy.j.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Yy.j$b r2 = (Yy.j.b) r2
            int r3 = r2.f118277q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f118277q = r3
            goto L_0x001c
        L_0x0017:
            Yy.j$b r2 = new Yy.j$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f118275o
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f118277q
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x006d
            if (r5 == r7) goto L_0x005d
            if (r5 != r6) goto L_0x0055
            java.lang.Object r1 = r2.f118272l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f118270j
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f118269i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f118268h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f118267g
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r2.f118266f
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f118265e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f118264d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f118263c
            Yy.j r1 = (Yy.j) r1
            XH.y.b(r3)
            goto L_0x0127
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005d:
            java.lang.Object r1 = r2.f118265e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f118264d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r8 = r2.f118263c
            Yy.j r8 = (Yy.j) r8
            XH.y.b(r3)
            goto L_0x0088
        L_0x006d:
            XH.y.b(r3)
            fz.e r3 = r0.f118257a
            TJ.g r3 = r3.a()
            r2.f118263c = r0
            r5 = r17
            r2.f118264d = r5
            r2.f118265e = r1
            r2.f118277q = r7
            java.lang.Object r3 = TJ.C16534i.D(r3, r2)
            if (r3 != r4) goto L_0x0087
            return r4
        L_0x0087:
            r8 = r0
        L_0x0088:
            java.util.List r3 = (java.util.List) r3
            r9 = r5
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 10
            int r11 = YH.C16877v.y(r9, r10)
            int r11 = YH.X.e(r11)
            r12 = 16
            int r11 = tI.C17978n.e(r11, r12)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x00a6:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00bb
            java.lang.Object r11 = r9.next()
            r13 = r11
            rz.M r13 = (rz.M) r13
            java.lang.String r13 = r13.a()
            r12.put(r13, r11)
            goto L_0x00a6
        L_0x00bb:
            if (r3 == 0) goto L_0x00ff
            r9 = r3
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r13 = new java.util.ArrayList
            int r10 = YH.C16877v.y(r9, r10)
            r13.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L_0x00cd:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00fd
            java.lang.Object r10 = r9.next()
            gz.d r10 = (gz.d) r10
            java.lang.String r14 = r10.a()
            java.lang.Object r14 = r12.get(r14)
            rz.M r14 = (rz.M) r14
            gz.d$b r15 = new gz.d$b
            java.lang.String r10 = r10.a()
            if (r14 != 0) goto L_0x00ed
            r11 = 0
            goto L_0x00f6
        L_0x00ed:
            gz.g r11 = new gz.g
            rz.X r14 = r14.b()
            r11.<init>(r14)
        L_0x00f6:
            r15.<init>(r10, r7, r11)
            r13.add(r15)
            goto L_0x00cd
        L_0x00fd:
            r11 = r13
            goto L_0x0101
        L_0x00ff:
            r13 = r12
            r11 = 0
        L_0x0101:
            if (r11 == 0) goto L_0x0127
            fz.e r7 = r8.f118257a
            r2.f118263c = r8
            r2.f118264d = r5
            r2.f118265e = r1
            r2.f118266f = r3
            r2.f118267g = r12
            r2.f118268h = r11
            r2.f118269i = r11
            r2.f118270j = r11
            r2.f118271k = r13
            r2.f118272l = r9
            r1 = 0
            r2.f118273m = r1
            r2.f118274n = r1
            r2.f118277q = r6
            java.lang.Object r1 = r7.b(r11, r2)
            if (r1 != r4) goto L_0x0127
            return r4
        L_0x0127:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Yy.j.f(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(dI.C17164e<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Yy.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Yy.j$a r0 = (Yy.j.a) r0
            int r1 = r0.f118262g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118262g = r1
            goto L_0x0018
        L_0x0013:
            Yy.j$a r0 = new Yy.j$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f118260e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118262g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f118259d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f118258c
            Yy.j r6 = (Yy.j) r6
            XH.y.b(r1)
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            TJ.g r1 = r5.a()
            r0.f118258c = r5
            r0.f118259d = r6
            r0.f118262g = r4
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x004d
            return r2
        L_0x004d:
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            if (r1 == 0) goto L_0x009e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x005d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r1.next()
            r3 = r2
            gz.d r3 = (gz.d) r3
            gz.g r3 = r3.b()
            if (r3 != 0) goto L_0x005d
            r0.add(r2)
            goto L_0x005d
        L_0x0074:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0083:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r0.next()
            gz.d r2 = (gz.d) r2
            java.lang.String r2 = r2.a()
            r1.add(r2)
            goto L_0x0083
        L_0x0097:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x009e
            r6 = r1
        L_0x009e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Yy.j.g(dI.e):java.lang.Object");
    }
}

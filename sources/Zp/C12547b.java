package zp;

import Bp.b;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import up.C12071a;
import wp.C12296a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\bHB¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzp/b;", "LBp/b;", "Lwp/a;", "repository", "<init>", "(Lwp/a;)V", "", "Lup/a;", "", "entries", "showPreferencesHint", "LXH/N;", "a", "(Ljava/util/Map;ZLdI/e;)Ljava/lang/Object;", "Lwp/a;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zp.b  reason: case insensitive filesystem */
public final class C12547b implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C12296a f107540a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.dataconsent.impl.repository.usecase.SubmitUserConsentFormUseCaseImpl", f = "SubmitUserConsentFormUseCaseImpl.kt", l = {19, 24}, m = "invoke")
    /* renamed from: zp.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f107541c;

        /* renamed from: d  reason: collision with root package name */
        Object f107542d;

        /* renamed from: e  reason: collision with root package name */
        Object f107543e;

        /* renamed from: f  reason: collision with root package name */
        Object f107544f;

        /* renamed from: g  reason: collision with root package name */
        Object f107545g;

        /* renamed from: h  reason: collision with root package name */
        Object f107546h;

        /* renamed from: i  reason: collision with root package name */
        Object f107547i;

        /* renamed from: j  reason: collision with root package name */
        Object f107548j;

        /* renamed from: k  reason: collision with root package name */
        Object f107549k;

        /* renamed from: l  reason: collision with root package name */
        Object f107550l;

        /* renamed from: m  reason: collision with root package name */
        Object f107551m;

        /* renamed from: n  reason: collision with root package name */
        boolean f107552n;

        /* renamed from: o  reason: collision with root package name */
        int f107553o;

        /* renamed from: p  reason: collision with root package name */
        int f107554p;

        /* renamed from: q  reason: collision with root package name */
        int f107555q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f107556r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C12547b f107557s;

        /* renamed from: t  reason: collision with root package name */
        int f107558t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12547b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f107557s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f107556r = obj;
            this.f107558t |= Integer.MIN_VALUE;
            return this.f107557s.a((Map<C12071a, Boolean>) null, false, this);
        }
    }

    public C12547b(C12296a aVar) {
        C17542s.j(aVar, "repository");
        this.f107540a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x014e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.util.Map<up.C12071a, java.lang.Boolean> r18, boolean r19, dI.C17164e<? super XH.C16807N> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof zp.C12547b.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            zp.b$a r3 = (zp.C12547b.a) r3
            int r4 = r3.f107558t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f107558t = r4
            goto L_0x001e
        L_0x0019:
            zp.b$a r3 = new zp.b$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f107556r
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f107558t
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x00b8
            if (r6 == r8) goto L_0x0067
            if (r6 != r7) goto L_0x005f
            java.lang.Object r1 = r3.f107551m
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f107550l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f107549k
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f107548j
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f107547i
            wp.a r1 = (wp.C12296a) r1
            java.lang.Object r1 = r3.f107546h
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f107545g
            wp.a r1 = (wp.C12296a) r1
            java.lang.Object r1 = r3.f107544f
            wp.a r1 = (wp.C12296a) r1
            java.lang.Object r1 = r3.f107543e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f107542d
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f107541c
            zp.b r1 = (zp.C12547b) r1
            XH.y.b(r4)
            goto L_0x014f
        L_0x005f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0067:
            int r1 = r3.f107555q
            int r2 = r3.f107554p
            int r6 = r3.f107553o
            boolean r8 = r3.f107552n
            java.lang.Object r9 = r3.f107551m
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r10 = r3.f107550l
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r3.f107549k
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r3.f107548j
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r13 = r3.f107547i
            wp.a r13 = (wp.C12296a) r13
            java.lang.Object r14 = r3.f107546h
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r15 = r3.f107545g
            wp.a r15 = (wp.C12296a) r15
            java.lang.Object r7 = r3.f107544f
            wp.a r7 = (wp.C12296a) r7
            r18 = r1
            java.lang.Object r1 = r3.f107543e
            dI.e r1 = (dI.C17164e) r1
            r19 = r1
            java.lang.Object r1 = r3.f107542d
            java.util.Map r1 = (java.util.Map) r1
            r20 = r1
            java.lang.Object r1 = r3.f107541c
            zp.b r1 = (zp.C12547b) r1
            XH.y.b(r4)
            r16 = r5
            r4 = r8
            r0 = r13
            r5 = r15
            r8 = r2
            r13 = r7
            r15 = r11
            r7 = r18
            r2 = r19
            r11 = r10
            r10 = r9
            r9 = r6
            r6 = r1
            r1 = r20
            goto L_0x0125
        L_0x00b8:
            XH.y.b(r4)
            wp.a r13 = r0.f107540a
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Set r4 = r18.entrySet()
            java.util.Iterator r10 = r4.iterator()
        L_0x00ca:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00ee
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            up.a r6 = (up.C12071a) r6
            boolean r6 = r6.c()
            if (r6 == 0) goto L_0x00ca
            java.lang.Object r6 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r9.put(r6, r4)
            goto L_0x00ca
        L_0x00ee:
            r3.f107541c = r0
            r3.f107542d = r1
            r3.f107543e = r2
            r3.f107544f = r13
            r3.f107545g = r13
            r3.f107546h = r1
            r3.f107547i = r13
            r3.f107548j = r1
            r3.f107549k = r9
            r3.f107550l = r10
            r3.f107551m = r9
            r4 = r19
            r3.f107552n = r4
            r6 = 0
            r3.f107553o = r6
            r3.f107554p = r6
            r3.f107555q = r6
            r3.f107558t = r8
            java.lang.Object r7 = r13.g(r9, r3)
            if (r7 != r5) goto L_0x0118
            return r5
        L_0x0118:
            r12 = r1
            r14 = r12
            r16 = r5
            r7 = r6
            r8 = r7
            r15 = r9
            r11 = r10
            r5 = r13
            r10 = r15
            r9 = r8
            r6 = r0
            r0 = r5
        L_0x0125:
            r3.f107541c = r6
            r3.f107542d = r1
            r3.f107543e = r2
            r3.f107544f = r13
            r3.f107545g = r5
            r3.f107546h = r14
            r3.f107547i = r0
            r3.f107548j = r12
            r3.f107549k = r15
            r3.f107550l = r11
            r3.f107551m = r10
            r3.f107552n = r4
            r3.f107553o = r9
            r3.f107554p = r8
            r3.f107555q = r7
            r0 = 2
            r3.f107558t = r0
            java.lang.Object r0 = r5.f(r3)
            r1 = r16
            if (r0 != r1) goto L_0x014f
            return r1
        L_0x014f:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zp.C12547b.a(java.util.Map, boolean, dI.e):java.lang.Object");
    }
}

package com.ingka.ikea.app.auth.policies;

import Cp.d;
import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import ip.C11410b;
import java.util.ArrayList;
import java.util.List;
import kf.C9977a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\b0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\b0\u001a8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001e¨\u0006,"}, d2 = {"Lcom/ingka/ikea/app/auth/policies/b;", "Landroidx/lifecycle/f0;", "LCp/d;", "ethicsRepository", "LSl/b;", "getMarketLinksUseCase", "<init>", "(LCp/d;LSl/b;)V", "", "Lif/a;", "D", "(LdI/e;)Ljava/lang/Object;", "", "url", "LXH/N;", "G", "(Ljava/lang/String;)V", "m", "LCp/d;", "n", "LSl/b;", "Lip/b;", "Lkf/a;", "o", "Lip/b;", "_errors", "Landroidx/lifecycle/F;", "p", "Landroidx/lifecycle/F;", "C", "()Landroidx/lifecycle/F;", "errors", "q", "_openUrl", "r", "E", "openUrl", "Landroidx/lifecycle/K;", "Lcom/ingka/ikea/app/auth/policies/c;", "s", "Landroidx/lifecycle/K;", "_sections", "F", "sections", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final d f70160m;

    /* renamed from: n  reason: collision with root package name */
    private final Sl.b f70161n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C11410b<C9977a> f70162o;

    /* renamed from: p  reason: collision with root package name */
    private final F<C9977a> f70163p;

    /* renamed from: q  reason: collision with root package name */
    private final C11410b<String> f70164q;

    /* renamed from: r  reason: collision with root package name */
    private final F<String> f70165r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final K<List<c>> f70166s = new K<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.auth.policies.PoliciesViewModel$2", f = "PoliciesViewModel.kt", l = {67, 68, 70}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f70167c;

        /* renamed from: d  reason: collision with root package name */
        Object f70168d;

        /* renamed from: e  reason: collision with root package name */
        Object f70169e;

        /* renamed from: f  reason: collision with root package name */
        Object f70170f;

        /* renamed from: g  reason: collision with root package name */
        Object f70171g;

        /* renamed from: h  reason: collision with root package name */
        Object f70172h;

        /* renamed from: i  reason: collision with root package name */
        Object f70173i;

        /* renamed from: j  reason: collision with root package name */
        int f70174j;

        /* renamed from: k  reason: collision with root package name */
        int f70175k;

        /* renamed from: l  reason: collision with root package name */
        int f70176l;

        /* renamed from: m  reason: collision with root package name */
        int f70177m;

        /* renamed from: n  reason: collision with root package name */
        int f70178n;

        /* renamed from: o  reason: collision with root package name */
        int f70179o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b f70180p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f70180p = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f70180p, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0104 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0105  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f70179o
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0071
                if (r2 == r5) goto L_0x005a
                if (r2 == r4) goto L_0x003d
                if (r2 != r3) goto L_0x0035
                int r5 = r0.f70174j
                java.lang.Object r1 = r0.f70173i
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f70172h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f70170f
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f70169e
                com.ingka.ikea.app.auth.policies.c[] r1 = (com.ingka.ikea.app.auth.policies.c[]) r1
                java.lang.Object r2 = r0.f70168d
                androidx.lifecycle.K r2 = (androidx.lifecycle.K) r2
                java.lang.Object r3 = r0.f70167c
                com.ingka.ikea.app.auth.policies.c[] r3 = (com.ingka.ikea.app.auth.policies.c[]) r3
                XH.y.b(r23)
                r8 = r3
                r3 = r23
                goto L_0x0106
            L_0x0035:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003d:
                int r2 = r0.f70174j
                java.lang.Object r4 = r0.f70170f
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r6 = r0.f70169e
                com.ingka.ikea.app.auth.policies.c[] r6 = (com.ingka.ikea.app.auth.policies.c[]) r6
                java.lang.Object r7 = r0.f70168d
                androidx.lifecycle.K r7 = (androidx.lifecycle.K) r7
                java.lang.Object r8 = r0.f70167c
                com.ingka.ikea.app.auth.policies.c[] r8 = (com.ingka.ikea.app.auth.policies.c[]) r8
                XH.y.b(r23)
                r17 = r6
                r6 = r2
                r2 = r7
                r7 = r4
                r4 = r23
                goto L_0x00b8
            L_0x005a:
                int r2 = r0.f70174j
                java.lang.Object r6 = r0.f70169e
                com.ingka.ikea.app.auth.policies.c[] r6 = (com.ingka.ikea.app.auth.policies.c[]) r6
                java.lang.Object r7 = r0.f70168d
                androidx.lifecycle.K r7 = (androidx.lifecycle.K) r7
                java.lang.Object r8 = r0.f70167c
                com.ingka.ikea.app.auth.policies.c[] r8 = (com.ingka.ikea.app.auth.policies.c[]) r8
                XH.y.b(r23)
                r9 = r8
                r8 = r6
                r6 = r2
                r2 = r23
                goto L_0x0095
            L_0x0071:
                XH.y.b(r23)
                com.ingka.ikea.app.auth.policies.b r2 = r0.f70180p
                androidx.lifecycle.K r7 = r2.f70166s
                com.ingka.ikea.app.auth.policies.c[] r8 = new com.ingka.ikea.app.auth.policies.c[r4]
                com.ingka.ikea.app.auth.policies.b r2 = r0.f70180p
                Cp.d r2 = r2.f70160m
                r0.f70167c = r8
                r0.f70168d = r7
                r0.f70169e = r8
                r6 = 0
                r0.f70174j = r6
                r0.f70179o = r5
                java.lang.Object r2 = r2.b(r0)
                if (r2 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r9 = r8
            L_0x0095:
                java.util.List r2 = (java.util.List) r2
                com.ingka.ikea.app.auth.policies.b r10 = r0.f70180p
                Cp.d r10 = r10.f70160m
                r0.f70167c = r9
                r0.f70168d = r7
                r0.f70169e = r8
                r0.f70170f = r2
                r0.f70174j = r6
                r0.f70179o = r4
                java.lang.Object r4 = r10.a(r0)
                if (r4 != r1) goto L_0x00b0
                return r1
            L_0x00b0:
                r17 = r8
                r8 = r9
                r21 = r7
                r7 = r2
                r2 = r21
            L_0x00b8:
                r15 = r4
                java.lang.String r15 = (java.lang.String) r15
                com.ingka.ikea.app.auth.policies.c$a r18 = new com.ingka.ikea.app.auth.policies.c$a
                r14 = 0
                r13 = 0
                r12 = 0
                r11 = 28
                r16 = 0
                r9 = r18
                r10 = r7
                r23 = r11
                r11 = r15
                r19 = r12
                r12 = r14
                r20 = r13
                r3 = r14
                r14 = r19
                r3 = r15
                r15 = r23
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                r17[r6] = r18
                com.ingka.ikea.app.auth.policies.b r6 = r0.f70180p
                r0.f70167c = r8
                r0.f70168d = r2
                r0.f70169e = r8
                r0.f70170f = r7
                r0.f70171g = r4
                r0.f70172h = r3
                r0.f70173i = r7
                r0.f70174j = r5
                r3 = r23
                r0.f70175k = r3
                r3 = r19
                r0.f70176l = r3
                r3 = r20
                r0.f70177m = r3
                r3 = 0
                r0.f70178n = r3
                r3 = 3
                r0.f70179o = r3
                java.lang.Object r3 = r6.D(r0)
                if (r3 != r1) goto L_0x0105
                return r1
            L_0x0105:
                r1 = r8
            L_0x0106:
                java.util.List r3 = (java.util.List) r3
                com.ingka.ikea.app.auth.policies.c$b r4 = new com.ingka.ikea.app.auth.policies.c$b
                r4.<init>(r3)
                r1[r5] = r4
                java.util.List r1 = YH.C16877v.q(r8)
                r2.postValue(r1)
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.auth.policies.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.auth.policies.PoliciesViewModel", f = "PoliciesViewModel.kt", l = {81}, m = "getLinks")
    /* renamed from: com.ingka.ikea.app.auth.policies.b$b  reason: collision with other inner class name */
    static final class C1210b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f70181c;

        /* renamed from: d  reason: collision with root package name */
        Object f70182d;

        /* renamed from: e  reason: collision with root package name */
        Object f70183e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f70184f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f70185g;

        /* renamed from: h  reason: collision with root package name */
        int f70186h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1210b(b bVar, C17164e<? super C1210b> eVar) {
            super(eVar);
            this.f70185g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f70184f = obj;
            this.f70186h |= Integer.MIN_VALUE;
            return this.f70185g.D(this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/auth/policies/b$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f70187a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, b bVar) {
            super(aVar);
            this.f70187a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f70187a.f70162o.postValue(C9977a.b.f75068c);
            b bVar = this.f70187a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public b(d dVar, Sl.b bVar) {
        C17542s.j(dVar, "ethicsRepository");
        C17542s.j(bVar, "getMarketLinksUseCase");
        this.f70160m = dVar;
        this.f70161n = bVar;
        C11410b<C9977a> bVar2 = new C11410b<>();
        this.f70162o = bVar2;
        this.f70163p = bVar2;
        C11410b<String> bVar3 = new C11410b<>();
        this.f70164q = bVar3;
        this.f70165r = bVar3;
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(dI.C17164e<? super java.util.List<p000if.a>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.ingka.ikea.app.auth.policies.b.C1210b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.ingka.ikea.app.auth.policies.b$b r0 = (com.ingka.ikea.app.auth.policies.b.C1210b) r0
            int r1 = r0.f70186h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f70186h = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.auth.policies.b$b r0 = new com.ingka.ikea.app.auth.policies.b$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f70184f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f70186h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r9 = r0.f70183e
            Sl.g[] r9 = (Sl.g[]) r9
            java.lang.Object r9 = r0.f70182d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f70181c
            com.ingka.ikea.app.auth.policies.b r9 = (com.ingka.ikea.app.auth.policies.b) r9
            XH.y.b(r1)
            goto L_0x0061
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003d:
            XH.y.b(r1)
            Sl.b r1 = r8.f70161n
            Sl.g r3 = Sl.g.GeneralTerms
            Sl.g r5 = Sl.g.OrderTerms
            Sl.g r6 = Sl.g.ShopAndGoTerms
            Sl.g r7 = Sl.g.FamilyTermsAndConditions
            Sl.g[] r3 = new Sl.g[]{r3, r5, r6, r7}
            TJ.g r1 = r1.a(r3)
            r0.f70181c = r8
            r0.f70182d = r9
            r0.f70183e = r3
            r0.f70186h = r4
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x0061
            return r2
        L_0x0061:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0093
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r1, r0)
            r9.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x0076:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r0.next()
            Sl.h r1 = (Sl.h) r1
            if.a r2 = new if.a
            java.lang.String r3 = r1.a()
            java.lang.String r1 = r1.c()
            r2.<init>(r3, r1)
            r9.add(r2)
            goto L_0x0076
        L_0x0093:
            java.util.List r9 = YH.C16877v.n()
        L_0x0097:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.auth.policies.b.D(dI.e):java.lang.Object");
    }

    public final F<C9977a> C() {
        return this.f70163p;
    }

    public final F<String> E() {
        return this.f70165r;
    }

    public final F<List<c>> F() {
        return this.f70166s;
    }

    public final void G(String str) {
        C17542s.j(str, "url");
        if (str.length() == 0) {
            this.f70162o.postValue(C9977a.C1360a.f75067c);
        } else {
            this.f70164q.e(str);
        }
    }
}

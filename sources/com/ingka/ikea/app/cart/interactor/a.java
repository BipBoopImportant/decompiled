package com.ingka.ikea.app.cart.interactor;

import Kf.x;
import Kf.y;
import Lf.d;
import Ln.h;
import XH.C16807N;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import eI.C17187b;
import gg.C9739a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH@¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH@¢\u0006\u0004\b\u0012\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/app/cart/interactor/a;", "LKf/x;", "LLn/h;", "cartRepository", "LLf/d;", "analytics", "<init>", "(LLn/h;LLf/d;)V", "", "LKf/y;", "items", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "componentValue", "LXH/N;", "f", "(Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "b", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "availabilityDisclaimer", "buttonString", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function0;", "callback", "addToCartWithDisclaimer", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;LnI/a;)V", "LLn/h;", "LLf/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements x {

    /* renamed from: a  reason: collision with root package name */
    private final h f71867a;

    /* renamed from: b  reason: collision with root package name */
    private final d f71868b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.interactor.CartInteractorImpl", f = "CartInteractorImpl.kt", l = {84}, m = "doAddToCart")
    /* renamed from: com.ingka.ikea.app.cart.interactor.a$a  reason: collision with other inner class name */
    static final class C1232a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f71869c;

        /* renamed from: d  reason: collision with root package name */
        Object f71870d;

        /* renamed from: e  reason: collision with root package name */
        Object f71871e;

        /* renamed from: f  reason: collision with root package name */
        Object f71872f;

        /* renamed from: g  reason: collision with root package name */
        Object f71873g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f71874h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f71875i;

        /* renamed from: j  reason: collision with root package name */
        int f71876j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1232a(a aVar, C17164e<? super C1232a> eVar) {
            super(eVar);
            this.f71875i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f71874h = obj;
            this.f71876j |= Integer.MIN_VALUE;
            return this.f71875i.f((List<y>) null, (Interaction$Component) null, (String) null, this);
        }
    }

    public a(h hVar, d dVar) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(dVar, "analytics");
        this.f71867a = hVar;
        this.f71868b = dVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: com.ingka.ikea.analytics.Interaction$Component} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[SYNTHETIC, Splitter:B:22:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.util.List<Kf.y> r12, com.ingka.ikea.analytics.Interaction$Component r13, java.lang.String r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.ingka.ikea.app.cart.interactor.a.C1232a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.ingka.ikea.app.cart.interactor.a$a r0 = (com.ingka.ikea.app.cart.interactor.a.C1232a) r0
            int r1 = r0.f71876j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f71876j = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.cart.interactor.a$a r0 = new com.ingka.ikea.app.cart.interactor.a$a
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f71874h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f71876j
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r12 = r0.f71873g
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f71872f
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r0.f71871e
            r13 = r12
            com.ingka.ikea.analytics.Interaction$Component r13 = (com.ingka.ikea.analytics.Interaction$Component) r13
            java.lang.Object r12 = r0.f71870d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r15 = r0.f71869c
            com.ingka.ikea.app.cart.interactor.a r15 = (com.ingka.ikea.app.cart.interactor.a) r15
            XH.y.b(r1)     // Catch:{ all -> 0x003f }
            goto L_0x0062
        L_0x003f:
            r12 = move-exception
            goto L_0x009c
        L_0x0041:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0049:
            XH.y.b(r1)
            Ln.h r1 = r11.f71867a     // Catch:{ all -> 0x009a }
            r0.f71869c = r11     // Catch:{ all -> 0x009a }
            r0.f71870d = r12     // Catch:{ all -> 0x009a }
            r0.f71871e = r13     // Catch:{ all -> 0x009a }
            r0.f71872f = r14     // Catch:{ all -> 0x009a }
            r0.f71873g = r15     // Catch:{ all -> 0x009a }
            r0.f71876j = r4     // Catch:{ all -> 0x009a }
            java.lang.Object r15 = r1.j(r12, r0)     // Catch:{ all -> 0x009a }
            if (r15 != r2) goto L_0x0061
            return r2
        L_0x0061:
            r15 = r11
        L_0x0062:
            if (r13 == 0) goto L_0x0097
            Lf.d r0 = r15.f71868b     // Catch:{ all -> 0x003f }
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ all -> 0x003f }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x003f }
            r2 = 10
            int r2 = YH.C16877v.y(r12, r2)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x003f }
        L_0x0077:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x003f }
            Kf.y r2 = (Kf.y) r2     // Catch:{ all -> 0x003f }
            Lf.d$a r3 = new Lf.d$a     // Catch:{ all -> 0x003f }
            java.lang.String r5 = r2.a()     // Catch:{ all -> 0x003f }
            int r2 = r2.b()     // Catch:{ all -> 0x003f }
            r3.<init>(r5, r2)     // Catch:{ all -> 0x003f }
            r1.add(r3)     // Catch:{ all -> 0x003f }
            goto L_0x0077
        L_0x0094:
            r0.b(r1, r13, r14)     // Catch:{ all -> 0x003f }
        L_0x0097:
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x009a:
            r12 = move-exception
            r15 = r11
        L_0x009c:
            qv.e r13 = qv.e.WARN
            qv.d r14 = qv.d.f102012a
            java.util.List r14 = r14.a()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00af:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r14.next()
            r2 = r1
            qv.b r2 = (qv.C11819b) r2
            r3 = 0
            boolean r2 = r2.b(r13, r3)
            if (r2 == 0) goto L_0x00af
            r0.add(r1)
            goto L_0x00af
        L_0x00c7:
            java.util.Iterator r14 = r0.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x00ce:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0142
            java.lang.Object r3 = r14.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            if (r1 != 0) goto L_0x00e9
            java.lang.String r1 = "Unable to add item to cart"
            java.lang.String r1 = qv.C11818a.a(r1, r12)
            if (r1 == 0) goto L_0x0142
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x00e9:
            if (r2 != 0) goto L_0x0139
            java.lang.Class r2 = r15.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r6 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r0, r6, r0)
            r7 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r7, r0, r6, r0)
            int r6 = r3.length()
            if (r6 != 0) goto L_0x010a
            goto L_0x0110
        L_0x010a:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x0110:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r6, r4)
            if (r3 == 0) goto L_0x0123
            java.lang.String r3 = "m"
            goto L_0x0125
        L_0x0123:
            java.lang.String r3 = "b"
        L_0x0125:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = "|"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
        L_0x0139:
            r8 = 0
            r6 = r13
            r7 = r2
            r9 = r12
            r10 = r1
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x00ce
        L_0x0142:
            Lf.d r13 = r15.f71868b
            java.lang.String r14 = r12.getLocalizedMessage()
            r13.a(r14)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.interactor.a.f(java.util.List, com.ingka.ikea.analytics.Interaction$Component, java.lang.String, dI.e):java.lang.Object");
    }

    public Object a(List<y> list, C17164e<? super C16807N> eVar) {
        Object f10 = f(list, (Interaction$Component) null, (String) null, eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public void addToCartWithDisclaimer(String str, String str2, FragmentManager fragmentManager, C17631a<C16807N> aVar) {
        C17542s.j(str2, "buttonString");
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(aVar, "callback");
        if (str == null || str.length() == 0) {
            aVar.invoke();
            return;
        }
        ConfirmationBottomSheetDialog a10 = ConfirmationBottomSheetDialog.f71863N.a((String) null, str, str2);
        a10.show(fragmentManager, "confirmation_bottom_sheet_dialog");
        a10.C0(new C9739a(aVar));
    }

    public Object b(List<y> list, Interaction$Component interaction$Component, String str, C17164e<? super C16807N> eVar) {
        Object f10 = f(list, interaction$Component, str, eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }
}

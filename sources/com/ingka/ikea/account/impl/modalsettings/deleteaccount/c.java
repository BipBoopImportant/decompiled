package com.ingka.ikea.account.impl.modalsettings.deleteaccount;

import HJ.C15854t;
import IC.C13023e;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Rd.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import aA.C13909a;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import ce.C9453a;
import ce.C9454b;
import com.ingka.ikea.account.impl.modalsettings.deleteaccount.a;
import com.ingka.ikea.account.impl.modalsettings.deleteaccount.b;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kD.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14760b;
import lD.C14761c;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 B2\u00020\u0001:\u0001CB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00190/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170/8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001d0=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b'\u0010@¨\u0006D"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/c;", "Landroidx/lifecycle/f0;", "LaA/a;", "sessionManager", "LTd/a;", "accountAnalytics", "LIl/a;", "appConfigApi", "LlD/c;", "getProfileFlowUseCase", "LlD/b;", "getDeleteAccountHlpUrlUseCase", "<init>", "(LaA/a;LTd/a;LIl/a;LlD/c;LlD/b;)V", "LXH/N;", "F", "()V", "C", "E", "LRd/a$b;", "result", "D", "(LRd/a$b;)V", "LkD/c;", "urlState", "LkD/j;", "profile", "Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/a;", "navigateTo", "Lce/b;", "G", "(LkD/c;LkD/j;Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/a;)Lce/b;", "destination", "H", "(Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/a;)V", "Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/b;", "event", "I", "(Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/b;)V", "m", "LaA/a;", "n", "LTd/a;", "LTJ/B;", "o", "LTJ/B;", "navigateToFlow", "LTJ/g;", "p", "LTJ/g;", "profileFlow", "q", "deleteAccountUrlFlow", "", "r", "Ljava/lang/String;", "customerServiceUrl", "", "s", "Z", "showCustomerServiceButton", "LTJ/P;", "t", "LTJ/P;", "()LTJ/P;", "uiState", "u", "a", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f0 {

    /* renamed from: u  reason: collision with root package name */
    public static final a f69708u = new a((DefaultConstructorMarker) null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f69709v = 8;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C13909a f69710m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Td.a f69711n;

    /* renamed from: o  reason: collision with root package name */
    private final C16505B<a> f69712o = C16521S.a(null);

    /* renamed from: p  reason: collision with root package name */
    private final C16532g<j> f69713p;

    /* renamed from: q  reason: collision with root package name */
    private final C16532g<kD.c> f69714q;

    /* renamed from: r  reason: collision with root package name */
    private final String f69715r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f69716s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<C9454b> f69717t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/c$a;", "", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.account.impl.modalsettings.deleteaccount.DeleteAccountViewModel$handleAccountDeleted$1", f = "DeleteAccountViewModel.kt", l = {86}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f69718c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f69719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f69719d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f69719d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f69718c;
            if (i10 == 0) {
                y.b(obj);
                this.f69719d.f69711n.d(kotlin.coroutines.jvm.internal.b.a(this.f69719d.f69710m.i()));
                C13909a i11 = this.f69719d.f69710m;
                this.f69718c = 1;
                if (C13909a.C2951a.a(i11, false, false, this, 3, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f69719d.D(a.b.C1082b.f63190a);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.account.impl.modalsettings.deleteaccount.c$c  reason: collision with other inner class name */
    /* synthetic */ class C1205c extends C17525a implements r<kD.c, j, a, C17164e<? super C9454b>, Object> {
        C1205c(Object obj) {
            super(4, obj, c.class, "mapToUiState", "mapToUiState(Lcom/ingka/ikea/useraccount/model/HlpUrlState;Lcom/ingka/ikea/useraccount/model/ProfileResult;Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/DeleteAccount$Destination;)Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/DeleteAccount$UiState;", 4);
        }

        /* renamed from: a */
        public final Object l(kD.c cVar, j jVar, a aVar, C17164e<? super C9454b> eVar) {
            return ((c) this.f144363a).G(cVar, jVar, aVar);
        }
    }

    public c(C13909a aVar, Td.a aVar2, Il.a aVar3, C14761c cVar, C14760b bVar) {
        Object obj;
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "accountAnalytics");
        C17542s.j(aVar3, "appConfigApi");
        C17542s.j(cVar, "getProfileFlowUseCase");
        C17542s.j(bVar, "getDeleteAccountHlpUrlUseCase");
        this.f69710m = aVar;
        this.f69711n = aVar2;
        String str = null;
        this.f69713p = cVar.invoke();
        this.f69714q = bVar.invoke();
        Iterator it = aVar3.B().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((Rl.b) obj).b(), "contactCustomerService")) {
                break;
            }
        }
        Rl.b bVar2 = (Rl.b) obj;
        str = bVar2 != null ? bVar2.c() : str;
        str = str == null ? "" : str;
        this.f69715r = str;
        boolean z10 = !C15854t.v0(str);
        this.f69716s = z10;
        this.f69717t = C16534i.c0(C16534i.m(this.f69714q, this.f69713p, this.f69712o, new C1205c(this)), g0.a(this), ip.f.a(), new C9454b(C9453a.Loading, z10, (C13023e) null, (String) null, (String) null, (a) null, 60, (DefaultConstructorMarker) null));
    }

    private final void C() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void D(a.b bVar) {
        H(new a.C1203a(bVar));
    }

    private final void E() {
        if (this.f69716s) {
            H(new a.b(this.f69715r));
        }
    }

    private final void F() {
        String a10 = this.f69717t.getValue().a();
        if (a10 != null) {
            H(new a.c(a10));
            return;
        }
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a11 = C11818a.a("Clicked DeleteAccount without url available", (Throwable) null);
                if (a11 != null) {
                    str = C11820c.a(a11);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = c.class.getName();
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
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r10 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ce.C9454b G(kD.c r9, kD.j r10, com.ingka.ikea.account.impl.modalsettings.deleteaccount.a r11) {
        /*
            r8 = this;
            TJ.P<ce.b> r0 = r8.f69717t
            java.lang.Object r0 = r0.getValue()
            ce.b r0 = (ce.C9454b) r0
            kD.h r10 = kD.k.a(r10)
            if (r10 == 0) goto L_0x002e
            java.lang.String r1 = r10.d()
            java.lang.String r10 = r10.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            if (r10 == 0) goto L_0x002e
        L_0x002c:
            r5 = r10
            goto L_0x0033
        L_0x002e:
            java.lang.String r10 = r0.b()
            goto L_0x002c
        L_0x0033:
            java.lang.String r10 = r0.a()
            IC.e r0 = r0.c()
            boolean r1 = r9 instanceof kD.c.C3171c
            if (r1 == 0) goto L_0x0045
            ce.a r9 = ce.C9453a.Loading
            r2 = r9
            r6 = r10
        L_0x0043:
            r4 = r0
            goto L_0x0064
        L_0x0045:
            boolean r1 = r9 instanceof kD.c.a
            if (r1 == 0) goto L_0x0055
            int r9 = Oo.b.f84321A3
            IC.e r9 = IC.C13026h.a(r9)
            ce.a r0 = ce.C9453a.Disabled
            r4 = r9
            r6 = r10
            r2 = r0
            goto L_0x0064
        L_0x0055:
            boolean r10 = r9 instanceof kD.c.b
            if (r10 == 0) goto L_0x006e
            kD.c$b r9 = (kD.c.b) r9
            java.lang.String r9 = r9.a()
            ce.a r10 = ce.C9453a.Enabled
            r6 = r9
            r2 = r10
            goto L_0x0043
        L_0x0064:
            boolean r3 = r8.f69716s
            ce.b r9 = new ce.b
            r1 = r9
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r9
        L_0x006e:
            XH.t r9 = new XH.t
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.deleteaccount.c.G(kD.c, kD.j, com.ingka.ikea.account.impl.modalsettings.deleteaccount.a):ce.b");
    }

    private final void H(a aVar) {
        this.f69712o.setValue(aVar);
    }

    public final void I(b bVar) {
        C17542s.j(bVar, "event");
        if (bVar instanceof b.C1204b) {
            D(a.b.C1080a.f63189a);
        } else if (bVar instanceof b.c) {
            E();
        } else if (bVar instanceof b.d) {
            F();
        } else if (bVar instanceof b.e) {
            H((a) null);
        } else if (bVar instanceof b.a) {
            C();
        } else {
            throw new t();
        }
    }

    public final C16519P<C9454b> m() {
        return this.f69717t;
    }
}

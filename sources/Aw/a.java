package aw;

import HJ.C15854t;
import IC.C13019a;
import IC.C13026h;
import KJ.C15987c;
import Op.c1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Rv.c;
import Rv.k;
import Rv.m;
import Rv.o;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vv.u;
import Wv.a;
import Wv.c;
import Wv.f;
import Wv.h;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import Yv.C;
import Yv.i;
import aA.C13909a;
import aA.C13910b;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kD.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import nI.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sB.C15035a;
import yv.C9008m;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010\u001cJ\u000f\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00182\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0018H\u0002¢\u0006\u0004\b<\u0010\u001cJ\u0017\u0010?\u001a\u00020\u00182\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00182\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00182\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00182\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ%\u0010P\u001a\u0002012\u0006\u0010M\u001a\u0002012\f\u0010O\u001a\b\u0012\u0004\u0012\u0002010NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010U\u001a\u00020T2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bU\u0010VJ\u0015\u0010X\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020W¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020A0g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bZ\u0010jR\u0014\u0010m\u001a\u00020=8BX\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Law/a;", "Landroidx/lifecycle/f0;", "LaA/a;", "sessionManager", "Lzv/b;", "analytics", "LQv/b;", "viewModelStateToUiStateMapper", "LYv/i;", "getEntryPointDestinationUseCase", "LYv/C;", "handleProductEventUseCase", "LWv/c;", "scaffoldOrchestrator", "LWv/a;", "overviewOrchestrator", "LWv/h;", "yourHomeOrchestrator", "LWv/f;", "settingsOrchestrator", "<init>", "(LaA/a;Lzv/b;LQv/b;LYv/i;LYv/C;LWv/c;LWv/a;LWv/h;LWv/f;)V", "LVv/u;", "result", "LXH/N;", "V", "(LVv/u;)V", "U", "()V", "LRv/c$a;", "event", "P", "(LRv/c$a;)V", "LRv/c$b;", "R", "(LRv/c$b;)V", "Z", "N", "T", "O", "LsB/a;", "action", "Q", "(LsB/a;)V", "", "", "itemNos", "S", "(Ljava/util/List;)V", "LRv/l;", "tab", "a0", "(LRv/l;)V", "LOp/c1;", "W", "(LOp/c1;)V", "Lzv/d;", "screenName", "X", "(Lzv/d;)V", "Y", "LRv/o;", "viewModelState", "f0", "(LRv/o;)V", "LRv/m;", "uiState", "e0", "(LRv/m;)V", "LVv/l;", "destination", "c0", "(LVv/l;)V", "LRv/b;", "dialog", "g0", "(LRv/b;)V", "current", "", "availableTabs", "K", "(LRv/l;Ljava/util/Collection;)LRv/l;", "LaA/b;", "userState", "LRv/a;", "L", "(LaA/b;)LRv/a;", "LRv/c;", "d0", "(LRv/c;)V", "m", "LaA/a;", "n", "Lzv/b;", "o", "LQv/b;", "p", "LYv/i;", "q", "LYv/C;", "LTJ/B;", "r", "LTJ/B;", "LTJ/P;", "s", "LTJ/P;", "()LTJ/P;", "M", "()LRv/o;", "state", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C13909a f45329m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final zv.b f45330n;

    /* renamed from: o  reason: collision with root package name */
    private final Qv.b f45331o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Yv.i f45332p;

    /* renamed from: q  reason: collision with root package name */
    private final C f45333q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<o> f45334r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<m> f45335s;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aw.a$a  reason: collision with other inner class name */
    /* synthetic */ class C0780a extends C17525a implements s<c.a, a.C0672a, h.a, f.a, C17164e<? super Rv.a>, Object> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0780a f45336h = new C0780a();

        C0780a() {
            super(5, Rv.a.class, "<init>", "<init>(Lcom/ingka/ikea/membership/impl/orchestrator/ScaffoldOrchestrator$ScaffoldData;Lcom/ingka/ikea/membership/impl/orchestrator/OverviewOrchestrator$OverviewData;Lcom/ingka/ikea/membership/impl/orchestrator/YourHomeOrchestrator$YourHomeData;Lcom/ingka/ikea/membership/impl/orchestrator/SettingsOrchestrator$SettingsData;)V", 4);
        }

        /* renamed from: a */
        public final Object z(c.a aVar, a.C0672a aVar2, h.a aVar3, f.a aVar4, C17164e<? super Rv.a> eVar) {
            return a.b0(aVar, aVar2, aVar3, aVar4, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRv/a;", "content", "LXH/N;", "<anonymous>", "(LRv/a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.viewmodel.MembershipViewModel$2", f = "MembershipViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Rv.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45337c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f45338d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f45339e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f45339e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f45339e, eVar);
            bVar.f45338d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(Rv.a aVar, C17164e<? super C16807N> eVar) {
            return ((b) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            o oVar;
            C17187b.f();
            if (this.f45337c == 0) {
                y.b(obj);
                Rv.a aVar = (Rv.a) this.f45338d;
                C16505B E10 = this.f45339e.f45334r;
                a aVar2 = this.f45339e;
                do {
                    value = E10.getValue();
                    oVar = (o) value;
                } while (!E10.e(value, o.c(oVar, (C13910b) null, aVar, aVar2.K(oVar.i(), aVar.b().a()), (Vv.l) null, (k) null, (Rv.b) null, false, 121, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f45340a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f45341b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                Rv.c$b[] r0 = Rv.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Rv.c$b r2 = Rv.c.b.Confirmed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Rv.c$b r3 = Rv.c.b.Cancelled     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f45340a = r0
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r3 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f45341b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aw.a.c.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.viewmodel.MembershipViewModel$handleClickEvent$1", f = "MembershipViewModel.kt", l = {154}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45342c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f45343d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f45344e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.a f45345f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, c.a aVar2, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f45344e = aVar;
            this.f45345f = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f45344e, this.f45345f, eVar);
            dVar.f45343d = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f45342c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f45343d;
                Yv.i j10 = this.f45344e.f45332p;
                c.a aVar = this.f45345f;
                this.f45343d = q11;
                this.f45342c = 1;
                Object a10 = j10.a(aVar, this);
                if (a10 == f10) {
                    return f10;
                }
                q10 = q11;
                obj = a10;
            } else if (i10 == 1) {
                q10 = (Q) this.f45343d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i.a aVar2 = (i.a) obj;
            if (aVar2 == null) {
                c.a aVar3 = this.f45345f;
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
                        String a11 = C11818a.a("error occurred, ignoring " + aVar3, (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = q10.getClass().getName();
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
            } else {
                i.a.b b10 = aVar2.b();
                if (b10 != null) {
                    if (b10 instanceof i.a.b.C0705b) {
                        i.a.b.C0705b bVar2 = (i.a.b.C0705b) b10;
                        this.f45344e.f45330n.d(((o) this.f45344e.f45334r.getValue()).i(), bVar2.a(), bVar2.b());
                    } else if (b10 instanceof i.a.b.C0704a) {
                        i.a.b.C0704a aVar4 = (i.a.b.C0704a) b10;
                        this.f45344e.f45330n.e(((o) this.f45344e.f45334r.getValue()).i(), aVar4.c(), aVar4.a(), aVar4.b());
                    } else {
                        throw new t();
                    }
                }
                i.a.C0702a a12 = aVar2.a();
                if (a12 instanceof i.a.C0702a.b) {
                    this.f45344e.c0(((i.a.C0702a.b) a12).a());
                } else if (a12 instanceof i.a.C0702a.C0703a) {
                    this.f45344e.g0(((i.a.C0702a.C0703a) a12).a());
                } else {
                    throw new t();
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.viewmodel.MembershipViewModel$handleLogoutConfirmed$1", f = "MembershipViewModel.kt", l = {192}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45346c;

        /* renamed from: d  reason: collision with root package name */
        int f45347d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f45348e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f45348e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f45348e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f45347d;
            if (i10 == 0) {
                y.b(obj);
                boolean z10 = this.f45348e.M().m() == C13910b.FAMILY;
                this.f45348e.f45330n.f(z10);
                C13909a C10 = this.f45348e.f45329m;
                this.f45346c = z10 ? 1 : 0;
                this.f45347d = 1;
                if (C13909a.C2951a.a(C10, false, false, this, 3, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B E10 = this.f45348e.f45334r;
            do {
                value = E10.getValue();
            } while (!E10.e(value, o.c((o) value, (C13910b) null, (Rv.a) null, Rv.l.Overview, (Vv.l) null, (k) null, (Rv.b) null, false, 91, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.viewmodel.MembershipViewModel$special$$inlined$flatMapLatest$1", f = "MembershipViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class f extends l implements q<C16533h<? super Rv.a>, C13910b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45349c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f45350d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f45351e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f45352f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Wv.c f45353g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Wv.a f45354h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Wv.h f45355i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Wv.f f45356j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17164e eVar, a aVar, Wv.c cVar, Wv.a aVar2, Wv.h hVar, Wv.f fVar) {
            super(3, eVar);
            this.f45352f = aVar;
            this.f45353g = cVar;
            this.f45354h = aVar2;
            this.f45355i = hVar;
            this.f45356j = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Rv.a> hVar, C13910b bVar, C17164e<? super C16807N> eVar) {
            f fVar = new f(eVar, this.f45352f, this.f45353g, this.f45354h, this.f45355i, this.f45356j);
            fVar.f45350d = hVar;
            fVar.f45351e = bVar;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f45349c;
            boolean z10 = true;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f45350d;
                C13910b bVar = (C13910b) this.f45351e;
                C16505B E10 = this.f45352f.f45334r;
                while (true) {
                    Object value = E10.getValue();
                    o oVar = (o) value;
                    if (E10.e(value, o.c(oVar, bVar, this.f45352f.L(bVar), o.f39834n.a(), (Vv.l) null, (k) null, (Rv.b) null, (oVar.m() != C13910b.GUEST || !bVar.j()) ? false : z10, 56, (Object) null))) {
                        break;
                    }
                    z10 = true;
                }
                C16532g<R> l10 = C16534i.l(this.f45353g.a(bVar), this.f45354h.a(bVar), this.f45355i.a(bVar), this.f45356j.a(bVar), C0780a.f45336h);
                this.f45349c = 1;
                if (C16534i.x(hVar, l10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C16532g<m> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f45357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Qv.b f45358b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: aw.a$g$a  reason: collision with other inner class name */
        public static final class C0781a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f45359a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Qv.b f45360b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.viewmodel.MembershipViewModel$special$$inlined$map$1$2", f = "MembershipViewModel.kt", l = {50}, m = "emit")
            /* renamed from: aw.a$g$a$a  reason: collision with other inner class name */
            public static final class C0782a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f45361c;

                /* renamed from: d  reason: collision with root package name */
                int f45362d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0781a f45363e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0782a(C0781a aVar, C17164e eVar) {
                    super(eVar);
                    this.f45363e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f45361c = obj;
                    this.f45362d |= Integer.MIN_VALUE;
                    return this.f45363e.emit((Object) null, this);
                }
            }

            public C0781a(C16533h hVar, Qv.b bVar) {
                this.f45359a = hVar;
                this.f45360b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof aw.a.g.C0781a.C0782a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    aw.a$g$a$a r0 = (aw.a.g.C0781a.C0782a) r0
                    int r1 = r0.f45362d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f45362d = r1
                    goto L_0x0018
                L_0x0013:
                    aw.a$g$a$a r0 = new aw.a$g$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f45361c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f45362d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f45359a
                    Rv.o r5 = (Rv.o) r5
                    Qv.b r2 = r4.f45360b
                    Rv.m r5 = r2.d(r5)
                    r0.f45362d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: aw.a.g.C0781a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar, Qv.b bVar) {
            this.f45357a = gVar;
            this.f45358b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f45357a.collect(new C0781a(hVar, this.f45358b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends C17525a implements p<o, C17164e<? super C16807N>, Object> {
        h(Object obj) {
            super(2, obj, a.class, "onViewModelStateEmitted", "onViewModelStateEmitted(Lcom/ingka/ikea/membership/impl/model/Membership$ViewModelState;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(o oVar, C17164e<? super C16807N> eVar) {
            return ((a) this.f144363a).f0(oVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class i extends C17525a implements p<m, C17164e<? super C16807N>, Object> {
        i(Object obj) {
            super(2, obj, a.class, "onUiStateEmitted", "onUiStateEmitted(Lcom/ingka/ikea/membership/impl/model/Membership$UiState;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(m mVar, C17164e<? super C16807N> eVar) {
            return ((a) this.f144363a).e0(mVar);
        }
    }

    public a(C13909a aVar, zv.b bVar, Qv.b bVar2, Yv.i iVar, C c10, Wv.c cVar, Wv.a aVar2, Wv.h hVar, Wv.f fVar) {
        C13909a aVar3 = aVar;
        zv.b bVar3 = bVar;
        Qv.b bVar4 = bVar2;
        Yv.i iVar2 = iVar;
        C c11 = c10;
        C17542s.j(aVar3, "sessionManager");
        C17542s.j(bVar3, "analytics");
        C17542s.j(bVar4, "viewModelStateToUiStateMapper");
        C17542s.j(iVar2, "getEntryPointDestinationUseCase");
        C17542s.j(c11, "handleProductEventUseCase");
        C17542s.j(cVar, "scaffoldOrchestrator");
        C17542s.j(aVar2, "overviewOrchestrator");
        C17542s.j(hVar, "yourHomeOrchestrator");
        C17542s.j(fVar, "settingsOrchestrator");
        this.f45329m = aVar3;
        this.f45330n = bVar3;
        this.f45331o = bVar4;
        this.f45332p = iVar2;
        this.f45333q = c11;
        C16505B<o> a10 = C16521S.a(new o(aVar.o(), L(aVar.o()), (Rv.l) null, (Vv.l) null, (k) null, (Rv.b) null, false, 124, (DefaultConstructorMarker) null));
        this.f45334r = a10;
        this.f45335s = C16534i.c0(C16534i.R(new g(C16534i.R(a10, new h(this)), bVar4), new i(this)), g0.a(this), ip.f.a(), bVar4.d(M()));
        C16534i.M(C16534i.R(C16534i.g0(C16534i.s(aVar.p()), new f((C17164e) null, this, cVar, aVar2, hVar, fVar)), new b(this, (C17164e<? super b>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final Rv.l K(Rv.l lVar, Collection<? extends Rv.l> collection) {
        if (!collection.contains(lVar)) {
            lVar = null;
        }
        return lVar == null ? (Rv.l) C16877v.v0(collection) : lVar;
    }

    /* access modifiers changed from: private */
    public final Rv.a L(C13910b bVar) {
        j jVar;
        int i10 = c.f45341b[bVar.ordinal()];
        if (i10 == 1) {
            jVar = j.c.f128645a;
        } else if (i10 == 2 || i10 == 3) {
            jVar = j.b.f128644a;
        } else {
            throw new t();
        }
        return new Rv.a(new c.a((C13019a) null, (Es.a) null, (C15987c) null, (C15987c) null, jVar, 15, (DefaultConstructorMarker) null), new a.C0672a((C15987c) null, false, 3, (DefaultConstructorMarker) null), new h.a((C15987c) null, 1, (DefaultConstructorMarker) null), new f.a((C15987c) null, 1, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final o M() {
        return this.f45334r.getValue();
    }

    private final void N() {
        o value;
        C16505B<o> b10 = this.f45334r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, (Vv.l) null, new k.a(C13026h.a(C9008m.f58133F)), (Rv.b) null, false, 111, (Object) null)));
    }

    private final void O() {
        o value;
        C16505B<o> b10 = this.f45334r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, (Vv.l) null, new k.a(C13026h.a(Oo.b.f84812v3)), (Rv.b) null, false, 111, (Object) null)));
    }

    private final void P(c.a aVar) {
        Zv.a.e(this, new d(this, aVar, (C17164e<? super d>) null));
    }

    private final void Q(C15035a aVar) {
        o value;
        C16505B<o> b10 = this.f45334r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, (Vv.l) null, new k.b(aVar), (Rv.b) null, false, 111, (Object) null)));
    }

    private final void R(c.b bVar) {
        o value;
        int i10 = c.f45340a[bVar.ordinal()];
        if (i10 == 1) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new e(this, (C17164e<? super e>) null), 3, (Object) null);
        } else if (i10 == 2) {
            C16505B<o> b10 = this.f45334r;
            do {
                value = b10.getValue();
            } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, (Vv.l) null, (k) null, (Rv.b) null, false, 95, (Object) null)));
        } else {
            throw new t();
        }
    }

    private final void S(List<String> list) {
        this.f45330n.g(list);
    }

    private final void T() {
        o value;
        C16505B<o> b10 = this.f45334r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, (Vv.l) null, (k) null, (Rv.b) null, false, 111, (Object) null)));
    }

    private final void U() {
        o value;
        C16505B<o> b10 = this.f45334r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, (Vv.l) null, (k) null, (Rv.b) null, false, 119, (Object) null)));
    }

    private final void V(u uVar) {
        if (uVar instanceof u.a) {
            N();
        } else if (uVar instanceof u.b) {
            O();
        } else if (uVar instanceof u.c) {
            Q(((u.c) uVar).a());
        } else if (uVar instanceof u.d) {
            Y();
        } else if (uVar instanceof u.e) {
            Z();
        } else {
            throw new t();
        }
    }

    private final void W(c1 c1Var) {
        C.a a10 = this.f45333q.a(c1Var);
        if (a10 instanceof C.a.C0693a) {
            return;
        }
        if (a10 instanceof C.a.b) {
            c0(((C.a.b) a10).a());
            return;
        }
        throw new t();
    }

    private final void X(zv.d dVar) {
        this.f45330n.a(dVar);
    }

    private final void Y() {
        c0(Vv.m.f40516a);
    }

    private final void Z() {
        if (M().m().j()) {
            this.f45330n.b();
        }
    }

    private final void a0(Rv.l lVar) {
        o value;
        Rv.l i10 = M().i();
        if (M().l().contains(lVar) && lVar != i10) {
            this.f45330n.c(i10, lVar);
            C16505B<o> b10 = this.f45334r;
            do {
                value = b10.getValue();
            } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, lVar, (Vv.l) null, (k) null, (Rv.b) null, false, 123, (Object) null)));
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ Object b0(c.a aVar, a.C0672a aVar2, h.a aVar3, f.a aVar4, C17164e eVar) {
        return new Rv.a(aVar, aVar2, aVar3, aVar4);
    }

    /* access modifiers changed from: private */
    public final void c0(Vv.l lVar) {
        o value;
        C16505B<o> b10 = this.f45334r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, lVar, (k) null, (Rv.b) null, false, 119, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void e0(m mVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a(mVar.toString(), (Throwable) null);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, true, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
    }

    /* access modifiers changed from: private */
    public final void f0(o oVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a(oVar.toString(), (Throwable) null);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, true, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
    }

    /* access modifiers changed from: private */
    public final void g0(Rv.b bVar) {
        o value;
        C16505B<o> b10 = this.f45334r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.c(value, (C13910b) null, (Rv.a) null, (Rv.l) null, (Vv.l) null, (k) null, bVar, false, 95, (Object) null)));
    }

    public final void d0(Rv.c cVar) {
        C17542s.j(cVar, "event");
        if (cVar instanceof c.a) {
            P((c.a) cVar);
        } else if (cVar instanceof c.b) {
            R((c.b) cVar);
        } else if (cVar instanceof c.d) {
            T();
        } else if (cVar instanceof c.e) {
            U();
        } else if (cVar instanceof c.f) {
            V(((c.f) cVar).b());
        } else if (cVar instanceof c.h) {
            X(((c.h) cVar).b());
        } else if (cVar instanceof c.g) {
            W(((c.g) cVar).b());
        } else if (cVar instanceof c.i) {
            a0(((c.i) cVar).b());
        } else if (cVar instanceof c.C0648c) {
            S(((c.C0648c) cVar).b());
        } else {
            throw new t();
        }
    }

    public final C16519P<m> m() {
        return this.f45335s;
    }
}

package jw;

import HJ.C15854t;
import IC.C13023e;
import TC.e;
import TJ.C16532g;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import XH.y;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.C5215s;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import androidx.lifecycle.f0;
import androidx.lifecycle.r;
import com.adjust.sdk.Constants;
import com.sugarcube.core.logger.DslKt;
import dE.C14341a;
import dE.C14342b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import jw.b;
import jw.l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import mw.j;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import x4.C8951o;
import x4.v;
import x4.x;
import ye.C10473a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u0002"}, d2 = {"Ljw/h;", "Liw/a;", "Lye/a;", "alertMessageNavigation", "LdE/b;", "whatsNewNavigation", "<init>", "(Lye/a;LdE/b;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lx4/o;", "navController", "Landroidx/compose/ui/platform/ComposeView;", "commercialMessageComposeView", "Ljw/l;", "messageViewModel", "LXH/N;", "h", "(Landroidx/lifecycle/y;Lx4/o;Landroidx/compose/ui/platform/ComposeView;Ljw/l;Lye/a;LdE/b;)V", "composeView", "Landroidx/lifecycle/r;", "lifecycle", "Landroidx/lifecycle/s;", "lifecycleScope", "g", "(Landroidx/compose/ui/platform/ComposeView;Lx4/o;Landroidx/lifecycle/r;Landroidx/lifecycle/s;Ljw/l;)V", "Landroidx/lifecycle/f0;", "a", "(Landroidx/lifecycle/y;Lx4/o;Landroidx/compose/ui/platform/ComposeView;Landroidx/lifecycle/f0;)V", "Lye/a;", "b", "LdE/b;", "Ljw/b;", "state", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements iw.a {

    /* renamed from: a  reason: collision with root package name */
    private final C10473a f24901a;

    /* renamed from: b  reason: collision with root package name */
    private final C14342b f24902b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f24903a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f24903a = lVar;
        }

        public final C16818i<?> c() {
            return this.f24903a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f24903a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw/b;", "state", "LXH/N;", "<anonymous>", "(Ljw/b;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.messaging.impl.MainActivityMessageIntegrationImpl$setupCommercialMessageView$1", f = "MainActivityMessageIntegrationImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f24904c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f24905d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ComposeView f24906e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ComposeView composeView, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f24906e = composeView;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f24906e, eVar);
            bVar.f24905d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(b bVar, C17164e<? super C16807N> eVar) {
            return ((b) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            C17187b.f();
            if (this.f24904c == 0) {
                y.b(obj);
                b bVar = (b) this.f24905d;
                ComposeView composeView = this.f24906e;
                if (bVar instanceof b.a) {
                    i10 = 0;
                } else if (C17542s.e(bVar, b.C0397b.f24882a)) {
                    i10 = 8;
                } else {
                    throw new t();
                }
                composeView.setVisibility(i10);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g<b> f24907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f24908b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8951o f24909c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f24910a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f24911b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C8951o f24912c;

            a(b bVar, l lVar, C8951o oVar) {
                this.f24910a = bVar;
                this.f24911b = lVar;
                this.f24912c = oVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(C8951o oVar, String str) {
                C17542s.j(str, Constants.DEEPLINK);
                oVar.Y(Uri.parse(str), rw.c.f28698a.c().a());
                return C16807N.f139792a;
            }

            public final void b(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(307851183, i10, -1, "com.ingka.ikea.messaging.impl.MainActivityMessageIntegrationImpl.setupCommercialMessageView.<anonymous>.<anonymous> (MainActivityMessageIntegrationImpl.kt:150)");
                    }
                    b.a aVar = (b.a) this.f24910a;
                    l lVar = this.f24911b;
                    mVar.W(767593220);
                    boolean F10 = mVar.F(this.f24912c);
                    C8951o oVar = this.f24912c;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new i(oVar);
                        mVar.u(D10);
                    }
                    mVar.P();
                    j.u(aVar, lVar, (C17642l) D10, mVar, C13023e.f110931a);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        c(C16532g<? extends b> gVar, l lVar, C8951o oVar) {
            this.f24907a = gVar;
            this.f24908b = lVar;
            this.f24909c = oVar;
        }

        private static final b b(A1<? extends b> a12) {
            return (b) a12.getValue();
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1939482701, i10, -1, "com.ingka.ikea.messaging.impl.MainActivityMessageIntegrationImpl.setupCommercialMessageView.<anonymous> (MainActivityMessageIntegrationImpl.kt:144)");
                }
                C16532g<b> gVar = this.f24907a;
                b.C0397b bVar = b.C0397b.f24882a;
                b b10 = b(j3.a.b(gVar, bVar, (C5221y) null, (r.b) null, (C17168i) null, mVar, 48, 14));
                if (b10 instanceof b.a) {
                    e.e(false, c1.c.e(307851183, true, new a(b10, this.f24908b, this.f24909c), mVar, 54), mVar, 48, 1);
                } else if (!C17542s.e(b10, bVar)) {
                    throw new t();
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public h(C10473a aVar, C14342b bVar) {
        C17542s.j(aVar, "alertMessageNavigation");
        C17542s.j(bVar, "whatsNewNavigation");
        this.f24901a = aVar;
        this.f24902b = bVar;
    }

    private final void g(ComposeView composeView, C8951o oVar, r rVar, C5215s sVar, l lVar) {
        C16532g<b> J10 = lVar.J(oVar);
        C16534i.M(C16534i.R(C5208k.b(J10, rVar, (r.b) null, 2, (Object) null), new b(composeView, (C17164e<? super b>) null)), sVar);
        composeView.setContent(c1.c.c(1939482701, true, new c(J10, lVar, oVar)));
    }

    private final void h(C5221y yVar, C8951o oVar, ComposeView composeView, l lVar, C10473a aVar, C14342b bVar) {
        C8951o oVar2 = oVar;
        l lVar2 = lVar;
        C14342b bVar2 = bVar;
        oVar2.r(new f(lVar2, bVar2, oVar2));
        C5221y yVar2 = yVar;
        C5210m.c(lVar.K(), (C17168i) null, 0, 3, (Object) null).observe(yVar, new a(new g(oVar2, this, composeView, yVar, lVar2, aVar, bVar2)));
    }

    /* access modifiers changed from: private */
    public static final void i(l lVar, C14342b bVar, C8951o oVar, C8951o oVar2, v vVar, Bundle bundle) {
        C17542s.j(oVar2, "<unused var>");
        C17542s.j(vVar, "destination");
        lVar.N(vVar, new e(bVar, oVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C14342b bVar, C8951o oVar, String str) {
        C17542s.j(str, "deepLink");
        bVar.a(oVar, new C14341a.C3083a(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C8951o oVar, h hVar, ComposeView composeView, C5221y yVar, l lVar, C10473a aVar, C14342b bVar, l.b bVar2) {
        String str;
        String str2;
        C8951o oVar2 = oVar;
        l lVar2 = lVar;
        l.b bVar3 = bVar2;
        boolean e10 = C17542s.e(bVar3, l.b.a.f24934a);
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        if (e10) {
            String C10 = x.f57702q.b(oVar.L()).C();
            if (C10 != null) {
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar4 : arrayList) {
                    if (str5 == null) {
                        String a10 = C11818a.a("Will display alert on route " + C10, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str5 = C11820c.a(a10);
                    }
                    if (str6 == null) {
                        String name = hVar.getClass().getName();
                        C17542s.g(name);
                        str2 = str3;
                        str = str4;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str2) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        str2 = str3;
                        str = str4;
                    }
                    bVar4.a(eVar, str6, false, (Throwable) null, str5);
                    str3 = str2;
                    str4 = str;
                }
                rw.b.b(oVar2, C10, new c(lVar2, aVar, oVar2));
            }
        } else {
            String str7 = str3;
            String str8 = str4;
            if (C17542s.e(bVar3, l.b.C0399b.f24935a)) {
                String C11 = x.f57702q.b(oVar.L()).C();
                if (C11 != null) {
                    qv.e eVar2 = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    for (Object next2 : d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str9 = null;
                    String str10 = null;
                    for (C11819b bVar5 : arrayList2) {
                        if (str9 == null) {
                            String a11 = C11818a.a("Will display alert on route " + C11, (Throwable) null);
                            if (a11 == null) {
                                break;
                            }
                            str9 = C11820c.a(a11);
                        }
                        if (str10 == null) {
                            String name2 = hVar.getClass().getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str8 : str7) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        bVar5.a(eVar2, str10, false, (Throwable) null, str9);
                    }
                    rw.b.b(oVar2, C11, new d(lVar2, bVar, oVar2));
                }
            } else if (C17542s.e(bVar3, l.b.c.f24936a)) {
                hVar.g(composeView, oVar, yVar.getLifecycle(), C5222z.a(yVar), lVar);
            } else if (bVar3 != null) {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(l lVar, C10473a aVar, C8951o oVar) {
        lVar.F();
        aVar.a(oVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(l lVar, C14342b bVar, C8951o oVar) {
        lVar.G();
        bVar.a(oVar, C14341a.b.f126191a);
        return C16807N.f139792a;
    }

    public void a(C5221y yVar, C8951o oVar, ComposeView composeView, f0 f0Var) {
        f0 f0Var2 = f0Var;
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(oVar, "navController");
        C17542s.j(composeView, "commercialMessageComposeView");
        C17542s.j(f0Var2, "messageViewModel");
        if (f0Var2 instanceof l) {
            h(yVar, oVar, composeView, (l) f0Var2, this.f24901a, this.f24902b);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ViewModel is not an instance of MessageViewModel");
        qv.e eVar = qv.e.ERROR;
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
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            if (str2 == null) {
                String name = h.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            bVar.a(eVar, str2, false, illegalArgumentException, str);
        }
    }
}

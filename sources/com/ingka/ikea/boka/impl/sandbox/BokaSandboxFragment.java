package com.ingka.ikea.boka.impl.sandbox;

import HJ.C15854t;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0014XD¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\r8\u0014XD¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\r8\u0014XD¢\u0006\f\n\u0004\b\u000f\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "", "orderNumber", "LXH/N;", "O0", "(Ljava/lang/String;)V", "M0", "D0", "(LU0/m;I)V", "", "X", "Z", "v0", "()Z", "drawUnderStatusBar", "Y", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "y0", "Ljava/lang/String;", "K0", "()Ljava/lang/String;", "destId", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel;", "z0", "LXH/o;", "L0", "()Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel;", "viewModel", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BokaSandboxFragment extends b {

    /* renamed from: X  reason: collision with root package name */
    private final boolean f93292X;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f93293Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f93294Z;

    /* renamed from: y0  reason: collision with root package name */
    private final String f93295y0 = "boka/book";

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f93296z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<String, C16807N> {
        a(Object obj) {
            super(1, obj, BokaSandboxFragment.class, "onBookingComplete", "onBookingComplete(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            ((BokaSandboxFragment) this.receiver).O0(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, BokaSandboxFragment.class, "onBookingCancelled", "onBookingCancelled()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((BokaSandboxFragment) this.receiver).M0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93297c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f93297c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f93297c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93298c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f93298c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f93298c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f93299c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f93299c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f93299c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93300c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f93300c = aVar;
            this.f93301d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f93300c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f93301d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93302c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f93302c = oVar;
            this.f93303d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f93303d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f93302c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public BokaSandboxFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f93296z0 = W.b(this, P.b(BokaSandboxViewModel.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final BokaSandboxViewModel L0() {
        return (BokaSandboxViewModel) this.f93296z0.getValue();
    }

    /* access modifiers changed from: private */
    public final void M0() {
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
                String a10 = C11818a.a("Booking cancelled - returning", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = BokaSandboxFragment.class.getName();
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
        rw.f.d(this, K0(), new Vm.b());
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        oVar.i0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void O0(String str) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Booking complete with order number " + str + "- returning", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = BokaSandboxFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, true, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        rw.f.d(this, K0(), new Vm.a());
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        oVar.i0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1131499524);
        if (C4895p.J()) {
            C4895p.S(-1131499524, i10, -1, "com.ingka.ikea.boka.impl.sandbox.BokaSandboxFragment.FragmentContent (BokaSandboxFragment.kt:28)");
        }
        BokaSandboxViewModel L02 = L0();
        mVar.W(-1102949653);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C17642l lVar = (C17642l) ((C18059h) D10);
        mVar.W(-1102947924);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new b(this);
            mVar.u(D11);
        }
        mVar.P();
        Wm.e.g(L02, lVar, (C17631a) ((C18059h) D11), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public String K0() {
        return this.f93295y0;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f93294Z;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f93293Y;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f93292X;
    }
}

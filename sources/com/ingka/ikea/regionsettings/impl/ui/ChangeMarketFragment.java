package com.ingka.ikea.regionsettings.impl.ui;

import HJ.C15854t;
import Ma.C9140b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
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
import ky.C14734a;
import ky.C14735b;
import l3.a;
import ly.p;
import nI.C17631a;
import nI.C17642l;
import ny.C14862h;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18059h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/regionsettings/impl/ui/ChangeMarketFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "Lny/h$b;", "event", "LXH/N;", "L0", "(Lny/h$b;)V", "M0", "O0", "D0", "(LU0/m;I)V", "Lpw/a;", "X", "Lpw/a;", "J0", "()Lpw/a;", "setFirstEntryApi", "(Lpw/a;)V", "firstEntryApi", "Lny/h;", "Y", "LXH/o;", "K0", "()Lny/h;", "regionAndLanguageViewModel", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeMarketFragment extends a {

    /* renamed from: X  reason: collision with root package name */
    public pw.a f119699X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f119700Y;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C14862h.b, C16807N> {
        a(Object obj) {
            super(1, obj, ChangeMarketFragment.class, "handleEvent", "handleEvent(Lcom/ingka/ikea/regionsettings/impl/viewmodel/RegionAndLanguageViewModel$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C14862h.b) obj);
            return C16807N.f139792a;
        }

        public final void t(C14862h.b bVar) {
            C17542s.j(bVar, "p0");
            ((ChangeMarketFragment) this.receiver).L0(bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f119701a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Il.b[] r0 = Il.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Il.b r1 = Il.b.REGION_CHANGED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Il.b r1 = Il.b.LANGUAGE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Il.b r1 = Il.b.NO_CHANGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f119701a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.regionsettings.impl.ui.ChangeMarketFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119702c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f119702c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119702c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119703c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f119703c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119703c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119704c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f119704c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119704c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119705c = aVar;
            this.f119706d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119705c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119706d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119707c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119707c = oVar;
            this.f119708d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119708d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119707c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ChangeMarketFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f119700Y = W.b(this, P.b(C14862h.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final C14862h K0() {
        return (C14862h) this.f119700Y.getValue();
    }

    /* access modifiers changed from: private */
    public final void L0(C14862h.b bVar) {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("handleEvent: " + bVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = ChangeMarketFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (C17542s.e(bVar, C14862h.b.a.f129936a)) {
            androidx.navigation.fragment.a.a(this).k0();
        } else if (bVar instanceof C14862h.b.C3200b) {
            int i10 = b.f119701a[((C14862h.b.C3200b) bVar).a().ordinal()];
            if (i10 == 1) {
                pw.a J02 = J0();
                Context requireContext = requireContext();
                C17542s.i(requireContext, "requireContext(...)");
                Intent a11 = J02.a(requireContext);
                a11.setFlags(268468224);
                startActivity(a11);
                requireActivity().finishAndRemoveTask();
            } else if (i10 == 2) {
                C5191t requireActivity = requireActivity();
                requireActivity.getViewModelStore().a();
                requireActivity.recreate();
            } else if (i10 != 3) {
                throw new t();
            }
        } else if (C17542s.e(bVar, C14862h.b.d.f129939a)) {
            M0();
        } else if (C17542s.e(bVar, C14862h.b.c.f129938a)) {
            O0();
        } else {
            throw new t();
        }
        K0().P(C14862h.a.C3199a.f129932a);
    }

    private final void M0() {
        Context context = getContext();
        if (context != null) {
            new C9140b(context).J(Oo.b.f84854z4).x(Oo.b.f84322A4).setPositiveButton(Oo.b.f84854z4, new C14735b(this)).u(true).setNegativeButton(Oo.b.f84518U0, (DialogInterface.OnClickListener) null).p();
        }
    }

    /* access modifiers changed from: private */
    public static final void N0(ChangeMarketFragment changeMarketFragment, DialogInterface dialogInterface, int i10) {
        changeMarketFragment.K0().P(new C14862h.a.d(true));
    }

    private final void O0() {
        Context context = getContext();
        if (context != null) {
            new C9140b(context).J(Oo.b.f84350D2).x(Oo.b.f84536V8).setPositiveButton(Oo.b.f84616d5, new C14734a()).u(false).p();
        }
    }

    /* access modifiers changed from: private */
    public static final void P0(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(332846993);
        if (C4895p.J()) {
            C4895p.S(332846993, i10, -1, "com.ingka.ikea.regionsettings.impl.ui.ChangeMarketFragment.FragmentContent (ChangeMarketFragment.kt:33)");
        }
        C14862h K02 = K0();
        mVar.W(-111384902);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        p.p(K02, (C17642l) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final pw.a J0() {
        pw.a aVar = this.f119699X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("firstEntryApi");
        return null;
    }
}

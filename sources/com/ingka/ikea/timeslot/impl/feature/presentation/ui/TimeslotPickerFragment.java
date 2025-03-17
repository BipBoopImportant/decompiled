package com.ingka.ikea.timeslot.impl.feature.presentation.ui;

import BC.C12611a;
import BC.C12612b;
import BC.C12617g;
import EC.C12834b;
import EC.n;
import FC.C12866b;
import U0.C4889m;
import U0.C4895p;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import x4.C8951o;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0014\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001b\u0010\"\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/feature/presentation/ui/TimeslotPickerFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LBC/a;", "navAction", "LXH/N;", "J0", "(LBC/a;)V", "D0", "(LU0/m;I)V", "", "X", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "", "Y", "Z", "v0", "()Z", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "y0", "t0", "drawUnderDisplayCutout", "LBC/g;", "z0", "LXH/o;", "I0", "()LBC/g;", "viewModel", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeslotPickerFragment extends a {

    /* renamed from: X  reason: collision with root package name */
    private final String f120545X = "scanandgo/timeslot/picker?type={type}";

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f120546Y = true;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f120547Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f120548y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f120549z0;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/timeslot/impl/feature/presentation/ui/TimeslotPickerFragment$a", "LEC/b;", "LBC/b;", "action", "LXH/N;", "a", "(LBC/b;)V", "LBC/a;", "b", "(LBC/a;)V", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C12834b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TimeslotPickerFragment f120550a;

        a(TimeslotPickerFragment timeslotPickerFragment) {
            this.f120550a = timeslotPickerFragment;
        }

        public void a(C12612b bVar) {
            C17542s.j(bVar, "action");
            this.f120550a.I0().M(bVar);
        }

        public void b(C12611a aVar) {
            C17542s.j(aVar, "action");
            this.f120550a.J0(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120551c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f120551c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120551c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120552c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f120552c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120552c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120553c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f120553c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120553c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120554c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120554c = aVar;
            this.f120555d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120554c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120555d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120556c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120556c = oVar;
            this.f120557d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120557d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120556c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public TimeslotPickerFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f120549z0 = W.b(this, P.b(C12617g.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final C12617g I0() {
        return (C12617g) this.f120549z0.getValue();
    }

    /* access modifiers changed from: private */
    public final void J0(C12611a aVar) {
        Object obj;
        if (C17542s.e(aVar, C12611a.C2573a.f107793a)) {
            androidx.navigation.fragment.a.a(this).k0();
        } else if (aVar instanceof C12611a.b) {
            C12611a.b bVar = (C12611a.b) aVar;
            if (bVar instanceof C12611a.b.C2574a) {
                obj = new C12866b.a(((C12611a.b.C2574a) aVar).a());
            } else if (bVar instanceof C12611a.b.C2575b) {
                obj = new C12866b.C2622b(((C12611a.b.C2575b) aVar).a());
            } else {
                throw new t();
            }
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            rw.d.a(this, obj, "selected_time_slot");
            a10.k0();
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1587862769);
        if (C4895p.J()) {
            C4895p.S(1587862769, i10, -1, "com.ingka.ikea.timeslot.impl.feature.presentation.ui.TimeslotPickerFragment.FragmentContent (TimeslotPickerFragment.kt:33)");
        }
        n.z(I0(), new a(this), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f120548y0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f120547Z;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f120546Y;
    }
}

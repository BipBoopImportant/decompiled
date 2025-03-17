package com.ingka.ikea.account.impl.modalsettings.addresslist;

import Ae.h;
import Ar.j;
import HJ.C15854t;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import Yd.h;
import Yd.i;
import Yd.k;
import Yd.v;
import Yd.w;
import Yd.x;
import Yd.y;
import Yd.z;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.L;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.ingka.ikea.account.impl.modalsettings.addresslist.b;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import je.C9907b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import le.C10013a;
import le.C10014b;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.C8951o;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0006XD¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u00020+8TX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010/R\u001b\u00109\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/addresslist/AddressListFragment;", "Lcom/ingka/ikea/app/uicomponents/fragment/DelegateFragment;", "<init>", "()V", "LXH/N;", "e1", "j1", "m1", "p1", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "N0", "LTd/a;", "z0", "LTd/a;", "a1", "()LTd/a;", "setAccountAnalytics", "(LTd/a;)V", "accountAnalytics", "LRd/a;", "A0", "LRd/a;", "b1", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LAr/j;", "B0", "LAr/j;", "c1", "()LAr/j;", "setFeedback$account_implementation_release", "(LAr/j;)V", "feedback", "", "C0", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "D0", "LXH/o;", "L0", "pageTitle", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/a;", "E0", "d1", "()Lcom/ingka/ikea/account/impl/modalsettings/addresslist/a;", "viewModel", "F0", "a", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddressListFragment extends c {

    /* renamed from: F0  reason: collision with root package name */
    public static final a f69606F0 = new a((DefaultConstructorMarker) null);

    /* renamed from: G0  reason: collision with root package name */
    public static final int f69607G0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    public Rd.a f69608A0;

    /* renamed from: B0  reason: collision with root package name */
    public j f69609B0;

    /* renamed from: C0  reason: collision with root package name */
    private final String f69610C0 = "profile/account/address_list";

    /* renamed from: D0  reason: collision with root package name */
    private final C16824o f69611D0 = C16825p.b(new Yd.c(this));

    /* renamed from: E0  reason: collision with root package name */
    private final C16824o f69612E0;

    /* renamed from: z0  reason: collision with root package name */
    public Td.a f69613z0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/addresslist/AddressListFragment$a;", "", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f69614a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f69614a = lVar;
        }

        public final C16818i<?> c() {
            return this.f69614a;
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
            this.f69614a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69615c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f69615c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f69615c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69616c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f69616c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69616c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69617c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f69617c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69617c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69618c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69618c = aVar;
            this.f69619d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69618c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69619d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69620c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f69620c = oVar;
            this.f69621d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f69621d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f69620c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AddressListFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f69612E0 = W.b(this, P.b(a.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final a d1() {
        return (a) this.f69612E0.getValue();
    }

    private final void e1() {
        F<List<b>> L10 = d1().L();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(L10, viewLifecycleOwner, new Yd.d(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(AddressListFragment addressListFragment, List list) {
        Object obj;
        C17542s.j(list, "sections");
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (b bVar : iterable) {
            if (bVar instanceof b.C1199b) {
                obj = new Zd.b(((b.C1199b) bVar).a(), new i(addressListFragment, bVar), new Yd.j(bVar, addressListFragment));
            } else if (C17542s.e(bVar, b.c.f69641a)) {
                obj = new C10014b(0, 0, 3, (DefaultConstructorMarker) null);
            } else if (bVar instanceof b.a) {
                b.a aVar = (b.a) bVar;
                String string = addressListFragment.getString(aVar.c());
                C17542s.i(string, "getString(...)");
                obj = new Zd.d(string, aVar.b(), new k(addressListFragment, bVar));
            } else {
                throw new t();
            }
            arrayList.add(obj);
        }
        Lg.d.q(addressListFragment.I0(), arrayList, true, (C17642l) null, 4, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(AddressListFragment addressListFragment, b bVar, int i10) {
        b.C1199b bVar2 = (b.C1199b) bVar;
        addressListFragment.d1().N(bVar2.a().e(), bVar2.b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(b bVar, AddressListFragment addressListFragment, int i10) {
        b.C1199b bVar2 = (b.C1199b) bVar;
        if (bVar2.b()) {
            addressListFragment.I0().o(addressListFragment);
            addressListFragment.d1().P(bVar2.a().e());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Swipe on a non-deletable address should not happen!");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar3 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = addressListFragment.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar3.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(AddressListFragment addressListFragment, b bVar, int i10) {
        addressListFragment.d1().I(((b.a) bVar).a());
        return C16807N.f139792a;
    }

    private final void j1() {
        d1().J().observe(getViewLifecycleOwner(), new b(new Yd.b(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(AddressListFragment addressListFragment, ip.d dVar) {
        if (dVar != null) {
            dVar.a(new Yd.g(addressListFragment));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l1(AddressListFragment addressListFragment, ip.d dVar, Yd.a aVar) {
        C17542s.j(dVar, "$this$handle");
        C17542s.j(aVar, "action");
        if (aVar instanceof v) {
            C8951o f10 = rw.f.f(addressListFragment, addressListFragment.f69610C0, (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                addressListFragment.b1().j(f10, ((v) aVar).a().name());
            }
        } else if (aVar instanceof w) {
            C8951o f11 = rw.f.f(addressListFragment, addressListFragment.f69610C0, (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                w wVar = (w) aVar;
                addressListFragment.b1().k(f11, wVar.a(), wVar.b());
            }
        } else if (!(aVar instanceof x) && !(aVar instanceof y) && !(aVar instanceof z)) {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void m1() {
        F<ip.d<Yd.a>> K10 = d1().K();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(K10, viewLifecycleOwner, new Yd.e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N n1(AddressListFragment addressListFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        Context context = addressListFragment.getContext();
        if (context != null) {
            dVar.a(new h(addressListFragment, context));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o1(AddressListFragment addressListFragment, Context context, ip.d dVar, Yd.a aVar) {
        C17542s.j(dVar, "$this$handle");
        if (aVar != null && !(aVar instanceof v) && !(aVar instanceof w)) {
            if (aVar instanceof z) {
                z zVar = (z) aVar;
                j.a.j(addressListFragment.c1(), context, zVar.b(), Integer.valueOf(zVar.a()), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
            } else if (aVar instanceof x) {
                j c12 = addressListFragment.c1();
                x xVar = (x) aVar;
                String string = context.getString(xVar.b());
                C17542s.i(string, "getString(...)");
                j.a.k(c12, context, string, xVar.a(), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
            } else if (aVar instanceof y) {
                j.a.k(addressListFragment.c1(), context, "", ((y) aVar).a(), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    private final void p1() {
        F<Boolean> M10 = d1().M();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(M10, viewLifecycleOwner, new Yd.f(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N q1(AddressListFragment addressListFragment, boolean z10) {
        addressListFragment.K0().setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String r1(AddressListFragment addressListFragment) {
        return addressListFragment.getString(Sd.f.f63383w);
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new Zd.a(), new Zd.c(), new C10013a()});
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f69611D0.getValue();
    }

    /* access modifiers changed from: protected */
    public void N0() {
        C5191t activity;
        if (!androidx.navigation.fragment.a.a(this).k0() && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    public final Td.a a1() {
        Td.a aVar = this.f69613z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountAnalytics");
        return null;
    }

    public final Rd.a b1() {
        Rd.a aVar = this.f69608A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final j c1() {
        j jVar = this.f69609B0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView M02 = M0();
        Context context = M02.getContext();
        C17542s.i(context, "getContext(...)");
        new l(new C9907b(context)).m(M02);
        p1();
        m1();
        e1();
        j1();
        h.a.a(a1(), Td.b.ADDRESS_LIST_OPEN, (Map) null, 2, (Object) null);
    }
}

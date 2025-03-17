package com.ingka.ikea.checkout.impl.delivery.fragments;

import HJ.C15854t;
import Jh.a;
import QJ.M;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.content.Context;
import android.location.Geocoder;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.ingka.ikea.app.pointofinterest.fragments.PointsOfInterestFragment;
import com.sugarcube.core.logger.DslKt;
import io.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lo.s;
import lo.t;
import lo.v;
import nI.C17631a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000f8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/fragments/PickupPointDetailsFragment;", "Lcom/ingka/ikea/app/pointofinterest/fragments/PointsOfInterestFragment;", "<init>", "()V", "LJh/a;", "button", "LXH/N;", "e2", "(LJh/a;)V", "Llo/v;", "R0", "LXH/o;", "y2", "()Llo/v;", "pickupPointSelectedViewModel", "LLh/c;", "S0", "X1", "()LLh/c;", "pointsOfInterestSource", "T0", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickupPointDetailsFragment extends PointsOfInterestFragment {

    /* renamed from: T0  reason: collision with root package name */
    public static final a f94580T0 = new a((DefaultConstructorMarker) null);

    /* renamed from: U0  reason: collision with root package name */
    public static final int f94581U0 = 8;

    /* renamed from: R0  reason: collision with root package name */
    private final C16824o f94582R0 = W.b(this, P.b(v.class), new b(this), new c((C17631a) null, this), new d(this));

    /* renamed from: S0  reason: collision with root package name */
    private final C16824o f94583S0 = C16825p.b(new h(this));

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\u0007*\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/fragments/PickupPointDetailsFragment$a;", "", "<init>", "()V", "", "Llo/s;", "pickUpPointHolders", "", "selectingSupported", "Lcom/ingka/ikea/checkout/impl/delivery/fragments/PickupPointDetailsFragment;", "e", "(Ljava/util/List;Z)Lcom/ingka/ikea/checkout/impl/delivery/fragments/PickupPointDetailsFragment;", "Landroid/os/Bundle;", "d", "(Landroid/os/Bundle;)Z", "selectionEnabled", "c", "(Landroid/os/Bundle;)Ljava/util/List;", "pickupPoints", "", "PICKUP_POINTS", "Ljava/lang/String;", "SELECTION_ENABLED", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final List<s> c(Bundle bundle) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("pickupPoints");
            return parcelableArrayList != null ? parcelableArrayList : C16877v.n();
        }

        /* access modifiers changed from: private */
        public final boolean d(Bundle bundle) {
            return bundle.getBoolean("selectionEnabled", false);
        }

        public final PickupPointDetailsFragment e(List<s> list, boolean z10) {
            C17542s.j(list, "pickUpPointHolders");
            PickupPointDetailsFragment pickupPointDetailsFragment = new PickupPointDetailsFragment();
            pickupPointDetailsFragment.setArguments(D2.d.b(C16796C.a("pickupPoints", new ArrayList(list)), C16796C.a("selectionEnabled", Boolean.valueOf(z10))));
            return pickupPointDetailsFragment;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94584c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f94584c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f94584c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94585c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f94586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar, C5187o oVar) {
            super(0);
            this.f94585c = aVar;
            this.f94586d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f94585c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f94586d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.delivery.fragments.PickupPointDetailsFragment.c.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94587c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f94587c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f94587c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    private final v y2() {
        return (v) this.f94582R0.getValue();
    }

    /* access modifiers changed from: private */
    public static final t z2(PickupPointDetailsFragment pickupPointDetailsFragment) {
        Co.d dVar = new Co.d(new Geocoder(pickupPointDetailsFragment.requireContext()), (M) null, 2, (DefaultConstructorMarker) null);
        a aVar = f94580T0;
        Bundle requireArguments = pickupPointDetailsFragment.requireArguments();
        C17542s.i(requireArguments, "requireArguments(...)");
        List a10 = aVar.c(requireArguments);
        Bundle requireArguments2 = pickupPointDetailsFragment.requireArguments();
        C17542s.i(requireArguments2, "requireArguments(...)");
        return new t(dVar, a10, aVar.d(requireArguments2));
    }

    public Lh.c<?> X1() {
        return (Lh.c) this.f94583S0.getValue();
    }

    /* access modifiers changed from: protected */
    public void e2(Jh.a aVar) {
        Object obj;
        C17542s.j(aVar, "button");
        if (aVar instanceof a.C1016a) {
            a.C1016a aVar2 = (a.C1016a) aVar;
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            p1(aVar2.c().a() + ", " + aVar2.c().b(), requireContext, aVar2.d());
        } else if (aVar instanceof a.b) {
            a aVar3 = f94580T0;
            Bundle requireArguments = requireArguments();
            C17542s.i(requireArguments, "requireArguments(...)");
            Iterator it = aVar3.c(requireArguments).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((s) obj).e(), ((a.b) aVar).c())) {
                    break;
                }
            }
            s sVar = (s) obj;
            if (sVar != null) {
                y2().D(sVar);
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Could not find selected POI in list");
            e eVar = e.ERROR;
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
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = PickupPointDetailsFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
        } else {
            throw new XH.t();
        }
    }
}

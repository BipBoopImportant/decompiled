package com.ingka.ikea.account.impl.modalsettings.addresslist;

import Ae.h;
import Sd.f;
import XH.C16807N;
import YH.C16877v;
import Yd.n;
import Yd.o;
import Yd.p;
import Yd.q;
import Yd.r;
import Yd.v;
import Yd.w;
import Yd.x;
import Yd.y;
import Yd.z;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import cD.C14029a;
import cD.C14031c;
import com.ingka.ikea.account.impl.modalsettings.addresslist.b;
import com.ingka.ikea.useraccount.model.Address;
import ip.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kD.C14675b;
import kD.e;
import kD.g;
import kD.h;
import kD.l;
import kD.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u000e8\u0002XD¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010$\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000/0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010'R%\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000/0)8\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010'R#\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0)8\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010'R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0)8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010+R#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0)8\u0006¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-¨\u0006I"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/addresslist/a;", "Landroidx/lifecycle/f0;", "LcD/a;", "repository", "LTd/a;", "accountAnalytics", "<init>", "(LcD/a;LTd/a;)V", "LXH/N;", "O", "()V", "", "a1", "a2", "", "H", "(Ljava/lang/String;Ljava/lang/String;)I", "addressId", "P", "(Ljava/lang/String;)V", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "addressType", "I", "(Lcom/ingka/ikea/useraccount/model/Address$Type;)V", "id", "", "deletable", "N", "(Ljava/lang/String;Z)V", "m", "LcD/a;", "n", "LTd/a;", "o", "maxDeliveryAddresses", "p", "currentDeliveryAddressesSize", "Landroidx/lifecycle/K;", "q", "Landroidx/lifecycle/K;", "_spinner", "Landroidx/lifecycle/F;", "r", "Landroidx/lifecycle/F;", "M", "()Landroidx/lifecycle/F;", "spinner", "Lip/d;", "LYd/a;", "s", "_error", "t", "K", "error", "u", "_action", "v", "J", "action", "Ljava/util/Comparator;", "Lcom/ingka/ikea/useraccount/model/Address;", "w", "Ljava/util/Comparator;", "addressComparator", "x", "trigger", "", "Lcom/ingka/ikea/account/impl/modalsettings/addresslist/b;", "y", "_sections", "z", "L", "sections", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C14029a f69622m;

    /* renamed from: n  reason: collision with root package name */
    private final Td.a f69623n;

    /* renamed from: o  reason: collision with root package name */
    private final int f69624o = 10;

    /* renamed from: p  reason: collision with root package name */
    private int f69625p;

    /* renamed from: q  reason: collision with root package name */
    private final K<Boolean> f69626q;

    /* renamed from: r  reason: collision with root package name */
    private final F<Boolean> f69627r;

    /* renamed from: s  reason: collision with root package name */
    private final K<d<Yd.a>> f69628s;

    /* renamed from: t  reason: collision with root package name */
    private final F<d<Yd.a>> f69629t;

    /* renamed from: u  reason: collision with root package name */
    private final K<d<Yd.a>> f69630u;

    /* renamed from: v  reason: collision with root package name */
    private final F<d<Yd.a>> f69631v;

    /* renamed from: w  reason: collision with root package name */
    private final Comparator<Address> f69632w;

    /* renamed from: x  reason: collision with root package name */
    private final K<Boolean> f69633x;

    /* renamed from: y  reason: collision with root package name */
    private final F<List<b>> f69634y;

    /* renamed from: z  reason: collision with root package name */
    private final F<List<b>> f69635z;

    public a(C14029a aVar, Td.a aVar2) {
        C17542s.j(aVar, "repository");
        C17542s.j(aVar2, "accountAnalytics");
        this.f69622m = aVar;
        this.f69623n = aVar2;
        K<Boolean> k10 = new K<>();
        k10.setValue(Boolean.FALSE);
        this.f69626q = k10;
        this.f69627r = k10;
        K<d<Yd.a>> k11 = new K<>();
        this.f69628s = k11;
        this.f69629t = k11;
        K<d<Yd.a>> k12 = new K<>();
        this.f69630u = k12;
        this.f69631v = k12;
        this.f69632w = new n(this);
        K<Boolean> k13 = new K<>();
        k13.setValue(Boolean.TRUE);
        this.f69633x = k13;
        F<List<b>> c10 = e0.c(k13, new o(this));
        this.f69634y = c10;
        this.f69635z = c10;
        C14031c.a.b(aVar, false, new p(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N D(a aVar, l lVar) {
        C17542s.j(lVar, "state");
        aVar.f69626q.setValue(Boolean.valueOf(lVar instanceof e));
        if (lVar instanceof g) {
            aVar.f69628s.setValue(new d(new y(((g) lVar).a())));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final F E(a aVar, Boolean bool) {
        return e0.c(aVar.f69622m.getProfile(), new q(aVar));
    }

    /* access modifiers changed from: private */
    public static final F F(a aVar, h hVar) {
        List<Address> list;
        ArrayList arrayList = new ArrayList();
        if (hVar == null || (list = hVar.a()) == null) {
            list = C16877v.n();
        }
        Iterable iterable = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (((Address) next).h()) {
                arrayList2.add(next);
            }
        }
        List<Address> g12 = C16877v.g1(arrayList2, aVar.f69632w);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            if (!((Address) next2).h()) {
                arrayList3.add(next2);
            }
        }
        List<Address> g13 = C16877v.g1(arrayList3, aVar.f69632w);
        aVar.f69625p = g13.size();
        arrayList.add(new b.a(f.f63372l, true, Address.Type.DELIVERY_DEST));
        for (Address bVar : g13) {
            arrayList.add(new b.C1199b(bVar, true));
        }
        arrayList.add(b.c.f69641a);
        arrayList.add(new b.a(f.f63380t, g12.isEmpty(), Address.Type.INVOICE_DEST));
        for (Address bVar2 : g12) {
            arrayList.add(new b.C1199b(bVar2, false));
        }
        K k10 = new K();
        k10.setValue(arrayList);
        return k10;
    }

    /* access modifiers changed from: private */
    public static final int G(a aVar, Address address, Address address2) {
        if (address.h() && address2.h()) {
            return aVar.H(address.a(), address2.a());
        }
        if (address.h()) {
            return -1;
        }
        if (address2.h()) {
            return 1;
        }
        return aVar.H(address.a(), address2.a());
    }

    private final int H(String str, String str2) {
        if (C17542s.e(str, str2)) {
            return 0;
        }
        if (str == null) {
            return 1;
        }
        if (str2 == null) {
            return -1;
        }
        return str.compareTo(str2);
    }

    private final void O() {
        this.f69633x.setValue(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(a aVar, l lVar) {
        C17542s.j(lVar, "state");
        if (lVar instanceof e) {
            aVar.f69626q.setValue(Boolean.TRUE);
        } else if (lVar instanceof m) {
            h.a.a(aVar.f69623n, Td.b.ADDRESS_DELETE_SUCCESS, (Map) null, 2, (Object) null);
            aVar.f69626q.setValue(Boolean.FALSE);
        } else if (lVar instanceof kD.d) {
            kD.d dVar = (kD.d) lVar;
            aVar.f69623n.e(Td.b.ADDRESS_DELETE_FAIL, dVar.b());
            aVar.f69626q.setValue(Boolean.FALSE);
            aVar.f69628s.setValue(new d(new x(Oo.b.f84370F2, dVar.a())));
            aVar.O();
        } else if (lVar instanceof C14675b) {
            aVar.f69626q.setValue(Boolean.FALSE);
            aVar.f69628s.setValue(new d(new z(Oo.b.f84370F2, f.f63379s)));
            aVar.O();
        }
        return C16807N.f139792a;
    }

    public final void I(Address.Type type) {
        C17542s.j(type, "addressType");
        if (type != Address.Type.DELIVERY_DEST || this.f69625p < this.f69624o) {
            this.f69630u.setValue(new d(new v(type)));
        } else {
            this.f69628s.setValue(new d(new z(f.f63359D, f.f63358C)));
        }
    }

    public final F<d<Yd.a>> J() {
        return this.f69631v;
    }

    public final F<d<Yd.a>> K() {
        return this.f69629t;
    }

    public final F<List<b>> L() {
        return this.f69635z;
    }

    public final F<Boolean> M() {
        return this.f69627r;
    }

    public final void N(String str, boolean z10) {
        C17542s.j(str, "id");
        this.f69630u.setValue(new d(new w(str, z10)));
    }

    public final void P(String str) {
        C17542s.j(str, "addressId");
        this.f69622m.w(str, new r(this));
    }
}

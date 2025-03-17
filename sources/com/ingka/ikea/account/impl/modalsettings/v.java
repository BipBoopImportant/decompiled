package com.ingka.ikea.account.impl.modalsettings;

import HJ.C15854t;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import YH.C16877v;
import aA.C13909a;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import cD.C14029a;
import cD.C14031c;
import com.sugarcube.core.logger.DslKt;
import ge.C9727a;
import ge.C9728b;
import ip.C11410b;
import ip.j;
import ip.k;
import java.util.ArrayList;
import java.util.List;
import kD.e;
import kD.h;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\n*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u001d*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0!8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/v;", "Landroidx/lifecycle/f0;", "LcD/a;", "profileRepository", "LaA/a;", "sessionManager", "<init>", "(LcD/a;LaA/a;)V", "", "Lge/a;", "Lge/b;", "state", "D", "(Ljava/util/List;Lge/b;)Ljava/util/List;", "LkD/h;", "J", "(LkD/h;)Lge/b;", "Lip/b;", "Lip/k;", "", "LkD/l;", "F", "()Lip/b;", "E", "m", "LcD/a;", "n", "LaA/a;", "Landroidx/lifecycle/K;", "kotlin.jvm.PlatformType", "o", "Landroidx/lifecycle/K;", "availableSections", "Landroidx/lifecycle/F;", "p", "Landroidx/lifecycle/F;", "userState", "q", "G", "()Landroidx/lifecycle/F;", "sections", "", "H", "()Z", "isLoyaltyMember", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C14029a f69815m;

    /* renamed from: n  reason: collision with root package name */
    private final C13909a f69816n;

    /* renamed from: o  reason: collision with root package name */
    private final K<List<C9727a>> f69817o;

    /* renamed from: p  reason: collision with root package name */
    private final F<C9728b> f69818p;

    /* renamed from: q  reason: collision with root package name */
    private final F<List<C9727a>> f69819q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f69820a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f69820a = lVar;
        }

        public final C16818i<?> c() {
            return this.f69820a;
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
            this.f69820a.invoke(obj);
        }
    }

    public v(C14029a aVar, C13909a aVar2) {
        C17542s.j(aVar, "profileRepository");
        C17542s.j(aVar2, "sessionManager");
        this.f69815m = aVar;
        this.f69816n = aVar2;
        K<List<C9727a>> k10 = new K<>(C16877v.q(new C9727a.d(), new C9727a.C1272a(), new C9727a.b(), new C9727a.c()));
        this.f69817o = k10;
        I i10 = new I();
        i10.b(k10, new a(new q(i10, this)));
        this.f69818p = i10;
        this.f69819q = e0.b(i10, new r(this));
    }

    private final List<C9727a> D(List<? extends C9727a> list, C9728b bVar) {
        if (bVar instanceof C9728b.a) {
            Iterable<C9727a> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C9727a aVar : iterable) {
                aVar.d(false);
                arrayList.add(aVar);
            }
            return arrayList;
        } else if (bVar instanceof C9728b.d) {
            Iterable<C9727a> iterable2 = list;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
            for (C9727a aVar2 : iterable2) {
                aVar2.d(aVar2.a());
                arrayList2.add(aVar2);
            }
            return arrayList2;
        } else if (bVar instanceof C9728b.C1273b) {
            Iterable<C9727a> iterable3 = list;
            ArrayList arrayList3 = new ArrayList(C16877v.y(iterable3, 10));
            for (C9727a aVar3 : iterable3) {
                aVar3.d(true);
                arrayList3.add(aVar3);
            }
            return arrayList3;
        } else if (bVar instanceof C9728b.c) {
            Iterable<C9727a> iterable4 = list;
            ArrayList arrayList4 = new ArrayList(C16877v.y(iterable4, 10));
            for (C9727a aVar4 : iterable4) {
                aVar4.d(true);
                arrayList4.add(aVar4);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object next : arrayList4) {
                if (((C9727a) next).a()) {
                    arrayList5.add(next);
                }
            }
            return arrayList5;
        } else {
            throw new t();
        }
    }

    private final boolean H() {
        return this.f69816n.i();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r1.D(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List I(com.ingka.ikea.account.impl.modalsettings.v r1, ge.C9728b r2) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            androidx.lifecycle.K<java.util.List<ge.a>> r0 = r1.f69817o
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0015
            java.util.List r1 = r1.D(r0, r2)
            if (r1 != 0) goto L_0x0019
        L_0x0015:
            java.util.List r1 = YH.C16877v.n()
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.v.I(com.ingka.ikea.account.impl.modalsettings.v, ge.b):java.util.List");
    }

    private final C9728b J(h hVar) {
        return hVar != null ? new C9728b.C1273b(hVar, H()) : new C9728b.d(H());
    }

    /* access modifiers changed from: private */
    public static final C16807N K(I i10, v vVar, List list) {
        C9728b bVar = (C9728b) i10.getValue();
        if (bVar != null) {
            i10.setValue(bVar);
        } else {
            i10.b(C5210m.c(vVar.f69816n.n(), g0.a(vVar).getCoroutineContext(), 0, 2, (Object) null), new a(new s(i10, vVar)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(I i10, v vVar, Boolean bool) {
        if (bool.booleanValue()) {
            i10.c(vVar.f69815m.getProfile());
            C14031c.a.b(vVar.f69815m, false, new t(i10, vVar), 1, (Object) null);
        } else {
            i10.c(vVar.f69815m.getProfile());
            j.b(i10, C9728b.c.f73064a);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(I i10, v vVar, l lVar) {
        C17542s.j(lVar, "state");
        if (C17542s.e(lVar, e.f128625a)) {
            j.b(i10, new C9728b.a(vVar.H()));
        } else {
            i10.c(vVar.f69815m.getProfile());
            i10.b(vVar.f69815m.getProfile(), new a(new u(vVar, i10)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(v vVar, I i10, h hVar) {
        C9728b J10 = vVar.J(hVar);
        if (J10 instanceof C9728b.C1273b) {
            j.b(i10, J10);
        } else if (J10 instanceof C9728b.d) {
            if (vVar.f69816n.isLoggedIn()) {
                j.b(i10, J10);
            } else {
                qv.e eVar = qv.e.DEBUG;
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
                        String a10 = C11818a.a("Ignore MissingProfile state when logging out...", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = i10.getClass().getName();
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
        } else if (!(J10 instanceof C9728b.a) && !(J10 instanceof C9728b.c)) {
            throw new t();
        }
        return C16807N.f139792a;
    }

    public final C11410b<k<String, l>> E() {
        return this.f69815m.e();
    }

    public final C11410b<k<String, l>> F() {
        return this.f69815m.v();
    }

    public final F<List<C9727a>> G() {
        return this.f69819q;
    }
}

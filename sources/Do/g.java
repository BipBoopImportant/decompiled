package Do;

import Do.a;
import Do.l;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Nn.C10803f;
import Nn.C10804g;
import Nn.C10808k;
import Nn.C10812o;
import Nn.G;
import Nn.K;
import Op.C10828d;
import Op.a1;
import Op.b1;
import XH.C16818i;
import XH.t;
import YH.C16877v;
import Yn.F;
import androidx.lifecycle.L;
import com.sugarcube.core.logger.DslKt;
import ho.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import qx.C14957b;
import qx.c;

@Metadata(d1 = {"\u0000D\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0000H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "LNn/g;", "LYn/F;", "f", "(Ljava/util/List;)Ljava/util/List;", "Lkp/d;", "currencyConfig", "", "familyAndRegularPriceSameSize", "showExclTax", "LOp/a1;", "g", "(Ljava/util/List;Lkp/d;ZZ)Ljava/util/List;", "LNn/f;", "checkoutHolder", "d", "(LNn/f;)Z", "Lho/b;", "deliveryOptions", "LDo/l;", "e", "(Ljava/util/List;)LDo/l;", "LDo/a$i;", "a", "LDo/a$i;", "DEFAULT_FIRST_STEP", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a.i f80093a = a.i.f79845a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f80094a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f80094a = lVar;
        }

        public final C16818i<?> c() {
            return this.f80094a;
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
            this.f80094a.invoke(obj);
        }
    }

    public static final boolean d(C10803f fVar) {
        K i10;
        List<G> list;
        Object obj;
        List<C10812o.b> b10;
        C10812o.b bVar;
        boolean z10 = false;
        if (fVar == null || (i10 = fVar.i()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (C10808k a10 : fVar.d()) {
            C16877v.E(arrayList, a10.a());
        }
        Iterator it = arrayList.iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C10812o) obj).h(), i10.f())) {
                break;
            }
        }
        C10812o oVar = (C10812o) obj;
        if (!(oVar == null || (b10 = oVar.b()) == null || (bVar = (C10812o.b) C16877v.y0(b10)) == null)) {
            list = bVar.a();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final l e(List<? extends b> list) {
        Object obj;
        boolean z10;
        C17542s.j(list, "deliveryOptions");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((b) next).a() != null) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        Object obj2 = null;
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Integer a10 = ((b) obj).a();
                int intValue = a10 != null ? a10.intValue() : Integer.MIN_VALUE;
                do {
                    Object next2 = it.next();
                    Integer a11 = ((b) next2).a();
                    int intValue2 = a11 != null ? a11.intValue() : Integer.MIN_VALUE;
                    if (intValue < intValue2) {
                        obj = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        b bVar = (b) obj;
        if (bVar == null) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar, false)) {
                    arrayList2.add(next3);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str == null) {
                    String a12 = C11818a.a("No delivery to pre-select", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str = C11820c.a(a12);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "findPreferredDeliveryOption";
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        } else if (bVar instanceof b.a) {
            ArrayList arrayList3 = new ArrayList();
            for (Object next4 : ((b.a) bVar).i().a()) {
                if (((C10812o) next4).a() != null) {
                    arrayList3.add(next4);
                }
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (it2.hasNext()) {
                    Integer a13 = ((C10812o) obj2).a();
                    int intValue3 = a13 != null ? a13.intValue() : Integer.MIN_VALUE;
                    do {
                        Object next5 = it2.next();
                        Integer a14 = ((C10812o) next5).a();
                        int intValue4 = a14 != null ? a14.intValue() : Integer.MIN_VALUE;
                        if (intValue3 < intValue4) {
                            obj2 = next5;
                            intValue3 = intValue4;
                        }
                    } while (it2.hasNext());
                }
            }
            C10812o oVar = (C10812o) obj2;
            if (oVar != null) {
                for (C10812o.b bVar3 : oVar.b()) {
                    Collection a15 = bVar3.a();
                    if (a15 == null || a15.isEmpty()) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        String h10 = oVar.h();
                        List<G> a16 = bVar3.a();
                        C17542s.g(a16);
                        return new l.a(bVar, h10, (G) C16877v.w0(a16), bVar3.c());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            throw new IllegalArgumentException("No pickup point to pre-select");
        } else if (bVar instanceof b.C2205b) {
            return new l.b(bVar);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final List<F> f(List<C10804g> list) {
        Iterable<C10804g> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10804g gVar : iterable) {
            String b10 = gVar.b();
            int c10 = gVar.c();
            C10804g.b a10 = gVar.a();
            arrayList.add(new F(b10, c10, a10 != null ? a10.a() : null));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List<a1> g(List<C10804g> list, C11522d dVar, boolean z10, boolean z11) {
        double doubleValue;
        String b10;
        Iterable<C10804g> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10804g gVar : iterable) {
            if (z11) {
                doubleValue = gVar.d();
            } else {
                Double e10 = gVar.e();
                doubleValue = e10 != null ? e10.doubleValue() : gVar.d();
            }
            c a10 = C14957b.a(doubleValue, dVar);
            String b11 = gVar.b();
            String type = gVar.getType();
            C10804g.b a11 = gVar.a();
            C15990f b12 = C15985a.b(new C10828d.m.b(new C10828d.C1720d(a11 != null ? a11.a() : null, (String) null)));
            C10804g.b a12 = gVar.a();
            if (a12 == null || (b10 = a12.d()) == null) {
                b10 = gVar.b();
            }
            String str = b10;
            C10804g.b a13 = gVar.a();
            String c10 = a13 != null ? a13.c() : null;
            C10804g.b a14 = gVar.a();
            arrayList.add(new a1((a1.a) null, new C10828d(b11, type, (C10828d.b) null, b12, new C10828d.h((C10828d.i) null, (C13023e) null, str, Co.c.i(c10, a14 != null ? a14.b() : null), (C13023e) null, new C10828d.l.f(new C10828d.l.e(a10, a10, C16877v.n(), (String) null)), (C10828d.c) null, C15985a.a(), (String) null, 19, (DefaultConstructorMarker) null), C15985a.a(), C15985a.a(), true), dVar, new b1.c(C13026h.b(Oo.b.f84585a7, Integer.valueOf(gVar.c()))), false, false, z10));
        }
        return arrayList;
    }
}

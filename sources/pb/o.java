package PB;

import EB.C12829a;
import EB.C12831c;
import GB.C12916a;
import IB.C13018a;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import PB.g;
import RB.C13505b;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import YH.X;
import ap.d;
import bI.C17035a;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import gC.C14508a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001e*\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 JU\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0!2\b\u0010%\u001a\u0004\u0018\u00010\u00162\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0!0&H\u0016¢\u0006\u0004\b)\u0010*J)\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0!*\b\u0012\u0004\u0012\u00020\u00140!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u0004\u0018\u00010-*\b\u0012\u0004\u0012\u00020'0!H\u0001¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101¨\u00062"}, d2 = {"LPB/o;", "LPB/n;", "LgC/a;", "getOpeningHoursHeaderUseCase", "Lap/d;", "distanceCalculator", "<init>", "(LgC/a;Lap/d;)V", "", "label", "LRB/b$a$a;", "stockStatus", "LPB/g$b$a;", "c", "(Ljava/lang/String;LRB/b$a$a;)LPB/g$b$a;", "", "availabilityClickCollect", "LPB/g$b$c;", "d", "(Z)LPB/g$b$c;", "LEB/c;", "store", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "location", "LXH/v;", "LIC/e;", "", "b", "(LEB/c;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)LXH/v;", "distanceLabel", "LPB/g;", "g", "(LEB/c;LIC/e;)LPB/g;", "", "stores", "LRB/b$a;", "stockData", "userLocation", "", "LIB/a$a$a;", "amenityOpeningHoursResult", "a", "(Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/appconfig/model/LocationLatLng;Ljava/util/Map;)Ljava/util/List;", "e", "(Ljava/util/List;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)Ljava/util/List;", "LPB/g$b$d;", "f", "(Ljava/util/List;)LPB/g$b$d;", "LgC/a;", "Lap/d;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final C14508a f113981a;

    /* renamed from: b  reason: collision with root package name */
    private final d f113982b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f113983a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                RB.b$a$a[] r0 = RB.C13505b.a.C2826a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                RB.b$a$a r1 = RB.C13505b.a.C2826a.IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                RB.b$a$a r1 = RB.C13505b.a.C2826a.LOW_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                RB.b$a$a r1 = RB.C13505b.a.C2826a.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                RB.b$a$a r1 = RB.C13505b.a.C2826a.INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f113983a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: PB.o.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f113984a;

        public b(Map map) {
            this.f113984a = map;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e((Integer) this.f113984a.get(((g) t10).j()), (Integer) this.f113984a.get(((g) t11).j()));
        }
    }

    public o(C14508a aVar, d dVar) {
        C17542s.j(aVar, "getOpeningHoursHeaderUseCase");
        C17542s.j(dVar, "distanceCalculator");
        this.f113981a = aVar;
        this.f113982b = dVar;
    }

    private final v<C13023e, Double> b(C12831c cVar, LocationLatLng locationLatLng) {
        double b10 = this.f113982b.b(locationLatLng, new LocationLatLng(cVar.d(), cVar.e()));
        return C16796C.a(d.a.a(this.f113982b, b10, 0, 2, (Object) null), Double.valueOf(b10));
    }

    private final g.b.a c(String str, C13505b.a.C2826a aVar) {
        g.b.a.C2801a aVar2;
        int i10 = a.f113983a[aVar.ordinal()];
        if (i10 == 1) {
            aVar2 = g.b.a.C2801a.IN_STOCK;
        } else if (i10 == 2) {
            aVar2 = g.b.a.C2801a.LOW_STOCK;
        } else if (i10 == 3) {
            aVar2 = g.b.a.C2801a.OUT_OF_STOCK;
        } else if (i10 == 4) {
            aVar2 = g.b.a.C2801a.INDETERMINATE;
        } else {
            throw new t();
        }
        return new g.b.a(str, aVar2);
    }

    private final g.b.c d(boolean z10) {
        return new g.b.c(z10 ? C13026h.a(Oo.b.f84776s0) : C13026h.a(Oo.b.f84787t0), z10);
    }

    private final g g(C12831c cVar, C13023e eVar) {
        String g10 = cVar.g();
        String h10 = cVar.h();
        String f10 = cVar.f();
        boolean i10 = cVar.i();
        Iterable<C12831c.a> c10 = cVar.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (C12831c.a a10 : c10) {
            arrayList.add(new g.a(a10.a()));
        }
        return new g(g10, h10, f10, eVar, i10, false, C15985a.l(arrayList), (C15987c) null, cVar.b(), 160, (DefaultConstructorMarker) null);
    }

    public List<g> a(List<C12831c> list, List<C13505b.a> list2, LocationLatLng locationLatLng, Map<String, ? extends List<C13018a.C2677a.C2678a>> map) {
        boolean z10;
        List<C12831c> list3 = list;
        List<C13505b.a> list4 = list2;
        Map<String, ? extends List<C13018a.C2677a.C2678a>> map2 = map;
        C17542s.j(list3, "stores");
        C17542s.j(list4, "stockData");
        C17542s.j(map2, "amenityOpeningHoursResult");
        Iterable iterable = list4;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(((C13505b.a) next).d(), next);
        }
        Iterable<g> e10 = e(list3, locationLatLng);
        ArrayList arrayList = new ArrayList(C16877v.y(e10, 10));
        for (g gVar : e10) {
            C13505b.a aVar = (C13505b.a) linkedHashMap.get(gVar.j());
            List list5 = (List) map2.get(gVar.j());
            g.b.d f10 = list5 != null ? f(list5) : null;
            List c10 = C16877v.c();
            if (aVar != null) {
                boolean e11 = aVar.e();
                c10.add(c(aVar.b(), aVar.c()));
                if (aVar.a() != null) {
                    c10.add(d(aVar.a().booleanValue()));
                }
                z10 = e11;
            } else {
                z10 = false;
            }
            if (f10 != null) {
                c10.add(f10);
            }
            arrayList.add(g.b(gVar, (String) null, (String) null, (String) null, (C13023e) null, false, z10, (C15987c) null, C15985a.l(C16877v.a(c10)), (C12829a) null, 351, (Object) null));
        }
        return arrayList;
    }

    public final List<g> e(List<C12831c> list, LocationLatLng locationLatLng) {
        ArrayList arrayList;
        C17542s.j(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (locationLatLng != null) {
            Iterable<C12831c> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C12831c cVar : iterable) {
                v<C13023e, Double> b10 = b(cVar, locationLatLng);
                linkedHashMap.put(cVar.g(), Integer.valueOf((int) b10.b().doubleValue()));
                arrayList.add(g(cVar, b10.a()));
            }
        } else {
            Iterable<C12831c> iterable2 = list;
            arrayList = new ArrayList(C16877v.y(iterable2, 10));
            for (C12831c g10 : iterable2) {
                arrayList.add(g(g10, (C13023e) null));
            }
        }
        return !linkedHashMap.isEmpty() ? C16877v.g1(arrayList, new b(linkedHashMap)) : arrayList;
    }

    public final g.b.d f(List<C13018a.C2677a.C2678a> list) {
        Object obj;
        C17542s.j(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C13018a.C2677a.C2678a) obj).h() == C12916a.C2641a.STORE) {
                break;
            }
        }
        C13018a.C2677a.C2678a aVar = (C13018a.C2677a.C2678a) obj;
        if (aVar == null) {
            return null;
        }
        return new g.b.d(this.f113981a.a(aVar));
    }
}

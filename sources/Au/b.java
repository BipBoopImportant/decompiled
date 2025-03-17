package Au;

import HJ.C15850p;
import HJ.C15854t;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import YH.C16877v;
import YH.X;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import ru.C11847a;
import tI.C17978n;
import uK.C18146a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LAu/b;", "Lru/b;", "<init>", "()V", "", "poi", "LXH/v;", "c", "(Ljava/lang/String;)LXH/v;", "Lru/a;", "a", "(Ljava/lang/String;)Lru/a;", "LHJ/p;", "LXH/o;", "d", "()LHJ/p;", "groupRegex", "", "b", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "mappedValues", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements ru.b {

    /* renamed from: a  reason: collision with root package name */
    private final C16824o f79127a = C16825p.b(new a());

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C11847a> f79128b;

    public b() {
        C11847a aVar = r1;
        C11847a aVar2 = new C11847a("POI_SUBTYPE_ENTRANCE", c.f79132D, C18146a.f148406d8);
        C11847a aVar3 = r1;
        C11847a aVar4 = new C11847a("POI_SUBTYPE_EXIT", c.f79135G, C18146a.f148406d8);
        C11847a aVar5 = r1;
        C11847a aVar6 = new C11847a("POI_SUBTYPE_STAIRS", c.f79153Y, C18146a.f148211Qb);
        C11847a aVar7 = r1;
        C11847a aVar8 = new C11847a("POI_SUBTYPE_ESCALATOR", c.f79133E, C18146a.f148173O3);
        C11847a aVar9 = r1;
        C11847a aVar10 = new C11847a("POI_SUBTYPE_LIFT", c.f79141M, C18146a.f148651t6);
        C11847a aVar11 = r1;
        C11847a aVar12 = new C11847a("POI_SUBTYPE_CHECK_OUT", c.f79180z, C18146a.f148067H2);
        C11847a aVar13 = r1;
        C11847a aVar14 = new C11847a("POI_SUBTYPE_RESTAURANT_AND_CAFE", c.f79148T, C18146a.f148307X2);
        C11847a aVar15 = r1;
        C11847a aVar16 = new C11847a("POI_SUBTYPE_BISTRO", c.f79179y, C18146a.f148055G5);
        C11847a aVar17 = r1;
        C11847a aVar18 = new C11847a("POI_SUBTYPE_RESTROOM", c.f79149U, C18146a.f148254T9);
        C11847a aVar19 = r1;
        C11847a aVar20 = new C11847a("POI_SUBTYPE_NURSING_ROOM", c.f79143O, C18146a.f148414e0);
        C11847a aVar21 = r1;
        C11847a aVar22 = new C11847a("POI_SUBTYPE_SHOPPING_TROLLEY", c.f79150V, C18146a.f148330Ya);
        C11847a aVar23 = r1;
        C11847a aVar24 = new C11847a("POI_SUBTYPE_KIOSK_OR_DISPLAY", c.f79140L, C18146a.f148513k3);
        C11847a aVar25 = r0;
        C11847a aVar26 = new C11847a("POI_SUBTYPE_INFORMATION", c.f79139K, C18146a.f148220R5);
        C11847a aVar27 = r0;
        C11847a aVar28 = new C11847a("POI_SUBTYPE_CUSTOMER_SERVICE", c.f79130B, C18146a.f148220R5);
        C11847a aVar29 = r0;
        C11847a aVar30 = new C11847a("POI_SUBTYPE_IKEA_FAMILY", c.f79137I, C18146a.f148667u7);
        C11847a aVar31 = r0;
        C11847a aVar32 = new C11847a("POI_SUBTYPE_EXCHANGES_AND_RETURNS", c.f79134F, C18146a.f148344Z9);
        C11847a aVar33 = r0;
        C11847a aVar34 = new C11847a("POI_SUBTYPE_PICK_UP_POINT", c.f79144P, C18146a.f148352a2);
        C11847a aVar35 = r0;
        C11847a aVar36 = new C11847a("POI_SUBTYPE_DELIVERY_SERVICES", c.f79131C, C18146a.f148385c3);
        C11847a aVar37 = r0;
        C11847a aVar38 = new C11847a("POI_SUBTYPE_SHOWROOM_ENTRANCE", c.f79151W, C18146a.f148256Tb);
        C11847a aVar39 = r0;
        C11847a aVar40 = new C11847a("POI_SUBTYPE_IKEA_FOR_BUSINESS", c.f79138J, C18146a.f148140M0);
        C11847a aVar41 = r0;
        C11847a aVar42 = new C11847a("POI_SUBTYPE_MARKETHALL_ENTRANCE", c.f79142N, C18146a.f148256Tb);
        C11847a aVar43 = r0;
        C11847a aVar44 = new C11847a("POI_SUBTYPE_CIRCULAR_HUB", c.f79129A, C18146a.f148306X1);
        C11847a aVar45 = r0;
        C11847a aVar46 = new C11847a("POI_SUBTYPE_SWEDISH_FOOD_MARKET", c.f79154Z, C18146a.f148700wa);
        C11847a aVar47 = r0;
        C11847a aVar48 = new C11847a("POI_SUBTYPE_SMALAND", c.f79152X, C18146a.f148594p9);
        C11847a aVar49 = r0;
        C11847a aVar50 = new C11847a("POI_SUBTYPE_FINANCIAL_DESK", c.f79136H, C18146a.f148498j4);
        C11847a aVar51 = r0;
        C11847a aVar52 = new C11847a("POI_SUBTYPE_PLANNER_KITCHEN", c.f79146R, C18146a.f147983B8);
        C11847a aVar53 = r0;
        C11847a aVar54 = new C11847a("POI_SUBTYPE_PLANNER_BEDROOM", c.f79145Q, C18146a.f147983B8);
        C11847a aVar55 = r0;
        C11847a aVar56 = new C11847a("POI_SUBTYPE_PLANNER_LIVING_ROOM", c.f79147S, C18146a.f147983B8);
        C11847a aVar57 = r0;
        C11847a aVar58 = new C11847a("DEPT_001", c.f79169o, C18146a.f148509k);
        C11847a aVar59 = r0;
        C11847a aVar60 = new C11847a("DEPT_002", c.f79172r, C18146a.f148726y6);
        C11847a aVar61 = r0;
        C11847a aVar62 = new C11847a("DEPT_003", c.f79167m, C18146a.f148684v9);
        C11847a aVar63 = r0;
        C11847a aVar64 = new C11847a("DEPT_004", c.f79165k, C18146a.f148395cd);
        C11847a aVar65 = r0;
        C11847a aVar66 = new C11847a("DEPT_005", c.f79161g, C18146a.f148361ab);
        C11847a aVar67 = r0;
        C11847a aVar68 = new C11847a("DEPT_006", c.f79175u, C18146a.f148565na);
        C11847a aVar69 = r0;
        C11847a aVar70 = new C11847a("DEPT_007", c.f79170p, C18146a.f148292W2);
        C11847a aVar71 = r0;
        C11847a aVar72 = new C11847a("DEPT_008", c.f79162h, C18146a.f148375b9);
        C11847a aVar73 = r0;
        C11847a aVar74 = new C11847a("DEPT_015", c.f79168n, C18146a.f148487i9);
        C11847a aVar75 = r0;
        C11847a aVar76 = new C11847a("DEPT_017", c.f79176v, C18146a.f148700wa);
        C11847a aVar77 = r0;
        C11847a aVar78 = new C11847a("DEPT_009", c.f79173s, C18146a.f148596pb);
        C11847a aVar79 = r0;
        C11847a aVar80 = new C11847a("DEPT_016", c.f79174t, C18146a.f148005D0);
        C11847a aVar81 = r0;
        C11847a aVar82 = new C11847a("DEPT_010", c.f79166l, C18146a.f148541m1);
        C11847a aVar83 = r0;
        C11847a aVar84 = new C11847a("DEPT_011", c.f79171q, C18146a.f148404d6);
        C11847a aVar85 = r0;
        C11847a aVar86 = new C11847a("DEPT_012", c.f79177w, C18146a.f148374b8);
        C11847a aVar87 = r0;
        C11847a aVar88 = new C11847a("DEPT_013", c.f79163i, C18146a.f148615r0);
        C11847a aVar89 = r0;
        C11847a aVar90 = new C11847a("DEPT_014", c.f79164j, C18146a.f148388c6);
        C11847a aVar91 = r0;
        C11847a aVar92 = new C11847a("DIV_SELF_SERVE", c.f79178x, C18146a.f148069H4);
        Iterable q10 = C16877v.q(aVar, aVar3, aVar5, aVar7, aVar9, aVar11, aVar13, aVar15, aVar17, aVar19, aVar21, aVar23, aVar25, aVar27, aVar29, aVar31, aVar33, aVar35, aVar37, aVar39, aVar41, aVar43, aVar45, aVar47, aVar49, aVar51, aVar53, aVar55, aVar57, aVar59, aVar61, aVar63, aVar65, aVar67, aVar69, aVar71, aVar73, aVar75, aVar77, aVar79, aVar81, aVar83, aVar85, aVar87, aVar89, aVar91);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(q10, 10)), 16));
        for (Object next : q10) {
            linkedHashMap.put(((C11847a) next).d(), next);
        }
        this.f79128b = linkedHashMap;
    }

    private final v<String, String> c(String str) {
        String j10 = d().j(str, "");
        if (!C17542s.e(j10, str)) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Adjusted grouped poi id from: " + str + " to " + j10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        return C16796C.a(j10, str);
    }

    private final C15850p d() {
        return (C15850p) this.f79127a.getValue();
    }

    /* access modifiers changed from: private */
    public static final C15850p f() {
        return new C15850p("/[0-9]*");
    }

    public C11847a a(String str) {
        Object obj;
        C11847a b10;
        C17542s.j(str, "poi");
        v<String, String> c10 = c(str);
        String a10 = c10.a();
        String b11 = c10.b();
        Iterator it = e().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C11847a) obj).d(), a10)) {
                break;
            }
        }
        C11847a aVar = (C11847a) obj;
        if (aVar != null && (b10 = C11847a.b(aVar, b11, 0, 0, 6, (Object) null)) != null) {
            return b10;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Poi ID not found: " + str);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a11 = C11818a.a((String) null, illegalArgumentException);
                if (a11 == null) {
                    return null;
                }
                str2 = C11820c.a(a11);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalArgumentException, str4);
            str2 = str4;
            str3 = str5;
        }
        return null;
    }

    public Map<String, C11847a> e() {
        return this.f79128b;
    }
}

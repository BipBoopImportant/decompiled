package Ft;

import GB.C12916a;
import Gt.f;
import IB.C13018a;
import IC.C13023e;
import IC.C13026h;
import SB.C13561a;
import XH.t;
import XH.v;
import YH.C16877v;
import gC.C14509b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18146a;

@Metadata(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "LIB/a$a$a;", "LgC/b;", "openingHoursLabelMapper", "LGt/f$a;", "b", "(Ljava/util/List;LgC/b;)Ljava/util/List;", "LGt/f$c;", "c", "(Ljava/util/List;LgC/b;)LGt/f$c;", "LGB/a$a;", "LXH/v;", "", "LIC/e;", "a", "(LGB/a$a;)LXH/v;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81057a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f81058b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
        static {
            /*
                gC.b$a$a[] r0 = gC.C14509b.a.C3118a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                gC.b$a$a r2 = gC.C14509b.a.C3118a.CLOSED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                gC.b$a$a r3 = gC.C14509b.a.C3118a.OPENS_SOON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f81057a = r0
                GB.a$a[] r0 = GB.C12916a.C2641a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                GB.a$a r3 = GB.C12916a.C2641a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                GB.a$a r1 = GB.C12916a.C2641a.STORE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                GB.a$a r1 = GB.C12916a.C2641a.RESTAURANT     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                GB.a$a r1 = GB.C12916a.C2641a.BISTRO     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                GB.a$a r1 = GB.C12916a.C2641a.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                GB.a$a r1 = GB.C12916a.C2641a.PLAY_AREA     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                GB.a$a r1 = GB.C12916a.C2641a.CAFE     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                f81058b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ft.d.a.<clinit>():void");
        }
    }

    public static final v<Integer, C13023e> a(C12916a.C2641a aVar) {
        C17542s.j(aVar, "<this>");
        switch (a.f81058b[aVar.ordinal()]) {
            case 1:
                return new v<>(Integer.valueOf(C18146a.f148509k), C13026h.a(C13561a.f115654q));
            case 2:
                return new v<>(Integer.valueOf(C18146a.f148378bc), C13026h.a(C13561a.f115653p));
            case 3:
                return new v<>(Integer.valueOf(C18146a.f148307X2), C13026h.a(C13561a.f115651n));
            case 4:
                return new v<>(Integer.valueOf(C18146a.f148055G5), C13026h.a(C13561a.f115640c));
            case 5:
                return new v<>(Integer.valueOf(C18146a.f148352a2), C13026h.a(C13561a.f115642e));
            case 6:
                return new v<>(Integer.valueOf(C18146a.f148594p9), C13026h.a(C13561a.f115652o));
            case 7:
                return new v<>(Integer.valueOf(C18146a.f148262U2), C13026h.a(C13561a.f115641d));
            default:
                throw new t();
        }
    }

    public static final List<f.a> b(List<C13018a.C2677a.C2678a> list, C14509b bVar) {
        C17542s.j(list, "<this>");
        C17542s.j(bVar, "openingHoursLabelMapper");
        ArrayList<C13018a.C2677a.C2678a> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C13018a.C2677a.C2678a) next).h() != C12916a.C2641a.STORE) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (C13018a.C2677a.C2678a aVar : arrayList) {
            v<Integer, C13023e> a10 = a(aVar.h());
            int intValue = a10.a().intValue();
            C13023e b10 = a10.b();
            Boolean e10 = aVar.e();
            arrayList2.add(new f.a(e10 != null ? e10.booleanValue() : false, bVar.b(aVar), b10, intValue));
        }
        return arrayList2;
    }

    public static final f.c c(List<C13018a.C2677a.C2678a> list, C14509b bVar) {
        f.b bVar2;
        Object obj;
        C13023e eVar;
        C17542s.j(list, "<this>");
        C17542s.j(bVar, "openingHoursLabelMapper");
        Iterator it = list.iterator();
        while (true) {
            bVar2 = null;
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
        v<Integer, C13023e> a10 = a(aVar.h());
        int intValue = a10.a().intValue();
        C13023e b10 = a10.b();
        Boolean e10 = aVar.e();
        boolean booleanValue = e10 != null ? e10.booleanValue() : false;
        C13023e b11 = bVar.b(aVar);
        String a11 = aVar.a();
        if (a11 == null) {
            a11 = "";
        }
        C13023e c10 = C13026h.c(a11);
        C14509b.a a12 = bVar.a(aVar);
        if (a12 != null) {
            int i10 = a.f81057a[a12.b().ordinal()];
            if (i10 == 1) {
                eVar = C13026h.a(C13561a.f115643f);
            } else if (i10 == 2) {
                eVar = C13026h.a(C13561a.f115650m);
            } else {
                throw new t();
            }
            bVar2 = new f.b(eVar, a12.a());
        }
        return new f.c(booleanValue, b11, c10, bVar2, b10, intValue);
    }
}

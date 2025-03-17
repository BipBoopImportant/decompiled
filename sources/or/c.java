package Or;

import Dr.c;
import KJ.C15987c;
import Qr.b;
import XH.t;
import YH.C16877v;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nF.C14850a;
import nF.C14851b;
import nF.C14853d;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LDr/c$a;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "i", "(LDr/c$a;)Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "LQr/b$c;", "LnF/b;", "f", "(LQr/b$c;)LnF/b;", "LQr/b$c$a;", "LnF/b$a;", "d", "(LQr/b$c$a;)LnF/b$a;", "LQr/b$c$b;", "LnF/b$b;", "e", "(LQr/b$c$b;)LnF/b$b;", "LQr/b$a;", "LnF/a;", "c", "(LQr/b$a;)LnF/a;", "LQr/b$b$a;", "LnF/d$b;", "g", "(LQr/b$b$a;)LnF/d$b;", "LQr/b$b$b;", "LnF/d$c;", "h", "(LQr/b$b$b;)LnF/d$c;", "geomagical-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85378a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Dr.c$a[] r0 = Dr.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Dr.c$a r1 = Dr.c.a.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Dr.c$a r1 = Dr.c.a.SEARCH     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Dr.c$a r1 = Dr.c.a.PROFILE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Dr.c$a r1 = Dr.c.a.MEMBERSHIP_OVERVIEW     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Dr.c$a r1 = Dr.c.a.MEMBERSHIP_LIST     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f85378a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Or.c.a.<clinit>():void");
        }
    }

    private static final C14850a c(b.a aVar) {
        C14853d h10;
        C14853d dVar;
        String c10 = aVar.c();
        String e10 = aVar.e();
        b.C1772b d10 = aVar.d();
        if (d10 instanceof b.C1772b.a) {
            h10 = g((b.C1772b.a) d10);
        } else if (d10 instanceof b.C1772b.C1773b) {
            h10 = h((b.C1772b.C1773b) d10);
        } else {
            throw new t();
        }
        C14853d dVar2 = h10;
        String a10 = aVar.a();
        b.C1772b b10 = aVar.b();
        if (b10 instanceof b.C1772b.a) {
            dVar = g((b.C1772b.a) b10);
        } else if (b10 instanceof b.C1772b.C1773b) {
            dVar = h((b.C1772b.C1773b) b10);
        } else if (b10 == null) {
            dVar = null;
        } else {
            throw new t();
        }
        return new C14850a(c10, e10, dVar2, a10, dVar, (String) null, 32, (DefaultConstructorMarker) null);
    }

    private static final C14851b.a d(b.c.a aVar) {
        C14853d dVar;
        b.C1772b a10 = aVar.a();
        if (a10 instanceof b.C1772b.C1773b) {
            dVar = h((b.C1772b.C1773b) a10);
        } else if (a10 instanceof b.C1772b.a) {
            dVar = g((b.C1772b.a) a10);
        } else {
            throw new t();
        }
        return new C14851b.a(dVar);
    }

    private static final C14851b.C3193b e(b.c.C1774b bVar) {
        String b10 = bVar.b();
        String c10 = bVar.c();
        C15987c<b.a> a10 = bVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (b.a c11 : a10) {
            arrayList.add(c(c11));
        }
        return new C14851b.C3193b(b10, c10, arrayList);
    }

    /* access modifiers changed from: private */
    public static final C14851b f(b.c cVar) {
        if (cVar instanceof b.c.a) {
            return d((b.c.a) cVar);
        }
        if (cVar instanceof b.c.C1774b) {
            return e((b.c.C1774b) cVar);
        }
        throw new t();
    }

    private static final C14853d.b g(b.C1772b.a aVar) {
        return new C14853d.b(aVar.c(), aVar.a(), aVar.b());
    }

    private static final C14853d.c h(b.C1772b.C1773b bVar) {
        return new C14853d.c(bVar.c(), bVar.a(), bVar.b());
    }

    /* access modifiers changed from: private */
    public static final OpeningSource i(c.a aVar) {
        int i10 = a.f85378a[aVar.ordinal()];
        if (i10 == 1) {
            return OpeningSource.HomeTab.INSTANCE;
        }
        if (i10 == 2) {
            return OpeningSource.SearchTab.INSTANCE;
        }
        if (i10 == 3) {
            return OpeningSource.Profile.INSTANCE;
        }
        if (i10 == 4) {
            return OpeningSource.MembersOverview.INSTANCE;
        }
        if (i10 == 5) {
            return OpeningSource.MembersList.INSTANCE;
        }
        throw new t();
    }
}

package Gr;

import Dr.c;
import XH.C16814e;
import XH.t;
import android.app.Activity;
import android.net.Uri;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8951o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LGr/e;", "LDr/c;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "Lx4/o;", "navController", "LDr/c$a;", "source", "LXH/N;", "a", "(Lx4/o;LDr/c$a;)V", "LAe/e;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Ae.e f81198a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81199a;

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
                f81199a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gr.e.a.<clinit>():void");
        }
    }

    public e(Ae.e eVar) {
        C17542s.j(eVar, "analytics");
        this.f81198a = eVar;
    }

    @C16814e
    public void a(C8951o oVar, c.a aVar) {
        String str;
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "source");
        this.f81198a.e((Activity) null, "Geomagical");
        int i10 = a.f81199a[aVar.ordinal()];
        if (i10 == 1) {
            str = OpeningSource.HomeTab.INSTANCE.getKey();
        } else if (i10 == 2) {
            str = OpeningSource.SearchTab.INSTANCE.getKey();
        } else if (i10 == 3) {
            str = OpeningSource.Profile.INSTANCE.getKey();
        } else if (i10 == 4) {
            str = OpeningSource.MembersOverview.INSTANCE.getKey();
        } else if (i10 == 5) {
            str = OpeningSource.MembersList.INSTANCE.getKey();
        } else {
            throw new t();
        }
        Uri build = Uri.parse(ow.c.b("ikea://design-lab/gallery")).buildUpon().appendQueryParameter("source", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}

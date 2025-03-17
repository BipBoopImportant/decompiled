package Gm;

import HJ.C15854t;
import Nm.a;
import XH.t;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LGm/f;", "LNm/a;", "LGm/e;", "externalNavigation", "<init>", "(LGm/e;)V", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "", "isTakeATour", "LXH/N;", "c", "(Lx4/o;Lx4/C;Z)V", "", "id", "a", "(Lx4/o;Ljava/lang/String;Lx4/C;)V", "b", "(Lx4/o;Lx4/C;)V", "LGm/e;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements Nm.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f81180a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81181a;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Jm.a[] r0 = Jm.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Jm.a r1 = Jm.a.EVENTS_AND_WORKSHOPS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Jm.a r1 = Jm.a.FREE_DRINK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Jm.a r1 = Jm.a.MEMBERSHIP_DISCOUNTS_RANGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Jm.a r1 = Jm.a.FAMILY_BENEFITS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Jm.a r1 = Jm.a.REWARD_KEYS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Jm.a r1 = Jm.a.PRICE_PROTECTION     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Jm.a r1 = Jm.a.GIVE_BACK_PROJECTS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                Jm.a r1 = Jm.a.THANK_YOU_SURPRISES     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                Jm.a r1 = Jm.a.JUST_IN_CASE_PROTECTION     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                Jm.a r1 = Jm.a.PARTNERSHIPS     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                Jm.a r1 = Jm.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                f81181a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gm.f.a.<clinit>():void");
        }
    }

    public f(e eVar) {
        C17542s.j(eVar, "externalNavigation");
        this.f81180a = eVar;
    }

    public void a(C8951o oVar, String str, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "id");
        C17542s.j(c10, "navOptions");
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
                String a10 = C11818a.a("Trying to navigate to benefit: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = f.class.getName();
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
        switch (a.f81181a[Jm.a.Companion.a(str).ordinal()]) {
            case 1:
                this.f81180a.h(oVar);
                return;
            case 2:
                this.f81180a.e(oVar);
                return;
            case 3:
                this.f81180a.g(oVar);
                return;
            case 4:
                a.C1689a.b(this, oVar, (C) null, false, 6, (Object) null);
                return;
            case 5:
                this.f81180a.f(oVar);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return;
            default:
                throw new t();
        }
    }

    public void b(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        oVar.Y(Uri.parse("ikea://navigation/benefits/featured_benefit"), c10);
    }

    public void c(C8951o oVar, C c10, boolean z10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        Uri build = c.a(Uri.parse("ikea://navigation/benefits/benefits_page?is_take_a_tour_key={is_take_a_tour_key}")).buildUpon().appendQueryParameter("is_take_a_tour_key", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }
}

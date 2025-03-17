package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.f;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/M;", "LM6/b;", "Lvh/L;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/L;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/L;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class M implements C6654b<L> {

    /* renamed from: a  reason: collision with root package name */
    public static final M f77285a = new M();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77286b = C16877v.q("openingHoursMonTime", "openingHoursTueTime", "openingHoursWedTime", "openingHoursThuTime", "openingHoursFriTime", "openingHoursSatTime", "openingHoursSunTime");

    private M() {
    }

    /* renamed from: c */
    public L a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (true) {
            switch (fVar.T2(f77286b)) {
                case 0:
                    str = d.f38532a.a(fVar, kVar);
                    break;
                case 1:
                    str2 = d.f38532a.a(fVar, kVar);
                    break;
                case 2:
                    str3 = d.f38532a.a(fVar, kVar);
                    break;
                case 3:
                    str4 = d.f38532a.a(fVar, kVar);
                    break;
                case 4:
                    str5 = d.f38532a.a(fVar, kVar);
                    break;
                case 5:
                    str6 = d.f38532a.a(fVar, kVar);
                    break;
                case 6:
                    str7 = d.f38532a.a(fVar, kVar);
                    break;
                default:
                    C17542s.g(str);
                    C17542s.g(str2);
                    C17542s.g(str3);
                    C17542s.g(str4);
                    C17542s.g(str5);
                    C17542s.g(str6);
                    C17542s.g(str7);
                    return new L(str, str2, str3, str4, str5, str6, str7);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, L l10) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(l10, "value");
        gVar.q1("openingHoursMonTime");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, l10.b());
        gVar.q1("openingHoursTueTime");
        bVar.b(gVar, kVar, l10.f());
        gVar.q1("openingHoursWedTime");
        bVar.b(gVar, kVar, l10.g());
        gVar.q1("openingHoursThuTime");
        bVar.b(gVar, kVar, l10.e());
        gVar.q1("openingHoursFriTime");
        bVar.b(gVar, kVar, l10.a());
        gVar.q1("openingHoursSatTime");
        bVar.b(gVar, kVar, l10.c());
        gVar.q1("openingHoursSunTime");
        bVar.b(gVar, kVar, l10.d());
    }
}

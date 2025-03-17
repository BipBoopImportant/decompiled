package IC;

import YH.C16877v;
import java.util.Set;
import kotlin.Metadata;
import tI.C17974j;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\rR&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"LIC/d;", "", "<init>", "()V", "", "hourOfDay", "LIC/a;", "a", "(I)LIC/a;", "LtI/j;", "b", "LtI/j;", "getMORNING_HOUR_INTERVAL$common_release", "()LtI/j;", "getMORNING_HOUR_INTERVAL$common_release$annotations", "MORNING_HOUR_INTERVAL", "c", "getAFTERNOON_HOUR_INTERVAL$common_release", "getAFTERNOON_HOUR_INTERVAL$common_release$annotations", "AFTERNOON_HOUR_INTERVAL", "", "d", "Ljava/util/Set;", "getEVENING_HOUR_SET$common_release", "()Ljava/util/Set;", "getEVENING_HOUR_SET$common_release$annotations", "EVENING_HOUR_SET", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: IC.d  reason: case insensitive filesystem */
public final class C13022d {

    /* renamed from: a  reason: collision with root package name */
    public static final C13022d f110926a = new C13022d();

    /* renamed from: b  reason: collision with root package name */
    private static final C17974j f110927b;

    /* renamed from: c  reason: collision with root package name */
    private static final C17974j f110928c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<Integer> f110929d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f110930e = 8;

    static {
        C17974j jVar = new C17974j(5, 11);
        f110927b = jVar;
        C17974j jVar2 = new C17974j(12, 17);
        f110928c = jVar2;
        f110929d = C16877v.h1(C16877v.h1(new C17974j(0, 23), jVar), jVar2);
    }

    private C13022d() {
    }

    public final C13019a a(int i10) {
        C17974j jVar = f110927b;
        int p10 = jVar.p();
        if (i10 <= jVar.q() && p10 <= i10) {
            return C13019a.Morning;
        }
        C17974j jVar2 = f110928c;
        return (i10 > jVar2.q() || jVar2.p() > i10) ? f110929d.contains(Integer.valueOf(i10)) ? C13019a.Evening : C13019a.NotAvailable : C13019a.Afternoon;
    }
}

package IJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "value", "LIJ/e;", "sourceUnit", "targetUnit", "a", "(DLIJ/e;LIJ/e;)D", "", "c", "(JLIJ/e;LIJ/e;)J", "b", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* renamed from: IJ.f  reason: case insensitive filesystem */
class C15910f {
    public static final double a(double d10, C15909e eVar, C15909e eVar2) {
        C17542s.j(eVar, "sourceUnit");
        C17542s.j(eVar2, "targetUnit");
        long convert = eVar2.b().convert(1, eVar.b());
        return convert > 0 ? d10 * ((double) convert) : d10 / ((double) eVar.b().convert(1, eVar2.b()));
    }

    public static final long b(long j10, C15909e eVar, C15909e eVar2) {
        C17542s.j(eVar, "sourceUnit");
        C17542s.j(eVar2, "targetUnit");
        return eVar2.b().convert(j10, eVar.b());
    }

    public static final long c(long j10, C15909e eVar, C15909e eVar2) {
        C17542s.j(eVar, "sourceUnit");
        C17542s.j(eVar2, "targetUnit");
        return eVar2.b().convert(j10, eVar.b());
    }
}

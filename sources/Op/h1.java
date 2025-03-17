package Op;

import Oo.b;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"LOp/h1;", "", "", "type", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "I", "j", "()I", "DETAILS_AND_SIZING", "MATERIALS_AND_CARE", "SAFETY_AND_COMPLIANCE", "ASSEMBLY_AND_DOCUMENTS", "REVIEWS", "GOOD_TO_KNOW", "TECHNICAL_INFORMATION", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum h1 {
    DETAILS_AND_SIZING("DETAILS_AND_SIZING", b.f84646g2),
    MATERIALS_AND_CARE("MATERIALS_AND_CARE", b.f84372F4),
    SAFETY_AND_COMPLIANCE("SAFETY_AND_COMPLIANCE", b.f84365E7),
    ASSEMBLY_AND_DOCUMENTS("ASSEMBLY_AND_DOCUMENTS", b.f84578a0),
    REVIEWS("REVIEWS", b.f84761q7),
    GOOD_TO_KNOW("GOOD_TO_KNOW", b.f84371F3),
    TECHNICAL_INFORMATION("TECHNICAL_INFORMATION", b.f84426K8);
    
    private final int title;
    private final String type;

    static {
        h1[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private h1(String str, int i10) {
        this.type = str;
        this.title = i10;
    }

    public static C17220a<h1> b() {
        return $ENTRIES;
    }

    public final int j() {
        return this.title;
    }

    public final String m() {
        return this.type;
    }
}

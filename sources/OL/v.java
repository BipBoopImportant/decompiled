package ol;

import Oo.b;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lol/v;", "", "", "iconRes", "contentDescriptionRes", "<init>", "(Ljava/lang/String;III)V", "I", "m", "()I", "b", "CLOSE", "BACK", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum v {
    CLOSE(C18146a.f148097J2, b.f84665i),
    BACK(C18146a.f148719y, b.f84632f);
    
    private final int contentDescriptionRes;
    private final int iconRes;

    static {
        v[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private v(int i10, int i11) {
        this.iconRes = i10;
        this.contentDescriptionRes = i11;
    }

    public static C17220a<v> j() {
        return $ENTRIES;
    }

    public final int b() {
        return this.contentDescriptionRes;
    }

    public final int m() {
        return this.iconRes;
    }
}

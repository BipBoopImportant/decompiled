package Bg;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LBg/d;", "", "", "tag", "", "ratingThreshold", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "I", "j", "()I", "OPEN_PLP", "OPEN_PIP", "ADD_FAVORITE", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    OPEN_PLP("open_plp", 2),
    OPEN_PIP("open_pip", 3),
    ADD_FAVORITE("add_favorite", 3);
    
    private final int ratingThreshold;
    private final String tag;

    static {
        d[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private d(String str, int i10) {
        this.tag = str;
        this.ratingThreshold = i10;
    }

    public static C17220a<d> b() {
        return $ENTRIES;
    }

    public final int j() {
        return this.ratingThreshold;
    }

    public final String m() {
        return this.tag;
    }
}

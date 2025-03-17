package yd;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lyd/e;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "HOME_ORGANISATION", "LIGHTING", "DINNERWARE_AND_SERVING", "DECORATION", "BATH", "RUGS", "HOME_TEXTILE", "BED_TEXTILE", "LIVING_ROOM", "DINING", "KITCHEN", "WORKSPACES", "BEDROOM", "CHILDREN", "GLASSHOUSE", "LIVING_ROOM_STORAGE", "SWEDISH_FOOD_MARKET", "DIV_SELF_SERVE", "DIV_MARKETHALL", "DIV_SHOWROOM", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.e  reason: case insensitive filesystem */
public enum C10451e {
    HOME_ORGANISATION("DEPT_001"),
    LIGHTING("DEPT_002"),
    DINNERWARE_AND_SERVING("DEPT_003"),
    DECORATION("DEPT_004"),
    BATH("DEPT_005"),
    RUGS("DEPT_006"),
    HOME_TEXTILE("DEPT_007"),
    BED_TEXTILE("DEPT_008"),
    LIVING_ROOM("DEPT_009"),
    DINING("DEPT_010"),
    KITCHEN("DEPT_011"),
    WORKSPACES("DEPT_012"),
    BEDROOM("DEPT_013"),
    CHILDREN("DEPT_014"),
    GLASSHOUSE("DEPT_015"),
    LIVING_ROOM_STORAGE("DEPT_016"),
    SWEDISH_FOOD_MARKET("DEPT_017"),
    DIV_SELF_SERVE("DIV_SELF_SERVE"),
    DIV_MARKETHALL("DIV_MARKETHALL"),
    DIV_SHOWROOM("DIV_SHOWROOM");
    
    private final String value;

    static {
        C10451e[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C10451e(String str) {
        this.value = str;
    }

    public final String b() {
        return this.value;
    }
}

package yd;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lyd/k;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "POINTS_OF_INTEREST", "POINTS_OF_INTEREST_POINT_IMPORTANT", "DEPARTMENTS", "DEPARTMENTS_POINT", "DEPARTMENTS_SELECTED", "POINTS_OF_INTEREST_SELECTED", "CONNECTORS", "CONNECTORS_SELECTED", "DIVISIONS", "DIVISIONS_POINT", "DIVISIONS_SELECTED", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.k  reason: case insensitive filesystem */
public enum C10457k {
    POINTS_OF_INTEREST("points-of-interest"),
    POINTS_OF_INTEREST_POINT_IMPORTANT("points-of-interest_point_important"),
    DEPARTMENTS("departments"),
    DEPARTMENTS_POINT("departments-point"),
    DEPARTMENTS_SELECTED("departments_selected"),
    POINTS_OF_INTEREST_SELECTED("points-of-interest_selected"),
    CONNECTORS("connectors"),
    CONNECTORS_SELECTED("connectors_selected"),
    DIVISIONS("divisions"),
    DIVISIONS_POINT("divisions-point"),
    DIVISIONS_SELECTED("divisions_selected");
    
    private final String value;

    static {
        C10457k[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C10457k(String str) {
        this.value = str;
    }

    public static C17220a<C10457k> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.value;
    }
}

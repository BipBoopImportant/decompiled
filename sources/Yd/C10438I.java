package yd;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\"\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lyd/I;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SHADOW_FLOOR_OUTLINE", "FLOOR_OUTLINE", "EXTERNAL_WALLS", "INTERNAL_WALLS", "INTERNAL_STRUCTURE", "WALKING_PATH", "SHORTCUTS", "SHELVES", "DECORATORS", "POINTS_OF_INTEREST", "POINTS_OF_INTEREST_SELECTED", "DIVISIONS", "DIVISIONS_SELECTED", "DEPARTMENTS", "DEPARTMENTS_POINT_SELECTED", "DEPARTMENTS_SELECTED", "SUB_DEPARTMENTS", "ROUTING_PATH", "ROUTING_CONNECTOR", "ACTIVE_ROUTE", "CHRISTMAS_ROUTE", "KIOSKS", "ROOM_SETTINGS", "GRID", "OPEN_TO_BELOW", "CONNECTORS", "CONNECTORS_SELECTED", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.I  reason: case insensitive filesystem */
public enum C10438I {
    SHADOW_FLOOR_OUTLINE("shadow-floor-outline"),
    FLOOR_OUTLINE("floor-outline"),
    EXTERNAL_WALLS("external-walls"),
    INTERNAL_WALLS("internal-walls"),
    INTERNAL_STRUCTURE("INTERNAL_STRUCTURE"),
    WALKING_PATH("walking-path"),
    SHORTCUTS("shortcuts"),
    SHELVES("shelves"),
    DECORATORS("decorators"),
    POINTS_OF_INTEREST("points-of-interest"),
    POINTS_OF_INTEREST_SELECTED("points-of-interest_selected"),
    DIVISIONS("divisions"),
    DIVISIONS_SELECTED("divisions_selected"),
    DEPARTMENTS("departments"),
    DEPARTMENTS_POINT_SELECTED("departments-point_selected"),
    DEPARTMENTS_SELECTED("departments_selected"),
    SUB_DEPARTMENTS("sub-departments"),
    ROUTING_PATH("routing-path"),
    ROUTING_CONNECTOR("routing-connector"),
    ACTIVE_ROUTE("active-route"),
    CHRISTMAS_ROUTE("christmas-route"),
    KIOSKS("kiosks"),
    ROOM_SETTINGS("room-settings"),
    GRID("grid"),
    OPEN_TO_BELOW("open-to-below"),
    CONNECTORS("connectors"),
    CONNECTORS_SELECTED("connectors_selected");
    
    private final String value;

    static {
        C10438I[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C10438I(String str) {
        this.value = str;
    }

    public final String b() {
        return this.value;
    }
}

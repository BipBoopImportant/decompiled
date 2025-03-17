package gJ;

import DI.C15554a;
import DI.C15558e;

/* renamed from: gJ.j  reason: case insensitive filesystem */
public interface C17279j {

    /* renamed from: gJ.j$a */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: gJ.j$b */
    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    a a();

    b b(C15554a aVar, C15554a aVar2, C15558e eVar);
}

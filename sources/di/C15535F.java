package DI;

import fI.C17221b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: DI.F  reason: case insensitive filesystem */
public enum C15535F {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final a Companion = null;

    /* renamed from: DI.F$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15535F a(boolean z10, boolean z11, boolean z12) {
            return z10 ? C15535F.SEALED : z11 ? C15535F.ABSTRACT : z12 ? C15535F.OPEN : C15535F.FINAL;
        }

        private a() {
        }
    }

    static {
        C15535F[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }
}

package MI;

import fI.C17221b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: MI.O  reason: case insensitive filesystem */
public enum C16054O {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final a Companion = null;
    private final String description;

    /* renamed from: MI.O$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C16054O[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private C16054O(String str) {
        this.description = str;
    }

    public final String b() {
        return this.description;
    }

    public final boolean j() {
        return this == IGNORE;
    }

    public final boolean m() {
        return this == WARN;
    }
}

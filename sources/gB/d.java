package GB;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17970f;
import tI.C17978n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LGB/d;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NotBusy", "LittleBusy", "Busy", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    NotBusy,
    LittleBusy,
    Busy;
    
    public static final a Companion = null;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LGB/d$a;", "", "<init>", "()V", "", "value", "LGB/d;", "a", "(F)LGB/d;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(float f10) {
            C17970f<Float> c10 = C17978n.c(0.0f, 33.0f);
            C17970f<Float> c11 = C17978n.c(33.0f, 66.0f);
            float floatValue = ((Number) C17978n.q(Float.valueOf(f10), C17978n.c(0.0f, 100.0f))).floatValue();
            return c10.b(Float.valueOf(floatValue)) ? d.NotBusy : c11.b(Float.valueOf(floatValue)) ? d.LittleBusy : d.Busy;
        }

        private a() {
        }
    }

    static {
        d[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }
}

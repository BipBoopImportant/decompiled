package p1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0001\u0003\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lp1/E0;", "", "", "value", "c", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class E0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27183a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f27184b = c(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f27185c = c(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f27186d = c(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f27187e = c(3);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lp1/E0$a;", "", "<init>", "()V", "Lp1/E0;", "None", "I", "b", "()I", "Low", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return E0.f27185c;
        }

        public final int b() {
            return E0.f27184b;
        }

        private a() {
        }
    }

    public static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return d(i10, f27184b) ? "None" : d(i10, f27185c) ? "Low" : d(i10, f27186d) ? "Medium" : d(i10, f27187e) ? "High" : "Unknown";
    }
}

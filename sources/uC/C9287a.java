package Uc;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LUc/a;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "Companion", "a", "UNKNOWN", "NO_MOVEMENT_YET", "GESTURE", "API_ANIMATION", "DEVELOPER_ANIMATION", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.a  reason: case insensitive filesystem */
public enum C9287a {
    UNKNOWN(-2),
    NO_MOVEMENT_YET(-1),
    GESTURE(1),
    API_ANIMATION(2),
    DEVELOPER_ANIMATION(3);
    
    public static final C1118a Companion = null;
    private final int value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUc/a$a;", "", "<init>", "()V", "", "value", "LUc/a;", "a", "(I)LUc/a;", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.a$a  reason: collision with other inner class name */
    public static final class C1118a {
        public /* synthetic */ C1118a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C9287a a(int i10) {
            C9287a aVar;
            C9287a[] values = C9287a.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i11];
                if (aVar.b() == i10) {
                    break;
                }
                i11++;
            }
            return aVar == null ? C9287a.UNKNOWN : aVar;
        }

        private C1118a() {
        }
    }

    static {
        C9287a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C1118a((DefaultConstructorMarker) null);
    }

    private C9287a(int i10) {
        this.value = i10;
    }

    public final int b() {
        return this.value;
    }
}

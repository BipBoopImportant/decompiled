package q7;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lq7/f;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "I", "d", "()I", "Companion", "a", "V1", "UNKNOWN_VERSION", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q7.f  reason: case insensitive filesystem */
public enum C8684f {
    V1(0),
    UNKNOWN_VERSION(256);
    
    public static final a Companion = null;
    private final int number;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq7/f$a;", "", "<init>", "()V", "", "number", "Lq7/f;", "a", "(I)Lq7/f;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: q7.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8684f a(int i10) {
            C8684f fVar;
            C8684f[] values = C8684f.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    fVar = null;
                    break;
                }
                fVar = values[i11];
                if (fVar.d() == i10) {
                    break;
                }
                i11++;
            }
            return fVar == null ? C8684f.UNKNOWN_VERSION : fVar;
        }

        private a() {
        }
    }

    static {
        C8684f[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private C8684f(int i10) {
        this.number = i10;
    }

    public final int d() {
        return this.number;
    }
}

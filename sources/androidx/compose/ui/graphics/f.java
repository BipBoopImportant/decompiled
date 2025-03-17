package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;
import p1.p1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\u0001\u0003\u0001\u00020\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/f;", "", "", "packedValue", "c", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "", "f", "(J)F", "pivotFractionX", "g", "pivotFractionY", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18947b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f18948c = p1.a(0.5f, 0.5f);

    /* renamed from: a  reason: collision with root package name */
    private final long f18949a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/f;", "Center", "J", "a", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return f.f18948c;
        }

        private a() {
        }
    }

    private /* synthetic */ f(long j10) {
        this.f18949a = j10;
    }

    public static final /* synthetic */ f b(long j10) {
        return new f(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f18949a, obj);
    }

    public int hashCode() {
        return h(this.f18949a);
    }

    public final /* synthetic */ long j() {
        return this.f18949a;
    }

    public String toString() {
        return i(this.f18949a);
    }
}

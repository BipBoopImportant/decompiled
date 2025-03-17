package c2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@C17604b
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015\u0001\u0003\u0001\u00020\u0002\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lc2/h;", "", "", "value", "B", "(F)F", "other", "", "v", "(FF)I", "", "F", "(F)Ljava/lang/String;", "E", "(F)I", "", "", "C", "(FLjava/lang/Object;)Z", "a", "getValue", "()F", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements Comparable<h> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f23031b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f23032c = B(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f23033d = B(Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final float f23034e = B(Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final float f23035a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lc2/h$a;", "", "<init>", "()V", "Lc2/h;", "Hairline", "F", "a", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "b", "getInfinity-D9Ej5fM$annotations", "Unspecified", "c", "getUnspecified-D9Ej5fM$annotations", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return h.f23032c;
        }

        public final float b() {
            return h.f23033d;
        }

        public final float c() {
            return h.f23034e;
        }

        private a() {
        }
    }

    private /* synthetic */ h(float f10) {
        this.f23035a = f10;
    }

    public static float B(float f10) {
        return f10;
    }

    public static boolean C(float f10, Object obj) {
        return (obj instanceof h) && Float.compare(f10, ((h) obj).G()) == 0;
    }

    public static final boolean D(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int E(float f10) {
        return Float.hashCode(f10);
    }

    public static String F(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    public static final /* synthetic */ h m(float f10) {
        return new h(f10);
    }

    public static int v(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public final /* synthetic */ float G() {
        return this.f23035a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return n(((h) obj).G());
    }

    public boolean equals(Object obj) {
        return C(this.f23035a, obj);
    }

    public int hashCode() {
        return E(this.f23035a);
    }

    public int n(float f10) {
        return v(this.f23035a, f10);
    }

    public String toString() {
        return F(this.f23035a);
    }
}

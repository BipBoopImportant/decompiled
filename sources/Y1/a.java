package Y1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0001\u0003\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"LY1/a;", "", "", "multiplier", "e", "(F)F", "", "i", "(F)Ljava/lang/String;", "", "h", "(F)I", "other", "", "f", "(FLjava/lang/Object;)Z", "a", "F", "getMultiplier", "()F", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0213a f14735b = new C0213a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f14736c = e(0.5f);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f14737d = e(-0.5f);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final float f14738e = e(0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f14739a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LY1/a$a;", "", "<init>", "()V", "LY1/a;", "Superscript", "F", "c", "()F", "getSuperscript-y9eOQZs$annotations", "Subscript", "b", "getSubscript-y9eOQZs$annotations", "None", "a", "getNone-y9eOQZs$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Y1.a$a  reason: collision with other inner class name */
    public static final class C0213a {
        public /* synthetic */ C0213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return a.f14738e;
        }

        public final float b() {
            return a.f14737d;
        }

        public final float c() {
            return a.f14736c;
        }

        private C0213a() {
        }
    }

    private /* synthetic */ a(float f10) {
        this.f14739a = f10;
    }

    public static final /* synthetic */ a d(float f10) {
        return new a(f10);
    }

    public static float e(float f10) {
        return f10;
    }

    public static boolean f(float f10, Object obj) {
        return (obj instanceof a) && Float.compare(f10, ((a) obj).j()) == 0;
    }

    public static final boolean g(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int h(float f10) {
        return Float.hashCode(f10);
    }

    public static String i(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f14739a, obj);
    }

    public int hashCode() {
        return h(this.f14739a);
    }

    public final /* synthetic */ float j() {
        return this.f14739a;
    }

    public String toString() {
        return i(this.f14739a);
    }
}

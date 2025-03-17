package e5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Le5/a;", "", "", "rawValue", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "b", "window-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e5.a  reason: case insensitive filesystem */
public final class C7785a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0833a f50834b = new C0833a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C7785a f50835c = new C7785a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final C7785a f50836d = new C7785a(1);

    /* renamed from: e  reason: collision with root package name */
    public static final C7785a f50837e = new C7785a(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f50838a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Le5/a$a;", "", "<init>", "()V", "", "dpHeight", "Le5/a;", "a", "(F)Le5/a;", "COMPACT", "Le5/a;", "EXPANDED", "MEDIUM", "window-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e5.a$a  reason: collision with other inner class name */
    public static final class C0833a {
        public /* synthetic */ C0833a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7785a a(float f10) {
            if (f10 >= 0.0f) {
                return f10 < 480.0f ? C7785a.f50835c : f10 < 900.0f ? C7785a.f50836d : C7785a.f50837e;
            }
            throw new IllegalArgumentException(("Height must be positive, received " + f10).toString());
        }

        private C0833a() {
        }
    }

    private C7785a(int i10) {
        this.f50838a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7785a.class == obj.getClass()) {
            return this.f50838a == ((C7785a) obj).f50838a;
        }
        return false;
    }

    public int hashCode() {
        return this.f50838a;
    }

    public String toString() {
        String str = C17542s.e(this, f50835c) ? "COMPACT" : C17542s.e(this, f50836d) ? "MEDIUM" : C17542s.e(this, f50837e) ? "EXPANDED" : "UNKNOWN";
        return "WindowHeightSizeClass: " + str;
    }
}

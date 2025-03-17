package e5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Le5/c;", "", "", "rawValue", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "b", "window-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e5.c  reason: case insensitive filesystem */
public final class C7787c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50842b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C7787c f50843c = new C7787c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final C7787c f50844d = new C7787c(1);

    /* renamed from: e  reason: collision with root package name */
    public static final C7787c f50845e = new C7787c(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f50846a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Le5/c$a;", "", "<init>", "()V", "", "dpWidth", "Le5/c;", "a", "(F)Le5/c;", "COMPACT", "Le5/c;", "EXPANDED", "MEDIUM", "window-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7787c a(float f10) {
            if (f10 >= 0.0f) {
                return f10 < 600.0f ? C7787c.f50843c : f10 < 840.0f ? C7787c.f50844d : C7787c.f50845e;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + f10).toString());
        }

        private a() {
        }
    }

    private C7787c(int i10) {
        this.f50846a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7787c.class == obj.getClass()) {
            return this.f50846a == ((C7787c) obj).f50846a;
        }
        return false;
    }

    public int hashCode() {
        return this.f50846a;
    }

    public String toString() {
        String str = C17542s.e(this, f50843c) ? "COMPACT" : C17542s.e(this, f50844d) ? "MEDIUM" : C17542s.e(this, f50845e) ? "EXPANDED" : "UNKNOWN";
        return "WindowWidthSizeClass: " + str;
    }
}

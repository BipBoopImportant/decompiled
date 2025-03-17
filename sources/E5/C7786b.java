package e5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Le5/b;", "", "Le5/c;", "windowWidthSizeClass", "Le5/a;", "windowHeightSizeClass", "<init>", "(Le5/c;Le5/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Le5/c;", "b", "()Le5/c;", "Le5/a;", "()Le5/a;", "c", "window-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e5.b  reason: case insensitive filesystem */
public final class C7786b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f50839c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C7787c f50840a;

    /* renamed from: b  reason: collision with root package name */
    private final C7785a f50841b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le5/b$a;", "", "<init>", "()V", "", "dpWidth", "dpHeight", "Le5/b;", "a", "(FF)Le5/b;", "window-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e5.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7786b a(float f10, float f11) {
            return new C7786b(C7787c.f50842b.a(f10), C7785a.f50834b.a(f11), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C7786b(C7787c cVar, C7785a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar);
    }

    public final C7785a a() {
        return this.f50841b;
    }

    public final C7787c b() {
        return this.f50840a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C7786b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass");
        C7786b bVar = (C7786b) obj;
        return C17542s.e(this.f50840a, bVar.f50840a) && C17542s.e(this.f50841b, bVar.f50841b);
    }

    public int hashCode() {
        return (this.f50840a.hashCode() * 31) + this.f50841b.hashCode();
    }

    public String toString() {
        return "WindowSizeClass {windowWidthSizeClass=" + this.f50840a + ", windowHeightSizeClass=" + this.f50841b + " }";
    }

    private C7786b(C7787c cVar, C7785a aVar) {
        this.f50840a = cVar;
        this.f50841b = aVar;
    }
}

package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lm0/Z;", "T", "", "value", "Lm0/D;", "easing", "<init>", "(Ljava/lang/Object;Lm0/D;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lm0/D;", "()Lm0/D;", "c", "(Lm0/D;)V", "Lm0/a0$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Z<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f25671a;

    /* renamed from: b  reason: collision with root package name */
    private C5525D f25672b;

    public /* synthetic */ Z(Object obj, C5525D d10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, d10);
    }

    public final C5525D a() {
        return this.f25672b;
    }

    public final T b() {
        return this.f25671a;
    }

    public final void c(C5525D d10) {
        this.f25672b = d10;
    }

    private Z(T t10, C5525D d10) {
        this.f25671a = t10;
        this.f25672b = d10;
    }
}

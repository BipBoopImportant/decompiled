package H2;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"LH2/g;", "", "T", "LH2/f;", "", "maxPoolSize", "<init>", "(I)V", "instance", "", "c", "(Ljava/lang/Object;)Z", "b", "()Ljava/lang/Object;", "a", "", "[Ljava/lang/Object;", "pool", "I", "poolSize", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f7064a;

    /* renamed from: b  reason: collision with root package name */
    private int f7065b;

    public g(int i10) {
        if (i10 > 0) {
            this.f7064a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private final boolean c(T t10) {
        int i10 = this.f7065b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7064a[i11] == t10) {
                return true;
            }
        }
        return false;
    }

    public boolean a(T t10) {
        C17542s.j(t10, "instance");
        if (!c(t10)) {
            int i10 = this.f7065b;
            Object[] objArr = this.f7064a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f7065b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T b() {
        int i10 = this.f7065b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T t10 = this.f7064a[i11];
        C17542s.h(t10, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f7064a[i11] = null;
        this.f7065b--;
        return t10;
    }
}

package Z5;

import T5.n;
import X5.C6721f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"LZ5/l;", "LZ5/i;", "LT5/n;", "image", "", "isSampled", "LX5/f;", "dataSource", "<init>", "(LT5/n;ZLX5/f;)V", "a", "LT5/n;", "b", "()LT5/n;", "Z", "c", "()Z", "LX5/f;", "()LX5/f;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements i {

    /* renamed from: a  reason: collision with root package name */
    private final n f41387a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41388b;

    /* renamed from: c  reason: collision with root package name */
    private final C6721f f41389c;

    public l(n nVar, boolean z10, C6721f fVar) {
        this.f41387a = nVar;
        this.f41388b = z10;
        this.f41389c = fVar;
    }

    public final C6721f a() {
        return this.f41389c;
    }

    public final n b() {
        return this.f41387a;
    }

    public final boolean c() {
        return this.f41388b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f41387a, lVar.f41387a) && this.f41388b == lVar.f41388b && this.f41389c == lVar.f41389c;
    }

    public int hashCode() {
        return (((this.f41387a.hashCode() * 31) + Boolean.hashCode(this.f41388b)) * 31) + this.f41389c.hashCode();
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.f41387a + ", isSampled=" + this.f41388b + ", dataSource=" + this.f41389c + ')';
    }
}

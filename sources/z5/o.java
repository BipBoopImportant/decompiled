package Z5;

import X5.C6721f;
import X5.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"LZ5/o;", "LZ5/i;", "LX5/s;", "source", "", "mimeType", "LX5/f;", "dataSource", "<init>", "(LX5/s;Ljava/lang/String;LX5/f;)V", "a", "LX5/s;", "c", "()LX5/s;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "LX5/f;", "()LX5/f;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    private final s f41394a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41395b;

    /* renamed from: c  reason: collision with root package name */
    private final C6721f f41396c;

    public o(s sVar, String str, C6721f fVar) {
        this.f41394a = sVar;
        this.f41395b = str;
        this.f41396c = fVar;
    }

    public final C6721f a() {
        return this.f41396c;
    }

    public final String b() {
        return this.f41395b;
    }

    public final s c() {
        return this.f41394a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f41394a, oVar.f41394a) && C17542s.e(this.f41395b, oVar.f41395b) && this.f41396c == oVar.f41396c;
    }

    public int hashCode() {
        int hashCode = this.f41394a.hashCode() * 31;
        String str = this.f41395b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f41396c.hashCode();
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.f41394a + ", mimeType=" + this.f41395b + ", dataSource=" + this.f41396c + ')';
    }
}

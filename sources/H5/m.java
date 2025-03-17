package H5;

import E5.e;
import E5.o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001c"}, d2 = {"LH5/m;", "LH5/h;", "LE5/o;", "source", "", "mimeType", "LE5/e;", "dataSource", "<init>", "(LE5/o;Ljava/lang/String;LE5/e;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LE5/o;", "b", "()LE5/o;", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "c", "LE5/e;", "()LE5/e;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends h {

    /* renamed from: a  reason: collision with root package name */
    private final o f36440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36441b;

    /* renamed from: c  reason: collision with root package name */
    private final e f36442c;

    public m(o oVar, String str, e eVar) {
        super((DefaultConstructorMarker) null);
        this.f36440a = oVar;
        this.f36441b = str;
        this.f36442c = eVar;
    }

    public final e a() {
        return this.f36442c;
    }

    public final o b() {
        return this.f36440a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return C17542s.e(this.f36440a, mVar.f36440a) && C17542s.e(this.f36441b, mVar.f36441b) && this.f36442c == mVar.f36442c;
        }
    }

    public int hashCode() {
        int hashCode = this.f36440a.hashCode() * 31;
        String str = this.f36441b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f36442c.hashCode();
    }
}

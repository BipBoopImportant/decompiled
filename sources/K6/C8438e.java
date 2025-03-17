package k6;

import T5.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk6/e;", "Lk6/l;", "LT5/n;", "image", "Lk6/h;", "request", "", "throwable", "<init>", "(LT5/n;Lk6/h;Ljava/lang/Throwable;)V", "a", "LT5/n;", "k", "()LT5/n;", "b", "Lk6/h;", "()Lk6/h;", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.e  reason: case insensitive filesystem */
public final class C8438e implements C8445l {

    /* renamed from: a  reason: collision with root package name */
    private final n f54151a;

    /* renamed from: b  reason: collision with root package name */
    private final C8441h f54152b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f54153c;

    public C8438e(n nVar, C8441h hVar, Throwable th2) {
        this.f54151a = nVar;
        this.f54152b = hVar;
        this.f54153c = th2;
    }

    public final Throwable a() {
        return this.f54153c;
    }

    public C8441h b() {
        return this.f54152b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8438e)) {
            return false;
        }
        C8438e eVar = (C8438e) obj;
        return C17542s.e(this.f54151a, eVar.f54151a) && C17542s.e(this.f54152b, eVar.f54152b) && C17542s.e(this.f54153c, eVar.f54153c);
    }

    public int hashCode() {
        n nVar = this.f54151a;
        return ((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f54152b.hashCode()) * 31) + this.f54153c.hashCode();
    }

    public n k() {
        return this.f54151a;
    }

    public String toString() {
        return "ErrorResult(image=" + this.f54151a + ", request=" + this.f54152b + ", throwable=" + this.f54153c + ')';
    }
}

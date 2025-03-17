package YJ;

import QJ.M;
import WJ.C16751l;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LYJ/c;", "LYJ/f;", "<init>", "()V", "", "parallelism", "", "name", "LQJ/M;", "N0", "(ILjava/lang/String;)LQJ/M;", "LXH/N;", "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YJ.c  reason: case insensitive filesystem */
public final class C16887c extends C16890f {

    /* renamed from: h  reason: collision with root package name */
    public static final C16887c f140512h = new C16887c();

    private C16887c() {
        super(j.f140524c, j.f140525d, j.f140526e, j.f140522a);
    }

    public M N0(int i10, String str) {
        C16751l.a(i10);
        return i10 >= j.f140524c ? C16751l.b(this, str) : super.N0(i10, str);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}

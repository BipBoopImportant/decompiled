package jK;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H ¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058 X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LjK/M0;", "Array", "", "<init>", "()V", "", "requiredCapacity", "LXH/N;", "b", "(I)V", "a", "()Ljava/lang/Object;", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class M0<Array> {
    public static /* synthetic */ void c(M0 m02, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = m02.d() + 1;
            }
            m02.b(i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    public abstract Array a();

    public abstract void b(int i10);

    public abstract int d();
}

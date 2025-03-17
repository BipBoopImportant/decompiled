package QJ;

import WJ.C16751l;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LQJ/P0;", "LQJ/M;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "N0", "(ILjava/lang/String;)LQJ/M;", "Q0", "P0", "()LQJ/P0;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class P0 extends M {
    public M N0(int i10, String str) {
        C16751l.a(i10);
        return C16751l.b(this, str);
    }

    public abstract P0 P0();

    /* access modifiers changed from: protected */
    public final String Q0() {
        P0 p02;
        P0 c10 = C16311i0.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            p02 = c10.P0();
        } catch (UnsupportedOperationException unused) {
            p02 = null;
        }
        if (this == p02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String Q02 = Q0();
        if (Q02 != null) {
            return Q02;
        }
        return V.a(this) + '@' + V.b(this);
    }
}

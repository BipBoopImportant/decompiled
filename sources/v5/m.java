package V5;

import k6.C8441h;
import k6.C8444k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk6/h;", "request", "LXH/N;", "a", "(Lk6/h;)V", "coil-compose-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    public static final void a(C8441h hVar) {
        if (hVar.y() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        } else if (C8444k.n(hVar) != null) {
            throw new IllegalArgumentException("request.lifecycle must be null.");
        }
    }
}

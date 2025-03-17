package H9;

import G9.C6521b;
import K9.C6619q;

final class K {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6528b f36511a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6521b f36512b;

    /* synthetic */ K(C6528b bVar, C6521b bVar2, J j10) {
        this.f36511a = bVar;
        this.f36512b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof K)) {
            K k10 = (K) obj;
            return C6619q.b(this.f36511a, k10.f36511a) && C6619q.b(this.f36512b, k10.f36512b);
        }
    }

    public final int hashCode() {
        return C6619q.c(this.f36511a, this.f36512b);
    }

    public final String toString() {
        return C6619q.d(this).a("key", this.f36511a).a("feature", this.f36512b).toString();
    }
}

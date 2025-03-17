package a9;

import XH.C16807N;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

public final class L4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f42128a;

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f42129b;

    public L4(int i10, C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onClick");
        this.f42128a = i10;
        this.f42129b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L4)) {
            return false;
        }
        L4 l42 = (L4) obj;
        return this.f42128a == l42.f42128a && C17542s.e(this.f42129b, l42.f42129b);
    }

    public final int hashCode() {
        return this.f42129b.hashCode() + (Integer.hashCode(this.f42128a) * 31);
    }

    public final String toString() {
        return "ButtonConfig(stringRes=" + this.f42128a + ", onClick=" + this.f42129b + ')';
    }
}

package a9;

import G8.t;
import kotlin.jvm.internal.C17542s;

public final class L6 {

    /* renamed from: a  reason: collision with root package name */
    public final C6985z4 f42131a;

    /* renamed from: b  reason: collision with root package name */
    public final t f42132b;

    /* renamed from: c  reason: collision with root package name */
    public a f42133c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f42134a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f42135b = false;

        public a(long j10) {
            this.f42134a = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42134a == aVar.f42134a && this.f42135b == aVar.f42135b;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f42134a) * 31;
            boolean z10 = this.f42135b;
            if (z10) {
                z10 = true;
            }
            return hashCode + (z10 ? 1 : 0);
        }

        public final String toString() {
            return "AnimationState(startedAt=" + this.f42134a + ", hasTelemetryBeenSent=" + this.f42135b + ')';
        }
    }

    public L6(C6985z4 z4Var, t tVar) {
        C17542s.j(z4Var, "srQuickLink");
        C17542s.j(tVar, "systemInstantiable");
        this.f42131a = z4Var;
        this.f42132b = tVar;
    }
}

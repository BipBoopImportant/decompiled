package Nt;

import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LNt/a;", "", "LTJ/g;", "LNt/a$a;", "invoke", "()LTJ/g;", "a", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LNt/a$a;", "", "LMt/a;", "beverageBenefitUiModel", "<init>", "(LMt/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMt/a;", "()LMt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nt.a$a  reason: collision with other inner class name */
    public static final class C1716a {

        /* renamed from: a  reason: collision with root package name */
        private final Mt.a f84264a;

        public C1716a(Mt.a aVar) {
            C17542s.j(aVar, "beverageBenefitUiModel");
            this.f84264a = aVar;
        }

        public final Mt.a a() {
            return this.f84264a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1716a) && C17542s.e(this.f84264a, ((C1716a) obj).f84264a);
        }

        public int hashCode() {
            return this.f84264a.hashCode();
        }

        public String toString() {
            Mt.a aVar = this.f84264a;
            return "StoreBenefitsResult(beverageBenefitUiModel=" + aVar + ")";
        }
    }

    C16532g<C1716a> invoke();
}

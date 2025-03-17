package qg;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lqg/z;", "", "<init>", "()V", "b", "a", "Lqg/z$a;", "Lqg/z$b;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqg/z$a;", "Lqg/z;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends z {

        /* renamed from: b  reason: collision with root package name */
        public static final int f76232b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f76233a;

        public a(C13023e eVar) {
            super((DefaultConstructorMarker) null);
            this.f76233a = eVar;
        }

        public final C13023e a() {
            return this.f76233a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f76233a, ((a) obj).f76233a);
        }

        public int hashCode() {
            C13023e eVar = this.f76233a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f76233a;
            return "Failure(message=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqg/z$b;", "Lqg/z;", "<init>", "()V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends z {

        /* renamed from: a  reason: collision with root package name */
        public static final b f76234a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private z() {
    }
}

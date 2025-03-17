package M6;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\b\t¨\u0006\n"}, d2 = {"LM6/y;", "V", "", "<init>", "()V", "a", "b", "c", "LM6/y$a;", "LM6/y$c;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class y<V> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f38615a = new b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LM6/y$a;", "LM6/y;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends y {

        /* renamed from: b  reason: collision with root package name */
        public static final a f38616b = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0001\u0010\u0004*\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LM6/y$b;", "", "<init>", "()V", "V", "value", "LM6/y;", "a", "(Ljava/lang/Object;)LM6/y;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <V> y<V> a(V v10) {
            return v10 == null ? a.f38616b : new c(v10);
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LM6/y$c;", "V", "LM6/y;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c<V> extends y<V> {

        /* renamed from: b  reason: collision with root package name */
        private final V f38617b;

        public c(V v10) {
            super((DefaultConstructorMarker) null);
            this.f38617b = v10;
        }

        public final V a() {
            return this.f38617b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f38617b, ((c) obj).f38617b);
        }

        public int hashCode() {
            V v10 = this.f38617b;
            if (v10 == null) {
                return 0;
            }
            return v10.hashCode();
        }

        public String toString() {
            return "Present(value=" + this.f38617b + ')';
        }
    }

    public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private y() {
    }
}

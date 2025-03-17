package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrz/f;", "", "<init>", "()V", "b", "a", "Lrz/f$a;", "Lrz/f$b;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.f  reason: case insensitive filesystem */
public abstract class C15013f {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrz/f$a;", "Lrz/f;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.f$a */
    public static final class a extends C15013f {

        /* renamed from: a  reason: collision with root package name */
        private final String f130836a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f130836a = str;
        }

        public final String a() {
            return this.f130836a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f130836a, ((a) obj).f130836a);
        }

        public int hashCode() {
            return this.f130836a.hashCode();
        }

        public String toString() {
            String str = this.f130836a;
            return "Available(text=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/f$b;", "Lrz/f;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.f$b */
    public static final class b extends C15013f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f130837a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C15013f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C15013f() {
    }
}

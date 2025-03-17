package kD;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LkD/f;", "", "LkD/f$a;", "type", "", "number", "<init>", "(LkD/f$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LkD/f$a;", "b", "()LkD/f$a;", "Ljava/lang/String;", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f128626a;

    /* renamed from: b  reason: collision with root package name */
    private final String f128627b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000b¨\u0006\f"}, d2 = {"LkD/f$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "FAMILY", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        FAMILY("FAMILY");
        
        public static final C3172a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LkD/f$a$a;", "", "<init>", "()V", "", "rawValue", "LkD/f$a;", "a", "(Ljava/lang/String;)LkD/f$a;", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kD.f$a$a  reason: collision with other inner class name */
        public static final class C3172a {
            public /* synthetic */ C3172a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                T t10;
                Iterator<T> it = a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((a) t10).j(), str)) {
                        break;
                    }
                }
                return (a) t10;
            }

            private C3172a() {
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C3172a((DefaultConstructorMarker) null);
        }

        private a(String str) {
            this.value = str;
        }

        public static C17220a<a> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    public f(a aVar, String str) {
        C17542s.j(aVar, "type");
        C17542s.j(str, "number");
        this.f128626a = aVar;
        this.f128627b = str;
    }

    public final String a() {
        return this.f128627b;
    }

    public final a b() {
        return this.f128626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f128626a == fVar.f128626a && C17542s.e(this.f128627b, fVar.f128627b);
    }

    public int hashCode() {
        return (this.f128626a.hashCode() * 31) + this.f128627b.hashCode();
    }

    public String toString() {
        a aVar = this.f128626a;
        String str = this.f128627b;
        return "LoyaltyCard(type=" + aVar + ", number=" + str + ")";
    }
}

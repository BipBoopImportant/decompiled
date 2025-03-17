package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrz/d;", "", "<init>", "()V", "a", "b", "Lrz/d$a;", "Lrz/d$b;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.d  reason: case insensitive filesystem */
public abstract class C15011d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/d$a;", "Lrz/d;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.d$a */
    public static final class a extends C15011d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f130831a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lrz/d$b;", "Lrz/d;", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getDescription", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.d$b */
    public static final class b extends C15011d {

        /* renamed from: a  reason: collision with root package name */
        private final String f130832a;

        /* renamed from: b  reason: collision with root package name */
        private final String f130833b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            C17542s.j(str2, "description");
            this.f130832a = str;
            this.f130833b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f130832a, bVar.f130832a) && C17542s.e(this.f130833b, bVar.f130833b);
        }

        public int hashCode() {
            return (this.f130832a.hashCode() * 31) + this.f130833b.hashCode();
        }

        public String toString() {
            String str = this.f130832a;
            String str2 = this.f130833b;
            return "Show(title=" + str + ", description=" + str2 + ")";
        }
    }

    public /* synthetic */ C15011d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C15011d() {
    }
}

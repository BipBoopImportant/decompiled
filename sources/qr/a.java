package Qr;

import TJ.C16532g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LQr/a;", "", "LTJ/g;", "", "LQr/a$a;", "invoke", "()LTJ/g;", "a", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LQr/a$a;", "", "", "roomName", "destinationDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qr.a$a  reason: collision with other inner class name */
    public static final class C1771a {

        /* renamed from: a  reason: collision with root package name */
        private final String f86216a;

        /* renamed from: b  reason: collision with root package name */
        private final String f86217b;

        public C1771a(String str, String str2) {
            C17542s.j(str2, "destinationDeeplink");
            this.f86216a = str;
            this.f86217b = str2;
        }

        public final String a() {
            return this.f86217b;
        }

        public final String b() {
            return this.f86216a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1771a)) {
                return false;
            }
            C1771a aVar = (C1771a) obj;
            return C17542s.e(this.f86216a, aVar.f86216a) && C17542s.e(this.f86217b, aVar.f86217b);
        }

        public int hashCode() {
            String str = this.f86216a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f86217b.hashCode();
        }

        public String toString() {
            String str = this.f86216a;
            String str2 = this.f86217b;
            return "Action(roomName=" + str + ", destinationDeeplink=" + str2 + ")";
        }
    }

    C16532g<List<C1771a>> invoke();
}

package kA;

import fI.C17221b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"LkA/h;", "", "LkA/h$a;", "a", "()LkA/h$a;", "authConfig", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kA.h  reason: case insensitive filesystem */
public interface C14667h {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LkA/h$a;", "", "", "tenant", "applicationId", "", "parameters", "LkA/h$a$a;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LkA/h$a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "LkA/h$a$a;", "getType", "()LkA/h$a$a;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kA.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f128577a;

        /* renamed from: b  reason: collision with root package name */
        private final String f128578b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, String> f128579c;

        /* renamed from: d  reason: collision with root package name */
        private final C3170a f128580d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LkA/h$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "SIGN_UP", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kA.h$a$a  reason: collision with other inner class name */
        public enum C3170a {
            LOGIN,
            SIGN_UP;

            static {
                C3170a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        public a(String str, String str2, Map<String, String> map, C3170a aVar) {
            C17542s.j(str, "tenant");
            C17542s.j(str2, "applicationId");
            C17542s.j(map, "parameters");
            C17542s.j(aVar, "type");
            this.f128577a = str;
            this.f128578b = str2;
            this.f128579c = map;
            this.f128580d = aVar;
        }

        public final String a() {
            return this.f128578b;
        }

        public final Map<String, String> b() {
            return this.f128579c;
        }

        public final String c() {
            return this.f128577a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f128577a, aVar.f128577a) && C17542s.e(this.f128578b, aVar.f128578b) && C17542s.e(this.f128579c, aVar.f128579c) && this.f128580d == aVar.f128580d;
        }

        public int hashCode() {
            return (((((this.f128577a.hashCode() * 31) + this.f128578b.hashCode()) * 31) + this.f128579c.hashCode()) * 31) + this.f128580d.hashCode();
        }

        public String toString() {
            String str = this.f128577a;
            String str2 = this.f128578b;
            Map<String, String> map = this.f128579c;
            C3170a aVar = this.f128580d;
            return "AuthConfig(tenant=" + str + ", applicationId=" + str2 + ", parameters=" + map + ", type=" + aVar + ")";
        }
    }

    a a();
}

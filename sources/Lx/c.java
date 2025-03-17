package Lx;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LLx/c;", "", "<init>", "()V", "", "", "a", "()Ljava/util/Map;", "metaValues", "c", "d", "b", "LLx/c$a;", "LLx/c$b;", "LLx/c$c;", "LLx/c$d;", "pushnotification-analytics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LLx/c$a;", "LLx/c;", "LLx/a;", "errorType", "", "errorMessage", "", "metaValues", "<init>", "(LLx/a;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLx/a;", "c", "()LLx/a;", "b", "Ljava/lang/String;", "Ljava/util/Map;", "()Ljava/util/Map;", "pushnotification-analytics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final a f111931a;

        /* renamed from: b  reason: collision with root package name */
        private final String f111932b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, String> f111933c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a aVar, String str, Map<String, String> map) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "errorType");
            C17542s.j(map, "metaValues");
            this.f111931a = aVar;
            this.f111932b = str;
            this.f111933c = map;
        }

        public Map<String, String> a() {
            return this.f111933c;
        }

        public final String b() {
            return this.f111932b;
        }

        public final a c() {
            return this.f111931a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f111931a == aVar.f111931a && C17542s.e(this.f111932b, aVar.f111932b) && C17542s.e(this.f111933c, aVar.f111933c);
        }

        public int hashCode() {
            int hashCode = this.f111931a.hashCode() * 31;
            String str = this.f111932b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f111933c.hashCode();
        }

        public String toString() {
            a aVar = this.f111931a;
            String str = this.f111932b;
            Map<String, String> map = this.f111933c;
            return "Bounce(errorType=" + aVar + ", errorMessage=" + str + ", metaValues=" + map + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLx/c$b;", "LLx/c;", "", "", "metaValues", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "pushnotification-analytics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f111934a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Map<String, String> map) {
            super((DefaultConstructorMarker) null);
            C17542s.j(map, "metaValues");
            this.f111934a = map;
        }

        public Map<String, String> a() {
            return this.f111934a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f111934a, ((b) obj).f111934a);
        }

        public int hashCode() {
            return this.f111934a.hashCode();
        }

        public String toString() {
            Map<String, String> map = this.f111934a;
            return "Click(metaValues=" + map + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLx/c$c;", "LLx/c;", "", "", "metaValues", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "pushnotification-analytics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lx.c$c  reason: collision with other inner class name */
    public static final class C2739c extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f111935a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2739c(Map<String, String> map) {
            super((DefaultConstructorMarker) null);
            C17542s.j(map, "metaValues");
            this.f111935a = map;
        }

        public Map<String, String> a() {
            return this.f111935a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2739c) && C17542s.e(this.f111935a, ((C2739c) obj).f111935a);
        }

        public int hashCode() {
            return this.f111935a.hashCode();
        }

        public String toString() {
            Map<String, String> map = this.f111935a;
            return "Delivery(metaValues=" + map + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLx/c$d;", "LLx/c;", "", "", "metaValues", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "pushnotification-analytics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f111936a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Map<String, String> map) {
            super((DefaultConstructorMarker) null);
            C17542s.j(map, "metaValues");
            this.f111936a = map;
        }

        public Map<String, String> a() {
            return this.f111936a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f111936a, ((d) obj).f111936a);
        }

        public int hashCode() {
            return this.f111936a.hashCode();
        }

        public String toString() {
            Map<String, String> map = this.f111936a;
            return "Open(metaValues=" + map + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, String> a();

    private c() {
    }
}

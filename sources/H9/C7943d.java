package h9;

import XH.C16814e;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lh9/d;", "", "<init>", "()V", "a", "b", "c", "d", "Lh9/d$a;", "Lh9/d$b;", "Lh9/d$c;", "Lh9/d$d;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
/* renamed from: h9.d  reason: case insensitive filesystem */
public abstract class C7943d {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0004R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0004R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lh9/d$a;", "Lh9/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "data", "baseUrl", "c", "encoding", "d", "e", "mimeType", "historyUrl", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.d$a */
    public static final class a extends C7943d {

        /* renamed from: a  reason: collision with root package name */
        private final String f51673a;

        /* renamed from: b  reason: collision with root package name */
        private final String f51674b;

        /* renamed from: c  reason: collision with root package name */
        private final String f51675c;

        /* renamed from: d  reason: collision with root package name */
        private final String f51676d;

        /* renamed from: e  reason: collision with root package name */
        private final String f51677e;

        public final String a() {
            return this.f51674b;
        }

        public final String b() {
            return this.f51673a;
        }

        public final String c() {
            return this.f51675c;
        }

        public final String d() {
            return this.f51677e;
        }

        public final String e() {
            return this.f51676d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f51673a, aVar.f51673a) && C17542s.e(this.f51674b, aVar.f51674b) && C17542s.e(this.f51675c, aVar.f51675c) && C17542s.e(this.f51676d, aVar.f51676d) && C17542s.e(this.f51677e, aVar.f51677e);
        }

        public int hashCode() {
            int hashCode = this.f51673a.hashCode() * 31;
            String str = this.f51674b;
            int i10 = 0;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f51675c.hashCode()) * 31;
            String str2 = this.f51676d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f51677e;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            return "Data(data=" + this.f51673a + ", baseUrl=" + this.f51674b + ", encoding=" + this.f51675c + ", mimeType=" + this.f51676d + ", historyUrl=" + this.f51677e + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh9/d$b;", "Lh9/d;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.d$b */
    public static final class b extends C7943d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f51678a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lh9/d$c;", "Lh9/d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "url", "", "[B", "()[B", "postData", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.d$c */
    public static final class c extends C7943d {

        /* renamed from: a  reason: collision with root package name */
        private final String f51679a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f51680b;

        public final byte[] a() {
            return this.f51680b;
        }

        public final String b() {
            return this.f51679a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C17542s.e(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C17542s.h(obj, "null cannot be cast to non-null type com.google.accompanist.web.WebContent.Post");
            c cVar = (c) obj;
            return C17542s.e(this.f51679a, cVar.f51679a) && Arrays.equals(this.f51680b, cVar.f51680b);
        }

        public int hashCode() {
            return (this.f51679a.hashCode() * 31) + Arrays.hashCode(this.f51680b);
        }

        public String toString() {
            return "Post(url=" + this.f51679a + ", postData=" + Arrays.toString(this.f51680b) + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lh9/d$d;", "Lh9/d;", "", "url", "", "additionalHttpHeaders", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.d$d  reason: collision with other inner class name */
    public static final class C0851d extends C7943d {

        /* renamed from: a  reason: collision with root package name */
        private final String f51681a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f51682b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0851d(String str, Map<String, String> map) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "url");
            C17542s.j(map, "additionalHttpHeaders");
            this.f51681a = str;
            this.f51682b = map;
        }

        public final Map<String, String> a() {
            return this.f51682b;
        }

        public final String b() {
            return this.f51681a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0851d)) {
                return false;
            }
            C0851d dVar = (C0851d) obj;
            return C17542s.e(this.f51681a, dVar.f51681a) && C17542s.e(this.f51682b, dVar.f51682b);
        }

        public int hashCode() {
            return (this.f51681a.hashCode() * 31) + this.f51682b.hashCode();
        }

        public String toString() {
            return "Url(url=" + this.f51681a + ", additionalHttpHeaders=" + this.f51682b + ')';
        }
    }

    public /* synthetic */ C7943d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C7943d() {
    }
}

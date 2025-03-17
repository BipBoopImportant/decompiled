package Qz;

import HJ.C15854t;
import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LQz/b;", "", "", "url", "altText", "LQz/b$a;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;LQz/b$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getAltText", "c", "LQz/b$a;", "()LQz/b$a;", "seasonability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f115110a;

    /* renamed from: b  reason: collision with root package name */
    private final String f115111b;

    /* renamed from: c  reason: collision with root package name */
    private final a f115112c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LQz/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "IMAGE", "VIDEO", "UNKNOWN", "seasonability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        IMAGE("IMAGE"),
        VIDEO("VIDEO"),
        UNKNOWN("UNKNOWN");
        
        public static final C2822a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQz/b$a$a;", "", "<init>", "()V", "", "value", "LQz/b$a;", "a", "(Ljava/lang/String;)LQz/b$a;", "seasonability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qz.b$a$a  reason: collision with other inner class name */
        public static final class C2822a {
            public /* synthetic */ C2822a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                T t10;
                C17542s.j(str, "value");
                Iterator<T> it = a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C15854t.H(((a) t10).j(), str, true)) {
                        break;
                    }
                }
                a aVar = (a) t10;
                return aVar == null ? a.UNKNOWN : aVar;
            }

            private C2822a() {
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2822a((DefaultConstructorMarker) null);
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

    public b(String str, String str2, a aVar) {
        C17542s.j(str, "url");
        C17542s.j(str2, "altText");
        C17542s.j(aVar, "type");
        this.f115110a = str;
        this.f115111b = str2;
        this.f115112c = aVar;
    }

    public final a a() {
        return this.f115112c;
    }

    public final String b() {
        return this.f115110a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f115110a, bVar.f115110a) && C17542s.e(this.f115111b, bVar.f115111b) && this.f115112c == bVar.f115112c;
    }

    public int hashCode() {
        return (((this.f115110a.hashCode() * 31) + this.f115111b.hashCode()) * 31) + this.f115112c.hashCode();
    }

    public String toString() {
        String str = this.f115110a;
        String str2 = this.f115111b;
        a aVar = this.f115112c;
        return "SeasonabilityMedia(url=" + str + ", altText=" + str2 + ", type=" + aVar + ")";
    }
}

package Gf;

import N1.C4669d;
import com.adjust.sdk.Constants;
import fI.C17221b;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import nn.C11659e;
import xB.C15201a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LGf/c;", "LxB/a;", "i", "e", "g", "h", "a", "c", "f", "b", "d", "j", "LGf/c$a;", "LGf/c$b;", "LGf/c$c;", "LGf/c$e;", "LGf/c$f;", "LGf/c$g;", "LGf/c$h;", "LGf/c$i;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c extends C15201a {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LGf/c$a;", "LGf/c;", "", "id", "text", "LGf/c$j;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;LGf/c$j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "g", "c", "LGf/c$j;", "h", "()LGf/c$j;", "", "d", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f60637a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60638b;

        /* renamed from: c  reason: collision with root package name */
        private final j f60639c;

        /* renamed from: d  reason: collision with root package name */
        private final long f60640d;

        public a(String str, String str2, j jVar) {
            C17542s.j(str, "id");
            C17542s.j(str2, "text");
            C17542s.j(jVar, "type");
            this.f60637a = str;
            this.f60638b = str2;
            this.f60639c = jVar;
            U u10 = new U(3);
            u10.a(P.b(a.class));
            u10.a(str);
            u10.b(new Object[0]);
            this.f60640d = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f60637a, aVar.f60637a) && C17542s.e(this.f60638b, aVar.f60638b) && this.f60639c == aVar.f60639c;
        }

        public long f() {
            return this.f60640d;
        }

        public final String g() {
            return this.f60638b;
        }

        public final String getId() {
            return this.f60637a;
        }

        public final j h() {
            return this.f60639c;
        }

        public int hashCode() {
            return (((this.f60637a.hashCode() * 31) + this.f60638b.hashCode()) * 31) + this.f60639c.hashCode();
        }

        public String toString() {
            String str = this.f60637a;
            String str2 = this.f60638b;
            j jVar = this.f60639c;
            return "CategorySuggestionItem(id=" + str + ", text=" + str2 + ", type=" + jVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LGf/c$b;", "LGf/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60641a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final long f60642b = ((long) Objects.hash(new Object[]{P.b(b.class)}));

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public long f() {
            return f60642b;
        }

        public int hashCode() {
            return 47553761;
        }

        public String toString() {
            return "DataEthicsDisclaimer";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LGf/c$c;", "LGf/c;", "", "text", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "g", "", "c", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gf.c$c  reason: collision with other inner class name */
    public static final class C0996c implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f60643a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60644b;

        /* renamed from: c  reason: collision with root package name */
        private final long f60645c;

        public C0996c(String str, String str2) {
            C17542s.j(str, "text");
            C17542s.j(str2, Constants.DEEPLINK);
            this.f60643a = str;
            this.f60644b = str2;
            U u10 = new U(3);
            u10.a(P.b(C0996c.class));
            u10.a(str + str2);
            u10.b(new Object[0]);
            this.f60645c = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0996c)) {
                return false;
            }
            C0996c cVar = (C0996c) obj;
            return C17542s.e(this.f60643a, cVar.f60643a) && C17542s.e(this.f60644b, cVar.f60644b);
        }

        public long f() {
            return this.f60645c;
        }

        public final String g() {
            return this.f60644b;
        }

        public final String h() {
            return this.f60643a;
        }

        public int hashCode() {
            return (this.f60643a.hashCode() * 31) + this.f60644b.hashCode();
        }

        public String toString() {
            String str = this.f60643a;
            String str2 = this.f60644b;
            return "DeeplinkSuggestion(text=" + str + ", deeplink=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LGf/c$d;", "", "b", "a", "LGf/c$d$a;", "LGf/c$d$b;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001c"}, d2 = {"LGf/c$d$a;", "LGf/c$d;", "", "text", "LGf/c$j;", "type", "id", "", "icon", "<init>", "(Ljava/lang/String;LGf/c$j;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LGf/c$j;", "d", "()LGf/c$j;", "I", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements d {

            /* renamed from: a  reason: collision with root package name */
            private final String f60646a;

            /* renamed from: b  reason: collision with root package name */
            private final j f60647b;

            /* renamed from: c  reason: collision with root package name */
            private final String f60648c;

            /* renamed from: d  reason: collision with root package name */
            private final int f60649d;

            public a(String str, j jVar, String str2, int i10) {
                C17542s.j(str, "text");
                C17542s.j(jVar, "type");
                C17542s.j(str2, "id");
                this.f60646a = str;
                this.f60647b = jVar;
                this.f60648c = str2;
                this.f60649d = i10;
            }

            public final int a() {
                return this.f60649d;
            }

            public final String b() {
                return this.f60648c;
            }

            public String c() {
                return this.f60646a;
            }

            public j d() {
                return this.f60647b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f60646a, aVar.f60646a) && this.f60647b == aVar.f60647b && C17542s.e(this.f60648c, aVar.f60648c) && this.f60649d == aVar.f60649d;
            }

            public int hashCode() {
                return (((((this.f60646a.hashCode() * 31) + this.f60647b.hashCode()) * 31) + this.f60648c.hashCode()) * 31) + Integer.hashCode(this.f60649d);
            }

            public String toString() {
                String str = this.f60646a;
                j jVar = this.f60647b;
                String str2 = this.f60648c;
                int i10 = this.f60649d;
                return "Category(text=" + str + ", type=" + jVar + ", id=" + str2 + ", icon=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LGf/c$d$b;", "LGf/c$d;", "", "text", "LGf/c$j;", "type", "<init>", "(Ljava/lang/String;LGf/c$j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LGf/c$j;", "()LGf/c$j;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements d {

            /* renamed from: a  reason: collision with root package name */
            private final String f60650a;

            /* renamed from: b  reason: collision with root package name */
            private final j f60651b;

            public b(String str, j jVar) {
                C17542s.j(str, "text");
                C17542s.j(jVar, "type");
                this.f60650a = str;
                this.f60651b = jVar;
            }

            public String a() {
                return this.f60650a;
            }

            public j b() {
                return this.f60651b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f60650a, bVar.f60650a) && this.f60651b == bVar.f60651b;
            }

            public int hashCode() {
                return (this.f60650a.hashCode() * 31) + this.f60651b.hashCode();
            }

            public String toString() {
                String str = this.f60650a;
                j jVar = this.f60651b;
                return "Text(text=" + str + ", type=" + jVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LGf/c$e;", "LGf/c;", "", "LGf/c$d;", "searches", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "b", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f60652a;

        /* renamed from: b  reason: collision with root package name */
        private final long f60653b = ((long) Objects.hash(new Object[]{P.b(e.class)}));

        public e(List<? extends d> list) {
            C17542s.j(list, "searches");
            this.f60652a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f60652a, ((e) obj).f60652a);
        }

        public long f() {
            return this.f60653b;
        }

        public final List<d> g() {
            return this.f60652a;
        }

        public int hashCode() {
            return this.f60652a.hashCode();
        }

        public String toString() {
            List<d> list = this.f60652a;
            return "PopularSearches(searches=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LGf/c$f;", "LGf/c;", "Lnn/e;", "info", "<init>", "(Lnn/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnn/e;", "g", "()Lnn/e;", "", "b", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final C11659e f60654a;

        /* renamed from: b  reason: collision with root package name */
        private final long f60655b;

        public f(C11659e eVar) {
            C17542s.j(eVar, "info");
            this.f60654a = eVar;
            String c10 = eVar.c();
            U u10 = new U(3);
            u10.a(P.b(f.class));
            u10.a(c10);
            u10.b(new Object[0]);
            this.f60655b = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f60654a, ((f) obj).f60654a);
        }

        public long f() {
            return this.f60655b;
        }

        public final C11659e g() {
            return this.f60654a;
        }

        public int hashCode() {
            return this.f60654a.hashCode();
        }

        public String toString() {
            C11659e eVar = this.f60654a;
            return "Product(info=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LGf/c$g;", "LGf/c;", "", "", "searches", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "b", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements c {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f60656a;

        /* renamed from: b  reason: collision with root package name */
        private final long f60657b = ((long) Objects.hash(new Object[]{P.b(g.class)}));

        public g(List<String> list) {
            C17542s.j(list, "searches");
            this.f60656a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f60656a, ((g) obj).f60656a);
        }

        public long f() {
            return this.f60657b;
        }

        public final List<String> g() {
            return this.f60656a;
        }

        public int hashCode() {
            return this.f60656a.hashCode();
        }

        public String toString() {
            List<String> list = this.f60656a;
            return "RecentSearches(searches=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LGf/c$h;", "LGf/c;", "", "text", "LN1/d;", "highlightedText", "<init>", "(Ljava/lang/String;LN1/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "LN1/d;", "g", "()LN1/d;", "", "c", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f60658a;

        /* renamed from: b  reason: collision with root package name */
        private final C4669d f60659b;

        /* renamed from: c  reason: collision with root package name */
        private final long f60660c;

        public h(String str, C4669d dVar) {
            C17542s.j(str, "text");
            C17542s.j(dVar, "highlightedText");
            this.f60658a = str;
            this.f60659b = dVar;
            U u10 = new U(3);
            u10.a(P.b(h.class));
            u10.a(str);
            u10.b(new Object[0]);
            this.f60660c = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C17542s.e(this.f60658a, hVar.f60658a) && C17542s.e(this.f60659b, hVar.f60659b);
        }

        public long f() {
            return this.f60660c;
        }

        public final C4669d g() {
            return this.f60659b;
        }

        public final String h() {
            return this.f60658a;
        }

        public int hashCode() {
            return (this.f60658a.hashCode() * 31) + this.f60659b.hashCode();
        }

        public String toString() {
            String str = this.f60658a;
            C4669d dVar = this.f60659b;
            return "TextSuggestionItem(text=" + str + ", highlightedText=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LGf/c$i;", "LGf/c;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "", "b", "J", "f", "()J", "stableId", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f60661a;

        /* renamed from: b  reason: collision with root package name */
        private final long f60662b = ((long) Objects.hash(new Object[]{P.b(i.class)}));

        public i(String str) {
            C17542s.j(str, "text");
            this.f60661a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C17542s.e(this.f60661a, ((i) obj).f60661a);
        }

        public long f() {
            return this.f60662b;
        }

        public final String g() {
            return this.f60661a;
        }

        public int hashCode() {
            return this.f60661a.hashCode();
        }

        public String toString() {
            String str = this.f60661a;
            return "Tip(text=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LGf/c$j;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY", "ROOM", "TEXT", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum j {
        CATEGORY,
        ROOM,
        TEXT;

        static {
            j[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }
}

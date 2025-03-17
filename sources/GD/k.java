package GD;

import IC.C13026h;
import KJ.C15987c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LGD/k;", "LxB/a;", "d", "a", "c", "b", "LGD/k$a;", "LGD/k$b;", "LGD/k$c;", "LGD/k$d;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k extends C15201a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0012\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"LGD/k$a;", "LGD/k;", "<init>", "()V", "", "a", "J", "f", "()J", "stableId", "LGD/b;", "g", "()LGD/b;", "header", "", "h", "()Ljava/lang/String;", "number", "b", "LGD/k$a$a;", "LGD/k$a$b;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a implements k {

        /* renamed from: a  reason: collision with root package name */
        private final long f110402a;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"LGD/k$a$a;", "LGD/k$a;", "LGD/b;", "header", "", "number", "<init>", "(LGD/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LGD/b;", "g", "()LGD/b;", "c", "Ljava/lang/String;", "h", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: GD.k$a$a  reason: collision with other inner class name */
        public static final class C2649a extends a {

            /* renamed from: b  reason: collision with root package name */
            private final C12929b f110403b;

            /* renamed from: c  reason: collision with root package name */
            private final String f110404c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2649a(C12929b bVar, String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(bVar, "header");
                C17542s.j(str, "number");
                this.f110403b = bVar;
                this.f110404c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2649a)) {
                    return false;
                }
                C2649a aVar = (C2649a) obj;
                return C17542s.e(this.f110403b, aVar.f110403b) && C17542s.e(this.f110404c, aVar.f110404c);
            }

            public C12929b g() {
                return this.f110403b;
            }

            public String h() {
                return this.f110404c;
            }

            public int hashCode() {
                return (this.f110403b.hashCode() * 31) + this.f110404c.hashCode();
            }

            public String toString() {
                C12929b bVar = this.f110403b;
                String str = this.f110404c;
                return "Loaded(header=" + bVar + ", number=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u0019"}, d2 = {"LGD/k$a$b;", "LGD/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LGD/b;", "c", "LGD/b;", "g", "()LGD/b;", "header", "d", "Ljava/lang/String;", "h", "number", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f110405b = new b();

            /* renamed from: c  reason: collision with root package name */
            private static final C12929b f110406c = new C12929b(C13026h.c(""), C13026h.c(""), C13026h.c(""));

            /* renamed from: d  reason: collision with root package name */
            private static final String f110407d = "";

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public C12929b g() {
                return f110406c;
            }

            public String h() {
                return f110407d;
            }

            public int hashCode() {
                return 1917496828;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public long f() {
            return this.f110402a;
        }

        public abstract C12929b g();

        public abstract String h();

        private a() {
            this.f110402a = (long) Objects.hash(new Object[]{P.b(a.class)});
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0001\t¨\u0006\n"}, d2 = {"LGD/k$b;", "LGD/k;", "a", "b", "d", "g", "f", "e", "c", "LGD/k$b$f;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b extends k {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0018"}, d2 = {"LGD/k$b$a;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "c", "Ljava/lang/String;", "g", "imageUrl", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f110408a = new a();

            /* renamed from: b  reason: collision with root package name */
            private static final long f110409b = ((long) Objects.hash(new Object[]{P.b(a.class)}));

            /* renamed from: c  reason: collision with root package name */
            private static final String f110410c = "https://shop.static.ingka.ikea.com/wallet/add-card.png";

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public long f() {
                return f110409b;
            }

            public final String g() {
                return f110410c;
            }

            public int hashCode() {
                return -941906258;
            }

            public String toString() {
                return "AttachCard";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LGD/k$b$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: GD.k$b$b  reason: collision with other inner class name */
        public static final class C2650b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2650b f110411a = new C2650b();

            /* renamed from: b  reason: collision with root package name */
            private static final long f110412b = ((long) Objects.hash(new Object[]{P.b(C2650b.class)}));

            private C2650b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2650b);
            }

            public long f() {
                return f110412b;
            }

            public int hashCode() {
                return -1300550049;
            }

            public String toString() {
                return "ErrorCard";
            }
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u00020/8\u0016X\u0004¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b(\u00101¨\u00063"}, d2 = {"LGD/k$b$c;", "LGD/k$b$f;", "LGD/b;", "header", "", "id", "redemptionCode", "prepaidCardNumber", "LGD/a;", "background", "LKJ/c;", "LGD/c;", "codes", "LGD/k$b$g;", "state", "<init>", "(LGD/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LGD/a;LKJ/c;LGD/k$b$g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGD/b;", "i", "()LGD/b;", "b", "Ljava/lang/String;", "getId", "c", "d", "e", "LGD/a;", "g", "()LGD/a;", "f", "LKJ/c;", "h", "()LKJ/c;", "LGD/k$b$g;", "j", "()LGD/k$b$g;", "", "J", "()J", "stableId", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements f {

            /* renamed from: a  reason: collision with root package name */
            private final C12929b f110413a;

            /* renamed from: b  reason: collision with root package name */
            private final String f110414b;

            /* renamed from: c  reason: collision with root package name */
            private final String f110415c;

            /* renamed from: d  reason: collision with root package name */
            private final String f110416d;

            /* renamed from: e  reason: collision with root package name */
            private final C12928a f110417e;

            /* renamed from: f  reason: collision with root package name */
            private final C15987c<C12930c> f110418f;

            /* renamed from: g  reason: collision with root package name */
            private final g f110419g;

            /* renamed from: h  reason: collision with root package name */
            private final long f110420h;

            public c(C12929b bVar, String str, String str2, String str3, C12928a aVar, C15987c<C12930c> cVar, g gVar) {
                C17542s.j(bVar, "header");
                C17542s.j(str, "id");
                C17542s.j(str2, "redemptionCode");
                C17542s.j(str3, "prepaidCardNumber");
                C17542s.j(aVar, "background");
                C17542s.j(cVar, "codes");
                C17542s.j(gVar, "state");
                this.f110413a = bVar;
                this.f110414b = str;
                this.f110415c = str2;
                this.f110416d = str3;
                this.f110417e = aVar;
                this.f110418f = cVar;
                this.f110419g = gVar;
                U u10 = new U(3);
                u10.a(P.b(c.class));
                u10.a(str);
                u10.b(new Object[0]);
                this.f110420h = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public String b() {
                return this.f110415c;
            }

            public String e() {
                return this.f110416d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f110413a, cVar.f110413a) && C17542s.e(this.f110414b, cVar.f110414b) && C17542s.e(this.f110415c, cVar.f110415c) && C17542s.e(this.f110416d, cVar.f110416d) && C17542s.e(this.f110417e, cVar.f110417e) && C17542s.e(this.f110418f, cVar.f110418f) && C17542s.e(this.f110419g, cVar.f110419g);
            }

            public long f() {
                return this.f110420h;
            }

            public final C12928a g() {
                return this.f110417e;
            }

            public final C15987c<C12930c> h() {
                return this.f110418f;
            }

            public int hashCode() {
                return (((((((((((this.f110413a.hashCode() * 31) + this.f110414b.hashCode()) * 31) + this.f110415c.hashCode()) * 31) + this.f110416d.hashCode()) * 31) + this.f110417e.hashCode()) * 31) + this.f110418f.hashCode()) * 31) + this.f110419g.hashCode();
            }

            public final C12929b i() {
                return this.f110413a;
            }

            public final g j() {
                return this.f110419g;
            }

            public String toString() {
                C12929b bVar = this.f110413a;
                String str = this.f110414b;
                String str2 = this.f110415c;
                String str3 = this.f110416d;
                C12928a aVar = this.f110417e;
                C15987c<C12930c> cVar = this.f110418f;
                g gVar = this.f110419g;
                return "GiftCard(header=" + bVar + ", id=" + str + ", redemptionCode=" + str2 + ", prepaidCardNumber=" + str3 + ", background=" + aVar + ", codes=" + cVar + ", state=" + gVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LGD/k$b$d;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f110421a = new d();

            /* renamed from: b  reason: collision with root package name */
            private static final long f110422b = ((long) Objects.hash(new Object[]{P.b(d.class)}));

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public long f() {
                return f110422b;
            }

            public int hashCode() {
                return 1411175891;
            }

            public String toString() {
                return "LoadingCard";
            }
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u00020/8\u0016X\u0004¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b(\u00101¨\u00063"}, d2 = {"LGD/k$b$e;", "LGD/k$b$f;", "LGD/b;", "header", "", "id", "redemptionCode", "prepaidCardNumber", "LGD/a;", "background", "LKJ/c;", "LGD/c;", "codes", "LGD/k$b$g;", "state", "<init>", "(LGD/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LGD/a;LKJ/c;LGD/k$b$g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGD/b;", "i", "()LGD/b;", "b", "Ljava/lang/String;", "getId", "c", "d", "e", "LGD/a;", "g", "()LGD/a;", "f", "LKJ/c;", "h", "()LKJ/c;", "LGD/k$b$g;", "j", "()LGD/k$b$g;", "", "J", "()J", "stableId", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements f {

            /* renamed from: a  reason: collision with root package name */
            private final C12929b f110423a;

            /* renamed from: b  reason: collision with root package name */
            private final String f110424b;

            /* renamed from: c  reason: collision with root package name */
            private final String f110425c;

            /* renamed from: d  reason: collision with root package name */
            private final String f110426d;

            /* renamed from: e  reason: collision with root package name */
            private final C12928a f110427e;

            /* renamed from: f  reason: collision with root package name */
            private final C15987c<C12930c> f110428f;

            /* renamed from: g  reason: collision with root package name */
            private final g f110429g;

            /* renamed from: h  reason: collision with root package name */
            private final long f110430h;

            public e(C12929b bVar, String str, String str2, String str3, C12928a aVar, C15987c<C12930c> cVar, g gVar) {
                C17542s.j(bVar, "header");
                C17542s.j(str, "id");
                C17542s.j(str2, "redemptionCode");
                C17542s.j(str3, "prepaidCardNumber");
                C17542s.j(aVar, "background");
                C17542s.j(cVar, "codes");
                C17542s.j(gVar, "state");
                this.f110423a = bVar;
                this.f110424b = str;
                this.f110425c = str2;
                this.f110426d = str3;
                this.f110427e = aVar;
                this.f110428f = cVar;
                this.f110429g = gVar;
                U u10 = new U(3);
                u10.a(P.b(e.class));
                u10.a(str);
                u10.b(new Object[0]);
                this.f110430h = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public String b() {
                return this.f110425c;
            }

            public String e() {
                return this.f110426d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C17542s.e(this.f110423a, eVar.f110423a) && C17542s.e(this.f110424b, eVar.f110424b) && C17542s.e(this.f110425c, eVar.f110425c) && C17542s.e(this.f110426d, eVar.f110426d) && C17542s.e(this.f110427e, eVar.f110427e) && C17542s.e(this.f110428f, eVar.f110428f) && C17542s.e(this.f110429g, eVar.f110429g);
            }

            public long f() {
                return this.f110430h;
            }

            public final C12928a g() {
                return this.f110427e;
            }

            public final C15987c<C12930c> h() {
                return this.f110428f;
            }

            public int hashCode() {
                return (((((((((((this.f110423a.hashCode() * 31) + this.f110424b.hashCode()) * 31) + this.f110425c.hashCode()) * 31) + this.f110426d.hashCode()) * 31) + this.f110427e.hashCode()) * 31) + this.f110428f.hashCode()) * 31) + this.f110429g.hashCode();
            }

            public final C12929b i() {
                return this.f110423a;
            }

            public final g j() {
                return this.f110429g;
            }

            public String toString() {
                C12929b bVar = this.f110423a;
                String str = this.f110424b;
                String str2 = this.f110425c;
                String str3 = this.f110426d;
                C12928a aVar = this.f110427e;
                C15987c<C12930c> cVar = this.f110428f;
                g gVar = this.f110429g;
                return "RefundCard(header=" + bVar + ", id=" + str + ", redemptionCode=" + str2 + ", prepaidCardNumber=" + str3 + ", background=" + aVar + ", codes=" + cVar + ", state=" + gVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0001\u0002\b\t¨\u0006\n"}, d2 = {"LGD/k$b$f;", "LGD/k$b;", "", "b", "()Ljava/lang/String;", "redemptionCode", "e", "prepaidCardNumber", "LGD/k$b$c;", "LGD/k$b$e;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface f extends b {
            String b();

            String e();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LGD/k$b$g;", "", "a", "b", "LGD/k$b$g$a;", "LGD/k$b$g$b;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface g {

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LGD/k$b$g$a;", "LGD/k$b$g;", "", "qrData", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a implements g {

                /* renamed from: a  reason: collision with root package name */
                private final String f110431a;

                public a(String str) {
                    C17542s.j(str, "qrData");
                    this.f110431a = str;
                }

                public final String a() {
                    return this.f110431a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && C17542s.e(this.f110431a, ((a) obj).f110431a);
                }

                public int hashCode() {
                    return this.f110431a.hashCode();
                }

                public String toString() {
                    String str = this.f110431a;
                    return "Active(qrData=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LGD/k$b$g$b;", "LGD/k$b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: GD.k$b$g$b  reason: collision with other inner class name */
            public static final class C2651b implements g {

                /* renamed from: a  reason: collision with root package name */
                public static final C2651b f110432a = new C2651b();

                private C2651b() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2651b);
                }

                public int hashCode() {
                    return -1137526705;
                }

                public String toString() {
                    return "Expired";
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"LGD/k$c;", "LGD/k;", "LGD/d;", "a", "()LGD/d;", "hint", "LGD/k$c$a;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends k {

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JT\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001d\u00102R\u001a\u00106\u001a\u0002038\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b0\u00105¨\u00067"}, d2 = {"LGD/k$c$a;", "LGD/k$c;", "", "id", "LGD/b;", "header", "LGD/a;", "background", "LGD/k$c$a$a;", "qrCode", "LKJ/c;", "LGD/c;", "cardInfo", "LGD/d;", "hint", "<init>", "(Ljava/lang/String;LGD/b;LGD/a;LGD/k$c$a$a;LKJ/c;LGD/d;)V", "g", "(Ljava/lang/String;LGD/b;LGD/a;LGD/k$c$a$a;LKJ/c;LGD/d;)LGD/k$c$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LGD/b;", "n", "()LGD/b;", "c", "LGD/a;", "i", "()LGD/a;", "d", "LGD/k$c$a$a;", "o", "()LGD/k$c$a$a;", "e", "LKJ/c;", "j", "()LKJ/c;", "f", "LGD/d;", "()LGD/d;", "", "J", "()J", "stableId", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            private final String f110433a;

            /* renamed from: b  reason: collision with root package name */
            private final C12929b f110434b;

            /* renamed from: c  reason: collision with root package name */
            private final C12928a f110435c;

            /* renamed from: d  reason: collision with root package name */
            private final C2652a f110436d;

            /* renamed from: e  reason: collision with root package name */
            private final C15987c<C12930c> f110437e;

            /* renamed from: f  reason: collision with root package name */
            private final C12931d f110438f;

            /* renamed from: g  reason: collision with root package name */
            private final long f110439g;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LGD/k$c$a$a;", "", "a", "b", "LGD/k$c$a$a$a;", "LGD/k$c$a$a$b;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: GD.k$c$a$a  reason: collision with other inner class name */
            public interface C2652a {

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LGD/k$c$a$a$a;", "LGD/k$c$a$a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: GD.k$c$a$a$a  reason: collision with other inner class name */
                public static final class C2653a implements C2652a {

                    /* renamed from: a  reason: collision with root package name */
                    private final String f110440a;

                    public C2653a(String str) {
                        C17542s.j(str, "data");
                        this.f110440a = str;
                    }

                    public final String a() {
                        return this.f110440a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C2653a) && C17542s.e(this.f110440a, ((C2653a) obj).f110440a);
                    }

                    public int hashCode() {
                        return this.f110440a.hashCode();
                    }

                    public String toString() {
                        String str = this.f110440a;
                        return "Data(data=" + str + ")";
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LGD/k$c$a$a$b;", "LGD/k$c$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: GD.k$c$a$a$b */
                public static final class b implements C2652a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final b f110441a = new b();

                    private b() {
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public int hashCode() {
                        return -164120848;
                    }

                    public String toString() {
                        return "None";
                    }
                }
            }

            public a(String str, C12929b bVar, C12928a aVar, C2652a aVar2, C15987c<C12930c> cVar, C12931d dVar) {
                C17542s.j(str, "id");
                C17542s.j(bVar, "header");
                C17542s.j(aVar, "background");
                C17542s.j(aVar2, "qrCode");
                C17542s.j(cVar, "cardInfo");
                this.f110433a = str;
                this.f110434b = bVar;
                this.f110435c = aVar;
                this.f110436d = aVar2;
                this.f110437e = cVar;
                this.f110438f = dVar;
                U u10 = new U(3);
                u10.a(P.b(a.class));
                u10.a(str);
                u10.b(new Object[0]);
                this.f110439g = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public static /* synthetic */ a h(a aVar, String str, C12929b bVar, C12928a aVar2, C2652a aVar3, C15987c<C12930c> cVar, C12931d dVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f110433a;
                }
                if ((i10 & 2) != 0) {
                    bVar = aVar.f110434b;
                }
                C12929b bVar2 = bVar;
                if ((i10 & 4) != 0) {
                    aVar2 = aVar.f110435c;
                }
                C12928a aVar4 = aVar2;
                if ((i10 & 8) != 0) {
                    aVar3 = aVar.f110436d;
                }
                C2652a aVar5 = aVar3;
                if ((i10 & 16) != 0) {
                    cVar = aVar.f110437e;
                }
                C15987c<C12930c> cVar2 = cVar;
                if ((i10 & 32) != 0) {
                    dVar = aVar.f110438f;
                }
                return aVar.g(str, bVar2, aVar4, aVar5, cVar2, dVar);
            }

            public C12931d a() {
                return this.f110438f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f110433a, aVar.f110433a) && C17542s.e(this.f110434b, aVar.f110434b) && C17542s.e(this.f110435c, aVar.f110435c) && C17542s.e(this.f110436d, aVar.f110436d) && C17542s.e(this.f110437e, aVar.f110437e) && C17542s.e(this.f110438f, aVar.f110438f);
            }

            public long f() {
                return this.f110439g;
            }

            public final a g(String str, C12929b bVar, C12928a aVar, C2652a aVar2, C15987c<C12930c> cVar, C12931d dVar) {
                C17542s.j(str, "id");
                C17542s.j(bVar, "header");
                C17542s.j(aVar, "background");
                C17542s.j(aVar2, "qrCode");
                C17542s.j(cVar, "cardInfo");
                return new a(str, bVar, aVar, aVar2, cVar, dVar);
            }

            public int hashCode() {
                int hashCode = ((((((((this.f110433a.hashCode() * 31) + this.f110434b.hashCode()) * 31) + this.f110435c.hashCode()) * 31) + this.f110436d.hashCode()) * 31) + this.f110437e.hashCode()) * 31;
                C12931d dVar = this.f110438f;
                return hashCode + (dVar == null ? 0 : dVar.hashCode());
            }

            public final C12928a i() {
                return this.f110435c;
            }

            public final C15987c<C12930c> j() {
                return this.f110437e;
            }

            public final C12929b n() {
                return this.f110434b;
            }

            public final C2652a o() {
                return this.f110436d;
            }

            public String toString() {
                String str = this.f110433a;
                C12929b bVar = this.f110434b;
                C12928a aVar = this.f110435c;
                C2652a aVar2 = this.f110436d;
                C15987c<C12930c> cVar = this.f110437e;
                C12931d dVar = this.f110438f;
                return "ClaimedCard(id=" + str + ", header=" + bVar + ", background=" + aVar + ", qrCode=" + aVar2 + ", cardInfo=" + cVar + ", hint=" + dVar + ")";
            }
        }

        C12931d a();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u0019"}, d2 = {"LGD/k$d;", "LGD/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "c", "Ljava/lang/String;", "g", "imageUrl", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final d f110442a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final long f110443b = ((long) Objects.hash(new Object[]{P.b(d.class)}));

        /* renamed from: c  reason: collision with root package name */
        private static final String f110444c = "https://shop.static.ingka.ikea.com/wallet/upgrade-card.png";

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public long f() {
            return f110443b;
        }

        public final String g() {
            return f110444c;
        }

        public int hashCode() {
            return -2094430126;
        }

        public String toString() {
            return "UpgradeCard";
        }
    }
}

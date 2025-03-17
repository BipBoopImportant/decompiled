package Pu;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"LPu/g;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "headerImageUrl", "b", "c", "LPu/g$a;", "LPu/g$b;", "LPu/g$c;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LPu/g$a;", "LPu/g;", "", "headerImageUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        private final String f85826a;

        public a(String str) {
            super((DefaultConstructorMarker) null);
            this.f85826a = str;
        }

        public String a() {
            return this.f85826a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f85826a, ((a) obj).f85826a);
        }

        public int hashCode() {
            String str = this.f85826a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f85826a;
            return "Error(headerImageUrl=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LPu/g$b;", "LPu/g;", "", "headerImageUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final String f85827a;

        public b() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public String a() {
            return this.f85827a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f85827a, ((b) obj).f85827a);
        }

        public int hashCode() {
            String str = this.f85827a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f85827a;
            return "Loading(headerImageUrl=" + str + ")";
        }

        public b(String str) {
            super((DefaultConstructorMarker) null);
            this.f85827a = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001:\u0004\u001b\u0019\u001d\u001fBA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"LPu/g$c;", "LPu/g;", "", "headerImageUrl", "LPu/g$c$b;", "orderStatus", "orderId", "LPu/g$c$a;", "collectionTime", "LPu/g$c$d;", "serviceDeskInfo", "LPu/g$c$c;", "priceSummary", "<init>", "(Ljava/lang/String;LPu/g$c$b;Ljava/lang/String;LPu/g$c$a;LPu/g$c$d;LPu/g$c$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LPu/g$c$b;", "d", "()LPu/g$c$b;", "c", "LPu/g$c$a;", "()LPu/g$c$a;", "e", "LPu/g$c$c;", "()LPu/g$c$c;", "LPu/g$c$d;", "f", "()LPu/g$c$d;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends g {

        /* renamed from: a  reason: collision with root package name */
        private final String f85828a;

        /* renamed from: b  reason: collision with root package name */
        private final b f85829b;

        /* renamed from: c  reason: collision with root package name */
        private final String f85830c;

        /* renamed from: d  reason: collision with root package name */
        private final a f85831d;

        /* renamed from: e  reason: collision with root package name */
        private final C1750c f85832e;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LPu/g$c$a;", "", "LIC/e;", "text", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            public static final int f85833b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f85834a;

            public a(C13023e eVar) {
                C17542s.j(eVar, "text");
                this.f85834a = eVar;
            }

            public final C13023e a() {
                return this.f85834a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f85834a, ((a) obj).f85834a);
            }

            public int hashCode() {
                return this.f85834a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f85834a;
                return "CollectionTime(text=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LPu/g$c$b;", "", "LIC/e;", "statusText", "", "isHighLighted", "<init>", "(LIC/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "Z", "()Z", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: c  reason: collision with root package name */
            public static final int f85835c = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f85836a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f85837b;

            public b(C13023e eVar, boolean z10) {
                C17542s.j(eVar, "statusText");
                this.f85836a = eVar;
                this.f85837b = z10;
            }

            public final C13023e a() {
                return this.f85836a;
            }

            public final boolean b() {
                return this.f85837b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f85836a, bVar.f85836a) && this.f85837b == bVar.f85837b;
            }

            public int hashCode() {
                return (this.f85836a.hashCode() * 31) + Boolean.hashCode(this.f85837b);
            }

            public String toString() {
                C13023e eVar = this.f85836a;
                boolean z10 = this.f85837b;
                return "OrderStatus(statusText=" + eVar + ", isHighLighted=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"LPu/g$c$c;", "", "Lqx/c;", "productPrice", "totalPrice", "Lkp/d;", "currencyConfig", "<init>", "(Lqx/c;Lqx/c;Lkp/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqx/c;", "b", "()Lqx/c;", "c", "Lkp/d;", "()Lkp/d;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pu.g$c$c  reason: collision with other inner class name */
        public static final class C1750c {

            /* renamed from: a  reason: collision with root package name */
            private final qx.c f85838a;

            /* renamed from: b  reason: collision with root package name */
            private final qx.c f85839b;

            /* renamed from: c  reason: collision with root package name */
            private final C11522d f85840c;

            public C1750c(qx.c cVar, qx.c cVar2, C11522d dVar) {
                C17542s.j(cVar, "productPrice");
                C17542s.j(cVar2, "totalPrice");
                C17542s.j(dVar, "currencyConfig");
                this.f85838a = cVar;
                this.f85839b = cVar2;
                this.f85840c = dVar;
            }

            public final C11522d a() {
                return this.f85840c;
            }

            public final qx.c b() {
                return this.f85838a;
            }

            public final qx.c c() {
                return this.f85839b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1750c)) {
                    return false;
                }
                C1750c cVar = (C1750c) obj;
                return C17542s.e(this.f85838a, cVar.f85838a) && C17542s.e(this.f85839b, cVar.f85839b) && C17542s.e(this.f85840c, cVar.f85840c);
            }

            public int hashCode() {
                return (((this.f85838a.hashCode() * 31) + this.f85839b.hashCode()) * 31) + this.f85840c.hashCode();
            }

            public String toString() {
                qx.c cVar = this.f85838a;
                qx.c cVar2 = this.f85839b;
                C11522d dVar = this.f85840c;
                return "PriceSummary(productPrice=" + cVar + ", totalPrice=" + cVar2 + ", currencyConfig=" + dVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPu/g$c$d;", "", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(String str, b bVar, String str2, a aVar, d dVar, C1750c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : bVar, str2, aVar, (i10 & 16) != 0 ? null : dVar, cVar);
        }

        public String a() {
            return this.f85828a;
        }

        public final a b() {
            return this.f85831d;
        }

        public final String c() {
            return this.f85830c;
        }

        public final b d() {
            return this.f85829b;
        }

        public final C1750c e() {
            return this.f85832e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f85828a, cVar.f85828a) && C17542s.e(this.f85829b, cVar.f85829b) && C17542s.e(this.f85830c, cVar.f85830c) && C17542s.e(this.f85831d, cVar.f85831d) && C17542s.e((Object) null, (Object) null) && C17542s.e(this.f85832e, cVar.f85832e);
        }

        public final d f() {
            return null;
        }

        public int hashCode() {
            String str = this.f85828a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f85829b;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return ((((((hashCode + i10) * 31) + this.f85830c.hashCode()) * 31) + this.f85831d.hashCode()) * 961) + this.f85832e.hashCode();
        }

        public String toString() {
            String str = this.f85828a;
            b bVar = this.f85829b;
            String str2 = this.f85830c;
            a aVar = this.f85831d;
            C1750c cVar = this.f85832e;
            return "Show(headerImageUrl=" + str + ", orderStatus=" + bVar + ", orderId=" + str2 + ", collectionTime=" + aVar + ", serviceDeskInfo=" + null + ", priceSummary=" + cVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, b bVar, String str2, a aVar, d dVar, C1750c cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str2, "orderId");
            C17542s.j(aVar, "collectionTime");
            C17542s.j(cVar, "priceSummary");
            this.f85828a = str;
            this.f85829b = bVar;
            this.f85830c = str2;
            this.f85831d = aVar;
            this.f85832e = cVar;
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private g() {
    }
}

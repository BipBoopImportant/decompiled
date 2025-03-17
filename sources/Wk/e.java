package Wk;

import XH.t;
import com.ingka.ikea.app.base.ProductKey;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001:\u0002\u000b\u0017B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"LWk/e;", "", "", "productNumber", "LWk/e$a$b;", "storeAvailability", "LWk/e$a$a;", "marketAvailability", "<init>", "(Ljava/lang/String;LWk/e$a$b;LWk/e$a$a;)V", "", "a", "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "LWk/e$a$b;", "d", "()LWk/e$a$b;", "LWk/e$a$a;", "()LWk/e$a$a;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f88884a;

    /* renamed from: b  reason: collision with root package name */
    private final a.b f88885b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C1887a f88886c;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LWk/e$a;", "", "<init>", "()V", "LWk/e$b;", "a", "()LWk/e$b;", "availabilityStatus", "b", "LWk/e$a$a;", "LWk/e$a$b;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LWk/e$a$a;", "LWk/e$a;", "LWk/e$b;", "availabilityStatus", "<init>", "(LWk/e$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWk/e$b;", "()LWk/e$b;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wk.e$a$a  reason: collision with other inner class name */
        public static final class C1887a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final b f88887a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1887a(b bVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(bVar, "availabilityStatus");
                this.f88887a = bVar;
            }

            public b a() {
                return this.f88887a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1887a) && C17542s.e(this.f88887a, ((C1887a) obj).f88887a);
            }

            public int hashCode() {
                return this.f88887a.hashCode();
            }

            public String toString() {
                b bVar = this.f88887a;
                return "Market(availabilityStatus=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LWk/e$a$b;", "LWk/e$a;", "", "storeId", "LWk/e$b;", "availabilityStatus", "<init>", "(Ljava/lang/String;LWk/e$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LWk/e$b;", "()LWk/e$b;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f88888a;

            /* renamed from: b  reason: collision with root package name */
            private final b f88889b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, b bVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "storeId");
                C17542s.j(bVar, "availabilityStatus");
                this.f88888a = str;
                this.f88889b = bVar;
            }

            public b a() {
                return this.f88889b;
            }

            public final String b() {
                return this.f88888a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f88888a, bVar.f88888a) && C17542s.e(this.f88889b, bVar.f88889b);
            }

            public int hashCode() {
                return (this.f88888a.hashCode() * 31) + this.f88889b.hashCode();
            }

            public String toString() {
                String str = this.f88888a;
                b bVar = this.f88889b;
                return "Store(storeId=" + str + ", availabilityStatus=" + bVar + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract b a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LWk/e$b;", "", "<init>", "()V", "a", "b", "LWk/e$b$a;", "LWk/e$b$b;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0004\u001d\u001a\u0018\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"LWk/e$b$a;", "LWk/e$b;", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "LWk/e$b$a$a;", "clickCollectAvailability", "", "longTermSupplyIssue", "LWk/e$b$a$c;", "homeAvailability", "<init>", "(Lcom/ingka/ikea/app/base/ProductKey;LWk/e$b$a$a;ZLWk/e$b$a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/base/ProductKey;", "d", "()Lcom/ingka/ikea/app/base/ProductKey;", "b", "LWk/e$b$a$a;", "()LWk/e$b$a$a;", "c", "Z", "()Z", "LWk/e$b$a$c;", "()LWk/e$b$a$c;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final ProductKey f88890a;

            /* renamed from: b  reason: collision with root package name */
            private final C1888a f88891b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f88892c;

            /* renamed from: d  reason: collision with root package name */
            private final c f88893d;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"LWk/e$b$a$a;", "", "", "available", "inRange", "", "deliveryPrice", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/Boolean;", "getInRange", "()Ljava/lang/Boolean;", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Wk.e$b$a$a  reason: collision with other inner class name */
            public static final class C1888a {

                /* renamed from: a  reason: collision with root package name */
                private final boolean f88894a;

                /* renamed from: b  reason: collision with root package name */
                private final Boolean f88895b;

                /* renamed from: c  reason: collision with root package name */
                private final Double f88896c;

                public C1888a(boolean z10, Boolean bool, Double d10) {
                    this.f88894a = z10;
                    this.f88895b = bool;
                    this.f88896c = d10;
                }

                public final boolean a() {
                    return this.f88894a;
                }

                public final Double b() {
                    return this.f88896c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1888a)) {
                        return false;
                    }
                    C1888a aVar = (C1888a) obj;
                    return this.f88894a == aVar.f88894a && C17542s.e(this.f88895b, aVar.f88895b) && C17542s.e(this.f88896c, aVar.f88896c);
                }

                public int hashCode() {
                    int hashCode = Boolean.hashCode(this.f88894a) * 31;
                    Boolean bool = this.f88895b;
                    int i10 = 0;
                    int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                    Double d10 = this.f88896c;
                    if (d10 != null) {
                        i10 = d10.hashCode();
                    }
                    return hashCode2 + i10;
                }

                public String toString() {
                    boolean z10 = this.f88894a;
                    Boolean bool = this.f88895b;
                    Double d10 = this.f88896c;
                    return "ClickCollectAvailability(available=" + z10 + ", inRange=" + bool + ", deliveryPrice=" + d10 + ")";
                }
            }

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LWk/e$b$a$b;", "", "LWk/e$b$a$d;", "dateRange", "<init>", "(LWk/e$b$a$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWk/e$b$a$d;", "()LWk/e$b$a$d;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Wk.e$b$a$b  reason: collision with other inner class name */
            public static final class C1889b {

                /* renamed from: a  reason: collision with root package name */
                private final d f88897a;

                public C1889b(d dVar) {
                    C17542s.j(dVar, "dateRange");
                    this.f88897a = dVar;
                }

                public final d a() {
                    return this.f88897a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1889b) && C17542s.e(this.f88897a, ((C1889b) obj).f88897a);
                }

                public int hashCode() {
                    return this.f88897a.hashCode();
                }

                public String toString() {
                    d dVar = this.f88897a;
                    return "DeliveryTime(dateRange=" + dVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"LWk/e$b$a$c;", "", "", "available", "", "quantity", "limitedDeliveryMethods", "", "deliveryPrice", "LWk/e$b$a$b;", "deliveryTime", "isPupIncludedInDeliveryPrice", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Double;LWk/e$b$a$b;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "c", "d", "Ljava/lang/Double;", "()Ljava/lang/Double;", "LWk/e$b$a$b;", "()LWk/e$b$a$b;", "f", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c {

                /* renamed from: a  reason: collision with root package name */
                private final boolean f88898a;

                /* renamed from: b  reason: collision with root package name */
                private final Integer f88899b;

                /* renamed from: c  reason: collision with root package name */
                private final boolean f88900c;

                /* renamed from: d  reason: collision with root package name */
                private final Double f88901d;

                /* renamed from: e  reason: collision with root package name */
                private final C1889b f88902e;

                /* renamed from: f  reason: collision with root package name */
                private final boolean f88903f;

                public c(boolean z10, Integer num, boolean z11, Double d10, C1889b bVar, boolean z12) {
                    this.f88898a = z10;
                    this.f88899b = num;
                    this.f88900c = z11;
                    this.f88901d = d10;
                    this.f88902e = bVar;
                    this.f88903f = z12;
                }

                public final boolean a() {
                    return this.f88898a;
                }

                public final Double b() {
                    return this.f88901d;
                }

                public final C1889b c() {
                    return this.f88902e;
                }

                public final boolean d() {
                    return this.f88900c;
                }

                public final Integer e() {
                    return this.f88899b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.f88898a == cVar.f88898a && C17542s.e(this.f88899b, cVar.f88899b) && this.f88900c == cVar.f88900c && C17542s.e(this.f88901d, cVar.f88901d) && C17542s.e(this.f88902e, cVar.f88902e) && this.f88903f == cVar.f88903f;
                }

                public final boolean f() {
                    return this.f88903f;
                }

                public int hashCode() {
                    int hashCode = Boolean.hashCode(this.f88898a) * 31;
                    Integer num = this.f88899b;
                    int i10 = 0;
                    int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f88900c)) * 31;
                    Double d10 = this.f88901d;
                    int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
                    C1889b bVar = this.f88902e;
                    if (bVar != null) {
                        i10 = bVar.hashCode();
                    }
                    return ((hashCode3 + i10) * 31) + Boolean.hashCode(this.f88903f);
                }

                public String toString() {
                    boolean z10 = this.f88898a;
                    Integer num = this.f88899b;
                    boolean z11 = this.f88900c;
                    Double d10 = this.f88901d;
                    C1889b bVar = this.f88902e;
                    boolean z12 = this.f88903f;
                    return "HomeAvailability(available=" + z10 + ", quantity=" + num + ", limitedDeliveryMethods=" + z11 + ", deliveryPrice=" + d10 + ", deliveryTime=" + bVar + ", isPupIncludedInDeliveryPrice=" + z12 + ")";
                }
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LWk/e$b$a$d;", "", "", "from", "to", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d {

                /* renamed from: a  reason: collision with root package name */
                private final String f88904a;

                /* renamed from: b  reason: collision with root package name */
                private final String f88905b;

                public d(String str, String str2) {
                    C17542s.j(str, "from");
                    C17542s.j(str2, "to");
                    this.f88904a = str;
                    this.f88905b = str2;
                }

                public final String a() {
                    return this.f88904a;
                }

                public final String b() {
                    return this.f88905b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return C17542s.e(this.f88904a, dVar.f88904a) && C17542s.e(this.f88905b, dVar.f88905b);
                }

                public int hashCode() {
                    return (this.f88904a.hashCode() * 31) + this.f88905b.hashCode();
                }

                public String toString() {
                    String str = this.f88904a;
                    String str2 = this.f88905b;
                    return "TimeRange(from=" + str + ", to=" + str2 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ProductKey productKey, C1888a aVar, boolean z10, c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(productKey, "productKey");
                this.f88890a = productKey;
                this.f88891b = aVar;
                this.f88892c = z10;
                this.f88893d = cVar;
            }

            public final C1888a a() {
                return this.f88891b;
            }

            public final c b() {
                return this.f88893d;
            }

            public final boolean c() {
                return this.f88892c;
            }

            public final ProductKey d() {
                return this.f88890a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f88890a, aVar.f88890a) && C17542s.e(this.f88891b, aVar.f88891b) && this.f88892c == aVar.f88892c && C17542s.e(this.f88893d, aVar.f88893d);
            }

            public int hashCode() {
                int hashCode = this.f88890a.hashCode() * 31;
                C1888a aVar = this.f88891b;
                int i10 = 0;
                int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f88892c)) * 31;
                c cVar = this.f88893d;
                if (cVar != null) {
                    i10 = cVar.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                ProductKey productKey = this.f88890a;
                C1888a aVar = this.f88891b;
                boolean z10 = this.f88892c;
                c cVar = this.f88893d;
                return "Availability(productKey=" + productKey + ", clickCollectAvailability=" + aVar + ", longTermSupplyIssue=" + z10 + ", homeAvailability=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LWk/e$b$b;", "LWk/e$b;", "", "identifier", "LWk/a;", "error", "<init>", "(Ljava/lang/String;LWk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LWk/a;", "()LWk/a;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wk.e$b$b  reason: collision with other inner class name */
        public static final class C1890b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f88906a;

            /* renamed from: b  reason: collision with root package name */
            private final a f88907b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1890b(String str, a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, UiComponentContainer.RESULT_ERROR);
                this.f88906a = str;
                this.f88907b = aVar;
            }

            public final a a() {
                return this.f88907b;
            }

            public final String b() {
                return this.f88906a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1890b)) {
                    return false;
                }
                C1890b bVar = (C1890b) obj;
                return C17542s.e(this.f88906a, bVar.f88906a) && C17542s.e(this.f88907b, bVar.f88907b);
            }

            public int hashCode() {
                String str = this.f88906a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f88907b.hashCode();
            }

            public String toString() {
                String str = this.f88906a;
                a aVar = this.f88907b;
                return "Error(identifier=" + str + ", error=" + aVar + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public e(String str, a.b bVar, a.C1887a aVar) {
        C17542s.j(str, "productNumber");
        C17542s.j(aVar, "marketAvailability");
        this.f88884a = str;
        this.f88885b = bVar;
        this.f88886c = aVar;
    }

    public final boolean a() {
        b a10 = this.f88886c.a();
        if (a10 instanceof b.a) {
            return ((b.a) a10).c();
        }
        if (a10 instanceof b.C1890b) {
            a.b bVar = this.f88885b;
            b.a aVar = null;
            b a11 = bVar != null ? bVar.a() : null;
            if (a11 instanceof b.a) {
                aVar = (b.a) a11;
            }
            if (aVar != null) {
                return aVar.c();
            }
            return false;
        }
        throw new t();
    }

    public final a.C1887a b() {
        return this.f88886c;
    }

    public final String c() {
        return this.f88884a;
    }

    public final a.b d() {
        return this.f88885b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f88884a, eVar.f88884a) && C17542s.e(this.f88885b, eVar.f88885b) && C17542s.e(this.f88886c, eVar.f88886c);
    }

    public int hashCode() {
        int hashCode = this.f88884a.hashCode() * 31;
        a.b bVar = this.f88885b;
        return ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f88886c.hashCode();
    }

    public String toString() {
        String str = this.f88884a;
        a.b bVar = this.f88885b;
        a.C1887a aVar = this.f88886c;
        return "ProductAvailability(productNumber=" + str + ", storeAvailability=" + bVar + ", marketAvailability=" + aVar + ")";
    }
}

package Sr;

import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LSr/a;", "", "LTJ/g;", "LSr/a$a;", "invoke", "()LTJ/g;", "a", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u0014\u001b\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0018\u0010\r¨\u0006 "}, d2 = {"LSr/a$a;", "", "", "isUserLocationAllowed", "LSr/a$a$a;", "bounds", "", "minZoomPreference", "", "customNavigationUrl", "<init>", "(ZLSr/a$a$a;Ljava/lang/Float;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "LSr/a$a$a;", "()LSr/a$a$a;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "Ljava/lang/String;", "e", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sr.a$a  reason: collision with other inner class name */
    public static final class C1810a {

        /* renamed from: e  reason: collision with root package name */
        public static final b f87318e = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f87319a;

        /* renamed from: b  reason: collision with root package name */
        private final C1811a f87320b;

        /* renamed from: c  reason: collision with root package name */
        private final Float f87321c;

        /* renamed from: d  reason: collision with root package name */
        private final String f87322d;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LSr/a$a$a;", "", "LSr/a$a$c;", "northEast", "southWest", "<init>", "(LSr/a$a$c;LSr/a$a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSr/a$a$c;", "()LSr/a$a$c;", "b", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sr.a$a$a  reason: collision with other inner class name */
        public static final class C1811a {

            /* renamed from: a  reason: collision with root package name */
            private final c f87323a;

            /* renamed from: b  reason: collision with root package name */
            private final c f87324b;

            public C1811a(c cVar, c cVar2) {
                C17542s.j(cVar, "northEast");
                C17542s.j(cVar2, "southWest");
                this.f87323a = cVar;
                this.f87324b = cVar2;
            }

            public final c a() {
                return this.f87323a;
            }

            public final c b() {
                return this.f87324b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1811a)) {
                    return false;
                }
                C1811a aVar = (C1811a) obj;
                return C17542s.e(this.f87323a, aVar.f87323a) && C17542s.e(this.f87324b, aVar.f87324b);
            }

            public int hashCode() {
                return (this.f87323a.hashCode() * 31) + this.f87324b.hashCode();
            }

            public String toString() {
                c cVar = this.f87323a;
                c cVar2 = this.f87324b;
                return "Bounds(northEast=" + cVar + ", southWest=" + cVar2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LSr/a$a$b;", "", "<init>", "()V", "", "CUSTOM_SEARCH_QUERY_PARAM", "Ljava/lang/String;", "CUSTOM_LAT_PARAM", "CUSTOM_LNG_PARAM", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sr.a$a$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LSr/a$a$c;", "", "", "lat", "lng", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sr.a$a$c */
        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            private final double f87325a;

            /* renamed from: b  reason: collision with root package name */
            private final double f87326b;

            public c(double d10, double d11) {
                this.f87325a = d10;
                this.f87326b = d11;
            }

            public final double a() {
                return this.f87325a;
            }

            public final double b() {
                return this.f87326b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Double.compare(this.f87325a, cVar.f87325a) == 0 && Double.compare(this.f87326b, cVar.f87326b) == 0;
            }

            public int hashCode() {
                return (Double.hashCode(this.f87325a) * 31) + Double.hashCode(this.f87326b);
            }

            public String toString() {
                double d10 = this.f87325a;
                double d11 = this.f87326b;
                return "LatLng(lat=" + d10 + ", lng=" + d11 + ")";
            }
        }

        public C1810a(boolean z10, C1811a aVar, Float f10, String str) {
            this.f87319a = z10;
            this.f87320b = aVar;
            this.f87321c = f10;
            this.f87322d = str;
        }

        public final C1811a a() {
            return this.f87320b;
        }

        public final String b() {
            return this.f87322d;
        }

        public final Float c() {
            return this.f87321c;
        }

        public final boolean d() {
            return this.f87319a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1810a)) {
                return false;
            }
            C1810a aVar = (C1810a) obj;
            return this.f87319a == aVar.f87319a && C17542s.e(this.f87320b, aVar.f87320b) && C17542s.e(this.f87321c, aVar.f87321c) && C17542s.e(this.f87322d, aVar.f87322d);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f87319a) * 31;
            C1811a aVar = this.f87320b;
            int i10 = 0;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Float f10 = this.f87321c;
            int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
            String str = this.f87322d;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            boolean z10 = this.f87319a;
            C1811a aVar = this.f87320b;
            Float f10 = this.f87321c;
            String str = this.f87322d;
            return "MarketSpecificMapConfig(isUserLocationAllowed=" + z10 + ", bounds=" + aVar + ", minZoomPreference=" + f10 + ", customNavigationUrl=" + str + ")";
        }
    }

    C16532g<C1810a> invoke();
}

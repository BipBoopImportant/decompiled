package Od;

import IE.e;
import IE.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ0\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LOd/d;", "", "Lcom/optimizely/ab/d;", "optimizelyUserContext", "LNd/a;", "abTest", "", "LIE/e;", "optimizelyDecideOption", "LOd/d$a;", "a", "(Lcom/optimizely/ab/d;LNd/a;Ljava/util/List;)LOd/d$a;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"LOd/d$a;", "", "c", "a", "b", "LOd/d$a$b;", "LOd/d$a$c;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"LOd/d$a$a;", "", "", "flagKey", "ruleKey", "variationKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Od.d$a$a  reason: collision with other inner class name */
        public static final class C1050a {

            /* renamed from: a  reason: collision with root package name */
            private final String f62139a;

            /* renamed from: b  reason: collision with root package name */
            private final String f62140b;

            /* renamed from: c  reason: collision with root package name */
            private final String f62141c;

            public C1050a(String str, String str2, String str3) {
                C17542s.j(str, "flagKey");
                C17542s.j(str2, "ruleKey");
                C17542s.j(str3, "variationKey");
                this.f62139a = str;
                this.f62140b = str2;
                this.f62141c = str3;
            }

            public final String a() {
                return this.f62139a;
            }

            public final String b() {
                return this.f62140b;
            }

            public final String c() {
                return this.f62141c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1050a)) {
                    return false;
                }
                C1050a aVar = (C1050a) obj;
                return C17542s.e(this.f62139a, aVar.f62139a) && C17542s.e(this.f62140b, aVar.f62140b) && C17542s.e(this.f62141c, aVar.f62141c);
            }

            public int hashCode() {
                return (((this.f62139a.hashCode() * 31) + this.f62140b.hashCode()) * 31) + this.f62141c.hashCode();
            }

            public String toString() {
                String str = this.f62139a;
                String str2 = this.f62140b;
                String str3 = this.f62141c;
                return "DecisionResultData(flagKey=" + str + ", ruleKey=" + str2 + ", variationKey=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LOd/d$a$b;", "LOd/d$a;", "d", "c", "b", "a", "LOd/d$a$b$a;", "LOd/d$a$b$b;", "LOd/d$a$b$c;", "LOd/d$a$b$d;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface b extends a {

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LOd/d$a$b$a;", "LOd/d$a$b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Od.d$a$b$a  reason: collision with other inner class name */
            public static final class C1051a implements b {

                /* renamed from: a  reason: collision with root package name */
                private final String f62142a;

                public C1051a(String str) {
                    C17542s.j(str, "message");
                    this.f62142a = str;
                }

                public final String a() {
                    return this.f62142a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1051a) && C17542s.e(this.f62142a, ((C1051a) obj).f62142a);
                }

                public int hashCode() {
                    return this.f62142a.hashCode();
                }

                public String toString() {
                    String str = this.f62142a;
                    return "FailedToMapAnalyticsFromDecision(message=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOd/d$a$b$b;", "LOd/d$a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Od.d$a$b$b  reason: collision with other inner class name */
            public static final class C1052b implements b {

                /* renamed from: a  reason: collision with root package name */
                public static final C1052b f62143a = new C1052b();

                private C1052b() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1052b);
                }

                public int hashCode() {
                    return 775996557;
                }

                public String toString() {
                    return "IllegalVariantInExperiment";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOd/d$a$b$c;", "LOd/d$a$b;", "LIE/f;", "decision", "<init>", "(LIE/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIE/f;", "()LIE/f;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c implements b {

                /* renamed from: a  reason: collision with root package name */
                private final f f62144a;

                public c(f fVar) {
                    C17542s.j(fVar, "decision");
                    this.f62144a = fVar;
                }

                public final f a() {
                    return this.f62144a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && C17542s.e(this.f62144a, ((c) obj).f62144a);
                }

                public int hashCode() {
                    return this.f62144a.hashCode();
                }

                public String toString() {
                    f fVar = this.f62144a;
                    return "InvalidDecision(decision=" + fVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOd/d$a$b$d;", "LOd/d$a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Od.d$a$b$d  reason: collision with other inner class name */
            public static final class C1053d implements b {

                /* renamed from: a  reason: collision with root package name */
                public static final C1053d f62145a = new C1053d();

                private C1053d() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1053d);
                }

                public int hashCode() {
                    return 947871143;
                }

                public String toString() {
                    return "NoUserContext";
                }
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOd/d$a$c;", "LOd/d$a;", "LOd/d$a$a;", "data", "<init>", "(LOd/d$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOd/d$a$a;", "()LOd/d$a$a;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C1050a f62146a;

            public c(C1050a aVar) {
                C17542s.j(aVar, "data");
                this.f62146a = aVar;
            }

            public final C1050a a() {
                return this.f62146a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f62146a, ((c) obj).f62146a);
            }

            public int hashCode() {
                return this.f62146a.hashCode();
            }

            public String toString() {
                C1050a aVar = this.f62146a;
                return "Success(data=" + aVar + ")";
            }
        }
    }

    a a(com.optimizely.ab.d dVar, Nd.a aVar, List<? extends e> list);
}

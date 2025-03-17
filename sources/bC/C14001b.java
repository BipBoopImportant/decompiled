package bC;

import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import XH.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0004\u001b\u000b\u0019\u001dB-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"LbC/b;", "", "", "isPopularTimesEnabled", "LbC/b$d;", "storeOpeningHours", "LKJ/c;", "LbC/b$a;", "amenitiesOpeningHours", "<init>", "(ZLbC/b$d;LKJ/c;)V", "a", "(ZLbC/b$d;LKJ/c;)LbC/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "LbC/b$d;", "d", "()LbC/b$d;", "c", "LKJ/c;", "()LKJ/c;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bC.b  reason: case insensitive filesystem */
public final class C14001b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f118919a;

    /* renamed from: b  reason: collision with root package name */
    private final d f118920b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<a> f118921c;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t0\b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R/\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R-\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t0\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u0018\u0010#¨\u0006$"}, d2 = {"LbC/b$a;", "", "", "iconRes", "LIC/e;", "name", "LbC/b$c;", "openStatus", "LKJ/c;", "LXH/v;", "", "openingHours", "extras", "<init>", "(ILIC/e;LbC/b$c;LKJ/c;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LIC/e;", "c", "()LIC/e;", "LbC/b$c;", "d", "()LbC/b$c;", "LKJ/c;", "e", "()LKJ/c;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f118922a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f118923b;

        /* renamed from: c  reason: collision with root package name */
        private final c f118924c;

        /* renamed from: d  reason: collision with root package name */
        private final C15987c<v<C13023e, List<C13023e>>> f118925d;

        /* renamed from: e  reason: collision with root package name */
        private final C15987c<v<C13023e, C13023e>> f118926e;

        public a(int i10, C13023e eVar, c cVar, C15987c<? extends v<? extends C13023e, ? extends List<? extends C13023e>>> cVar2, C15987c<? extends v<? extends C13023e, ? extends C13023e>> cVar3) {
            C17542s.j(eVar, "name");
            C17542s.j(cVar, "openStatus");
            C17542s.j(cVar2, "openingHours");
            C17542s.j(cVar3, "extras");
            this.f118922a = i10;
            this.f118923b = eVar;
            this.f118924c = cVar;
            this.f118925d = cVar2;
            this.f118926e = cVar3;
        }

        public final C15987c<v<C13023e, C13023e>> a() {
            return this.f118926e;
        }

        public final int b() {
            return this.f118922a;
        }

        public final C13023e c() {
            return this.f118923b;
        }

        public final c d() {
            return this.f118924c;
        }

        public final C15987c<v<C13023e, List<C13023e>>> e() {
            return this.f118925d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f118922a == aVar.f118922a && C17542s.e(this.f118923b, aVar.f118923b) && C17542s.e(this.f118924c, aVar.f118924c) && C17542s.e(this.f118925d, aVar.f118925d) && C17542s.e(this.f118926e, aVar.f118926e);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f118922a) * 31) + this.f118923b.hashCode()) * 31) + this.f118924c.hashCode()) * 31) + this.f118925d.hashCode()) * 31) + this.f118926e.hashCode();
        }

        public String toString() {
            int i10 = this.f118922a;
            C13023e eVar = this.f118923b;
            c cVar = this.f118924c;
            C15987c<v<C13023e, List<C13023e>>> cVar2 = this.f118925d;
            C15987c<v<C13023e, C13023e>> cVar3 = this.f118926e;
            return "AmenityOpeningHours(iconRes=" + i10 + ", name=" + eVar + ", openStatus=" + cVar + ", openingHours=" + cVar2 + ", extras=" + cVar3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"LbC/b$b;", "", "LIC/e;", "dateLabel", "LKJ/c;", "hoursLabel", "", "reason", "<init>", "(LIC/e;LKJ/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "LKJ/c;", "()LKJ/c;", "c", "Ljava/lang/String;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.b$b  reason: collision with other inner class name */
    public static final class C2970b {

        /* renamed from: d  reason: collision with root package name */
        public static final int f118927d = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f118928a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C13023e> f118929b;

        /* renamed from: c  reason: collision with root package name */
        private final String f118930c;

        public C2970b(C13023e eVar, C15987c<? extends C13023e> cVar, String str) {
            C17542s.j(eVar, "dateLabel");
            C17542s.j(cVar, "hoursLabel");
            this.f118928a = eVar;
            this.f118929b = cVar;
            this.f118930c = str;
        }

        public final C13023e a() {
            return this.f118928a;
        }

        public final C15987c<C13023e> b() {
            return this.f118929b;
        }

        public final String c() {
            return this.f118930c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2970b)) {
                return false;
            }
            C2970b bVar = (C2970b) obj;
            return C17542s.e(this.f118928a, bVar.f118928a) && C17542s.e(this.f118929b, bVar.f118929b) && C17542s.e(this.f118930c, bVar.f118930c);
        }

        public int hashCode() {
            int hashCode = ((this.f118928a.hashCode() * 31) + this.f118929b.hashCode()) * 31;
            String str = this.f118930c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C13023e eVar = this.f118928a;
            C15987c<C13023e> cVar = this.f118929b;
            String str = this.f118930c;
            return "DeviationHours(dateLabel=" + eVar + ", hoursLabel=" + cVar + ", reason=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0005\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"LbC/b$c;", "", "<init>", "()V", "LIC/e;", "a", "()LIC/e;", "nextStatusLabel", "c", "b", "d", "LbC/b$c$a;", "LbC/b$c$b;", "LbC/b$c$c;", "LbC/b$c$d;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.b$c */
    public static abstract class c {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LbC/b$c$a;", "LbC/b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIC/e;", "b", "LIC/e;", "a", "()LIC/e;", "nextStatusLabel", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bC.b$c$a */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f118931a = new a();

            /* renamed from: b  reason: collision with root package name */
            private static final C13023e f118932b = null;

            /* renamed from: c  reason: collision with root package name */
            public static final int f118933c = C13023e.f110931a;

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public C13023e a() {
                return f118932b;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 546953073;
            }

            public String toString() {
                return "Closed";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LbC/b$c$b;", "LbC/b$c;", "LIC/e;", "nextStatusLabel", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bC.b$c$b  reason: collision with other inner class name */
        public static final class C2971b extends c {

            /* renamed from: b  reason: collision with root package name */
            public static final int f118934b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f118935a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2971b(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "nextStatusLabel");
                this.f118935a = eVar;
            }

            public C13023e a() {
                return this.f118935a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2971b) && C17542s.e(this.f118935a, ((C2971b) obj).f118935a);
            }

            public int hashCode() {
                return this.f118935a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f118935a;
                return "OnBreak(nextStatusLabel=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LbC/b$c$c;", "LbC/b$c;", "LIC/e;", "nextStatusLabel", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bC.b$c$c  reason: collision with other inner class name */
        public static final class C2972c extends c {

            /* renamed from: b  reason: collision with root package name */
            public static final int f118936b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f118937a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2972c(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "nextStatusLabel");
                this.f118937a = eVar;
            }

            public C13023e a() {
                return this.f118937a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2972c) && C17542s.e(this.f118937a, ((C2972c) obj).f118937a);
            }

            public int hashCode() {
                return this.f118937a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f118937a;
                return "Open(nextStatusLabel=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LbC/b$c$d;", "LbC/b$c;", "LIC/e;", "nextStatusLabel", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bC.b$c$d */
        public static final class d extends c {

            /* renamed from: b  reason: collision with root package name */
            public static final int f118938b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f118939a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "nextStatusLabel");
                this.f118939a = eVar;
            }

            public C13023e a() {
                return this.f118939a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f118939a, ((d) obj).f118939a);
            }

            public int hashCode() {
                return this.f118939a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f118939a;
                return "OpensSoon(nextStatusLabel=" + eVar + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract C13023e a();

        private c() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001BS\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R/\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"LbC/b$d;", "", "LKJ/c;", "LXH/v;", "LIC/e;", "openingHours", "LbC/b$b;", "deviationHours", "extras", "<init>", "(LKJ/c;LKJ/c;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "c", "()LKJ/c;", "b", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.b$d */
    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final int f118940d = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<v<C13023e, C15987c<C13023e>>> f118941a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C2970b> f118942b;

        /* renamed from: c  reason: collision with root package name */
        private final C15987c<v<C13023e, C13023e>> f118943c;

        public d(C15987c<? extends v<? extends C13023e, ? extends C15987c<? extends C13023e>>> cVar, C15987c<C2970b> cVar2, C15987c<? extends v<? extends C13023e, ? extends C13023e>> cVar3) {
            C17542s.j(cVar, "openingHours");
            C17542s.j(cVar2, "deviationHours");
            C17542s.j(cVar3, "extras");
            this.f118941a = cVar;
            this.f118942b = cVar2;
            this.f118943c = cVar3;
        }

        public final C15987c<C2970b> a() {
            return this.f118942b;
        }

        public final C15987c<v<C13023e, C13023e>> b() {
            return this.f118943c;
        }

        public final C15987c<v<C13023e, C15987c<C13023e>>> c() {
            return this.f118941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f118941a, dVar.f118941a) && C17542s.e(this.f118942b, dVar.f118942b) && C17542s.e(this.f118943c, dVar.f118943c);
        }

        public int hashCode() {
            return (((this.f118941a.hashCode() * 31) + this.f118942b.hashCode()) * 31) + this.f118943c.hashCode();
        }

        public String toString() {
            C15987c<v<C13023e, C15987c<C13023e>>> cVar = this.f118941a;
            C15987c<C2970b> cVar2 = this.f118942b;
            C15987c<v<C13023e, C13023e>> cVar3 = this.f118943c;
            return "StoreOpeningHours(openingHours=" + cVar + ", deviationHours=" + cVar2 + ", extras=" + cVar3 + ")";
        }
    }

    public C14001b() {
        this(false, (d) null, (C15987c) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C14001b b(C14001b bVar, boolean z10, d dVar, C15987c<a> cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = bVar.f118919a;
        }
        if ((i10 & 2) != 0) {
            dVar = bVar.f118920b;
        }
        if ((i10 & 4) != 0) {
            cVar = bVar.f118921c;
        }
        return bVar.a(z10, dVar, cVar);
    }

    public final C14001b a(boolean z10, d dVar, C15987c<a> cVar) {
        C17542s.j(cVar, "amenitiesOpeningHours");
        return new C14001b(z10, dVar, cVar);
    }

    public final C15987c<a> c() {
        return this.f118921c;
    }

    public final d d() {
        return this.f118920b;
    }

    public final boolean e() {
        return this.f118919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14001b)) {
            return false;
        }
        C14001b bVar = (C14001b) obj;
        return this.f118919a == bVar.f118919a && C17542s.e(this.f118920b, bVar.f118920b) && C17542s.e(this.f118921c, bVar.f118921c);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f118919a) * 31;
        d dVar = this.f118920b;
        return ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f118921c.hashCode();
    }

    public String toString() {
        boolean z10 = this.f118919a;
        d dVar = this.f118920b;
        C15987c<a> cVar = this.f118921c;
        return "State(isPopularTimesEnabled=" + z10 + ", storeOpeningHours=" + dVar + ", amenitiesOpeningHours=" + cVar + ")";
    }

    public C14001b(boolean z10, d dVar, C15987c<a> cVar) {
        C17542s.j(cVar, "amenitiesOpeningHours");
        this.f118919a = z10;
        this.f118920b = dVar;
        this.f118921c = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14001b(boolean z10, d dVar, C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? C15985a.a() : cVar);
    }
}

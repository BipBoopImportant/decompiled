package vh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0003\u0011\u0014\u0016B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0017"}, d2 = {"Lvh/p;", "", "Lvh/p$a;", "dateSpan", "", "text", "<init>", "(Lvh/p$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvh/p$a;", "()Lvh/p$a;", "b", "Ljava/lang/String;", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.p  reason: case insensitive filesystem */
public final class C10339p {

    /* renamed from: a  reason: collision with root package name */
    private final a f77490a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77491b;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvh/p$a;", "", "Lvh/p$b;", "from", "Lvh/p$c;", "to", "<init>", "(Lvh/p$b;Lvh/p$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvh/p$b;", "()Lvh/p$b;", "b", "Lvh/p$c;", "()Lvh/p$c;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.p$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f77492a;

        /* renamed from: b  reason: collision with root package name */
        private final c f77493b;

        public a(b bVar, c cVar) {
            this.f77492a = bVar;
            this.f77493b = cVar;
        }

        public final b a() {
            return this.f77492a;
        }

        public final c b() {
            return this.f77493b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f77492a, aVar.f77492a) && C17542s.e(this.f77493b, aVar.f77493b);
        }

        public int hashCode() {
            b bVar = this.f77492a;
            int i10 = 0;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            c cVar = this.f77493b;
            if (cVar != null) {
                i10 = cVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            b bVar = this.f77492a;
            c cVar = this.f77493b;
            return "DateSpan(from=" + bVar + ", to=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lvh/p$b;", "", "", "dateTime", "presentationPattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.p$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f77494a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77495b;

        public b(String str, String str2) {
            C17542s.j(str, "dateTime");
            C17542s.j(str2, "presentationPattern");
            this.f77494a = str;
            this.f77495b = str2;
        }

        public final String a() {
            return this.f77494a;
        }

        public final String b() {
            return this.f77495b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f77494a, bVar.f77494a) && C17542s.e(this.f77495b, bVar.f77495b);
        }

        public int hashCode() {
            return (this.f77494a.hashCode() * 31) + this.f77495b.hashCode();
        }

        public String toString() {
            String str = this.f77494a;
            String str2 = this.f77495b;
            return "From(dateTime=" + str + ", presentationPattern=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lvh/p$c;", "", "", "dateTime", "presentationPattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.p$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f77496a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77497b;

        public c(String str, String str2) {
            C17542s.j(str, "dateTime");
            C17542s.j(str2, "presentationPattern");
            this.f77496a = str;
            this.f77497b = str2;
        }

        public final String a() {
            return this.f77496a;
        }

        public final String b() {
            return this.f77497b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f77496a, cVar.f77496a) && C17542s.e(this.f77497b, cVar.f77497b);
        }

        public int hashCode() {
            return (this.f77496a.hashCode() * 31) + this.f77497b.hashCode();
        }

        public String toString() {
            String str = this.f77496a;
            String str2 = this.f77497b;
            return "To(dateTime=" + str + ", presentationPattern=" + str2 + ")";
        }
    }

    public C10339p(a aVar, String str) {
        this.f77490a = aVar;
        this.f77491b = str;
    }

    public final a a() {
        return this.f77490a;
    }

    public final String b() {
        return this.f77491b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10339p)) {
            return false;
        }
        C10339p pVar = (C10339p) obj;
        return C17542s.e(this.f77490a, pVar.f77490a) && C17542s.e(this.f77491b, pVar.f77491b);
    }

    public int hashCode() {
        a aVar = this.f77490a;
        int i10 = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f77491b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        a aVar = this.f77490a;
        String str = this.f77491b;
        return "DeliveryDateDetailsFragment(dateSpan=" + aVar + ", text=" + str + ")";
    }
}

package fm;

import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0003\u0013\u0015\u0019B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Lfm/a;", "", "", "Lfm/a$a;", "items", "Lfm/a$b;", "basePriceDetails", "<init>", "(Ljava/util/List;Lfm/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lfm/a$b;", "()Lfm/a$b;", "c", "assemblyservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fm.a  reason: case insensitive filesystem */
public final class C11273a {

    /* renamed from: a  reason: collision with root package name */
    private final List<C2166a> f97431a;

    /* renamed from: b  reason: collision with root package name */
    private final b f97432b;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"Lfm/a$a;", "", "", "itemNo", "", "unitPrice", "subTotalPrice", "<init>", "(Ljava/lang/String;DD)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "getUnitPrice", "()D", "c", "assemblyservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.a$a  reason: collision with other inner class name */
    public static final class C2166a {

        /* renamed from: a  reason: collision with root package name */
        private final String f97433a;

        /* renamed from: b  reason: collision with root package name */
        private final double f97434b;

        /* renamed from: c  reason: collision with root package name */
        private final double f97435c;

        public C2166a(String str, double d10, double d11) {
            C17542s.j(str, "itemNo");
            this.f97433a = str;
            this.f97434b = d10;
            this.f97435c = d11;
        }

        public final String a() {
            return this.f97433a;
        }

        public final double b() {
            return this.f97435c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2166a)) {
                return false;
            }
            C2166a aVar = (C2166a) obj;
            return C17542s.e(this.f97433a, aVar.f97433a) && Double.compare(this.f97434b, aVar.f97434b) == 0 && Double.compare(this.f97435c, aVar.f97435c) == 0;
        }

        public int hashCode() {
            return (((this.f97433a.hashCode() * 31) + Double.hashCode(this.f97434b)) * 31) + Double.hashCode(this.f97435c);
        }

        public String toString() {
            String str = this.f97433a;
            double d10 = this.f97434b;
            double d11 = this.f97435c;
            return "AssemblyDetailsItem(itemNo=" + str + ", unitPrice=" + d10 + ", subTotalPrice=" + d11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfm/a$b;", "", "", "price", "Lfm/a$c;", "type", "<init>", "(DLfm/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Lfm/a$c;", "()Lfm/a$c;", "assemblyservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final double f97436a;

        /* renamed from: b  reason: collision with root package name */
        private final c f97437b;

        public b(double d10, c cVar) {
            C17542s.j(cVar, "type");
            this.f97436a = d10;
            this.f97437b = cVar;
        }

        public final double a() {
            return this.f97436a;
        }

        public final c b() {
            return this.f97437b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f97436a, bVar.f97436a) == 0 && this.f97437b == bVar.f97437b;
        }

        public int hashCode() {
            return (Double.hashCode(this.f97436a) * 31) + this.f97437b.hashCode();
        }

        public String toString() {
            double d10 = this.f97436a;
            c cVar = this.f97437b;
            return "BasePriceDetails(price=" + d10 + ", type=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lfm/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "BASE", "MINIMUM", "assemblyservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.a$c */
    public enum c {
        BASE,
        MINIMUM;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public C11273a(List<C2166a> list, b bVar) {
        C17542s.j(list, "items");
        this.f97431a = list;
        this.f97432b = bVar;
    }

    public final b a() {
        return this.f97432b;
    }

    public final List<C2166a> b() {
        return this.f97431a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11273a)) {
            return false;
        }
        C11273a aVar = (C11273a) obj;
        return C17542s.e(this.f97431a, aVar.f97431a) && C17542s.e(this.f97432b, aVar.f97432b);
    }

    public int hashCode() {
        int hashCode = this.f97431a.hashCode() * 31;
        b bVar = this.f97432b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        List<C2166a> list = this.f97431a;
        b bVar = this.f97432b;
        return "AssemblyServiceDetails(items=" + list + ", basePriceDetails=" + bVar + ")";
    }
}

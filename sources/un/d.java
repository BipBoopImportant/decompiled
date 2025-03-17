package un;

import KJ.C15987c;
import com.ingka.ikea.core.model.KeyBenefit;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11519a;
import lp.C11559a;
import mp.C11588a;
import vn.C12196a;
import vn.C12197b;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lun/d;", "", "h", "e", "f", "o", "d", "c", "q", "n", "g", "a", "k", "p", "l", "j", "i", "b", "r", "m", "Lun/d$a;", "Lun/d$b;", "Lun/d$c;", "Lun/d$d;", "Lun/d$e;", "Lun/d$f;", "Lun/d$g;", "Lun/d$h;", "Lun/d$i;", "Lun/d$j;", "Lun/d$k;", "Lun/d$l;", "Lun/d$m;", "Lun/d$n;", "Lun/d$o;", "Lun/d$p;", "Lun/d$q;", "Lun/d$r;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lun/d$a;", "Lun/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103872a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -873308703;
        }

        public String toString() {
            return "AvailabilityItem";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lun/d$b;", "Lun/d;", "", "title", "", "Lkp/a;", "campaigns", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f103873a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C11519a> f103874b;

        public b(String str, List<? extends C11519a> list) {
            C17542s.j(list, "campaigns");
            this.f103873a = str;
            this.f103874b = list;
        }

        public final List<C11519a> a() {
            return this.f103874b;
        }

        public final String b() {
            return this.f103873a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f103873a, bVar.f103873a) && C17542s.e(this.f103874b, bVar.f103874b);
        }

        public int hashCode() {
            String str = this.f103873a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f103874b.hashCode();
        }

        public String toString() {
            String str = this.f103873a;
            List<C11519a> list = this.f103874b;
            return "CampaignsItem(title=" + str + ", campaigns=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lun/d$c;", "Lun/d;", "", "Lvn/a;", "categories", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final List<C12196a> f103875a;

        public c(List<C12196a> list) {
            C17542s.j(list, "categories");
            this.f103875a = list;
        }

        public final List<C12196a> a() {
            return this.f103875a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f103875a, ((c) obj).f103875a);
        }

        public int hashCode() {
            return this.f103875a.hashCode();
        }

        public String toString() {
            List<C12196a> list = this.f103875a;
            return "Categories(categories=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lun/d$d;", "Lun/d;", "", "", "didYouMean", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: un.d$d  reason: collision with other inner class name */
    public static final class C2470d implements d {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f103876a;

        public C2470d(List<String> list) {
            C17542s.j(list, "didYouMean");
            this.f103876a = list;
        }

        public final List<String> a() {
            return this.f103876a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2470d) && C17542s.e(this.f103876a, ((C2470d) obj).f103876a);
        }

        public int hashCode() {
            return this.f103876a.hashCode();
        }

        public String toString() {
            List<String> list = this.f103876a;
            return "DidYouMeanItem(didYouMean=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lun/d$e;", "Lun/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final e f103877a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1159704455;
        }

        public String toString() {
            return "EmptyHeader";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lun/d$f;", "Lun/d;", "", "id", "", "isSearch", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f103878a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f103879b;

        public f(String str, boolean z10) {
            C17542s.j(str, "id");
            this.f103878a = str;
            this.f103879b = z10;
        }

        public final String a() {
            return this.f103878a;
        }

        public final boolean b() {
            return this.f103879b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f103878a, fVar.f103878a) && this.f103879b == fVar.f103879b;
        }

        public int hashCode() {
            return (this.f103878a.hashCode() * 31) + Boolean.hashCode(this.f103879b);
        }

        public String toString() {
            String str = this.f103878a;
            boolean z10 = this.f103879b;
            return "EmptyResultHeaderItem(id=" + str + ", isSearch=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lun/d$g;", "Lun/d;", "", "Lvn/b;", "filters", "Lvn/c;", "sortOptions", "", "totalNumberOfProducts", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "I", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements d {

        /* renamed from: a  reason: collision with root package name */
        private final List<C12197b> f103880a;

        /* renamed from: b  reason: collision with root package name */
        private final List<vn.c> f103881b;

        /* renamed from: c  reason: collision with root package name */
        private final int f103882c;

        public g(List<C12197b> list, List<vn.c> list2, int i10) {
            C17542s.j(list, "filters");
            C17542s.j(list2, "sortOptions");
            this.f103880a = list;
            this.f103881b = list2;
            this.f103882c = i10;
        }

        public final List<C12197b> a() {
            return this.f103880a;
        }

        public final List<vn.c> b() {
            return this.f103881b;
        }

        public final int c() {
            return this.f103882c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C17542s.e(this.f103880a, gVar.f103880a) && C17542s.e(this.f103881b, gVar.f103881b) && this.f103882c == gVar.f103882c;
        }

        public int hashCode() {
            return (((this.f103880a.hashCode() * 31) + this.f103881b.hashCode()) * 31) + Integer.hashCode(this.f103882c);
        }

        public String toString() {
            List<C12197b> list = this.f103880a;
            List<vn.c> list2 = this.f103881b;
            int i10 = this.f103882c;
            return "FilterItem(filters=" + list + ", sortOptions=" + list2 + ", totalNumberOfProducts=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lun/d$h;", "Lun/d;", "Lvn/d;", "header", "<init>", "(Lvn/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvn/d;", "()Lvn/d;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements d {

        /* renamed from: a  reason: collision with root package name */
        private final vn.d f103883a;

        public h(vn.d dVar) {
            C17542s.j(dVar, "header");
            this.f103883a = dVar;
        }

        public final vn.d a() {
            return this.f103883a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C17542s.e(this.f103883a, ((h) obj).f103883a);
        }

        public int hashCode() {
            return this.f103883a.hashCode();
        }

        public String toString() {
            vn.d dVar = this.f103883a;
            return "HeaderItem(header=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lun/d$i;", "Lun/d;", "", "title", "", "Lmp/a;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f103884a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C11588a> f103885b;

        public i(String str, List<C11588a> list) {
            C17542s.j(list, "items");
            this.f103884a = str;
            this.f103885b = list;
        }

        public final List<C11588a> a() {
            return this.f103885b;
        }

        public final String b() {
            return this.f103884a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return C17542s.e(this.f103884a, iVar.f103884a) && C17542s.e(this.f103885b, iVar.f103885b);
        }

        public int hashCode() {
            String str = this.f103884a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f103885b.hashCode();
        }

        public String toString() {
            String str = this.f103884a;
            List<C11588a> list = this.f103885b;
            return "InspirationPairItem(title=" + str + ", items=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lun/d$j;", "Lun/d;", "", "title", "Lmp/a;", "item", "<init>", "(Ljava/lang/String;Lmp/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lmp/a;", "()Lmp/a;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f103886a;

        /* renamed from: b  reason: collision with root package name */
        private final C11588a f103887b;

        public j(String str, C11588a aVar) {
            C17542s.j(aVar, "item");
            this.f103886a = str;
            this.f103887b = aVar;
        }

        public final C11588a a() {
            return this.f103887b;
        }

        public final String b() {
            return this.f103886a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return C17542s.e(this.f103886a, jVar.f103886a) && C17542s.e(this.f103887b, jVar.f103887b);
        }

        public int hashCode() {
            String str = this.f103886a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f103887b.hashCode();
        }

        public String toString() {
            String str = this.f103886a;
            C11588a aVar = this.f103887b;
            return "InspirationSingleItem(title=" + str + ", item=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lun/d$k;", "Lun/d;", "", "title", "", "Lcom/ingka/ikea/core/model/KeyBenefit;", "keyBenefits", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f103888a;

        /* renamed from: b  reason: collision with root package name */
        private final List<KeyBenefit> f103889b;

        public k(String str, List<KeyBenefit> list) {
            C17542s.j(list, "keyBenefits");
            this.f103888a = str;
            this.f103889b = list;
        }

        public final List<KeyBenefit> a() {
            return this.f103889b;
        }

        public final String b() {
            return this.f103888a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return C17542s.e(this.f103888a, kVar.f103888a) && C17542s.e(this.f103889b, kVar.f103889b);
        }

        public int hashCode() {
            String str = this.f103888a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f103889b.hashCode();
        }

        public String toString() {
            String str = this.f103888a;
            List<KeyBenefit> list = this.f103889b;
            return "KeyBenefitsItem(title=" + str + ", keyBenefits=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lun/d$l;", "Lun/d;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "product", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductItem;", "()Lcom/ingka/ikea/core/model/product/ProductItem;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ProductItem f103890a;

        public l(ProductItem productItem) {
            C17542s.j(productItem, "product");
            this.f103890a = productItem;
        }

        public final ProductItem a() {
            return this.f103890a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && C17542s.e(this.f103890a, ((l) obj).f103890a);
        }

        public int hashCode() {
            return this.f103890a.hashCode();
        }

        public String toString() {
            ProductItem productItem = this.f103890a;
            return "ProductItemWrapper(product=" + productItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lun/d$m;", "Lun/d;", "LKJ/c;", "", "publisherDiagnostics", "<init>", "(LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements d {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<String> f103891a;

        public m(C15987c<String> cVar) {
            C17542s.j(cVar, "publisherDiagnostics");
            this.f103891a = cVar;
        }

        public final C15987c<String> a() {
            return this.f103891a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && C17542s.e(this.f103891a, ((m) obj).f103891a);
        }

        public int hashCode() {
            return this.f103891a.hashCode();
        }

        public String toString() {
            C15987c<String> cVar = this.f103891a;
            return "PublisherDiagnosticsItem(publisherDiagnostics=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lun/d$n;", "Lun/d;", "", "title", "", "Llp/a;", "stories", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f103892a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C11559a> f103893b;

        public n(String str, List<C11559a> list) {
            C17542s.j(list, "stories");
            this.f103892a = str;
            this.f103893b = list;
        }

        public final List<C11559a> a() {
            return this.f103893b;
        }

        public final String b() {
            return this.f103892a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return C17542s.e(this.f103892a, nVar.f103892a) && C17542s.e(this.f103893b, nVar.f103893b);
        }

        public int hashCode() {
            String str = this.f103892a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f103893b.hashCode();
        }

        public String toString() {
            String str = this.f103892a;
            List<C11559a> list = this.f103893b;
            return "StoriesCarousel(title=" + str + ", stories=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lun/d$o;", "Lun/d;", "Lkp/l;", "suggestions", "<init>", "(Lkp/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/l;", "()Lkp/l;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o implements d {

        /* renamed from: a  reason: collision with root package name */
        private final kp.l f103894a;

        public o(kp.l lVar) {
            C17542s.j(lVar, "suggestions");
            this.f103894a = lVar;
        }

        public final kp.l a() {
            return this.f103894a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && C17542s.e(this.f103894a, ((o) obj).f103894a);
        }

        public int hashCode() {
            return this.f103894a.hashCode();
        }

        public String toString() {
            kp.l lVar = this.f103894a;
            return "SuggestionItem(suggestions=" + lVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lun/d$p;", "Lun/d;", "", "totalNumberOfProducts", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f103895a;

        public p(int i10) {
            this.f103895a = i10;
        }

        public final int a() {
            return this.f103895a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f103895a == ((p) obj).f103895a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f103895a);
        }

        public String toString() {
            int i10 = this.f103895a;
            return "TotalCountItem(totalNumberOfProducts=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lun/d$q;", "Lun/d;", "Lkp/m;", "visualMessage", "<init>", "(Lkp/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/m;", "()Lkp/m;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class q implements d {

        /* renamed from: a  reason: collision with root package name */
        private final kp.m f103896a;

        public q(kp.m mVar) {
            C17542s.j(mVar, "visualMessage");
            this.f103896a = mVar;
        }

        public final kp.m a() {
            return this.f103896a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && C17542s.e(this.f103896a, ((q) obj).f103896a);
        }

        public int hashCode() {
            return this.f103896a.hashCode();
        }

        public String toString() {
            kp.m mVar = this.f103896a;
            return "VisualMessageItem(visualMessage=" + mVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lun/d$r;", "Lun/d;", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class r implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f103897a;

        /* renamed from: b  reason: collision with root package name */
        private final String f103898b;

        public r(String str, String str2) {
            C17542s.j(str, "title");
            C17542s.j(str2, "url");
            this.f103897a = str;
            this.f103898b = str2;
        }

        public final String a() {
            return this.f103897a;
        }

        public final String b() {
            return this.f103898b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return C17542s.e(this.f103897a, rVar.f103897a) && C17542s.e(this.f103898b, rVar.f103898b);
        }

        public int hashCode() {
            return (this.f103897a.hashCode() * 31) + this.f103898b.hashCode();
        }

        public String toString() {
            String str = this.f103897a;
            String str2 = this.f103898b;
            return "WebViewHero(title=" + str + ", url=" + str2 + ")";
        }
    }
}

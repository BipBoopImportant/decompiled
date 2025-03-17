package RC;

import IC.C13023e;
import KJ.C15987c;
import RC.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001:\u0004('\u001f#B\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b,\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b(\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b*\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b'\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b2\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001f\u00104¨\u00065"}, d2 = {"LRC/m;", "", "LIC/e;", "title", "LRC/m$c;", "products", "delivery", "services", "savings", "tax", "LRC/m$d;", "totalPrice", "familyPromotionText", "LRC/m$b;", "familyRewardsPromotion", "disclaimer", "transactions", "LRC/m$a;", "amountLeftToPay", "<init>", "(LIC/e;LRC/m$c;LRC/m$c;LRC/m$c;LRC/m$c;LRC/m$c;LRC/m$d;LIC/e;LRC/m$b;LIC/e;LRC/m$c;LRC/m$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "j", "()LIC/e;", "b", "LRC/m$c;", "f", "()LRC/m$c;", "c", "d", "h", "e", "g", "i", "LRC/m$d;", "k", "()LRC/m$d;", "LRC/m$b;", "()LRC/m$b;", "l", "LRC/m$a;", "()LRC/m$a;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: m  reason: collision with root package name */
    public static final int f115340m = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f115341a;

    /* renamed from: b  reason: collision with root package name */
    private final c f115342b;

    /* renamed from: c  reason: collision with root package name */
    private final c f115343c;

    /* renamed from: d  reason: collision with root package name */
    private final c f115344d;

    /* renamed from: e  reason: collision with root package name */
    private final c f115345e;

    /* renamed from: f  reason: collision with root package name */
    private final c f115346f;

    /* renamed from: g  reason: collision with root package name */
    private final d f115347g;

    /* renamed from: h  reason: collision with root package name */
    private final C13023e f115348h;

    /* renamed from: i  reason: collision with root package name */
    private final b f115349i;

    /* renamed from: j  reason: collision with root package name */
    private final C13023e f115350j;

    /* renamed from: k  reason: collision with root package name */
    private final c f115351k;

    /* renamed from: l  reason: collision with root package name */
    private final a f115352l;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LRC/m$a;", "", "LRC/m$d;", "value", "LKJ/c;", "LRC/m$a$a;", "transactions", "<init>", "(LRC/m$d;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRC/m$d;", "b", "()LRC/m$d;", "LKJ/c;", "()LKJ/c;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final d f115353a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C2837a> f115354b;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001c"}, d2 = {"LRC/m$a$a;", "", "", "id", "LIC/e;", "label", "subLabel", "value", "deleteTransactionLabel", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;Ljava/lang/String;LIC/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LIC/e;", "c", "()LIC/e;", "d", "e", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RC.m$a$a  reason: collision with other inner class name */
        public static final class C2837a {

            /* renamed from: f  reason: collision with root package name */
            public static final int f115355f = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final String f115356a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f115357b;

            /* renamed from: c  reason: collision with root package name */
            private final C13023e f115358c;

            /* renamed from: d  reason: collision with root package name */
            private final String f115359d;

            /* renamed from: e  reason: collision with root package name */
            private final C13023e f115360e;

            public C2837a(String str, C13023e eVar, C13023e eVar2, String str2, C13023e eVar3) {
                C17542s.j(str, "id");
                C17542s.j(eVar, "label");
                C17542s.j(str2, "value");
                C17542s.j(eVar3, "deleteTransactionLabel");
                this.f115356a = str;
                this.f115357b = eVar;
                this.f115358c = eVar2;
                this.f115359d = str2;
                this.f115360e = eVar3;
            }

            public final C13023e a() {
                return this.f115360e;
            }

            public final String b() {
                return this.f115356a;
            }

            public final C13023e c() {
                return this.f115357b;
            }

            public final C13023e d() {
                return this.f115358c;
            }

            public final String e() {
                return this.f115359d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2837a)) {
                    return false;
                }
                C2837a aVar = (C2837a) obj;
                return C17542s.e(this.f115356a, aVar.f115356a) && C17542s.e(this.f115357b, aVar.f115357b) && C17542s.e(this.f115358c, aVar.f115358c) && C17542s.e(this.f115359d, aVar.f115359d) && C17542s.e(this.f115360e, aVar.f115360e);
            }

            public int hashCode() {
                int hashCode = ((this.f115356a.hashCode() * 31) + this.f115357b.hashCode()) * 31;
                C13023e eVar = this.f115358c;
                return ((((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f115359d.hashCode()) * 31) + this.f115360e.hashCode();
            }

            public String toString() {
                String str = this.f115356a;
                C13023e eVar = this.f115357b;
                C13023e eVar2 = this.f115358c;
                String str2 = this.f115359d;
                C13023e eVar3 = this.f115360e;
                return "Transaction(id=" + str + ", label=" + eVar + ", subLabel=" + eVar2 + ", value=" + str2 + ", deleteTransactionLabel=" + eVar3 + ")";
            }
        }

        public a(d dVar, C15987c<C2837a> cVar) {
            C17542s.j(dVar, "value");
            C17542s.j(cVar, "transactions");
            this.f115353a = dVar;
            this.f115354b = cVar;
        }

        public final C15987c<C2837a> a() {
            return this.f115354b;
        }

        public final d b() {
            return this.f115353a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f115353a, aVar.f115353a) && C17542s.e(this.f115354b, aVar.f115354b);
        }

        public int hashCode() {
            return (this.f115353a.hashCode() * 31) + this.f115354b.hashCode();
        }

        public String toString() {
            d dVar = this.f115353a;
            C15987c<C2837a> cVar = this.f115354b;
            return "AmountLeftToPay(value=" + dVar + ", transactions=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LRC/m$b;", "", "LIC/e;", "text", "", "highlight", "<init>", "(LIC/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "Ljava/lang/String;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f115361c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f115362a;

        /* renamed from: b  reason: collision with root package name */
        private final String f115363b;

        public b(C13023e eVar, String str) {
            C17542s.j(eVar, "text");
            C17542s.j(str, "highlight");
            this.f115362a = eVar;
            this.f115363b = str;
        }

        public final String a() {
            return this.f115363b;
        }

        public final C13023e b() {
            return this.f115362a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f115362a, bVar.f115362a) && C17542s.e(this.f115363b, bVar.f115363b);
        }

        public int hashCode() {
            return (this.f115362a.hashCode() * 31) + this.f115363b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f115362a;
            String str = this.f115363b;
            return "FamilyRewardsPromotion(text=" + eVar + ", highlight=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"LRC/m$d;", "", "LIC/e;", "label", "LRC/n$a;", "price", "", "LRC/m$c$a;", "taxEntries", "<init>", "(LIC/e;LRC/n$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "LRC/n$a;", "()LRC/n$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f115370a;

        /* renamed from: b  reason: collision with root package name */
        private final n.a f115371b;

        /* renamed from: c  reason: collision with root package name */
        private final List<c.a> f115372c;

        public d(C13023e eVar, n.a aVar, List<c.a> list) {
            C17542s.j(eVar, "label");
            C17542s.j(aVar, "price");
            C17542s.j(list, "taxEntries");
            this.f115370a = eVar;
            this.f115371b = aVar;
            this.f115372c = list;
        }

        public final C13023e a() {
            return this.f115370a;
        }

        public final n.a b() {
            return this.f115371b;
        }

        public final List<c.a> c() {
            return this.f115372c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f115370a, dVar.f115370a) && C17542s.e(this.f115371b, dVar.f115371b) && C17542s.e(this.f115372c, dVar.f115372c);
        }

        public int hashCode() {
            return (((this.f115370a.hashCode() * 31) + this.f115371b.hashCode()) * 31) + this.f115372c.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f115370a;
            n.a aVar = this.f115371b;
            List<c.a> list = this.f115372c;
            return "TotalPrice(label=" + eVar + ", price=" + aVar + ", taxEntries=" + list + ")";
        }
    }

    public m(C13023e eVar, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, d dVar, C13023e eVar2, b bVar, C13023e eVar3, c cVar6, a aVar) {
        C17542s.j(cVar, "products");
        C17542s.j(dVar, "totalPrice");
        this.f115341a = eVar;
        this.f115342b = cVar;
        this.f115343c = cVar2;
        this.f115344d = cVar3;
        this.f115345e = cVar4;
        this.f115346f = cVar5;
        this.f115347g = dVar;
        this.f115348h = eVar2;
        this.f115349i = bVar;
        this.f115350j = eVar3;
        this.f115351k = cVar6;
        this.f115352l = aVar;
    }

    public final a a() {
        return this.f115352l;
    }

    public final c b() {
        return this.f115343c;
    }

    public final C13023e c() {
        return this.f115350j;
    }

    public final C13023e d() {
        return this.f115348h;
    }

    public final b e() {
        return this.f115349i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C17542s.e(this.f115341a, mVar.f115341a) && C17542s.e(this.f115342b, mVar.f115342b) && C17542s.e(this.f115343c, mVar.f115343c) && C17542s.e(this.f115344d, mVar.f115344d) && C17542s.e(this.f115345e, mVar.f115345e) && C17542s.e(this.f115346f, mVar.f115346f) && C17542s.e(this.f115347g, mVar.f115347g) && C17542s.e(this.f115348h, mVar.f115348h) && C17542s.e(this.f115349i, mVar.f115349i) && C17542s.e(this.f115350j, mVar.f115350j) && C17542s.e(this.f115351k, mVar.f115351k) && C17542s.e(this.f115352l, mVar.f115352l);
    }

    public final c f() {
        return this.f115342b;
    }

    public final c g() {
        return this.f115345e;
    }

    public final c h() {
        return this.f115344d;
    }

    public int hashCode() {
        C13023e eVar = this.f115341a;
        int i10 = 0;
        int hashCode = (((eVar == null ? 0 : eVar.hashCode()) * 31) + this.f115342b.hashCode()) * 31;
        c cVar = this.f115343c;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f115344d;
        int hashCode3 = (hashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f115345e;
        int hashCode4 = (hashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        c cVar4 = this.f115346f;
        int hashCode5 = (((hashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31) + this.f115347g.hashCode()) * 31;
        C13023e eVar2 = this.f115348h;
        int hashCode6 = (hashCode5 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        b bVar = this.f115349i;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C13023e eVar3 = this.f115350j;
        int hashCode8 = (hashCode7 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        c cVar5 = this.f115351k;
        int hashCode9 = (hashCode8 + (cVar5 == null ? 0 : cVar5.hashCode())) * 31;
        a aVar = this.f115352l;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode9 + i10;
    }

    public final c i() {
        return this.f115346f;
    }

    public final C13023e j() {
        return this.f115341a;
    }

    public final d k() {
        return this.f115347g;
    }

    public final c l() {
        return this.f115351k;
    }

    public String toString() {
        C13023e eVar = this.f115341a;
        c cVar = this.f115342b;
        c cVar2 = this.f115343c;
        c cVar3 = this.f115344d;
        c cVar4 = this.f115345e;
        c cVar5 = this.f115346f;
        d dVar = this.f115347g;
        C13023e eVar2 = this.f115348h;
        b bVar = this.f115349i;
        C13023e eVar3 = this.f115350j;
        c cVar6 = this.f115351k;
        a aVar = this.f115352l;
        return "OrderSummaryUiState(title=" + eVar + ", products=" + cVar + ", delivery=" + cVar2 + ", services=" + cVar3 + ", savings=" + cVar4 + ", tax=" + cVar5 + ", totalPrice=" + dVar + ", familyPromotionText=" + eVar2 + ", familyRewardsPromotion=" + bVar + ", disclaimer=" + eVar3 + ", transactions=" + cVar6 + ", amountLeftToPay=" + aVar + ")";
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LRC/m$c;", "", "LIC/e;", "title", "", "value", "", "LRC/m$c$a;", "entries", "<init>", "(LIC/e;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f115364a;

        /* renamed from: b  reason: collision with root package name */
        private final String f115365b;

        /* renamed from: c  reason: collision with root package name */
        private final List<a> f115366c;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"LRC/m$c$a;", "", "LIC/e;", "label", "", "value", "<init>", "(LIC/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "Ljava/lang/String;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: c  reason: collision with root package name */
            public static final int f115367c = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f115368a;

            /* renamed from: b  reason: collision with root package name */
            private final String f115369b;

            public a(C13023e eVar, String str) {
                C17542s.j(eVar, "label");
                this.f115368a = eVar;
                this.f115369b = str;
            }

            public final C13023e a() {
                return this.f115368a;
            }

            public final String b() {
                return this.f115369b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f115368a, aVar.f115368a) && C17542s.e(this.f115369b, aVar.f115369b);
            }

            public int hashCode() {
                int hashCode = this.f115368a.hashCode() * 31;
                String str = this.f115369b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                C13023e eVar = this.f115368a;
                String str = this.f115369b;
                return "PriceRow(label=" + eVar + ", value=" + str + ")";
            }
        }

        public c(C13023e eVar, String str, List<a> list) {
            C17542s.j(list, "entries");
            this.f115364a = eVar;
            this.f115365b = str;
            this.f115366c = list;
        }

        public final List<a> a() {
            return this.f115366c;
        }

        public final C13023e b() {
            return this.f115364a;
        }

        public final String c() {
            return this.f115365b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f115364a, cVar.f115364a) && C17542s.e(this.f115365b, cVar.f115365b) && C17542s.e(this.f115366c, cVar.f115366c);
        }

        public int hashCode() {
            C13023e eVar = this.f115364a;
            int i10 = 0;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            String str = this.f115365b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return ((hashCode + i10) * 31) + this.f115366c.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f115364a;
            String str = this.f115365b;
            List<a> list = this.f115366c;
            return "PriceEntry(title=" + eVar + ", value=" + str + ", entries=" + list + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(C13023e eVar, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(eVar, (i10 & 2) != 0 ? null : str, list);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(IC.C13023e r16, RC.m.c r17, RC.m.c r18, RC.m.c r19, RC.m.c r20, RC.m.c r21, RC.m.d r22, IC.C13023e r23, RC.m.b r24, IC.C13023e r25, RC.m.c r26, RC.m.a r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000e
            int r1 = Oo.b.f84363E5
            IC.e r1 = IC.C13026h.a(r1)
            r3 = r1
            goto L_0x0010
        L_0x000e:
            r3 = r16
        L_0x0010:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0017
            r0 = 0
            r11 = r0
            goto L_0x0019
        L_0x0017:
            r11 = r24
        L_0x0019:
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r25
            r13 = r26
            r14 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.m.<init>(IC.e, RC.m$c, RC.m$c, RC.m$c, RC.m$c, RC.m$c, RC.m$d, IC.e, RC.m$b, IC.e, RC.m$c, RC.m$a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

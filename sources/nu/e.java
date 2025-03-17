package nu;

import IB.C13018a;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15990f;
import Op.d1;
import TJ.C16532g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zt.C12554a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnu/e;", "", "LTJ/g;", "Lnu/e$a;", "invoke", "()LTJ/g;", "a", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lnu/e$a;", "", "c", "b", "f", "a", "j", "h", "d", "i", "g", "e", "Lnu/e$a$a;", "Lnu/e$a$b;", "Lnu/e$a$c;", "Lnu/e$a$d;", "Lnu/e$a$e;", "Lnu/e$a$f;", "Lnu/e$a$g;", "Lnu/e$a$h;", "Lnu/e$a$i;", "Lnu/e$a$j;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnu/e$a$a;", "Lnu/e$a;", "Lzt/a;", "foodMobileData", "<init>", "(Lzt/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzt/a;", "()Lzt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nu.e$a$a  reason: collision with other inner class name */
        public static final class C2326a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C12554a f100208a;

            public C2326a(C12554a aVar) {
                this.f100208a = aVar;
            }

            public final C12554a a() {
                return this.f100208a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2326a) && C17542s.e(this.f100208a, ((C2326a) obj).f100208a);
            }

            public int hashCode() {
                C12554a aVar = this.f100208a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                C12554a aVar = this.f100208a;
                return "FoodMobileEntry(foodMobileData=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnu/e$a$b;", "Lnu/e$a;", "", "storeId", "storeName", "", "isShopGoAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f100209a;

            /* renamed from: b  reason: collision with root package name */
            private final String f100210b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f100211c;

            public b(String str, String str2, boolean z10) {
                C17542s.j(str, "storeId");
                C17542s.j(str2, "storeName");
                this.f100209a = str;
                this.f100210b = str2;
                this.f100211c = z10;
            }

            public final String a() {
                return this.f100209a;
            }

            public final String b() {
                return this.f100210b;
            }

            public final boolean c() {
                return this.f100211c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f100209a, bVar.f100209a) && C17542s.e(this.f100210b, bVar.f100210b) && this.f100211c == bVar.f100211c;
            }

            public int hashCode() {
                return (((this.f100209a.hashCode() * 31) + this.f100210b.hashCode()) * 31) + Boolean.hashCode(this.f100211c);
            }

            public String toString() {
                String str = this.f100209a;
                String str2 = this.f100210b;
                boolean z10 = this.f100211c;
                return "InitialStoreLoaded(storeId=" + str + ", storeName=" + str2 + ", isShopGoAvailable=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnu/e$a$c;", "Lnu/e$a;", "LKJ/f;", "LGt/c;", "features", "<init>", "(LKJ/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/f;", "()LKJ/f;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: b  reason: collision with root package name */
            public static final int f100212b;

            /* renamed from: a  reason: collision with root package name */
            private final C15990f<Gt.c> f100213a;

            static {
                int i10 = Gh.c.f60737b | Gh.d.f60739b;
                int i11 = C13023e.f110931a;
                f100212b = i10 | i11 | i11;
            }

            public c() {
                this((C15990f) null, 1, (DefaultConstructorMarker) null);
            }

            public final C15990f<Gt.c> a() {
                return this.f100213a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f100213a, ((c) obj).f100213a);
            }

            public int hashCode() {
                return this.f100213a.hashCode();
            }

            public String toString() {
                C15990f<Gt.c> fVar = this.f100213a;
                return "Onboarding(features=" + fVar + ")";
            }

            public c(C15990f<Gt.c> fVar) {
                C17542s.j(fVar, "features");
                this.f100213a = fVar;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ c(C15990f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? C15985a.a() : fVar);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnu/e$a$d;", "Lnu/e$a;", "LGB/e;", "Lcom/ingka/ikea/instore/impl/usecase/PopularTimesLiveData;", "popularTimesLiveData", "<init>", "(LGB/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGB/e;", "()LGB/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: a  reason: collision with root package name */
            private final GB.e f100214a;

            public d(GB.e eVar) {
                this.f100214a = eVar;
            }

            public final GB.e a() {
                return this.f100214a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f100214a, ((d) obj).f100214a);
            }

            public int hashCode() {
                GB.e eVar = this.f100214a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            public String toString() {
                GB.e eVar = this.f100214a;
                return "PopularTimesLive(popularTimesLiveData=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnu/e$a$e;", "Lnu/e$a;", "LGt/e;", "smallStoreModel", "<init>", "(LGt/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGt/e;", "()LGt/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nu.e$a$e  reason: collision with other inner class name */
        public static final class C2327e implements a {

            /* renamed from: b  reason: collision with root package name */
            public static final int f100215b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final Gt.e f100216a;

            public C2327e(Gt.e eVar) {
                this.f100216a = eVar;
            }

            public final Gt.e a() {
                return this.f100216a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2327e) && C17542s.e(this.f100216a, ((C2327e) obj).f100216a);
            }

            public int hashCode() {
                Gt.e eVar = this.f100216a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            public String toString() {
                Gt.e eVar = this.f100216a;
                return "SmallStoreEntry(smallStoreModel=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lnu/e$a$f;", "Lnu/e$a;", "", "storeId", "storeName", "", "isShopGoAvailable", "", "LIB/a$a$a;", "openingHours", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "d", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f100217a;

            /* renamed from: b  reason: collision with root package name */
            private final String f100218b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f100219c;

            /* renamed from: d  reason: collision with root package name */
            private final List<C13018a.C2677a.C2678a> f100220d;

            public f(String str, String str2, boolean z10, List<C13018a.C2677a.C2678a> list) {
                C17542s.j(str, "storeId");
                C17542s.j(str2, "storeName");
                C17542s.j(list, "openingHours");
                this.f100217a = str;
                this.f100218b = str2;
                this.f100219c = z10;
                this.f100220d = list;
            }

            public final List<C13018a.C2677a.C2678a> a() {
                return this.f100220d;
            }

            public final String b() {
                return this.f100217a;
            }

            public final String c() {
                return this.f100218b;
            }

            public final boolean d() {
                return this.f100219c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return C17542s.e(this.f100217a, fVar.f100217a) && C17542s.e(this.f100218b, fVar.f100218b) && this.f100219c == fVar.f100219c && C17542s.e(this.f100220d, fVar.f100220d);
            }

            public int hashCode() {
                return (((((this.f100217a.hashCode() * 31) + this.f100218b.hashCode()) * 31) + Boolean.hashCode(this.f100219c)) * 31) + this.f100220d.hashCode();
            }

            public String toString() {
                String str = this.f100217a;
                String str2 = this.f100218b;
                boolean z10 = this.f100219c;
                List<C13018a.C2677a.C2678a> list = this.f100220d;
                return "StoreAvailable(storeId=" + str + ", storeName=" + str2 + ", isShopGoAvailable=" + z10 + ", openingHours=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnu/e$a$g;", "Lnu/e$a;", "LMt/a;", "beverageBenefitUiModel", "<init>", "(LMt/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMt/a;", "()LMt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class g implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Mt.a f100221a;

            public g(Mt.a aVar) {
                this.f100221a = aVar;
            }

            public final Mt.a a() {
                return this.f100221a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && C17542s.e(this.f100221a, ((g) obj).f100221a);
            }

            public int hashCode() {
                Mt.a aVar = this.f100221a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                Mt.a aVar = this.f100221a;
                return "StoreBenefit(beverageBenefitUiModel=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lnu/e$a$h;", "Lnu/e$a;", "", "storeId", "", "Ljt/b;", "events", "storeName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class h implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f100222a;

            /* renamed from: b  reason: collision with root package name */
            private final List<jt.b> f100223b;

            /* renamed from: c  reason: collision with root package name */
            private final String f100224c;

            public h(String str, List<jt.b> list, String str2) {
                C17542s.j(str, "storeId");
                C17542s.j(list, "events");
                C17542s.j(str2, "storeName");
                this.f100222a = str;
                this.f100223b = list;
                this.f100224c = str2;
            }

            public final List<jt.b> a() {
                return this.f100223b;
            }

            public final String b() {
                return this.f100222a;
            }

            public final String c() {
                return this.f100224c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return C17542s.e(this.f100222a, hVar.f100222a) && C17542s.e(this.f100223b, hVar.f100223b) && C17542s.e(this.f100224c, hVar.f100224c);
            }

            public int hashCode() {
                return (((this.f100222a.hashCode() * 31) + this.f100223b.hashCode()) * 31) + this.f100224c.hashCode();
            }

            public String toString() {
                String str = this.f100222a;
                List<jt.b> list = this.f100223b;
                String str2 = this.f100224c;
                return "StoreEvents(storeId=" + str + ", events=" + list + ", storeName=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lnu/e$a$i;", "Lnu/e$a;", "", "LOp/d1;", "offers", "", "loading", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class i implements a {

            /* renamed from: a  reason: collision with root package name */
            private final List<d1> f100225a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f100226b;

            public i(List<d1> list, boolean z10) {
                C17542s.j(list, "offers");
                this.f100225a = list;
                this.f100226b = z10;
            }

            public final boolean a() {
                return this.f100226b;
            }

            public final List<d1> b() {
                return this.f100225a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return C17542s.e(this.f100225a, iVar.f100225a) && this.f100226b == iVar.f100226b;
            }

            public int hashCode() {
                return (this.f100225a.hashCode() * 31) + Boolean.hashCode(this.f100226b);
            }

            public String toString() {
                List<d1> list = this.f100225a;
                boolean z10 = this.f100226b;
                return "StoreOffers(offers=" + list + ", loading=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnu/e$a$j;", "Lnu/e$a;", "LGt/g;", "wayfindingData", "<init>", "(LGt/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGt/g;", "()LGt/g;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class j implements a {

            /* renamed from: b  reason: collision with root package name */
            public static final int f100227b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final Gt.g f100228a;

            public j(Gt.g gVar) {
                this.f100228a = gVar;
            }

            public final Gt.g a() {
                return this.f100228a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && C17542s.e(this.f100228a, ((j) obj).f100228a);
            }

            public int hashCode() {
                Gt.g gVar = this.f100228a;
                if (gVar == null) {
                    return 0;
                }
                return gVar.hashCode();
            }

            public String toString() {
                Gt.g gVar = this.f100228a;
                return "WayfindingEntry(wayfindingData=" + gVar + ")";
            }
        }
    }

    C16532g<a> invoke();
}

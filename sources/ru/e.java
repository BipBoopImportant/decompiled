package ru;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/e;", "", "Lx4/o;", "navController", "", "itemNo", "Lru/e$a;", "analyticsData", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Lru/e$a;)V", "wayfinding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {
    void a(C8951o oVar, String str, a aVar);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/e$a;", "", "", "division", "storeId", "Lru/e$a$a;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/e$a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lru/e$a$a;", "()Lru/e$a$a;", "wayfinding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f102155a;

        /* renamed from: b  reason: collision with root package name */
        private final String f102156b;

        /* renamed from: c  reason: collision with root package name */
        private final C2437a f102157c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/e$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "STORE_PAGE", "PIP", "SHOPPING_LIST", "SHOPPING_LIST_STORE_MODAL", "wayfinding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ru.e$a$a  reason: collision with other inner class name */
        public enum C2437a {
            STORE_PAGE,
            PIP,
            SHOPPING_LIST,
            SHOPPING_LIST_STORE_MODAL;

            static {
                C2437a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        public a(String str, String str2, C2437a aVar) {
            C17542s.j(str2, "storeId");
            C17542s.j(aVar, "location");
            this.f102155a = str;
            this.f102156b = str2;
            this.f102157c = aVar;
        }

        public final String a() {
            return this.f102155a;
        }

        public final C2437a b() {
            return this.f102157c;
        }

        public final String c() {
            return this.f102156b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f102155a, aVar.f102155a) && C17542s.e(this.f102156b, aVar.f102156b) && this.f102157c == aVar.f102157c;
        }

        public int hashCode() {
            String str = this.f102155a;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.f102156b.hashCode()) * 31) + this.f102157c.hashCode();
        }

        public String toString() {
            String str = this.f102155a;
            String str2 = this.f102156b;
            C2437a aVar = this.f102157c;
            return "WayfindingAnalyticsData(division=" + str + ", storeId=" + str2 + ", location=" + aVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, C2437a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, str2, aVar);
        }
    }
}

package zG;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.QuickFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LzG/b;", "", "<init>", "()V", "c", "a", "d", "b", "LzG/b$a;", "LzG/b$b;", "LzG/b$c;", "LzG/b$d;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zG.b  reason: case insensitive filesystem */
public abstract class C18748b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LzG/b$a;", "LzG/b;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.b$a */
    public static final class a extends C18748b {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f152766a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f152766a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f152766a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f152766a, ((a) obj).f152766a);
        }

        public int hashCode() {
            return this.f152766a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f152766a;
            return "OnBedDisclaimerClicked(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LzG/b$b;", "LzG/b;", "Lcom/sugarcube/core/network/models/QuickFilter;", "filter", "<init>", "(Lcom/sugarcube/core/network/models/QuickFilter;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/QuickFilter;", "()Lcom/sugarcube/core/network/models/QuickFilter;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.b$b  reason: collision with other inner class name */
    public static final class C4329b extends C18748b {

        /* renamed from: a  reason: collision with root package name */
        private final QuickFilter f152767a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4329b(QuickFilter quickFilter) {
            super((DefaultConstructorMarker) null);
            C17542s.j(quickFilter, "filter");
            this.f152767a = quickFilter;
        }

        public final QuickFilter a() {
            return this.f152767a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4329b) && C17542s.e(this.f152767a, ((C4329b) obj).f152767a);
        }

        public int hashCode() {
            return this.f152767a.hashCode();
        }

        public String toString() {
            QuickFilter quickFilter = this.f152767a;
            return "OnFilterSelected(filter=" + quickFilter + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LzG/b$c;", "LzG/b;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.b$c */
    public static final class c extends C18748b {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f152768a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "cachedCatalogItem");
            this.f152768a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f152768a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f152768a, ((c) obj).f152768a);
        }

        public int hashCode() {
            return this.f152768a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f152768a;
            return "OnItemSelected(cachedCatalogItem=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LzG/b$d;", "LzG/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.b$d */
    public static final class d extends C18748b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f152769a = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1578235351;
        }

        public String toString() {
            return "OnLoadMore";
        }
    }

    public /* synthetic */ C18748b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18748b() {
    }
}

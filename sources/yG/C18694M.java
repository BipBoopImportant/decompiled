package yG;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LyG/M;", "", "<init>", "()V", "f", "d", "g", "c", "b", "a", "e", "LyG/M$a;", "LyG/M$b;", "LyG/M$c;", "LyG/M$d;", "LyG/M$e;", "LyG/M$f;", "LyG/M$g;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yG.M  reason: case insensitive filesystem */
public abstract class C18694M {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyG/M$a;", "LyG/M;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yG.M$a */
    public static final class a extends C18694M {

        /* renamed from: a  reason: collision with root package name */
        public static final a f152592a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1332593792;
        }

        public String toString() {
            return "OnBack";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LyG/M$b;", "LyG/M;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yG.M$b */
    public static final class b extends C18694M {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f152593a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f152593a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f152593a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f152593a, ((b) obj).f152593a);
        }

        public int hashCode() {
            return this.f152593a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f152593a;
            return "OnBedDisclaimerClicked(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LyG/M$c;", "LyG/M;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yG.M$c */
    public static final class c extends C18694M {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f152594a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f152594a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f152594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f152594a, ((c) obj).f152594a);
        }

        public int hashCode() {
            return this.f152594a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f152594a;
            return "OnCatalogItemSelected(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LyG/M$d;", "LyG/M;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "selectedCategory", "<init>", "(Lcom/sugarcube/core/network/models/CatalogCategory;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/CatalogCategory;", "()Lcom/sugarcube/core/network/models/CatalogCategory;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yG.M$d */
    public static final class d extends C18694M {

        /* renamed from: a  reason: collision with root package name */
        private final CatalogCategory f152595a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(CatalogCategory catalogCategory) {
            super((DefaultConstructorMarker) null);
            C17542s.j(catalogCategory, "selectedCategory");
            this.f152595a = catalogCategory;
        }

        public final CatalogCategory a() {
            return this.f152595a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f152595a, ((d) obj).f152595a);
        }

        public int hashCode() {
            return this.f152595a.hashCode();
        }

        public String toString() {
            CatalogCategory catalogCategory = this.f152595a;
            return "OnCategorySelected(selectedCategory=" + catalogCategory + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyG/M$e;", "LyG/M;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yG.M$e */
    public static final class e extends C18694M {

        /* renamed from: a  reason: collision with root package name */
        public static final e f152596a = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1638002305;
        }

        public String toString() {
            return "OnClose";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyG/M$f;", "LyG/M;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yG.M$f */
    public static final class f extends C18694M {

        /* renamed from: a  reason: collision with root package name */
        public static final f f152597a = new f();

        private f() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1850549132;
        }

        public String toString() {
            return "OnLoadMore";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LyG/M$g;", "LyG/M;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "selectedSubCategory", "<init>", "(Lcom/sugarcube/core/network/models/CatalogCategory;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/CatalogCategory;", "()Lcom/sugarcube/core/network/models/CatalogCategory;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yG.M$g */
    public static final class g extends C18694M {

        /* renamed from: a  reason: collision with root package name */
        private final CatalogCategory f152598a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(CatalogCategory catalogCategory) {
            super((DefaultConstructorMarker) null);
            C17542s.j(catalogCategory, "selectedSubCategory");
            this.f152598a = catalogCategory;
        }

        public final CatalogCategory a() {
            return this.f152598a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f152598a, ((g) obj).f152598a);
        }

        public int hashCode() {
            return this.f152598a.hashCode();
        }

        public String toString() {
            CatalogCategory catalogCategory = this.f152598a;
            return "OnSubCategorySelected(selectedSubCategory=" + catalogCategory + ")";
        }
    }

    public /* synthetic */ C18694M(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18694M() {
    }
}

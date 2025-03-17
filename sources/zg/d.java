package zG;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LzG/d;", "", "<init>", "()V", "d", "b", "e", "a", "c", "LzG/d$a;", "LzG/d$b;", "LzG/d$c;", "LzG/d$d;", "LzG/d$e;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LzG/d$a;", "LzG/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f152773a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -263769904;
        }

        public String toString() {
            return "OnBack";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LzG/d$b;", "LzG/d;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f152774a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f152774a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f152774a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f152774a, ((b) obj).f152774a);
        }

        public int hashCode() {
            return this.f152774a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f152774a;
            return "OnBedDisclaimerClicked(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LzG/d$c;", "LzG/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f152775a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 414330671;
        }

        public String toString() {
            return "OnClose";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LzG/d$d;", "LzG/d;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.d$d  reason: collision with other inner class name */
    public static final class C4331d extends d {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f152776a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4331d(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "cachedCatalogItem");
            this.f152776a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f152776a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4331d) && C17542s.e(this.f152776a, ((C4331d) obj).f152776a);
        }

        public int hashCode() {
            return this.f152776a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f152776a;
            return "OnItemSelected(cachedCatalogItem=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LzG/d$e;", "LzG/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final e f152777a = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 341680324;
        }

        public String toString() {
            return "OnLoadMore";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}

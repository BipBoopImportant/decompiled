package dz;

import Q4.g;
import android.content.Context;
import androidx.room.w;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;
import ez.C14437a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Ldz/c;", "", "Landroid/content/Context;", "appContext", "Lez/a;", "scanAndGoConverters", "<init>", "(Landroid/content/Context;Lez/a;)V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "a", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "database", "b", "d", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final d f126346b = new d((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final N4.b f126347c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final N4.b f126348d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static final N4.b f126349e = new C3086c();

    /* renamed from: a  reason: collision with root package name */
    private final ScanAndGoRoomDatabase f126350a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dz/c$a", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends N4.b {
        a() {
            super(12, 13);
        }

        public void migrate(g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_cart_discounts` (`title` TEXT NOT NULL, `coupon` TEXT, `rawValue` REAL NOT NULL, `formatted` TEXT NOT NULL, `currencySymbol` TEXT, PRIMARY KEY(`title`))");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dz/c$b", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends N4.b {
        b() {
            super(13, 14);
        }

        public void migrate(g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_scan_type` (`barcode` TEXT NOT NULL, `productAssortmentSpecialType` TEXT NOT NULL, PRIMARY KEY(`barcode`))");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dz/c$c", "LN4/b;", "LQ4/g;", "db", "LXH/N;", "migrate", "(LQ4/g;)V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dz.c$c  reason: collision with other inner class name */
    public static final class C3086c extends N4.b {
        C3086c() {
            super(16, 17);
        }

        public void migrate(g gVar) {
            C17542s.j(gVar, "db");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_scan_type` (`barcode` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, `productLite` TEXT, `inclTax` REAL NOT NULL DEFAULT 0.0, `collected` INTEGER NOT NULL, `type` TEXT NOT NULL, `isSkipped` INTEGER NOT NULL DEFAULT 0, `enabled` INTEGER, `min` INTEGER, `max` INTEGER, `selected` INTEGER, `itemLocation_title` TEXT NOT NULL, `itemLocation_aisle` TEXT NOT NULL, `itemLocation_bin` TEXT NOT NULL, `itemLocation_department` TEXT NOT NULL, PRIMARY KEY(`barcode`))");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldz/c$d;", "", "<init>", "()V", "", "DB_NAME", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public c(Context context, C14437a aVar) {
        C17542s.j(context, "appContext");
        C17542s.j(aVar, "scanAndGoConverters");
        this.f126350a = w.a(context, ScanAndGoRoomDatabase.class, "ScanAndGoDb").c(aVar).f().b(f126347c).b(f126348d).e();
    }

    public final ScanAndGoRoomDatabase a() {
        return this.f126350a;
    }
}

package hz;

import android.content.Context;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;
import dz.c;
import ez.C14437a;
import fz.C14488a;
import fz.C14490c;
import fz.C14492e;
import fz.C14494g;
import fz.C14496i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhz/a;", "", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hz.a  reason: case insensitive filesystem */
public abstract class C14547a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3142a f127518a = new C3142a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhz/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lez/a;", "scanAndGoConverters", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "a", "(Landroid/content/Context;Lez/a;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "database", "Lfz/g;", "e", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;)Lfz/g;", "Lfz/a;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;)Lfz/a;", "Lfz/c;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;)Lfz/c;", "Lfz/i;", "f", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;)Lfz/i;", "Lfz/e;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;)Lfz/e;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hz.a$a  reason: collision with other inner class name */
    public static final class C3142a {
        public /* synthetic */ C3142a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScanAndGoRoomDatabase a(Context context, C14437a aVar) {
            C17542s.j(context, "appContext");
            C17542s.j(aVar, "scanAndGoConverters");
            return new c(context, aVar).a();
        }

        public final C14488a b(ScanAndGoRoomDatabase scanAndGoRoomDatabase) {
            C17542s.j(scanAndGoRoomDatabase, "database");
            return scanAndGoRoomDatabase.a();
        }

        public final C14490c c(ScanAndGoRoomDatabase scanAndGoRoomDatabase) {
            C17542s.j(scanAndGoRoomDatabase, "database");
            return scanAndGoRoomDatabase.c();
        }

        public final C14492e d(ScanAndGoRoomDatabase scanAndGoRoomDatabase) {
            C17542s.j(scanAndGoRoomDatabase, "database");
            return scanAndGoRoomDatabase.b();
        }

        public final C14494g e(ScanAndGoRoomDatabase scanAndGoRoomDatabase) {
            C17542s.j(scanAndGoRoomDatabase, "database");
            return scanAndGoRoomDatabase.d();
        }

        public final C14496i f(ScanAndGoRoomDatabase scanAndGoRoomDatabase) {
            C17542s.j(scanAndGoRoomDatabase, "database");
            return scanAndGoRoomDatabase.e();
        }

        private C3142a() {
        }
    }
}

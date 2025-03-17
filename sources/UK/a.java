package Uk;

import QJ.M;
import Vk.f;
import Wk.d;
import Wk.g;
import android.content.Context;
import androidx.room.w;
import com.ingka.ikea.app.stockinfo.db.StockInfoDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUk/a;", "", "a", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1851a f88315a = new C1851a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LUk/a$a;", "", "<init>", "()V", "Ltw/h;", "networkService", "LVk/a;", "a", "(Ltw/h;)LVk/a;", "Lcom/ingka/ikea/app/stockinfo/db/StockInfoDatabase;", "database", "LWk/d;", "c", "(Lcom/ingka/ikea/app/stockinfo/db/StockInfoDatabase;Ltw/h;)LWk/d;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Lcom/ingka/ikea/app/stockinfo/db/StockInfoDatabase;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uk.a$a  reason: collision with other inner class name */
    public static final class C1851a {
        public /* synthetic */ C1851a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Vk.a a(h hVar) {
            C17542s.j(hVar, "networkService");
            return (Vk.a) hVar.b(Vk.a.class);
        }

        public final StockInfoDatabase b(Context context) {
            C17542s.j(context, "context");
            Context applicationContext = context.getApplicationContext();
            C17542s.i(applicationContext, "getApplicationContext(...)");
            return w.a(applicationContext, StockInfoDatabase.class, "stock-info-db").f().e();
        }

        public final d c(StockInfoDatabase stockInfoDatabase, h hVar) {
            C17542s.j(stockInfoDatabase, "database");
            C17542s.j(hVar, "networkService");
            return new g(stockInfoDatabase, new f(hVar), (M) null, (M) null, 12, (DefaultConstructorMarker) null);
        }

        private C1851a() {
        }
    }
}

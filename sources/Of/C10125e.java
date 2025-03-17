package of;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import R2.h;
import V2.b;
import W2.e;
import W2.f;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lof/e;", "", "a", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: of.e  reason: case insensitive filesystem */
public abstract class C10125e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75732a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lof/e$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcherIO", "LR2/h;", "LW2/f;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "", "STOCK_BACK_IN_STOCK", "Ljava/lang/String;", "STOCK_BACK_IN_STOCK_HIGH_DEMAND", "STOCK_DISCONTINUED", "STOCK_EXPIRED", "STOCK_EXPIRED_WITH_RESTOCK", "STOCK_SUBSCRIBED", "STOCK_RESTOCK", "DATASTORE_NAME", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: of.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final File c(Context context) {
            return b.a(context, "back_in_store_data_store");
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcherIO");
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new C10124d(context), 3, (Object) null);
        }

        private a() {
        }
    }
}

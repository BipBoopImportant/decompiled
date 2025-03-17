package Bz;

import QJ.M;
import QJ.S;
import R2.h;
import W2.e;
import W2.f;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBz/b;", "", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f108325a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LBz/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcherIO", "LR2/h;", "LW2/f;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "", "DATASTORE_NAME", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final File c(Context context) {
            return V2.b.a(context, "scan_and_go_feedback_data_store");
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcherIO");
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10), new a(context), 3, (Object) null);
        }

        private a() {
        }
    }
}

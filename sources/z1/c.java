package Z1;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZ1/c;", "", "a", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14957a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LZ1/c$a;", "", "<init>", "()V", "", "message", "", "throwable", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, String str, Throwable th2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            aVar.b(str, th2);
        }

        public final void a(String str, Throwable th2) {
            Log.e("PreviewLogger", str, th2);
        }

        public final void b(String str, Throwable th2) {
            Log.w("PreviewLogger", str, th2);
        }

        private a() {
        }
    }
}

package t5;

import H2.a;
import androidx.work.C7055y;
import androidx.work.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LH2/a;", "Landroidx/work/U;", "info", "", "tag", "LXH/N;", "a", "(LH2/a;Landroidx/work/U;Ljava/lang/String;)V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.P  reason: case insensitive filesystem */
public final class C8805P {
    public static final void a(a<U> aVar, U u10, String str) {
        C17542s.j(aVar, "<this>");
        C17542s.j(u10, "info");
        C17542s.j(str, "tag");
        try {
            aVar.accept(u10);
        } catch (Throwable th2) {
            C7055y.e().d(str, "Exception handler threw an exception", th2);
        }
    }
}

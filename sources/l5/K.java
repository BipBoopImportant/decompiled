package l5;

import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ll5/K;", "", "Ll5/y;", "workSpecId", "LXH/N;", "e", "(Ll5/y;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "c", "(Ll5/y;Landroidx/work/WorkerParameters$a;)V", "b", "", "reason", "d", "(Ll5/y;I)V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface K {
    void a(C8528y yVar, int i10) {
        C17542s.j(yVar, "workSpecId");
        d(yVar, i10);
    }

    void b(C8528y yVar) {
        C17542s.j(yVar, "workSpecId");
        d(yVar, -512);
    }

    void c(C8528y yVar, WorkerParameters.a aVar);

    void d(C8528y yVar, int i10);

    void e(C8528y yVar) {
        C17542s.j(yVar, "workSpecId");
        c(yVar, (WorkerParameters.a) null);
    }
}

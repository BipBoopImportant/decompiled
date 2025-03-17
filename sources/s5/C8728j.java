package s5;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Ls5/j;", "", "Ls5/i;", "systemIdInfo", "LXH/N;", "b", "(Ls5/i;)V", "", "workSpecId", "", "generation", "d", "(Ljava/lang/String;I)Ls5/i;", "Ls5/m;", "id", "a", "(Ls5/m;)Ls5/i;", "f", "(Ljava/lang/String;I)V", "g", "(Ljava/lang/String;)V", "c", "(Ls5/m;)V", "", "e", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.j  reason: case insensitive filesystem */
public interface C8728j {
    C8727i a(C8731m mVar) {
        C17542s.j(mVar, "id");
        return d(mVar.b(), mVar.a());
    }

    void b(C8727i iVar);

    void c(C8731m mVar) {
        C17542s.j(mVar, "id");
        f(mVar.b(), mVar.a());
    }

    C8727i d(String str, int i10);

    List<String> e();

    void f(String str, int i10);

    void g(String str);
}

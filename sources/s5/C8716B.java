package s5;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Ls5/B;", "", "Ls5/A;", "workTag", "LXH/N;", "b", "(Ls5/A;)V", "", "id", "c", "(Ljava/lang/String;)V", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "", "tags", "d", "(Ljava/lang/String;Ljava/util/Set;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.B  reason: case insensitive filesystem */
public interface C8716B {
    List<String> a(String str);

    void b(C8715A a10);

    void c(String str);

    void d(String str, Set<String> set) {
        C17542s.j(str, "id");
        C17542s.j(set, "tags");
        for (String a10 : set) {
            b(new C8715A(a10, str));
        }
    }
}

package s5;

import TJ.C16532g;
import android.annotation.SuppressLint;
import androidx.work.C7037f;
import androidx.work.Q;
import java.util.List;
import kotlin.Metadata;
import s5.C8739u;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0014H'¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b,\u0010\u0011J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b-\u0010\u0011J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010.\u001a\u00020\u0007H'¢\u0006\u0004\b/\u0010\u0011J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b0\u0010\u0011J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020201H'¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u001eH'¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0014H'¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010:\u001a\u00020\u0014H'¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b=\u0010>J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010?\u001a\u00020\u0014H'¢\u0006\u0004\b@\u0010<J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bA\u0010>J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bB\u0010>J\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010C\u001a\u00020\u001eH'¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bF\u0010\u0006J\u000f\u0010G\u001a\u00020\u0014H'¢\u0006\u0004\bG\u00109J\u001f\u0010I\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0014H'¢\u0006\u0004\bI\u0010&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006JÀ\u0006\u0001"}, d2 = {"Ls5/v;", "", "Ls5/u;", "workSpec", "LXH/N;", "q", "(Ls5/u;)V", "", "id", "a", "(Ljava/lang/String;)V", "i", "(Ljava/lang/String;)Ls5/u;", "name", "", "Ls5/u$b;", "s", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/work/Q$c;", "state", "", "v", "(Landroidx/work/Q$c;Ljava/lang/String;)I", "j", "(Ljava/lang/String;)I", "b", "Landroidx/work/f;", "output", "w", "(Ljava/lang/String;Landroidx/work/f;)V", "", "enqueueTime", "x", "(Ljava/lang/String;J)V", "B", "A", "overrideGeneration", "D", "(Ljava/lang/String;I)V", "h", "(Ljava/lang/String;)Landroidx/work/Q$c;", "Ls5/u$c;", "g", "(Ljava/lang/String;)Ls5/u$c;", "m", "l", "tag", "k", "f", "LTJ/g;", "", "t", "()LTJ/g;", "startTime", "r", "(Ljava/lang/String;J)I", "o", "()I", "schedulerLimit", "u", "(I)Ljava/util/List;", "z", "()Ljava/util/List;", "maxLimit", "n", "e", "y", "startingAt", "c", "(J)Ljava/util/List;", "p", "C", "stopReason", "d", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"UnknownNullness"})
public interface v {
    int A(String str);

    int B(String str);

    int C();

    void D(String str, int i10);

    void a(String str);

    void b(String str);

    List<C8739u> c(long j10);

    void d(String str, int i10);

    List<C8739u> e();

    List<String> f(String str);

    C8739u.c g(String str);

    Q.c h(String str);

    C8739u i(String str);

    int j(String str);

    List<String> k(String str);

    List<C7037f> l(String str);

    List<C8739u.c> m(String str);

    List<C8739u> n(int i10);

    int o();

    void p(C8739u uVar);

    void q(C8739u uVar);

    int r(String str, long j10);

    List<C8739u.b> s(String str);

    C16532g<Boolean> t();

    List<C8739u> u(int i10);

    int v(Q.c cVar, String str);

    void w(String str, C7037f fVar);

    void x(String str, long j10);

    List<C8739u> y();

    List<C8739u> z();
}

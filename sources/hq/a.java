package Hq;

import android.os.Bundle;
import kotlin.Metadata;
import x4.C8951o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"LHq/a;", "", "Lx4/o;", "navController", "LXH/N;", "f", "(Lx4/o;)V", "", "rewardId", "requestKey", "b", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "bundle", "LHq/b;", "d", "(Landroid/os/Bundle;)LHq/b;", "", "showGreeting", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Z)V", "e", "c", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hq.a$a  reason: collision with other inner class name */
    public static final class C1594a {
        public static /* synthetic */ void a(a aVar, C8951o oVar, String str, String str2, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    z10 = false;
                }
                aVar.a(oVar, str, str2, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openUseReward");
        }
    }

    void a(C8951o oVar, String str, String str2, boolean z10);

    void b(C8951o oVar, String str, String str2);

    void c(C8951o oVar);

    b d(Bundle bundle);

    void e(C8951o oVar);

    void f(C8951o oVar);
}

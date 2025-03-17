package Fs;

import Ps.d;
import kotlin.Metadata;
import rw.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LFs/a;", "", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "e", "(Lx4/o;Lx4/C;)V", "", "id", "featureName", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "analytics", "c", "(Ljava/lang/String;)Ljava/lang/String;", "LPs/d;", "notification", "a", "(LPs/d;)Ljava/lang/String;", "LGs/a;", "feature", "messageId", "b", "(LGs/a;Ljava/lang/String;)Ljava/lang/String;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fs.a$a  reason: collision with other inner class name */
    public static final class C1575a {
        public static /* synthetic */ void a(a aVar, C8951o oVar, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    c10 = c.f28698a.b().a();
                }
                aVar.e(oVar, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openInbox");
        }
    }

    String a(d dVar);

    String b(Gs.a aVar, String str);

    String c(String str);

    String d(String str, String str2);

    void e(C8951o oVar, C c10);
}

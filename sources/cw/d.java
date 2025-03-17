package cw;

import TJ.C16532g;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcw/d;", "", "LTJ/g;", "", "Lcw/a;", "b", "()LTJ/g;", "Lcw/b;", "c", "Lcw/f;", "a", "LXH/N;", "invalidate", "()V", "", "id", "e", "(Ljava/lang/String;)V", "", "reset", "f", "(Ljava/lang/String;Z)V", "Lcw/e;", "messageTypes", "d", "(Ljava/util/List;)V", "messagecenter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(d dVar, String str, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                dVar.f(str, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateWhatsNewMessageDisplayed");
        }
    }

    C16532g<List<f>> a();

    C16532g<List<a>> b();

    C16532g<List<b>> c();

    void d(List<? extends e> list);

    void e(String str);

    void f(String str, boolean z10);

    void invalidate();
}

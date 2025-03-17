package gw;

import TJ.C16532g;
import cw.b;
import cw.e;
import cw.f;
import fw.c;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgw/d;", "", "LTJ/g;", "", "Lcw/a;", "b", "()LTJ/g;", "Lcw/b;", "c", "Lcw/f;", "a", "Lfw/c;", "newMessages", "LXH/N;", "e", "(Lfw/c;)V", "d", "()V", "f", "i", "", "id", "", "reset", "h", "(Ljava/lang/String;Z)V", "Lcw/e;", "type", "g", "(Lcw/e;)V", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(d dVar, String str, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                dVar.h(str, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMessageDisplayed");
        }
    }

    C16532g<List<f>> a();

    C16532g<List<cw.a>> b();

    C16532g<List<b>> c();

    void d();

    void e(c cVar);

    void f();

    void g(e eVar);

    void h(String str, boolean z10);

    void i();
}

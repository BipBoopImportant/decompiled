package sg;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lsg/g;", "", "", "position", "", "scrollTo", "LXH/N;", "a", "(IZ)V", "i0", "(I)V", "h0", "(I)I", "f0", "()V", "", "key", "p0", "(Ljava/lang/String;)V", "k0", "()Z", "isKeyboardUp", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static boolean a(g gVar) {
            return false;
        }

        public static void b(g gVar, String str) {
            C17542s.j(str, "key");
        }

        public static /* synthetic */ void c(g gVar, int i10, boolean z10, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    z10 = true;
                }
                gVar.a(i10, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus");
        }
    }

    void a(int i10, boolean z10);

    void f0();

    int h0(int i10);

    void i0(int i10);

    boolean k0();

    void p0(String str);
}

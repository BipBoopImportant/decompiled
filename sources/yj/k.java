package YJ;

import QJ.M;
import WJ.C16751l;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LYJ/k;", "LQJ/M;", "<init>", "()V", "LdI/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "F0", "(LdI/i;Ljava/lang/Runnable;)V", "E0", "", "parallelism", "", "name", "N0", "(ILjava/lang/String;)LQJ/M;", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k extends M {

    /* renamed from: b  reason: collision with root package name */
    public static final k f140528b = new k();

    private k() {
    }

    public void E0(C17168i iVar, Runnable runnable) {
        C16887c.f140512h.R0(runnable, true, false);
    }

    public void F0(C17168i iVar, Runnable runnable) {
        C16887c.f140512h.R0(runnable, true, true);
    }

    public M N0(int i10, String str) {
        C16751l.a(i10);
        return i10 >= j.f140525d ? C16751l.b(this, str) : super.N0(i10, str);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}

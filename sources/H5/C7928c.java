package h5;

import H2.a;
import YH.C16877v;
import android.content.Context;
import f5.k;
import g5.C7872a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh5/c;", "Lg5/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "LH2/a;", "Lf5/k;", "callback", "LXH/N;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;LH2/a;)V", "a", "(LH2/a;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h5.c  reason: case insensitive filesystem */
public final class C7928c implements C7872a {
    /* access modifiers changed from: private */
    public static final void d(a aVar) {
        C17542s.j(aVar, "$callback");
        aVar.accept(new k(C16877v.n()));
    }

    public void a(a<k> aVar) {
        C17542s.j(aVar, "callback");
    }

    public void b(Context context, Executor executor, a<k> aVar) {
        C17542s.j(context, "context");
        C17542s.j(executor, "executor");
        C17542s.j(aVar, "callback");
        executor.execute(new C7927b(aVar));
    }
}

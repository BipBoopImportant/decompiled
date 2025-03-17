package q5;

import XH.C16807N;
import YH.C16877v;
import android.content.Context;
import androidx.work.C7055y;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o5.C8600a;
import u5.C8878b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0004X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR$\u0010%\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008F@FX\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lq5/h;", "T", "", "Landroid/content/Context;", "context", "Lu5/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lu5/b;)V", "Lo5/a;", "listener", "LXH/N;", "c", "(Lo5/a;)V", "f", "e", "()Ljava/lang/Object;", "h", "()V", "i", "a", "Lu5/b;", "b", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "currentState", "newState", "getState", "g", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C8878b f55522a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f55523b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f55524c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<C8600a<T>> f55525d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private T f55526e;

    protected h(Context context, C8878b bVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "taskExecutor");
        this.f55522a = bVar;
        Context applicationContext = context.getApplicationContext();
        C17542s.i(applicationContext, "context.applicationContext");
        this.f55523b = applicationContext;
    }

    /* access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C8600a) it.next()).a(hVar.f55526e);
        }
    }

    public final void c(C8600a<T> aVar) {
        C17542s.j(aVar, "listener");
        synchronized (this.f55524c) {
            try {
                if (this.f55525d.add(aVar)) {
                    if (this.f55525d.size() == 1) {
                        this.f55526e = e();
                        C7055y e10 = C7055y.e();
                        String a10 = i.f55527a;
                        e10.a(a10, getClass().getSimpleName() + ": initial state = " + this.f55526e);
                        h();
                    }
                    aVar.a(this.f55526e);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Context d() {
        return this.f55523b;
    }

    public abstract T e();

    public final void f(C8600a<T> aVar) {
        C17542s.j(aVar, "listener");
        synchronized (this.f55524c) {
            try {
                if (this.f55525d.remove(aVar) && this.f55525d.isEmpty()) {
                    i();
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(T t10) {
        synchronized (this.f55524c) {
            T t11 = this.f55526e;
            if (t11 == null || !C17542s.e(t11, t10)) {
                this.f55526e = t10;
                this.f55522a.a().execute(new g(C16877v.t1(this.f55525d), this));
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}

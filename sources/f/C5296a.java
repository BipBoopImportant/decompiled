package f;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf/a;", "", "<init>", "()V", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "Lf/b;", "listener", "LXH/N;", "a", "(Lf/b;)V", "e", "context", "c", "(Landroid/content/Context;)V", "b", "", "Ljava/util/Set;", "listeners", "Landroid/content/Context;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f.a  reason: case insensitive filesystem */
public final class C5296a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C5297b> f23235a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f23236b;

    public final void a(C5297b bVar) {
        C17542s.j(bVar, "listener");
        Context context = this.f23236b;
        if (context != null) {
            bVar.a(context);
        }
        this.f23235a.add(bVar);
    }

    public final void b() {
        this.f23236b = null;
    }

    public final void c(Context context) {
        C17542s.j(context, "context");
        this.f23236b = context;
        for (C5297b a10 : this.f23235a) {
            a10.a(context);
        }
    }

    public final Context d() {
        return this.f23236b;
    }

    public final void e(C5297b bVar) {
        C17542s.j(bVar, "listener");
        this.f23235a.remove(bVar);
    }
}

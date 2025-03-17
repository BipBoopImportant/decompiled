package Zk;

import android.content.Context;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LZk/b;", "Lgp/b;", "Landroid/content/Context;", "context", "Lam/b;", "appService", "<init>", "(Landroid/content/Context;Lam/b;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lam/b;", "Lgp/e;", "c", "Lgp/e;", "()Lgp/e;", "taskId", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f89925a;

    /* renamed from: b  reason: collision with root package name */
    private final am.b f89926b;

    /* renamed from: c  reason: collision with root package name */
    private final C11346e f89927c = C11346e.APP_SERVICE_STOP;

    public b(Context context, am.b bVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "appService");
        this.f89925a = context;
        this.f89926b = bVar;
    }

    public C11346e a() {
        return this.f89927c;
    }

    public Object b(Object obj, C17164e<? super Boolean> eVar) {
        G4.b.a(this.f89925a).edit().remove("LAST_CONFIG_ALERT_TIME").apply();
        this.f89926b.a();
        return kotlin.coroutines.jvm.internal.b.a(true);
    }
}

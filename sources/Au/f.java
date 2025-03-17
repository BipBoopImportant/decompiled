package Au;

import Il.a;
import XH.C16807N;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ru.d;
import yd.C10440K;
import yd.C10460n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LAu/f;", "Lru/d;", "Landroid/content/Context;", "context", "LIl/a;", "appConfigApi", "<init>", "(Landroid/content/Context;LIl/a;)V", "", "storeId", "LXH/N;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "LIl/a;", "getAppConfigApi", "()LIl/a;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f79192a;

    /* renamed from: b  reason: collision with root package name */
    private final a f79193b;

    public f(Context context, a aVar) {
        C17542s.j(context, "context");
        C17542s.j(aVar, "appConfigApi");
        this.f79192a = context;
        this.f79193b = aVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C10440K k10) {
        C17542s.j(k10, "it");
        return C16807N.f139792a;
    }

    public Object a(String str, C17164e<? super C16807N> eVar) {
        Object d10 = C10460n.f77928a.d(this.f79192a, str, this.f79193b.i(), this.f79193b.a(), new e(), eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }
}

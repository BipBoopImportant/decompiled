package D8;

import D8.b;
import D8.c;
import E8.c;
import G8.h;
import G8.t;
import QJ.Q;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LD8/d;", "LE8/c$b;", "LD8/d$a;", "loggerNonStatic", "LE8/c;", "preferencesStore", "Landroid/content/Context;", "context", "<init>", "(LD8/d$a;LE8/c;Landroid/content/Context;)V", "LXH/N;", "a", "()V", "LE8/b;", "key", "o", "(LE8/b;)V", "LD8/d$a;", "b", "LE8/c;", "", "kotlin.jvm.PlatformType", "c", "Ljava/lang/String;", "debugLogWriterFolder", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f34598a;

    /* renamed from: b  reason: collision with root package name */
    private final c f34599b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34600c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LD8/d$a;", "", "<init>", "()V", "LD8/b$d;", "logLevel", "LXH/N;", "a", "(LD8/b$d;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public final void a(b.d dVar) {
            C17542s.j(dVar, "logLevel");
            c.f34592b.f(dVar);
        }
    }

    public d(a aVar, c cVar, Context context) {
        C17542s.j(aVar, "loggerNonStatic");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(context, "context");
        this.f34598a = aVar;
        this.f34599b = cVar;
        this.f34600c = context.getFilesDir().getAbsolutePath();
        cVar.n(this);
        a();
    }

    private final void a() {
        b.d dVar = this.f34599b.b(E8.b.VERBOSE_LOG, false) ? b.d.DEBUG : this.f34599b.b(E8.b.CLIENT_MODE_ACTIVATION_STATE, false) ? b.d.CS_IN_APP : b.d.PUBLIC;
        this.f34598a.a(dVar);
        if (dVar != b.d.PUBLIC) {
            c.a aVar = c.f34592b;
            String str = this.f34600c;
            C17542s.i(str, "debugLogWriterFolder");
            aVar.e(new a((h) null, (t) null, (Q) null, 0, 0, str, 31, (DefaultConstructorMarker) null));
            return;
        }
        c.f34592b.e((a) null);
    }

    public void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        if (bVar == E8.b.VERBOSE_LOG || bVar == E8.b.CLIENT_MODE_ACTIVATION_STATE) {
            a();
        }
    }
}

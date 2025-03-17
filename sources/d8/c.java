package D8;

import D8.b;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\tJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\tJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LD8/c;", "", "", "tag", "<init>", "(Ljava/lang/String;)V", "message", "LXH/N;", "f", "(Ljava/lang/String;)LXH/N;", "", "t", "g", "(Ljava/lang/Throwable;Ljava/lang/String;)LXH/N;", "j", "l", "m", "h", "i", "k", "a", "Ljava/lang/String;", "b", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f34592b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final b f34593c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static b.f f34594d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static a f34595e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static G8.a f34596f = new G8.a();

    /* renamed from: a  reason: collision with root package name */
    private final String f34597a;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"LD8/c$a;", "", "<init>", "()V", "", "tag", "b", "(Ljava/lang/String;)Ljava/lang/String;", "LD8/b$d;", "logLevel", "LXH/N;", "f", "(LD8/b$d;)V", "LD8/b$f;", "printer", "LD8/b$f;", "getPrinter", "()LD8/b$f;", "g", "(LD8/b$f;)V", "getPrinter$annotations", "LD8/a;", "debugLogWriter", "LD8/a;", "d", "()LD8/a;", "e", "(LD8/a;)V", "LG8/a;", "buildConfigInstantiable", "LG8/a;", "c", "()LG8/a;", "setBuildConfigInstantiable", "(LG8/a;)V", "getBuildConfigInstantiable$annotations", "TAG_CS_LIB", "Ljava/lang/String;", "LD8/b;", "logPrinter", "LD8/b;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String b(String str) {
            return "CSLIB|" + str;
        }

        public final G8.a c() {
            return c.f34596f;
        }

        public final a d() {
            return c.f34595e;
        }

        public final void e(a aVar) {
            c.f34595e = aVar;
        }

        public final void f(b.d dVar) {
            C17542s.j(dVar, "logLevel");
            g((c().c() || dVar == b.d.DEBUG) ? c.f34593c.b(b.d.DEBUG) : c.f34593c.b(dVar));
        }

        public final void g(b.f fVar) {
            C17542s.j(fVar, "<set-?>");
            c.f34594d = fVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b bVar = new b();
        f34593c = bVar;
        f34594d = bVar.b(b.d.PUBLIC);
    }

    public c() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public final C16807N f(String str) {
        if (str != null) {
            f34594d.f(this.f34597a, str);
            a aVar = f34595e;
            if (aVar != null) {
                a.c(aVar, "DEBUG", this.f34597a, str, (Throwable) null, 8, (Object) null);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public final C16807N g(Throwable th2, String str) {
        if (!(th2 == null || str == null)) {
            f34594d.a(this.f34597a, str, th2);
            a aVar = f34595e;
            if (aVar != null) {
                aVar.b("DEBUG", this.f34597a, str, th2);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public final C16807N h(String str) {
        if (str != null) {
            f34594d.e(this.f34597a, str);
            a aVar = f34595e;
            if (aVar != null) {
                a.c(aVar, "ERROR", this.f34597a, str, (Throwable) null, 8, (Object) null);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public final C16807N i(Throwable th2, String str) {
        if (!(th2 == null || str == null)) {
            f34594d.c(this.f34597a, str, th2);
            a aVar = f34595e;
            if (aVar != null) {
                aVar.b("ERROR", this.f34597a, str, th2);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public final C16807N j(String str) {
        if (str != null) {
            f34594d.g(this.f34597a, str);
            a aVar = f34595e;
            if (aVar != null) {
                a.c(aVar, "INFO", this.f34597a, str, (Throwable) null, 8, (Object) null);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public final C16807N k(String str) {
        if (str != null) {
            f34594d.h("CSLIB", str);
            a aVar = f34595e;
            if (aVar != null) {
                a.c(aVar, "PUBLIC", this.f34597a, str, (Throwable) null, 8, (Object) null);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public final C16807N l(String str) {
        if (str != null) {
            f34594d.d(this.f34597a, str);
            a aVar = f34595e;
            if (aVar != null) {
                a.c(aVar, "WARN", this.f34597a, str, (Throwable) null, 8, (Object) null);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public final C16807N m(Throwable th2, String str) {
        if (!(th2 == null || str == null)) {
            f34594d.b(this.f34597a, str, th2);
            a aVar = f34595e;
            if (aVar != null) {
                aVar.b("WARN", this.f34597a, str, th2);
                return C16807N.f139792a;
            }
        }
        return null;
    }

    public c(String str) {
        this.f34597a = str == null ? "CSLIB" : f34592b.b(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}

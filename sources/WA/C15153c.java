package wA;

import HJ.C15854t;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sf.C10242c;
import vA.C15127d;
import xA.C15198a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n¨\u0006\u001c"}, d2 = {"LwA/c;", "LwA/a;", "LxA/a;", "themeSystemApi", "Lsf/c;", "appUserDataRepository", "<init>", "(LxA/a;Lsf/c;)V", "LvA/d;", "d", "()LvA/d;", "mode", "LXH/N;", "a", "(LvA/d;)V", "LxA/a;", "b", "Lsf/c;", "LTJ/B;", "c", "LTJ/B;", "_uiModeFlow", "LTJ/g;", "LTJ/g;", "()LTJ/g;", "uiModeFlow", "uiMode", "e", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wA.c  reason: case insensitive filesystem */
public final class C15153c implements C15151a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f131586e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f131587f = 8;

    /* renamed from: g  reason: collision with root package name */
    private static final C15127d f131588g = C15127d.Auto;

    /* renamed from: a  reason: collision with root package name */
    private final C15198a f131589a;

    /* renamed from: b  reason: collision with root package name */
    private final C10242c f131590b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<C15127d> f131591c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<C15127d> f131592d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LwA/c$a;", "", "<init>", "()V", "LvA/d;", "DEFAULT", "LvA/d;", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wA.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C15153c(C15198a aVar, C10242c cVar) {
        C17542s.j(aVar, "themeSystemApi");
        C17542s.j(cVar, "appUserDataRepository");
        this.f131589a = aVar;
        this.f131590b = cVar;
        if (cVar.g().length() == 0) {
            cVar.o(f131588g.j());
        }
        C16505B<C15127d> a10 = C16521S.a(d());
        this.f131591c = a10;
        this.f131592d = C16534i.c(a10);
    }

    private final C15127d d() {
        T t10;
        String g10 = this.f131590b.g();
        Iterator<T> it = C15127d.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((C15127d) t10).j(), g10)) {
                break;
            }
        }
        C15127d dVar = (C15127d) t10;
        if (dVar != null) {
            return dVar;
        }
        e eVar = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Could not find a UiMode matching: " + g10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C15153c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return f131588g;
    }

    public void a(C15127d dVar) {
        C15127d value;
        C17542s.j(dVar, "mode");
        this.f131589a.a(dVar);
        this.f131590b.o(dVar.j());
        C16505B<C15127d> b10 = this.f131591c;
        do {
            value = b10.getValue();
            C15127d dVar2 = value;
        } while (!b10.e(value, dVar));
    }

    public C16532g<C15127d> b() {
        return this.f131592d;
    }

    public C15127d c() {
        return this.f131591c.getValue();
    }
}

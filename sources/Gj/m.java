package gj;

import HJ.C15846l;
import HJ.C15850p;
import Nj.h;
import XH.x;
import XH.y;
import cp.e;
import gj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0013\u000e\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgj/m;", "", "Lcp/e;", "uriParser", "LNj/h;", "validateUpptackaUriUseCase", "<init>", "(Lcp/e;LNj/h;)V", "", "format", "", "value", "LXH/x;", "Lgj/j$e;", "a", "(ILjava/lang/String;)Ljava/lang/Object;", "Lcp/e;", "b", "LNj/h;", "c", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final e f97615a;

    /* renamed from: b  reason: collision with root package name */
    private final h f97616b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgj/m$a;", "Lgj/m$c;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c {
        public a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgj/m$b;", "Lgj/m$c;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {
        public b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgj/m$c;", "", "<init>", "()V", "Lgj/m$a;", "Lgj/m$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c extends Throwable {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public m(e eVar, h hVar) {
        C17542s.j(eVar, "uriParser");
        C17542s.j(hVar, "validateUpptackaUriUseCase");
        this.f97615a = eVar;
        this.f97616b = hVar;
    }

    public final Object a(int i10, String str) {
        C17542s.j(str, "value");
        if (!this.f97616b.a(str)) {
            x.a aVar = x.f139812b;
            return x.b(y.a(new a()));
        }
        Object a10 = this.f97615a.a(str);
        if (x.e(a10) != null) {
            return x.b(y.a(new b()));
        }
        boolean z10 = false;
        C15846l d10 = C15850p.d(new C15850p("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"), ((e.a) a10).b(), 0, 2, (Object) null);
        String value = d10 != null ? d10.getValue() : null;
        if (value == null || value.length() == 0) {
            z10 = true;
        }
        String str2 = !z10 ? value : null;
        return str2 != null ? x.b(new j.e(i10, str, str2, (String) null, (O) null, 24, (DefaultConstructorMarker) null)) : x.b(y.a(new b()));
    }
}

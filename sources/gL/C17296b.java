package gL;

import XH.C16807N;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nL.C17685b;
import nL.C17686c;
import oL.C17722a;
import vL.C18206a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0003R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"LgL/b;", "", "<init>", "()V", "", "LoL/a;", "modules", "LXH/N;", "c", "(Ljava/util/List;)V", "e", "(LoL/a;)LgL/b;", "", "f", "([LoL/a;)LgL/b;", "d", "(Ljava/util/List;)LgL/b;", "a", "LgL/a;", "LgL/a;", "b", "()LgL/a;", "koin", "", "Z", "allowOverride", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gL.b  reason: case insensitive filesystem */
public final class C17296b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f143341c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17295a f143342a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f143343b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LgL/b$a;", "", "<init>", "()V", "LgL/b;", "a", "()LgL/b;", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gL.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17296b a() {
            return new C17296b((DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C17296b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void c(List<C17722a> list) {
        this.f143342a.e(list, this.f143343b, false);
    }

    public final void a() {
        this.f143342a.a();
    }

    public final C17295a b() {
        return this.f143342a;
    }

    public final C17296b d(List<C17722a> list) {
        C17542s.j(list, "modules");
        C17686c c10 = this.f143342a.c();
        C17685b bVar = C17685b.INFO;
        if (c10.e(bVar)) {
            C18206a aVar = C18206a.f149084a;
            long a10 = aVar.a();
            c(list);
            double doubleValue = ((Number) new v(C16807N.f139792a, Double.valueOf(((double) (aVar.a() - a10)) / 1000000.0d)).d()).doubleValue();
            int j10 = this.f143342a.b().j();
            C17686c c11 = this.f143342a.c();
            c11.b(bVar, "Started " + j10 + " definitions in " + doubleValue + " ms");
        } else {
            c(list);
        }
        return this;
    }

    public final C17296b e(C17722a aVar) {
        C17542s.j(aVar, "modules");
        return d(C16877v.e(aVar));
    }

    public final C17296b f(C17722a... aVarArr) {
        C17542s.j(aVarArr, "modules");
        return d(C16870n.c1(aVarArr));
    }

    private C17296b() {
        this.f143342a = new C17295a();
        this.f143343b = true;
    }
}

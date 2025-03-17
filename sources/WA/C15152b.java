package wA;

import TJ.C16532g;
import TJ.C16534i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vA.C15127d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"LwA/b;", "LwA/a;", "<init>", "()V", "LvA/d;", "mode", "LXH/N;", "a", "(LvA/d;)V", "LvA/d;", "c", "()LvA/d;", "uiMode", "LTJ/g;", "b", "LTJ/g;", "()LTJ/g;", "uiModeFlow", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wA.b  reason: case insensitive filesystem */
public final class C15152b implements C15151a {

    /* renamed from: a  reason: collision with root package name */
    private final C15127d f131584a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<C15127d> f131585b;

    public C15152b() {
        C15127d dVar = C15127d.Day;
        this.f131584a = dVar;
        this.f131585b = C16534i.J(dVar);
    }

    public void a(C15127d dVar) {
        C17542s.j(dVar, "mode");
    }

    public C16532g<C15127d> b() {
        return this.f131585b;
    }

    public C15127d c() {
        return this.f131584a;
    }
}

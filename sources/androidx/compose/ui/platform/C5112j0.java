package androidx.compose.ui.platform;

import XH.C16807N;
import f1.C5306h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00120\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/j0;", "Lf1/h;", "saveableStateRegistry", "Lkotlin/Function0;", "LXH/N;", "onDispose", "<init>", "(Lf1/h;LnI/a;)V", "", "value", "", "a", "(Ljava/lang/Object;)Z", "", "key", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "d", "()Ljava/util/Map;", "valueProvider", "Lf1/h$a;", "b", "(Ljava/lang/String;LnI/a;)Lf1/h$a;", "c", "()V", "LnI/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.j0  reason: case insensitive filesystem */
public final class C5112j0 implements C5306h {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f19510a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C5306h f19511b;

    public C5112j0(C5306h hVar, C17631a<C16807N> aVar) {
        this.f19510a = aVar;
        this.f19511b = hVar;
    }

    public boolean a(Object obj) {
        return this.f19511b.a(obj);
    }

    public C5306h.a b(String str, C17631a<? extends Object> aVar) {
        return this.f19511b.b(str, aVar);
    }

    public final void c() {
        this.f19510a.invoke();
    }

    public Map<String, List<Object>> d() {
        return this.f19511b.d();
    }

    public Object e(String str) {
        return this.f19511b.e(str);
    }
}

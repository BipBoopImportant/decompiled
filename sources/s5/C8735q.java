package s5;

import androidx.work.C7037f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Ls5/q;", "", "", "workSpecId", "Landroidx/work/f;", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/f;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroidx/work/f;", "()Landroidx/work/f;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.q  reason: case insensitive filesystem */
public final class C8735q {

    /* renamed from: a  reason: collision with root package name */
    private final String f55898a;

    /* renamed from: b  reason: collision with root package name */
    private final C7037f f55899b;

    public C8735q(String str, C7037f fVar) {
        C17542s.j(str, "workSpecId");
        C17542s.j(fVar, "progress");
        this.f55898a = str;
        this.f55899b = fVar;
    }

    public final C7037f a() {
        return this.f55899b;
    }

    public final String b() {
        return this.f55898a;
    }
}

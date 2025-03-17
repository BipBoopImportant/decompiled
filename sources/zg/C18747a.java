package zG;

import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import XH.C16807N;
import androidx.lifecycle.f0;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import zG.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"LzG/a;", "Landroidx/lifecycle/f0;", "<init>", "()V", "", "itemId", "LXH/N;", "h", "(ILdI/e;)Ljava/lang/Object;", "i", "LzG/e;", "newState", "j", "(LzG/e;)V", "LTJ/B;", "m", "LTJ/B;", "_uiState", "LTJ/P;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zG.a  reason: case insensitive filesystem */
public abstract class C18747a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C16505B<e> f152764m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<e> f152765n;

    public C18747a() {
        C16505B<e> a10 = C16521S.a(e.b.f152779a);
        this.f152764m = a10;
        this.f152765n = a10;
    }

    public abstract Object h(int i10, C17164e<? super C16807N> eVar);

    public abstract Object i(int i10, C17164e<? super C16807N> eVar);

    public final void j(e eVar) {
        C17542s.j(eVar, "newState");
        this.f152764m.setValue(eVar);
    }

    public final C16519P<e> m() {
        return this.f152765n;
    }
}

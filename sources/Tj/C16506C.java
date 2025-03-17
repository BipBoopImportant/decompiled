package TJ;

import QJ.F0;
import SJ.C16428d;
import UJ.C16624q;
import dI.C17164e;
import dI.C17168i;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013HA¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LTJ/C;", "T", "LTJ/F;", "", "LUJ/q;", "flow", "LQJ/F0;", "job", "<init>", "(LTJ/F;LQJ/F0;)V", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "LTJ/g;", "d", "(LdI/i;ILSJ/d;)LTJ/g;", "LTJ/h;", "collector", "", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "b", "LQJ/F0;", "", "c", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.C  reason: case insensitive filesystem */
final class C16506C<T> implements C16509F<T>, C16532g, C16624q<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C16509F<T> f138538a;

    /* renamed from: b  reason: collision with root package name */
    private final F0 f138539b;

    public C16506C(C16509F<? extends T> f10, F0 f02) {
        this.f138538a = f10;
        this.f138539b = f02;
    }

    public List<T> c() {
        return this.f138538a.c();
    }

    public Object collect(C16533h<? super T> hVar, C17164e<?> eVar) {
        return this.f138538a.collect(hVar, eVar);
    }

    public C16532g<T> d(C17168i iVar, int i10, C16428d dVar) {
        return C16511H.e(this, iVar, i10, dVar);
    }
}

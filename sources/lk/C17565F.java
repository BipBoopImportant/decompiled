package lK;

import com.optimizely.ab.config.FeatureVariable;
import fK.C17251d;
import java.util.Iterator;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lK.a0;
import oI.C17693a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LlK/F;", "T", "", "LkK/c;", "json", "LlK/X;", "lexer", "LfK/d;", "deserializer", "<init>", "(LkK/c;LlK/X;LfK/d;)V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "LkK/c;", "b", "LlK/X;", "c", "LfK/d;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.F  reason: case insensitive filesystem */
final class C17565F<T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f144418a;

    /* renamed from: b  reason: collision with root package name */
    private final X f144419b;

    /* renamed from: c  reason: collision with root package name */
    private final C17251d<T> f144420c;

    public C17565F(C17514c cVar, X x10, C17251d<? extends T> dVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(x10, "lexer");
        C17542s.j(dVar, "deserializer");
        this.f144418a = cVar;
        this.f144419b = x10;
        this.f144420c = dVar;
    }

    public boolean hasNext() {
        return this.f144419b.E();
    }

    public T next() {
        return new a0(this.f144418a, k0.OBJ, this.f144419b, this.f144420c.getDescriptor(), (a0.a) null).E(this.f144420c);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

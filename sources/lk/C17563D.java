package lK;

import XH.C16820k;
import com.optimizely.ab.config.FeatureVariable;
import fK.C17251d;
import java.util.Iterator;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lK.a0;
import oI.C17693a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"LlK/D;", "T", "", "LkK/c;", "json", "LlK/X;", "lexer", "LfK/d;", "deserializer", "<init>", "(LkK/c;LlK/X;LfK/d;)V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "LkK/c;", "b", "LlK/X;", "c", "LfK/d;", "d", "Z", "first", "e", "finished", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.D  reason: case insensitive filesystem */
final class C17563D<T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f144412a;

    /* renamed from: b  reason: collision with root package name */
    private final X f144413b;

    /* renamed from: c  reason: collision with root package name */
    private final C17251d<T> f144414c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f144415d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f144416e;

    public C17563D(C17514c cVar, X x10, C17251d<? extends T> dVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(x10, "lexer");
        C17542s.j(dVar, "deserializer");
        this.f144412a = cVar;
        this.f144413b = x10;
        this.f144414c = dVar;
    }

    public boolean hasNext() {
        if (this.f144416e) {
            return false;
        }
        if (this.f144413b.H() == 9) {
            this.f144416e = true;
            this.f144413b.l((byte) 9);
            if (this.f144413b.E()) {
                if (this.f144413b.H() != 8) {
                    this.f144413b.x();
                } else {
                    C17570a.z(this.f144413b, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, (String) null, 6, (Object) null);
                    throw new C16820k();
                }
            }
            return false;
        } else if (this.f144413b.E() || this.f144416e) {
            return true;
        } else {
            X x10 = this.f144413b;
            String c10 = C17571b.c((byte) 9);
            int i10 = x10.f144471a;
            int i11 = i10 - 1;
            C17570a.z(x10, "Expected " + c10 + ", but had '" + ((i10 == x10.D().length() || i11 < 0) ? "EOF" : String.valueOf(x10.D().charAt(i11))) + "' instead", i11, (String) null, 4, (Object) null);
            throw new C16820k();
        }
    }

    public T next() {
        if (this.f144415d) {
            this.f144415d = false;
        } else {
            this.f144413b.m(',');
        }
        return new a0(this.f144412a, k0.OBJ, this.f144413b, this.f144414c.getDescriptor(), (a0.a) null).E(this.f144414c);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

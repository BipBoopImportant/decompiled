package s0;

import E1.H;
import YH.C16877v;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import oI.C17693a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Ls0/j;", "", "LE1/H;", "", "hasNext", "()Z", "h", "()LE1/H;", "Ls0/q;", "info", "d", "(Ls0/q;)LE1/H;", "", "a", "I", "itemCount", "Lkotlin/Function2;", "", "b", "LnI/p;", "getMeasurables", "", "c", "Ljava/util/List;", "_list", "itemIndex", "e", "listIndex", "()Ljava/util/List;", "list", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.j  reason: case insensitive filesystem */
public final class C5864j implements Iterator<H>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final int f28813a;

    /* renamed from: b  reason: collision with root package name */
    private final p<Integer, C5871q, List<H>> f28814b;

    /* renamed from: c  reason: collision with root package name */
    private final List<H> f28815c;

    /* renamed from: d  reason: collision with root package name */
    private int f28816d;

    /* renamed from: e  reason: collision with root package name */
    private int f28817e;

    public static /* synthetic */ H f(C5864j jVar, C5871q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = new C5871q(0, 0, 0.0f, 0.0f, 15, (DefaultConstructorMarker) null);
        }
        return jVar.d(qVar);
    }

    public final List<H> c() {
        return this.f28815c;
    }

    public final H d(C5871q qVar) {
        if (this.f28817e < c().size()) {
            H h10 = c().get(this.f28817e);
            this.f28817e++;
            return h10;
        }
        int i10 = this.f28816d;
        if (i10 < this.f28813a) {
            List invoke = this.f28814b.invoke(Integer.valueOf(i10), qVar);
            this.f28816d++;
            if (invoke.isEmpty()) {
                return next();
            }
            this.f28815c.addAll(invoke);
            this.f28817e++;
            return (H) C16877v.w0(invoke);
        }
        throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.f28816d);
    }

    /* renamed from: h */
    public H next() {
        return f(this, (C5871q) null, 1, (Object) null);
    }

    public boolean hasNext() {
        return this.f28817e < c().size() || this.f28816d < this.f28813a;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package w5;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import y5.C8979b;
import y5.C8980c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\b2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u0003H&¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw5/b;", "", "RowType", "Lkotlin/Function1;", "Ly5/c;", "mapper", "<init>", "(LnI/l;)V", "R", "Ly5/b;", "a", "(LnI/l;)Ly5/b;", "", "b", "()Ljava/util/List;", "c", "()Ljava/lang/Object;", "d", "LnI/l;", "e", "()LnI/l;", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b<RowType> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C8980c, RowType> f57186a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "RowType", "Ly5/c;", "cursor", "Ly5/b;", "", "a", "(Ly5/c;)Ly5/b;"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17642l<C8980c, C8979b<List<RowType>>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b<RowType> f57187c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b<? extends RowType> bVar) {
            super(1);
            this.f57187c = bVar;
        }

        /* renamed from: a */
        public final C8979b<List<RowType>> invoke(C8980c cVar) {
            C17542s.j(cVar, "cursor");
            ArrayList arrayList = new ArrayList();
            while (cVar.next().getValue().booleanValue()) {
                arrayList.add(this.f57187c.e().invoke(cVar));
            }
            return C8979b.C0933b.a(C8979b.C0933b.b(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RowType", "Ly5/c;", "cursor", "Ly5/b;", "a", "(Ly5/c;)Ly5/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w5.b$b  reason: collision with other inner class name */
    static final class C0920b extends C17544u implements C17642l<C8980c, C8979b<RowType>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b<RowType> f57188c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0920b(b<? extends RowType> bVar) {
            super(1);
            this.f57188c = bVar;
        }

        /* renamed from: a */
        public final C8979b<RowType> invoke(C8980c cVar) {
            C17542s.j(cVar, "cursor");
            if (!cVar.next().getValue().booleanValue()) {
                return C8979b.C0933b.a(C8979b.C0933b.b(null));
            }
            RowType invoke = this.f57188c.e().invoke(cVar);
            boolean booleanValue = cVar.next().getValue().booleanValue();
            b<RowType> bVar = this.f57188c;
            if (!booleanValue) {
                return C8979b.C0933b.a(C8979b.C0933b.b(invoke));
            }
            throw new IllegalStateException(("ResultSet returned more than 1 row for " + bVar).toString());
        }
    }

    public b(C17642l<? super C8980c, ? extends RowType> lVar) {
        C17542s.j(lVar, "mapper");
        this.f57186a = lVar;
    }

    public abstract <R> C8979b<R> a(C17642l<? super C8980c, ? extends C8979b<R>> lVar);

    public final List<RowType> b() {
        return (List) a(new a(this)).getValue();
    }

    public final RowType c() {
        RowType d10 = d();
        if (d10 != null) {
            return d10;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }

    public final RowType d() {
        return a(new C0920b(this)).getValue();
    }

    public final C17642l<C8980c, RowType> e() {
        return this.f57186a;
    }
}

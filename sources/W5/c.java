package w5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import y5.C8980c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lw5/c;", "", "RowType", "Lw5/b;", "Lkotlin/Function1;", "Ly5/c;", "mapper", "<init>", "(LnI/l;)V", "Lw5/c$a;", "listener", "LXH/N;", "f", "(Lw5/c$a;)V", "g", "a", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c<RowType> extends b<RowType> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw5/c$a;", "", "LXH/N;", "a", "()V", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(C17642l<? super C8980c, ? extends RowType> lVar) {
        super(lVar);
        C17542s.j(lVar, "mapper");
    }

    public abstract void f(a aVar);

    public abstract void g(a aVar);
}

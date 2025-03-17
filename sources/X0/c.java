package X0;

import YH.C16860d;
import b1.C5257d;
import java.util.List;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LX0/c;", "E", "", "LX0/b;", "", "fromIndex", "toIndex", "subList", "(II)LX0/c;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c<E> extends List<E>, b<E>, C17693a {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LX0/c$a;", "E", "LX0/c;", "LYH/d;", "source", "", "fromIndex", "toIndex", "<init>", "(LX0/c;II)V", "index", "get", "(I)Ljava/lang/Object;", "subList", "(II)LX0/c;", "b", "LX0/c;", "c", "I", "d", "e", "_size", "a", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<E> extends C16860d<E> implements c<E> {

        /* renamed from: b  reason: collision with root package name */
        private final c<E> f14684b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14685c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14686d;

        /* renamed from: e  reason: collision with root package name */
        private int f14687e;

        public a(c<? extends E> cVar, int i10, int i11) {
            this.f14684b = cVar;
            this.f14685c = i10;
            this.f14686d = i11;
            C5257d.c(i10, i11, cVar.size());
            this.f14687e = i11 - i10;
        }

        public int a() {
            return this.f14687e;
        }

        public E get(int i10) {
            C5257d.a(i10, this.f14687e);
            return this.f14684b.get(this.f14685c + i10);
        }

        public c<E> subList(int i10, int i11) {
            C5257d.c(i10, i11, this.f14687e);
            c<E> cVar = this.f14684b;
            int i12 = this.f14685c;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    c<E> subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}

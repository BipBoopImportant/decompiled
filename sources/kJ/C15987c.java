package KJ;

import PJ.C16210d;
import YH.C16860d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LKJ/c;", "E", "", "LKJ/b;", "", "fromIndex", "toIndex", "subList", "(II)LKJ/c;", "b", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KJ.c  reason: case insensitive filesystem */
public interface C15987c<E> extends List<E>, C15986b<E>, C17693a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KJ.c$a */
    public static final class a {
        public static <E> C15987c<E> a(C15987c<? extends E> cVar, int i10, int i11) {
            return new b(cVar, i10, i11);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LKJ/c$b;", "E", "LKJ/c;", "LYH/d;", "source", "", "fromIndex", "toIndex", "<init>", "(LKJ/c;II)V", "index", "get", "(I)Ljava/lang/Object;", "subList", "(II)LKJ/c;", "b", "LKJ/c;", "c", "I", "d", "e", "_size", "a", "()I", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KJ.c$b */
    private static final class b<E> extends C16860d<E> implements C15987c<E> {

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<E> f135911b;

        /* renamed from: c  reason: collision with root package name */
        private final int f135912c;

        /* renamed from: d  reason: collision with root package name */
        private final int f135913d;

        /* renamed from: e  reason: collision with root package name */
        private int f135914e;

        public b(C15987c<? extends E> cVar, int i10, int i11) {
            C17542s.j(cVar, "source");
            this.f135911b = cVar;
            this.f135912c = i10;
            this.f135913d = i11;
            C16210d.c(i10, i11, cVar.size());
            this.f135914e = i11 - i10;
        }

        public int a() {
            return this.f135914e;
        }

        public E get(int i10) {
            C16210d.a(i10, this.f135914e);
            return this.f135911b.get(this.f135912c + i10);
        }

        public C15987c<E> subList(int i10, int i11) {
            C16210d.c(i10, i11, this.f135914e);
            C15987c<E> cVar = this.f135911b;
            int i12 = this.f135912c;
            return new b(cVar, i10 + i12, i12 + i11);
        }
    }

    C15987c<E> subList(int i10, int i11);
}

package GJ;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"LGJ/b;", "T", "LGJ/h;", "LGJ/c;", "sequence", "", "count", "<init>", "(LGJ/h;I)V", "n", "a", "(I)LGJ/h;", "b", "", "iterator", "()Ljava/util/Iterator;", "LGJ/h;", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GJ.b  reason: case insensitive filesystem */
public final class C15759b<T> implements C15765h<T>, C15760c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15765h<T> f134723a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f134724b;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"GJ/b$a", "", "LXH/N;", "c", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "b", "I", "getLeft", "()I", "setLeft", "(I)V", "left", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GJ.b$a */
    public static final class a implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f134725a;

        /* renamed from: b  reason: collision with root package name */
        private int f134726b;

        a(C15759b<T> bVar) {
            this.f134725a = bVar.f134723a.iterator();
            this.f134726b = bVar.f134724b;
        }

        private final void c() {
            while (this.f134726b > 0 && this.f134725a.hasNext()) {
                this.f134725a.next();
                this.f134726b--;
            }
        }

        public boolean hasNext() {
            c();
            return this.f134725a.hasNext();
        }

        public T next() {
            c();
            return this.f134725a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15759b(C15765h<? extends T> hVar, int i10) {
        C17542s.j(hVar, "sequence");
        this.f134723a = hVar;
        this.f134724b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    public C15765h<T> a(int i10) {
        int i11 = this.f134724b + i10;
        return i11 < 0 ? new C15759b(this, i10) : new C15759b(this.f134723a, i11);
    }

    public C15765h<T> b(int i10) {
        int i11 = this.f134724b;
        int i12 = i11 + i10;
        return i12 < 0 ? new y(this, i10) : new x(this.f134723a, i11, i12);
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}

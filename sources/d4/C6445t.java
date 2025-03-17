package D4;

import YH.C16860d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"LD4/t;", "T", "LYH/d;", "", "placeholdersBefore", "placeholdersAfter", "", "items", "<init>", "(IILjava/util/List;)V", "index", "get", "(I)Ljava/lang/Object;", "b", "I", "getPlaceholdersBefore", "()I", "c", "getPlaceholdersAfter", "d", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "a", "size", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.t  reason: case insensitive filesystem */
public final class C6445t<T> extends C16860d<T> {

    /* renamed from: b  reason: collision with root package name */
    private final int f34444b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34445c;

    /* renamed from: d  reason: collision with root package name */
    private final List<T> f34446d;

    public C6445t(int i10, int i11, List<? extends T> list) {
        C17542s.j(list, "items");
        this.f34444b = i10;
        this.f34445c = i11;
        this.f34446d = list;
    }

    public int a() {
        return this.f34444b + this.f34446d.size() + this.f34445c;
    }

    public T get(int i10) {
        if (i10 >= 0 && i10 < this.f34444b) {
            return null;
        }
        int i11 = this.f34444b;
        if (i10 < this.f34446d.size() + i11 && i11 <= i10) {
            return this.f34446d.get(i10 - this.f34444b);
        }
        int size = this.f34444b + this.f34446d.size();
        if (i10 < size() && size <= i10) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i10 + " in ItemSnapshotList of size " + size());
    }
}

package b1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb1/d;", "", "<init>", "()V", "", "index", "size", "LXH/N;", "a", "(II)V", "b", "fromIndex", "toIndex", "c", "(III)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: b1.d  reason: case insensitive filesystem */
public final class C5257d {

    /* renamed from: a  reason: collision with root package name */
    public static final C5257d f22940a = new C5257d();

    private C5257d() {
    }

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }
    }

    public static final void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }
    }

    public static final void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
        } else if (i10 > i11) {
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }
    }
}

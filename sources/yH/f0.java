package YH;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rJ\u0018\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010'R$\u0010.\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b8\u0016@RX\u000e¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"LYH/f0;", "T", "LYH/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "", "buffer", "", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "index", "get", "(I)Ljava/lang/Object;", "", "t", "()Z", "", "iterator", "()Ljava/util/Iterator;", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "maxCapacity", "s", "(I)LYH/f0;", "element", "LXH/N;", "q", "(Ljava/lang/Object;)V", "n", "x", "b", "[Ljava/lang/Object;", "c", "I", "d", "startIndex", "value", "e", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f0<T> extends C16860d<T> implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f140444b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f140445c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140446d;

    /* renamed from: e  reason: collision with root package name */
    private int f140447e;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"YH/f0$a", "LYH/c;", "LXH/N;", "c", "()V", "", "I", "count", "d", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C16859c<T> {

        /* renamed from: c  reason: collision with root package name */
        private int f140448c;

        /* renamed from: d  reason: collision with root package name */
        private int f140449d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f0<T> f140450e;

        a(f0<T> f0Var) {
            this.f140450e = f0Var;
            this.f140448c = f0Var.size();
            this.f140449d = f0Var.f140446d;
        }

        /* access modifiers changed from: protected */
        public void c() {
            if (this.f140448c == 0) {
                d();
                return;
            }
            f(this.f140450e.f140444b[this.f140449d]);
            this.f140449d = (this.f140449d + 1) % this.f140450e.f140445c;
            this.f140448c--;
        }
    }

    public f0(Object[] objArr, int i10) {
        C17542s.j(objArr, "buffer");
        this.f140444b = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        } else if (i10 <= objArr.length) {
            this.f140445c = objArr.length;
            this.f140447e = i10;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    public int a() {
        return this.f140447e;
    }

    public T get(int i10) {
        C16860d.f140429a.b(i10, size());
        return this.f140444b[(this.f140446d + i10) % this.f140445c];
    }

    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void q(T t10) {
        if (!t()) {
            this.f140444b[(this.f140446d + size()) % this.f140445c] = t10;
            this.f140447e = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final f0<T> s(int i10) {
        Object[] objArr;
        int i11 = this.f140445c;
        int i12 = C17978n.i(i11 + (i11 >> 1) + 1, i10);
        if (this.f140446d == 0) {
            objArr = Arrays.copyOf(this.f140444b, i12);
            C17542s.i(objArr, "copyOf(...)");
        } else {
            objArr = toArray(new Object[i12]);
        }
        return new f0<>(objArr, size());
    }

    public final boolean t() {
        return size() == this.f140445c;
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            C17542s.i(tArr, "copyOf(...)");
        }
        int size = size();
        int i10 = this.f140446d;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size && i10 < this.f140445c) {
            tArr[i12] = this.f140444b[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            tArr[i12] = this.f140444b[i11];
            i12++;
            i11++;
        }
        return C16877v.g(size, tArr);
    }

    public final void x(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        } else if (i10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        } else if (i10 > 0) {
            int i11 = this.f140446d;
            int m10 = (i11 + i10) % this.f140445c;
            if (i11 > m10) {
                C16870n.x(this.f140444b, null, i11, this.f140445c);
                C16870n.x(this.f140444b, null, 0, m10);
            } else {
                C16870n.x(this.f140444b, null, i11, m10);
            }
            this.f140446d = m10;
            this.f140447e = size() - i10;
        }
    }

    public f0(int i10) {
        this(new Object[i10], 0);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}

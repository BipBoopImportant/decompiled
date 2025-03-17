package j0;

import YH.C16870n;
import java.util.Arrays;
import k0.C5489a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b!\u0010%R\u0016\u0010)\u001a\u00020'8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u0010/\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010.¨\u00060"}, d2 = {"Lj0/c0;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Lj0/c0;", "key", "e", "(I)Ljava/lang/Object;", "index", "LXH/N;", "m", "value", "n", "(ILjava/lang/Object;)Ljava/lang/Object;", "l", "(ILjava/lang/Object;)V", "o", "()I", "k", "(I)I", "p", "f", "j", "(Ljava/lang/Object;)I", "", "d", "(I)Z", "b", "()V", "a", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[I", "keys", "", "", "[Ljava/lang/Object;", "values", "I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class c0<E> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f24601a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ int[] f24602b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f24603c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ int f24604d;

    public c0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public void a(int i10, E e10) {
        int i11 = this.f24604d;
        if (i11 == 0 || i10 > this.f24602b[i11 - 1]) {
            if (this.f24601a && i11 >= this.f24602b.length) {
                d0.d(this);
            }
            int i12 = this.f24604d;
            if (i12 >= this.f24602b.length) {
                int e11 = C5489a.e(i12 + 1);
                int[] copyOf = Arrays.copyOf(this.f24602b, e11);
                C17542s.i(copyOf, "copyOf(this, newSize)");
                this.f24602b = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f24603c, e11);
                C17542s.i(copyOf2, "copyOf(this, newSize)");
                this.f24603c = copyOf2;
            }
            this.f24602b[i12] = i10;
            this.f24603c[i12] = e10;
            this.f24604d = i12 + 1;
            return;
        }
        l(i10, e10);
    }

    public void b() {
        int i10 = this.f24604d;
        Object[] objArr = this.f24603c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24604d = 0;
        this.f24601a = false;
    }

    /* renamed from: c */
    public c0<E> clone() {
        Object clone = super.clone();
        C17542s.h(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        c0<E> c0Var = (c0) clone;
        c0Var.f24602b = (int[]) this.f24602b.clone();
        c0Var.f24603c = (Object[]) this.f24603c.clone();
        return c0Var;
    }

    public boolean d(int i10) {
        return f(i10) >= 0;
    }

    public E e(int i10) {
        return d0.c(this, i10);
    }

    public int f(int i10) {
        if (this.f24601a) {
            d0.d(this);
        }
        return C5489a.a(this.f24602b, this.f24604d, i10);
    }

    public int j(E e10) {
        if (this.f24601a) {
            d0.d(this);
        }
        int i10 = this.f24604d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24603c[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public int k(int i10) {
        if (this.f24601a) {
            d0.d(this);
        }
        return this.f24602b[i10];
    }

    public void l(int i10, E e10) {
        int a10 = C5489a.a(this.f24602b, this.f24604d, i10);
        if (a10 >= 0) {
            this.f24603c[a10] = e10;
            return;
        }
        int i11 = ~a10;
        if (i11 >= this.f24604d || this.f24603c[i11] != d0.f24605a) {
            if (this.f24601a && this.f24604d >= this.f24602b.length) {
                d0.d(this);
                i11 = ~C5489a.a(this.f24602b, this.f24604d, i10);
            }
            int i12 = this.f24604d;
            if (i12 >= this.f24602b.length) {
                int e11 = C5489a.e(i12 + 1);
                int[] copyOf = Arrays.copyOf(this.f24602b, e11);
                C17542s.i(copyOf, "copyOf(this, newSize)");
                this.f24602b = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f24603c, e11);
                C17542s.i(copyOf2, "copyOf(this, newSize)");
                this.f24603c = copyOf2;
            }
            int i13 = this.f24604d;
            if (i13 - i11 != 0) {
                int[] iArr = this.f24602b;
                int i14 = i11 + 1;
                C16870n.l(iArr, iArr, i14, i11, i13);
                Object[] objArr = this.f24603c;
                C16870n.n(objArr, objArr, i14, i11, this.f24604d);
            }
            this.f24602b[i11] = i10;
            this.f24603c[i11] = e10;
            this.f24604d++;
            return;
        }
        this.f24602b[i11] = i10;
        this.f24603c[i11] = e10;
    }

    public void m(int i10) {
        if (this.f24603c[i10] != d0.f24605a) {
            this.f24603c[i10] = d0.f24605a;
            this.f24601a = true;
        }
    }

    public E n(int i10, E e10) {
        int f10 = f(i10);
        if (f10 < 0) {
            return null;
        }
        E[] eArr = this.f24603c;
        E e11 = eArr[f10];
        eArr[f10] = e10;
        return e11;
    }

    public int o() {
        if (this.f24601a) {
            d0.d(this);
        }
        return this.f24604d;
    }

    public E p(int i10) {
        if (this.f24601a) {
            d0.d(this);
        }
        return this.f24603c[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24604d * 28);
        sb2.append('{');
        int i10 = this.f24604d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(k(i11));
            sb2.append('=');
            Object p10 = p(i11);
            if (p10 != this) {
                sb2.append(p10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C17542s.i(sb3, "buffer.toString()");
        return sb3;
    }

    public c0(int i10) {
        if (i10 == 0) {
            this.f24602b = C5489a.f24990a;
            this.f24603c = C5489a.f24992c;
            return;
        }
        int e10 = C5489a.e(i10);
        this.f24602b = new int[e10];
        this.f24603c = new Object[e10];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}

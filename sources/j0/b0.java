package j0;

import YH.C16870n;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k0.C5489a;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010<R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010A¨\u0006B"}, d2 = {"Lj0/b0;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Lj0/b0;)V", "LXH/N;", "clear", "()V", "minimumCapacity", "b", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)I", "value", "a", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "h", "(I)Ljava/lang/Object;", "m", "l", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "i", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "k", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", "c", "(Ljava/lang/Object;I)I", "f", "", "[I", "hashes", "", "[Ljava/lang/Object;", "array", "I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f24598a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f24599b;

    /* renamed from: c  reason: collision with root package name */
    private int f24600c;

    public b0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final int c(K k10, int i10) {
        int i11 = this.f24600c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = C5489a.a(this.f24598a, i11, i10);
        if (a10 < 0 || C17542s.e(k10, this.f24599b[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f24598a[i12] == i10) {
            if (C17542s.e(k10, this.f24599b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f24598a[i13] == i10) {
            if (C17542s.e(k10, this.f24599b[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    private final int f() {
        int i10 = this.f24600c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = C5489a.a(this.f24598a, i10, 0);
        if (a10 < 0 || this.f24599b[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f24598a[i11] == 0) {
            if (this.f24599b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f24598a[i12] == 0) {
            if (this.f24599b[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public final int a(V v10) {
        int i10 = this.f24600c * 2;
        Object[] objArr = this.f24599b;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (C17542s.e(v10, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f24600c;
        int[] iArr = this.f24598a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, i10);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f24598a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f24599b, i10 * 2);
            C17542s.i(copyOf2, "copyOf(this, newSize)");
            this.f24599b = copyOf2;
        }
        if (this.f24600c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f24600c > 0) {
            this.f24598a = C5489a.f24990a;
            this.f24599b = C5489a.f24992c;
            this.f24600c = 0;
        }
        if (this.f24600c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return d(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    public int d(K k10) {
        return k10 == null ? f() : c(k10, k10.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof b0) {
                if (size() != ((b0) obj).size()) {
                    return false;
                }
                b0 b0Var = (b0) obj;
                int i10 = this.f24600c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object h10 = h(i11);
                    Object m10 = m(i11);
                    Object obj2 = b0Var.get(h10);
                    if (m10 == null) {
                        if (obj2 != null || !b0Var.containsKey(h10)) {
                            return false;
                        }
                    } else if (!C17542s.e(m10, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            } else {
                int i12 = this.f24600c;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object h11 = h(i13);
                    Object m11 = m(i13);
                    Object obj3 = ((Map) obj).get(h11);
                    if (m11 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(h11)) {
                            return false;
                        }
                    } else if (!C17542s.e(m11, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k10) {
        int d10 = d(k10);
        if (d10 >= 0) {
            return this.f24599b[(d10 << 1) + 1];
        }
        return null;
    }

    public V getOrDefault(Object obj, V v10) {
        int d10 = d(obj);
        return d10 >= 0 ? this.f24599b[(d10 << 1) + 1] : v10;
    }

    public K h(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24600c) {
            z10 = true;
        }
        if (!z10) {
            d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f24599b[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f24598a;
        Object[] objArr = this.f24599b;
        int i10 = this.f24600c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(b0<? extends K, ? extends V> b0Var) {
        C17542s.j(b0Var, "map");
        int i10 = b0Var.f24600c;
        b(this.f24600c + i10);
        if (this.f24600c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(b0Var.h(i11), b0Var.m(i11));
            }
        } else if (i10 > 0) {
            C16870n.l(b0Var.f24598a, this.f24598a, 0, 0, i10);
            C16870n.n(b0Var.f24599b, this.f24599b, 0, 0, i10 << 1);
            this.f24600c = i10;
        }
    }

    public boolean isEmpty() {
        return this.f24600c <= 0;
    }

    public V k(int i10) {
        if (!(i10 >= 0 && i10 < this.f24600c)) {
            d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        V[] vArr = this.f24599b;
        int i11 = i10 << 1;
        V v10 = vArr[i11 + 1];
        int i12 = this.f24600c;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f24598a;
            int i14 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i15 = i10 + 1;
                    C16870n.l(iArr, iArr, i10, i15, i12);
                    Object[] objArr = this.f24599b;
                    C16870n.n(objArr, objArr, i11, i15 << 1, i12 << 1);
                }
                Object[] objArr2 = this.f24599b;
                int i16 = i13 << 1;
                objArr2[i16] = null;
                objArr2[i16 + 1] = null;
            } else {
                if (i12 > 8) {
                    i14 = i12 + (i12 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i14);
                C17542s.i(copyOf, "copyOf(this, newSize)");
                this.f24598a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f24599b, i14 << 1);
                C17542s.i(copyOf2, "copyOf(this, newSize)");
                this.f24599b = copyOf2;
                if (i12 == this.f24600c) {
                    if (i10 > 0) {
                        C16870n.l(iArr, this.f24598a, 0, 0, i10);
                        C16870n.n(vArr, this.f24599b, 0, 0, i11);
                    }
                    if (i10 < i13) {
                        int i17 = i10 + 1;
                        C16870n.l(iArr, this.f24598a, i10, i17, i12);
                        C16870n.n(vArr, this.f24599b, i11, i17 << 1, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i12 == this.f24600c) {
                this.f24600c = i13;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v10;
    }

    public V l(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24600c) {
            z10 = true;
        }
        if (!z10) {
            d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f24599b;
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    public V m(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24600c) {
            z10 = true;
        }
        if (!z10) {
            d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f24599b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10 = this.f24600c;
        int hashCode = k10 != null ? k10.hashCode() : 0;
        int c10 = k10 != null ? c(k10, hashCode) : f();
        if (c10 >= 0) {
            int i11 = (c10 << 1) + 1;
            V[] vArr = this.f24599b;
            V v11 = vArr[i11];
            vArr[i11] = v10;
            return v11;
        }
        int i12 = ~c10;
        int[] iArr = this.f24598a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f24598a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f24599b, i13 << 1);
            C17542s.i(copyOf2, "copyOf(this, newSize)");
            this.f24599b = copyOf2;
            if (i10 != this.f24600c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f24598a;
            int i14 = i12 + 1;
            C16870n.l(iArr2, iArr2, i14, i12, i10);
            Object[] objArr = this.f24599b;
            C16870n.n(objArr, objArr, i14 << 1, i12 << 1, this.f24600c << 1);
        }
        int i15 = this.f24600c;
        if (i10 == i15) {
            int[] iArr3 = this.f24598a;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr2 = this.f24599b;
                int i16 = i12 << 1;
                objArr2[i16] = k10;
                objArr2[i16 + 1] = v10;
                this.f24600c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(K k10) {
        int d10 = d(k10);
        if (d10 >= 0) {
            return k(d10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int d10 = d(k10);
        if (d10 >= 0) {
            return l(d10, v10);
        }
        return null;
    }

    public int size() {
        return this.f24600c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24600c * 28);
        sb2.append('{');
        int i10 = this.f24600c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object h10 = h(i11);
            if (h10 != sb2) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object m10 = m(i11);
            if (m10 != sb2) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public b0(int i10) {
        int[] iArr;
        Object[] objArr;
        if (i10 == 0) {
            iArr = C5489a.f24990a;
        } else {
            iArr = new int[i10];
        }
        this.f24598a = iArr;
        if (i10 == 0) {
            objArr = C5489a.f24992c;
        } else {
            objArr = new Object[(i10 << 1)];
        }
        this.f24599b = objArr;
    }

    public boolean remove(K k10, V v10) {
        int d10 = d(k10);
        if (d10 < 0 || !C17542s.e(v10, m(d10))) {
            return false;
        }
        k(d10);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int d10 = d(k10);
        if (d10 < 0 || !C17542s.e(v10, m(d10))) {
            return false;
        }
        l(d10, v11);
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public b0(b0<? extends K, ? extends V> b0Var) {
        this(0, 1, (DefaultConstructorMarker) null);
        if (b0Var != null) {
            i(b0Var);
        }
    }
}

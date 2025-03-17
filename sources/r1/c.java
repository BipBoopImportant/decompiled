package R1;

import YH.C16870n;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\"\u0010-\u001a\u00020\u00048\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u0007¨\u0006."}, d2 = {"LR1/c;", "K", "V", "", "", "capacity", "<init>", "(I)V", "key", "hash", "c", "(Ljava/lang/Object;I)I", "e", "()I", "", "a", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)I", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "g", "(I)Ljava/lang/Object;", "i", "f", "()Z", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "get_size", "set_size", "_size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f12287a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f12288b;

    /* renamed from: c  reason: collision with root package name */
    private int f12289c;

    public c() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final boolean a(K k10) {
        return d(k10) >= 0;
    }

    public final V b(K k10) {
        int d10 = d(k10);
        if (d10 >= 0) {
            return this.f12288b[(d10 << 1) + 1];
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final int c(Object obj, int i10) {
        int i11 = this.f12289c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = a.a(this.f12287a, i11, i10);
        if (a10 < 0 || C17542s.e(obj, this.f12288b[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f12287a[i12] == i10) {
            if (C17542s.e(obj, this.f12288b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f12287a[i13] == i10) {
            if (C17542s.e(obj, this.f12288b[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    /* access modifiers changed from: protected */
    public final int e() {
        int i10 = this.f12289c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = a.a(this.f12287a, i10, 0);
        if (a10 < 0 || this.f12288b[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f12287a[i11] == 0) {
            if (this.f12288b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f12287a[i12] == 0) {
            if (this.f12288b[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f12289c;
                if (i10 != cVar.f12289c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object g10 = g(i11);
                    Object i12 = i(i11);
                    Object b10 = cVar.b(g10);
                    if (i12 == null) {
                        if (b10 != null || !cVar.a(g10)) {
                            return false;
                        }
                    } else if (!C17542s.e(i12, b10)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f12289c != ((Map) obj).size()) {
                return false;
            } else {
                int i13 = this.f12289c;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object g11 = g(i14);
                    Object i15 = i(i14);
                    Object obj2 = ((Map) obj).get(g11);
                    if (i15 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(g11)) {
                            return false;
                        }
                    } else if (!C17542s.e(i15, obj2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f12289c <= 0;
    }

    public final K g(int i10) {
        return this.f12288b[i10 << 1];
    }

    public final V h(K k10, V v10) {
        int i10;
        int i11;
        int i12 = this.f12289c;
        if (k10 == null) {
            i11 = e();
            i10 = 0;
        } else {
            i10 = k10.hashCode();
            i11 = c(k10, i10);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.f12288b;
            V v11 = vArr[i13];
            vArr[i13] = v10;
            return v11;
        }
        int i14 = ~i11;
        int[] iArr = this.f12287a;
        if (i12 >= iArr.length) {
            int i15 = 8;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i15 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i15);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f12287a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12288b, i15 << 1);
            C17542s.i(copyOf2, "copyOf(this, newSize)");
            this.f12288b = copyOf2;
            if (i12 != this.f12289c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr2 = this.f12287a;
            int i16 = i14 + 1;
            C16870n.l(iArr2, iArr2, i16, i14, i12);
            Object[] objArr = this.f12288b;
            C16870n.n(objArr, objArr, i16 << 1, i14 << 1, this.f12289c << 1);
        }
        int i17 = this.f12289c;
        if (i12 == i17) {
            int[] iArr3 = this.f12287a;
            if (i14 < iArr3.length) {
                iArr3[i14] = i10;
                Object[] objArr2 = this.f12288b;
                int i18 = i14 << 1;
                objArr2[i18] = k10;
                objArr2[i18 + 1] = v10;
                this.f12289c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.f12287a;
        Object[] objArr = this.f12288b;
        int i10 = this.f12289c;
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

    public final V i(int i10) {
        return this.f12288b[(i10 << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12289c * 28);
        sb2.append('{');
        int i10 = this.f12289c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object g10 = g(i11);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object i12 = i(i11);
            if (i12 != this) {
                sb2.append(i12);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f12287a = a.f12275a;
            this.f12288b = a.f12276b;
        } else {
            this.f12287a = new int[i10];
            this.f12288b = new Object[(i10 << 1)];
        }
        this.f12289c = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}

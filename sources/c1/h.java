package c1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc1/h;", "", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", "key", "a", "(J)I", "b", "(J)Ljava/lang/Object;", "value", "", "d", "(JLjava/lang/Object;)Z", "c", "(JLjava/lang/Object;)Lc1/h;", "I", "[J", "[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f23020a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f23021b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f23022c;

    public h(int i10, long[] jArr, Object[] objArr) {
        this.f23020a = i10;
        this.f23021b = jArr;
        this.f23022c = objArr;
    }

    private final int a(long j10) {
        int i10 = this.f23020a - 1;
        if (i10 == -1) {
            return -1;
        }
        int i11 = 0;
        if (i10 != 0) {
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                int i13 = ((this.f23021b[i12] - j10) > 0 ? 1 : ((this.f23021b[i12] - j10) == 0 ? 0 : -1));
                if (i13 < 0) {
                    i11 = i12 + 1;
                } else if (i13 <= 0) {
                    return i12;
                } else {
                    i10 = i12 - 1;
                }
            }
            return -(i11 + 1);
        }
        long j11 = this.f23021b[0];
        if (j11 == j10) {
            return 0;
        }
        return j11 > j10 ? -2 : -1;
    }

    public final Object b(long j10) {
        int a10 = a(j10);
        if (a10 >= 0) {
            return this.f23022c[a10];
        }
        return null;
    }

    public final h c(long j10, Object obj) {
        int i10 = this.f23020a;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : this.f23022c) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j11 = this.f23021b[i14];
                Object obj3 = this.f23022c[i14];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i11] = j11;
                    objArr[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr[i12] = j10;
                objArr[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = this.f23021b[i14];
                    Object obj4 = this.f23022c[i14];
                    if (obj4 != null) {
                        jArr[i11] = j12;
                        objArr[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr[0] = obj;
        }
        return new h(i13, jArr, objArr);
    }

    public final boolean d(long j10, Object obj) {
        int a10 = a(j10);
        if (a10 < 0) {
            return false;
        }
        this.f23022c[a10] = obj;
        return true;
    }
}

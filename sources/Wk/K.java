package WK;

import XK.C16838e;
import YH.C16870n;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0010¢\u0006\u0004\b%\u0010&J/\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0003H\u0010¢\u0006\u0004\b2\u0010\u001fJ\u001a\u00104\u001a\u00020)2\b\u0010'\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"LWK/K;", "LWK/h;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "g0", "()LWK/h;", "", "a", "()Ljava/lang/String;", "G", "a0", "algorithm", "m", "(Ljava/lang/String;)LWK/h;", "", "beginIndex", "endIndex", "Y", "(II)LWK/h;", "pos", "", "L", "(I)B", "E", "()I", "b0", "()[B", "LWK/e;", "buffer", "offset", "byteCount", "LXH/N;", "d0", "(LWK/e;II)V", "other", "otherOffset", "", "Q", "(ILWK/h;II)Z", "R", "(I[BII)Z", "fromIndex", "I", "([BI)I", "N", "K", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "f", "[[B", "f0", "()[[B", "g", "[I", "e0", "()[I", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class K extends C16773h {

    /* renamed from: f  reason: collision with root package name */
    private final transient byte[][] f139622f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int[] f139623g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K(byte[][] bArr, int[] iArr) {
        super(C16773h.f139665e.C());
        C17542s.j(bArr, "segments");
        C17542s.j(iArr, "directory");
        this.f139622f = bArr;
        this.f139623g = iArr;
    }

    private final C16773h g0() {
        return new C16773h(b0());
    }

    public int E() {
        return e0()[f0().length - 1];
    }

    public String G() {
        return g0().G();
    }

    public int I(byte[] bArr, int i10) {
        C17542s.j(bArr, "other");
        return g0().I(bArr, i10);
    }

    public byte[] K() {
        return b0();
    }

    public byte L(int i10) {
        C16767b.b((long) e0()[f0().length - 1], (long) i10, 1);
        int b10 = C16838e.b(this, i10);
        return f0()[b10][(i10 - (b10 == 0 ? 0 : e0()[b10 - 1])) + e0()[f0().length + b10]];
    }

    public int N(byte[] bArr, int i10) {
        C17542s.j(bArr, "other");
        return g0().N(bArr, i10);
    }

    public boolean Q(int i10, C16773h hVar, int i11, int i12) {
        C17542s.j(hVar, "other");
        if (i10 < 0 || i10 > W() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = C16838e.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : e0()[b10 - 1];
            int i15 = e0()[f0().length + b10];
            int min = Math.min(i13, (e0()[b10] - i14) + i14) - i10;
            if (!hVar.R(i11, f0()[b10], i15 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public boolean R(int i10, byte[] bArr, int i11, int i12) {
        C17542s.j(bArr, "other");
        if (i10 < 0 || i10 > W() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = C16838e.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : e0()[b10 - 1];
            int i15 = e0()[f0().length + b10];
            int min = Math.min(i13, (e0()[b10] - i14) + i14) - i10;
            if (!C16767b.a(f0()[b10], i15 + (i10 - i14), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public C16773h Y(int i10, int i11) {
        int e10 = C16767b.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        } else if (e10 <= W()) {
            int i12 = e10 - i10;
            if (i12 < 0) {
                throw new IllegalArgumentException(("endIndex=" + e10 + " < beginIndex=" + i10).toString());
            } else if (i10 == 0 && e10 == W()) {
                return this;
            } else {
                if (i10 == e10) {
                    return C16773h.f139665e;
                }
                int b10 = C16838e.b(this, i10);
                int b11 = C16838e.b(this, e10 - 1);
                byte[][] bArr = (byte[][]) C16870n.u(f0(), b10, b11 + 1);
                int[] iArr = new int[(bArr.length * 2)];
                int i13 = 0;
                if (b10 <= b11) {
                    int i14 = b10;
                    int i15 = 0;
                    while (true) {
                        iArr[i15] = Math.min(e0()[i14] - i10, i12);
                        int i16 = i15 + 1;
                        iArr[i15 + bArr.length] = e0()[f0().length + i14];
                        if (i14 == b11) {
                            break;
                        }
                        i14++;
                        i15 = i16;
                    }
                }
                if (b10 != 0) {
                    i13 = e0()[b10 - 1];
                }
                int length = bArr.length;
                iArr[length] = iArr[length] + (i10 - i13);
                return new K(bArr, iArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex=" + e10 + " > length(" + W() + ')').toString());
        }
    }

    public String a() {
        return g0().a();
    }

    public C16773h a0() {
        return g0().a0();
    }

    public byte[] b0() {
        byte[] bArr = new byte[W()];
        int length = f0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = e0()[length + i10];
            int i14 = e0()[i10];
            int i15 = i14 - i11;
            C16870n.i(f0()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public void d0(C16770e eVar, int i10, int i11) {
        C17542s.j(eVar, "buffer");
        int i12 = i10 + i11;
        int b10 = C16838e.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : e0()[b10 - 1];
            int i14 = e0()[f0().length + b10];
            int min = Math.min(i12, (e0()[b10] - i13) + i13) - i10;
            int i15 = i14 + (i10 - i13);
            I i16 = new I(f0()[b10], i15, i15 + min, true, false);
            I i17 = eVar.f139653a;
            if (i17 == null) {
                i16.f139616g = i16;
                i16.f139615f = i16;
                eVar.f139653a = i16;
            } else {
                C17542s.g(i17);
                I i18 = i17.f139616g;
                C17542s.g(i18);
                i18.c(i16);
            }
            i10 += min;
            b10++;
        }
        eVar.p0(eVar.size() + ((long) i11));
    }

    public final int[] e0() {
        return this.f139623g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16773h) {
            C16773h hVar = (C16773h) obj;
            if (hVar.W() == W() && Q(0, hVar, 0, W())) {
                return true;
            }
        }
        return false;
    }

    public final byte[][] f0() {
        return this.f139622f;
    }

    public int hashCode() {
        int D10 = D();
        if (D10 != 0) {
            return D10;
        }
        int length = f0().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = e0()[length + i10];
            int i14 = e0()[i10];
            byte[] bArr = f0()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        S(i11);
        return i11;
    }

    public C16773h m(String str) {
        C17542s.j(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = f0().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = e0()[length + i10];
            int i13 = e0()[i10];
            instance.update(f0()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = instance.digest();
        C17542s.g(digest);
        return new C16773h(digest);
    }

    public String toString() {
        return g0().toString();
    }
}

package WK;

import HJ.C15854t;
import XK.C16835b;
import YH.C16870n;
import com.adjust.sdk.Constants;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0016\u0018\u0000 R2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\fJ#\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0010¢\u0006\u0004\b#\u0010\"J'\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0014H\u0010¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b.\u0010/J/\u00100\u001a\u00020-2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020-2\u0006\u00102\u001a\u00020\u0000¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020-2\u0006\u00105\u001a\u00020\u0000¢\u0006\u0004\b6\u00104J!\u00108\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00002\b\b\u0002\u00107\u001a\u00020\u0014H\u0007¢\u0006\u0004\b8\u00109J!\u0010:\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u0014H\u0017¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00002\b\b\u0002\u00107\u001a\u00020\u0014H\u0007¢\u0006\u0004\b<\u00109J!\u0010=\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u0014H\u0017¢\u0006\u0004\b=\u0010;J\u001a\u0010?\u001a\u00020-2\b\u0010+\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0014H\u0016¢\u0006\u0004\bA\u0010 J\u0018\u0010B\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0000H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0007H\u0016¢\u0006\u0004\bD\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010\"R\"\u0010A\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bB\u0010:\u001a\u0004\bG\u0010 \"\u0004\bH\u0010IR$\u0010O\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bP\u0010 ¨\u0006S"}, d2 = {"LWK/h;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "", "c0", "()Ljava/lang/String;", "a", "P", "()LWK/h;", "U", "V", "algorithm", "m", "(Ljava/lang/String;)LWK/h;", "G", "a0", "", "beginIndex", "endIndex", "Y", "(II)LWK/h;", "pos", "", "L", "(I)B", "index", "B", "E", "()I", "b0", "()[B", "K", "LWK/e;", "buffer", "offset", "byteCount", "LXH/N;", "d0", "(LWK/e;II)V", "other", "otherOffset", "", "Q", "(ILWK/h;II)Z", "R", "(I[BII)Z", "prefix", "X", "(LWK/h;)Z", "suffix", "v", "fromIndex", "H", "(LWK/h;I)I", "I", "([BI)I", "M", "N", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "b", "(LWK/h;)I", "toString", "[B", "C", "D", "S", "(I)V", "c", "Ljava/lang/String;", "F", "T", "(Ljava/lang/String;)V", "utf8", "W", "size", "d", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.h  reason: case insensitive filesystem */
public class C16773h implements Serializable, Comparable<C16773h> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f139664d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final C16773h f139665e = new C16773h(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f139666a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f139667b;

    /* renamed from: c  reason: collision with root package name */
    private transient String f139668c;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\b*\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u0013\u0010\u0013\u001a\u00020\b*\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00148\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LWK/h$a;", "", "<init>", "()V", "", "", "offset", "byteCount", "LWK/h;", "e", "([BII)LWK/h;", "", "d", "(Ljava/lang/String;)LWK/h;", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)LWK/h;", "a", "b", "", "serialVersionUID", "J", "EMPTY", "LWK/h;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C16773h f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C16767b.c();
            }
            return aVar.e(bArr, i10, i11);
        }

        public final C16773h a(String str) {
            C17542s.j(str, "<this>");
            byte[] a10 = C16766a.a(str);
            if (a10 != null) {
                return new C16773h(a10);
            }
            return null;
        }

        public final C16773h b(String str) {
            C17542s.j(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((C16835b.e(str.charAt(i11)) << 4) + C16835b.e(str.charAt(i11 + 1)));
                }
                return new C16773h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final C16773h c(String str, Charset charset) {
            C17542s.j(str, "<this>");
            C17542s.j(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C17542s.i(bytes, "getBytes(...)");
            return new C16773h(bytes);
        }

        public final C16773h d(String str) {
            C17542s.j(str, "<this>");
            C16773h hVar = new C16773h(S.a(str));
            hVar.T(str);
            return hVar;
        }

        public final C16773h e(byte[] bArr, int i10, int i11) {
            C17542s.j(bArr, "<this>");
            int f10 = C16767b.f(bArr, i11);
            C16767b.b((long) bArr.length, (long) i10, (long) f10);
            return new C16773h(C16870n.s(bArr, i10, f10 + i10));
        }

        private a() {
        }
    }

    public C16773h(byte[] bArr) {
        C17542s.j(bArr, "data");
        this.f139666a = bArr;
    }

    public static /* synthetic */ int J(C16773h hVar, C16773h hVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return hVar.H(hVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int O(C16773h hVar, C16773h hVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = C16767b.c();
            }
            return hVar.M(hVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ C16773h Z(C16773h hVar, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C16767b.c();
            }
            return hVar.Y(i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static final C16773h j(String str) {
        return f139664d.b(str);
    }

    public static final C16773h n(String str) {
        return f139664d.d(str);
    }

    public final byte B(int i10) {
        return L(i10);
    }

    public final byte[] C() {
        return this.f139666a;
    }

    public final int D() {
        return this.f139667b;
    }

    public int E() {
        return C().length;
    }

    public final String F() {
        return this.f139668c;
    }

    public String G() {
        char[] cArr = new char[(C().length * 2)];
        int i10 = 0;
        for (byte b10 : C()) {
            int i11 = i10 + 1;
            cArr[i10] = C16835b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = C16835b.f()[b10 & 15];
        }
        return C15854t.x(cArr);
    }

    public final int H(C16773h hVar, int i10) {
        C17542s.j(hVar, "other");
        return I(hVar.K(), i10);
    }

    public int I(byte[] bArr, int i10) {
        C17542s.j(bArr, "other");
        int length = C().length - bArr.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!C16767b.a(C(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] K() {
        return C();
    }

    public byte L(int i10) {
        return C()[i10];
    }

    public final int M(C16773h hVar, int i10) {
        C17542s.j(hVar, "other");
        return N(hVar.K(), i10);
    }

    public int N(byte[] bArr, int i10) {
        C17542s.j(bArr, "other");
        for (int min = Math.min(C16767b.e(this, i10), C().length - bArr.length); -1 < min; min--) {
            if (C16767b.a(C(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final C16773h P() {
        return m("MD5");
    }

    public boolean Q(int i10, C16773h hVar, int i11, int i12) {
        C17542s.j(hVar, "other");
        return hVar.R(i11, C(), i10, i12);
    }

    public boolean R(int i10, byte[] bArr, int i11, int i12) {
        C17542s.j(bArr, "other");
        return i10 >= 0 && i10 <= C().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && C16767b.a(C(), i10, bArr, i11, i12);
    }

    public final void S(int i10) {
        this.f139667b = i10;
    }

    public final void T(String str) {
        this.f139668c = str;
    }

    public final C16773h U() {
        return m("SHA-1");
    }

    public final C16773h V() {
        return m(Constants.SHA256);
    }

    public final int W() {
        return E();
    }

    public final boolean X(C16773h hVar) {
        C17542s.j(hVar, "prefix");
        return Q(0, hVar, 0, hVar.W());
    }

    public C16773h Y(int i10, int i11) {
        int e10 = C16767b.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (e10 > C().length) {
            throw new IllegalArgumentException(("endIndex > length(" + C().length + ')').toString());
        } else if (e10 - i10 >= 0) {
            return (i10 == 0 && e10 == C().length) ? this : new C16773h(C16870n.s(C(), i10, e10));
        } else {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
    }

    public String a() {
        return C16766a.c(C(), (byte[]) null, 1, (Object) null);
    }

    public C16773h a0() {
        int i10 = 0;
        while (i10 < C().length) {
            byte b10 = C()[i10];
            if (b10 < 65 || b10 > 90) {
                i10++;
            } else {
                byte[] C10 = C();
                byte[] copyOf = Arrays.copyOf(C10, C10.length);
                C17542s.i(copyOf, "copyOf(...)");
                copyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b11 = copyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C16773h(copyOf);
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 < r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(WK.C16773h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            int r0 = r9.W()
            int r1 = r10.W()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002e
            byte r7 = r9.B(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.B(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x002c
        L_0x002a:
            r3 = r5
            goto L_0x0034
        L_0x002c:
            r3 = r6
            goto L_0x0034
        L_0x002e:
            if (r0 != r1) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            if (r0 >= r1) goto L_0x002c
            goto L_0x002a
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.C16773h.compareTo(WK.h):int");
    }

    public byte[] b0() {
        byte[] C10 = C();
        byte[] copyOf = Arrays.copyOf(C10, C10.length);
        C17542s.i(copyOf, "copyOf(...)");
        return copyOf;
    }

    public String c0() {
        String F10 = F();
        if (F10 != null) {
            return F10;
        }
        String c10 = S.c(K());
        T(c10);
        return c10;
    }

    public void d0(C16770e eVar, int i10, int i11) {
        C17542s.j(eVar, "buffer");
        C16835b.d(this, eVar, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16773h) {
            C16773h hVar = (C16773h) obj;
            if (hVar.W() == C().length && hVar.R(0, C(), 0, C().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int D10 = D();
        if (D10 != 0) {
            return D10;
        }
        int hashCode = Arrays.hashCode(C());
        S(hashCode);
        return hashCode;
    }

    public C16773h m(String str) {
        C17542s.j(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f139666a, 0, W());
        byte[] digest = instance.digest();
        C17542s.g(digest);
        return new C16773h(digest);
    }

    public String toString() {
        String str;
        if (C().length == 0) {
            str = "[size=0]";
        } else {
            int a10 = C16835b.c(C(), 64);
            if (a10 != -1) {
                String c02 = c0();
                String substring = c02.substring(0, a10);
                C17542s.i(substring, "substring(...)");
                String Q10 = C15854t.Q(C15854t.Q(C15854t.Q(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a10 < c02.length()) {
                    return "[size=" + C().length + " text=" + Q10 + "…]";
                }
                return "[text=" + Q10 + ']';
            } else if (C().length <= 64) {
                str = "[hex=" + G() + ']';
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(C().length);
                sb2.append(" hex=");
                int e10 = C16767b.e(this, 64);
                if (e10 > C().length) {
                    throw new IllegalArgumentException(("endIndex > length(" + C().length + ')').toString());
                } else if (e10 >= 0) {
                    sb2.append((e10 == C().length ? this : new C16773h(C16870n.s(C(), 0, e10))).G());
                    sb2.append("…]");
                    return sb2.toString();
                } else {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                }
            }
        }
        return str;
    }

    public final boolean v(C16773h hVar) {
        C17542s.j(hVar, "suffix");
        return Q(W() - hVar.W(), hVar, 0, hVar.W());
    }
}

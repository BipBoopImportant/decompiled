package H6;

import WK.C16760C;
import WK.C16770e;
import WK.C16771f;
import WK.C16772g;
import WK.C16773h;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

public abstract class c implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f36443g = new String[128];

    /* renamed from: a  reason: collision with root package name */
    int f36444a;

    /* renamed from: b  reason: collision with root package name */
    int[] f36445b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    String[] f36446c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    int[] f36447d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    boolean f36448e;

    /* renamed from: f  reason: collision with root package name */
    boolean f36449f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f36450a;

        /* renamed from: b  reason: collision with root package name */
        final C16760C f36451b;

        private a(String[] strArr, C16760C c10) {
            this.f36450a = strArr;
            this.f36451b = c10;
        }

        public static a a(String... strArr) {
            try {
                C16773h[] hVarArr = new C16773h[strArr.length];
                C16770e eVar = new C16770e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.q(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.i0();
                }
                return new a((String[]) strArr.clone(), C16760C.x(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f36443g[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f36443g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    public static c h(C16772g gVar) {
        return new e(gVar);
    }

    /* access modifiers changed from: private */
    public static void q(C16771f fVar, String str) {
        String str2;
        String[] strArr = f36443g;
        fVar.Z1(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                fVar.M0(str, i10, i11);
            }
            fVar.D0(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            fVar.M0(str, i10, length);
        }
        fVar.Z1(34);
    }

    public abstract String B0();

    public abstract String C1();

    public abstract int G0();

    public abstract void a0();

    public abstract void d();

    public abstract double d2();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract boolean hasNext();

    public abstract b i();

    /* access modifiers changed from: package-private */
    public final void l(int i10) {
        int i11 = this.f36444a;
        int[] iArr = this.f36445b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f36445b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f36446c;
                this.f36446c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f36447d;
                this.f36447d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new a("Nesting too deep at " + m());
            }
        }
        int[] iArr3 = this.f36445b;
        int i12 = this.f36444a;
        this.f36444a = i12 + 1;
        iArr3[i12] = i10;
    }

    public final String m() {
        return d.a(this.f36444a, this.f36445b, this.f36446c, this.f36447d);
    }

    public abstract int n(a aVar);

    public abstract void o();

    /* access modifiers changed from: package-private */
    public final b s(String str) {
        throw new b(str + " at path " + m());
    }

    public abstract boolean w1();
}

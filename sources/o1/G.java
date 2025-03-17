package O1;

import HJ.C15854t;
import YH.C16870n;
import YH.C16877v;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0019J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0014\u00102\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u00104R\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"LO1/G;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "b", "(IZ)F", "lineEnd", "lineStart", "k", "(II)I", "paragraphIndex", "Ljava/text/Bidi;", "a", "(I)Ljava/text/Bidi;", "upstream", "f", "(IZ)I", "h", "(I)I", "j", "(I)Z", "usePrimaryDirection", "c", "(IZZ)F", "lineIndex", "e", "", "LO1/G$a;", "d", "(I)[LO1/G$a;", "", "i", "(C)Z", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "getParagraphCount", "()I", "paragraphCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final Layout f11686a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f11687b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Bidi> f11688c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f11689d;

    /* renamed from: e  reason: collision with root package name */
    private char[] f11690e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11691f;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LO1/G$a;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Z", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f11692a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11693b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f11694c;

        public a(int i10, int i11, boolean z10) {
            this.f11692a = i10;
            this.f11693b = i11;
            this.f11694c = z10;
        }

        public final int a() {
            return this.f11693b;
        }

        public final int b() {
            return this.f11692a;
        }

        public final boolean c() {
            return this.f11694c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11692a == aVar.f11692a && this.f11693b == aVar.f11693b && this.f11694c == aVar.f11694c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f11692a) * 31) + Integer.hashCode(this.f11693b)) * 31) + Boolean.hashCode(this.f11694c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f11692a + ", end=" + this.f11693b + ", isRtl=" + this.f11694c + ')';
        }
    }

    public G(Layout layout) {
        this.f11686a = layout;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            int r02 = C15854t.r0(this.f11686a.getText(), 10, i10, false, 4, (Object) null);
            i10 = r02 < 0 ? this.f11686a.getText().length() : r02 + 1;
            arrayList.add(Integer.valueOf(i10));
        } while (i10 < this.f11686a.getText().length());
        this.f11687b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add((Object) null);
        }
        this.f11688c = arrayList2;
        this.f11689d = new boolean[this.f11687b.size()];
        this.f11691f = this.f11687b.size();
    }

    private final float b(int i10, boolean z10) {
        int i11 = C17978n.i(i10, this.f11686a.getLineEnd(this.f11686a.getLineForOffset(i10)));
        return z10 ? this.f11686a.getPrimaryHorizontal(i11) : this.f11686a.getSecondaryHorizontal(i11);
    }

    public static /* synthetic */ int g(G g10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return g10.f(i10, z10);
    }

    private final int k(int i10, int i11) {
        while (i10 > i11 && i(this.f11686a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r3.getRunCount() == 1) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f11689d
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x000f
            java.util.List<java.text.Bidi> r0 = r11.f11688c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        L_0x000f:
            r0 = 0
            if (r12 != 0) goto L_0x0014
            r1 = r0
            goto L_0x0022
        L_0x0014:
            java.util.List<java.lang.Integer> r1 = r11.f11687b
            int r2 = r12 + -1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0022:
            java.util.List<java.lang.Integer> r2 = r11.f11687b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f11690e
            if (r3 == 0) goto L_0x003a
            int r4 = r3.length
            if (r4 >= r8) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r10 = r3
            goto L_0x003d
        L_0x003a:
            char[] r3 = new char[r8]
            goto L_0x0038
        L_0x003d:
            android.text.Layout r3 = r11.f11686a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            boolean r9 = r11.j(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            java.util.List<java.text.Bidi> r3 = r11.f11688c
            r3.set(r12, r0)
            boolean[] r3 = r11.f11689d
            r3[r12] = r2
            if (r0 == 0) goto L_0x0075
            char[] r12 = r11.f11690e
            if (r10 != r12) goto L_0x0074
            r10 = r1
            goto L_0x0075
        L_0x0074:
            r10 = r12
        L_0x0075:
            r11.f11690e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.G.a(int):java.text.Bidi");
    }

    public final float c(int i10, boolean z10, boolean z11) {
        int i11 = i10;
        boolean z12 = z11;
        if (!z12) {
            return b(i10, z10);
        }
        int a10 = F.a(this.f11686a, i11, z12);
        int lineStart = this.f11686a.getLineStart(a10);
        int lineEnd = this.f11686a.getLineEnd(a10);
        if (i11 != lineStart && i11 != lineEnd) {
            return b(i10, z10);
        }
        if (i11 == 0 || i11 == this.f11686a.getText().length()) {
            return b(i10, z10);
        }
        int f10 = f(i11, z12);
        boolean j10 = j(f10);
        int k10 = k(lineEnd, lineStart);
        int h10 = h(f10);
        int i12 = lineStart - h10;
        int i13 = k10 - h10;
        Bidi a11 = a(f10);
        Bidi createLineBidi = a11 != null ? a11.createLineBidi(i12, i13) : null;
        boolean z13 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.f11686a.isRtlCharAt(lineStart);
            if (z10 || j10 == isRtlCharAt) {
                j10 = !j10;
            }
            if (i11 == lineStart) {
                z13 = j10;
            } else if (!j10) {
                z13 = true;
            }
            Layout layout = this.f11686a;
            return z13 ? layout.getLineLeft(a10) : layout.getLineRight(a10);
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            aVarArr[i14] = new a(createLineBidi.getRunStart(i14) + lineStart, createLineBidi.getRunLimit(i14) + lineStart, createLineBidi.getRunLevel(i14) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) createLineBidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i16 = -1;
        if (i11 == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    break;
                } else if (aVarArr[i17].b() == i11) {
                    i16 = i17;
                    break;
                } else {
                    i17++;
                }
            }
            a aVar = aVarArr[i16];
            if (z10 || j10 == aVar.c()) {
                j10 = !j10;
            }
            return (i16 != 0 || !j10) ? (i16 != C16870n.n0(aVarArr) || j10) ? j10 ? this.f11686a.getPrimaryHorizontal(aVarArr[i16 - 1].b()) : this.f11686a.getPrimaryHorizontal(aVarArr[i16 + 1].b()) : this.f11686a.getLineRight(a10) : this.f11686a.getLineLeft(a10);
        }
        if (i11 > k10) {
            i11 = k(i11, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                break;
            } else if (aVarArr[i18].a() == i11) {
                i16 = i18;
                break;
            } else {
                i18++;
            }
        }
        a aVar2 = aVarArr[i16];
        if (!z10 && j10 != aVar2.c()) {
            j10 = !j10;
        }
        return (i16 != 0 || !j10) ? (i16 != C16870n.n0(aVarArr) || j10) ? j10 ? this.f11686a.getPrimaryHorizontal(aVarArr[i16 - 1].a()) : this.f11686a.getPrimaryHorizontal(aVarArr[i16 + 1].a()) : this.f11686a.getLineRight(a10) : this.f11686a.getLineLeft(a10);
    }

    public final a[] d(int i10) {
        Bidi createLineBidi;
        int lineStart = this.f11686a.getLineStart(i10);
        int lineEnd = this.f11686a.getLineEnd(i10);
        int g10 = g(this, lineStart, false, 2, (Object) null);
        int h10 = h(g10);
        int i11 = lineStart - h10;
        int i12 = lineEnd - h10;
        Bidi a10 = a(g10);
        if (a10 == null || (createLineBidi = a10.createLineBidi(i11, i12)) == null) {
            return new a[]{new a(lineStart, lineEnd, this.f11686a.isRtlCharAt(lineStart))};
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            int runStart = createLineBidi.getRunStart(i13) + lineStart;
            int runLimit = createLineBidi.getRunLimit(i13) + lineStart;
            boolean z10 = true;
            if (createLineBidi.getRunLevel(i13) % 2 != 1) {
                z10 = false;
            }
            aVarArr[i13] = new a(runStart, runLimit, z10);
        }
        return aVarArr;
    }

    public final int e(int i10) {
        return k(this.f11686a.getLineEnd(i10), this.f11686a.getLineStart(i10));
    }

    public final int f(int i10, boolean z10) {
        int m10 = C16877v.m(this.f11687b, Integer.valueOf(i10), 0, 0, 6, (Object) null);
        int i11 = m10 < 0 ? -(m10 + 1) : m10 + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == this.f11687b.get(i12).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int h(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.f11687b.get(i10 - 1).intValue();
    }

    public final boolean i(char c10) {
        return c10 == ' ' || c10 == 10 || c10 == 5760 || (C17542s.l(c10, 8192) >= 0 && C17542s.l(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean j(int i10) {
        return this.f11686a.getParagraphDirection(this.f11686a.getLineForOffset(h(i10))) == -1;
    }
}

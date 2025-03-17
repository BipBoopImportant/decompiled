package T1;

import YH.C16870n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006)"}, d2 = {"LT1/o;", "", "", "initBuffer", "", "initGapStart", "initGapEnd", "<init>", "([CII)V", "c", "()I", "requestSize", "LXH/N;", "f", "(I)V", "start", "end", "b", "(II)V", "index", "", "d", "(I)C", "", "text", "g", "(IILjava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "a", "(Ljava/lang/StringBuilder;)V", "e", "toString", "()Ljava/lang/String;", "I", "capacity", "[C", "buffer", "gapStart", "gapEnd", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: T1.o  reason: case insensitive filesystem */
final class C4846o {

    /* renamed from: a  reason: collision with root package name */
    private int f13616a;

    /* renamed from: b  reason: collision with root package name */
    private char[] f13617b;

    /* renamed from: c  reason: collision with root package name */
    private int f13618c;

    /* renamed from: d  reason: collision with root package name */
    private int f13619d;

    public C4846o(char[] cArr, int i10, int i11) {
        this.f13616a = cArr.length;
        this.f13617b = cArr;
        this.f13618c = i10;
        this.f13619d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f13618c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f13617b;
            C16870n.j(cArr, cArr, this.f13619d - i13, i11, i12);
            this.f13618c = i10;
            this.f13619d -= i13;
        } else if (i10 >= i12 || i11 < i12) {
            int c10 = i10 + c();
            int c11 = i11 + c();
            int i14 = this.f13619d;
            char[] cArr2 = this.f13617b;
            C16870n.j(cArr2, cArr2, this.f13618c, i14, c10);
            this.f13618c += c10 - i14;
            this.f13619d = c11;
        } else {
            this.f13619d = i11 + c();
            this.f13618c = i10;
        }
    }

    private final int c() {
        return this.f13619d - this.f13618c;
    }

    private final void f(int i10) {
        if (i10 > c()) {
            int c10 = i10 - c();
            int i11 = this.f13616a;
            do {
                i11 *= 2;
            } while (i11 - this.f13616a < c10);
            char[] cArr = new char[i11];
            C16870n.j(this.f13617b, cArr, 0, 0, this.f13618c);
            int i12 = this.f13616a;
            int i13 = this.f13619d;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            C16870n.j(this.f13617b, cArr, i15, i13, i14 + i13);
            this.f13617b = cArr;
            this.f13616a = i11;
            this.f13619d = i15;
        }
    }

    public final void a(StringBuilder sb2) {
        sb2.append(this.f13617b, 0, this.f13618c);
        C17542s.i(sb2, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.f13617b;
        int i10 = this.f13619d;
        sb2.append(cArr, i10, this.f13616a - i10);
        C17542s.i(sb2, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char d(int i10) {
        int i11 = this.f13618c;
        return i10 < i11 ? this.f13617b[i10] : this.f13617b[(i10 - i11) + this.f13619d];
    }

    public final int e() {
        return this.f13616a - c();
    }

    public final void g(int i10, int i11, String str) {
        f(str.length() - (i11 - i10));
        b(i10, i11);
        C4847p.b(str, this.f13617b, this.f13618c);
        this.f13618c += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb2);
        return sb2.toString();
    }
}

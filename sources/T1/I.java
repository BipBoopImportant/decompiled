package T1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001d¨\u0006 "}, d2 = {"LT1/I;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "start", "end", "LXH/N;", "c", "(IILjava/lang/String;)V", "index", "", "a", "(I)C", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "setText", "LT1/o;", "b", "LT1/o;", "buffer", "I", "bufStart", "d", "bufEnd", "()I", "length", "e", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I {

    /* renamed from: e  reason: collision with root package name */
    public static final a f13517e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f13518f = 8;

    /* renamed from: a  reason: collision with root package name */
    private String f13519a;

    /* renamed from: b  reason: collision with root package name */
    private C4846o f13520b;

    /* renamed from: c  reason: collision with root package name */
    private int f13521c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f13522d = -1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LT1/I$a;", "", "<init>", "()V", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public I(String str) {
        this.f13519a = str;
    }

    public final char a(int i10) {
        C4846o oVar = this.f13520b;
        if (oVar == null) {
            return this.f13519a.charAt(i10);
        }
        if (i10 < this.f13521c) {
            return this.f13519a.charAt(i10);
        }
        int e10 = oVar.e();
        int i11 = this.f13521c;
        return i10 < e10 + i11 ? oVar.d(i10 - i11) : this.f13519a.charAt(i10 - ((e10 - this.f13522d) + i11));
    }

    public final int b() {
        C4846o oVar = this.f13520b;
        return oVar == null ? this.f13519a.length() : (this.f13519a.length() - (this.f13522d - this.f13521c)) + oVar.e();
    }

    public final void c(int i10, int i11, String str) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i10 + " > " + i11).toString());
        } else if (i10 >= 0) {
            C4846o oVar = this.f13520b;
            if (oVar == null) {
                int max = Math.max(255, str.length() + 128);
                char[] cArr = new char[max];
                int min = Math.min(i10, 64);
                int min2 = Math.min(this.f13519a.length() - i11, 64);
                int i12 = i10 - min;
                C4848q.a(this.f13519a, cArr, 0, i12, i10);
                int i13 = max - min2;
                int i14 = min2 + i11;
                C4848q.a(this.f13519a, cArr, i13, i11, i14);
                C4847p.b(str, cArr, min);
                this.f13520b = new C4846o(cArr, min + str.length(), i13);
                this.f13521c = i12;
                this.f13522d = i14;
                return;
            }
            int i15 = this.f13521c;
            int i16 = i10 - i15;
            int i17 = i11 - i15;
            if (i16 < 0 || i17 > oVar.e()) {
                this.f13519a = toString();
                this.f13520b = null;
                this.f13521c = -1;
                this.f13522d = -1;
                c(i10, i11, str);
                return;
            }
            oVar.g(i16, i17, str);
        } else {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i10).toString());
        }
    }

    public String toString() {
        C4846o oVar = this.f13520b;
        if (oVar == null) {
            return this.f13519a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13519a, 0, this.f13521c);
        oVar.a(sb2);
        String str = this.f13519a;
        sb2.append(str, this.f13522d, str.length());
        return sb2.toString();
    }
}

package dl;

import android.text.Spanned;
import fI.C17221b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.f;
import xB.C15201a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r\u0001\u0003\u001f !¨\u0006\""}, d2 = {"Ldl/r;", "", "<init>", "()V", "Ldl/r$c;", "q", "()Ldl/r$c;", "style", "", "r", "()I", "textColor", "n", "()Ljava/lang/Integer;", "paddingLeft", "p", "paddingTop", "o", "paddingRight", "j", "paddingBottom", "h", "drawableStartRes", "i", "drawableTintRes", "g", "backgroundColor", "d", "b", "a", "c", "Ldl/r$a;", "Ldl/r$b;", "Ldl/r$d;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Ldl/r$c;", "", "", "id", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "BodySmall", "BodyMedium", "BodyMediumBold", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        H1(f.f75292d),
        H2(f.f75293e),
        H3(f.f75294f),
        H4(f.f75295g),
        H5(f.f75296h),
        H6(f.f75297i),
        H7(f.f75298j),
        BodySmall(f.f75291c),
        BodyMedium(f.f75289a),
        BodyMediumBold(f.f75290b);
        

        /* renamed from: id  reason: collision with root package name */
        private final int f96957id;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private c(int i10) {
            this.f96957id = i10;
        }

        public final int b() {
            return this.f96957id;
        }
    }

    public /* synthetic */ r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer g();

    public abstract Integer h();

    public abstract Integer i();

    public abstract Integer j();

    public abstract Integer n();

    public abstract Integer o();

    public abstract Integer p();

    public abstract c q();

    public abstract int r();

    private r() {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b/\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b-\u0010$¨\u00063"}, d2 = {"Ldl/r$a;", "Ldl/r;", "", "textResId", "", "id", "drawableStartRes", "drawableTintRes", "Ldl/r$c;", "style", "textColor", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "backgroundColor", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ldl/r$c;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "s", "b", "Ljava/lang/String;", "getId", "c", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "d", "i", "e", "Ldl/r$c;", "q", "()Ldl/r$c;", "f", "r", "g", "n", "p", "o", "j", "k", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends r {

        /* renamed from: a  reason: collision with root package name */
        private final int f96927a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96928b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f96929c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f96930d;

        /* renamed from: e  reason: collision with root package name */
        private final c f96931e;

        /* renamed from: f  reason: collision with root package name */
        private final int f96932f;

        /* renamed from: g  reason: collision with root package name */
        private final Integer f96933g;

        /* renamed from: h  reason: collision with root package name */
        private final Integer f96934h;

        /* renamed from: i  reason: collision with root package name */
        private final Integer f96935i;

        /* renamed from: j  reason: collision with root package name */
        private final Integer f96936j;

        /* renamed from: k  reason: collision with root package name */
        private final Integer f96937k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(int r15, java.lang.String r16, java.lang.Integer r17, java.lang.Integer r18, dl.r.c r19, int r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 2
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r4 = r1
                goto L_0x000c
            L_0x000a:
                r4 = r16
            L_0x000c:
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0013
                r5 = r2
                goto L_0x0015
            L_0x0013:
                r5 = r17
            L_0x0015:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x001b
                r6 = r2
                goto L_0x001d
            L_0x001b:
                r6 = r18
            L_0x001d:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0025
                int r1 = tK.C18010a.f147426j
                r8 = r1
                goto L_0x0027
            L_0x0025:
                r8 = r20
            L_0x0027:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x002d
                r9 = r2
                goto L_0x002f
            L_0x002d:
                r9 = r21
            L_0x002f:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0035
                r10 = r2
                goto L_0x0037
            L_0x0035:
                r10 = r22
            L_0x0037:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x003d
                r11 = r2
                goto L_0x003f
            L_0x003d:
                r11 = r23
            L_0x003f:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0045
                r12 = r2
                goto L_0x0047
            L_0x0045:
                r12 = r24
            L_0x0047:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x004d
                r13 = r2
                goto L_0x004f
            L_0x004d:
                r13 = r25
            L_0x004f:
                r2 = r14
                r3 = r15
                r7 = r19
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dl.r.a.<init>(int, java.lang.String, java.lang.Integer, java.lang.Integer, dl.r$c, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f96927a == aVar.f96927a && C17542s.e(this.f96928b, aVar.f96928b) && C17542s.e(this.f96929c, aVar.f96929c) && C17542s.e(this.f96930d, aVar.f96930d) && this.f96931e == aVar.f96931e && this.f96932f == aVar.f96932f && C17542s.e(this.f96933g, aVar.f96933g) && C17542s.e(this.f96934h, aVar.f96934h) && C17542s.e(this.f96935i, aVar.f96935i) && C17542s.e(this.f96936j, aVar.f96936j) && C17542s.e(this.f96937k, aVar.f96937k);
        }

        public Integer g() {
            return this.f96937k;
        }

        public Integer h() {
            return this.f96929c;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f96927a) * 31) + this.f96928b.hashCode()) * 31;
            Integer num = this.f96929c;
            int i10 = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f96930d;
            int hashCode3 = (((((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f96931e.hashCode()) * 31) + Integer.hashCode(this.f96932f)) * 31;
            Integer num3 = this.f96933g;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f96934h;
            int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f96935i;
            int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f96936j;
            int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f96937k;
            if (num7 != null) {
                i10 = num7.hashCode();
            }
            return hashCode7 + i10;
        }

        public Integer i() {
            return this.f96930d;
        }

        public Integer j() {
            return this.f96936j;
        }

        public Integer n() {
            return this.f96933g;
        }

        public Integer o() {
            return this.f96935i;
        }

        public Integer p() {
            return this.f96934h;
        }

        public c q() {
            return this.f96931e;
        }

        public int r() {
            return this.f96932f;
        }

        public final int s() {
            return this.f96927a;
        }

        public String toString() {
            int i10 = this.f96927a;
            String str = this.f96928b;
            Integer num = this.f96929c;
            Integer num2 = this.f96930d;
            c cVar = this.f96931e;
            int i11 = this.f96932f;
            Integer num3 = this.f96933g;
            Integer num4 = this.f96934h;
            Integer num5 = this.f96935i;
            Integer num6 = this.f96936j;
            Integer num7 = this.f96937k;
            return "Resource(textResId=" + i10 + ", id=" + str + ", drawableStartRes=" + num + ", drawableTintRes=" + num2 + ", style=" + cVar + ", textColor=" + i11 + ", paddingLeft=" + num3 + ", paddingTop=" + num4 + ", paddingRight=" + num5 + ", paddingBottom=" + num6 + ", backgroundColor=" + num7 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, Integer num, Integer num2, c cVar, int i11, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(cVar, "style");
            this.f96927a = i10;
            this.f96928b = str;
            this.f96929c = num;
            this.f96930d = num2;
            this.f96931e = cVar;
            this.f96932f = i11;
            this.f96933g = num3;
            this.f96934h = num4;
            this.f96935i = num5;
            this.f96936j = num6;
            this.f96937k = num7;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b3\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b4\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b5\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b1\u0010'R\u001a\u0010;\u001a\u0002078\u0016X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b.\u0010:¨\u0006<"}, d2 = {"Ldl/r$b;", "Ldl/r;", "LxB/a;", "Landroid/text/Spanned;", "text", "", "id", "", "drawableStartRes", "drawableTintRes", "Ldl/r$c;", "style", "textColor", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "backgroundColor", "<init>", "(Landroid/text/Spanned;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ldl/r$c;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/text/Spanned;", "s", "()Landroid/text/Spanned;", "b", "Ljava/lang/String;", "getId", "c", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "d", "i", "e", "Ldl/r$c;", "q", "()Ldl/r$c;", "f", "I", "r", "g", "n", "p", "o", "j", "k", "", "l", "J", "()J", "stableId", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends r implements C15201a {

        /* renamed from: a  reason: collision with root package name */
        private final Spanned f96938a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96939b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f96940c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f96941d;

        /* renamed from: e  reason: collision with root package name */
        private final c f96942e;

        /* renamed from: f  reason: collision with root package name */
        private final int f96943f;

        /* renamed from: g  reason: collision with root package name */
        private final Integer f96944g;

        /* renamed from: h  reason: collision with root package name */
        private final Integer f96945h;

        /* renamed from: i  reason: collision with root package name */
        private final Integer f96946i;

        /* renamed from: j  reason: collision with root package name */
        private final Integer f96947j;

        /* renamed from: k  reason: collision with root package name */
        private final Integer f96948k;

        /* renamed from: l  reason: collision with root package name */
        private final long f96949l;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ b(android.text.Spanned r15, java.lang.String r16, java.lang.Integer r17, java.lang.Integer r18, dl.r.c r19, int r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 2
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r4 = r1
                goto L_0x000c
            L_0x000a:
                r4 = r16
            L_0x000c:
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0013
                r5 = r2
                goto L_0x0015
            L_0x0013:
                r5 = r17
            L_0x0015:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x001b
                r6 = r2
                goto L_0x001d
            L_0x001b:
                r6 = r18
            L_0x001d:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0025
                int r1 = tK.C18010a.f147426j
                r8 = r1
                goto L_0x0027
            L_0x0025:
                r8 = r20
            L_0x0027:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x002d
                r9 = r2
                goto L_0x002f
            L_0x002d:
                r9 = r21
            L_0x002f:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0035
                r10 = r2
                goto L_0x0037
            L_0x0035:
                r10 = r22
            L_0x0037:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x003d
                r11 = r2
                goto L_0x003f
            L_0x003d:
                r11 = r23
            L_0x003f:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0045
                r12 = r2
                goto L_0x0047
            L_0x0045:
                r12 = r24
            L_0x0047:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x004d
                r13 = r2
                goto L_0x004f
            L_0x004d:
                r13 = r25
            L_0x004f:
                r2 = r14
                r3 = r15
                r7 = r19
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dl.r.b.<init>(android.text.Spanned, java.lang.String, java.lang.Integer, java.lang.Integer, dl.r$c, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f96938a, bVar.f96938a) && C17542s.e(this.f96939b, bVar.f96939b) && C17542s.e(this.f96940c, bVar.f96940c) && C17542s.e(this.f96941d, bVar.f96941d) && this.f96942e == bVar.f96942e && this.f96943f == bVar.f96943f && C17542s.e(this.f96944g, bVar.f96944g) && C17542s.e(this.f96945h, bVar.f96945h) && C17542s.e(this.f96946i, bVar.f96946i) && C17542s.e(this.f96947j, bVar.f96947j) && C17542s.e(this.f96948k, bVar.f96948k);
        }

        public long f() {
            return this.f96949l;
        }

        public Integer g() {
            return this.f96948k;
        }

        public Integer h() {
            return this.f96940c;
        }

        public int hashCode() {
            Spanned spanned = this.f96938a;
            int i10 = 0;
            int hashCode = (((spanned == null ? 0 : spanned.hashCode()) * 31) + this.f96939b.hashCode()) * 31;
            Integer num = this.f96940c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f96941d;
            int hashCode3 = (((((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f96942e.hashCode()) * 31) + Integer.hashCode(this.f96943f)) * 31;
            Integer num3 = this.f96944g;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f96945h;
            int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f96946i;
            int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f96947j;
            int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f96948k;
            if (num7 != null) {
                i10 = num7.hashCode();
            }
            return hashCode7 + i10;
        }

        public Integer i() {
            return this.f96941d;
        }

        public Integer j() {
            return this.f96947j;
        }

        public Integer n() {
            return this.f96944g;
        }

        public Integer o() {
            return this.f96946i;
        }

        public Integer p() {
            return this.f96945h;
        }

        public c q() {
            return this.f96942e;
        }

        public int r() {
            return this.f96943f;
        }

        public final Spanned s() {
            return this.f96938a;
        }

        public String toString() {
            Spanned spanned = this.f96938a;
            String str = this.f96939b;
            Integer num = this.f96940c;
            Integer num2 = this.f96941d;
            c cVar = this.f96942e;
            int i10 = this.f96943f;
            Integer num3 = this.f96944g;
            Integer num4 = this.f96945h;
            Integer num5 = this.f96946i;
            Integer num6 = this.f96947j;
            Integer num7 = this.f96948k;
            return "SpannedText(text=" + spanned + ", id=" + str + ", drawableStartRes=" + num + ", drawableTintRes=" + num2 + ", style=" + cVar + ", textColor=" + i10 + ", paddingLeft=" + num3 + ", paddingTop=" + num4 + ", paddingRight=" + num5 + ", paddingBottom=" + num6 + ", backgroundColor=" + num7 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Spanned spanned, String str, Integer num, Integer num2, c cVar, int i10, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(cVar, "style");
            String str2 = null;
            this.f96938a = spanned;
            this.f96939b = str;
            this.f96940c = num;
            this.f96941d = num2;
            this.f96942e = cVar;
            this.f96943f = i10;
            this.f96944g = num3;
            this.f96945h = num4;
            this.f96946i = num5;
            this.f96947j = num6;
            this.f96948k = num7;
            this.f96949l = (long) Objects.hash(new Object[]{b.class, spanned != null ? spanned.toString() : str2});
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b/\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b0\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b1\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b-\u0010#¨\u00063"}, d2 = {"Ldl/r$d;", "Ldl/r;", "", "text", "id", "", "drawableStartRes", "drawableTintRes", "Ldl/r$c;", "style", "textColor", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ldl/r$c;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "s", "b", "getId", "c", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "d", "i", "e", "Ldl/r$c;", "q", "()Ldl/r$c;", "f", "I", "r", "g", "n", "p", "o", "j", "k", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends r {

        /* renamed from: a  reason: collision with root package name */
        private final String f96958a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96959b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f96960c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f96961d;

        /* renamed from: e  reason: collision with root package name */
        private final c f96962e;

        /* renamed from: f  reason: collision with root package name */
        private final int f96963f;

        /* renamed from: g  reason: collision with root package name */
        private final Integer f96964g;

        /* renamed from: h  reason: collision with root package name */
        private final Integer f96965h;

        /* renamed from: i  reason: collision with root package name */
        private final Integer f96966i;

        /* renamed from: j  reason: collision with root package name */
        private final Integer f96967j;

        /* renamed from: k  reason: collision with root package name */
        private final Integer f96968k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ d(java.lang.String r15, java.lang.String r16, java.lang.Integer r17, java.lang.Integer r18, dl.r.c r19, int r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 2
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r4 = r1
                goto L_0x000c
            L_0x000a:
                r4 = r16
            L_0x000c:
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0013
                r5 = r2
                goto L_0x0015
            L_0x0013:
                r5 = r17
            L_0x0015:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x001b
                r6 = r2
                goto L_0x001d
            L_0x001b:
                r6 = r18
            L_0x001d:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0025
                int r1 = tK.C18010a.f147426j
                r8 = r1
                goto L_0x0027
            L_0x0025:
                r8 = r20
            L_0x0027:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x002d
                r9 = r2
                goto L_0x002f
            L_0x002d:
                r9 = r21
            L_0x002f:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0035
                r10 = r2
                goto L_0x0037
            L_0x0035:
                r10 = r22
            L_0x0037:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x003d
                r11 = r2
                goto L_0x003f
            L_0x003d:
                r11 = r23
            L_0x003f:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0045
                r12 = r2
                goto L_0x0047
            L_0x0045:
                r12 = r24
            L_0x0047:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x004d
                r13 = r2
                goto L_0x004f
            L_0x004d:
                r13 = r25
            L_0x004f:
                r2 = r14
                r3 = r15
                r7 = r19
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dl.r.d.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, dl.r$c, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f96958a, dVar.f96958a) && C17542s.e(this.f96959b, dVar.f96959b) && C17542s.e(this.f96960c, dVar.f96960c) && C17542s.e(this.f96961d, dVar.f96961d) && this.f96962e == dVar.f96962e && this.f96963f == dVar.f96963f && C17542s.e(this.f96964g, dVar.f96964g) && C17542s.e(this.f96965h, dVar.f96965h) && C17542s.e(this.f96966i, dVar.f96966i) && C17542s.e(this.f96967j, dVar.f96967j) && C17542s.e(this.f96968k, dVar.f96968k);
        }

        public Integer g() {
            return this.f96968k;
        }

        public Integer h() {
            return this.f96960c;
        }

        public int hashCode() {
            String str = this.f96958a;
            int i10 = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f96959b.hashCode()) * 31;
            Integer num = this.f96960c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f96961d;
            int hashCode3 = (((((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f96962e.hashCode()) * 31) + Integer.hashCode(this.f96963f)) * 31;
            Integer num3 = this.f96964g;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f96965h;
            int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f96966i;
            int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f96967j;
            int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f96968k;
            if (num7 != null) {
                i10 = num7.hashCode();
            }
            return hashCode7 + i10;
        }

        public Integer i() {
            return this.f96961d;
        }

        public Integer j() {
            return this.f96967j;
        }

        public Integer n() {
            return this.f96964g;
        }

        public Integer o() {
            return this.f96966i;
        }

        public Integer p() {
            return this.f96965h;
        }

        public c q() {
            return this.f96962e;
        }

        public int r() {
            return this.f96963f;
        }

        public final String s() {
            return this.f96958a;
        }

        public String toString() {
            String str = this.f96958a;
            String str2 = this.f96959b;
            Integer num = this.f96960c;
            Integer num2 = this.f96961d;
            c cVar = this.f96962e;
            int i10 = this.f96963f;
            Integer num3 = this.f96964g;
            Integer num4 = this.f96965h;
            Integer num5 = this.f96966i;
            Integer num6 = this.f96967j;
            Integer num7 = this.f96968k;
            return "Text(text=" + str + ", id=" + str2 + ", drawableStartRes=" + num + ", drawableTintRes=" + num2 + ", style=" + cVar + ", textColor=" + i10 + ", paddingLeft=" + num3 + ", paddingTop=" + num4 + ", paddingRight=" + num5 + ", paddingBottom=" + num6 + ", backgroundColor=" + num7 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, Integer num, Integer num2, c cVar, int i10, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str2, "id");
            C17542s.j(cVar, "style");
            this.f96958a = str;
            this.f96959b = str2;
            this.f96960c = num;
            this.f96961d = num2;
            this.f96962e = cVar;
            this.f96963f = i10;
            this.f96964g = num3;
            this.f96965h = num4;
            this.f96966i = num5;
            this.f96967j = num6;
            this.f96968k = num7;
        }
    }
}

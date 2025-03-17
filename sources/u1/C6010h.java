package u1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0007\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t\u0001\u0013\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, d2 = {"Lu1/h;", "", "", "isCurve", "isQuad", "<init>", "(ZZ)V", "a", "Z", "()Z", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "Lu1/h$a;", "Lu1/h$b;", "Lu1/h$c;", "Lu1/h$d;", "Lu1/h$e;", "Lu1/h$f;", "Lu1/h$g;", "Lu1/h$h;", "Lu1/h$i;", "Lu1/h$j;", "Lu1/h$k;", "Lu1/h$l;", "Lu1/h$m;", "Lu1/h$n;", "Lu1/h$o;", "Lu1/h$p;", "Lu1/h$q;", "Lu1/h$r;", "Lu1/h$s;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u1.h  reason: case insensitive filesystem */
public abstract class C6010h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29883a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f29884b;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\""}, d2 = {"Lu1/h$a;", "Lu1/h;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "F", "e", "()F", "d", "g", "f", "Z", "h", "()Z", "i", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$a */
    public static final class a extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29885c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29886d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29887e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f29888f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f29889g;

        /* renamed from: h  reason: collision with root package name */
        private final float f29890h;

        /* renamed from: i  reason: collision with root package name */
        private final float f29891i;

        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29885c = f10;
            this.f29886d = f11;
            this.f29887e = f12;
            this.f29888f = z10;
            this.f29889g = z11;
            this.f29890h = f13;
            this.f29891i = f14;
        }

        public final float c() {
            return this.f29890h;
        }

        public final float d() {
            return this.f29891i;
        }

        public final float e() {
            return this.f29885c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f29885c, aVar.f29885c) == 0 && Float.compare(this.f29886d, aVar.f29886d) == 0 && Float.compare(this.f29887e, aVar.f29887e) == 0 && this.f29888f == aVar.f29888f && this.f29889g == aVar.f29889g && Float.compare(this.f29890h, aVar.f29890h) == 0 && Float.compare(this.f29891i, aVar.f29891i) == 0;
        }

        public final float f() {
            return this.f29887e;
        }

        public final float g() {
            return this.f29886d;
        }

        public final boolean h() {
            return this.f29888f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f29885c) * 31) + Float.hashCode(this.f29886d)) * 31) + Float.hashCode(this.f29887e)) * 31) + Boolean.hashCode(this.f29888f)) * 31) + Boolean.hashCode(this.f29889g)) * 31) + Float.hashCode(this.f29890h)) * 31) + Float.hashCode(this.f29891i);
        }

        public final boolean i() {
            return this.f29889g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f29885c + ", verticalEllipseRadius=" + this.f29886d + ", theta=" + this.f29887e + ", isMoreThanHalf=" + this.f29888f + ", isPositiveArc=" + this.f29889g + ", arcStartX=" + this.f29890h + ", arcStartY=" + this.f29891i + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu1/h$b;", "Lu1/h;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$b */
    public static final class b extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        public static final b f29892c = new b();

        private b() {
            super(false, false, 3, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lu1/h$c;", "Lu1/h;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "f", "e", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$c */
    public static final class c extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29893c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29894d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29895e;

        /* renamed from: f  reason: collision with root package name */
        private final float f29896f;

        /* renamed from: g  reason: collision with root package name */
        private final float f29897g;

        /* renamed from: h  reason: collision with root package name */
        private final float f29898h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f29893c = f10;
            this.f29894d = f11;
            this.f29895e = f12;
            this.f29896f = f13;
            this.f29897g = f14;
            this.f29898h = f15;
        }

        public final float c() {
            return this.f29893c;
        }

        public final float d() {
            return this.f29895e;
        }

        public final float e() {
            return this.f29897g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f29893c, cVar.f29893c) == 0 && Float.compare(this.f29894d, cVar.f29894d) == 0 && Float.compare(this.f29895e, cVar.f29895e) == 0 && Float.compare(this.f29896f, cVar.f29896f) == 0 && Float.compare(this.f29897g, cVar.f29897g) == 0 && Float.compare(this.f29898h, cVar.f29898h) == 0;
        }

        public final float f() {
            return this.f29894d;
        }

        public final float g() {
            return this.f29896f;
        }

        public final float h() {
            return this.f29898h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f29893c) * 31) + Float.hashCode(this.f29894d)) * 31) + Float.hashCode(this.f29895e)) * 31) + Float.hashCode(this.f29896f)) * 31) + Float.hashCode(this.f29897g)) * 31) + Float.hashCode(this.f29898h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f29893c + ", y1=" + this.f29894d + ", x2=" + this.f29895e + ", y2=" + this.f29896f + ", x3=" + this.f29897g + ", y3=" + this.f29898h + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu1/h$d;", "Lu1/h;", "", "x", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$d */
    public static final class d extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29899c;

        public d(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29899c = f10;
        }

        public final float c() {
            return this.f29899c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f29899c, ((d) obj).f29899c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f29899c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f29899c + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu1/h$e;", "Lu1/h;", "", "x", "y", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$e */
    public static final class e extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29900c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29901d;

        public e(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29900c = f10;
            this.f29901d = f11;
        }

        public final float c() {
            return this.f29900c;
        }

        public final float d() {
            return this.f29901d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f29900c, eVar.f29900c) == 0 && Float.compare(this.f29901d, eVar.f29901d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f29900c) * 31) + Float.hashCode(this.f29901d);
        }

        public String toString() {
            return "LineTo(x=" + this.f29900c + ", y=" + this.f29901d + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu1/h$f;", "Lu1/h;", "", "x", "y", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$f */
    public static final class f extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29902c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29903d;

        public f(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29902c = f10;
            this.f29903d = f11;
        }

        public final float c() {
            return this.f29902c;
        }

        public final float d() {
            return this.f29903d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f29902c, fVar.f29902c) == 0 && Float.compare(this.f29903d, fVar.f29903d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f29902c) * 31) + Float.hashCode(this.f29903d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f29902c + ", y=" + this.f29903d + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lu1/h$g;", "Lu1/h;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "e", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$g */
    public static final class g extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29904c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29905d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29906e;

        /* renamed from: f  reason: collision with root package name */
        private final float f29907f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f29904c = f10;
            this.f29905d = f11;
            this.f29906e = f12;
            this.f29907f = f13;
        }

        public final float c() {
            return this.f29904c;
        }

        public final float d() {
            return this.f29906e;
        }

        public final float e() {
            return this.f29905d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f29904c, gVar.f29904c) == 0 && Float.compare(this.f29905d, gVar.f29905d) == 0 && Float.compare(this.f29906e, gVar.f29906e) == 0 && Float.compare(this.f29907f, gVar.f29907f) == 0;
        }

        public final float f() {
            return this.f29907f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f29904c) * 31) + Float.hashCode(this.f29905d)) * 31) + Float.hashCode(this.f29906e)) * 31) + Float.hashCode(this.f29907f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f29904c + ", y1=" + this.f29905d + ", x2=" + this.f29906e + ", y2=" + this.f29907f + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lu1/h$h;", "Lu1/h;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "e", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$h  reason: collision with other inner class name */
    public static final class C0467h extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29908c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29909d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29910e;

        /* renamed from: f  reason: collision with root package name */
        private final float f29911f;

        public C0467h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f29908c = f10;
            this.f29909d = f11;
            this.f29910e = f12;
            this.f29911f = f13;
        }

        public final float c() {
            return this.f29908c;
        }

        public final float d() {
            return this.f29910e;
        }

        public final float e() {
            return this.f29909d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0467h)) {
                return false;
            }
            C0467h hVar = (C0467h) obj;
            return Float.compare(this.f29908c, hVar.f29908c) == 0 && Float.compare(this.f29909d, hVar.f29909d) == 0 && Float.compare(this.f29910e, hVar.f29910e) == 0 && Float.compare(this.f29911f, hVar.f29911f) == 0;
        }

        public final float f() {
            return this.f29911f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f29908c) * 31) + Float.hashCode(this.f29909d)) * 31) + Float.hashCode(this.f29910e)) * 31) + Float.hashCode(this.f29911f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f29908c + ", y1=" + this.f29909d + ", x2=" + this.f29910e + ", y2=" + this.f29911f + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu1/h$i;", "Lu1/h;", "", "x", "y", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$i */
    public static final class i extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29912c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29913d;

        public i(float f10, float f11) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f29912c = f10;
            this.f29913d = f11;
        }

        public final float c() {
            return this.f29912c;
        }

        public final float d() {
            return this.f29913d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f29912c, iVar.f29912c) == 0 && Float.compare(this.f29913d, iVar.f29913d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f29912c) * 31) + Float.hashCode(this.f29913d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f29912c + ", y=" + this.f29913d + ')';
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\""}, d2 = {"Lu1/h$j;", "Lu1/h;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "F", "e", "()F", "d", "g", "f", "Z", "h", "()Z", "i", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$j */
    public static final class j extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29914c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29915d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29916e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f29917f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f29918g;

        /* renamed from: h  reason: collision with root package name */
        private final float f29919h;

        /* renamed from: i  reason: collision with root package name */
        private final float f29920i;

        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29914c = f10;
            this.f29915d = f11;
            this.f29916e = f12;
            this.f29917f = z10;
            this.f29918g = z11;
            this.f29919h = f13;
            this.f29920i = f14;
        }

        public final float c() {
            return this.f29919h;
        }

        public final float d() {
            return this.f29920i;
        }

        public final float e() {
            return this.f29914c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f29914c, jVar.f29914c) == 0 && Float.compare(this.f29915d, jVar.f29915d) == 0 && Float.compare(this.f29916e, jVar.f29916e) == 0 && this.f29917f == jVar.f29917f && this.f29918g == jVar.f29918g && Float.compare(this.f29919h, jVar.f29919h) == 0 && Float.compare(this.f29920i, jVar.f29920i) == 0;
        }

        public final float f() {
            return this.f29916e;
        }

        public final float g() {
            return this.f29915d;
        }

        public final boolean h() {
            return this.f29917f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f29914c) * 31) + Float.hashCode(this.f29915d)) * 31) + Float.hashCode(this.f29916e)) * 31) + Boolean.hashCode(this.f29917f)) * 31) + Boolean.hashCode(this.f29918g)) * 31) + Float.hashCode(this.f29919h)) * 31) + Float.hashCode(this.f29920i);
        }

        public final boolean i() {
            return this.f29918g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f29914c + ", verticalEllipseRadius=" + this.f29915d + ", theta=" + this.f29916e + ", isMoreThanHalf=" + this.f29917f + ", isPositiveArc=" + this.f29918g + ", arcStartDx=" + this.f29919h + ", arcStartDy=" + this.f29920i + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lu1/h$k;", "Lu1/h;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "f", "e", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$k */
    public static final class k extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29921c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29922d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29923e;

        /* renamed from: f  reason: collision with root package name */
        private final float f29924f;

        /* renamed from: g  reason: collision with root package name */
        private final float f29925g;

        /* renamed from: h  reason: collision with root package name */
        private final float f29926h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f29921c = f10;
            this.f29922d = f11;
            this.f29923e = f12;
            this.f29924f = f13;
            this.f29925g = f14;
            this.f29926h = f15;
        }

        public final float c() {
            return this.f29921c;
        }

        public final float d() {
            return this.f29923e;
        }

        public final float e() {
            return this.f29925g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f29921c, kVar.f29921c) == 0 && Float.compare(this.f29922d, kVar.f29922d) == 0 && Float.compare(this.f29923e, kVar.f29923e) == 0 && Float.compare(this.f29924f, kVar.f29924f) == 0 && Float.compare(this.f29925g, kVar.f29925g) == 0 && Float.compare(this.f29926h, kVar.f29926h) == 0;
        }

        public final float f() {
            return this.f29922d;
        }

        public final float g() {
            return this.f29924f;
        }

        public final float h() {
            return this.f29926h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f29921c) * 31) + Float.hashCode(this.f29922d)) * 31) + Float.hashCode(this.f29923e)) * 31) + Float.hashCode(this.f29924f)) * 31) + Float.hashCode(this.f29925g)) * 31) + Float.hashCode(this.f29926h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f29921c + ", dy1=" + this.f29922d + ", dx2=" + this.f29923e + ", dy2=" + this.f29924f + ", dx3=" + this.f29925g + ", dy3=" + this.f29926h + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu1/h$l;", "Lu1/h;", "", "dx", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$l */
    public static final class l extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29927c;

        public l(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29927c = f10;
        }

        public final float c() {
            return this.f29927c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f29927c, ((l) obj).f29927c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f29927c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f29927c + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu1/h$m;", "Lu1/h;", "", "dx", "dy", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$m */
    public static final class m extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29928c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29929d;

        public m(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29928c = f10;
            this.f29929d = f11;
        }

        public final float c() {
            return this.f29928c;
        }

        public final float d() {
            return this.f29929d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f29928c, mVar.f29928c) == 0 && Float.compare(this.f29929d, mVar.f29929d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f29928c) * 31) + Float.hashCode(this.f29929d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f29928c + ", dy=" + this.f29929d + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu1/h$n;", "Lu1/h;", "", "dx", "dy", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$n */
    public static final class n extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29930c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29931d;

        public n(float f10, float f11) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29930c = f10;
            this.f29931d = f11;
        }

        public final float c() {
            return this.f29930c;
        }

        public final float d() {
            return this.f29931d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f29930c, nVar.f29930c) == 0 && Float.compare(this.f29931d, nVar.f29931d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f29930c) * 31) + Float.hashCode(this.f29931d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f29930c + ", dy=" + this.f29931d + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lu1/h$o;", "Lu1/h;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "e", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$o */
    public static final class o extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29932c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29933d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29934e;

        /* renamed from: f  reason: collision with root package name */
        private final float f29935f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f29932c = f10;
            this.f29933d = f11;
            this.f29934e = f12;
            this.f29935f = f13;
        }

        public final float c() {
            return this.f29932c;
        }

        public final float d() {
            return this.f29934e;
        }

        public final float e() {
            return this.f29933d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f29932c, oVar.f29932c) == 0 && Float.compare(this.f29933d, oVar.f29933d) == 0 && Float.compare(this.f29934e, oVar.f29934e) == 0 && Float.compare(this.f29935f, oVar.f29935f) == 0;
        }

        public final float f() {
            return this.f29935f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f29932c) * 31) + Float.hashCode(this.f29933d)) * 31) + Float.hashCode(this.f29934e)) * 31) + Float.hashCode(this.f29935f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f29932c + ", dy1=" + this.f29933d + ", dx2=" + this.f29934e + ", dy2=" + this.f29935f + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lu1/h$p;", "Lu1/h;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "e", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$p */
    public static final class p extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29936c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29937d;

        /* renamed from: e  reason: collision with root package name */
        private final float f29938e;

        /* renamed from: f  reason: collision with root package name */
        private final float f29939f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f29936c = f10;
            this.f29937d = f11;
            this.f29938e = f12;
            this.f29939f = f13;
        }

        public final float c() {
            return this.f29936c;
        }

        public final float d() {
            return this.f29938e;
        }

        public final float e() {
            return this.f29937d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f29936c, pVar.f29936c) == 0 && Float.compare(this.f29937d, pVar.f29937d) == 0 && Float.compare(this.f29938e, pVar.f29938e) == 0 && Float.compare(this.f29939f, pVar.f29939f) == 0;
        }

        public final float f() {
            return this.f29939f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f29936c) * 31) + Float.hashCode(this.f29937d)) * 31) + Float.hashCode(this.f29938e)) * 31) + Float.hashCode(this.f29939f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f29936c + ", dy1=" + this.f29937d + ", dx2=" + this.f29938e + ", dy2=" + this.f29939f + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu1/h$q;", "Lu1/h;", "", "dx", "dy", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$q */
    public static final class q extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29940c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29941d;

        public q(float f10, float f11) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f29940c = f10;
            this.f29941d = f11;
        }

        public final float c() {
            return this.f29940c;
        }

        public final float d() {
            return this.f29941d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f29940c, qVar.f29940c) == 0 && Float.compare(this.f29941d, qVar.f29941d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f29940c) * 31) + Float.hashCode(this.f29941d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f29940c + ", dy=" + this.f29941d + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu1/h$r;", "Lu1/h;", "", "dy", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$r */
    public static final class r extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29942c;

        public r(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29942c = f10;
        }

        public final float c() {
            return this.f29942c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f29942c, ((r) obj).f29942c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f29942c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f29942c + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu1/h$s;", "Lu1/h;", "", "y", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "()F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u1.h$s */
    public static final class s extends C6010h {

        /* renamed from: c  reason: collision with root package name */
        private final float f29943c;

        public s(float f10) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f29943c = f10;
        }

        public final float c() {
            return this.f29943c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f29943c, ((s) obj).f29943c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f29943c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f29943c + ')';
        }
    }

    public /* synthetic */ C6010h(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f29883a;
    }

    public final boolean b() {
        return this.f29884b;
    }

    private C6010h(boolean z10, boolean z11) {
        this.f29883a = z10;
        this.f29884b = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6010h(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (DefaultConstructorMarker) null);
    }
}

package wK;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"LwK/H9;", "", "", "value", "<init>", "(Ljava/lang/String;IF)V", "F", "b", "()F", "Ratio4by3", "Ratio16by9", "Ratio1by1", "Ratio6by7", "Ratio3by4", "Ratio4by5", "Ratio9by16", "Standard", "Wide", "Square", "SemiPortrait", "Portrait", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum H9 {
    Standard(1.3333334f),
    Wide(1.7777778f),
    Square(1.0f),
    SemiPortrait(0.85714287f),
    Portrait(0.75f);
    
    private final float value;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/ikea/skapa/ui/components/SkapaAspectRatio.Ratio16by9", "LwK/H9;", "", "toString", "()Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a extends H9 {
        a(String str, int i10) {
            super(str, i10, 1.7777778f, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "16:9";
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/ikea/skapa/ui/components/SkapaAspectRatio.Ratio1by1", "LwK/H9;", "", "toString", "()Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b extends H9 {
        b(String str, int i10) {
            super(str, i10, 1.0f, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "1:1";
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/ikea/skapa/ui/components/SkapaAspectRatio.Ratio3by4", "LwK/H9;", "", "toString", "()Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class c extends H9 {
        c(String str, int i10) {
            super(str, i10, 0.75f, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "3:4";
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/ikea/skapa/ui/components/SkapaAspectRatio.Ratio4by3", "LwK/H9;", "", "toString", "()Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class d extends H9 {
        d(String str, int i10) {
            super(str, i10, 1.3333334f, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "4:3";
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/ikea/skapa/ui/components/SkapaAspectRatio.Ratio4by5", "LwK/H9;", "", "toString", "()Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class e extends H9 {
        e(String str, int i10) {
            super(str, i10, 0.8f, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "4:5";
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/ikea/skapa/ui/components/SkapaAspectRatio.Ratio6by7", "LwK/H9;", "", "toString", "()Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class f extends H9 {
        f(String str, int i10) {
            super(str, i10, 0.85714287f, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "6:7";
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/ikea/skapa/ui/components/SkapaAspectRatio.Ratio9by16", "LwK/H9;", "", "toString", "()Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class g extends H9 {
        g(String str, int i10) {
            super(str, i10, 0.5625f, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "9:16";
        }
    }

    static {
        H9[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final float b() {
        return this.value;
    }

    private H9(float f10) {
        this.value = f10;
    }
}

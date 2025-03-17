package Jv;

import A0.g;
import fI.C17221b;
import kotlin.Metadata;
import p1.c1;
import p1.i1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LJv/a;", "", "", "aspectRatio", "Lp1/i1;", "shape", "<init>", "(Ljava/lang/String;IFLp1/i1;)V", "F", "b", "()F", "Lp1/i1;", "j", "()Lp1/i1;", "Circle", "Rectangle", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jv.a  reason: case insensitive filesystem */
public enum C6575a {
    Circle(1.0f, g.h()),
    Rectangle(0.75f, c1.a());
    
    private final float aspectRatio;
    private final i1 shape;

    static {
        C6575a[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C6575a(float f10, i1 i1Var) {
        this.aspectRatio = f10;
        this.shape = i1Var;
    }

    public final float b() {
        return this.aspectRatio;
    }

    public final i1 j() {
        return this.shape;
    }
}

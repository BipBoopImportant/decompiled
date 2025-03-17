package p1;

import YH.C16877v;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import o1.C5667g;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001b\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a7\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001b\u001a\u00020\u0018H\u0001¢\u0006\u0004\b!\u0010\"\u001a-\u0010$\u001a\u00020#2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b$\u0010%*\n\u0010&\"\u00020\n2\u00020\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lo1/g;", "from", "to", "", "Lp1/v0;", "colors", "", "colorStops", "Lp1/m1;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "center", "radius", "c", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "Lp1/J0;", "image", "tileModeX", "tileModeY", "a", "(Lp1/J0;II)Landroid/graphics/Shader;", "", "d", "(Ljava/util/List;)I", "numTransparentColors", "", "e", "(Ljava/util/List;I)[I", "stops", "", "f", "(Ljava/util/List;Ljava/util/List;I)[F", "LXH/N;", "g", "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Z {
    public static final Shader a(J0 j02, int i10, int i11) {
        return new BitmapShader(O.b(j02), C5706a0.a(i10), C5706a0.a(i11));
    }

    public static final Shader b(long j10, long j11, List<C5747v0> list, List<Float> list2, int i10) {
        List<C5747v0> list3 = list;
        g(list, list2);
        int d10 = d(list);
        return new LinearGradient(C5667g.m(j10), C5667g.n(j10), C5667g.m(j11), C5667g.n(j11), e(list, d10), f(list2, list, d10), C5706a0.a(i10));
    }

    public static final Shader c(long j10, float f10, List<C5747v0> list, List<Float> list2, int i10) {
        g(list, list2);
        int d10 = d(list);
        return new RadialGradient(C5667g.m(j10), C5667g.n(j10), f10, e(list, d10), f(list2, list, d10), C5706a0.a(i10));
    }

    public static final int d(List<C5747v0> list) {
        return 0;
    }

    public static final int[] e(List<C5747v0> list, int i10) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = C5751x0.k(list.get(i11).y());
        }
        return iArr;
    }

    public static final float[] f(List<Float> list, List<C5747v0> list2, int i10) {
        if (i10 != 0) {
            float[] fArr = new float[(list2.size() + i10)];
            fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
            int p10 = C16877v.p(list2);
            int i11 = 1;
            for (int i12 = 1; i12 < p10; i12++) {
                long y10 = list2.get(i12).y();
                float floatValue = list != null ? list.get(i12).floatValue() : ((float) i12) / ((float) C16877v.p(list2));
                int i13 = i11 + 1;
                fArr[i11] = floatValue;
                if (C5747v0.r(y10) == 0.0f) {
                    i11 += 2;
                    fArr[i13] = floatValue;
                } else {
                    i11 = i13;
                }
            }
            fArr[i11] = list != null ? list.get(C16877v.p(list2)).floatValue() : 1.0f;
            return fArr;
        } else if (list != null) {
            return C16877v.q1(list);
        } else {
            return null;
        }
    }

    private static final void g(List<C5747v0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}

package p1;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@C17604b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\b@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u0001\u0007\u0001\u00020\u0006¨\u0006\n"}, d2 = {"Lp1/F0;", "", "", "value", "a", "(F)S", "", "halfValue", "b", "(S)S", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F0 implements Comparable<F0> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27189a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final short f27190b = b(5120);

    /* renamed from: c  reason: collision with root package name */
    private static final short f27191c = b(-1025);

    /* renamed from: d  reason: collision with root package name */
    private static final short f27192d = b(31743);

    /* renamed from: e  reason: collision with root package name */
    private static final short f27193e = b(1024);

    /* renamed from: f  reason: collision with root package name */
    private static final short f27194f = b(1);

    /* renamed from: g  reason: collision with root package name */
    private static final short f27195g = b(32256);

    /* renamed from: h  reason: collision with root package name */
    private static final short f27196h = b(-1024);

    /* renamed from: i  reason: collision with root package name */
    private static final short f27197i = b(Short.MIN_VALUE);

    /* renamed from: j  reason: collision with root package name */
    private static final short f27198j = b(31744);

    /* renamed from: k  reason: collision with root package name */
    private static final short f27199k = b(0);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lp1/F0$a;", "", "<init>", "()V", "", "MaxExponent", "I", "MinExponent", "Size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static short a(float f10) {
        int i10;
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & floatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 == 255) {
            if (i13 != 0) {
                i15 = 512;
            }
            i10 = (i11 << 15) | (i14 << 10) | i15;
        } else {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 > 0) {
                i15 = i13 >> 13;
                if ((floatToRawIntBits & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                } else {
                    i14 = i16;
                }
            } else if (i16 >= -10) {
                int i17 = (8388608 | i13) >> (1 - i16);
                if ((i17 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i17 += 8192;
                }
                i14 = 0;
                i15 = i17 >> 13;
            } else {
                i14 = 0;
            }
            i10 = (i11 << 15) | (i14 << 10) | i15;
        }
        return b((short) i10);
    }

    public static short b(short s10) {
        return s10;
    }
}

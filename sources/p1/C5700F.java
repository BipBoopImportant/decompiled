package p1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import kotlin.Metadata;
import p1.C5712d0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lp1/d0;", "Landroid/graphics/PorterDuff$Mode;", "c", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "a", "(I)Landroid/graphics/BlendMode;", "b", "(Landroid/graphics/BlendMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.F  reason: case insensitive filesystem */
public final class C5700F {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p1.F$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27188a;

        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(2:57|58)|59|61) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|61) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.BlendMode[] r0 = android.graphics.BlendMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.BlendMode r1 = android.graphics.BlendMode.CLEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OVER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OVER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_IN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_IN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OUT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_ATOP     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_ATOP     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.XOR     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.PLUS     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.MODULATE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SCREEN     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DARKEN     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.LIGHTEN     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_DODGE     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_BURN     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.HARD_LIGHT     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SOFT_LIGHT     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.DIFFERENCE     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.EXCLUSION     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.MULTIPLY     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.HUE     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.SATURATION     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                android.graphics.BlendMode r1 = android.graphics.BlendMode.LUMINOSITY     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                f27188a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.C5700F.a.<clinit>():void");
        }
    }

    public static final BlendMode a(int i10) {
        C5712d0.a aVar = C5712d0.f27280a;
        return C5712d0.E(i10, aVar.a()) ? BlendMode.CLEAR : C5712d0.E(i10, aVar.x()) ? BlendMode.SRC : C5712d0.E(i10, aVar.g()) ? BlendMode.DST : C5712d0.E(i10, aVar.B()) ? BlendMode.SRC_OVER : C5712d0.E(i10, aVar.k()) ? BlendMode.DST_OVER : C5712d0.E(i10, aVar.z()) ? BlendMode.SRC_IN : C5712d0.E(i10, aVar.i()) ? BlendMode.DST_IN : C5712d0.E(i10, aVar.A()) ? BlendMode.SRC_OUT : C5712d0.E(i10, aVar.j()) ? BlendMode.DST_OUT : C5712d0.E(i10, aVar.y()) ? BlendMode.SRC_ATOP : C5712d0.E(i10, aVar.h()) ? BlendMode.DST_ATOP : C5712d0.E(i10, aVar.C()) ? BlendMode.XOR : C5712d0.E(i10, aVar.t()) ? BlendMode.PLUS : C5712d0.E(i10, aVar.q()) ? BlendMode.MODULATE : C5712d0.E(i10, aVar.v()) ? BlendMode.SCREEN : C5712d0.E(i10, aVar.s()) ? BlendMode.OVERLAY : C5712d0.E(i10, aVar.e()) ? BlendMode.DARKEN : C5712d0.E(i10, aVar.o()) ? BlendMode.LIGHTEN : C5712d0.E(i10, aVar.d()) ? BlendMode.COLOR_DODGE : C5712d0.E(i10, aVar.c()) ? BlendMode.COLOR_BURN : C5712d0.E(i10, aVar.m()) ? BlendMode.HARD_LIGHT : C5712d0.E(i10, aVar.w()) ? BlendMode.SOFT_LIGHT : C5712d0.E(i10, aVar.f()) ? BlendMode.DIFFERENCE : C5712d0.E(i10, aVar.l()) ? BlendMode.EXCLUSION : C5712d0.E(i10, aVar.r()) ? BlendMode.MULTIPLY : C5712d0.E(i10, aVar.n()) ? BlendMode.HUE : C5712d0.E(i10, aVar.u()) ? BlendMode.SATURATION : C5712d0.E(i10, aVar.b()) ? BlendMode.COLOR : C5712d0.E(i10, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int b(BlendMode blendMode) {
        switch (a.f27188a[blendMode.ordinal()]) {
            case 1:
                return C5712d0.f27280a.a();
            case 2:
                return C5712d0.f27280a.x();
            case 3:
                return C5712d0.f27280a.g();
            case 4:
                return C5712d0.f27280a.B();
            case 5:
                return C5712d0.f27280a.k();
            case 6:
                return C5712d0.f27280a.z();
            case 7:
                return C5712d0.f27280a.i();
            case 8:
                return C5712d0.f27280a.A();
            case 9:
                return C5712d0.f27280a.j();
            case 10:
                return C5712d0.f27280a.y();
            case 11:
                return C5712d0.f27280a.h();
            case 12:
                return C5712d0.f27280a.C();
            case 13:
                return C5712d0.f27280a.t();
            case 14:
                return C5712d0.f27280a.q();
            case 15:
                return C5712d0.f27280a.v();
            case 16:
                return C5712d0.f27280a.s();
            case 17:
                return C5712d0.f27280a.e();
            case 18:
                return C5712d0.f27280a.o();
            case 19:
                return C5712d0.f27280a.d();
            case 20:
                return C5712d0.f27280a.c();
            case 21:
                return C5712d0.f27280a.m();
            case 22:
                return C5712d0.f27280a.w();
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                return C5712d0.f27280a.f();
            case BuildConfig.MIN_SDK_VERSION /*24*/:
                return C5712d0.f27280a.l();
            case 25:
                return C5712d0.f27280a.r();
            case 26:
                return C5712d0.f27280a.n();
            case 27:
                return C5712d0.f27280a.u();
            case 28:
                return C5712d0.f27280a.b();
            case 29:
                return C5712d0.f27280a.p();
            default:
                return C5712d0.f27280a.B();
        }
    }

    public static final PorterDuff.Mode c(int i10) {
        C5712d0.a aVar = C5712d0.f27280a;
        return C5712d0.E(i10, aVar.a()) ? PorterDuff.Mode.CLEAR : C5712d0.E(i10, aVar.x()) ? PorterDuff.Mode.SRC : C5712d0.E(i10, aVar.g()) ? PorterDuff.Mode.DST : C5712d0.E(i10, aVar.B()) ? PorterDuff.Mode.SRC_OVER : C5712d0.E(i10, aVar.k()) ? PorterDuff.Mode.DST_OVER : C5712d0.E(i10, aVar.z()) ? PorterDuff.Mode.SRC_IN : C5712d0.E(i10, aVar.i()) ? PorterDuff.Mode.DST_IN : C5712d0.E(i10, aVar.A()) ? PorterDuff.Mode.SRC_OUT : C5712d0.E(i10, aVar.j()) ? PorterDuff.Mode.DST_OUT : C5712d0.E(i10, aVar.y()) ? PorterDuff.Mode.SRC_ATOP : C5712d0.E(i10, aVar.h()) ? PorterDuff.Mode.DST_ATOP : C5712d0.E(i10, aVar.C()) ? PorterDuff.Mode.XOR : C5712d0.E(i10, aVar.t()) ? PorterDuff.Mode.ADD : C5712d0.E(i10, aVar.v()) ? PorterDuff.Mode.SCREEN : C5712d0.E(i10, aVar.s()) ? PorterDuff.Mode.OVERLAY : C5712d0.E(i10, aVar.e()) ? PorterDuff.Mode.DARKEN : C5712d0.E(i10, aVar.o()) ? PorterDuff.Mode.LIGHTEN : C5712d0.E(i10, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

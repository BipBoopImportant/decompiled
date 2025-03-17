package S5;

import N5.b;
import N5.c;
import N5.h;
import O5.d;
import O5.e;
import O5.l;
import QJ.M;
import R5.c;
import XH.t;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u0010\u001a\u00020\u000e*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"LN5/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "resId", "default", "c", "(LN5/h;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "LN5/c;", "a", "LN5/c;", "b", "()LN5/c;", "DEFAULT_REQUEST_OPTIONS", "", "(LN5/h;)Z", "allowInexactSize", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final c f39881a = new c((M) null, (M) null, (M) null, (M) null, (c.a) null, (e) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (b) null, (b) null, (b) null, 32767, (DefaultConstructorMarker) null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39882a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                O5.e[] r0 = O5.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                O5.e r1 = O5.e.EXACT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                O5.e r1 = O5.e.INEXACT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                O5.e r1 = O5.e.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f39882a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: S5.i.a.<clinit>():void");
        }
    }

    public static final boolean a(h hVar) {
        int i10 = a.f39882a[hVar.H().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new t();
            } else if ((hVar.q().m() != null || !(hVar.K() instanceof d)) && (!(hVar.M() instanceof P5.b) || !(hVar.K() instanceof l) || !(((P5.b) hVar.M()).c() instanceof ImageView) || ((P5.b) hVar.M()).c() != ((l) hVar.K()).c())) {
                return false;
            }
        }
        return true;
    }

    public static final N5.c b() {
        return f39881a;
    }

    public static final Drawable c(h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(hVar.l(), num.intValue());
    }
}

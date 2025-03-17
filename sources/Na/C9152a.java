package Na;

import Ea.C9068b;
import La.C9138a;
import Ra.b;
import android.content.Context;
import android.graphics.Color;
import x2.C6244c;

/* renamed from: Na.a  reason: case insensitive filesystem */
public class C9152a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f61960f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    private final boolean f61961a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61962b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61963c;

    /* renamed from: d  reason: collision with root package name */
    private final int f61964d;

    /* renamed from: e  reason: collision with root package name */
    private final float f61965e;

    public C9152a(Context context) {
        this(b.b(context, C9068b.f59356u, false), C9138a.b(context, C9068b.f59355t, 0), C9138a.b(context, C9068b.f59354s, 0), C9138a.b(context, C9068b.f59352q, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return C6244c.p(i10, 255) == this.f61964d;
    }

    public float a(float f10) {
        float f11 = this.f61965e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int j10 = C9138a.j(C6244c.p(i10, 255), this.f61962b, a10);
        if (a10 > 0.0f && (i11 = this.f61963c) != 0) {
            j10 = C9138a.i(j10, C6244c.p(i11, f61960f));
        }
        return C6244c.p(j10, alpha);
    }

    public int c(int i10, float f10) {
        return (!this.f61961a || !e(i10)) ? i10 : b(i10, f10);
    }

    public boolean d() {
        return this.f61961a;
    }

    public C9152a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f61961a = z10;
        this.f61962b = i10;
        this.f61963c = i11;
        this.f61964d = i12;
        this.f61965e = f10;
    }
}

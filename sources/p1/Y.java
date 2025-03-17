package p1;

import XH.t;
import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.U0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp1/U0;", "a", "()Lp1/U0;", "Landroid/graphics/Path;", "c", "(Landroid/graphics/Path;)Lp1/U0;", "", "message", "LXH/N;", "d", "(Ljava/lang/String;)V", "Lp1/U0$b;", "Landroid/graphics/Path$Direction;", "e", "(Lp1/U0$b;)Landroid/graphics/Path$Direction;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Y {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27261a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                p1.U0$b[] r0 = p1.U0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p1.U0$b r1 = p1.U0.b.CounterClockwise     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p1.U0$b r1 = p1.U0.b.Clockwise     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f27261a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.Y.a.<clinit>():void");
        }
    }

    public static final U0 a() {
        return new T((Path) null, 1, (DefaultConstructorMarker) null);
    }

    public static final U0 c(Path path) {
        return new T(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: private */
    public static final Path.Direction e(U0.b bVar) {
        int i10 = a.f27261a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new t();
    }
}

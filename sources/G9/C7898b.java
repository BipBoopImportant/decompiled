package g9;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroid/os/Handler;", "a", "LXH/o;", "d", "()Landroid/os/Handler;", "MAIN_HANDLER", "Landroid/graphics/drawable/Drawable;", "Lo1/m;", "c", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize", "drawablepainter_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: g9.b  reason: case insensitive filesystem */
public final class C7898b {

    /* renamed from: a  reason: collision with root package name */
    private static final C16824o f51352a = C16825p.a(s.NONE, a.f51353c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Handler;", "b", "()Landroid/os/Handler;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g9.b$a */
    static final class a extends C17544u implements C17631a<Handler> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f51353c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    public static final long c(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? C5673m.f26722b.a() : C5674n.a((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
    }

    /* access modifiers changed from: private */
    public static final Handler d() {
        return (Handler) f51352a.getValue();
    }
}

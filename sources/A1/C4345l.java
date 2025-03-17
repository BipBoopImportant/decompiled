package A1;

import android.view.MotionEvent;
import kotlin.Metadata;
import o1.C5668h;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"LA1/l;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "Lo1/g;", "a", "(Landroid/view/MotionEvent;I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.l  reason: case insensitive filesystem */
final class C4345l {

    /* renamed from: a  reason: collision with root package name */
    public static final C4345l f4415a = new C4345l();

    private C4345l() {
    }

    public final long a(MotionEvent motionEvent, int i10) {
        return C5668h.a(motionEvent.getRawX(i10), motionEvent.getRawY(i10));
    }
}

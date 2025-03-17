package A1;

import android.view.MotionEvent;
import androidx.compose.ui.d;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "a", "(Landroidx/compose/ui/d;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class M {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<MotionEvent, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f4354c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AndroidViewHolder androidViewHolder) {
            super(1);
            this.f4354c = androidViewHolder;
        }

        /* renamed from: a */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean z10;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    z10 = this.f4354c.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    z10 = this.f4354c.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final d a(d dVar, AndroidViewHolder androidViewHolder) {
        L l10 = new L();
        l10.f(new a(androidViewHolder));
        T t10 = new T();
        l10.g(t10);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(t10);
        return dVar.s(l10);
    }
}

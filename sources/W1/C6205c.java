package w1;

import android.view.View;
import kotlin.Metadata;
import w1.C6204b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lw1/c;", "Lw1/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lw1/b;", "hapticFeedbackType", "LXH/N;", "a", "(I)V", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w1.c  reason: case insensitive filesystem */
public final class C6205c implements C6203a {

    /* renamed from: a  reason: collision with root package name */
    private final View f31329a;

    public C6205c(View view) {
        this.f31329a = view;
    }

    public void a(int i10) {
        C6204b.a aVar = C6204b.f31328a;
        if (C6204b.b(i10, aVar.a())) {
            this.f31329a.performHapticFeedback(0);
        } else if (C6204b.b(i10, aVar.b())) {
            this.f31329a.performHapticFeedback(9);
        }
    }
}

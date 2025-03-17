package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: TF.q  reason: case insensitive filesystem */
public final class C16474q implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138457a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f138458b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f138459c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f138460d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialButton f138461e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialButton f138462f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialButton f138463g;

    private C16474q(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6) {
        this.f138457a = constraintLayout;
        this.f138458b = materialButton;
        this.f138459c = materialButton2;
        this.f138460d = materialButton3;
        this.f138461e = materialButton4;
        this.f138462f = materialButton5;
        this.f138463g = materialButton6;
    }

    public static C16474q a(View view) {
        int i10 = C16401b.f138081J0;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = C16401b.f138083K0;
            MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
            if (materialButton2 != null) {
                i10 = C16401b.f138085L0;
                MaterialButton materialButton3 = (MaterialButton) b.a(view, i10);
                if (materialButton3 != null) {
                    i10 = C16401b.f138087M0;
                    MaterialButton materialButton4 = (MaterialButton) b.a(view, i10);
                    if (materialButton4 != null) {
                        i10 = C16401b.f138089N0;
                        MaterialButton materialButton5 = (MaterialButton) b.a(view, i10);
                        if (materialButton5 != null) {
                            i10 = C16401b.f138091O0;
                            MaterialButton materialButton6 = (MaterialButton) b.a(view, i10);
                            if (materialButton6 != null) {
                                return new C16474q((ConstraintLayout) view, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138457a;
    }
}

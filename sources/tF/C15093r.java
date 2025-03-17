package tF;

import I2.C0;
import I2.C4626o0;
import I2.b1;
import OE.C13317i;
import QE.C13431h;
import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import com.sugarcube.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LtF/r;", "Landroid/app/Dialog;", "Landroid/app/Activity;", "activity", "", "title", "backgroundColor", "textColor", "bouncingBallTintColor", "<init>", "(Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "b", "Ljava/lang/Integer;", "c", "d", "e", "LQE/h;", "f", "LQE/h;", "binding", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tF.r  reason: case insensitive filesystem */
public final class C15093r extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f131205a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f131206b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f131207c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f131208d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f131209e;

    /* renamed from: f  reason: collision with root package name */
    private C13431h f131210f;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0014"}, d2 = {"LtF/r$a;", "", "<init>", "()V", "", "id", "b", "(I)LtF/r$a;", "Landroid/app/Activity;", "activity", "LtF/r;", "a", "(Landroid/app/Activity;)LtF/r;", "Ljava/lang/Integer;", "title", "backgroundColor", "c", "textColor", "d", "bouncingBallTintColor", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tF.r$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f131211a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f131212b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f131213c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f131214d;

        public final C15093r a(Activity activity) {
            C17542s.j(activity, "activity");
            return new C15093r(activity, this.f131211a, this.f131212b, this.f131213c, this.f131214d, (DefaultConstructorMarker) null);
        }

        public final a b(int i10) {
            this.f131211a = Integer.valueOf(i10);
            return this;
        }
    }

    public /* synthetic */ C15093r(Activity activity, Integer num, Integer num2, Integer num3, Integer num4, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, num, num2, num3, num4);
    }

    /* access modifiers changed from: private */
    public static final WindowInsets b(View view, WindowInsets windowInsets) {
        C17542s.j(view, "<unused var>");
        C17542s.j(windowInsets, "insets");
        return windowInsets.consumeSystemWindowInsets();
    }

    private C15093r(Activity activity, Integer num, Integer num2, Integer num3, Integer num4) {
        super(activity);
        this.f131205a = activity;
        this.f131206b = num;
        this.f131207c = num2;
        this.f131208d = num3;
        this.f131209e = num4;
        C13431h c10 = C13431h.c(LayoutInflater.from(activity));
        C17542s.i(c10, "inflate(...)");
        this.f131210f = c10;
        Window window = getWindow();
        if (window != null) {
            C4626o0.b(window, false);
            b1 a10 = C4626o0.a(window, window.getDecorView());
            C17542s.i(a10, "getInsetsController(...)");
            a10.e(2);
            a10.a(C0.l.f());
            View decorView = window.getDecorView();
            View rootView = decorView.getRootView();
            if (rootView != null) {
                rootView.setBackgroundResource(R.color.transparent);
            }
            decorView.setOnApplyWindowInsetsListener(new C15092q());
            setCancelable(false);
        }
        C13431h hVar = this.f131210f;
        if (num != null) {
            hVar.f114586d.setText(num.intValue());
        }
        hVar.f114586d.setTextColor(num3 != null ? num3.intValue() : activity.getColor(R.color.primary_text_color));
        hVar.f114584b.setCardBackgroundColor(num2 != null ? num2.intValue() : activity.getColor(R.color.view_background_base));
        ((ImageView) hVar.f114585c.findViewById(C13317i.f112918J0)).setColorFilter(num4 != null ? num4.intValue() : activity.getColor(R.color.ikea_blue));
        hVar.f114585c.b();
        setContentView(this.f131210f.getRoot());
    }
}

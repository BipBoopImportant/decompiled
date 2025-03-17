package ZF;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.sugarcube.decorate.v1.internal.v1.DecorateFragment;

/* renamed from: ZF.b0  reason: case insensitive filesystem */
public final /* synthetic */ class C16945b0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f140633a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DecorateFragment f140634b;

    public /* synthetic */ C16945b0(TextView textView, DecorateFragment decorateFragment) {
        this.f140633a = textView;
        this.f140634b = decorateFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return DecorateFragment.S2(this.f140633a, this.f140634b, view, motionEvent);
    }
}

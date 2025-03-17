package w6;

import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* renamed from: w6.h  reason: case insensitive filesystem */
public final /* synthetic */ class C8926h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f57245a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f57246b;

    public /* synthetic */ C8926h(LottieAnimationView lottieAnimationView, int i10) {
        this.f57245a = lottieAnimationView;
        this.f57246b = i10;
    }

    public final Object call() {
        return this.f57245a.r(this.f57246b);
    }
}

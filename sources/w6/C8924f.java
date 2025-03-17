package w6;

import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* renamed from: w6.f  reason: case insensitive filesystem */
public final /* synthetic */ class C8924f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f57243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57244b;

    public /* synthetic */ C8924f(LottieAnimationView lottieAnimationView, String str) {
        this.f57243a = lottieAnimationView;
        this.f57244b = str;
    }

    public final Object call() {
        return this.f57243a.q(this.f57244b);
    }
}

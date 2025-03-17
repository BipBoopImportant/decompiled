package ZF;

import com.sugarcube.decorate.v1.internal.v1.DecorateFragment;

/* renamed from: ZF.P  reason: case insensitive filesystem */
public final /* synthetic */ class C16924P implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DecorateFragment f140565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Integer f140566b;

    public /* synthetic */ C16924P(DecorateFragment decorateFragment, Integer num) {
        this.f140565a = decorateFragment;
        this.f140566b = num;
    }

    public final void run() {
        DecorateFragment.e4(this.f140565a, this.f140566b);
    }
}

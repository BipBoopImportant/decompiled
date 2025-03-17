package ZF;

import com.sugarcube.decorate.v1.internal.v1.DecorateFragment;

/* renamed from: ZF.i  reason: case insensitive filesystem */
public final /* synthetic */ class C16958i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DecorateFragment f140649a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f140650b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f140651c;

    public /* synthetic */ C16958i(DecorateFragment decorateFragment, long j10, String str) {
        this.f140649a = decorateFragment;
        this.f140650b = j10;
        this.f140651c = str;
    }

    public final void run() {
        DecorateFragment.o5(this.f140649a, this.f140650b, this.f140651c);
    }
}

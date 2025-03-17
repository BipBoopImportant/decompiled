package ZF;

import RF.k;
import com.sugarcube.decorate.v1.internal.v1.DecorateFragment;

/* renamed from: ZF.z0  reason: case insensitive filesystem */
public final /* synthetic */ class C16993z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f140692a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DecorateFragment f140693b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f140694c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f140695d;

    public /* synthetic */ C16993z0(boolean z10, DecorateFragment decorateFragment, k kVar, boolean z11) {
        this.f140692a = z10;
        this.f140693b = decorateFragment;
        this.f140694c = kVar;
        this.f140695d = z11;
    }

    public final void run() {
        DecorateFragment.x5(this.f140692a, this.f140693b, this.f140694c, this.f140695d);
    }
}

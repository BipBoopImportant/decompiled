package F9;

import java.util.concurrent.CountDownLatch;
import xa.C8965f;
import xa.C8971l;

public final /* synthetic */ class n implements C8965f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f35582a;

    public /* synthetic */ n(CountDownLatch countDownLatch) {
        this.f35582a = countDownLatch;
    }

    public final void onComplete(C8971l lVar) {
        this.f35582a.countDown();
    }
}

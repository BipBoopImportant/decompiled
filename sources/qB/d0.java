package Qb;

import java.util.concurrent.CountDownLatch;
import xa.C8962c;
import xa.C8971l;

public final /* synthetic */ class d0 implements C8962c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f62971a;

    public /* synthetic */ d0(CountDownLatch countDownLatch) {
        this.f62971a = countDownLatch;
    }

    public final Object then(C8971l lVar) {
        return this.f62971a.countDown();
    }
}

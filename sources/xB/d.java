package Xb;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f64780a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f64781b;

    public /* synthetic */ d(e eVar, CountDownLatch countDownLatch) {
        this.f64780a = eVar;
        this.f64781b = countDownLatch;
    }

    public final void run() {
        this.f64780a.m(this.f64781b);
    }
}

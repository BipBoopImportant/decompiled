package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Process;
import java.util.concurrent.BlockingQueue;

final class L2 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final Object f49809a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<N2<?>> f49810b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f49811c = false;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ J2 f49812d;

    public L2(J2 j22, String str, BlockingQueue<N2<?>> blockingQueue) {
        this.f49812d = j22;
        C6620s.l(str);
        C6620s.l(blockingQueue);
        this.f49809a = new Object();
        this.f49810b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        C7614i2 J10 = this.f49812d.f().J();
        String name = getName();
        J10.b(name + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f49812d.f49683i) {
            try {
                if (!this.f49811c) {
                    this.f49812d.f49684j.release();
                    this.f49812d.f49683i.notifyAll();
                    if (this == this.f49812d.f49677c) {
                        this.f49812d.f49677c = null;
                    } else if (this == this.f49812d.f49678d) {
                        this.f49812d.f49678d = null;
                    } else {
                        this.f49812d.f().E().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f49811c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.f49809a) {
            this.f49809a.notifyAll();
        }
    }

    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f49812d.f49684j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                N2 poll = this.f49810b.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.f49843b ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.f49809a) {
                        if (this.f49810b.peek() == null && !this.f49812d.f49685k) {
                            try {
                                this.f49809a.wait(30000);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f49812d.f49683i) {
                        if (this.f49810b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }
}

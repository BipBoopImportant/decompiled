package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

class A {

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f122469a;

    /* renamed from: b  reason: collision with root package name */
    final C14193d f122470b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f122471c;

    /* renamed from: d  reason: collision with root package name */
    long f122472d;

    /* renamed from: e  reason: collision with root package name */
    long f122473e;

    /* renamed from: f  reason: collision with root package name */
    long f122474f;

    /* renamed from: g  reason: collision with root package name */
    long f122475g;

    /* renamed from: h  reason: collision with root package name */
    long f122476h;

    /* renamed from: i  reason: collision with root package name */
    long f122477i;

    /* renamed from: j  reason: collision with root package name */
    long f122478j;

    /* renamed from: k  reason: collision with root package name */
    long f122479k;

    /* renamed from: l  reason: collision with root package name */
    int f122480l;

    /* renamed from: m  reason: collision with root package name */
    int f122481m;

    /* renamed from: n  reason: collision with root package name */
    int f122482n;

    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final A f122483a;

        /* renamed from: com.squareup.picasso.A$a$a  reason: collision with other inner class name */
        class C3019a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Message f122484a;

            C3019a(Message message) {
                this.f122484a = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f122484a.what);
            }
        }

        a(Looper looper, A a10) {
            super(looper);
            this.f122483a = a10;
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f122483a.j();
            } else if (i10 == 1) {
                this.f122483a.k();
            } else if (i10 == 2) {
                this.f122483a.h((long) message.arg1);
            } else if (i10 == 3) {
                this.f122483a.i((long) message.arg1);
            } else if (i10 != 4) {
                t.f122595o.post(new C3019a(message));
            } else {
                this.f122483a.l((Long) message.obj);
            }
        }
    }

    A(C14193d dVar) {
        this.f122470b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f122469a = handlerThread;
        handlerThread.start();
        F.h(handlerThread.getLooper());
        this.f122471c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i10, long j10) {
        return j10 / ((long) i10);
    }

    private void m(Bitmap bitmap, int i10) {
        int i11 = F.i(bitmap);
        Handler handler = this.f122471c;
        handler.sendMessage(handler.obtainMessage(i10, i11, 0));
    }

    /* access modifiers changed from: package-private */
    public B a() {
        return new B(this.f122470b.a(), this.f122470b.size(), this.f122472d, this.f122473e, this.f122474f, this.f122475g, this.f122476h, this.f122477i, this.f122478j, this.f122479k, this.f122480l, this.f122481m, this.f122482n, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f122471c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f122471c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    public void f(long j10) {
        Handler handler = this.f122471c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j10)));
    }

    /* access modifiers changed from: package-private */
    public void h(long j10) {
        int i10 = this.f122481m + 1;
        this.f122481m = i10;
        long j11 = this.f122475g + j10;
        this.f122475g = j11;
        this.f122478j = g(i10, j11);
    }

    /* access modifiers changed from: package-private */
    public void i(long j10) {
        this.f122482n++;
        long j11 = this.f122476h + j10;
        this.f122476h = j11;
        this.f122479k = g(this.f122481m, j11);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f122472d++;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f122473e++;
    }

    /* access modifiers changed from: package-private */
    public void l(Long l10) {
        this.f122480l++;
        long longValue = this.f122474f + l10.longValue();
        this.f122474f = longValue;
        this.f122477i = g(this.f122480l, longValue);
    }
}

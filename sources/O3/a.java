package o3;

import D2.m;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class a<D> extends b<D> {

    /* renamed from: i  reason: collision with root package name */
    private Executor f26747i;

    /* renamed from: j  reason: collision with root package name */
    private volatile a<D>.defpackage.a f26748j;

    /* renamed from: k  reason: collision with root package name */
    private volatile a<D>.defpackage.a f26749k;

    /* renamed from: l  reason: collision with root package name */
    private long f26750l;

    /* renamed from: m  reason: collision with root package name */
    private long f26751m = -10000;

    /* renamed from: n  reason: collision with root package name */
    private Handler f26752n;

    /* renamed from: o3.a$a  reason: collision with other inner class name */
    final class C0428a extends c<D> implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        boolean f26753f;

        C0428a() {
        }

        /* access modifiers changed from: protected */
        public D b() {
            try {
                return a.this.E();
            } catch (m e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        /* access modifiers changed from: protected */
        public void g(D d10) {
            a.this.y(this, d10);
        }

        /* access modifiers changed from: protected */
        public void h(D d10) {
            a.this.z(this, d10);
        }

        public void run() {
            this.f26753f = false;
            a.this.A();
        }
    }

    public a(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void A() {
        if (this.f26749k == null && this.f26748j != null) {
            if (this.f26748j.f26753f) {
                this.f26748j.f26753f = false;
                this.f26752n.removeCallbacks(this.f26748j);
            }
            if (this.f26750l <= 0 || SystemClock.uptimeMillis() >= this.f26751m + this.f26750l) {
                if (this.f26747i == null) {
                    this.f26747i = B();
                }
                this.f26748j.c(this.f26747i);
                return;
            }
            this.f26748j.f26753f = true;
            this.f26752n.postAtTime(this.f26748j, this.f26751m + this.f26750l);
        }
    }

    /* access modifiers changed from: protected */
    public Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract D C();

    public void D(D d10) {
    }

    /* access modifiers changed from: protected */
    public D E() {
        return C();
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f26748j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f26748j);
            printWriter.print(" waiting=");
            printWriter.println(this.f26748j.f26753f);
        }
        if (this.f26749k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f26749k);
            printWriter.print(" waiting=");
            printWriter.println(this.f26749k.f26753f);
        }
        if (this.f26750l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f26750l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f26751m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f26751m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        if (this.f26748j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f26749k != null) {
            if (this.f26748j.f26753f) {
                this.f26748j.f26753f = false;
                this.f26752n.removeCallbacks(this.f26748j);
            }
            this.f26748j = null;
            return false;
        } else if (this.f26748j.f26753f) {
            this.f26748j.f26753f = false;
            this.f26752n.removeCallbacks(this.f26748j);
            this.f26748j = null;
            return false;
        } else {
            boolean a10 = this.f26748j.a(false);
            if (a10) {
                this.f26749k = this.f26748j;
                x();
            }
            this.f26748j = null;
            return a10;
        }
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        b();
        this.f26748j = new C0428a();
        A();
    }

    public void x() {
    }

    /* access modifiers changed from: package-private */
    public void y(a<D>.defpackage.a aVar, D d10) {
        D(d10);
        if (this.f26749k == aVar) {
            t();
            this.f26751m = SystemClock.uptimeMillis();
            this.f26749k = null;
            e();
            A();
        }
    }

    /* access modifiers changed from: package-private */
    public void z(a<D>.defpackage.a aVar, D d10) {
        if (this.f26748j != aVar) {
            y(aVar, d10);
        } else if (i()) {
            D(d10);
        } else {
            c();
            this.f26751m = SystemClock.uptimeMillis();
            this.f26748j = null;
            f(d10);
        }
    }
}

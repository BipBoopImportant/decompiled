package L3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import t3.C5950a;
import t3.C5959j;
import t3.C5961l;
import t3.q;

/* renamed from: L3.e  reason: case insensitive filesystem */
public final class C6640e extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static int f38129d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f38130e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38131a;

    /* renamed from: b  reason: collision with root package name */
    private final b f38132b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38133c;

    /* renamed from: L3.e$b */
    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private C5959j f38134a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f38135b;

        /* renamed from: c  reason: collision with root package name */
        private Error f38136c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f38137d;

        /* renamed from: e  reason: collision with root package name */
        private C6640e f38138e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) {
            C5950a.e(this.f38134a);
            this.f38134a.h(i10);
            this.f38138e = new C6640e(this, this.f38134a.g(), i10 != 0);
        }

        private void d() {
            C5950a.e(this.f38134a);
            this.f38134a.i();
        }

        public C6640e a(int i10) {
            boolean z10;
            start();
            this.f38135b = new Handler(getLooper(), this);
            this.f38134a = new C5959j(this.f38135b);
            synchronized (this) {
                z10 = false;
                this.f38135b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f38138e == null && this.f38137d == null && this.f38136c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f38137d;
            if (runtimeException == null) {
                Error error = this.f38136c;
                if (error == null) {
                    return (C6640e) C5950a.e(this.f38138e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            C5950a.e(this.f38135b);
            this.f38135b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f38137d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (C5961l.a e11) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f38137d = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    try {
                        q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                        this.f38136c = e12;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notify();
                            throw th2;
                        }
                    }
                }
                return true;
            } else if (i10 != 2) {
                return true;
            } else {
                try {
                    d();
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
                quit();
                return true;
            }
        }
    }

    private static int a(Context context) {
        if (C5961l.i(context)) {
            return C5961l.j() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (C6640e.class) {
            try {
                z10 = true;
                if (!f38130e) {
                    f38129d = a(context);
                    f38130e = true;
                }
                if (f38129d == 0) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return z10;
    }

    public static C6640e c(Context context, boolean z10) {
        int i10 = 0;
        C5950a.g(!z10 || b(context));
        b bVar = new b();
        if (z10) {
            i10 = f38129d;
        }
        return bVar.a(i10);
    }

    public void release() {
        super.release();
        synchronized (this.f38132b) {
            try {
                if (!this.f38133c) {
                    this.f38132b.c();
                    this.f38133c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C6640e(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f38132b = bVar;
        this.f38131a = z10;
    }
}

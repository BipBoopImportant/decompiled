package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ob.C10101e;
import u5.C8878b;

/* renamed from: androidx.work.x  reason: case insensitive filesystem */
public abstract class C7054x {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.x$a */
    public static abstract class a {

        /* renamed from: androidx.work.x$a$a  reason: collision with other inner class name */
        public static final class C0779a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C7037f f45323a;

            public C0779a() {
                this(C7037f.f45197c);
            }

            public C7037f e() {
                return this.f45323a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0779a.class != obj.getClass()) {
                    return false;
                }
                return this.f45323a.equals(((C0779a) obj).f45323a);
            }

            public int hashCode() {
                return (C0779a.class.getName().hashCode() * 31) + this.f45323a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f45323a + '}';
            }

            public C0779a(C7037f fVar) {
                this.f45323a = fVar;
            }
        }

        /* renamed from: androidx.work.x$a$b */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.x$a$c */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C7037f f45324a;

            public c() {
                this(C7037f.f45197c);
            }

            public C7037f e() {
                return this.f45324a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f45324a.equals(((c) obj).f45324a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f45324a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f45324a + '}';
            }

            public c(C7037f fVar) {
                this.f45324a = fVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0779a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(C7037f fVar) {
            return new c(fVar);
        }
    }

    public C7054x(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public C10101e<C7043l> getForegroundInfoAsync() {
        return c.a(new C7053w());
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final C7037f getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public C8878b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public V getWorkerFactory() {
        return this.mWorkerParams.m();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final C10101e<Void> setForegroundAsync(C7043l lVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), lVar);
    }

    public C10101e<Void> setProgressAsync(C7037f fVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), fVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract C10101e<a> startWork();

    public final void stop(int i10) {
        if (this.mStopReason.compareAndSet(-256, i10)) {
            onStopped();
        }
    }
}

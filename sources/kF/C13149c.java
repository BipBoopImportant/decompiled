package KF;

import android.app.job.JobService;
import com.sugarcube.app.base.upload.UploadJobService;
import com.sugarcube.app.base.upload.UploadJobService_GeneratedInjector;
import jH.C17412i;
import mH.C17600c;
import mH.C17602e;

/* renamed from: KF.c  reason: case insensitive filesystem */
public abstract class C13149c extends JobService implements C17600c {

    /* renamed from: a  reason: collision with root package name */
    private volatile C17412i f111651a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f111652b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f111653c = false;

    public final C17412i a() {
        if (this.f111651a == null) {
            synchronized (this.f111652b) {
                try {
                    if (this.f111651a == null) {
                        this.f111651a = b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f111651a;
    }

    /* access modifiers changed from: protected */
    public C17412i b() {
        return new C17412i(this);
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (!this.f111653c) {
            this.f111653c = true;
            ((UploadJobService_GeneratedInjector) g0()).injectUploadJobService((UploadJobService) C17602e.a(this));
        }
    }

    public final Object g0() {
        return a().g0();
    }

    public void onCreate() {
        c();
        super.onCreate();
    }
}

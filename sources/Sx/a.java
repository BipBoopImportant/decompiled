package Sx;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.ingka.ikea.pushnotification.impl.PushNotificationService;
import jH.C17412i;
import mH.C17600c;
import mH.C17602e;

public abstract class a extends FirebaseMessagingService implements C17600c {

    /* renamed from: h  reason: collision with root package name */
    private volatile C17412i f116548h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f116549i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private boolean f116550j = false;

    public final Object g0() {
        return w().g0();
    }

    public void onCreate() {
        y();
        super.onCreate();
    }

    public final C17412i w() {
        if (this.f116548h == null) {
            synchronized (this.f116549i) {
                try {
                    if (this.f116548h == null) {
                        this.f116548h = x();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f116548h;
    }

    /* access modifiers changed from: protected */
    public C17412i x() {
        return new C17412i(this);
    }

    /* access modifiers changed from: protected */
    public void y() {
        if (!this.f116550j) {
            this.f116550j = true;
            ((e) g0()).a((PushNotificationService) C17602e.a(this));
        }
    }
}

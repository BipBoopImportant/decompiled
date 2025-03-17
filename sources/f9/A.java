package F9;

import android.os.Bundle;
import android.util.Log;
import xa.C8972m;

abstract class A {

    /* renamed from: a  reason: collision with root package name */
    final int f35543a;

    /* renamed from: b  reason: collision with root package name */
    final C8972m f35544b = new C8972m();

    /* renamed from: c  reason: collision with root package name */
    final int f35545c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f35546d;

    A(int i10, int i11, Bundle bundle) {
        this.f35543a = i10;
        this.f35545c = i11;
        this.f35546d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public final void c(B b10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = b10.toString();
            Log.d("MessengerIpcClient", "Failing " + obj + " with " + obj2);
        }
        this.f35544b.b(b10);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            Log.d("MessengerIpcClient", "Finishing " + obj2 + " with " + valueOf);
        }
        this.f35544b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f35545c + " id=" + this.f35543a + " oneWay=" + b() + "}";
    }
}

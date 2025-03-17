package com.google.firebase.crashlytics.ndk;

import Nb.h;
import Tb.G;
import Wb.g;
import android.content.Context;

class c implements Nb.a {

    /* renamed from: e  reason: collision with root package name */
    private static c f68242e;

    /* renamed from: a  reason: collision with root package name */
    private final a f68243a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f68244b;

    /* renamed from: c  reason: collision with root package name */
    private String f68245c;

    /* renamed from: d  reason: collision with root package name */
    private a f68246d;

    private interface a {
        void a();
    }

    c(a aVar, boolean z10) {
        this.f68243a = aVar;
        this.f68244b = z10;
    }

    static c f(Context context, boolean z10) {
        c cVar = new c(new a(context, new JniNativeApi(context), new g(context)), z10);
        f68242e = cVar;
        return cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(String str, String str2, long j10, G g10) {
        Nb.g f10 = Nb.g.f();
        f10.b("Initializing native session: " + str);
        if (!this.f68243a.k(str, str2, j10, g10)) {
            Nb.g f11 = Nb.g.f();
            f11.k("Failed to initialize Crashlytics NDK for session " + str);
        }
    }

    public h a(String str) {
        return new g(this.f68243a.d(str));
    }

    public boolean b() {
        String str = this.f68245c;
        return str != null && d(str);
    }

    public synchronized void c(String str, String str2, long j10, G g10) {
        this.f68245c = str;
        b bVar = new b(this, str, str2, j10, g10);
        this.f68246d = bVar;
        if (this.f68244b) {
            bVar.a();
        }
    }

    public boolean d(String str) {
        return this.f68243a.j(str);
    }
}

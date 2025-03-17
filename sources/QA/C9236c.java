package Qa;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C4987b;
import java.util.Objects;

/* renamed from: Qa.c  reason: case insensitive filesystem */
public final class C9236c {

    /* renamed from: a  reason: collision with root package name */
    private final d f62881a;

    /* renamed from: b  reason: collision with root package name */
    private final C9235b f62882b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62883c;

    /* renamed from: Qa.c$b */
    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private OnBackInvokedCallback f62884a;

        private b() {
        }

        public void a(C9235b bVar, View view, boolean z10) {
            OnBackInvokedDispatcher a10;
            if (this.f62884a == null && (a10 = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback c10 = c(bVar);
                this.f62884a = c10;
                a10.registerOnBackInvokedCallback(z10 ? 1000000 : 0, c10);
            }
        }

        public void b(View view) {
            OnBackInvokedDispatcher a10 = view.findOnBackInvokedDispatcher();
            if (a10 != null) {
                a10.unregisterOnBackInvokedCallback(this.f62884a);
                this.f62884a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public OnBackInvokedCallback c(C9235b bVar) {
            Objects.requireNonNull(bVar);
            return new C9238e(bVar);
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.f62884a != null;
        }
    }

    /* renamed from: Qa.c$c  reason: collision with other inner class name */
    private static class C1066c extends b {

        /* renamed from: Qa.c$c$a */
        class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C9235b f62885a;

            a(C9235b bVar) {
                this.f62885a = bVar;
            }

            public void onBackCancelled() {
                if (C1066c.this.d()) {
                    this.f62885a.a();
                }
            }

            public void onBackInvoked() {
                this.f62885a.d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C1066c.this.d()) {
                    this.f62885a.c(new C4987b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C1066c.this.d()) {
                    this.f62885a.b(new C4987b(backEvent));
                }
            }
        }

        private C1066c() {
            super();
        }

        /* access modifiers changed from: package-private */
        public OnBackInvokedCallback c(C9235b bVar) {
            return new a(bVar);
        }
    }

    /* renamed from: Qa.c$d */
    private interface d {
        void a(C9235b bVar, View view, boolean z10);

        void b(View view);
    }

    public <T extends View & C9235b> C9236c(T t10) {
        this((C9235b) t10, t10);
    }

    private static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C1066c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    private void d(boolean z10) {
        d dVar = this.f62881a;
        if (dVar != null) {
            dVar.a(this.f62882b, this.f62883c, z10);
        }
    }

    public boolean b() {
        return this.f62881a != null;
    }

    public void c() {
        d(false);
    }

    public void e() {
        d(true);
    }

    public void f() {
        d dVar = this.f62881a;
        if (dVar != null) {
            dVar.b(this.f62883c);
        }
    }

    public C9236c(C9235b bVar, View view) {
        this.f62881a = a();
        this.f62882b = bVar;
        this.f62883c = view;
    }
}

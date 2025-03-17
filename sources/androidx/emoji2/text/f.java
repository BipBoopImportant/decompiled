package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import j0.C5446b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class f {

    /* renamed from: o  reason: collision with root package name */
    private static final Object f21544o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static final Object f21545p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static volatile f f21546q;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f21547a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private final Set<C0335f> f21548b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f21549c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f21550d;

    /* renamed from: e  reason: collision with root package name */
    private final b f21551e;

    /* renamed from: f  reason: collision with root package name */
    final h f21552f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final j f21553g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f21554h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f21555i;

    /* renamed from: j  reason: collision with root package name */
    final int[] f21556j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f21557k;

    /* renamed from: l  reason: collision with root package name */
    private final int f21558l;

    /* renamed from: m  reason: collision with root package name */
    private final int f21559m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final e f21560n;

    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile i f21561b;

        /* renamed from: c  reason: collision with root package name */
        private volatile n f21562c;

        /* renamed from: androidx.emoji2.text.f$a$a  reason: collision with other inner class name */
        class C0334a extends i {
            C0334a() {
            }

            public void a(Throwable th2) {
                a.this.f21564a.p(th2);
            }

            public void b(n nVar) {
                a.this.f(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        /* access modifiers changed from: package-private */
        public int a(CharSequence charSequence, int i10) {
            return this.f21561b.b(charSequence, i10);
        }

        /* access modifiers changed from: package-private */
        public int b(CharSequence charSequence, int i10) {
            return this.f21561b.c(charSequence, i10);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            try {
                this.f21564a.f21552f.a(new C0334a());
            } catch (Throwable th2) {
                this.f21564a.p(th2);
            }
        }

        /* access modifiers changed from: package-private */
        public CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f21561b.j(charSequence, i10, i11, i12, z10);
        }

        /* access modifiers changed from: package-private */
        public void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f21562c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f21564a.f21554h);
        }

        /* access modifiers changed from: package-private */
        public void f(n nVar) {
            if (nVar == null) {
                this.f21564a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f21562c = nVar;
            n nVar2 = this.f21562c;
            j a10 = this.f21564a.f21553g;
            e b10 = this.f21564a.f21560n;
            f fVar = this.f21564a;
            this.f21561b = new i(nVar2, a10, b10, fVar.f21555i, fVar.f21556j, h.a());
            this.f21564a.q();
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final f f21564a;

        b(f fVar) {
            this.f21564a = fVar;
        }

        /* access modifiers changed from: package-private */
        public int a(CharSequence charSequence, int i10) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public int b(CharSequence charSequence, int i10) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void e(EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final h f21565a;

        /* renamed from: b  reason: collision with root package name */
        j f21566b;

        /* renamed from: c  reason: collision with root package name */
        boolean f21567c;

        /* renamed from: d  reason: collision with root package name */
        boolean f21568d;

        /* renamed from: e  reason: collision with root package name */
        int[] f21569e;

        /* renamed from: f  reason: collision with root package name */
        Set<C0335f> f21570f;

        /* renamed from: g  reason: collision with root package name */
        boolean f21571g;

        /* renamed from: h  reason: collision with root package name */
        int f21572h = -16711936;

        /* renamed from: i  reason: collision with root package name */
        int f21573i = 0;

        /* renamed from: j  reason: collision with root package name */
        e f21574j = new e();

        protected c(h hVar) {
            H2.i.h(hVar, "metadataLoader cannot be null.");
            this.f21565a = hVar;
        }

        /* access modifiers changed from: protected */
        public final h a() {
            return this.f21565a;
        }

        public c b(int i10) {
            this.f21573i = i10;
            return this;
        }
    }

    public static class d implements j {
        public j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    public static abstract class C0335f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0335f> f21575a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f21576b;

        /* renamed from: c  reason: collision with root package name */
        private final int f21577c;

        g(C0335f fVar, int i10) {
            this(Arrays.asList(new C0335f[]{(C0335f) H2.i.h(fVar, "initCallback cannot be null")}), i10, (Throwable) null);
        }

        public void run() {
            int size = this.f21575a.size();
            int i10 = 0;
            if (this.f21577c != 1) {
                while (i10 < size) {
                    this.f21575a.get(i10).a(this.f21576b);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f21575a.get(i10).b();
                i10++;
            }
        }

        g(Collection<C0335f> collection, int i10) {
            this(collection, i10, (Throwable) null);
        }

        g(Collection<C0335f> collection, int i10, Throwable th2) {
            H2.i.h(collection, "initCallbacks cannot be null");
            this.f21575a = new ArrayList(collection);
            this.f21577c = i10;
            this.f21576b = th2;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(n nVar);
    }

    public interface j {
        j a(p pVar);
    }

    private f(c cVar) {
        this.f21554h = cVar.f21567c;
        this.f21555i = cVar.f21568d;
        this.f21556j = cVar.f21569e;
        this.f21557k = cVar.f21571g;
        this.f21558l = cVar.f21572h;
        this.f21552f = cVar.f21565a;
        this.f21559m = cVar.f21573i;
        this.f21560n = cVar.f21574j;
        this.f21550d = new Handler(Looper.getMainLooper());
        C5446b bVar = new C5446b();
        this.f21548b = bVar;
        j jVar = cVar.f21566b;
        this.f21553g = jVar == null ? new d() : jVar;
        Set<C0335f> set = cVar.f21570f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f21570f);
        }
        this.f21551e = new a(this);
        o();
    }

    public static f c() {
        f fVar;
        synchronized (f21544o) {
            fVar = f21546q;
            H2.i.j(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return i.d(inputConnection, editable, i10, i11, z10);
    }

    public static boolean i(Editable editable, int i10, KeyEvent keyEvent) {
        return i.e(editable, i10, keyEvent);
    }

    public static f j(c cVar) {
        f fVar = f21546q;
        if (fVar == null) {
            synchronized (f21544o) {
                try {
                    fVar = f21546q;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f21546q = fVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return fVar;
    }

    public static boolean k() {
        return f21546q != null;
    }

    private boolean m() {
        return g() == 1;
    }

    /* JADX INFO: finally extract failed */
    private void o() {
        this.f21547a.writeLock().lock();
        try {
            if (this.f21559m == 0) {
                this.f21549c = 0;
            }
            this.f21547a.writeLock().unlock();
            if (g() == 0) {
                this.f21551e.c();
            }
        } catch (Throwable th2) {
            this.f21547a.writeLock().unlock();
            throw th2;
        }
    }

    public int d(CharSequence charSequence, int i10) {
        return this.f21551e.a(charSequence, i10);
    }

    public int e() {
        return this.f21558l;
    }

    public int f(CharSequence charSequence, int i10) {
        return this.f21551e.b(charSequence, i10);
    }

    public int g() {
        this.f21547a.readLock().lock();
        try {
            return this.f21549c;
        } finally {
            this.f21547a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f21557k;
    }

    public void n() {
        boolean z10 = true;
        if (this.f21559m != 1) {
            z10 = false;
        }
        H2.i.j(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m()) {
            this.f21547a.writeLock().lock();
            try {
                if (this.f21549c != 0) {
                    this.f21549c = 0;
                    this.f21547a.writeLock().unlock();
                    this.f21551e.c();
                }
            } finally {
                this.f21547a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void p(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f21547a.writeLock().lock();
        try {
            this.f21549c = 2;
            arrayList.addAll(this.f21548b);
            this.f21548b.clear();
            this.f21547a.writeLock().unlock();
            this.f21550d.post(new g(arrayList, this.f21549c, th2));
        } catch (Throwable th3) {
            this.f21547a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void q() {
        ArrayList arrayList = new ArrayList();
        this.f21547a.writeLock().lock();
        try {
            this.f21549c = 1;
            arrayList.addAll(this.f21548b);
            this.f21548b.clear();
            this.f21547a.writeLock().unlock();
            this.f21550d.post(new g((Collection<C0335f>) arrayList, this.f21549c));
        } catch (Throwable th2) {
            this.f21547a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11) {
        return t(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i10, int i11, int i12) {
        return u(charSequence, i10, i11, i12, 0);
    }

    public CharSequence u(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        H2.i.j(m(), "Not initialized yet");
        H2.i.e(i10, "start cannot be negative");
        H2.i.e(i11, "end cannot be negative");
        H2.i.e(i12, "maxEmojiCount cannot be negative");
        boolean z11 = false;
        H2.i.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        H2.i.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        H2.i.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                z11 = this.f21554h;
            }
            z10 = z11;
        } else {
            z10 = true;
        }
        return this.f21551e.d(charSequence, i10, i11, i12, z10);
    }

    public void v(C0335f fVar) {
        H2.i.h(fVar, "initCallback cannot be null");
        this.f21547a.writeLock().lock();
        try {
            if (this.f21549c != 1) {
                if (this.f21549c != 2) {
                    this.f21548b.add(fVar);
                }
            }
            this.f21550d.post(new g(fVar, this.f21549c));
        } finally {
            this.f21547a.writeLock().unlock();
        }
    }

    public void w(C0335f fVar) {
        H2.i.h(fVar, "initCallback cannot be null");
        this.f21547a.writeLock().lock();
        try {
            this.f21548b.remove(fVar);
        } finally {
            this.f21547a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (m() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f21551e.e(editorInfo);
        }
    }
}

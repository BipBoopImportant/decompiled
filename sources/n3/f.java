package n3;

import QJ.Q;
import XH.C16807N;
import YH.C16877v;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\nB%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u000fJ!\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006'"}, d2 = {"Ln3/f;", "", "<init>", "()V", "LQJ/Q;", "viewModelScope", "(LQJ/Q;)V", "", "Ljava/lang/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(LQJ/Q;[Ljava/lang/AutoCloseable;)V", "closeable", "LXH/N;", "g", "(Ljava/lang/AutoCloseable;)V", "f", "", "key", "e", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "d", "T", "h", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Ln3/e;", "a", "Ln3/e;", "lock", "", "b", "Ljava/util/Map;", "keyToCloseables", "", "c", "Ljava/util/Set;", "", "Z", "isCleared", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final e f26580a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, AutoCloseable> f26581b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Set<AutoCloseable> f26582c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f26583d;

    public f() {
        this.f26580a = new e();
        this.f26581b = new LinkedHashMap();
        this.f26582c = new LinkedHashSet();
    }

    /* access modifiers changed from: private */
    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(AutoCloseable autoCloseable) {
        C17542s.j(autoCloseable, "closeable");
        if (this.f26583d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.f26580a) {
            this.f26582c.add(autoCloseable);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final void e(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C17542s.j(str, "key");
        C17542s.j(autoCloseable, "closeable");
        if (this.f26583d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.f26580a) {
            autoCloseable2 = (AutoCloseable) this.f26581b.put(str, autoCloseable);
        }
        g(autoCloseable2);
    }

    public final void f() {
        if (!this.f26583d) {
            this.f26583d = true;
            synchronized (this.f26580a) {
                try {
                    for (AutoCloseable a10 : this.f26581b.values()) {
                        g(a10);
                    }
                    for (AutoCloseable a11 : this.f26582c) {
                        g(a11);
                    }
                    this.f26582c.clear();
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final <T extends AutoCloseable> T h(String str) {
        T t10;
        C17542s.j(str, "key");
        synchronized (this.f26580a) {
            t10 = (AutoCloseable) this.f26581b.get(str);
        }
        return t10;
    }

    public f(Q q10) {
        C17542s.j(q10, "viewModelScope");
        this.f26580a = new e();
        this.f26581b = new LinkedHashMap();
        this.f26582c = new LinkedHashSet();
        e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(q10));
    }

    public f(AutoCloseable... autoCloseableArr) {
        C17542s.j(autoCloseableArr, "closeables");
        this.f26580a = new e();
        this.f26581b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f26582c = linkedHashSet;
        C16877v.F(linkedHashSet, autoCloseableArr);
    }

    public f(Q q10, AutoCloseable... autoCloseableArr) {
        C17542s.j(q10, "viewModelScope");
        C17542s.j(autoCloseableArr, "closeables");
        this.f26580a = new e();
        this.f26581b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f26582c = linkedHashSet;
        e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(q10));
        C16877v.F(linkedHashSet, autoCloseableArr);
    }
}

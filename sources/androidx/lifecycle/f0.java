package androidx.lifecycle;

import QJ.Q;
import XH.C16814e;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n3.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\nB%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\u000bB\u001d\b\u0017\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0007\"\u00020\f¢\u0006\u0004\b\u0002\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/f0;", "", "<init>", "()V", "LQJ/Q;", "viewModelScope", "(LQJ/Q;)V", "", "Ljava/lang/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(LQJ/Q;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "LXH/N;", "onCleared", "clear$lifecycle_viewmodel_release", "clear", "", "key", "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Ln3/f;", "impl", "Ln3/f;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class f0 {
    private final f impl;

    public f0() {
        this.impl = new f();
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        C17542s.j(str, "key");
        C17542s.j(autoCloseable, "closeable");
        f fVar = this.impl;
        if (fVar != null) {
            fVar.e(str, autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        f fVar = this.impl;
        if (fVar != null) {
            fVar.f();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        C17542s.j(str, "key");
        f fVar = this.impl;
        if (fVar != null) {
            return fVar.h(str);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        C17542s.j(autoCloseable, "closeable");
        f fVar = this.impl;
        if (fVar != null) {
            fVar.d(autoCloseable);
        }
    }

    public f0(Q q10) {
        C17542s.j(q10, "viewModelScope");
        this.impl = new f(q10);
    }

    @C16814e
    public /* synthetic */ void addCloseable(Closeable closeable) {
        C17542s.j(closeable, "closeable");
        f fVar = this.impl;
        if (fVar != null) {
            fVar.d(closeable);
        }
    }

    public f0(AutoCloseable... autoCloseableArr) {
        C17542s.j(autoCloseableArr, "closeables");
        this.impl = new f((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public f0(Q q10, AutoCloseable... autoCloseableArr) {
        C17542s.j(q10, "viewModelScope");
        C17542s.j(autoCloseableArr, "closeables");
        this.impl = new f(q10, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    @C16814e
    public /* synthetic */ f0(Closeable... closeableArr) {
        C17542s.j(closeableArr, "closeables");
        this.impl = new f((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}

package t5;

import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l5.C8523t;
import l5.C8528y;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lt5/G;", "Ljava/lang/Runnable;", "Ll5/t;", "processor", "Ll5/y;", "token", "", "stopInForeground", "", "reason", "<init>", "(Ll5/t;Ll5/y;ZI)V", "LXH/N;", "run", "()V", "a", "Ll5/t;", "b", "Ll5/y;", "c", "Z", "d", "I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.G  reason: case insensitive filesystem */
public final class C8796G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C8523t f56571a;

    /* renamed from: b  reason: collision with root package name */
    private final C8528y f56572b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f56573c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56574d;

    public C8796G(C8523t tVar, C8528y yVar, boolean z10, int i10) {
        C17542s.j(tVar, "processor");
        C17542s.j(yVar, "token");
        this.f56571a = tVar;
        this.f56572b = yVar;
        this.f56573c = z10;
        this.f56574d = i10;
    }

    public void run() {
        boolean v10 = this.f56573c ? this.f56571a.v(this.f56572b, this.f56574d) : this.f56571a.w(this.f56572b, this.f56574d);
        C7055y e10 = C7055y.e();
        String i10 = C7055y.i("StopWorkRunnable");
        e10.a(i10, "StopWorkRunnable for " + this.f56572b.a().b() + "; Processor.stopWork = " + v10);
    }
}

package gj;

import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16504A;
import XH.C16807N;
import XH.y;
import android.util.SparseArray;
import androidx.lifecycle.C5215s;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import ya.b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgj/i;", "Lya/b$b;", "Lza/a;", "Landroidx/lifecycle/s;", "coroutineScope", "<init>", "(Landroidx/lifecycle/s;)V", "LXH/N;", "release", "()V", "Lya/b$a;", "detections", "a", "(Lya/b$a;)V", "Landroidx/lifecycle/s;", "LTJ/A;", "b", "LTJ/A;", "()LTJ/A;", "c", "(LTJ/A;)V", "onReceiveDetection", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements b.C0937b<za.a> {

    /* renamed from: a  reason: collision with root package name */
    private final C5215s f97550a;

    /* renamed from: b  reason: collision with root package name */
    private C16504A<za.a> f97551b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.component.ScannerProductDetectorProcessor$receiveDetections$1$1", f = "ScannerProductDetectorProcessor.kt", l = {26}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f97552c;

        /* renamed from: d  reason: collision with root package name */
        Object f97553d;

        /* renamed from: e  reason: collision with root package name */
        int f97554e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f97555f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ za.a f97556g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, za.a aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f97555f = iVar;
            this.f97556g = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f97555f, this.f97556g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f97554e;
            if (i10 == 0) {
                y.b(obj);
                C16504A<za.a> b10 = this.f97555f.b();
                if (b10 != null) {
                    za.a aVar = this.f97556g;
                    C17542s.g(aVar);
                    this.f97552c = b10;
                    this.f97553d = aVar;
                    this.f97554e = 1;
                    if (b10.emit(aVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                za.a aVar2 = (za.a) this.f97553d;
                C16504A a10 = (C16504A) this.f97552c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public i(C5215s sVar) {
        C17542s.j(sVar, "coroutineScope");
        this.f97550a = sVar;
    }

    public void a(b.a<za.a> aVar) {
        C17542s.j(aVar, "detections");
        SparseArray<za.a> b10 = aVar.b();
        C17542s.i(b10, "getDetectedItems(...)");
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            b10.keyAt(i10);
            F0 unused = C16314k.d(this.f97550a, (C17168i) null, (T) null, new a(this, b10.valueAt(i10), (C17164e<? super a>) null), 3, (Object) null);
        }
    }

    public final C16504A<za.a> b() {
        return this.f97551b;
    }

    public final void c(C16504A<za.a> a10) {
        this.f97551b = a10;
    }

    public void release() {
    }
}

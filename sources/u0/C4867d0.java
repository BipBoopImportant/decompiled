package U0;

import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\rR0\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LU0/d0;", "LU0/T0;", "LdI/i;", "parentCoroutineContext", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "LXH/N;", "", "task", "<init>", "(LdI/i;LnI/p;)V", "w0", "()V", "o1", "c1", "a", "LnI/p;", "b", "LQJ/Q;", "scope", "LQJ/F0;", "c", "LQJ/F0;", "job", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.d0  reason: case insensitive filesystem */
public final class C4867d0 implements T0 {

    /* renamed from: a  reason: collision with root package name */
    private final p<Q, C17164e<? super C16807N>, Object> f13946a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f13947b;

    /* renamed from: c  reason: collision with root package name */
    private F0 f13948c;

    public C4867d0(C17168i iVar, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        this.f13946a = pVar;
        this.f13947b = S.a(iVar);
    }

    public void c1() {
        F0 f02 = this.f13948c;
        if (f02 != null) {
            f02.i(new C4873f0());
        }
        this.f13948c = null;
    }

    public void o1() {
        F0 f02 = this.f13948c;
        if (f02 != null) {
            f02.i(new C4873f0());
        }
        this.f13948c = null;
    }

    public void w0() {
        F0 f02 = this.f13948c;
        if (f02 != null) {
            J0.e(f02, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.f13948c = C16314k.d(this.f13947b, (C17168i) null, (T) null, this.f13946a, 3, (Object) null);
    }
}

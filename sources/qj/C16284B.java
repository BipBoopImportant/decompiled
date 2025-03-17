package QJ;

import XH.C16807N;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013Jh\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00028\u00008\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010'¨\u0006)"}, d2 = {"LQJ/B;", "R", "", "result", "LQJ/m;", "cancelHandler", "Lkotlin/Function3;", "", "LdI/i;", "LXH/N;", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;LQJ/m;LnI/q;Ljava/lang/Object;Ljava/lang/Throwable;)V", "LQJ/p;", "cont", "cause", "d", "(LQJ/p;Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Object;LQJ/m;LnI/q;Ljava/lang/Object;Ljava/lang/Throwable;)LQJ/B;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "LQJ/m;", "c", "LnI/q;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.B  reason: case insensitive filesystem */
final class C16284B<R> {

    /* renamed from: a  reason: collision with root package name */
    public final R f137548a;

    /* renamed from: b  reason: collision with root package name */
    public final C16318m f137549b;

    /* renamed from: c  reason: collision with root package name */
    public final q<Throwable, R, C17168i, C16807N> f137550c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f137551d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f137552e;

    public C16284B(R r10, C16318m mVar, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar, Object obj, Throwable th2) {
        this.f137548a = r10;
        this.f137549b = mVar;
        this.f137550c = qVar;
        this.f137551d = obj;
        this.f137552e = th2;
    }

    public static /* synthetic */ C16284B b(C16284B b10, R r10, C16318m mVar, q<Throwable, R, C17168i, C16807N> qVar, Object obj, Throwable th2, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            r10 = b10.f137548a;
        }
        if ((i10 & 2) != 0) {
            mVar = b10.f137549b;
        }
        C16318m mVar2 = mVar;
        if ((i10 & 4) != 0) {
            qVar = b10.f137550c;
        }
        q<Throwable, R, C17168i, C16807N> qVar2 = qVar;
        if ((i10 & 8) != 0) {
            obj = b10.f137551d;
        }
        Object obj3 = obj;
        if ((i10 & 16) != 0) {
            th2 = b10.f137552e;
        }
        return b10.a(r10, mVar2, qVar2, obj3, th2);
    }

    public final C16284B<R> a(R r10, C16318m mVar, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar, Object obj, Throwable th2) {
        return new C16284B(r10, mVar, qVar, obj, th2);
    }

    public final boolean c() {
        return this.f137552e != null;
    }

    public final void d(C16324p<?> pVar, Throwable th2) {
        C16318m mVar = this.f137549b;
        if (mVar != null) {
            pVar.l(mVar, th2);
        }
        q<Throwable, R, C17168i, C16807N> qVar = this.f137550c;
        if (qVar != null) {
            pVar.m(qVar, th2, this.f137548a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16284B)) {
            return false;
        }
        C16284B b10 = (C16284B) obj;
        return C17542s.e(this.f137548a, b10.f137548a) && C17542s.e(this.f137549b, b10.f137549b) && C17542s.e(this.f137550c, b10.f137550c) && C17542s.e(this.f137551d, b10.f137551d) && C17542s.e(this.f137552e, b10.f137552e);
    }

    public int hashCode() {
        R r10 = this.f137548a;
        int i10 = 0;
        int hashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
        C16318m mVar = this.f137549b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        q<Throwable, R, C17168i, C16807N> qVar = this.f137550c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f137551d;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.f137552e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f137548a + ", cancelHandler=" + this.f137549b + ", onCancellation=" + this.f137550c + ", idempotentResume=" + this.f137551d + ", cancelCause=" + this.f137552e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16284B(Object obj, C16318m mVar, q qVar, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}

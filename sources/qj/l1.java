package QJ;

import WJ.z;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LQJ/l1;", "U", "T", "LWJ/z;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "LdI/e;", "uCont", "<init>", "(JLdI/e;)V", "LXH/N;", "run", "()V", "", "G0", "()Ljava/lang/String;", "e", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l1<U, T extends U> extends z<T> implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f137647e;

    public l1(long j10, C17164e<? super U> eVar) {
        super(eVar.getContext(), eVar);
        this.f137647e = j10;
    }

    public String G0() {
        return super.G0() + "(timeMillis=" + this.f137647e + ')';
    }

    public void run() {
        Q(m1.a(this.f137647e, C16297b0.d(getContext()), this));
    }
}

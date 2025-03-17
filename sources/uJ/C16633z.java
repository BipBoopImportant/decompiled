package UJ;

import SJ.C16423B;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LUJ/z;", "T", "LTJ/h;", "LSJ/B;", "channel", "<init>", "(LSJ/B;)V", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LSJ/B;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.z  reason: case insensitive filesystem */
public final class C16633z<T> implements C16533h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16423B<T> f139174a;

    public C16633z(C16423B<? super T> b10) {
        this.f139174a = b10;
    }

    public Object emit(T t10, C17164e<? super C16807N> eVar) {
        Object y10 = this.f139174a.y(t10, eVar);
        return y10 == C17187b.f() ? y10 : C16807N.f139792a;
    }
}

package QJ;

import XH.C16807N;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LQJ/m;", "LQJ/T0;", "", "cause", "LXH/N;", "b", "(Ljava/lang/Throwable;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.m  reason: case insensitive filesystem */
public interface C16318m extends T0 {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LQJ/m$a;", "LQJ/m;", "Lkotlin/Function1;", "", "LXH/N;", "handler", "<init>", "(LnI/l;)V", "cause", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "LnI/l;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.m$a */
    public static final class a implements C16318m {

        /* renamed from: a  reason: collision with root package name */
        private final C17642l<Throwable, C16807N> f137648a;

        public a(C17642l<? super Throwable, C16807N> lVar) {
            this.f137648a = lVar;
        }

        public void b(Throwable th2) {
            this.f137648a.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + V.a(this.f137648a) + '@' + V.b(this) + ']';
        }
    }

    void b(Throwable th2);
}

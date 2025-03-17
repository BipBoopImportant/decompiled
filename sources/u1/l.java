package u1;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import r1.f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0010@\u0010X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lu1/l;", "", "<init>", "()V", "LXH/N;", "c", "Lr1/f;", "a", "(Lr1/f;)V", "Lkotlin/Function1;", "LnI/l;", "b", "()LnI/l;", "d", "(LnI/l;)V", "invalidateListener", "Lu1/c;", "Lu1/g;", "Lu1/n;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private C17642l<? super l, C16807N> f29946a;

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(f fVar);

    public C17642l<l, C16807N> b() {
        return this.f29946a;
    }

    public final void c() {
        C17642l<l, C16807N> b10 = b();
        if (b10 != null) {
            b10.invoke(this);
        }
    }

    public void d(C17642l<? super l, C16807N> lVar) {
        this.f29946a = lVar;
    }

    private l() {
    }
}

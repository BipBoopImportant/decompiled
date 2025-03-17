package Uc;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oa.C8619c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LUc/M;", "", "L", "LUc/a0;", "Loa/c;", "map", "Lkotlin/Function2;", "LXH/N;", "setter", "listener", "<init>", "(Loa/c;LnI/p;Ljava/lang/Object;)V", "listenerOrNull", "d", "(Ljava/lang/Object;)V", "b", "()V", "c", "a", "Loa/c;", "LnI/p;", "Ljava/lang/Object;", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class M<L> implements C9288a0 {

    /* renamed from: a  reason: collision with root package name */
    private final C8619c f64174a;

    /* renamed from: b  reason: collision with root package name */
    private final p<C8619c, L, C16807N> f64175b;

    /* renamed from: c  reason: collision with root package name */
    private final L f64176c;

    public M(C8619c cVar, p<? super C8619c, ? super L, C16807N> pVar, L l10) {
        C17542s.j(cVar, "map");
        C17542s.j(pVar, "setter");
        C17542s.j(l10, "listener");
        this.f64174a = cVar;
        this.f64175b = pVar;
        this.f64176c = l10;
    }

    private final void d(L l10) {
        this.f64175b.invoke(this.f64174a, l10);
    }

    public void a() {
        d((Object) null);
    }

    public void b() {
        d(this.f64176c);
    }

    public void c() {
        d((Object) null);
    }
}

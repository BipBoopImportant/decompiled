package Gq;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import uq.C12076b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\t\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0004R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LGq/b;", "LGq/a;", "Luq/b;", "<init>", "()V", "Lkotlin/Function0;", "LXH/N;", "onPaused", "onResumed", "a", "(LnI/a;LnI/a;)V", "c", "b", "LnI/a;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements a, C12076b {

    /* renamed from: a  reason: collision with root package name */
    private C17631a<C16807N> f81189a;

    /* renamed from: b  reason: collision with root package name */
    private C17631a<C16807N> f81190b;

    public void a(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        C17542s.j(aVar, "onPaused");
        C17542s.j(aVar2, "onResumed");
        this.f81189a = aVar;
        this.f81190b = aVar2;
    }

    public void b() {
        C17631a<C16807N> aVar = this.f81190b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void c() {
        C17631a<C16807N> aVar = this.f81189a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}

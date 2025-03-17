package D4;

import D4.C6447v;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00040!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050(8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"LD4/B;", "", "<init>", "()V", "Lkotlin/Function1;", "LD4/g;", "computeNewState", "LXH/N;", "d", "(LnI/l;)V", "previousState", "LD4/w;", "newSource", "newRemote", "c", "(LD4/g;LD4/w;LD4/w;)LD4/g;", "LD4/v;", "sourceRefreshState", "sourceState", "remoteState", "b", "(LD4/v;LD4/v;LD4/v;LD4/v;)LD4/v;", "sourceLoadStates", "remoteLoadStates", "f", "(LD4/w;LD4/w;)V", "LD4/x;", "type", "", "remote", "state", "g", "(LD4/x;ZLD4/v;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "LTJ/B;", "LTJ/B;", "_stateFlow", "LTJ/P;", "LTJ/P;", "e", "()LTJ/P;", "stateFlow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<C17642l<C6433g, C16807N>> f33851a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final C16505B<C6433g> f33852b;

    /* renamed from: c  reason: collision with root package name */
    private final C16519P<C6433g> f33853c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD4/g;", "currState", "a", "(LD4/g;)LD4/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C6433g, C6433g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f33854c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6448w f33855d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6448w f33856e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(B b10, C6448w wVar, C6448w wVar2) {
            super(1);
            this.f33854c = b10;
            this.f33855d = wVar;
            this.f33856e = wVar2;
        }

        /* renamed from: a */
        public final C6433g invoke(C6433g gVar) {
            return this.f33854c.c(gVar, this.f33855d, this.f33856e);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD4/g;", "currState", "a", "(LD4/g;)LD4/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C6433g, C6433g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f33857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6449x f33858d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6447v f33859e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ B f33860f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C6449x xVar, C6447v vVar, B b10) {
            super(1);
            this.f33857c = z10;
            this.f33858d = xVar;
            this.f33859e = vVar;
            this.f33860f = b10;
        }

        /* renamed from: a */
        public final C6433g invoke(C6433g gVar) {
            C6448w wVar;
            C6448w wVar2;
            if (gVar == null || (wVar = gVar.e()) == null) {
                wVar = C6448w.f34460d.a();
            }
            if (gVar == null || (wVar2 = gVar.b()) == null) {
                wVar2 = C6448w.f34460d.a();
            }
            if (this.f33857c) {
                wVar2 = wVar2.g(this.f33858d, this.f33859e);
            } else {
                wVar = wVar.g(this.f33858d, this.f33859e);
            }
            return this.f33860f.c(gVar, wVar, wVar2);
        }
    }

    public B() {
        C16505B<C6433g> a10 = C16521S.a(null);
        this.f33852b = a10;
        this.f33853c = C16534i.c(a10);
    }

    private final C6447v b(C6447v vVar, C6447v vVar2, C6447v vVar3, C6447v vVar4) {
        return vVar4 == null ? vVar3 : (!(vVar instanceof C6447v.b) || ((vVar2 instanceof C6447v.c) && (vVar4 instanceof C6447v.c)) || (vVar4 instanceof C6447v.a)) ? vVar4 : vVar;
    }

    /* access modifiers changed from: private */
    public final C6433g c(C6433g gVar, C6448w wVar, C6448w wVar2) {
        C6447v vVar;
        C6447v vVar2;
        C6447v vVar3;
        if (gVar == null || (vVar = gVar.d()) == null) {
            vVar = C6447v.c.f34457b.b();
        }
        C6447v vVar4 = null;
        C6447v b10 = b(vVar, wVar.f(), wVar.f(), wVar2 != null ? wVar2.f() : null);
        if (gVar == null || (vVar2 = gVar.c()) == null) {
            vVar2 = C6447v.c.f34457b.b();
        }
        C6447v b11 = b(vVar2, wVar.f(), wVar.e(), wVar2 != null ? wVar2.e() : null);
        if (gVar == null || (vVar3 = gVar.a()) == null) {
            vVar3 = C6447v.c.f34457b.b();
        }
        C6447v f10 = wVar.f();
        C6447v d10 = wVar.d();
        if (wVar2 != null) {
            vVar4 = wVar2.d();
        }
        return new C6433g(b10, b11, b(vVar3, f10, d10, vVar4), wVar, wVar2);
    }

    private final void d(C17642l<? super C6433g, C6433g> lVar) {
        C6433g value;
        C6433g invoke;
        C16505B<C6433g> b10 = this.f33852b;
        do {
            value = b10.getValue();
            C6433g gVar = value;
            invoke = lVar.invoke(gVar);
            if (C17542s.e(gVar, invoke)) {
                return;
            }
        } while (!b10.e(value, invoke));
        if (invoke != null) {
            for (C17642l invoke2 : this.f33851a) {
                invoke2.invoke(invoke);
            }
        }
    }

    public final C16519P<C6433g> e() {
        return this.f33853c;
    }

    public final void f(C6448w wVar, C6448w wVar2) {
        C17542s.j(wVar, "sourceLoadStates");
        d(new a(this, wVar, wVar2));
    }

    public final void g(C6449x xVar, boolean z10, C6447v vVar) {
        C17542s.j(xVar, "type");
        C17542s.j(vVar, "state");
        d(new b(z10, xVar, vVar, this));
    }
}

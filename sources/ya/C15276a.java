package yA;

import IC.C13023e;
import KJ.C15987c;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.t;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import dI.C17164e;
import ip.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import sA.C15033a;
import vA.C15124a;
import vA.C15126c;
import vA.C15127d;
import wA.C15151a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$¨\u0006&"}, d2 = {"LyA/a;", "Landroidx/lifecycle/f0;", "LwA/a;", "repository", "LsA/a;", "themeAnalytics", "<init>", "(LwA/a;LsA/a;)V", "LXH/N;", "C", "()V", "LvA/a$b;", "event", "D", "(LvA/a$b;)V", "E", "LvA/d;", "uiMode", "", "navigateBack", "LvA/c;", "G", "(LvA/d;Z)LvA/c;", "LvA/a;", "F", "(LvA/a;)V", "m", "LwA/a;", "n", "LsA/a;", "LTJ/B;", "o", "LTJ/B;", "LTJ/P;", "p", "LTJ/P;", "()LTJ/P;", "uiState", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yA.a  reason: case insensitive filesystem */
public final class C15276a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C15151a f132133m;

    /* renamed from: n  reason: collision with root package name */
    private final C15033a f132134n;

    /* renamed from: o  reason: collision with root package name */
    private final C16505B<Boolean> f132135o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<C15126c> f132136p;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yA.a$a  reason: collision with other inner class name */
    /* synthetic */ class C3267a extends C17525a implements q<C15127d, Boolean, C17164e<? super C15126c>, Object> {
        C3267a(Object obj) {
            super(3, obj, C15276a.class, "toUiState", "toUiState(Lcom/ingka/ikea/settings/impl/theme/model/UiMode;Z)Lcom/ingka/ikea/settings/impl/theme/model/Theme$UiState;", 4);
        }

        public final Object a(C15127d dVar, boolean z10, C17164e<? super C15126c> eVar) {
            return ((C15276a) this.f144363a).G(dVar, z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C15127d) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }
    }

    public C15276a(C15151a aVar, C15033a aVar2) {
        C17542s.j(aVar, "repository");
        C17542s.j(aVar2, "themeAnalytics");
        this.f132133m = aVar;
        this.f132134n = aVar2;
        C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
        this.f132135o = a10;
        this.f132136p = C16534i.c0(C16534i.n(aVar.b(), a10, new C3267a(this)), g0.a(this), f.a(), new C15126c(C15277b.a(aVar.c()), (C15987c) null, (C13023e) null, false, 14, (DefaultConstructorMarker) null));
    }

    private final void C() {
        Boolean value;
        C16505B<Boolean> b10 = this.f132135o;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
    }

    private final void D(C15124a.b bVar) {
        this.f132134n.a(bVar.a());
        this.f132133m.a(bVar.a().v());
    }

    private final void E() {
        Boolean value;
        C16505B<Boolean> b10 = this.f132135o;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.FALSE));
    }

    /* access modifiers changed from: private */
    public final C15126c G(C15127d dVar, boolean z10) {
        return new C15126c(C15277b.a(dVar), (C15987c) null, (C13023e) null, z10, 6, (DefaultConstructorMarker) null);
    }

    public final void F(C15124a aVar) {
        C17542s.j(aVar, "event");
        if (aVar instanceof C15124a.C3256a) {
            C();
        } else if (aVar instanceof C15124a.b) {
            D((C15124a.b) aVar);
        } else if (aVar instanceof C15124a.c) {
            E();
        } else {
            throw new t();
        }
    }

    public final C16519P<C15126c> m() {
        return this.f132136p;
    }
}

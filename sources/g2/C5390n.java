package g2;

import E1.X;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import androidx.compose.ui.platform.C5139w0;
import c2.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import l2.f;
import nI.C17642l;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0007R\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J/\u0010\u0011\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002XD¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lg2/n;", "Lg2/k;", "<init>", "()V", "Lg2/h;", "h", "()Lg2/h;", "Lg2/n$b;", "i", "()Lg2/n$b;", "LXH/N;", "f", "Landroidx/compose/ui/d;", "ref", "Lkotlin/Function1;", "Lg2/g;", "constrainBlock", "g", "(Landroidx/compose/ui/d;Lg2/h;LnI/l;)Landroidx/compose/ui/d;", "", "Z", "isAnimateChanges", "()Z", "setAnimateChanges", "(Z)V", "isAnimateChanges$annotations", "Lg2/n$b;", "referencesObject", "", "I", "ChildrenStartIndex", "childId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "childrenRefs", "a", "b", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.n  reason: case insensitive filesystem */
public final class C5390n extends C5387k {

    /* renamed from: f  reason: collision with root package name */
    private boolean f23735f;

    /* renamed from: g  reason: collision with root package name */
    private b f23736g;

    /* renamed from: h  reason: collision with root package name */
    private final int f23737h;

    /* renamed from: i  reason: collision with root package name */
    private int f23738i = this.f23737h;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<C5384h> f23739j = new ArrayList<>();

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg2/n$a;", "LE1/X;", "Landroidx/compose/ui/platform/w0;", "Lg2/h;", "ref", "Lkotlin/Function1;", "Lg2/g;", "LXH/N;", "constrainBlock", "<init>", "(Lg2/h;LnI/l;)V", "Lc2/d;", "", "parentData", "Lg2/m;", "a", "(Lc2/d;Ljava/lang/Object;)Lg2/m;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lg2/h;", "f", "LnI/l;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.n$a */
    private static final class a extends C5139w0 implements X {

        /* renamed from: e  reason: collision with root package name */
        private final C5384h f23740e;

        /* renamed from: f  reason: collision with root package name */
        private final C17642l<C5383g, C16807N> f23741f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g2.n$a$a  reason: collision with other inner class name */
        public static final class C0384a extends C17544u implements C17642l<C5137v0, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5384h f23742c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l f23743d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0384a(C5384h hVar, C17642l lVar) {
                super(1);
                this.f23742c = hVar;
                this.f23743d = lVar;
            }

            public final void a(C5137v0 v0Var) {
                v0Var.b("constrainAs");
                v0Var.a().c("ref", this.f23742c);
                v0Var.a().c("constrainBlock", this.f23743d);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5137v0) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5384h hVar, C17642l<? super C5383g, C16807N> lVar) {
            super(C5133t0.b() ? new C0384a(hVar, lVar) : C5133t0.a());
            this.f23740e = hVar;
            this.f23741f = lVar;
        }

        /* renamed from: a */
        public C5389m K(d dVar, Object obj) {
            return new C5389m(this.f23740e, this.f23741f);
        }

        public boolean equals(Object obj) {
            C17642l<C5383g, C16807N> lVar = this.f23741f;
            C17642l<C5383g, C16807N> lVar2 = null;
            a aVar = obj instanceof a ? (a) obj : null;
            if (aVar != null) {
                lVar2 = aVar.f23741f;
            }
            return lVar == lVar2;
        }

        public int hashCode() {
            return this.f23741f.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lg2/n$b;", "", "<init>", "(Lg2/n;)V", "Lg2/h;", "a", "()Lg2/h;", "b", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.n$b */
    public final class b {
        public b() {
        }

        public final C5384h a() {
            return C5390n.this.h();
        }

        public final C5384h b() {
            return C5390n.this.h();
        }
    }

    public C5390n() {
        super((f) null);
    }

    public void f() {
        super.f();
        this.f23738i = this.f23737h;
    }

    public final androidx.compose.ui.d g(androidx.compose.ui.d dVar, C5384h hVar, C17642l<? super C5383g, C16807N> lVar) {
        if (this.f23735f) {
            lVar.invoke(new C5383g(hVar.a(), b(hVar)));
        }
        return dVar.s(new a(hVar, lVar));
    }

    public final C5384h h() {
        ArrayList<C5384h> arrayList = this.f23739j;
        int i10 = this.f23738i;
        this.f23738i = i10 + 1;
        C5384h hVar = (C5384h) C16877v.z0(arrayList, i10);
        if (hVar != null) {
            return hVar;
        }
        C5384h hVar2 = new C5384h(Integer.valueOf(this.f23738i));
        this.f23739j.add(hVar2);
        return hVar2;
    }

    public final b i() {
        b bVar = this.f23736g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f23736g = bVar2;
        return bVar2;
    }
}

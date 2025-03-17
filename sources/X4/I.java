package x4;

import GJ.C15768k;
import XH.C16807N;
import YH.C16877v;
import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import x4.v;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u000b,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R$\u0010/\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f8\u0006@BX\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Lx4/I;", "Lx4/v;", "D", "", "<init>", "()V", "Lx4/K;", "state", "LXH/N;", "f", "(Lx4/K;)V", "a", "()Lx4/v;", "", "Lx4/l;", "entries", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "e", "(Ljava/util/List;Lx4/C;Lx4/I$a;)V", "backStackEntry", "g", "(Lx4/l;)V", "destination", "Landroid/os/Bundle;", "args", "d", "(Lx4/v;Landroid/os/Bundle;Lx4/C;Lx4/I$a;)Lx4/v;", "popUpTo", "", "savedState", "j", "(Lx4/l;Z)V", "k", "()Z", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "Lx4/K;", "_state", "<set-?>", "b", "Z", "c", "isAttached", "()Lx4/K;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class I<D extends v> {

    /* renamed from: a  reason: collision with root package name */
    private K f57455a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f57456b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lx4/I$a;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx4/I$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx4/v;", "D", "Lx4/l;", "backStackEntry", "a", "(Lx4/l;)Lx4/l;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<C8948l, C8948l> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ I<D> f57457c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C f57458d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f57459e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(I<D> i10, C c10, a aVar) {
            super(1);
            this.f57457c = i10;
            this.f57458d = c10;
            this.f57459e = aVar;
        }

        /* renamed from: a */
        public final C8948l invoke(C8948l lVar) {
            C17542s.j(lVar, "backStackEntry");
            v e10 = lVar.e();
            if (e10 == null) {
                e10 = null;
            }
            if (e10 == null) {
                return null;
            }
            v d10 = this.f57457c.d(e10, lVar.c(), this.f57458d, this.f57459e);
            if (d10 == null) {
                return null;
            }
            return C17542s.e(d10, e10) ? lVar : this.f57457c.b().a(d10, d10.m(lVar.c()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx4/v;", "D", "Lx4/D;", "LXH/N;", "a", "(Lx4/D;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<D, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f57460c = new d();

        d() {
            super(1);
        }

        public final void a(D d10) {
            C17542s.j(d10, "$this$navOptions");
            d10.e(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D) obj);
            return C16807N.f139792a;
        }
    }

    public abstract D a();

    /* access modifiers changed from: protected */
    public final K b() {
        K k10 = this.f57455a;
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean c() {
        return this.f57456b;
    }

    public v d(D d10, Bundle bundle, C c10, a aVar) {
        C17542s.j(d10, "destination");
        return d10;
    }

    public void e(List<C8948l> list, C c10, a aVar) {
        C17542s.j(list, "entries");
        for (C8948l k10 : C15768k.J(C15768k.S(C16877v.h0(list), new c(this, c10, aVar)))) {
            b().k(k10);
        }
    }

    public void f(K k10) {
        C17542s.j(k10, "state");
        this.f57455a = k10;
        this.f57456b = true;
    }

    public void g(C8948l lVar) {
        C17542s.j(lVar, "backStackEntry");
        v e10 = lVar.e();
        if (e10 == null) {
            e10 = null;
        }
        if (e10 != null) {
            d(e10, (Bundle) null, E.a(d.f57460c), (a) null);
            b().f(lVar);
        }
    }

    public void h(Bundle bundle) {
        C17542s.j(bundle, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(C8948l lVar, boolean z10) {
        C17542s.j(lVar, "popUpTo");
        List value = b().b().getValue();
        if (value.contains(lVar)) {
            ListIterator listIterator = value.listIterator(value.size());
            C8948l lVar2 = null;
            while (k()) {
                lVar2 = (C8948l) listIterator.previous();
                if (C17542s.e(lVar2, lVar)) {
                    break;
                }
            }
            if (lVar2 != null) {
                b().h(lVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + lVar + " which does not exist in back stack " + value).toString());
    }

    public boolean k() {
        return true;
    }
}

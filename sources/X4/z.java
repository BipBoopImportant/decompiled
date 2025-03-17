package x4;

import YH.C16877v;
import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import nI.C17642l;
import x4.I;
import x4.v;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lx4/z;", "Lx4/I;", "Lx4/x;", "Lx4/J;", "navigatorProvider", "<init>", "(Lx4/J;)V", "Lx4/l;", "entry", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "LXH/N;", "m", "(Lx4/l;Lx4/C;Lx4/I$a;)V", "l", "()Lx4/x;", "", "entries", "e", "(Ljava/util/List;Lx4/C;Lx4/I$a;)V", "c", "Lx4/J;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("navigation")
public class z extends I<x> {

    /* renamed from: c  reason: collision with root package name */
    private final J f57719c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<Bundle> f57720c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O<Bundle> o10) {
            super(1);
            this.f57720c = o10;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C17542s.j(str, "key");
            T t10 = this.f57720c.f144348a;
            boolean z10 = true;
            if (t10 != null && ((Bundle) t10).containsKey(str)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public z(J j10) {
        C17542s.j(j10, "navigatorProvider");
        this.f57719c = j10;
    }

    private final void m(C8948l lVar, C c10, I.a aVar) {
        v e10 = lVar.e();
        C17542s.h(e10, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        x xVar = (x) e10;
        O o10 = new O();
        o10.f144348a = lVar.c();
        int a02 = xVar.a0();
        String b02 = xVar.b0();
        if (a02 == 0 && b02 == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + xVar.t()).toString());
        }
        v V10 = b02 != null ? xVar.V(b02, false) : xVar.Y().e(a02);
        if (V10 != null) {
            if (b02 != null) {
                if (!C17542s.e(b02, V10.C())) {
                    v.b I10 = V10.I(b02);
                    Bundle j10 = I10 != null ? I10.j() : null;
                    if (j10 != null && !j10.isEmpty()) {
                        T bundle = new Bundle();
                        bundle.putAll(j10);
                        T t10 = o10.f144348a;
                        if (((Bundle) t10) != null) {
                            bundle.putAll((Bundle) t10);
                        }
                        o10.f144348a = bundle;
                    }
                }
                if (!V10.s().isEmpty()) {
                    List<String> a10 = C8947k.a(V10.s(), new a(o10));
                    if (!a10.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + V10 + ". Missing required arguments [" + a10 + ']').toString());
                    }
                }
            }
            this.f57719c.e(V10.A()).e(C16877v.e(b().a(V10, V10.m((Bundle) o10.f144348a))), c10, aVar);
            return;
        }
        String Z10 = xVar.Z();
        throw new IllegalArgumentException("navigation destination " + Z10 + " is not a direct child of this NavGraph");
    }

    public void e(List<C8948l> list, C c10, I.a aVar) {
        C17542s.j(list, "entries");
        for (C8948l m10 : list) {
            m(m10, c10, aVar);
        }
    }

    /* renamed from: l */
    public x a() {
        return new x(this);
    }
}

package com.ingka.ikea.navigation.interop;

import B4.a;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import sw.d;
import x4.C8935A;
import x4.J;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/navigation/interop/IkeaComposableNavHostFragment;", "Landroidx/navigation/fragment/NavHostFragment;", "<init>", "()V", "Lx4/A;", "navHostController", "LXH/N;", "s0", "(Lx4/A;)V", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class IkeaComposableNavHostFragment extends NavHostFragment {
    /* access modifiers changed from: protected */
    public void s0(C8935A a10) {
        C17542s.j(a10, "navHostController");
        super.s0(a10);
        J O10 = a10.O();
        O10.c(new a(O10));
        O10.c(new d(O10));
        O10.c(new sw.a(O10));
    }
}

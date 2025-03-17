package cF;

import androidx.fragment.app.C5187o;
import androidx.lifecycle.U;
import androidx.navigation.fragment.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lx4/o;", "", "key", "value", "LXH/N;", "b", "(Lx4/o;Ljava/lang/String;Ljava/lang/Object;)V", "Landroidx/fragment/app/o;", "result", "a", "(Landroidx/fragment/app/o;Ljava/lang/Object;Ljava/lang/String;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cF.i  reason: case insensitive filesystem */
public final class C14047i {
    public static final <T> void a(C5187o oVar, T t10, String str) {
        C17542s.j(oVar, "<this>");
        C17542s.j(str, "key");
        b(a.a(oVar), str, t10);
    }

    public static final <T> void b(C8951o oVar, String str, T t10) {
        U h10;
        C17542s.j(oVar, "<this>");
        C17542s.j(str, "key");
        C8948l P10 = oVar.P();
        if (P10 != null && (h10 = P10.h()) != null) {
            h10.m(str, t10);
        }
    }
}

package jC;

import XH.t;
import YC.C13858c;
import android.content.Context;
import jC.C14615b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LjC/b;", "Landroid/content/Context;", "context", "LjC/b$d;", "b", "(LjC/b;Landroid/content/Context;)LjC/b$d;", "LjC/b$a;", "a", "(LjC/b$a;)LjC/b;", "default", "systemui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jC.c  reason: case insensitive filesystem */
public final class C14616c {
    public static final C14615b a(C14615b.a aVar) {
        C17542s.j(aVar, "<this>");
        return C14615b.e.f127859b;
    }

    public static final C14615b.d b(C14615b bVar, Context context) {
        C17542s.j(bVar, "<this>");
        C17542s.j(context, "context");
        if (bVar instanceof C14615b.d) {
            return (C14615b.d) bVar;
        }
        if (bVar instanceof C14615b.e) {
            return C13858c.b(context) ? C14615b.c.f127858b : C14615b.C3152b.f127857b;
        }
        throw new t();
    }
}

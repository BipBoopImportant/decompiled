package nJ;

import YH.C16877v;
import cJ.C17069f;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C17542s;

/* renamed from: nJ.m  reason: case insensitive filesystem */
public final class C17658m {
    public static final Set<C17069f> a(Iterable<? extends C17656k> iterable) {
        C17542s.j(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (C17656k f10 : iterable) {
            Iterable f11 = f10.f();
            if (f11 == null) {
                return null;
            }
            C16877v.E(hashSet, f11);
        }
        return hashSet;
    }
}

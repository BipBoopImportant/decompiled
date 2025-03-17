package jK;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import nI.C17642l;
import nI.p;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"T", "Lkotlin/Function1;", "LuI/d;", "Lkotlinx/serialization/KSerializer;", "factory", "LjK/U0;", "a", "(LnI/l;)LjK/U0;", "Lkotlin/Function2;", "", "", "LuI/q;", "LjK/B0;", "b", "(LnI/p;)LjK/B0;", "", "Z", "useClassValue", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.o  reason: case insensitive filesystem */
public final class C17469o {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f144143a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f144143a = z10;
    }

    public static final <T> U0<T> a(C17642l<? super C18055d<?>, ? extends KSerializer<T>> lVar) {
        C17542s.j(lVar, "factory");
        return f144143a ? new C17478t(lVar) : new C17488y(lVar);
    }

    public static final <T> B0<T> b(p<? super C18055d<Object>, ? super List<? extends C18068q>, ? extends KSerializer<T>> pVar) {
        C17542s.j(pVar, "factory");
        return f144143a ? new C17480u(pVar) : new C17490z(pVar);
    }
}

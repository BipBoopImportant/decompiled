package wJ;

import AI.C15426g;
import AI.C15429j;
import DI.C15561h;
import DI.n0;
import YH.C16877v;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.y0;
import vJ.g;

/* renamed from: wJ.j  reason: case insensitive filesystem */
public final class C18228j implements y0 {

    /* renamed from: a  reason: collision with root package name */
    private final C18229k f149167a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f149168b;

    /* renamed from: c  reason: collision with root package name */
    private final String f149169c;

    public C18228j(C18229k kVar, String... strArr) {
        C17542s.j(kVar, "kind");
        C17542s.j(strArr, "formatParams");
        this.f149167a = kVar;
        this.f149168b = strArr;
        String b10 = C18220b.ERROR_TYPE.b();
        String b11 = kVar.b();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b11, Arrays.copyOf(copyOf, copyOf.length));
        C17542s.i(format, "format(...)");
        String format2 = String.format(b10, Arrays.copyOf(new Object[]{format}, 1));
        C17542s.i(format2, "format(...)");
        this.f149169c = format2;
    }

    public Collection<C18096U> a() {
        return C16877v.n();
    }

    public y0 b(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this;
    }

    public C15561h e() {
        return C18230l.f149170a.h();
    }

    public boolean f() {
        return false;
    }

    public final C18229k g() {
        return this.f149167a;
    }

    public List<n0> getParameters() {
        return C16877v.n();
    }

    public final String h(int i10) {
        return this.f149168b[i10];
    }

    public C15429j p() {
        return C15426g.f132982h.a();
    }

    public String toString() {
        return this.f149169c;
    }
}

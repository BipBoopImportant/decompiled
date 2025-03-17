package wJ;

import YH.C16877v;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import nJ.C17656k;
import uJ.C18113f0;
import uJ.E0;
import uJ.u0;
import uJ.y0;
import vJ.g;

/* renamed from: wJ.i  reason: case insensitive filesystem */
public final class C18227i extends C18113f0 {

    /* renamed from: b  reason: collision with root package name */
    private final y0 f149160b;

    /* renamed from: c  reason: collision with root package name */
    private final C17656k f149161c;

    /* renamed from: d  reason: collision with root package name */
    private final C18229k f149162d;

    /* renamed from: e  reason: collision with root package name */
    private final List<E0> f149163e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f149164f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f149165g;

    /* renamed from: h  reason: collision with root package name */
    private final String f149166h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18227i(y0 y0Var, C17656k kVar, C18229k kVar2, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, kVar, kVar2, (i10 & 8) != 0 ? C16877v.n() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    public List<E0> L0() {
        return this.f149163e;
    }

    public u0 M0() {
        return u0.f147932b.k();
    }

    public y0 N0() {
        return this.f149160b;
    }

    public boolean O0() {
        return this.f149164f;
    }

    /* renamed from: U0 */
    public C18113f0 R0(boolean z10) {
        y0 N02 = N0();
        C17656k q10 = q();
        C18229k kVar = this.f149162d;
        List<E0> L02 = L0();
        String[] strArr = this.f149165g;
        return new C18227i(N02, q10, kVar, L02, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return this;
    }

    public final String W0() {
        return this.f149166h;
    }

    public final C18229k X0() {
        return this.f149162d;
    }

    /* renamed from: Y0 */
    public C18227i S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this;
    }

    public final C18227i Z0(List<? extends E0> list) {
        C17542s.j(list, "newArguments");
        y0 N02 = N0();
        C17656k q10 = q();
        C18229k kVar = this.f149162d;
        boolean O02 = O0();
        String[] strArr = this.f149165g;
        return new C18227i(N02, q10, kVar, list, O02, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public C17656k q() {
        return this.f149161c;
    }

    public C18227i(y0 y0Var, C17656k kVar, C18229k kVar2, List<? extends E0> list, boolean z10, String... strArr) {
        C17542s.j(y0Var, "constructor");
        C17542s.j(kVar, "memberScope");
        C17542s.j(kVar2, "kind");
        C17542s.j(list, "arguments");
        C17542s.j(strArr, "formatParams");
        this.f149160b = y0Var;
        this.f149161c = kVar;
        this.f149162d = kVar2;
        this.f149163e = list;
        this.f149164f = z10;
        this.f149165g = strArr;
        V v10 = V.f144353a;
        String b10 = kVar2.b();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b10, Arrays.copyOf(copyOf, copyOf.length));
        C17542s.i(format, "format(...)");
        this.f149166h = format;
    }
}

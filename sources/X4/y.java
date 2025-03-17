package x4;

import fK.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b¢\u0006\u0004\b\b\u0010\u000fB?\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0010\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b¢\u0006\u0004\b\b\u0010\u0011J%\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\u0013*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u001c\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lx4/y;", "Lx4/w;", "Lx4/x;", "Lx4/J;", "provider", "", "startDestination", "route", "<init>", "(Lx4/J;Ljava/lang/String;Ljava/lang/String;)V", "LuI/d;", "", "LuI/q;", "Lx4/F;", "typeMap", "(Lx4/J;LuI/d;LuI/d;Ljava/util/Map;)V", "", "(Lx4/J;Ljava/lang/Object;LuI/d;Ljava/util/Map;)V", "Lx4/v;", "D", "navDestination", "LXH/N;", "k", "(Lx4/w;)V", "j", "()Lx4/x;", "i", "Lx4/J;", "l", "()Lx4/J;", "", "I", "startDestinationId", "Ljava/lang/String;", "startDestinationRoute", "LuI/d;", "startDestinationClass", "m", "Ljava/lang/Object;", "startDestinationObject", "", "n", "Ljava/util/List;", "destinations", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class y extends w<x> {

    /* renamed from: i  reason: collision with root package name */
    private final J f57712i;

    /* renamed from: j  reason: collision with root package name */
    private int f57713j;

    /* renamed from: k  reason: collision with root package name */
    private String f57714k;

    /* renamed from: l  reason: collision with root package name */
    private C18055d<?> f57715l;

    /* renamed from: m  reason: collision with root package name */
    private Object f57716m;

    /* renamed from: n  reason: collision with root package name */
    private final List<v> f57717n = new ArrayList();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/v;", "it", "", "a", "(Lx4/v;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<v, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f57718c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(v vVar) {
            C17542s.j(vVar, "it");
            String C10 = vVar.C();
            C17542s.g(C10);
            return C10;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(J j10, String str, String str2) {
        super(j10.d(z.class), str2);
        C17542s.j(j10, "provider");
        C17542s.j(str, "startDestination");
        this.f57712i = j10;
        this.f57714k = str;
    }

    /* renamed from: j */
    public x c() {
        x xVar = (x) super.c();
        xVar.S(this.f57717n);
        int i10 = this.f57713j;
        if (i10 != 0 || this.f57714k != null || this.f57715l != null || this.f57716m != null) {
            String str = this.f57714k;
            if (str != null) {
                C17542s.g(str);
                xVar.i0(str);
            } else {
                C18055d<?> dVar = this.f57715l;
                if (dVar != null) {
                    C17542s.g(dVar);
                    xVar.j0(z.e(dVar), a.f57718c);
                } else {
                    Object obj = this.f57716m;
                    if (obj != null) {
                        C17542s.g(obj);
                        xVar.h0(obj);
                    } else {
                        xVar.g0(i10);
                    }
                }
            }
            return xVar;
        } else if (h() != null) {
            throw new IllegalStateException("You must set a start destination route");
        } else {
            throw new IllegalStateException("You must set a start destination id");
        }
    }

    public final <D extends v> void k(w<? extends D> wVar) {
        C17542s.j(wVar, "navDestination");
        this.f57717n.add(wVar.c());
    }

    public final J l() {
        return this.f57712i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(J j10, C18055d<?> dVar, C18055d<?> dVar2, Map<C18068q, F<?>> map) {
        super(j10.d(z.class), dVar2, map);
        C17542s.j(j10, "provider");
        C17542s.j(dVar, "startDestination");
        C17542s.j(map, "typeMap");
        this.f57712i = j10;
        this.f57715l = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(J j10, Object obj, C18055d<?> dVar, Map<C18068q, F<?>> map) {
        super(j10.d(z.class), dVar, map);
        C17542s.j(j10, "provider");
        C17542s.j(obj, "startDestination");
        C17542s.j(map, "typeMap");
        this.f57712i = j10;
        this.f57716m = obj;
    }
}

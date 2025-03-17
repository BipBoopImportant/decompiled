package x4;

import C4.j;
import GJ.C15765h;
import GJ.C15768k;
import HJ.C15854t;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.z;
import j0.c0;
import j0.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import nI.C17642l;
import oI.C17693a;
import x4.v;
import y4.C8977a;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u0000 ^2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001_B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J9\u0010)\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010%\u001a\u00020$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0010H\u0007¢\u0006\u0004\b.\u0010/J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000100H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u00020$¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000e¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u000b\"\b\b\u0000\u0010&*\u0002092\u0006\u00106\u001a\u00028\u0000¢\u0006\u0004\b:\u0010;J7\u0010@\u001a\u00020\u000b\"\u0004\b\u0000\u0010&2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0>H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020$H\u0016¢\u0006\u0004\bG\u0010HR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010I8G¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0016\u00103\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR.\u0010V\u001a\u0004\u0018\u00010\u000e2\b\u00106\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u000e¢\u0006\u0012\n\u0004\bS\u0010Q\u001a\u0004\bT\u0010C\"\u0004\bU\u00108R$\u0010Y\u001a\u00020$2\u0006\u00103\u001a\u00020$8G@BX\u000e¢\u0006\f\u001a\u0004\bW\u0010H\"\u0004\bX\u00105R\u0014\u0010[\u001a\u00020\u000e8WX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010CR\u0011\u0010]\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\\\u0010C¨\u0006`"}, d2 = {"Lx4/x;", "Lx4/v;", "", "Lx4/I;", "navGraphNavigator", "<init>", "(Lx4/I;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "LXH/N;", "J", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "route", "", "searchChildren", "searchParent", "lastVisited", "Lx4/v$b;", "d0", "(Ljava/lang/String;ZZLx4/v;)Lx4/v$b;", "Lx4/u;", "navDeepLinkRequest", "c0", "(Lx4/u;ZZLx4/v;)Lx4/v$b;", "H", "(Lx4/u;)Lx4/v$b;", "node", "R", "(Lx4/v;)V", "", "nodes", "S", "(Ljava/util/Collection;)V", "", "resId", "T", "(I)Lx4/v;", "matchingDest", "W", "(ILx4/v;ZLx4/v;)Lx4/v;", "U", "(Ljava/lang/String;)Lx4/v;", "searchParents", "V", "(Ljava/lang/String;Z)Lx4/v;", "", "iterator", "()Ljava/util/Iterator;", "startDestId", "g0", "(I)V", "startDestRoute", "i0", "(Ljava/lang/String;)V", "", "h0", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "j0", "(Lkotlinx/serialization/KSerializer;LnI/l;)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lj0/c0;", "m", "Lj0/c0;", "Y", "()Lj0/c0;", "n", "I", "o", "Ljava/lang/String;", "startDestIdName", "p", "b0", "l0", "startDestinationRoute", "a0", "k0", "startDestinationId", "t", "displayName", "Z", "startDestDisplayName", "q", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class x extends v implements Iterable<v>, C17693a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f57702q = new a((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    private final c0<v> f57703m = new c0<>(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private int f57704n;

    /* renamed from: o  reason: collision with root package name */
    private String f57705o;

    /* renamed from: p  reason: collision with root package name */
    private String f57706p;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx4/x$a;", "", "<init>", "()V", "Lx4/x;", "Lx4/v;", "b", "(Lx4/x;)Lx4/v;", "LGJ/h;", "a", "(Lx4/x;)LGJ/h;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/v;", "it", "a", "(Lx4/v;)Lx4/v;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x4.x$a$a  reason: collision with other inner class name */
        static final class C0929a extends C17544u implements C17642l<v, v> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0929a f57707c = new C0929a();

            C0929a() {
                super(1);
            }

            /* renamed from: a */
            public final v invoke(v vVar) {
                C17542s.j(vVar, "it");
                if (!(vVar instanceof x)) {
                    return null;
                }
                x xVar = (x) vVar;
                return xVar.T(xVar.a0());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15765h<v> a(x xVar) {
            C17542s.j(xVar, "<this>");
            return C15768k.q(xVar, C0929a.f57707c);
        }

        public final v b(x xVar) {
            C17542s.j(xVar, "<this>");
            return (v) C15768k.R(a(xVar));
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"x4/x$b", "", "Lx4/v;", "", "hasNext", "()Z", "c", "()Lx4/v;", "LXH/N;", "remove", "()V", "", "a", "I", "index", "b", "Z", "wentToNext", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Iterator<v>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f57708a = -1;

        /* renamed from: b  reason: collision with root package name */
        private boolean f57709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f57710c;

        b(x xVar) {
            this.f57710c = xVar;
        }

        /* renamed from: c */
        public v next() {
            if (hasNext()) {
                this.f57709b = true;
                c0<v> Y10 = this.f57710c.Y();
                int i10 = this.f57708a + 1;
                this.f57708a = i10;
                return Y10.p(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f57708a + 1 < this.f57710c.Y().o();
        }

        public void remove() {
            if (this.f57709b) {
                c0<v> Y10 = this.f57710c.Y();
                Y10.p(this.f57708a).O((x) null);
                Y10.m(this.f57708a);
                this.f57708a--;
                this.f57709b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lx4/v;", "startDestination", "", "a", "(Lx4/v;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<v, String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f57711c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(T t10) {
            super(1);
            this.f57711c = t10;
        }

        /* renamed from: a */
        public final String invoke(v vVar) {
            C17542s.j(vVar, "startDestination");
            Map<String, C8945i> s10 = vVar.s();
            LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
            for (Map.Entry entry : s10.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
            }
            return j.k(this.f57711c, linkedHashMap);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(I<? extends x> i10) {
        super((I<? extends v>) i10);
        C17542s.j(i10, "navGraphNavigator");
    }

    public static /* synthetic */ v X(x xVar, int i10, v vVar, boolean z10, v vVar2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 8) != 0) {
                vVar2 = null;
            }
            return xVar.W(i10, vVar, z10, vVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
    }

    private final void k0(int i10) {
        if (i10 != x()) {
            if (this.f57706p != null) {
                l0((String) null);
            }
            this.f57704n = i10;
            this.f57705o = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void l0(String str) {
        int i10;
        if (str == null) {
            i10 = 0;
        } else if (C17542s.e(str, C())) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if (!C15854t.v0(str)) {
            i10 = v.f57671k.a(str).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route");
        }
        this.f57704n = i10;
        this.f57706p = str;
    }

    public v.b H(u uVar) {
        C17542s.j(uVar, "navDeepLinkRequest");
        return c0(uVar, true, false, this);
    }

    public void J(Context context, AttributeSet attributeSet) {
        C17542s.j(context, "context");
        C17542s.j(attributeSet, "attrs");
        super.J(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C8977a.f57825v);
        C17542s.i(obtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        k0(obtainAttributes.getResourceId(C8977a.f57826w, 0));
        this.f57705o = v.f57671k.b(context, this.f57704n);
        C16807N n10 = C16807N.f139792a;
        obtainAttributes.recycle();
    }

    public final void R(v vVar) {
        C17542s.j(vVar, "node");
        int x10 = vVar.x();
        String C10 = vVar.C();
        if (x10 == 0 && C10 == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        } else if (C() != null && C17542s.e(C10, C())) {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + this).toString());
        } else if (x10 != x()) {
            v e10 = this.f57703m.e(x10);
            if (e10 != vVar) {
                if (vVar.B() == null) {
                    if (e10 != null) {
                        e10.O((x) null);
                    }
                    vVar.O(this);
                    this.f57703m.l(vVar.x(), vVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + this).toString());
        }
    }

    public final void S(Collection<? extends v> collection) {
        C17542s.j(collection, "nodes");
        for (v vVar : collection) {
            if (vVar != null) {
                R(vVar);
            }
        }
    }

    public final v T(int i10) {
        return X(this, i10, this, false, (v) null, 8, (Object) null);
    }

    public final v U(String str) {
        if (str == null || C15854t.v0(str)) {
            return null;
        }
        return V(str, true);
    }

    public final v V(String str, boolean z10) {
        T t10;
        C17542s.j(str, PlaceTypes.ROUTE);
        Iterator<T> it = C15768k.h(e0.b(this.f57703m)).iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            v vVar = (v) t10;
            if (!C15854t.I(vVar.C(), str, false, 2, (Object) null)) {
                if (vVar.I(str) != null) {
                    break;
                }
            } else {
                break;
            }
        }
        v vVar2 = (v) t10;
        if (vVar2 != null) {
            return vVar2;
        }
        if (!z10 || B() == null) {
            return null;
        }
        x B10 = B();
        C17542s.g(B10);
        return B10.U(str);
    }

    public final v W(int i10, v vVar, boolean z10, v vVar2) {
        v vVar3;
        v e10 = this.f57703m.e(i10);
        if (vVar2 != null) {
            if (C17542s.e(e10, vVar2) && C17542s.e(e10.B(), vVar2.B())) {
                return e10;
            }
            e10 = null;
        } else if (e10 != null) {
            return e10;
        }
        if (z10) {
            Iterator<T> it = C15768k.h(e0.b(this.f57703m)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    e10 = null;
                    break;
                }
                v vVar4 = (v) it.next();
                if (!(vVar4 instanceof x) || C17542s.e(vVar4, vVar)) {
                    vVar3 = null;
                    continue;
                } else {
                    vVar3 = ((x) vVar4).W(i10, this, true, vVar2);
                    continue;
                }
                if (vVar3 != null) {
                    e10 = vVar3;
                    break;
                }
            }
        }
        if (e10 != null) {
            return e10;
        }
        if (B() == null || C17542s.e(B(), vVar)) {
            return null;
        }
        x B10 = B();
        C17542s.g(B10);
        return B10.W(i10, this, z10, vVar2);
    }

    public final c0<v> Y() {
        return this.f57703m;
    }

    public final String Z() {
        if (this.f57705o == null) {
            String str = this.f57706p;
            if (str == null) {
                str = String.valueOf(this.f57704n);
            }
            this.f57705o = str;
        }
        String str2 = this.f57705o;
        C17542s.g(str2);
        return str2;
    }

    public final int a0() {
        return this.f57704n;
    }

    public final String b0() {
        return this.f57706p;
    }

    public final v.b c0(u uVar, boolean z10, boolean z11, v vVar) {
        v.b bVar;
        C17542s.j(uVar, "navDeepLinkRequest");
        C17542s.j(vVar, "lastVisited");
        v.b H10 = super.H(uVar);
        v.b bVar2 = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                v vVar2 = (v) it.next();
                v.b H11 = !C17542s.e(vVar2, vVar) ? vVar2.H(uVar) : null;
                if (H11 != null) {
                    arrayList.add(H11);
                }
            }
            bVar = (v.b) C16877v.M0(arrayList);
        } else {
            bVar = null;
        }
        x B10 = B();
        if (B10 != null && z11 && !C17542s.e(B10, vVar)) {
            bVar2 = B10.c0(uVar, z10, true, this);
        }
        return (v.b) C16877v.M0(C16877v.s(H10, bVar, bVar2));
    }

    public final v.b d0(String str, boolean z10, boolean z11, v vVar) {
        v.b bVar;
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(vVar, "lastVisited");
        v.b I10 = I(str);
        v.b bVar2 = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                v vVar2 = (v) it.next();
                v.b d02 = C17542s.e(vVar2, vVar) ? null : vVar2 instanceof x ? ((x) vVar2).d0(str, true, false, this) : vVar2.I(str);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
            bVar = (v.b) C16877v.M0(arrayList);
        } else {
            bVar = null;
        }
        x B10 = B();
        if (B10 != null && z11 && !C17542s.e(B10, vVar)) {
            bVar2 = B10.d0(str, z10, true, this);
        }
        return (v.b) C16877v.M0(C16877v.s(I10, bVar, bVar2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        if (super.equals(obj)) {
            x xVar = (x) obj;
            if (this.f57703m.o() == xVar.f57703m.o() && a0() == xVar.a0()) {
                for (T t10 : C15768k.h(e0.b(this.f57703m))) {
                    if (!C17542s.e(t10, xVar.f57703m.e(t10.x()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g0(int i10) {
        k0(i10);
    }

    public final <T> void h0(T t10) {
        C17542s.j(t10, "startDestRoute");
        j0(z.e(P.b(t10.getClass())), new c(t10));
    }

    public int hashCode() {
        int a02 = a0();
        c0<v> c0Var = this.f57703m;
        int o10 = c0Var.o();
        for (int i10 = 0; i10 < o10; i10++) {
            a02 = (((a02 * 31) + c0Var.k(i10)) * 31) + c0Var.p(i10).hashCode();
        }
        return a02;
    }

    public final void i0(String str) {
        C17542s.j(str, "startDestRoute");
        l0(str);
    }

    public final Iterator<v> iterator() {
        return new b(this);
    }

    public final <T> void j0(KSerializer<T> kSerializer, C17642l<? super v, String> lVar) {
        C17542s.j(kSerializer, "serializer");
        C17542s.j(lVar, "parseRoute");
        int g10 = j.g(kSerializer);
        v T10 = T(g10);
        if (T10 != null) {
            l0(lVar.invoke(T10));
            this.f57704n = g10;
            return;
        }
        throw new IllegalStateException(("Cannot find startDestination " + kSerializer.getDescriptor().i() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
    }

    public String t() {
        return x() != 0 ? super.t() : "the root navigation";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        v U10 = U(this.f57706p);
        if (U10 == null) {
            U10 = T(a0());
        }
        sb2.append(" startDestination=");
        if (U10 == null) {
            String str = this.f57706p;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.f57705o;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f57704n));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(U10.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }
}

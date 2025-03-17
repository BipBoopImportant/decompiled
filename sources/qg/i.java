package qg;

import IC.C13023e;
import XH.C16807N;
import YH.C16877v;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import ip.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17642l;
import qI.C17785b;
import qg.z;
import uI.C18064m;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010\fR\"\u0010)\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010(R+\u0010\u0019\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00008V@VX\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0005R\u0014\u00105\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u00104R\u0014\u00106\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00104R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0015078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020;078&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u00109R\u0016\u0010?\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u00104R\"\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010@8$X¤\u0004¢\u0006\u0006\u001a\u0004\b*\u0010AR\u0011\u0010D\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bC\u0010\f\u0001\u0004EFGH¨\u0006I"}, d2 = {"Lqg/i;", "T", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "", "dryRun", "includeManualInputValidationErrors", "t", "(ZZ)Z", "c", "()Z", "", "invalidInput", "LIC/e;", "errorMessage", "LXH/N;", "b", "(Ljava/lang/String;LIC/e;)V", "", "Lqg/y;", "a", "Ljava/util/List;", "backendValidation", "value", "Ljava/lang/Boolean;", "o", "()Ljava/lang/Boolean;", "isValid", "LIC/e;", "d", "()LIC/e;", "error", "Z", "l", "isDirty", "e", "m", "q", "(Z)V", "isEnabled", "f", "p", "s", "isVisible", "<set-?>", "g", "LqI/b;", "j", "()Ljava/lang/Object;", "r", "()Ljava/lang/String;", "key", "targetKey", "", "i", "()Ljava/util/List;", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "k", "visibility", "h", "textAsCollapsed", "Lkotlin/Function1;", "()LnI/l;", "onChanged", "n", "isMandatory", "Lqg/m;", "Lqg/t;", "Lqg/v;", "Lqg/x;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i<T> {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f76116h = {P.e(new A(i.class, "value", "getValue()Ljava/lang/Object;", 0))};

    /* renamed from: i  reason: collision with root package name */
    public static final int f76117i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<y> f76118a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f76119b;

    /* renamed from: c  reason: collision with root package name */
    private C13023e f76120c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f76121d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f76122e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f76123f;

    /* renamed from: g  reason: collision with root package name */
    private final C17785b f76124g;

    public /* synthetic */ i(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    public static /* synthetic */ boolean u(i iVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return iVar.t(z10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validate");
    }

    /* access modifiers changed from: private */
    public static final C16807N v(i iVar, Object obj) {
        C17642l f10 = iVar.f();
        if (f10 != null) {
            f10.invoke(obj);
        }
        iVar.f76121d = true;
        return C16807N.f139792a;
    }

    public final void b(String str, C13023e eVar) {
        C17542s.j(str, "invalidInput");
        C17542s.j(eVar, "errorMessage");
        this.f76118a.add(new s(str, "name", eVar));
        u(this, false, false, 2, (Object) null);
    }

    public boolean c() {
        return false;
    }

    public final C13023e d() {
        return this.f76120c;
    }

    public abstract String e();

    /* access modifiers changed from: protected */
    public abstract C17642l<T, C16807N> f();

    public abstract String g();

    public abstract String h();

    public abstract List<y> i();

    public T j() {
        return this.f76124g.a(this, f76116h[0]);
    }

    public abstract List<Conditions> k();

    public final boolean l() {
        return this.f76121d;
    }

    public final boolean m() {
        return this.f76122e;
    }

    public final boolean n() {
        ArrayList arrayList = new ArrayList();
        for (Object next : i()) {
            if (next instanceof p) {
                arrayList.add(next);
            }
        }
        return C16877v.g0(arrayList);
    }

    public final Boolean o() {
        return this.f76119b;
    }

    public final boolean p() {
        return this.f76123f;
    }

    public final void q(boolean z10) {
        this.f76122e = z10;
    }

    public void r(T t10) {
        this.f76124g.b(this, f76116h[0], t10);
    }

    public final void s(boolean z10) {
        this.f76123f = z10;
    }

    public boolean t(boolean z10, boolean z11) {
        String valueOf = String.valueOf(j());
        List c10 = C16877v.c();
        c10.addAll(i());
        if (z11) {
            c10.addAll(this.f76118a);
        }
        Iterable<y> a10 = C16877v.a(c10);
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (y a11 : a10) {
            arrayList.add(a11.a(valueOf));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (next instanceof z.a) {
                arrayList2.add(next);
            }
        }
        z.a aVar = (z.a) C16877v.y0(arrayList2);
        if (!z10 || this.f76121d) {
            this.f76119b = Boolean.valueOf(aVar == null);
            this.f76120c = aVar != null ? aVar.a() : null;
            this.f76121d = false;
        }
        return aVar == null;
    }

    private i(T t10) {
        this.f76118a = new ArrayList();
        this.f76122e = true;
        this.f76123f = true;
        this.f76124g = m.a(t10, new h(this));
    }
}

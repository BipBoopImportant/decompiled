package BJ;

import BJ.C15472g;
import DI.C15579z;
import HJ.C15850p;
import cJ.C17069f;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

/* renamed from: BJ.h  reason: case insensitive filesystem */
public final class C15473h {

    /* renamed from: a  reason: collision with root package name */
    private final C17069f f133313a;

    /* renamed from: b  reason: collision with root package name */
    private final C15850p f133314b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<C17069f> f133315c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C15579z, String> f133316d;

    /* renamed from: e  reason: collision with root package name */
    private final C15471f[] f133317e;

    /* renamed from: BJ.h$a */
    static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133318a = new a();

        a() {
        }

        /* renamed from: a */
        public final Void invoke(C15579z zVar) {
            C17542s.j(zVar, "<this>");
            return null;
        }
    }

    /* renamed from: BJ.h$b */
    static final class b implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f133319a = new b();

        b() {
        }

        /* renamed from: a */
        public final Void invoke(C15579z zVar) {
            C17542s.j(zVar, "<this>");
            return null;
        }
    }

    /* renamed from: BJ.h$c */
    static final class c implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f133320a = new c();

        c() {
        }

        /* renamed from: a */
        public final Void invoke(C15579z zVar) {
            C17542s.j(zVar, "<this>");
            return null;
        }
    }

    private C15473h(C17069f fVar, C15850p pVar, Collection<C17069f> collection, C17642l<? super C15579z, String> lVar, C15471f... fVarArr) {
        this.f133313a = fVar;
        this.f133314b = pVar;
        this.f133315c = collection;
        this.f133316d = lVar;
        this.f133317e = fVarArr;
    }

    public final C15472g a(C15579z zVar) {
        C17542s.j(zVar, "functionDescriptor");
        for (C15471f b10 : this.f133317e) {
            String b11 = b10.b(zVar);
            if (b11 != null) {
                return new C15472g.b(b11);
            }
        }
        String invoke = this.f133316d.invoke(zVar);
        return invoke != null ? new C15472g.b(invoke) : C15472g.c.f133312b;
    }

    public final boolean b(C15579z zVar) {
        C17542s.j(zVar, "functionDescriptor");
        if (this.f133313a != null && !C17542s.e(zVar.getName(), this.f133313a)) {
            return false;
        }
        if (this.f133314b != null) {
            String b10 = zVar.getName().b();
            C17542s.i(b10, "asString(...)");
            if (!this.f133314b.i(b10)) {
                return false;
            }
        }
        Collection<C17069f> collection = this.f133315c;
        return collection == null || collection.contains(zVar.getName());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15473h(C17069f fVar, C15471f[] fVarArr, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (C17642l<? super C15579z, String>) (i10 & 4) != 0 ? a.f133318a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15473h(C17069f fVar, C15471f[] fVarArr, C17642l<? super C15579z, String> lVar) {
        this(fVar, (C15850p) null, (Collection<C17069f>) null, lVar, (C15471f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C17542s.j(fVar, "name");
        C17542s.j(fVarArr, "checks");
        C17542s.j(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15473h(C15850p pVar, C15471f[] fVarArr, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, fVarArr, (C17642l<? super C15579z, String>) (i10 & 4) != 0 ? b.f133319a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15473h(C15850p pVar, C15471f[] fVarArr, C17642l<? super C15579z, String> lVar) {
        this((C17069f) null, pVar, (Collection<C17069f>) null, lVar, (C15471f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C17542s.j(pVar, "regex");
        C17542s.j(fVarArr, "checks");
        C17542s.j(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15473h(Collection collection, C15471f[] fVarArr, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<C17069f>) collection, fVarArr, (C17642l<? super C15579z, String>) (i10 & 4) != 0 ? c.f133320a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15473h(Collection<C17069f> collection, C15471f[] fVarArr, C17642l<? super C15579z, String> lVar) {
        this((C17069f) null, (C15850p) null, collection, lVar, (C15471f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C17542s.j(collection, "nameList");
        C17542s.j(fVarArr, "checks");
        C17542s.j(lVar, "additionalChecks");
    }
}

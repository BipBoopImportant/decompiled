package MI;

import MI.C16042C;
import XH.C16796C;
import XH.C16822m;
import XH.v;
import YH.X;
import cJ.C17066c;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: MI.B  reason: case insensitive filesystem */
public final class C16041B {

    /* renamed from: a  reason: collision with root package name */
    private static final C17066c f136258a;

    /* renamed from: b  reason: collision with root package name */
    private static final C17066c f136259b;

    /* renamed from: c  reason: collision with root package name */
    private static final C17066c f136260c;

    /* renamed from: d  reason: collision with root package name */
    private static final C17066c f136261d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f136262e;

    /* renamed from: f  reason: collision with root package name */
    private static final C17066c[] f136263f;

    /* renamed from: g  reason: collision with root package name */
    private static final C16050K<C16042C> f136264g;

    /* renamed from: h  reason: collision with root package name */
    private static final C16042C f136265h;

    static {
        C17066c cVar = new C17066c("org.jspecify.nullness");
        f136258a = cVar;
        C17066c cVar2 = new C17066c("org.jspecify.annotations");
        f136259b = cVar2;
        C17066c cVar3 = new C17066c("io.reactivex.rxjava3.annotations");
        f136260c = cVar3;
        C17066c cVar4 = new C17066c("org.checkerframework.checker.nullness.compatqual");
        f136261d = cVar4;
        String a10 = cVar3.a();
        f136262e = a10;
        C17066c cVar5 = new C17066c(a10 + ".Nullable");
        f136263f = new C17066c[]{cVar5, new C17066c(a10 + ".NonNull")};
        C17066c cVar6 = new C17066c("org.jetbrains.annotations");
        C16042C.a aVar = C16042C.f136266d;
        v a11 = C16796C.a(cVar6, aVar.a());
        v a12 = C16796C.a(new C17066c("androidx.annotation"), aVar.a());
        v a13 = C16796C.a(new C17066c("android.support.annotation"), aVar.a());
        v a14 = C16796C.a(new C17066c("android.annotation"), aVar.a());
        v a15 = C16796C.a(new C17066c("com.android.annotations"), aVar.a());
        v a16 = C16796C.a(new C17066c("org.eclipse.jdt.annotation"), aVar.a());
        v a17 = C16796C.a(new C17066c("org.checkerframework.checker.nullness.qual"), aVar.a());
        v a18 = C16796C.a(cVar4, aVar.a());
        v a19 = C16796C.a(new C17066c("javax.annotation"), aVar.a());
        v a20 = C16796C.a(new C17066c("edu.umd.cs.findbugs.annotations"), aVar.a());
        v a21 = C16796C.a(new C17066c("io.reactivex.annotations"), aVar.a());
        C17066c cVar7 = new C17066c("androidx.annotation.RecentlyNullable");
        C16054O o10 = C16054O.WARN;
        v a22 = C16796C.a(cVar7, new C16042C(o10, (C16822m) null, (C16054O) null, 4, (DefaultConstructorMarker) null));
        v a23 = C16796C.a(new C17066c("androidx.annotation.RecentlyNonNull"), new C16042C(o10, (C16822m) null, (C16054O) null, 4, (DefaultConstructorMarker) null));
        v a24 = C16796C.a(new C17066c("lombok"), aVar.a());
        C16822m mVar = new C16822m(2, 1);
        C16054O o11 = C16054O.STRICT;
        f136264g = new C16052M(X.m(a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, C16796C.a(cVar, new C16042C(o10, mVar, o11)), C16796C.a(cVar2, new C16042C(o10, new C16822m(2, 1), o11)), C16796C.a(cVar3, new C16042C(o10, new C16822m(1, 8), o11))));
        f136265h = new C16042C(o10, (C16822m) null, (C16054O) null, 4, (DefaultConstructorMarker) null);
    }

    public static final C16046G a(C16822m mVar) {
        C17542s.j(mVar, "configuredKotlinVersion");
        C16042C c10 = f136265h;
        C16054O c11 = (c10.d() == null || c10.d().compareTo(mVar) > 0) ? c10.c() : c10.b();
        return new C16046G(c11, c(c11), (Map) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C16046G b(C16822m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = C16822m.f139803f;
        }
        return a(mVar);
    }

    public static final C16054O c(C16054O o10) {
        C17542s.j(o10, "globalReportLevel");
        if (o10 == C16054O.WARN) {
            return null;
        }
        return o10;
    }

    public static final C16054O d(C17066c cVar) {
        C17542s.j(cVar, "annotationFqName");
        return h(cVar, C16050K.f136337a.a(), (C16822m) null, 4, (Object) null);
    }

    public static final C17066c e() {
        return f136259b;
    }

    public static final C17066c[] f() {
        return f136263f;
    }

    public static final C16054O g(C17066c cVar, C16050K<? extends C16054O> k10, C16822m mVar) {
        C17542s.j(cVar, "annotation");
        C17542s.j(k10, "configuredReportLevels");
        C17542s.j(mVar, "configuredKotlinVersion");
        C16054O o10 = (C16054O) k10.a(cVar);
        if (o10 != null) {
            return o10;
        }
        C16042C a10 = f136264g.a(cVar);
        return a10 == null ? C16054O.IGNORE : (a10.d() == null || a10.d().compareTo(mVar) > 0) ? a10.c() : a10.b();
    }

    public static /* synthetic */ C16054O h(C17066c cVar, C16050K k10, C16822m mVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            mVar = new C16822m(1, 7, 20);
        }
        return g(cVar, k10, mVar);
    }
}

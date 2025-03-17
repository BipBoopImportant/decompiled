package qw;

import U0.C4889m;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.animation.d;
import androidx.compose.animation.k;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.e;
import m0.C5525D;
import m0.C5548j;
import nI.C17642l;
import nI.r;
import x4.C8942f;
import x4.C8948l;
import x4.q;
import x4.y;
import z4.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u001aS\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e\"+\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"+\u0010\u001a\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"+\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"+\u0010 \u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"+\u0010#\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f8\u0006¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"+\u0010&\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f8\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015\"+\u0010)\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015\"+\u0010,\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f8\u0006¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u0015¨\u0006-"}, d2 = {"Lx4/y;", "", "route", "", "Lx4/f;", "arguments", "Lx4/q;", "deepLinks", "Lkotlin/Function2;", "Ll0/e;", "Lx4/l;", "LXH/N;", "content", "s", "(Lx4/y;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LnI/r;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Landroidx/compose/animation/i;", "a", "LnI/l;", "m", "()LnI/l;", "defaultEnterTransition", "Landroidx/compose/animation/k;", "b", "n", "defaultExitTransition", "c", "o", "defaultPopEnterTransition", "d", "p", "defaultPopExitTransition", "e", "getModalEnterTransition", "modalEnterTransition", "f", "getModalExitTransition", "modalExitTransition", "g", "getModalPopEnterTransition", "modalPopEnterTransition", "h", "getModalPopExitTransition", "modalPopExitTransition", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final C17642l<d<C8948l>, androidx.compose.animation.i> f28558a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final C17642l<d<C8948l>, k> f28559b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final C17642l<d<C8948l>, androidx.compose.animation.i> f28560c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final C17642l<d<C8948l>, k> f28561d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static final C17642l<d<C8948l>, androidx.compose.animation.i> f28562e = new e();

    /* renamed from: f  reason: collision with root package name */
    private static final C17642l<d<C8948l>, k> f28563f = new f();

    /* renamed from: g  reason: collision with root package name */
    private static final C17642l<d<C8948l>, androidx.compose.animation.i> f28564g = new g();

    /* renamed from: h  reason: collision with root package name */
    private static final C17642l<d<C8948l>, k> f28565h = new h();

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i i(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.d(dVar, d.a.f17332a.c(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final k j(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.b(dVar, d.a.f17332a.c(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i k(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.d(dVar, d.a.f17332a.d(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final k l(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.b(dVar, d.a.f17332a.d(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }

    public static final C17642l<d<C8948l>, androidx.compose.animation.i> m() {
        return f28558a;
    }

    public static final C17642l<d<C8948l>, k> n() {
        return f28559b;
    }

    public static final C17642l<d<C8948l>, androidx.compose.animation.i> o() {
        return f28560c;
    }

    public static final C17642l<d<C8948l>, k> p() {
        return f28561d;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i q(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.d(dVar, d.a.f17332a.f(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final k r(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.b(dVar, d.a.f17332a.a(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }

    public static final void s(y yVar, String str, List<C8942f> list, List<q> list2, r<? super e, ? super C8948l, ? super C4889m, ? super Integer, C16807N> rVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(list, "arguments");
        List<q> list3 = list2;
        C17542s.j(list3, "deepLinks");
        r<? super e, ? super C8948l, ? super C4889m, ? super Integer, C16807N> rVar2 = rVar;
        C17542s.j(rVar2, "content");
        l.b(yVar, str, list, list3, f28562e, f28563f, f28564g, f28565h, (C17642l) null, rVar2, 128, (Object) null);
    }

    public static /* synthetic */ void t(y yVar, String str, List list, List list2, r rVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = C16877v.n();
        }
        if ((i10 & 4) != 0) {
            list2 = C16877v.n();
        }
        s(yVar, str, list, list2, rVar);
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i u(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.d(dVar, d.a.f17332a.f(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final k v(d dVar) {
        C17542s.j(dVar, "<this>");
        return d.b(dVar, d.a.f17332a.a(), C5548j.j(300, 0, (C5525D) null, 6, (Object) null), (C17642l) null, 4, (Object) null);
    }
}

package Tv;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Rv.c;
import Tv.b;
import XH.C16807N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJA\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\r\u001a\u00020\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006 "}, d2 = {"LTv/a;", "", "Lkotlin/Function1;", "LXH/N;", "block", "<init>", "(LnI/l;)V", "", "text", "e", "(I)V", "LRv/c$a;", "clickEvent", "icon", "description", "", "contextualText", "c", "(LRv/c$a;IILjava/lang/Integer;Ljava/lang/String;)V", "g", "()V", "f", "b", "LKJ/c;", "LTv/b;", "a", "()LKJ/c;", "", "Ljava/util/List;", "list", "I", "spacerCounter", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a {

    /* renamed from: a  reason: collision with root package name */
    private List<b> f40141a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f40142b;

    public a(C17642l<? super a, C16807N> lVar) {
        C17542s.j(lVar, "block");
        lVar.invoke(this);
    }

    public static /* synthetic */ void d(a aVar, c.a aVar2, int i10, int i11, Integer num, String str, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        aVar.c(aVar2, i10, i11, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : str);
    }

    public final C15987c<b> a() {
        return C15985a.h(this.f40141a);
    }

    public final void b() {
        this.f40141a.add(b.a.f40143a);
    }

    public final void c(c.a aVar, int i10, int i11, Integer num, String str) {
        C13023e eVar;
        C17542s.j(aVar, "clickEvent");
        Collection collection = this.f40141a;
        if (str == null || (eVar = C13026h.c(str)) == null) {
            eVar = C13026h.a(i10);
        }
        collection.add(new b.c(eVar, num != null ? C13026h.a(num.intValue()) : null, i11, aVar));
    }

    public final void e(int i10) {
        this.f40141a.add(new b.C0656b(C13026h.a(i10)));
    }

    public final void f() {
        this.f40141a.add(b.d.f40153a);
    }

    public final void g() {
        int i10 = this.f40142b;
        this.f40142b = i10 + 1;
        this.f40141a.add(new b.e(i10));
    }
}

package qk;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import gB.C14507i;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import pk.C11722a;
import pk.m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqk/e;", "", "LaA/a;", "sessionManager", "LjB/b;", "shoppingListRepository", "LIl/a;", "appConfigApi", "Lpk/a;", "contentItemsMapper", "<init>", "(LaA/a;LjB/b;LIl/a;Lpk/a;)V", "", "listId", "LTJ/g;", "Lpk/m;", "c", "(Ljava/lang/String;)LTJ/g;", "a", "LaA/a;", "b", "LjB/b;", "LIl/a;", "d", "Lpk/a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.e  reason: case insensitive filesystem */
public final class C11792e {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f101587a;

    /* renamed from: b  reason: collision with root package name */
    private final C14613b f101588b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Il.a f101589c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C11722a f101590d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isFamilyMember", "", "LgB/i;", "itemsWithAvailability", "Lpk/m;", "<anonymous>", "(ZLjava/util/List;)Lpk/m;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetListPriceUseCase$invoke$1", f = "GetListPriceUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qk.e$a */
    static final class a extends l implements q<Boolean, List<? extends C14507i>, C17164e<? super m>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101591c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f101592d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101593e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11792e f101594f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11792e eVar, C17164e<? super a> eVar2) {
            super(3, eVar2);
            this.f101594f = eVar;
        }

        public final Object i(boolean z10, List<C14507i> list, C17164e<? super m> eVar) {
            a aVar = new a(this.f101594f, eVar);
            aVar.f101592d = z10;
            aVar.f101593e = list;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), (List) obj2, (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101591c == 0) {
                y.b(obj);
                boolean z10 = this.f101592d;
                C11722a b10 = this.f101594f.f101590d;
                Iterable<C14507i> iterable = (List) this.f101593e;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (C14507i b11 : iterable) {
                    arrayList.add(b11.b());
                }
                return b10.s(arrayList, z10, this.f101594f.f101589c.s());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11792e(C13909a aVar, C14613b bVar, Il.a aVar2, C11722a aVar3) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(aVar3, "contentItemsMapper");
        this.f101587a = aVar;
        this.f101588b = bVar;
        this.f101589c = aVar2;
        this.f101590d = aVar3;
    }

    public final C16532g<m> c(String str) {
        C17542s.j(str, "listId");
        return C16534i.n(this.f101587a.f(), this.f101588b.q(str), new a(this, (C17164e<? super a>) null));
    }
}

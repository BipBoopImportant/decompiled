package Kq;

import Jq.b;
import TJ.C16532g;
import TJ.C16534i;
import aA.C13909a;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.q;
import tf.C10253a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKq/a;", "LJq/b;", "LaA/a;", "sessionManager", "Ltf/a;", "killSwitchRepository", "<init>", "(LaA/a;Ltf/a;)V", "LTJ/g;", "", "a", "LTJ/g;", "isEnabled", "()LTJ/g;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C16532g<Boolean> f82923a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kq.a$a  reason: collision with other inner class name */
    /* synthetic */ class C1647a extends C17525a implements q<Boolean, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: h  reason: collision with root package name */
        public static final C1647a f82924h = new C1647a();

        C1647a() {
            super(3, Boolean.TYPE, "and", "and(Z)Z", 4);
        }

        public final Object a(boolean z10, boolean z11, C17164e<? super Boolean> eVar) {
            return kotlin.coroutines.jvm.internal.b.a(z10 & z11);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }
    }

    public a(C13909a aVar, C10253a aVar2) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "killSwitchRepository");
        this.f82923a = C16534i.n(aVar2.y(), aVar.f(), C1647a.f82924h);
    }

    public C16532g<Boolean> isEnabled() {
        return this.f82923a;
    }
}

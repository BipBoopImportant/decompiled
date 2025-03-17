package L1;

import XH.C16818i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LXH/i;", "", "T", "LL1/a;", "parentValue", "childValue", "a", "(LL1/a;LL1/a;)LL1/a;"}, k = 3, mv = {1, 8, 0})
public final class u extends C17544u implements p<a<C16818i<? extends Boolean>>, a<C16818i<? extends Boolean>>, a<C16818i<? extends Boolean>>> {

    /* renamed from: c  reason: collision with root package name */
    public static final u f9051c = new u();

    public u() {
        super(2);
    }

    /* renamed from: a */
    public final a<C16818i<? extends Boolean>> invoke(a<C16818i<? extends Boolean>> aVar, a<C16818i<? extends Boolean>> aVar2) {
        String str;
        C16818i<? extends Boolean> iVar;
        if (aVar == null || (str = aVar.b()) == null) {
            str = aVar2.b();
        }
        if (aVar == null || (iVar = aVar.a()) == null) {
            iVar = aVar2.a();
        }
        return new a<>(str, iVar);
    }
}

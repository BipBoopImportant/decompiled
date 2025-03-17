package CB;

import EB.C12832d;
import FB.C12864e;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"LCB/h;", "LFB/e;", "<init>", "()V", "LTJ/g;", "LEB/d;", "b", "()LTJ/g;", "storeSelection", "LXH/N;", "a", "(LEB/d;)V", "LTJ/B;", "LTJ/B;", "storeValue", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: CB.h  reason: case insensitive filesystem */
public final class C12691h implements C12864e {

    /* renamed from: a  reason: collision with root package name */
    public static final C12691h f108356a = new C12691h();

    /* renamed from: b  reason: collision with root package name */
    private static final C16505B<C12832d> f108357b = C16521S.a(null);

    private C12691h() {
    }

    public void a(C12832d dVar) {
        C17542s.j(dVar, "storeSelection");
        f108357b.setValue(dVar);
    }

    public C16532g<C12832d> b() {
        return f108357b;
    }
}

package kn;

import android.content.Context;
import com.ingka.ikea.browseandsearch.browse.datalayer.impl.db.BrowseDatabase;
import jn.C11431b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ln.C11551a;
import ln.C11552b;
import ln.C11553c;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkn/a;", "", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kn.a  reason: case insensitive filesystem */
public abstract class C11517a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2242a f98975a = new C2242a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkn/a$a;", "", "<init>", "()V", "Ltw/h;", "networkService", "Lln/a;", "b", "(Ltw/h;)Lln/a;", "Landroid/content/Context;", "context", "Ljn/b;", "a", "(Landroid/content/Context;)Ljn/b;", "Lln/c;", "d", "(Ltw/h;)Lln/c;", "Lln/b;", "c", "(Ltw/h;)Lln/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kn.a$a  reason: collision with other inner class name */
    public static final class C2242a {
        public /* synthetic */ C2242a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C11431b a(Context context) {
            C17542s.j(context, "context");
            return BrowseDatabase.f93343a.a(context).a();
        }

        public final C11551a b(h hVar) {
            C17542s.j(hVar, "networkService");
            return (C11551a) hVar.b(C11551a.class);
        }

        public final C11552b c(h hVar) {
            C17542s.j(hVar, "networkService");
            return (C11552b) hVar.b(C11552b.class);
        }

        public final C11553c d(h hVar) {
            C17542s.j(hVar, "networkService");
            return (C11553c) hVar.b(C11553c.class);
        }

        private C2242a() {
        }
    }
}

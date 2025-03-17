package Lg;

import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u0000 \u0007*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LLg/a;", "VM", "", "<init>", "()V", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "holder", "model", "LXH/N;", "b", "(LLg/c;Ljava/lang/Object;)V", "", "payloads", "c", "(LLg/c;Ljava/lang/Object;Ljava/util/List;)V", "listdelegate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<VM> {

    /* renamed from: a  reason: collision with root package name */
    public static final C1028a f61671a = new C1028a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLg/a$a;", "", "<init>", "()V", "listdelegate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lg.a$a  reason: collision with other inner class name */
    public static final class C1028a {
        public /* synthetic */ C1028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1028a() {
        }
    }

    public abstract boolean a(Object obj);

    public final void b(c<?> cVar, Object obj) {
        C17542s.j(cVar, "holder");
        C17542s.j(obj, "model");
        cVar.e(obj);
    }

    public final void c(c<?> cVar, Object obj, List<? extends Object> list) {
        C17542s.j(cVar, "holder");
        C17542s.j(obj, "model");
        C17542s.j(list, "payloads");
        cVar.f(obj, list);
    }

    public abstract c<VM> d(ViewGroup viewGroup);
}

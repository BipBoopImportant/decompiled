package sg;

import I2.L;
import Lg.d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import il.C11404d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qg.i;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lsg/f;", "", "Lqg/i;", "field", "", "g", "(Lqg/i;)Z", "x0", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f {

    /* renamed from: x0  reason: collision with root package name */
    public static final a f76544x0 = a.f76545a;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsg/f$a;", "", "<init>", "()V", "Lsg/f;", "validator", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LLg/d;", "adapter", "", "position", "LXH/N;", "a", "(Lsg/f;Landroidx/recyclerview/widget/RecyclerView;LLg/d;I)V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f76545a = new a();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: sg.f$a$a  reason: collision with other inner class name */
        public static final class C1409a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f76546a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f76547b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f76548c;

            public C1409a(View view, d dVar, i iVar) {
                this.f76546a = view;
                this.f76547b = dVar;
                this.f76548c = iVar;
            }

            public final void run() {
                this.f76547b.g(this.f76548c, C11404d.VALIDATION_FAILED);
            }
        }

        private a() {
        }

        public final void a(f fVar, RecyclerView recyclerView, d dVar, int i10) {
            C17542s.j(fVar, "validator");
            C17542s.j(recyclerView, "recyclerView");
            C17542s.j(dVar, "adapter");
            int itemCount = dVar.getItemCount();
            if (itemCount > 0) {
                Object obj = dVar.e().get(C17978n.m(i10, 0, itemCount - 1));
                i iVar = obj instanceof i ? (i) obj : null;
                if (iVar != null && !fVar.g(iVar)) {
                    L.a(recyclerView, new C1409a(recyclerView, dVar, iVar));
                }
            }
        }
    }

    boolean g(i<?> iVar);
}

package pg;

import HJ.C15854t;
import XH.C16807N;
import YH.C16877v;
import android.view.View;
import android.view.ViewGroup;
import com.ingka.ikea.app.dynamicfields.ui.view.TextInputField;
import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10128b;
import qg.k;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sg.b;
import sg.g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpg/j;", "LLg/a;", "Lqg/k;", "Lsg/g;", "formController", "Lsg/b;", "dataPicker", "<init>", "(Lsg/g;Lsg/b;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/j$a;", "g", "(Landroid/view/ViewGroup;)Lpg/j$a;", "b", "Lsg/g;", "c", "Lsg/b;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends Lg.a<k> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f75909b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b f75910c;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lpg/j$a;", "Lpg/c;", "Lqg/k;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/j;Landroid/view/View;)V", "LXH/N;", "A", "()V", "", "new", "y", "(Ljava/lang/String;)V", "viewModel", "G", "(Lqg/k;)V", "E", "", "s", "()I", "imeAction", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends C10149c<k> {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ j f75911k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, View view) {
            super(view);
            C17542s.j(view, "itemView");
            this.f75911k = jVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N H(a aVar, String str) {
            Object obj;
            String str2;
            if (str != null) {
                if (!aVar.D()) {
                    Iterator it = ((k) aVar.g()).y().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C17542s.e(((KeyValue) obj).a(), str)) {
                            break;
                        }
                    }
                    KeyValue keyValue = (KeyValue) obj;
                    if (keyValue == null || (str2 = keyValue.c()) == null) {
                        str2 = str;
                    }
                    ((k) aVar.g()).r(str2);
                    TextInputField.M0(aVar.t(), str, false, 2, (Object) null);
                } else {
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str3 = null;
                    String str4 = null;
                    for (C11819b bVar : arrayList) {
                        if (str3 == null) {
                            String a10 = C11818a.a("Callback ignored since view holder has been recycled", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str3 = C11820c.a(a10);
                        }
                        if (str4 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str4;
                        bVar.a(eVar, str5, false, (Throwable) null, str3);
                        str4 = str5;
                    }
                }
            }
            return C16807N.f139792a;
        }

        public void A() {
            this.f75911k.f75909b.f0();
        }

        public void E() {
            Object obj;
            String str = null;
            g.a.c(this.f75911k.f75909b, getBindingAdapterPosition(), false, 2, (Object) null);
            Iterable<KeyValue> y10 = ((k) g()).y();
            ArrayList arrayList = new ArrayList(C16877v.y(y10, 10));
            for (KeyValue a10 : y10) {
                arrayList.add(a10.a());
            }
            Iterator it = ((k) g()).y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((KeyValue) obj).c(), ((k) g()).j())) {
                    break;
                }
            }
            KeyValue keyValue = (KeyValue) obj;
            if (keyValue != null) {
                str = keyValue.a();
            }
            this.f75911k.f75910c.l(arrayList, str, new i(this));
        }

        /* access modifiers changed from: protected */
        /* renamed from: G */
        public void w(k kVar) {
            Object obj;
            String str;
            C17542s.j(kVar, "viewModel");
            Iterator it = kVar.y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((KeyValue) obj).c(), kVar.j())) {
                    break;
                }
            }
            KeyValue keyValue = (KeyValue) obj;
            if (keyValue == null || (str = keyValue.a()) == null) {
                str = (String) kVar.j();
            }
            TextInputField t10 = t();
            t10.setHint((CharSequence) kVar.x());
            t10.L0(str, true);
        }

        public int s() {
            return this.f75911k.f75909b.h0(getBindingAdapterPosition());
        }

        /* access modifiers changed from: protected */
        public void y(String str) {
            C17542s.j(str, "new");
        }
    }

    public j(g gVar, b bVar) {
        C17542s.j(gVar, "formController");
        C17542s.j(bVar, "dataPicker");
        this.f75909b = gVar;
        this.f75910c = bVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof k;
    }

    /* renamed from: g */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75744e, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}

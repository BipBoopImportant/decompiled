package pg;

import HJ.C15854t;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import com.ingka.ikea.app.dynamicfields.ui.view.TextInputField;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10128b;
import qg.C10195e;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sg.c;
import sg.g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpg/g;", "LLg/a;", "Lqg/e;", "Lsg/g;", "formController", "Lsg/c;", "datePicker", "<init>", "(Lsg/g;Lsg/c;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/g$a;", "g", "(Landroid/view/ViewGroup;)Lpg/g$a;", "b", "Lsg/g;", "f", "()Lsg/g;", "c", "Lsg/c;", "e", "()Lsg/c;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pg.g  reason: case insensitive filesystem */
public final class C10153g extends Lg.a<C10195e> {

    /* renamed from: b  reason: collision with root package name */
    private final g f75900b;

    /* renamed from: c  reason: collision with root package name */
    private final c f75901c;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpg/g$a;", "Lpg/c;", "Lqg/e;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/g;Landroid/view/View;)V", "LXH/N;", "A", "()V", "", "new", "y", "(Ljava/lang/String;)V", "E", "", "s", "()I", "imeAction", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pg.g$a */
    public final class a extends C10149c<C10195e> {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C10153g f75902k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C10153g gVar, View view) {
            super(view);
            C17542s.j(view, "itemView");
            this.f75902k = gVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N G(a aVar, Date date) {
            if (date != null) {
                if (!aVar.D()) {
                    ((C10195e) aVar.g()).r(((C10195e) aVar.g()).z().format(date));
                    TextInputField.M0(aVar.t(), (String) ((C10195e) aVar.g()).j(), false, 2, (Object) null);
                } else {
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Callback ignored since view holder has been recycled", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        if (str2 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str3 = str2;
                        bVar.a(eVar, str3, false, (Throwable) null, str);
                        str2 = str3;
                    }
                }
            }
            return C16807N.f139792a;
        }

        public void A() {
            this.f75902k.f().f0();
        }

        public void E() {
            Date date;
            boolean z10;
            boolean z11 = false;
            g.a.c(this.f75902k.f(), getBindingAdapterPosition(), false, 2, (Object) null);
            int A10 = ((C10195e) g()).A();
            String str = (String) ((C10195e) g()).j();
            if (str.length() == 0) {
                z11 = true;
            }
            if (z11) {
                Calendar instance = Calendar.getInstance();
                instance.add(1, -A10);
                date = instance.getTime();
            } else {
                date = ((C10195e) g()).z().parse(str);
                if (date == null) {
                    date = new Date();
                }
            }
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("initialDate:" + date.getTime() + " minAge:" + A10 + " isValueEmpty:" + z11 + " value:" + str + " dateFormat:" + ((C10195e) g()).y(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    z10 = true;
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    z10 = true;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                boolean z12 = z10;
                str3 = str5;
            }
            c e10 = this.f75902k.e();
            C17542s.g(date);
            e10.m(date, A10, new C10152f(this));
        }

        public int s() {
            return this.f75902k.f().h0(getBindingAdapterPosition());
        }

        /* access modifiers changed from: protected */
        public void y(String str) {
            C17542s.j(str, "new");
        }
    }

    public C10153g(g gVar, c cVar) {
        C17542s.j(gVar, "formController");
        C17542s.j(cVar, "datePicker");
        this.f75900b = gVar;
        this.f75901c = cVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10195e;
    }

    public final c e() {
        return this.f75901c;
    }

    public final g f() {
        return this.f75900b;
    }

    /* renamed from: g */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75744e, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}

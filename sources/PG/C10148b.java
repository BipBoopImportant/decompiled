package pg;

import XH.C16807N;
import XH.t;
import android.view.View;
import android.view.ViewGroup;
import com.ingka.ikea.app.dynamicfields.ui.view.TextInputField;
import java.util.Map;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10128b;
import qg.C10192b;
import rg.C10218a;
import sg.C10244a;
import sg.g;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00060\u0012R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpg/b;", "LLg/a;", "Lqg/b;", "Lsg/g;", "formController", "Lsg/a;", "addressPicker", "", "componentValue", "<init>", "(Lsg/g;Lsg/a;Ljava/lang/String;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/b$a;", "h", "(Landroid/view/ViewGroup;)Lpg/b$a;", "b", "Lsg/g;", "c", "Lsg/a;", "d", "Ljava/lang/String;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pg.b  reason: case insensitive filesystem */
public final class C10148b extends Lg.a<C10192b> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f75889b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C10244a f75890c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f75891d;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0014X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpg/b$a;", "Lpg/G;", "Lqg/b;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/b;Landroid/view/View;)V", "LXH/N;", "E", "()V", "A", "view", "", "hasFocus", "x", "(Landroid/view/View;Z)V", "", "new", "y", "(Ljava/lang/String;)V", "Lrg/a;", "i", "Lrg/a;", "u", "()Lrg/a;", "textInput", "", "s", "()I", "imeAction", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pg.b$a */
    public final class a extends G<C10192b> {

        /* renamed from: i  reason: collision with root package name */
        private final C10218a f75892i = C10218a.TEXT;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C10148b f75893j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pg.b$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1391a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f75894a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    qg.b$d[] r0 = qg.C10192b.d.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    qg.b$d r1 = qg.C10192b.d.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    qg.b$d r1 = qg.C10192b.d.END     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f75894a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pg.C10148b.a.C1391a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C10148b bVar, View view) {
            super(view);
            C17542s.j(view, "itemView");
            this.f75893j = bVar;
        }

        private final void E() {
            C10192b bVar = (C10192b) g();
            g.a.c(this.f75893j.f75889b, getBindingAdapterPosition(), false, 2, (Object) null);
            C10192b.d B10 = bVar.B();
            Map<String, String> z10 = bVar.z();
            C10192b.C1401b C10 = bVar.C();
            this.f75893j.f75890c.f((String) bVar.j(), bVar.A(), z10, bVar.y(), B10, C10, this.f75893j.f75891d, new C10147a(bVar, this));
        }

        /* access modifiers changed from: private */
        public static final C16807N F(C10192b bVar, a aVar, String str) {
            Integer num;
            if (str != null) {
                bVar.r(str);
                C10192b.d B10 = bVar.B();
                int i10 = B10 == null ? -1 : C1391a.f75894a[B10.ordinal()];
                if (i10 == -1) {
                    num = null;
                } else if (i10 == 1) {
                    num = 0;
                } else if (i10 == 2) {
                    num = Integer.valueOf(((String) bVar.j()).length());
                } else {
                    throw new t();
                }
                TextInputField t10 = aVar.t();
                TextInputField.M0(t10, (String) bVar.j(), false, 2, (Object) null);
                if (num != null) {
                    t10.setSelection(num.intValue());
                }
            }
            return C16807N.f139792a;
        }

        public void A() {
            this.f75893j.f75889b.f0();
        }

        public int s() {
            return this.f75893j.f75889b.h0(getBindingAdapterPosition());
        }

        /* access modifiers changed from: protected */
        public C10218a u() {
            return this.f75892i;
        }

        public void x(View view, boolean z10) {
            C17542s.j(view, "view");
            if (z10) {
                E();
            }
        }

        /* access modifiers changed from: protected */
        public void y(String str) {
            C17542s.j(str, "new");
            ((C10192b) g()).r(str);
        }
    }

    public C10148b(g gVar, C10244a aVar, String str) {
        C17542s.j(gVar, "formController");
        C17542s.j(aVar, "addressPicker");
        C17542s.j(str, "componentValue");
        this.f75889b = gVar;
        this.f75890c = aVar;
        this.f75891d = str;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10192b;
    }

    /* renamed from: h */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75744e, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}

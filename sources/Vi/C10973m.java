package Vi;

import Ez.f;
import Fz.d;
import Lg.c;
import Sy.a;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import Vi.C10961a;
import XH.C16807N;
import XH.t;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import com.google.android.material.button.MaterialButton;
import ip.i;
import java.util.regex.Matcher;
import jj.C11419b;
import jp.C11442d;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import rz.C15015h;
import rz.C15026t;
import rz.C15029w;
import rz.Y;
import rz.Z;
import uK.C18146a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00060\u001aR\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"LVi/m;", "LLg/a;", "Lrz/h;", "LSy/a$e;", "appLocation", "LSy/a;", "scanAndGoAnalytics", "LVi/a;", "addToOnlineCartConfiguration", "LVi/n;", "actions", "<init>", "(LSy/a$e;LSy/a;LVi/a;LVi/n;)V", "", "regularPrice", "indicativeDiscount", "Landroid/text/Spannable;", "j", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/Spannable;", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/m$a;", "k", "(Landroid/view/ViewGroup;)LVi/m$a;", "b", "LSy/a$e;", "c", "LSy/a;", "d", "LVi/a;", "e", "LVi/n;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.m  reason: case insensitive filesystem */
public final class C10973m extends Lg.a<C15015h> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a.e f88596b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Sy.a f88597c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C10961a f88598d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C10974n f88599e;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"LVi/m$a;", "LLg/c;", "Lrz/h;", "LFz/d;", "binding", "<init>", "(LVi/m;LFz/d;)V", "Lrz/Y;", "stockStatus", "LXH/N;", "v", "(Lrz/Y;)V", "Lrz/Y$a;", "o", "(Lrz/Y$a;)V", "childItem", "", "n", "(Lrz/h;)Z", "u", "()V", "p", "Lrz/t;", "itemLocation", "", "q", "(Lrz/t;Lrz/Y;)Ljava/lang/Object;", "s", "(Lrz/h;)V", "viewModel", "m", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "LFz/d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vi.m$a */
    public final class a extends c<C15015h> {

        /* renamed from: h  reason: collision with root package name */
        private final d f88600h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C10973m f88601i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vi.m$a$a  reason: collision with other inner class name */
        static final class C1873a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15026t f88602a;

            C1873a(C15026t tVar) {
                this.f88602a = tVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-264094461, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.ChildItemDelegate.ChildItemDelegateViewModel.setUpItemLocation.<anonymous>.<anonymous>.<anonymous> (ChildItemDelegate.kt:206)");
                    }
                    r.f(this.f88602a, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Vi.C10973m r3, Fz.d r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r4, r0)
                r2.f88601i = r3
                androidx.constraintlayout.widget.ConstraintLayout r0 = r4.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                Vi.n r3 = r3.f88599e
                if (r3 == 0) goto L_0x0018
                r3 = 1
                goto L_0x0019
            L_0x0018:
                r3 = 0
            L_0x0019:
                r2.<init>((android.view.View) r0, (boolean) r3)
                r2.f88600h = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Vi.C10973m.a.<init>(Vi.m, Fz.d):void");
        }

        private final boolean n(C15015h hVar) {
            Integer d10 = hVar.d();
            if (!i.c(d10, 0)) {
                d10 = null;
            }
            if (d10 == null) {
                return false;
            }
            return i.b(hVar.g(), d10.intValue());
        }

        private final void o(Y.a aVar) {
            this.f88600h.f110089l.setVisibility(8);
            ImageView imageView = this.f88600h.f110090m;
            imageView.setVisibility(0);
            imageView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(aVar.b())));
            TextView textView = this.f88600h.f110091n;
            textView.setText(aVar.c());
            textView.setVisibility(0);
        }

        private final void p() {
            this.f88600h.f110089l.setVisibility(8);
            this.f88600h.f110090m.setVisibility(8);
            this.f88600h.f110091n.setVisibility(8);
        }

        private final Object q(C15026t tVar, Y y10) {
            ComposeView composeView = this.f88600h.f110081d;
            if (r(y10) || (tVar instanceof C15026t.c)) {
                composeView.setVisibility(8);
                return C16807N.f139792a;
            }
            composeView.setVisibility(0);
            composeView.setViewCompositionStrategy(s1.d.f19581b);
            C17542s.g(composeView);
            e.l(composeView, false, c1.c.c(-264094461, true, new C1873a(tVar)), 1, (Object) null);
            C17542s.g(composeView);
            return composeView;
        }

        private static final boolean r(Y y10) {
            Z z10 = null;
            Y.a aVar = y10 instanceof Y.a ? (Y.a) y10 : null;
            if (aVar != null) {
                z10 = aVar.a();
            }
            if ((z10 instanceof Z.a) || (z10 instanceof Z.b) || (z10 instanceof Z.c)) {
                return false;
            }
            if ((z10 instanceof Z.f) || (z10 instanceof Z.d) || (z10 instanceof Z.e) || z10 == null) {
                return true;
            }
            throw new t();
        }

        private final void s(C15015h hVar) {
            MaterialButton materialButton = this.f88600h.f110079b;
            C10973m mVar = this.f88601i;
            C10961a g10 = mVar.f88598d;
            if (g10 instanceof C10961a.C1870a) {
                C17542s.g(materialButton);
                materialButton.setVisibility(8);
            } else if (g10 instanceof C10961a.b) {
                boolean a10 = C11419b.a(hVar);
                if (a10) {
                    mVar.f88597c.o(hVar.e().d(), mVar.f88596b);
                }
                C17542s.g(materialButton);
                materialButton.setVisibility(0);
                materialButton.setEnabled(a10);
                materialButton.setOnClickListener(new C10972l(mVar, hVar));
            } else {
                throw new t();
            }
        }

        /* access modifiers changed from: private */
        public static final void t(C10973m mVar, C15015h hVar, View view) {
            ((C10961a.b) mVar.f88598d).a().invoke(hVar.e(), Integer.valueOf(hVar.f()));
        }

        private final void u() {
            this.f88600h.f110090m.setVisibility(8);
            ImageView imageView = this.f88600h.f110089l;
            imageView.setVisibility(0);
            imageView.setImageResource(C18146a.f148718xd);
            TextView textView = this.f88600h.f110091n;
            textView.setVisibility(0);
            textView.setText(Lg.e.c(this, f.f109708k0));
        }

        private final void v(Y y10) {
            if (y10 instanceof Y.a) {
                o((Y.a) y10);
            } else if (y10 instanceof Y.b) {
                p();
            } else {
                throw new t();
            }
        }

        public void i(View view) {
            C17542s.j(view, "view");
            super.i(view);
            C10974n f10 = this.f88601i.f88599e;
            if (f10 != null) {
                f10.a((C15015h) g());
            }
        }

        /* renamed from: m */
        public void c(C15015h hVar) {
            C17542s.j(hVar, "viewModel");
            super.c(hVar);
            C15029w e10 = hVar.e();
            String string = this.f88600h.getRoot().getResources().getString(Oo.b.f84766r1, new Object[]{Integer.valueOf(hVar.f())});
            C17542s.i(string, "getString(...)");
            d dVar = this.f88600h;
            C10973m mVar = this.f88601i;
            ImageView imageView = dVar.f110085h;
            C17542s.i(imageView, "productImage");
            es.c.e(imageView, e10.c());
            dVar.f110086i.setText(e10.g());
            dVar.f110083f.setText(e10.a());
            dVar.f110087j.setText(e10.f().e().b());
            Spannable e11 = mVar.j(e10.f().e().d(), e10.f().f());
            TextView textView = dVar.f110092o;
            C17542s.g(textView);
            textView.setVisibility(e11.length() > 0 ? 0 : 8);
            dVar.f110092o.setText(e11);
            if (n(hVar)) {
                u();
            } else {
                v(hVar.h());
            }
            dVar.f110088k.setText(string);
            dVar.f110082e.setText(hVar.b());
            if (hVar.a().length() == 0) {
                dVar.f110084g.setVisibility(8);
            } else {
                dVar.f110084g.setVisibility(0);
                dVar.f110084g.setText(hVar.a());
            }
            q(hVar.c(), hVar.h());
            s(hVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vi.m$b */
    public static final class b implements C17631a<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f88603a = new b();

        public final Object invoke() {
            return new StrikethroughSpan();
        }
    }

    public C10973m(a.e eVar, Sy.a aVar, C10961a aVar2, C10974n nVar) {
        C17542s.j(eVar, "appLocation");
        C17542s.j(aVar, "scanAndGoAnalytics");
        C17542s.j(aVar2, "addToOnlineCartConfiguration");
        this.f88596b = eVar;
        this.f88597c = aVar;
        this.f88598d = aVar2;
        this.f88599e = nVar;
    }

    /* access modifiers changed from: private */
    public final Spannable j(String str, String str2) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C11442d dVar = C11442d.STRIKE_THROUGH;
        b bVar = b.f88603a;
        if (spannableStringBuilder.length() != 0) {
            for (Matcher matcher = dVar.b().matcher(spannableStringBuilder); matcher.find(); matcher = dVar.b().matcher(spannableStringBuilder)) {
                int start = matcher.start();
                int end = matcher.end();
                int start2 = matcher.start(1);
                int end2 = matcher.end(1);
                int length = spannableStringBuilder.length();
                if (end2 > start2 && ((start2 < length || end2 < length) && (start2 >= 0 || end2 >= 0))) {
                    spannableStringBuilder.setSpan(bVar.invoke(), start2, end2, 33);
                }
                int i10 = start2 - start;
                int length2 = spannableStringBuilder.length();
                if (start2 > start && ((start < length2 || start2 < length2) && (start >= 0 || start2 >= 0))) {
                    spannableStringBuilder.delete(start, start2);
                }
                int i11 = end2 - i10;
                int i12 = end - i10;
                int length3 = spannableStringBuilder.length();
                if (i12 > i11 && ((i11 < length3 || i12 < length3) && (i11 >= 0 || i12 >= 0))) {
                    spannableStringBuilder.delete(i11, i12);
                }
            }
        }
        if (!(str2 == null || str2.length() == 0)) {
            spannableStringBuilder = new SpannableStringBuilder(SpannableString.valueOf(spannableStringBuilder)).append(" ").append(str2);
        }
        C17542s.g(spannableStringBuilder);
        return SpannableString.valueOf(spannableStringBuilder);
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C15015h;
    }

    /* renamed from: k */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        d c10 = d.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}

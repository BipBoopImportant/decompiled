package com.ingka.ikea.app.productinformationpage.ui;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ingka.ikea.core.model.product.ProductItem;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import jp.C11442d;
import jp.f;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;
import nI.C17631a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import uK.C18146a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u0002068BX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/ui/FeeDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "Landroid/text/SpannableStringBuilder;", "I0", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;)Landroid/text/SpannableStringBuilder;", "", "priceWithoutAnyFee", "LXH/N;", "F0", "(Ljava/lang/String;)V", "D0", "G0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LIl/a;", "P", "LIl/a;", "x0", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LEo/a;", "Q", "LEo/a;", "z0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LkK/c;", "R", "LkK/c;", "A0", "()LkK/c;", "setJson", "(LkK/c;)V", "json", "LRh/a;", "S", "LRh/a;", "_binding", "T", "LXH/o;", "B0", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "safeArgsFee", "y0", "()LRh/a;", "binding", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeeDialogFragment extends Hilt_FeeDialogFragment {

    /* renamed from: P  reason: collision with root package name */
    public Il.a f72097P;

    /* renamed from: Q  reason: collision with root package name */
    public Eo.a f72098Q;

    /* renamed from: R  reason: collision with root package name */
    public C17514c f72099R;

    /* renamed from: S  reason: collision with root package name */
    private Rh.a f72100S;

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f72101T = C16825p.b(new Wh.a(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72102a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag$Fee$c[] r0 = com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag$Fee$c r1 = com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.c.ECO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag$Fee$c r1 = com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.c.WEEE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f72102a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.ui.FeeDialogFragment.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17631a<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72103a = new b();

        public final Object invoke() {
            return new f(0.5f);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C17631a<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72104a = new c();

        public final Object invoke() {
            return new f(0.5f);
        }
    }

    private final ProductItem.Price.PriceTag.Fee B0() {
        return (ProductItem.Price.PriceTag.Fee) this.f72101T.getValue();
    }

    /* access modifiers changed from: private */
    public static final ProductItem.Price.PriceTag.Fee C0(FeeDialogFragment feeDialogFragment) {
        String string = feeDialogFragment.requireArguments().getString("fee");
        if (string != null) {
            return (ProductItem.Price.PriceTag.Fee) feeDialogFragment.A0().c(ProductItem.Price.PriceTag.Fee.Companion.serializer(), string);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void D0() {
        String j10 = x0().j();
        if (j10 != null && j10.length() != 0) {
            TextView textView = y0().f63206c.f63221n;
            textView.setVisibility(0);
            String string = getString(Oo.b.f84607c7);
            textView.setText(G2.b.a("<p><u> " + string + " </u></p>", 0));
            textView.setOnClickListener(new Wh.c(this, j10));
        }
    }

    /* access modifiers changed from: private */
    public static final void E0(FeeDialogFragment feeDialogFragment, String str, View view) {
        feeDialogFragment.z0().a(feeDialogFragment.getActivity(), str);
    }

    private final void F0(String str) {
        Rh.b bVar = y0().f63206c;
        if (str != null) {
            TextView textView = bVar.f63219l;
            C17542s.i(textView, "lessFeeAmount");
            textView.setVisibility(0);
            TextView textView2 = bVar.f63220m;
            C17542s.i(textView2, "lessFeeLevel");
            textView2.setVisibility(0);
            TextView textView3 = bVar.f63220m;
            V v10 = V.f144353a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{getString(Oo.b.f84807u9), getString(Oo.b.f84789t2)}, 2));
            C17542s.i(format, "format(...)");
            textView3.setText(format);
            bVar.f63219l.setText(str);
            return;
        }
        TextView textView4 = bVar.f63219l;
        C17542s.i(textView4, "lessFeeAmount");
        textView4.setVisibility(8);
        TextView textView5 = bVar.f63220m;
        C17542s.i(textView5, "lessFeeLevel");
        textView5.setVisibility(8);
    }

    private final void G0() {
        Toolbar toolbar;
        View view = getView();
        if (view != null && (toolbar = (Toolbar) view.findViewById(Uo.a.f88327h)) != null) {
            toolbar.setNavigationIcon(C18146a.f148142M2);
            toolbar.setNavigationContentDescription((CharSequence) getString(Oo.b.f84665i));
            toolbar.setNavigationOnClickListener(new Wh.b(this));
            toolbar.setTitle((CharSequence) getString(Oo.b.f84789t2));
        }
    }

    /* access modifiers changed from: private */
    public static final void H0(FeeDialogFragment feeDialogFragment, View view) {
        feeDialogFragment.dismiss();
    }

    private final SpannableStringBuilder I0(ProductItem.Price.PriceTag.Fee fee) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fee.d());
        C11442d dVar = C11442d.SUPERSCRIPT;
        b bVar = b.f72103a;
        c cVar = c.f72104a;
        if (spannableStringBuilder.length() != 0) {
            for (Matcher matcher = dVar.b().matcher(spannableStringBuilder); matcher.find(); matcher = dVar.b().matcher(spannableStringBuilder)) {
                int start = matcher.start();
                int end = matcher.end();
                int start2 = matcher.start(1);
                int end2 = matcher.end(1);
                int length = spannableStringBuilder.length();
                if (end2 > start2 && ((start2 < length || end2 < length) && (start2 >= 0 || end2 >= 0))) {
                    spannableStringBuilder.setSpan(cVar.invoke(), start2, end2, 33);
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
        if (spannableStringBuilder.length() != 0) {
            for (Matcher matcher2 = dVar.b().matcher(spannableStringBuilder); matcher2.find(); matcher2 = dVar.b().matcher(spannableStringBuilder)) {
                int start3 = matcher2.start();
                int end3 = matcher2.end();
                int start4 = matcher2.start(1);
                int end4 = matcher2.end(1);
                int length4 = spannableStringBuilder.length();
                if (end4 > start4 && ((start4 < length4 || end4 < length4) && (start4 >= 0 || end4 >= 0))) {
                    spannableStringBuilder.setSpan(bVar.invoke(), start4, end4, 33);
                }
                int i13 = start4 - start3;
                int length5 = spannableStringBuilder.length();
                if (start4 > start3 && ((start3 < length5 || start4 < length5) && (start3 >= 0 || start4 >= 0))) {
                    spannableStringBuilder.delete(start3, start4);
                }
                int i14 = end4 - i13;
                int i15 = end3 - i13;
                int length6 = spannableStringBuilder.length();
                if (i15 > i14 && ((i14 < length6 || i15 < length6) && (i14 >= 0 || i15 >= 0))) {
                    spannableStringBuilder.delete(i14, i15);
                }
            }
        }
        return spannableStringBuilder;
    }

    private final Rh.a y0() {
        Rh.a aVar = this.f72100S;
        C17542s.g(aVar);
        return aVar;
    }

    public final C17514c A0() {
        C17514c cVar = this.f72099R;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z(FeatureVariable.JSON_TYPE);
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        this.f72100S = Rh.a.c(layoutInflater, viewGroup, false);
        ConstraintLayout b10 = y0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f72100S = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        G0();
        int i10 = a.f72102a[B0().e().ordinal()];
        if (i10 == 1) {
            y0().f63206c.f63214g.setVisibility(0);
            y0().f63206c.f63212e.setVisibility(0);
            y0().f63206c.f63209b.setVisibility(0);
            y0().f63206c.f63211d.setText(B0().b());
        } else if (i10 != 2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported fee sent to FeeDialogFragment");
            e eVar = e.ERROR;
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = FeeDialogFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        } else {
            y0().f63206c.f63218k.setVisibility(0);
            y0().f63206c.f63216i.setVisibility(0);
            y0().f63206c.f63210c.setVisibility(0);
            y0().f63206c.f63215h.setText(B0().b());
        }
        F0(B0().f());
        y0().f63206c.f63223p.setText(getString(Oo.b.f84456N8));
        y0().f63206c.f63222o.setText(I0(B0()));
        D0();
    }

    public final Il.a x0() {
        Il.a aVar = this.f72097P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final Eo.a z0() {
        Eo.a aVar = this.f72098Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }
}

package pg;

import IC.C13023e;
import Lg.c;
import Lg.e;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import al.C11067a;
import al.C11068b;
import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import il.C11404d;
import java.util.ArrayList;
import java.util.List;
import jp.C11441c;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10026c;
import qg.w;
import rg.C10218a;
import sg.g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpg/C;", "LLg/a;", "Lqg/w;", "Lsg/g;", "formController", "<init>", "(Lsg/g;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/C$a;", "f", "(Landroid/view/ViewGroup;)Lpg/C$a;", "b", "Lsg/g;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C extends Lg.a<w> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f75873b;

    @SuppressLint({"ClickableViewAccessibility"})
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008BX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lpg/C$a;", "LLg/c;", "Lqg/w;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/C;Landroid/view/View;)V", "LXH/N;", "B", "()V", "", "hasFocus", "y", "(Z)V", "", "new", "z", "(Ljava/lang/String;)V", "", "payload", "viewModel", "A", "(Ljava/lang/Object;Lqg/w;)Z", "D", "(Lqg/w;)V", "C", "newText", "x", "q", "", "payloads", "r", "(Lqg/w;Ljava/util/List;)Z", "Landroid/widget/EditText;", "h", "Landroid/widget/EditText;", "editText", "Lcom/google/android/material/textfield/TextInputLayout;", "i", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "title", "k", "Landroid/view/View;", "container", "Lrg/a;", "s", "()Lrg/a;", "textInput", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<w> {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final EditText f75874h;

        /* renamed from: i  reason: collision with root package name */
        private final TextInputLayout f75875i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f75876j;

        /* renamed from: k  reason: collision with root package name */
        private final View f75877k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C f75878l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pg.C$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1390a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f75879a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f75880b;

            /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|39) */
            /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39) */
            /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0075 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0085 */
            static {
                /*
                    com.ingka.ikea.dynamicfields.datalayer.b[] r0 = com.ingka.ikea.dynamicfields.datalayer.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    com.ingka.ikea.dynamicfields.datalayer.b r2 = com.ingka.ikea.dynamicfields.datalayer.b.TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    com.ingka.ikea.dynamicfields.datalayer.b r3 = com.ingka.ikea.dynamicfields.datalayer.b.PASSWORD     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    r3 = 3
                    com.ingka.ikea.dynamicfields.datalayer.b r4 = com.ingka.ikea.dynamicfields.datalayer.b.EMAIL     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    r4 = 4
                    com.ingka.ikea.dynamicfields.datalayer.b r5 = com.ingka.ikea.dynamicfields.datalayer.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.dynamicfields.datalayer.b r5 = com.ingka.ikea.dynamicfields.datalayer.b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r6 = 5
                    r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.ingka.ikea.dynamicfields.datalayer.b r5 = com.ingka.ikea.dynamicfields.datalayer.b.PHONE     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r6 = 6
                    r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    com.ingka.ikea.dynamicfields.datalayer.b r5 = com.ingka.ikea.dynamicfields.datalayer.b.READONLY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r6 = 7
                    r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    com.ingka.ikea.dynamicfields.datalayer.b r5 = com.ingka.ikea.dynamicfields.datalayer.b.OPTION     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r6 = 8
                    r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    com.ingka.ikea.dynamicfields.datalayer.b r5 = com.ingka.ikea.dynamicfields.datalayer.b.DATE     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r6 = 9
                    r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    com.ingka.ikea.dynamicfields.datalayer.b r5 = com.ingka.ikea.dynamicfields.datalayer.b.PERSON_NAME     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r6 = 10
                    r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    f75879a = r0
                    rg.a[] r0 = rg.C10218a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    rg.a r5 = rg.C10218a.EMAIL     // Catch:{ NoSuchFieldError -> 0x0075 }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                    r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0075 }
                L_0x0075:
                    rg.a r1 = rg.C10218a.PHONE     // Catch:{ NoSuchFieldError -> 0x007d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
                L_0x007d:
                    rg.a r1 = rg.C10218a.NUMBER     // Catch:{ NoSuchFieldError -> 0x0085 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                    r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0085 }
                L_0x0085:
                    rg.a r1 = rg.C10218a.NAME     // Catch:{ NoSuchFieldError -> 0x008d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                    r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
                L_0x008d:
                    f75880b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pg.C.a.C1390a.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"pg/C$a$b", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f75881a;

            public b(a aVar) {
                this.f75881a = aVar;
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                EditText p10 = this.f75881a.f75874h;
                Editable text = p10.getText();
                p10.setSelection(text != null ? text.length() : 0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C c10, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f75878l = c10;
            View findViewById = view.findViewById(C11067a.f90308v);
            C17542s.i(findViewById, "findViewById(...)");
            EditText editText = (EditText) findViewById;
            this.f75874h = editText;
            View findViewById2 = view.findViewById(C11067a.f90311y);
            C17542s.i(findViewById2, "findViewById(...)");
            this.f75875i = (TextInputLayout) findViewById2;
            View findViewById3 = view.findViewById(C11067a.f90309w);
            C17542s.i(findViewById3, "findViewById(...)");
            this.f75876j = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C11067a.f90307u);
            C17542s.i(findViewById4, "findViewById(...)");
            this.f75877k = findViewById4;
            int dimensionPixelSize = e.a(this).getResources().getDimensionPixelSize(C10026c.f75268b);
            findViewById4.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
            editText.setOnFocusChangeListener(new y(this));
            editText.setOnEditorActionListener(new z(this));
            C11441c.a(editText, new C10145A(this));
            editText.setOnTouchListener(new C10146B());
        }

        private final boolean A(Object obj, w wVar) {
            if (obj == C11404d.VALIDATION_FAILED) {
                D(wVar);
                return true;
            } else if (obj != C11404d.ENABLED_STATE_CHANGED) {
                return false;
            } else {
                C(wVar);
                return true;
            }
        }

        private final void B() {
            this.f75878l.f75873b.f0();
        }

        private final void C(w wVar) {
            this.f75874h.setEnabled(wVar.m());
        }

        private final void D(w wVar) {
            if (wVar != null) {
                CharSequence error = this.f75875i.getError();
                C13023e d10 = wVar.d();
                String str = null;
                if (!C17542s.e(wVar.o(), Boolean.FALSE) || wVar.l() || d10 == null) {
                    this.f75875i.setError((CharSequence) null);
                } else if (!C17542s.e(d10, error)) {
                    TextInputLayout textInputLayout = this.f75875i;
                    if (d10 != null) {
                        str = d10.b(e.a(this));
                    }
                    textInputLayout.setError(str);
                }
            }
        }

        private final C10218a s() {
            switch (C1390a.f75879a[((w) g()).w().ordinal()]) {
                case 1:
                    return C10218a.TEXT;
                case 2:
                    return C10218a.PASSWORD;
                case 3:
                    return C10218a.EMAIL;
                case 4:
                    return C10218a.NUMBER;
                case 5:
                    return C10218a.ALPHANUMERIC;
                case 6:
                    return C10218a.PHONE;
                case 7:
                    return C10218a.DISABLED;
                case 8:
                case 9:
                    return C10218a.SELECTABLE;
                case 10:
                    return C10218a.NAME;
                default:
                    throw new t();
            }
        }

        /* access modifiers changed from: private */
        public static final void t(a aVar, View view, boolean z10) {
            aVar.y(z10);
        }

        /* access modifiers changed from: private */
        public static final boolean u(a aVar, TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 6) {
                return false;
            }
            aVar.B();
            return false;
        }

        /* access modifiers changed from: private */
        public static final C16807N v(a aVar, String str) {
            C17542s.j(str, "it");
            aVar.z(str);
            aVar.D((w) aVar.g());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final boolean w(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }

        private final void x(String str) {
            EditText editText = this.f75874h;
            Editable text = editText.getText();
            if (!C17542s.e(text != null ? text.toString() : null, str)) {
                editText.setText(str);
                editText.addOnLayoutChangeListener(new b(this));
            }
        }

        private final void y(boolean z10) {
            if (z10) {
                g.a.c(this.f75878l.f75873b, getBindingAdapterPosition(), false, 2, (Object) null);
                this.f75874h.setImeOptions(this.f75878l.f75873b.h0(getBindingAdapterPosition()));
                return;
            }
            ((w) g()).c();
            this.f75878l.f75873b.i0(getBindingAdapterPosition());
        }

        private final void z(String str) {
            ((w) g()).r(str);
        }

        /* renamed from: q */
        public void c(w wVar) {
            C17542s.j(wVar, "viewModel");
            super.c(wVar);
            this.f75876j.setText(wVar.x());
            x((String) wVar.j());
            EditText editText = this.f75874h;
            C c10 = this.f75878l;
            editText.setHint(wVar.y());
            editText.setImeOptions(c10.f75873b.h0(getBindingAdapterPosition()));
            int i10 = C1390a.f75880b[s().ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 33;
            } else if (i10 == 2) {
                i11 = 3;
            } else if (i10 == 3) {
                i11 = 4098;
            } else if (i10 == 4) {
                i11 = 8289;
            }
            editText.setInputType(i11);
            editText.setLines(wVar.z());
            editText.setMaxLines(wVar.z());
            editText.setHorizontallyScrolling(false);
            D(wVar);
        }

        /* renamed from: r */
        public boolean d(w wVar, List<? extends Object> list) {
            C17542s.j(wVar, "viewModel");
            C17542s.j(list, "payloads");
            Iterable<Object> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Object A10 : iterable) {
                arrayList.add(Boolean.valueOf(A(A10, wVar)));
            }
            return ip.c.a(arrayList);
        }
    }

    public C(g gVar) {
        C17542s.j(gVar, "formController");
        this.f75873b = gVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof w;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C11068b.f90318f, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}

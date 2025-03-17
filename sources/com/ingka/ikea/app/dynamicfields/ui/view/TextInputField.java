package com.ingka.ikea.app.dynamicfields.ui.view;

import XH.C16807N;
import XH.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.i;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import jp.C11441c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import rg.C10218a;
import rg.C10219b;
import rg.C10220c;
import rg.d;
import rg.e;
import sg.k;
import tK.C18010a;
import u2.C6012a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001PB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R6\u0010/\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R\"\u0010:\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010B\u001a\u0004\u0018\u00010\u00132\b\u0010;\u001a\u0004\u0018\u00010\u00138\u0006@FX\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010J\u001a\u00020C2\u0006\u0010;\u001a\u00020C8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010N\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u00138F@FX\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010\u0016¨\u0006Q"}, d2 = {"Lcom/ingka/ikea/app/dynamicfields/ui/view/TextInputField;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "", "suppressAnimation", "LXH/N;", "L0", "(Ljava/lang/String;Z)V", "isEnabled", "message", "N0", "(ZLjava/lang/String;)V", "", "position", "setSelection", "(I)V", "getText", "()Ljava/lang/String;", "clearFocus", "()V", "Lcom/google/android/material/textfield/TextInputEditText;", "e1", "Lcom/google/android/material/textfield/TextInputEditText;", "edit", "Lkotlin/Function1;", "f1", "LnI/l;", "getOnInputChanged", "()LnI/l;", "setOnInputChanged", "(LnI/l;)V", "onInputChanged", "Lkotlin/Function2;", "Landroid/view/View;", "g1", "LnI/p;", "getOnUserInteraction", "()LnI/p;", "setOnUserInteraction", "(LnI/p;)V", "onUserInteraction", "h1", "getOnEditorAction", "setOnEditorAction", "onEditorAction", "i1", "Z", "getHideErrorOnNewInput", "()Z", "setHideErrorOnNewInput", "(Z)V", "hideErrorOnNewInput", "value", "j1", "Ljava/lang/Integer;", "getEndDrawable", "()Ljava/lang/Integer;", "setEndDrawable", "(Ljava/lang/Integer;)V", "endDrawable", "Lrg/a;", "k1", "Lrg/a;", "getTextInput", "()Lrg/a;", "setTextInput", "(Lrg/a;)V", "textInput", "getImeOptions", "()I", "setImeOptions", "imeOptions", "l1", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextInputField extends TextInputLayout {

    /* renamed from: l1  reason: collision with root package name */
    public static final a f71877l1 = new a((DefaultConstructorMarker) null);

    /* renamed from: m1  reason: collision with root package name */
    public static final int f71878m1 = 8;
    /* access modifiers changed from: private */

    /* renamed from: e1  reason: collision with root package name */
    public final TextInputEditText f71879e1;

    /* renamed from: f1  reason: collision with root package name */
    private C17642l<? super String, C16807N> f71880f1;

    /* renamed from: g1  reason: collision with root package name */
    private p<? super View, ? super Boolean, C16807N> f71881g1;

    /* renamed from: h1  reason: collision with root package name */
    private C17642l<? super Integer, Boolean> f71882h1;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f71883i1 = true;

    /* renamed from: j1  reason: collision with root package name */
    private Integer f71884j1;

    /* renamed from: k1  reason: collision with root package name */
    private C10218a f71885k1 = C10218a.TEXT;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/dynamicfields/ui/view/TextInputField$a;", "", "<init>", "()V", "", "FULL_ALPHA", "I", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71886a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                rg.a[] r0 = rg.C10218a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rg.a r1 = rg.C10218a.EMAIL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                rg.a r1 = rg.C10218a.PASSWORD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                rg.a r1 = rg.C10218a.PHONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                rg.a r1 = rg.C10218a.TEXT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                rg.a r1 = rg.C10218a.NUMBER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                rg.a r1 = rg.C10218a.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                rg.a r1 = rg.C10218a.SELECTABLE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                rg.a r1 = rg.C10218a.DISABLED     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                rg.a r1 = rg.C10218a.NAME     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f71886a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.dynamicfields.ui.view.TextInputField.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/ingka/ikea/app/dynamicfields/ui/view/TextInputField$c", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextInputField f71887a;

        public c(TextInputField textInputField) {
            this.f71887a = textInputField;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            TextInputEditText H02 = this.f71887a.f71879e1;
            Editable text = H02.getText();
            H02.setSelection(text != null ? text.length() : 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.j(context, "context");
        TextInputEditText textInputEditText = new TextInputEditText(getContext());
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = -1;
        generateDefaultLayoutParams.height = -2;
        textInputEditText.setLayoutParams(generateDefaultLayoutParams);
        textInputEditText.setMaxLines(1);
        i.h(textInputEditText, ColorStateList.valueOf(C6012a.c(textInputEditText.getContext(), C18010a.f147427k)));
        C11441c.a(textInputEditText, new C10220c(this));
        textInputEditText.setOnFocusChangeListener(new d(this, textInputEditText));
        textInputEditText.setOnEditorActionListener(new e(this));
        this.f71879e1 = textInputEditText;
        addView(textInputEditText);
        setErrorEnabled(true);
    }

    /* access modifiers changed from: private */
    public static final void G0(TextInputField textInputField, View view) {
        p<? super View, ? super Boolean, C16807N> pVar = textInputField.f71881g1;
        if (pVar != null) {
            pVar.invoke(textInputField, Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(TextInputField textInputField, String str) {
        C17542s.j(str, "it");
        if (textInputField.f71883i1) {
            O0(textInputField, false, (String) null, 2, (Object) null);
        }
        C17642l<? super String, C16807N> lVar = textInputField.f71880f1;
        if (lVar != null) {
            lVar.invoke(str);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void J0(TextInputField textInputField, TextInputEditText textInputEditText, View view, boolean z10) {
        p<? super View, ? super Boolean, C16807N> pVar = textInputField.f71881g1;
        if (pVar != null) {
            pVar.invoke(textInputEditText, Boolean.valueOf(z10));
        }
        int i10 = 0;
        textInputField.setEndIconMode((!z10 || textInputField.f71885k1 != C10218a.PASSWORD) ? 0 : 1);
        if (!z10) {
            Editable text = textInputEditText.getText();
            if (text != null) {
                i10 = text.length();
            }
            textInputEditText.setSelection(i10);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean K0(TextInputField textInputField, TextView textView, int i10, KeyEvent keyEvent) {
        C17642l<? super Integer, Boolean> lVar = textInputField.f71882h1;
        if (lVar != null) {
            return lVar.invoke(Integer.valueOf(i10)).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void M0(TextInputField textInputField, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        textInputField.L0(str, z10);
    }

    public static /* synthetic */ void O0(TextInputField textInputField, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        textInputField.N0(z10, str);
    }

    public final void L0(String str, boolean z10) {
        C17542s.j(str, "text");
        boolean P10 = P();
        if (z10) {
            setHintAnimationEnabled(false);
        }
        Editable text = this.f71879e1.getText();
        if (!C17542s.e(text != null ? text.toString() : null, str)) {
            this.f71879e1.setText(str);
            addOnLayoutChangeListener(new c(this));
        }
        if (z10) {
            setHintAnimationEnabled(P10);
        }
    }

    public final void N0(boolean z10, String str) {
        if (!z10 || str == null) {
            setError((CharSequence) null);
        } else if (!C17542s.e(str, getError())) {
            setError(str);
        }
    }

    public void clearFocus() {
        super.clearFocus();
        C16807N n10 = C16807N.f139792a;
        this.f71879e1.clearFocus();
    }

    public final Integer getEndDrawable() {
        return this.f71884j1;
    }

    public final boolean getHideErrorOnNewInput() {
        return this.f71883i1;
    }

    public final int getImeOptions() {
        return this.f71879e1.getImeOptions();
    }

    public final C17642l<Integer, Boolean> getOnEditorAction() {
        return this.f71882h1;
    }

    public final C17642l<String, C16807N> getOnInputChanged() {
        return this.f71880f1;
    }

    public final p<View, Boolean, C16807N> getOnUserInteraction() {
        return this.f71881g1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getText() {
        /*
            r1 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r1.f71879e1
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.dynamicfields.ui.view.TextInputField.getText():java.lang.String");
    }

    public final C10218a getTextInput() {
        return this.f71885k1;
    }

    public final void setEndDrawable(Integer num) {
        this.f71884j1 = num;
        this.f71879e1.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
    }

    public final void setHideErrorOnNewInput(boolean z10) {
        this.f71883i1 = z10;
    }

    public final void setImeOptions(int i10) {
        this.f71879e1.setImeOptions(i10);
    }

    public final void setOnEditorAction(C17642l<? super Integer, Boolean> lVar) {
        this.f71882h1 = lVar;
    }

    public final void setOnInputChanged(C17642l<? super String, C16807N> lVar) {
        this.f71880f1 = lVar;
    }

    public final void setOnUserInteraction(p<? super View, ? super Boolean, C16807N> pVar) {
        this.f71881g1 = pVar;
    }

    public final void setSelection(int i10) {
        TextInputEditText textInputEditText = this.f71879e1;
        Editable text = textInputEditText.getText();
        textInputEditText.setSelection(Math.min(text != null ? text.length() : 0, i10));
    }

    public final void setTextInput(C10218a aVar) {
        int i10;
        C17542s.j(aVar, "value");
        this.f71885k1 = aVar;
        TextInputEditText textInputEditText = this.f71879e1;
        int i11 = 0;
        switch (b.f71886a[aVar.ordinal()]) {
            case 1:
                if (k.a()) {
                    this.f71879e1.setCursorVisible(false);
                }
                i10 = 33;
                break;
            case 2:
                i10 = 129;
                break;
            case 3:
                i10 = 3;
                break;
            case 4:
                i10 = 8193;
                break;
            case 5:
                i10 = 4098;
                break;
            case 6:
                i10 = 4097;
                break;
            case 7:
            case 8:
                i10 = 0;
                break;
            case 9:
                i10 = 8289;
                break;
            default:
                throw new t();
        }
        textInputEditText.setInputType(i10);
        if (aVar == C10218a.SELECTABLE) {
            this.f71879e1.setOnClickListener(new C10219b(this));
        } else {
            this.f71879e1.setOnClickListener((View.OnClickListener) null);
        }
        if (aVar == C10218a.DISABLED) {
            TextInputEditText textInputEditText2 = this.f71879e1;
            Drawable background = textInputEditText2.getBackground();
            if (background != null) {
                background.setAlpha(0);
            }
            textInputEditText2.setFocusable(false);
            textInputEditText2.setFocusableInTouchMode(false);
            textInputEditText2.setClickable(false);
        } else {
            TextInputEditText textInputEditText3 = this.f71879e1;
            Drawable background2 = textInputEditText3.getBackground();
            if (background2 != null) {
                background2.setAlpha(255);
            }
            textInputEditText3.setFocusable(true);
            textInputEditText3.setFocusableInTouchMode(true);
            textInputEditText3.setClickable(true);
        }
        if (hasFocus() && aVar == C10218a.PASSWORD) {
            i11 = 1;
        }
        setEndIconMode(i11);
    }
}

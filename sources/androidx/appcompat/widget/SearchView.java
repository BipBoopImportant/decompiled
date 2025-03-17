package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.source.CatalogRepository;
import i.C5421a;
import i.C5424d;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: E0  reason: collision with root package name */
    static final e f16324E0 = (Build.VERSION.SDK_INT < 29 ? new e() : null);

    /* renamed from: A  reason: collision with root package name */
    private int[] f16325A;

    /* renamed from: A0  reason: collision with root package name */
    private Bundle f16326A0;

    /* renamed from: B  reason: collision with root package name */
    private final ImageView f16327B;

    /* renamed from: B0  reason: collision with root package name */
    private final Runnable f16328B0;

    /* renamed from: C  reason: collision with root package name */
    private final Drawable f16329C;

    /* renamed from: C0  reason: collision with root package name */
    private Runnable f16330C0;

    /* renamed from: D  reason: collision with root package name */
    private final int f16331D;

    /* renamed from: D0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f16332D0;

    /* renamed from: E  reason: collision with root package name */
    private final int f16333E;

    /* renamed from: F  reason: collision with root package name */
    private final Intent f16334F;

    /* renamed from: G  reason: collision with root package name */
    private final Intent f16335G;

    /* renamed from: H  reason: collision with root package name */
    private final CharSequence f16336H;

    /* renamed from: I  reason: collision with root package name */
    View.OnFocusChangeListener f16337I;

    /* renamed from: J  reason: collision with root package name */
    private View.OnClickListener f16338J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f16339K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f16340L;

    /* renamed from: M  reason: collision with root package name */
    M2.a f16341M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f16342N;

    /* renamed from: O  reason: collision with root package name */
    private CharSequence f16343O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f16344P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f16345Q;

    /* renamed from: R  reason: collision with root package name */
    private int f16346R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f16347S;

    /* renamed from: T  reason: collision with root package name */
    private CharSequence f16348T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f16349U;

    /* renamed from: p  reason: collision with root package name */
    final SearchAutoComplete f16350p;

    /* renamed from: q  reason: collision with root package name */
    private final View f16351q;

    /* renamed from: r  reason: collision with root package name */
    private final View f16352r;

    /* renamed from: s  reason: collision with root package name */
    final ImageView f16353s;

    /* renamed from: t  reason: collision with root package name */
    final ImageView f16354t;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f16355u;

    /* renamed from: v  reason: collision with root package name */
    final ImageView f16356v;

    /* renamed from: w  reason: collision with root package name */
    private g f16357w;

    /* renamed from: x  reason: collision with root package name */
    private Rect f16358x;

    /* renamed from: y  reason: collision with root package name */
    private Rect f16359y;

    /* renamed from: y0  reason: collision with root package name */
    private int f16360y0;

    /* renamed from: z  reason: collision with root package name */
    private int[] f16361z;

    /* renamed from: z0  reason: collision with root package name */
    SearchableInfo f16362z0;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e  reason: collision with root package name */
        private int f16363e;

        /* renamed from: f  reason: collision with root package name */
        private SearchView f16364f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f16365g;

        /* renamed from: h  reason: collision with root package name */
        final Runnable f16366h;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C5421a.f23901p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                a.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f16324E0.c(this);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f16365g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f16365g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f16363e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f16365g) {
                removeCallbacks(this.f16366h);
                post(this.f16366h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f16364f.P();
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f16364f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f16364f.hasFocus() && getVisibility() == 0) {
                this.f16365g = true;
                if (SearchView.I(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f16365g = false;
                removeCallbacks(this.f16366h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f16365g = false;
                removeCallbacks(this.f16366h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f16365g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f16364f = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f16363e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f16366h = new a();
            this.f16363e = getThreshold();
        }
    }

    static class a {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private Method f16368a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f16369b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f16370c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        e() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                this.f16368a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                this.f16369b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f16370c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f16369b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f16368a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f16370c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class f extends O2.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f16371c;

        class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f16371c + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f16371c));
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16371c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    private static class g extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f16372a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f16373b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f16374c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f16375d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f16376e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16377f;

        public g(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f16376e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f16372a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f16373b.set(rect);
            this.f16375d.set(rect);
            Rect rect3 = this.f16375d;
            int i10 = this.f16376e;
            rect3.inset(-i10, -i10);
            this.f16374c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x0023
                if (r2 == r3) goto L_0x0023
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003e
            L_0x001b:
                boolean r2 = r8.f16377f
                r8.f16377f = r4
            L_0x001f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0040
            L_0x0023:
                boolean r2 = r8.f16377f
                if (r2 == 0) goto L_0x001f
                android.graphics.Rect r6 = r8.f16375d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x001f
                r5 = r2
                r2 = r4
                goto L_0x0040
            L_0x0032:
                android.graphics.Rect r2 = r8.f16373b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003e
                r8.f16377f = r5
                r2 = r5
                goto L_0x0040
            L_0x003e:
                r2 = r5
                r5 = r4
            L_0x0040:
                if (r5 == 0) goto L_0x0073
                if (r2 == 0) goto L_0x0060
                android.graphics.Rect r2 = r8.f16374c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0060
                android.view.View r0 = r8.f16372a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f16372a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006d
            L_0x0060:
                android.graphics.Rect r2 = r8.f16374c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006d:
                android.view.View r0 = r8.f16372a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0073:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.g.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    private Intent B(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f16348T);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f16326A0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f16362z0.getSearchActivity());
        return intent;
    }

    private void C() {
        this.f16350p.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.f16361z);
        getLocationInWindow(this.f16325A);
        int[] iArr = this.f16361z;
        int i10 = iArr[1];
        int[] iArr2 = this.f16325A;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.f16339K || this.f16329C == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f16350p.getTextSize()) * 1.25d);
        this.f16329C.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f16329C), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        SearchableInfo searchableInfo = this.f16362z0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f16362z0.getVoiceSearchLaunchWebSearch() ? this.f16334F : this.f16362z0.getVoiceSearchLaunchRecognizer() ? this.f16335G : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == null) ? false : true;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.f16342N || this.f16347S) && !H();
    }

    private void Q() {
        post(this.f16328B0);
    }

    private void S() {
        boolean isEmpty = TextUtils.isEmpty(this.f16350p.getText());
        int i10 = 0;
        boolean z10 = !isEmpty || (this.f16339K && !this.f16349U);
        ImageView imageView = this.f16355u;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f16355u.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void T() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f16350p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void U() {
        this.f16350p.setThreshold(this.f16362z0.getSuggestThreshold());
        this.f16350p.setImeOptions(this.f16362z0.getImeOptions());
        int inputType = this.f16362z0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f16362z0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f16350p.setInputType(inputType);
        M2.a aVar = this.f16341M;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f16362z0.getSuggestAuthority() != null) {
            G g10 = new G(getContext(), this, this.f16362z0, this.f16332D0);
            this.f16341M = g10;
            this.f16350p.setAdapter(g10);
            G g11 = (G) this.f16341M;
            if (this.f16344P) {
                i10 = 2;
            }
            g11.x(i10);
        }
    }

    private void V() {
        this.f16352r.setVisibility((!J() || !(this.f16354t.getVisibility() == 0 || this.f16356v.getVisibility() == 0)) ? 8 : 0);
    }

    private void W(boolean z10) {
        this.f16354t.setVisibility((!this.f16342N || !J() || !hasFocus() || (!z10 && this.f16347S)) ? 8 : 0);
    }

    private void X(boolean z10) {
        this.f16340L = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f16350p.getText());
        this.f16353s.setVisibility(i11);
        W(!isEmpty);
        this.f16351q.setVisibility(z10 ? 8 : 0);
        if (this.f16327B.getDrawable() != null && !this.f16339K) {
            i10 = 0;
        }
        this.f16327B.setVisibility(i10);
        S();
        Y(isEmpty);
        V();
    }

    private void Y(boolean z10) {
        int i10 = 8;
        if (this.f16347S && !H() && z10) {
            this.f16354t.setVisibility(8);
            i10 = 0;
        }
        this.f16356v.setVisibility(i10);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C5424d.f23925e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C5424d.f23926f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f16350p.setText(charSequence);
        this.f16350p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(this.f16350p);
            return;
        }
        e eVar = f16324E0;
        eVar.b(this.f16350p);
        eVar.a(this.f16350p);
    }

    public boolean H() {
        return this.f16340L;
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, String str, String str2) {
        getContext().startActivity(B("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, str));
    }

    /* access modifiers changed from: package-private */
    public void L() {
        if (!TextUtils.isEmpty(this.f16350p.getText())) {
            this.f16350p.setText("");
            this.f16350p.requestFocus();
            this.f16350p.setImeVisibility(true);
        } else if (this.f16339K) {
            clearFocus();
            X(true);
        }
    }

    /* access modifiers changed from: protected */
    public void M(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void N() {
        X(false);
        this.f16350p.requestFocus();
        this.f16350p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f16338J;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void O() {
        Editable text = this.f16350p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f16362z0 != null) {
                K(0, (String) null, text.toString());
            }
            this.f16350p.setImeVisibility(false);
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void P() {
        X(H());
        Q();
        if (this.f16350p.hasFocus()) {
            D();
        }
    }

    public void R(CharSequence charSequence, boolean z10) {
        this.f16350p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f16350p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f16348T = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            O();
        }
    }

    public void b() {
        if (!this.f16349U) {
            this.f16349U = true;
            int imeOptions = this.f16350p.getImeOptions();
            this.f16360y0 = imeOptions;
            this.f16350p.setImeOptions(imeOptions | 33554432);
            this.f16350p.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f16345Q = true;
        super.clearFocus();
        this.f16350p.clearFocus();
        this.f16350p.setImeVisibility(false);
        this.f16345Q = false;
    }

    public void f() {
        R("", false);
        clearFocus();
        X(true);
        this.f16350p.setImeOptions(this.f16360y0);
        this.f16349U = false;
    }

    public int getImeOptions() {
        return this.f16350p.getImeOptions();
    }

    public int getInputType() {
        return this.f16350p.getInputType();
    }

    public int getMaxWidth() {
        return this.f16346R;
    }

    public CharSequence getQuery() {
        return this.f16350p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f16343O;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f16362z0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f16336H : getContext().getText(this.f16362z0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f16333E;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f16331D;
    }

    public M2.a getSuggestionsAdapter() {
        return this.f16341M;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f16328B0);
        post(this.f16330C0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            E(this.f16350p, this.f16358x);
            Rect rect = this.f16359y;
            Rect rect2 = this.f16358x;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            g gVar = this.f16357w;
            if (gVar == null) {
                g gVar2 = new g(this.f16359y, this.f16358x, this.f16350p);
                this.f16357w = gVar2;
                setTouchDelegate(gVar2);
                return;
            }
            gVar.a(this.f16359y, this.f16358x);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        if (H()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f16346R;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f16346R;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f16346R) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(size2, CatalogRepository.FETCH_FLAG_SDB));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        X(fVar.f16371c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f16371c = H();
        return fVar;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Q();
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.f16345Q || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f16350p.requestFocus(i10, rect);
        if (requestFocus) {
            X(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f16326A0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            L();
        } else {
            N();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f16339K != z10) {
            this.f16339K = z10;
            X(z10);
            T();
        }
    }

    public void setImeOptions(int i10) {
        this.f16350p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f16350p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f16346R = i10;
        requestLayout();
    }

    public void setOnCloseListener(b bVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f16337I = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c cVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f16338J = onClickListener;
    }

    public void setOnSuggestionListener(d dVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f16343O = charSequence;
        T();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f16344P = z10;
        M2.a aVar = this.f16341M;
        if (aVar instanceof G) {
            ((G) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f16362z0 = searchableInfo;
        if (searchableInfo != null) {
            U();
            T();
        }
        boolean G10 = G();
        this.f16347S = G10;
        if (G10) {
            this.f16350p.setPrivateImeOptions("nm");
        }
        X(H());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f16342N = z10;
        X(H());
    }

    public void setSuggestionsAdapter(M2.a aVar) {
        this.f16341M = aVar;
        this.f16350p.setAdapter(aVar);
    }
}

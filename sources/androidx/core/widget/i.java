package androidx.core.widget;

import G2.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class i {

    static class a {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static int b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void c(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        static void d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void f(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    static class b {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class c {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    static class d {
        public static void a(TextView textView, int i10, float f10) {
            textView.setLineHeight(i10, f10);
        }
    }

    private static class e implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final ActionMode.Callback f21232a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f21233b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f21234c;

        /* renamed from: d  reason: collision with root package name */
        private Method f21235d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f21236e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f21237f = false;

        e(ActionMode.Callback callback, TextView textView) {
            this.f21232a = callback;
            this.f21233b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(a(), 0)) {
                if (f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) {
            Context context = this.f21233b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f21237f) {
                this.f21237f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f21234c = cls;
                    this.f21235d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f21236e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f21234c = null;
                    this.f21235d = null;
                    this.f21236e = false;
                }
            }
            try {
                Method declaredMethod = (!this.f21236e || !this.f21234c.isInstance(menu)) ? menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE}) : this.f21235d;
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c10 = c(context, packageManager);
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    ResolveInfo resolveInfo = c10.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f21233b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* access modifiers changed from: package-private */
        public ActionMode.Callback d() {
            return this.f21232a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f21232a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f21232a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f21232a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f21232a.onPrepareActionMode(actionMode, menu);
        }
    }

    @Deprecated
    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    @Deprecated
    public static int d(TextView textView) {
        return textView.getMaxLines();
    }

    private static int e(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static TextDirectionHeuristic f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() != 1) {
                z10 = false;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(c.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }

    public static q.a g(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new q.a(c.c(textView));
        }
        q.a.C0064a aVar = new q.a.C0064a(new TextPaint(textView.getPaint()));
        aVar.b(a.a(textView));
        aVar.c(a.b(textView));
        aVar.d(f(textView));
        return aVar.a();
    }

    public static void h(TextView textView, ColorStateList colorStateList) {
        H2.i.g(textView);
        a.d(textView, colorStateList);
    }

    public static void i(TextView textView, PorterDuff.Mode mode) {
        H2.i.g(textView);
        a.e(textView, mode);
    }

    @Deprecated
    public static void j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void k(TextView textView, int i10) {
        H2.i.d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            c.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void l(TextView textView, int i10) {
        H2.i.d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void m(TextView textView, int i10) {
        H2.i.d(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public static void n(TextView textView, int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.a(textView, i10, f10);
        } else {
            m(textView, Math.round(TypedValue.applyDimension(i10, f10, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void o(TextView textView, q qVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c.a(qVar.b()));
        } else if (g(textView).a(qVar.a())) {
            textView.setText(qVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void p(TextView textView, int i10) {
        textView.setTextAppearance(i10);
    }

    public static void q(TextView textView, q.a aVar) {
        textView.setTextDirection(e(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.c(textView, aVar.b());
        a.f(textView, aVar.c());
    }

    public static ActionMode.Callback r(ActionMode.Callback callback) {
        return callback instanceof e ? ((e) callback).d() : callback;
    }

    public static ActionMode.Callback s(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof e) || callback == null) ? callback : new e(callback, textView);
    }
}

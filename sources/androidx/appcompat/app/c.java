package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import i.C5421a;

public class c extends p implements DialogInterface {

    /* renamed from: f  reason: collision with root package name */
    final AlertController f15538f = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.b f15539a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15540b;

        public a(Context context) {
            this(context, c.l(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15418w = listAdapter;
            bVar.f15419x = onClickListener;
            return this;
        }

        public a b(boolean z10) {
            this.f15539a.f15413r = z10;
            return this;
        }

        public a c(View view) {
            this.f15539a.f15402g = view;
            return this;
        }

        public c create() {
            c cVar = new c(this.f15539a.f15396a, this.f15540b);
            this.f15539a.a(cVar.f15538f);
            cVar.setCancelable(this.f15539a.f15413r);
            if (this.f15539a.f15413r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f15539a.f15414s);
            cVar.setOnDismissListener(this.f15539a.f15415t);
            DialogInterface.OnKeyListener onKeyListener = this.f15539a.f15416u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(Drawable drawable) {
            this.f15539a.f15399d = drawable;
            return this;
        }

        public a e(int i10) {
            AlertController.b bVar = this.f15539a;
            bVar.f15403h = bVar.f15396a.getText(i10);
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f15539a.f15403h = charSequence;
            return this;
        }

        public a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15407l = charSequence;
            bVar.f15409n = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f15539a.f15396a;
        }

        public a h(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15410o = bVar.f15396a.getText(i10);
            this.f15539a.f15412q = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnCancelListener onCancelListener) {
            this.f15539a.f15414s = onCancelListener;
            return this;
        }

        public a j(DialogInterface.OnDismissListener onDismissListener) {
            this.f15539a.f15415t = onDismissListener;
            return this;
        }

        public a k(DialogInterface.OnKeyListener onKeyListener) {
            this.f15539a.f15416u = onKeyListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15404i = charSequence;
            bVar.f15406k = onClickListener;
            return this;
        }

        public a m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15418w = listAdapter;
            bVar.f15419x = onClickListener;
            bVar.f15389I = i10;
            bVar.f15388H = true;
            return this;
        }

        public a n(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15417v = charSequenceArr;
            bVar.f15419x = onClickListener;
            bVar.f15389I = i10;
            bVar.f15388H = true;
            return this;
        }

        public a o(int i10) {
            AlertController.b bVar = this.f15539a;
            bVar.f15401f = bVar.f15396a.getText(i10);
            return this;
        }

        public c p() {
            c create = create();
            create.show();
            return create;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15407l = bVar.f15396a.getText(i10);
            this.f15539a.f15409n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f15539a;
            bVar.f15404i = bVar.f15396a.getText(i10);
            this.f15539a.f15406k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f15539a.f15401f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f15539a;
            bVar.f15421z = view;
            bVar.f15420y = 0;
            bVar.f15385E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f15539a = new AlertController.b(new ContextThemeWrapper(context, c.l(context, i10)));
            this.f15540b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, l(context, i10));
    }

    static int l(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5421a.f23900o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button j(int i10) {
        return this.f15538f.c(i10);
    }

    public ListView k() {
        return this.f15538f.e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15538f.f();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f15538f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f15538f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f15538f.q(charSequence);
    }
}

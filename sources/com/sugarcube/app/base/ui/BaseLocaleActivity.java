package com.sugarcube.app.base.ui;

import JF.C13096c;
import OE.q;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.sugarcube.app.base.di.ContextWrapperEntryPoint;
import dH.C17158b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0007\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/app/base/ui/BaseLocaleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "layoutResID", "LXH/N;", "setContentView", "(I)V", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "LOE/q;", "z", "LOE/q;", "v0", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseLocaleActivity extends Hilt_BaseLocaleActivity {

    /* renamed from: z  reason: collision with root package name */
    public q f123246z;

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        if (context != null) {
            super.attachBaseContext(((ContextWrapperEntryPoint) C17158b.b(context, ContextWrapperEntryPoint.class)).getContextWrapper().a(context));
        } else {
            super.attachBaseContext(context);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C17542s.j(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C13096c.b(this, v0().getLocale());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13096c.b(this, v0().getLocale());
    }

    public void setContentView(int i10) {
        super.setContentView(i10);
        C13096c.b(this, v0().getLocale());
    }

    public final q v0() {
        q qVar = this.f123246z;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }

    public void setContentView(View view) {
        super.setContentView(view);
        C13096c.b(this, v0().getLocale());
    }
}

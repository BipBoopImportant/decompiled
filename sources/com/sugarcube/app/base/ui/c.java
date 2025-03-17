package com.sugarcube.app.base.ui;

import OE.q;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/ui/c;", "Landroid/content/ContextWrapper;", "Landroid/content/Context;", "appContext", "LOE/q;", "_sugarcube", "<init>", "(Landroid/content/Context;LOE/q;)V", "activityContext", "a", "(Landroid/content/Context;)Landroid/content/ContextWrapper;", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "b", "LOE/q;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final Context f123252a;

    /* renamed from: b  reason: collision with root package name */
    private final q f123253b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, q qVar) {
        super(context);
        C17542s.j(context, "appContext");
        C17542s.j(qVar, "_sugarcube");
        this.f123252a = context;
        this.f123253b = qVar;
    }

    public final ContextWrapper a(Context context) {
        C17542s.j(context, "activityContext");
        Resources resources = this.f123252a.getResources();
        C17542s.i(resources, "getResources(...)");
        Configuration configuration = resources.getConfiguration();
        C17542s.i(configuration, "getConfiguration(...)");
        LocaleList localeList = new LocaleList(new Locale[]{this.f123253b.getLocale()});
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        C17542s.g(createConfigurationContext);
        return new c(createConfigurationContext, this.f123253b);
    }
}

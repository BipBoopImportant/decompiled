package jH;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.C5187o;
import cH.C17062a;
import hH.C17324c;
import jH.C17413j;
import mH.C17599b;
import mH.C17601d;

/* renamed from: jH.g  reason: case insensitive filesystem */
public class C17410g implements C17599b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f143959a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f143960b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final C5187o f143961c;

    /* renamed from: jH.g$a */
    public interface a {
        C17324c t();
    }

    public C17410g(C5187o oVar) {
        this.f143961c = oVar;
    }

    private Object a() {
        C17601d.c(this.f143961c.getHost(), "Hilt Fragments must be attached before creating the component.");
        C17601d.d(this.f143961c.getHost() instanceof C17599b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f143961c.getHost().getClass());
        e(this.f143961c);
        return ((a) C17062a.a(this.f143961c.getHost(), a.class)).t().a(this.f143961c).g();
    }

    public static ContextWrapper b(Context context, C5187o oVar) {
        return new C17413j.a(context, oVar);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, C5187o oVar) {
        return new C17413j.a(layoutInflater, oVar);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* access modifiers changed from: protected */
    public void e(C5187o oVar) {
    }

    public Object g0() {
        if (this.f143959a == null) {
            synchronized (this.f143960b) {
                try {
                    if (this.f143959a == null) {
                        this.f143959a = a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f143959a;
    }
}

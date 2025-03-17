package x4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import uI.C18055d;
import uI.C18068q;
import x4.C8937a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b¢\u0006\u0004\b\u0007\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR,\u0010\"\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001c\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u001d\u0010!R$\u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00102\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001a¨\u00063"}, d2 = {"Lx4/b;", "Lx4/w;", "Lx4/a$b;", "Lx4/a;", "navigator", "", "route", "<init>", "(Lx4/a;Ljava/lang/String;)V", "LuI/d;", "", "", "LuI/q;", "Lx4/F;", "typeMap", "(Lx4/a;LuI/d;Ljava/util/Map;)V", "j", "()Lx4/a$b;", "Landroid/content/Context;", "i", "Landroid/content/Context;", "context", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "targetPackage", "Landroid/app/Activity;", "k", "LuI/d;", "getActivityClass", "()LuI/d;", "(LuI/d;)V", "activityClass", "l", "getAction", "setAction", "action", "Landroid/net/Uri;", "m", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "data", "n", "getDataPattern", "setDataPattern", "dataPattern", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x4.b  reason: case insensitive filesystem */
public final class C8938b extends w<C8937a.b> {

    /* renamed from: i  reason: collision with root package name */
    private Context f57491i;

    /* renamed from: j  reason: collision with root package name */
    private String f57492j;

    /* renamed from: k  reason: collision with root package name */
    private C18055d<? extends Activity> f57493k;

    /* renamed from: l  reason: collision with root package name */
    private String f57494l;

    /* renamed from: m  reason: collision with root package name */
    private Uri f57495m;

    /* renamed from: n  reason: collision with root package name */
    private String f57496n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8938b(C8937a aVar, String str) {
        super(aVar, str);
        C17542s.j(aVar, "navigator");
        C17542s.j(str, PlaceTypes.ROUTE);
        this.f57491i = aVar.m();
    }

    /* renamed from: j */
    public C8937a.b c() {
        C8937a.b bVar = (C8937a.b) super.c();
        bVar.a0(this.f57492j);
        C18055d<? extends Activity> dVar = this.f57493k;
        if (dVar != null) {
            bVar.X(new ComponentName(this.f57491i, C17603a.b(dVar)));
        }
        bVar.W(this.f57494l);
        bVar.Y(this.f57495m);
        bVar.Z(this.f57496n);
        return bVar;
    }

    public final void k(C18055d<? extends Activity> dVar) {
        this.f57493k = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8938b(C8937a aVar, C18055d<? extends Object> dVar, Map<C18068q, F<?>> map) {
        super(aVar, (C18055d<?>) dVar, map);
        C17542s.j(aVar, "navigator");
        C17542s.j(dVar, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        this.f57491i = aVar.m();
    }
}

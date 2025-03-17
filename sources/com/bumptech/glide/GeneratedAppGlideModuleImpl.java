package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.integration.okhttp3.a;
import com.ingka.ikea.app.imageloader.GlideConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;", "Lcom/bumptech/glide/GeneratedAppGlideModule;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/bumptech/glide/b;", "glide", "Lcom/bumptech/glide/i;", "registry", "LXH/N;", "a", "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/i;)V", "Lcom/bumptech/glide/c;", "builder", "b", "(Landroid/content/Context;Lcom/bumptech/glide/c;)V", "", "c", "()Z", "Lcom/ingka/ikea/app/imageloader/GlideConfiguration;", "Lcom/ingka/ikea/app/imageloader/GlideConfiguration;", "appGlideModule", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f46462b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final GlideConfiguration f46463a = new GlideConfiguration();

    public GeneratedAppGlideModuleImpl(Context context) {
        C17542s.j(context, "context");
    }

    public void a(Context context, b bVar, i iVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "glide");
        C17542s.j(iVar, "registry");
        new a().a(context, bVar, iVar);
        this.f46463a.a(context, bVar, iVar);
    }

    public void b(Context context, c cVar) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "builder");
        this.f46463a.b(context, cVar);
    }

    public boolean c() {
        return false;
    }
}

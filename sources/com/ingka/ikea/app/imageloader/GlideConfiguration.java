package com.ingka.ikea.app.imageloader;

import G7.f;
import HJ.C15854t;
import I7.h;
import a8.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.PictureDrawable;
import cH.C17062a;
import com.bumptech.glide.i;
import com.bumptech.glide.integration.okhttp3.b;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.core.logger.DslKt;
import fs.c;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tw.l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0002\f\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/imageloader/GlideConfiguration;", "LS7/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)J", "Lcom/bumptech/glide/c;", "builder", "LXH/N;", "b", "(Landroid/content/Context;Lcom/bumptech/glide/c;)V", "Lcom/bumptech/glide/b;", "glide", "Lcom/bumptech/glide/i;", "registry", "a", "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/i;)V", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GlideConfiguration extends S7.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71894a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/imageloader/GlideConfiguration$a;", "", "<init>", "()V", "", "KILO_BYTES", "I", "LOW_STORAGE_CACHE_SIZE_MB", "DEFAULT_CACHE_SIZE_MB", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/app/imageloader/GlideConfiguration$b;", "", "Ltw/l;", "b", "()Ltw/l;", "imageLoadingRetrofitClient", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        l b();
    }

    private final long d(Context context) {
        return context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null ? 20 : 50;
    }

    public void a(Context context, com.bumptech.glide.b bVar, i iVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "glide");
        C17542s.j(iVar, "registry");
        Object a10 = C17062a.a(context.getApplicationContext(), b.class);
        C17542s.i(a10, "get(...)");
        Class<InputStream> cls = InputStream.class;
        iVar.r(h.class, cls, new b.a(((b) a10).b().a()));
        Class<g> cls2 = g.class;
        iVar.q(cls2, PictureDrawable.class, new c()).c(cls, cls2, new fs.b());
    }

    public void b(Context context, com.bumptech.glide.c cVar) {
        Context context2 = context;
        com.bumptech.glide.c cVar2 = cVar;
        C17542s.j(context2, "context");
        C17542s.j(cVar2, "builder");
        long d10 = ((long) ImageMetadata.SHADING_MODE) * d(context);
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Initializing Glide with max cache size: " + d10 + " bytes", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = GlideConfiguration.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        cVar2.b(new f(context2, d10));
    }
}

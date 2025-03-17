package com.sugarcube.decorate.internal.shared.di;

import NE.C13286b;
import OE.C13313e;
import RF.C13548a;
import RF.l;
import android.content.Context;
import android.net.Uri;
import com.squareup.moshi.t;
import com.sugarcube.app.base.decorate.DecorateCompatibilityProvider;
import com.sugarcube.app.base.network.adapters.InstantJsonAdapter;
import com.sugarcube.app.base.network.adapters.UUIDJsonAdapter;
import com.sugarcube.app.base.network.adapters.UriJsonAdapter;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import java.time.Instant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate/internal/shared/di/DecorateModule;", "", "LRF/a;", "impl", "Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "bindDecorateCompatibilityProvider", "(LRF/a;)Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "Companion", "a", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DecorateModule {
    public static final a Companion = a.f126152a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/decorate/internal/shared/di/DecorateModule$a;", "", "<init>", "()V", "Lcom/squareup/moshi/t;", "b", "()Lcom/squareup/moshi/t;", "Landroid/content/Context;", "context", "LOE/e;", "a", "(Landroid/content/Context;)LOE/e;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f126152a = new a();

        private a() {
        }

        public final C13313e a(Context context) {
            C17542s.j(context, "context");
            return new C13313e(context, "com.sugarcube.decorate_engine:4.11.41");
        }

        public final t b() {
            Class<Instant> cls = Instant.class;
            Class<Uri> cls2 = Uri.class;
            Class<ModelScreenTransform> cls3 = ModelScreenTransform.class;
            t d10 = new t.b().b(UUID.class, new UUIDJsonAdapter().nullSafe()).b(cls, new InstantJsonAdapter().nullSafe()).b(cls2, new UriJsonAdapter().nullSafe()).c(new C13286b()).b(cls3, new l().nullSafe()).d();
            C17542s.i(d10, "build(...)");
            return d10;
        }
    }

    DecorateCompatibilityProvider bindDecorateCompatibilityProvider(C13548a aVar);
}

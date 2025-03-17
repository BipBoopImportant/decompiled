package com.sugarcube.app.base.data.source;

import XH.C16807N;
import XH.y;
import android.net.Uri;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.q;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "id", "", "modelUrl", "Landroid/net/Uri;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$3", f = "CatalogRepository.kt", l = {550}, m = "invokeSuspend")
final class CatalogRepository$cacheCatalogItem$3 extends l implements q<Integer, Uri, C17164e<? super File>, Object> {
    final /* synthetic */ int $flags;
    /* synthetic */ int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CatalogRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepository$cacheCatalogItem$3(int i10, CatalogRepository catalogRepository, C17164e<? super CatalogRepository$cacheCatalogItem$3> eVar) {
        super(3, eVar);
        this.$flags = i10;
        this.this$0 = catalogRepository;
    }

    public final Object invoke(int i10, Uri uri, C17164e<? super File> eVar) {
        CatalogRepository$cacheCatalogItem$3 catalogRepository$cacheCatalogItem$3 = new CatalogRepository$cacheCatalogItem$3(this.$flags, this.this$0, eVar);
        catalogRepository$cacheCatalogItem$3.I$0 = i10;
        catalogRepository$cacheCatalogItem$3.L$0 = uri;
        return catalogRepository$cacheCatalogItem$3.invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            int i11 = this.I$0;
            Uri uri = (Uri) this.L$0;
            boolean z10 = (this.$flags & 2) != 0;
            CatalogRepository catalogRepository = this.this$0;
            this.L$0 = uri;
            this.I$0 = i11;
            this.I$1 = z10 ? 1 : 0;
            this.label = 1;
            obj = catalogRepository.getAsset(i11, uri, z10, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            Uri uri2 = (Uri) this.L$0;
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), (Uri) obj2, (C17164e<? super File>) (C17164e) obj3);
    }
}

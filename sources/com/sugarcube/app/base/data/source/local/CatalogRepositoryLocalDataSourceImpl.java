package com.sugarcube.app.base.data.source.local;

import OE.C13309a;
import XH.C16807N;
import android.net.Uri;
import android.util.Log;
import com.sugarcube.app.base.data.source.CatalogRepositoryLocalDataSource;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.CatalogItem;
import dI.C17164e;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u0018\u00010\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH@¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00182 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f0\u000fH@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR2\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/sugarcube/app/base/data/source/local/CatalogRepositoryLocalDataSourceImpl;", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;", "LOE/a;", "appEnvironment", "<init>", "(LOE/a;)V", "", "itemId", "Landroid/net/Uri;", "assetUrl", "Ljava/io/File;", "cacheFileForItemUri", "(ILandroid/net/Uri;)Ljava/io/File;", "cacheDirForItem", "(I)Ljava/io/File;", "", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "getSalesDressedBedData", "(LdI/e;)Ljava/lang/Object;", "getItemAsset", "(ILandroid/net/Uri;LdI/e;)Ljava/lang/Object;", "assetFile", "assetFileLocation", "LXH/N;", "cacheItemAsset", "(Ljava/io/File;Ljava/io/File;LdI/e;)Ljava/lang/Object;", "data", "cacheSalesDressedBedData", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LOE/a;", "sdbData", "Ljava/util/Map;", "getBaseCacheDir", "()Ljava/io/File;", "baseCacheDir", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogRepositoryLocalDataSourceImpl implements CatalogRepositoryLocalDataSource {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DEFAULT_REPO_ROOT_DIR = "sugarcube-cache/catalog/";
    private final C13309a appEnvironment;
    private Map<String, ? extends Map<String, CatalogItem>> sdbData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/data/source/local/CatalogRepositoryLocalDataSourceImpl$Companion;", "", "<init>", "()V", "DEFAULT_REPO_ROOT_DIR", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CatalogRepositoryLocalDataSourceImpl(C13309a aVar) {
        C17542s.j(aVar, "appEnvironment");
        this.appEnvironment = aVar;
    }

    private final File cacheDirForItem(int i10) {
        File baseCacheDir = getBaseCacheDir();
        File file = new File(baseCacheDir, i10 + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final File cacheFileForItemUri(int i10, Uri uri) {
        File cacheDirForItem = cacheDirForItem(i10);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new File(cacheDirForItem, lastPathSegment);
    }

    private final File getBaseCacheDir() {
        return new File(this.appEnvironment.d(), DEFAULT_REPO_ROOT_DIR);
    }

    public Object cacheItemAsset(File file, File file2, C17164e<? super C16807N> eVar) {
        if (C17542s.e(file.getAbsolutePath(), file2.getAbsolutePath())) {
            b.e(Log.d(AnyKt.SUGARCUBE_TAG, "skip rename (" + file + " == " + file2 + ")"));
        } else {
            b.a(file.renameTo(file2));
        }
        return C16807N.f139792a;
    }

    public Object cacheSalesDressedBedData(Map<String, ? extends Map<String, CatalogItem>> map, C17164e<? super C16807N> eVar) {
        this.sdbData = map;
        return C16807N.f139792a;
    }

    public Object getItemAsset(int i10, Uri uri, C17164e<? super File> eVar) {
        return cacheFileForItemUri(i10, uri);
    }

    public Object getSalesDressedBedData(C17164e<? super Map<String, ? extends Map<String, CatalogItem>>> eVar) {
        return this.sdbData;
    }
}

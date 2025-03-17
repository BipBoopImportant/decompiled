package com.sugarcube.app.base.data;

import HJ.C15854t;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.F;
import com.sugarcube.core.logger.AnyKt;
import jI.C17423j;
import java.io.File;
import java.nio.charset.Charset;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/app/base/data/AssetCache;", "Lcom/sugarcube/app/base/data/Cache;", "Lcom/sugarcube/app/base/data/AssetItem;", "Ljava/io/File;", "baseDir", "", "max", "<init>", "(Ljava/io/File;J)V", "Landroid/net/Uri;", "uri", "", "getFileExtensionFromUri", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroidx/lifecycle/F;", "put", "(Landroid/net/Uri;)Landroidx/lifecycle/F;", "get", "remove", "Ljava/io/File;", "J", "getMax", "()J", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetCache extends Cache<AssetItem> {
    public static final int $stable = 8;
    private final File baseDir;
    private final long max;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssetCache(File file, long j10) {
        super(j10);
        C17542s.j(file, "baseDir");
        this.baseDir = file;
        this.max = j10;
        if (!file.exists()) {
            file.mkdirs();
        }
        File[] listFiles = file.listFiles(new a());
        for (File file2 : listFiles == null ? new File[0] : listFiles) {
            try {
                C17542s.g(file2);
                String obj = C15854t.z1(C17423j.i(file2, (Charset) null, 1, (Object) null)).toString();
                Uri parse = Uri.parse(obj);
                C17542s.i(parse, "parse(...)");
                put(obj, new AssetItem(parse, new File(this.baseDir, C17423j.t(file2)), 0, 0, 12, (DefaultConstructorMarker) null));
            } catch (Throwable th2) {
                Log.e(AnyKt.SUGARCUBE_TAG, "AssetCache error " + file2.getAbsolutePath(), th2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final boolean _init_$lambda$0(File file, String str) {
        C17542s.g(str);
        return C15854t.G(str, ".key", false, 2, (Object) null);
    }

    private final String getFileExtensionFromUri(Uri uri) {
        int y02;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || (y02 = C15854t.y0(lastPathSegment, '.', 0, false, 6, (Object) null)) == -1 || y02 >= lastPathSegment.length() - 1) {
            return null;
        }
        String substring = lastPathSegment.substring(y02 + 1);
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public final F<AssetItem> get(Uri uri) {
        C17542s.j(uri, "uri");
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        return get(uri2);
    }

    public final long getMax() {
        return this.max;
    }

    public final F<AssetItem> put(Uri uri) {
        String str;
        C17542s.j(uri, "uri");
        F<AssetItem> f10 = get(uri);
        if (f10 != null) {
            return f10;
        }
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        String fileExtensionFromUri = getFileExtensionFromUri(uri);
        UUID randomUUID = UUID.randomUUID();
        if (fileExtensionFromUri == null || fileExtensionFromUri.length() == 0) {
            str = "";
        } else {
            str = "." + fileExtensionFromUri;
        }
        File file = new File(this.baseDir, randomUUID + str);
        C17423j.l(new File(file.getAbsolutePath() + ".key"), uri2, (Charset) null, 2, (Object) null);
        return put(uri2, new AssetItem(uri, file, 0, 0, 12, (DefaultConstructorMarker) null));
    }

    public final F<AssetItem> remove(Uri uri) {
        C17542s.j(uri, "uri");
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        return remove(uri2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssetCache(File file, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? 0 : j10);
    }
}

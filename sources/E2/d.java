package E2;

import E2.k;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import com.adjust.sdk.Constants;
import j0.C5444A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import w2.C6211e;

class d {

    /* renamed from: a  reason: collision with root package name */
    private static final C5444A<c, ProviderInfo> f5964a = new C5444A<>(2);

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<byte[]> f5965b = new c();

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ContentProviderClient f5966a;

        b(Context context, Uri uri) {
            this.f5966a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f5966a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        public void close() {
            ContentProviderClient contentProviderClient = this.f5966a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        String f5967a;

        /* renamed from: b  reason: collision with root package name */
        String f5968b;

        /* renamed from: c  reason: collision with root package name */
        List<List<byte[]>> f5969c;

        c(String str, String str2, List<List<byte[]>> list) {
            this.f5967a = str;
            this.f5968b = str2;
            this.f5969c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f5967a, cVar.f5967a) && Objects.equals(this.f5968b, cVar.f5968b) && Objects.equals(this.f5969c, cVar.f5969c);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f5967a, this.f5968b, this.f5969c});
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : C6211e.c(resources, eVar.c());
    }

    static k.a e(Context context, List<e> list, CancellationSignal cancellationSignal) {
        V4.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = list.get(i10);
                ProviderInfo f10 = f(context.getPackageManager(), eVar, context.getResources());
                if (f10 == null) {
                    return k.a.b(1, (k.b[]) null);
                }
                arrayList.add(h(context, eVar, f10.authority, cancellationSignal));
            }
            k.a a10 = k.a.a(0, arrayList);
            V4.a.f();
            return a10;
        } finally {
            V4.a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        V4.a.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> d10 = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), d10);
            ProviderInfo d11 = f5964a.d(cVar);
            if (d11 != null) {
                return d11;
            }
            String e10 = eVar.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
            } else if (resolveContentProvider.packageName.equals(eVar.f())) {
                List<byte[]> b10 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(b10, f5965b);
                for (int i10 = 0; i10 < d10.size(); i10++) {
                    ArrayList arrayList = new ArrayList(d10.get(i10));
                    Collections.sort(arrayList, f5965b);
                    if (c(b10, arrayList)) {
                        f5964a.f(cVar, resolveContentProvider);
                        V4.a.f();
                        return resolveContentProvider;
                    }
                }
                V4.a.f();
                return null;
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + eVar.f());
            }
        } finally {
            V4.a.f();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    static k.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        a a10;
        Cursor cursor;
        ArrayList arrayList;
        Uri uri;
        boolean z10;
        String str2 = str;
        V4.a.c("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            a10 = a.a(context, build);
            cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            V4.a.c("ContentQueryWrapper.query");
            cursor = a10.b(build, strArr, "query = ?", new String[]{eVar.g()}, (String) null, cancellationSignal);
            V4.a.f();
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i10 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i11 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i12 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE;
                    if (columnIndex6 != -1) {
                        z10 = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            k.b a11 = k.b.a(uri, i11, i12, z10, i10);
                            arrayList3 = arrayList;
                            arrayList3.add(a11);
                        }
                    }
                    z10 = false;
                    k.b a112 = k.b.a(uri, i11, i12, z10, i10);
                    arrayList3 = arrayList;
                    arrayList3.add(a112);
                }
                arrayList2 = arrayList3;
            }
            if (cursor != null) {
                cursor.close();
            }
            a10.close();
            k.b[] bVarArr = (k.b[]) arrayList2.toArray(new k.b[0]);
            V4.a.f();
            return bVarArr;
        } catch (Throwable th2) {
            V4.a.f();
            throw th2;
        }
    }
}

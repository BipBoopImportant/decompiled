package androidx.emoji2.text;

import E2.e;
import H2.i;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f21541a;

        public a(b bVar) {
            this.f21541a = bVar == null ? e() : bVar;
        }

        private f.c a(Context context, e eVar) {
            if (eVar == null) {
                return null;
            }
            return new k(context, eVar);
        }

        private List<List<byte[]>> b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private e d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new e(str, str2, "emojicompat-emoji-font", b(this.f21541a.b(packageManager, str2)));
        }

        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0333d() : new c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r2.applicationInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean f(android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r0 = 1
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.a.f(android.content.pm.ProviderInfo):boolean");
        }

        private ProviderInfo g(PackageManager packageManager) {
            for (ResolveInfo a10 : this.f21541a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a11 = this.f21541a.a(a10);
                if (f(a11)) {
                    return a11;
                }
            }
            return null;
        }

        public f.c c(Context context) {
            return a(context, h(context));
        }

        /* access modifiers changed from: package-private */
        public e h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            i.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g10 = g(packageManager);
            if (g10 == null) {
                return null;
            }
            try {
                return d(g10, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                return null;
            }
        }
    }

    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw null;
        }

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            throw null;
        }
    }

    public static class c extends b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    public static class C0333d extends c {
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static k a(Context context) {
        return (k) new a((b) null).c(context);
    }
}

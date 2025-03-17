package androidx.core.app;

import H2.i;
import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;

public final class z {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f21141a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f21142b;

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<String> f21143c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<String> f21144d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<String> f21145e;

        /* renamed from: f  reason: collision with root package name */
        private ArrayList<Uri> f21146f;

        public a(Context context) {
            Activity activity;
            this.f21141a = (Context) i.g(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f21142b = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(ImageMetadata.LENS_APERTURE);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f21142b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.f21142b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        private void b(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f21142b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f21142b.putExtra(str, strArr);
        }

        public a a(Uri uri) {
            if (this.f21146f == null) {
                this.f21146f = new ArrayList<>();
            }
            this.f21146f.add(uri);
            return this;
        }

        public Intent c() {
            ArrayList<String> arrayList = this.f21143c;
            if (arrayList != null) {
                b("android.intent.extra.EMAIL", arrayList);
                this.f21143c = null;
            }
            ArrayList<String> arrayList2 = this.f21144d;
            if (arrayList2 != null) {
                b("android.intent.extra.CC", arrayList2);
                this.f21144d = null;
            }
            ArrayList<String> arrayList3 = this.f21145e;
            if (arrayList3 != null) {
                b("android.intent.extra.BCC", arrayList3);
                this.f21145e = null;
            }
            ArrayList<Uri> arrayList4 = this.f21146f;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.f21142b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f21146f;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f21142b.removeExtra("android.intent.extra.STREAM");
                    this.f21142b.setClipData((ClipData) null);
                    Intent intent = this.f21142b;
                    intent.setFlags(intent.getFlags() & -2);
                } else {
                    this.f21142b.putExtra("android.intent.extra.STREAM", this.f21146f.get(0));
                    z.a(this.f21142b, this.f21146f);
                }
            } else {
                this.f21142b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f21142b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f21146f);
                z.a(this.f21142b, this.f21146f);
            }
            return this.f21142b;
        }

        public a d(Uri uri) {
            this.f21146f = null;
            if (uri != null) {
                a(uri);
            }
            return this;
        }

        public a e(String str) {
            this.f21142b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f21142b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public a g(String str) {
            this.f21142b.setType(str);
            return this;
        }
    }

    static void a(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent) null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i10 = 1; i10 < size; i10++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i10)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}

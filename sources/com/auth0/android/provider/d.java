package com.auth0.android.provider;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f46323b = Arrays.asList(new String[]{"com.android.chrome", "com.google.android.apps.chrome", "com.android.chrome.beta", "com.android.chrome.dev"});

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f46324a;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private List<String> f46325a;

        /* synthetic */ b(a aVar) {
            this();
        }

        public d a() {
            return new d(this.f46325a, (a) null);
        }

        private b() {
        }
    }

    /* synthetic */ d(List list, a aVar) {
        this((List<String>) list);
    }

    private String b(List<String> list, List<String> list2, String str) {
        if (str != null && list2.contains(str) && list.contains(str)) {
            return str;
        }
        for (String next : list2) {
            if (list.contains(next)) {
                return next;
            }
        }
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    private List<String> c(List<String> list, String str) {
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        arrayList.addAll(f46323b);
        return arrayList;
    }

    public static b d() {
        return new b((a) null);
    }

    /* access modifiers changed from: package-private */
    public String a(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f46324a != null;
        for (ResolveInfo next : queryIntentActivities) {
            if (!z10 || this.f46324a.contains(next.activityInfo.packageName)) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(next.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList2.add(next.activityInfo.packageName);
                } else {
                    arrayList.add(next.activityInfo.packageName);
                }
            }
        }
        List<String> c10 = c(this.f46324a, str);
        String b10 = b(arrayList2, c10, str);
        return b10 != null ? b10 : b(arrayList, c10, str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f46324a);
    }

    private d(List<String> list) {
        this.f46324a = list;
    }

    protected d(Parcel parcel) {
        this.f46324a = parcel.createStringArrayList();
    }
}

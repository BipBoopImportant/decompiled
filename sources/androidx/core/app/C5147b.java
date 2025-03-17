package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import u2.C6012a;

/* renamed from: androidx.core.app.b  reason: case insensitive filesystem */
public class C5147b extends C6012a {

    /* renamed from: androidx.core.app.b$a */
    static class a {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    static class C0325b {
        /* access modifiers changed from: package-private */
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    static class c {
        static <T> T a(Activity activity, int i10) {
            return activity.requireViewById(i10);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    static class d {
        @SuppressLint({"BanUncheckedReflection"})
        static boolean a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(activity.getApplication().getPackageManager(), new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: androidx.core.app.b$e */
    static class e {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$f */
    public interface f {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* renamed from: androidx.core.app.b$g */
    static class g extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        private final A f20954a;

        g(A a10) {
            this.f20954a = a10;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f20954a.b(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f20954a.c(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f20954a.d(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f20954a.e(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f20954a.f(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f20954a.g(list, list2, list3);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f20954a.h(list, list2, new c(onSharedElementsReadyListener));
        }
    }

    public static boolean A(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i10 >= 32 ? e.a(activity, str) : i10 == 31 ? d.a(activity, str) : C0325b.c(activity, str);
        }
        return false;
    }

    public static void B(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void C(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void D(Activity activity) {
        a.e(activity);
    }

    public static void r(Activity activity) {
        activity.finishAffinity();
    }

    public static void s(Activity activity) {
        a.a(activity);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Activity activity) {
        if (!activity.isFinishing() && !e.i(activity)) {
            activity.recreate();
        }
    }

    public static void u(Activity activity) {
        a.b(activity);
    }

    public static void v(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C5146a(activity));
        }
    }

    public static void w(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (i11 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i11])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
                i11++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
        if (size > 0) {
            if (size != strArr.length) {
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            } else {
                return;
            }
        }
        if (activity instanceof f) {
            ((f) activity).validateRequestPermissionsRequestCode(i10);
        }
        C0325b.b(activity, strArr, i10);
    }

    public static <T extends View> T x(Activity activity, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) c.a(activity, i10);
        }
        T findViewById = activity.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void y(Activity activity, A a10) {
        a.c(activity, a10 != null ? new g(a10) : null);
    }

    public static void z(Activity activity, A a10) {
        a.d(activity, a10 != null ? new g(a10) : null);
    }
}

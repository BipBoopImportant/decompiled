package com.google.android.gms.measurement.internal;

import J4.a;
import K9.C6620s;
import S9.c;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.measurement.V0;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.slf4j.Marker;
import sa.D;
import sa.G;
import sa.H;
import sa.J;

public final class Q5 extends C7664p3 {

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f49927i = {"firebase_", "google_", "ga_"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f49928j = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f49929c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f49930d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f49931e;

    /* renamed from: f  reason: collision with root package name */
    private a f49932f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f49933g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f49934h = null;

    Q5(P2 p22) {
        super(p22);
    }

    public static Bundle B(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean B0(String str) {
        String a10 = K.f49773m0.a(null);
        return a10.equals(Marker.ANY_MARKER) || Arrays.asList(a10.split(",")).contains(str);
    }

    public static Bundle E(List<P5> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (P5 next : list) {
            String str = next.f49915e;
            if (str != null) {
                bundle.putString(next.f49912b, str);
            } else {
                Long l10 = next.f49914d;
                if (l10 != null) {
                    bundle.putLong(next.f49912b, l10.longValue());
                } else {
                    Double d10 = next.f49917g;
                    if (d10 != null) {
                        bundle.putDouble(next.f49912b, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    static boolean E0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private final Object G(int i10, Object obj, boolean z10, boolean z11, String str) {
        Bundle C10;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return H(String.valueOf(obj), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (C10 = C((Bundle) parcelable, (String) null)) != null && !C10.isEmpty()) {
                    arrayList.add(C10);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    static boolean G0(String str) {
        C6620s.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String H(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        String substring = str.substring(0, str.offsetByCodePoints(0, i10));
        return substring + "...";
    }

    public static boolean H0(String str) {
        for (String equals : f49928j) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int I0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!m0("event param", (String[]) null, str)) {
            return 14;
        }
        return !h0("event param", 40, str) ? 3 : 0;
    }

    private static void J(Bundle bundle, int i10, String str, Object obj) {
        if (t0(bundle, i10)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj != null) {
                C6620s.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    private final int J0(String str) {
        if (!A0("event param", str)) {
            return 3;
        }
        if (!m0("event param", (String[]) null, str)) {
            return 14;
        }
        return !h0("event param", 40, str) ? 3 : 0;
    }

    private static int K0(String str) {
        if ("_ldl".equals(str)) {
            return RecyclerView.n.FLAG_MOVED;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean L0(String str) {
        C6620s.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest Q0() {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @TargetApi(30)
    private final boolean U0() {
        Integer num;
        if (this.f49933g == null) {
            a O02 = O0();
            boolean z10 = false;
            if (O02 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = O02.b().get(10000, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        num2 = num;
                        f().J().b("Measurement manager api exception", e);
                        this.f49933g = Boolean.FALSE;
                        num = num2;
                        f().I().b("Measurement manager api status result", num);
                        return this.f49933g.booleanValue();
                    } catch (ExecutionException e11) {
                        e = e11;
                        num2 = num;
                        f().J().b("Measurement manager api exception", e);
                        this.f49933g = Boolean.FALSE;
                        num = num2;
                        f().I().b("Measurement manager api status result", num);
                        return this.f49933g.booleanValue();
                    } catch (InterruptedException e12) {
                        e = e12;
                        num2 = num;
                        f().J().b("Measurement manager api exception", e);
                        this.f49933g = Boolean.FALSE;
                        num = num2;
                        f().I().b("Measurement manager api status result", num);
                        return this.f49933g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        f().J().b("Measurement manager api exception", e);
                        this.f49933g = Boolean.FALSE;
                        num = num2;
                        f().I().b("Measurement manager api status result", num);
                        return this.f49933g.booleanValue();
                    }
                }
                this.f49933g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e14) {
                e = e14;
                f().J().b("Measurement manager api exception", e);
                this.f49933g = Boolean.FALSE;
                num = num2;
                f().I().b("Measurement manager api status result", num);
                return this.f49933g.booleanValue();
            }
            f().I().b("Measurement manager api status result", num);
        }
        return this.f49933g.booleanValue();
    }

    public static void V(C7630k4 k4Var, Bundle bundle, boolean z10) {
        if (bundle != null && k4Var != null && (!bundle.containsKey("_sc") || z10)) {
            String str = k4Var.f50210a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = k4Var.f50211b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", k4Var.f50212c);
        } else if (bundle != null && k4Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void W(S5 s52, int i10, String str, String str2, int i11) {
        X(s52, (String) null, i10, str, str2, i11);
    }

    static void X(S5 s52, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        t0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        s52.a(str, "_err", bundle);
    }

    private final void Y(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        int i11;
        int i12;
        String str4;
        int i13;
        int i14;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            int i15 = a().h().a0(231100000, true) ? 35 : 0;
            int i16 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    i10 = !z10 ? J0(str6) : 0;
                    if (i10 == 0) {
                        i10 = I0(str6);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    J(bundle2, i10, str6, i10 == 3 ? str6 : null);
                    bundle2.remove(str6);
                    i11 = i15;
                } else {
                    if (f0(bundle2.get(str6))) {
                        f().K().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i13 = 22;
                        str4 = str6;
                        i11 = i15;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i11 = i15;
                        i13 = v(str, str2, str6, bundle2.get(str6), bundle, list, z10, false);
                    }
                    if (i13 == 0 || "_ev".equals(str4)) {
                        if (!G0(str4) || l0(str4, G.f56084d)) {
                            i14 = i11;
                        } else {
                            int i17 = i16 + 1;
                            if (!a0(231100000, true)) {
                                f().F().c("Item array not supported on client's version of Google Play Services (Android Only)", d().c(str5), d().a(bundle2));
                                t0(bundle2, 23);
                                bundle2.remove(str4);
                                i14 = i11;
                            } else {
                                i14 = i11;
                                if (i17 > i14) {
                                    C7614i2 F10 = f().F();
                                    F10.c("Item can't contain more than " + i14 + " item-scoped custom params", d().c(str5), d().a(bundle2));
                                    t0(bundle2, 28);
                                    bundle2.remove(str4);
                                }
                            }
                            i16 = i17;
                        }
                        i12 = i14;
                    } else {
                        J(bundle2, i13, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    }
                }
                i12 = i11;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean b0(android.content.Context r4) {
        /*
            K9.C6620s.l(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q5.b0(android.content.Context):boolean");
    }

    static boolean c0(Context context, boolean z10) {
        C6620s.l(context);
        return s0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean d0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean e0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean f0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean k0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C6620s.l(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty || !isEmpty2) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    private static boolean l0(String str, String[] strArr) {
        C6620s.l(strArr);
        for (String equals : strArr) {
            if (Objects.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    static byte[] o0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> r0(List<C7597g> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C7597g next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f50134a);
            bundle.putString("origin", next.f50135b);
            bundle.putLong("creation_timestamp", next.f50137d);
            bundle.putString("name", next.f50136c.f49912b);
            D.b(bundle, C6620s.l(next.f50136c.x()));
            bundle.putBoolean("active", next.f50138e);
            String str = next.f50139f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            J j10 = next.f50140g;
            if (j10 != null) {
                bundle.putString("timed_out_event_name", j10.f49672a);
                F f10 = j10.f49673b;
                if (f10 != null) {
                    bundle.putBundle("timed_out_event_params", f10.J());
                }
            }
            bundle.putLong("trigger_timeout", next.f50141h);
            J j11 = next.f50142i;
            if (j11 != null) {
                bundle.putString("triggered_event_name", j11.f49672a);
                F f11 = j11.f49673b;
                if (f11 != null) {
                    bundle.putBundle("triggered_event_params", f11.J());
                }
            }
            bundle.putLong("triggered_timestamp", next.f50136c.f49913c);
            bundle.putLong("time_to_live", next.f50143j);
            J j12 = next.f50144k;
            if (j12 != null) {
                bundle.putString("expired_event_name", j12.f49672a);
                F f12 = j12.f49673b;
                if (f12 != null) {
                    bundle.putBundle("expired_event_params", f12.J());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean s0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q5.s0(android.content.Context, java.lang.String):boolean");
    }

    private static boolean t0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List<java.lang.String> r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.k()
            boolean r2 = f0(r17)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x008a
            if (r21 == 0) goto L_0x0087
            java.lang.String[] r2 = sa.G.f56083c
            boolean r2 = l0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.P2 r2 = r7.f50228a
            com.google.android.gms.measurement.internal.s4 r2 = r2.K()
            boolean r2 = r2.j0()
            if (r2 != 0) goto L_0x002f
            r0 = 25
            return r0
        L_0x002f:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0038
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x0043
        L_0x0038:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x008a
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x0043:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x008a
            com.google.android.gms.measurement.internal.h2 r9 = r13.f()
            com.google.android.gms.measurement.internal.i2 r9 = r9.K()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.d(r10, r3, r8, r5)
            if (r2 == 0) goto L_0x006a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x0083
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0083
        L_0x006a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x0083
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x0083
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x0083:
            r1 = 17
            r9 = r1
            goto L_0x008b
        L_0x0087:
            r0 = 21
            return r0
        L_0x008a:
            r9 = r4
        L_0x008b:
            boolean r1 = E0(r15)
            r2 = 0
            if (r1 != 0) goto L_0x00a2
            boolean r1 = E0(r16)
            if (r1 == 0) goto L_0x0099
            goto L_0x00a2
        L_0x0099:
            com.google.android.gms.measurement.internal.i r1 = r13.a()
            int r1 = r1.o(r2, r4)
            goto L_0x00aa
        L_0x00a2:
            com.google.android.gms.measurement.internal.i r1 = r13.a()
            int r1 = r1.x(r2, r4)
        L_0x00aa:
            boolean r1 = r13.j0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r9
        L_0x00b1:
            if (r21 == 0) goto L_0x013d
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00c8
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.Y(r1, r2, r3, r4, r5, r6)
            goto L_0x013c
        L_0x00c8:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00fd
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r4
        L_0x00d1:
            if (r12 >= r11) goto L_0x013c
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.h2 r1 = r13.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.K()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x013d
        L_0x00eb:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.Y(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00d1
        L_0x00fd:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x013d
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
        L_0x0108:
            if (r4 >= r11) goto L_0x013c
            java.lang.Object r0 = r10.get(r4)
            int r12 = r4 + 1
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x012b
            com.google.android.gms.measurement.internal.h2 r1 = r13.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.K()
            if (r0 == 0) goto L_0x0123
            java.lang.Class r0 = r0.getClass()
            goto L_0x0125
        L_0x0123:
            java.lang.String r0 = "null"
        L_0x0125:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x013d
        L_0x012b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.Y(r1, r2, r3, r4, r5, r6)
            r4 = r12
            goto L_0x0108
        L_0x013c:
            return r9
        L_0x013d:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q5.v(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] v0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static long w(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    static int w0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static long y(F f10) {
        long j10 = 0;
        if (f10 == null) {
            return 0;
        }
        Iterator<String> it = f10.iterator();
        while (it.hasNext()) {
            Object t02 = f10.t0(it.next());
            if (t02 instanceof Parcelable[]) {
                j10 += (long) ((Parcelable[]) t02).length;
            }
        }
        return j10;
    }

    static long z(byte[] bArr) {
        C6620s.l(bArr);
        int i10 = 0;
        C6620s.p(bArr.length > 0);
        int length = bArr.length - 1;
        long j10 = 0;
        while (length >= 0 && length >= bArr.length - 8) {
            j10 += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
            length--;
        }
        return j10;
    }

    private final boolean z0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e10 = c.a(context).e(str, 64);
            if (e10 == null || (signatureArr = e10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e11) {
            f().E().b("Error obtaining certificate", e11);
            return true;
        } catch (PackageManager.NameNotFoundException e12) {
            f().E().b("Package name not found", e12);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle A(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str9 = uri2.getQueryParameter("utm_campaign");
                str8 = uri2.getQueryParameter("utm_source");
                str7 = uri2.getQueryParameter("utm_medium");
                str6 = uri2.getQueryParameter("gclid");
                str5 = uri2.getQueryParameter("gbraid");
                str4 = uri2.getQueryParameter("utm_id");
                str3 = uri2.getQueryParameter("dclid");
                str2 = uri2.getQueryParameter("srsltid");
                str = uri2.getQueryParameter("sfmc_id");
            } else {
                str9 = null;
                str8 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str9) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str9)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str9);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("source", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString(Constants.MEDIUM, str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("gclid", str6);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri2.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri2.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri2.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri2.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri2.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri2.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign_id", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("dclid", str3);
            }
            String queryParameter7 = uri2.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri2.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri2.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("srsltid", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str10, str);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            f().J().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean A0(String str, String str2) {
        if (str2 == null) {
            f().F().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            f().F().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                f().F().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    f().F().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle C(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object q02 = q0(next, bundle.get(next));
                if (q02 == null) {
                    f().K().b("Param value can't be null", d().f(next));
                } else {
                    M(bundle2, next, q02);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final boolean C0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().R().equals(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle D(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = sa.H.f56088d
            boolean r13 = l0(r10, r0)
            if (r11 == 0) goto L_0x00ea
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.i r0 = r19.a()
            int r8 = r0.y()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0047
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r0 = r17
            goto L_0x0056
        L_0x0047:
            if (r24 != 0) goto L_0x004e
            int r0 = r9.J0(r7)
            goto L_0x0050
        L_0x004e:
            r0 = r17
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.I0(r7)
        L_0x0056:
            if (r0 == 0) goto L_0x0066
            r1 = 3
            if (r0 != r1) goto L_0x005d
            r1 = r7
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            J(r15, r0, r7, r1)
            r15.remove(r7)
            r9 = r8
            goto L_0x00a2
        L_0x0066:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r9 = r8
            r8 = r13
            int r0 = r0.v(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0087
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            J(r15, r0, r14, r1)
            goto L_0x00a6
        L_0x0087:
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a6
            r1 = 21
            if (r0 != r1) goto L_0x0097
            r7 = r10
            goto L_0x0098
        L_0x0097:
            r7 = r14
        L_0x0098:
            java.lang.Object r1 = r11.get(r14)
            J(r15, r0, r7, r1)
            r15.remove(r14)
        L_0x00a2:
            r8 = r9
            r9 = r19
            goto L_0x002e
        L_0x00a6:
            boolean r0 = G0(r14)
            if (r0 == 0) goto L_0x00a2
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x00e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Event can't contain more than "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.h2 r2 = r19.f()
            com.google.android.gms.measurement.internal.i2 r2 = r2.F()
            com.google.android.gms.measurement.internal.e2 r3 = r19.d()
            java.lang.String r3 = r3.c(r10)
            com.google.android.gms.measurement.internal.e2 r4 = r19.d()
            java.lang.String r4 = r4.a(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            t0(r15, r1)
            r15.remove(r14)
        L_0x00e5:
            r18 = r0
            goto L_0x00a2
        L_0x00e8:
            r14 = r15
            goto L_0x00eb
        L_0x00ea:
            r14 = 0
        L_0x00eb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q5.D(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final boolean D0(String str) {
        k();
        if (c.a(zza()).a(str) == 0) {
            return true;
        }
        f().D().b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final J F(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (t(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle D10 = D(str, str2, bundle3, f.a("_o"), true);
            if (z10) {
                D10 = C(D10, str);
            }
            C6620s.l(D10);
            return new J(str2, new F(D10), str3, j10);
        }
        f().E().b("Invalid conditional property event name", d().g(str2));
        throw new IllegalArgumentException();
    }

    public final int F0() {
        if (this.f49934h == null) {
            this.f49934h = Integer.valueOf(b.f().a(zza()) / 1000);
        }
        return this.f49934h.intValue();
    }

    public final URL I(long j10, String str, String str2, long j11, String str3) {
        try {
            C6620s.f(str2);
            C6620s.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j10), Integer.valueOf(F0())}), str2, str, Long.valueOf(j11)});
            if (str.equals(a().S())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (MalformedURLException e10) {
            e = e10;
            f().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            f().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void K(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            f().J().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* access modifiers changed from: package-private */
    public final void L(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    h().M(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void M(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                f().K().c("Not putting event parameter. Invalid value type. name, type", d().f(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long M0() {
        k();
        if (!B0(this.f50228a.A().E())) {
            return 0;
        }
        long j10 = Build.VERSION.SDK_INT < 30 ? 4 : SdkExtensions.getExtensionVersion(30) < 4 ? 8 : w0() < K.f49761g0.a(null).intValue() ? 16 : 0;
        if (!D0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !U0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1;
        }
        return j10;
    }

    public final void N(V0 v02, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f50228a.f().J().b("Error returning int value to wrapper", e10);
        }
    }

    public final long N0() {
        long andIncrement;
        long j10;
        if (this.f49930d.get() == 0) {
            synchronized (this.f49930d) {
                long nextLong = new Random(System.nanoTime() ^ zzb().a()).nextLong();
                int i10 = this.f49931e + 1;
                this.f49931e = i10;
                j10 = nextLong + ((long) i10);
            }
            return j10;
        }
        synchronized (this.f49930d) {
            this.f49930d.compareAndSet(-1, 1);
            andIncrement = this.f49930d.getAndIncrement();
        }
        return andIncrement;
    }

    public final void O(V0 v02, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f50228a.f().J().b("Error returning long value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final a O0() {
        if (this.f49932f == null) {
            this.f49932f = a.a(zza());
        }
        return this.f49932f;
    }

    public final void P(V0 v02, Bundle bundle) {
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f50228a.f().J().b("Error returning bundle value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final String P0() {
        byte[] bArr = new byte[16];
        R0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void Q(V0 v02, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f50228a.f().J().b("Error returning string value to wrapper", e10);
        }
    }

    public final void R(V0 v02, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f50228a.f().J().b("Error returning bundle list to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom R0() {
        k();
        if (this.f49929c == null) {
            this.f49929c = new SecureRandom();
        }
        return this.f49929c;
    }

    public final void S(V0 v02, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f50228a.f().J().b("Error returning boolean value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean S0() {
        k();
        return M0() == 1;
    }

    public final void T(V0 v02, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f50228a.f().J().b("Error returning byte array to wrapper", e10);
        }
    }

    public final boolean T0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void U(C7628k2 k2Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(k2Var.f50206d.keySet())) {
            if (G0(str) && (i11 = i11 + 1) > i10) {
                f().F().c("Event can't contain more than " + i10 + " params", d().c(k2Var.f50203a), d().a(k2Var.f50206d));
                t0(k2Var.f50206d, 5);
                k2Var.f50206d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void Z(Parcelable[] parcelableArr, int i10) {
        C6620s.l(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (G0(str) && !l0(str, G.f56084d) && (i11 = i11 + 1) > i10) {
                    f().F().c("Param can't contain more than " + i10 + " item-scoped custom parameters", d().f(str), d().a(bundle));
                    t0(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final boolean a0(int i10, boolean z10) {
        Boolean a02 = this.f50228a.K().a0();
        if (F0() < i10 / 1000) {
            return a02 != null && !a02.booleanValue();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean g0(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString(Constants.DEEPLINK, str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            f().E().b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    /* access modifiers changed from: package-private */
    public final boolean h0(String str, int i10, String str2) {
        if (str2 == null) {
            f().F().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            f().F().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: package-private */
    public final boolean i0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (L0(str)) {
                return true;
            }
            if (this.f50228a.r()) {
                f().F().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C7607h2.t(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f50228a.r()) {
                f().F().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (L0(str2)) {
            return true;
        } else {
            f().F().b("Invalid admob_app_id. Analytics disabled.", C7607h2.t(str2));
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* access modifiers changed from: package-private */
    public final boolean j0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                f().K().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* access modifiers changed from: protected */
    public final void l() {
        k();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                f().J().a("Utils falling back to Random for random id");
            }
        }
        this.f49930d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    public final boolean m0(String str, String[] strArr, String str2) {
        return n0(str, strArr, (String[]) null, str2);
    }

    /* access modifiers changed from: package-private */
    public final boolean n0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            f().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        C6620s.l(str2);
        for (String startsWith : f49927i) {
            if (str2.startsWith(startsWith)) {
                f().F().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !l0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && l0(str2, strArr2)) {
            return true;
        }
        f().F().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int p0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!m0("user property", J.f56089a, str)) {
            return 15;
        }
        return !h0("user property", 24, str) ? 6 : 0;
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    /* access modifiers changed from: package-private */
    public final Object q0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return G(a().x((String) null, false), obj, true, true, (String) null);
        }
        return G(E0(str) ? a().x((String) null, false) : a().o((String) null, false), obj, false, true, (String) null);
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    public final int s(int i10) {
        return b.f().h(zza(), d.f48050a);
    }

    /* access modifiers changed from: package-private */
    public final int t(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (!n0("event", H.f56085a, H.f56086b, str)) {
            return 13;
        }
        return !h0("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int u(String str, Object obj) {
        return "_ldl".equals(str) ? j0("user property referrer", str, K0(str), obj) : j0("user property", str, K0(str), obj) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final boolean u0(String str, String str2) {
        if (str2 == null) {
            f().F().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            f().F().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        f().F().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            f().F().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final long x(Context context, String str) {
        k();
        C6620s.l(context);
        C6620s.f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest Q02 = Q0();
        if (Q02 == null) {
            f().E().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!z0(context, str)) {
                    Signature[] signatureArr = c.a(context).e(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return z(Q02.digest(signatureArr[0].toByteArray()));
                    }
                    f().J().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                f().E().b("Package name not found", e10);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final long x0(String str) {
        if (zza().getPackageManager() == null) {
            return 0;
        }
        int i10 = 0;
        try {
            ApplicationInfo c10 = c.a(zza()).c(str, 0);
            if (c10 != null) {
                i10 = c10.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            f().H().b("PackageManager failed to find running app: app_id", str);
        }
        return (long) i10;
    }

    /* access modifiers changed from: package-private */
    public final Object y0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return G(K0(str), obj, true, false, (String) null);
        }
        return G(K0(str), obj, false, false, (String) null);
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}

package a9;

import D8.c;
import G8.h;
import HJ.C15854t;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import YH.U;
import android.content.Context;
import com.contentsquare.android.sdk.C7117c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;
import tI.C17974j;

public final class V6 {

    /* renamed from: a  reason: collision with root package name */
    public final h f42355a;

    /* renamed from: b  reason: collision with root package name */
    public final C7117c f42356b;

    /* renamed from: c  reason: collision with root package name */
    public final C6815e1 f42357c;

    /* renamed from: d  reason: collision with root package name */
    public final c f42358d = new c("EventStorageManager");

    /* renamed from: e  reason: collision with root package name */
    public final String f42359e;

    /* renamed from: f  reason: collision with root package name */
    public String f42360f;

    /* renamed from: g  reason: collision with root package name */
    public int f42361g;

    /* renamed from: h  reason: collision with root package name */
    public int f42362h;

    /* renamed from: i  reason: collision with root package name */
    public int f42363i;

    public V6(Context context, C7117c cVar, C6815e1 e1Var) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "session");
        C17542s.j(e1Var, "userIdRestoreHelper");
        h hVar = new h();
        String absolutePath = context.getFilesDir().getAbsolutePath();
        C17542s.i(absolutePath, "context.filesDir.absolutePath");
        C17542s.j(hVar, "storageUtil");
        C17542s.j(absolutePath, "appFilesLocation");
        C17542s.j(cVar, "session");
        C17542s.j(e1Var, "userIdRestoreHelper");
        this.f42355a = hVar;
        this.f42356b = cVar;
        this.f42357c = e1Var;
        this.f42359e = absolutePath + File.separator + "cs";
        this.f42362h = -1;
        h();
    }

    public final int a(int i10) {
        Integer num;
        int i11;
        int i12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42359e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("evts");
        sb2.append(str);
        sb2.append(i10);
        String[] n10 = this.f42355a.n(sb2.toString());
        if (n10 == null || n10.length == 0) {
            num = null;
        } else {
            String str2 = n10[0];
            try {
                i11 = Integer.parseInt(str2);
            } catch (NumberFormatException e10) {
                c cVar = this.f42358d;
                H1.a(cVar, "[initBucketNumberAndSize] trying to convert the bucket : " + str2 + " to an integer but failed", e10);
                i11 = 0;
            }
            num = Integer.valueOf(i11);
            U t10 = new C17974j(1, C16870n.n0(n10)).iterator();
            while (t10.hasNext()) {
                String str3 = n10[t10.c()];
                try {
                    i12 = Integer.parseInt(str3);
                } catch (NumberFormatException e11) {
                    c cVar2 = this.f42358d;
                    H1.a(cVar2, "[initBucketNumberAndSize] trying to convert the bucket : " + str3 + " to an integer but failed", e11);
                    i12 = 0;
                }
                Integer valueOf = Integer.valueOf(i12);
                if (num.compareTo(valueOf) < 0) {
                    num = valueOf;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final List<Integer> b(String str) {
        int i10;
        String[] n10 = this.f42355a.n(str);
        if (n10 == null) {
            this.f42358d.l("error while listing folder, returning an empty array.");
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList(n10.length);
        for (String str2 : n10) {
            try {
                i10 = Integer.parseInt(str2);
            } catch (NumberFormatException e10) {
                H1.a(this.f42358d, "Failed to parse the file name " + str2 + " to integer", e10);
                i10 = -1;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public final synchronized void c() {
        this.f42361g++;
        this.f42363i = 0;
        h hVar = this.f42355a;
        String str = this.f42360f;
        if (str == null) {
            C17542s.z("sessionStoragePath");
            str = null;
        }
        hVar.o(str);
        int i10 = this.f42362h;
        int i11 = this.f42361g;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f42359e);
        String str2 = File.separator;
        sb3.append(str2);
        sb3.append("evts");
        sb3.append(str2);
        sb3.append(i10);
        sb2.append(sb3.toString());
        sb2.append(str2);
        sb2.append(i11);
        this.f42355a.r(new File(sb2.toString()));
    }

    public final synchronized void d(int i10, int i11) {
        try {
            h hVar = this.f42355a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f42359e);
            String str = File.separator;
            sb2.append(str);
            sb2.append("evts");
            sb2.append(str);
            sb2.append(i10);
            sb2.append(str);
            sb2.append(i11);
            if (!hVar.b(sb2.toString())) {
                this.f42358d.h("failed to delete file for session " + i10 + ", bucket " + i11);
            }
            String str2 = this.f42359e + str + "evts" + str + i10;
            String[] n10 = this.f42355a.n(str2);
            if (n10 == null || n10.length == 0) {
                this.f42355a.b(str2);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void e(JSONObject jSONObject, int i10, int i11) {
        try {
            String jSONObject2 = jSONObject.toString();
            C17542s.i(jSONObject2, "event.toString()");
            String Q10 = C15854t.Q(jSONObject2, "\n", "", false, 4, (Object) null);
            this.f42358d.f("Storing json to Session " + i10 + ", bucket " + i11 + ": " + Q10);
            h hVar = this.f42355a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f42359e);
            String str = File.separator;
            sb2.append(str);
            sb2.append("evts");
            sb2.append(str);
            sb2.append(i10);
            hVar.o(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f42359e + str + "evts" + str + i10);
            sb3.append(str);
            sb3.append(i11);
            String sb4 = sb3.toString();
            File e10 = this.f42355a.e(sb4);
            if (e10.exists()) {
                if (e10.length() == 0) {
                }
                this.f42355a.t(sb4, Q10 + 10, true);
            }
            String a10 = this.f42357c.a();
            if (a10 != null) {
                Q10 = "cs_user_id:" + a10 + 10 + Q10;
            }
            this.f42355a.t(sb4, Q10 + 10, true);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized v<String, List<JSONObject>> f(int i10, int i11) {
        String a10;
        ArrayList arrayList;
        c cVar = this.f42358d;
        cVar.f("Retrieving bucket content for session " + i10 + " bucket " + i11 + ' ');
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42359e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("evts");
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        v<String, List<String>> g10 = g(sb2.toString());
        a10 = g10.a();
        List<String> b10 = g10.b();
        arrayList = new ArrayList(b10.size());
        for (String jSONObject : b10) {
            try {
                arrayList.add(new JSONObject(jSONObject));
            } catch (JSONException e10) {
                H1.a(this.f42358d, "!! DATALOSS !! Failed to serialize string to JSON Object", e10);
            }
        }
        return new v<>(a10, arrayList);
    }

    public final v<String, List<String>> g(String str) {
        List<T> w12 = C16877v.w1(this.f42355a.q(str));
        String str2 = null;
        if (!w12.isEmpty()) {
            String str3 = (String) w12.get(0);
            if (C15854t.W(str3, "cs_user_id:", false, 2, (Object) null)) {
                str2 = str3.substring(11);
                C17542s.i(str2, "this as java.lang.String).substring(startIndex)");
                w12.remove(0);
            }
        }
        return new v<>(str2, w12);
    }

    public final void h() {
        int i10;
        int i11 = this.f42356b.f47324k;
        if (this.f42362h != i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f42359e);
            String str = File.separator;
            sb2.append(str);
            sb2.append("evts");
            sb2.append(str);
            sb2.append(i11);
            String sb3 = sb2.toString();
            C17542s.j(sb3, "<set-?>");
            this.f42360f = sb3;
            this.f42362h = i11;
            int a10 = a(i11);
            this.f42361g = a10;
            if (a10 == 0) {
                i10 = 0;
            } else {
                int i12 = this.f42362h;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f42359e + str + "evts" + str + i12);
                sb4.append(str);
                sb4.append(a10);
                i10 = g(sb4.toString()).d().size();
            }
            this.f42363i = i10;
        }
    }
}

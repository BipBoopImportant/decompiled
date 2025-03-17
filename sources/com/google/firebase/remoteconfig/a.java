package com.google.firebase.remoteconfig;

import Fb.f;
import Gb.c;
import Ic.d;
import Ic.k;
import Ic.n;
import Lb.i;
import android.content.Context;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import nc.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xa.C8971l;
import xa.C8974o;

public class a {

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f68679n = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final Context f68680a;

    /* renamed from: b  reason: collision with root package name */
    private final f f68681b;

    /* renamed from: c  reason: collision with root package name */
    private final c f68682c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f68683d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f68684e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f68685f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f68686g;

    /* renamed from: h  reason: collision with root package name */
    private final m f68687h;

    /* renamed from: i  reason: collision with root package name */
    private final o f68688i;

    /* renamed from: j  reason: collision with root package name */
    private final t f68689j;

    /* renamed from: k  reason: collision with root package name */
    private final e f68690k;

    /* renamed from: l  reason: collision with root package name */
    private final p f68691l;

    /* renamed from: m  reason: collision with root package name */
    private final Jc.e f68692m;

    a(Context context, f fVar, e eVar, c cVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, p pVar, Jc.e eVar2) {
        this.f68680a = context;
        this.f68681b = fVar;
        this.f68690k = eVar;
        this.f68682c = cVar;
        this.f68683d = executor;
        this.f68684e = fVar2;
        this.f68685f = fVar3;
        this.f68686g = fVar4;
        this.f68687h = mVar;
        this.f68688i = oVar;
        this.f68689j = tVar;
        this.f68691l = pVar;
        this.f68692m = eVar2;
    }

    private static boolean k(g gVar, g gVar2) {
        return gVar2 == null || !gVar.h().equals(gVar2.h());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l l(C8971l lVar, C8971l lVar2, C8971l lVar3) {
        if (!lVar.q() || lVar.m() == null) {
            return C8974o.f(Boolean.FALSE);
        }
        g gVar = (g) lVar.m();
        return (!lVar2.q() || k(gVar, (g) lVar2.m())) ? this.f68685f.k(gVar).h(this.f68683d, new Ic.g(this)) : C8974o.f(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l n(Void voidR) {
        return e();
    }

    /* access modifiers changed from: private */
    public boolean o(C8971l<g> lVar) {
        if (!lVar.q()) {
            return false;
        }
        this.f68684e.d();
        g m10 = lVar.m();
        if (m10 != null) {
            s(m10.e());
            this.f68692m.g(m10);
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    static List<Map<String, String>> r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public C8971l<Boolean> e() {
        C8971l<g> e10 = this.f68684e.e();
        C8971l<g> e11 = this.f68685f.e();
        return C8974o.k(e10, e11).j(this.f68683d, new Ic.e(this, e10, e11));
    }

    public C8971l<Void> f() {
        return this.f68687h.i().r(i.a(), new Ic.f());
    }

    public C8971l<Boolean> g() {
        return f().r(this.f68683d, new d(this));
    }

    public Map<String, n> h() {
        return this.f68688i.d();
    }

    public k i() {
        return this.f68689j.d();
    }

    /* access modifiers changed from: package-private */
    public Jc.e j() {
        return this.f68692m;
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10) {
        this.f68691l.b(z10);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f68685f.e();
        this.f68686g.e();
        this.f68684e.e();
    }

    /* access modifiers changed from: package-private */
    public void s(JSONArray jSONArray) {
        if (this.f68682c != null) {
            try {
                this.f68682c.m(r(jSONArray));
            } catch (JSONException e10) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
            } catch (Gb.a e11) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
            }
        }
    }
}

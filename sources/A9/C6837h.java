package a9;

import com.contentsquare.android.sdk.C7119d;
import org.json.JSONObject;

/* renamed from: a9.h  reason: case insensitive filesystem */
public final /* synthetic */ class C6837h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C7119d f42589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JSONObject f42590b;

    public /* synthetic */ C6837h(C7119d dVar, JSONObject jSONObject) {
        this.f42589a = dVar;
        this.f42590b = jSONObject;
    }

    public final void run() {
        C7119d.d(this.f42589a, this.f42590b);
    }
}

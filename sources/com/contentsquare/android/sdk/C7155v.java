package com.contentsquare.android.sdk;

import D8.c;
import a9.H1;
import com.contentsquare.android.sdk.C7162y0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;
import l8.C8542f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.v  reason: case insensitive filesystem */
public final class C7155v extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final JSONObject f47657m;

    /* renamed from: com.contentsquare.android.sdk.v$a */
    public static final class a extends C7162y0.a<C7155v> {

        /* renamed from: k  reason: collision with root package name */
        public JSONObject f47658k = new JSONObject();

        public a() {
            super(16);
        }

        public final C7162y0 a() {
            return new C7155v(this);
        }

        public final void b(C8542f fVar) {
            C17542s.j(fVar, "transaction");
            c cVar = new c("TransactionEventBuilder");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("vl", (double) fVar.c());
                jSONObject.put("cu", fVar.a());
                if (fVar.b() != null) {
                    jSONObject.put("id", fVar.b());
                }
                this.f47658k = jSONObject;
            } catch (JSONException e10) {
                H1.a(cVar, "Not valid transaction JSON", e10);
                throw new IllegalArgumentException("Invalid transaction");
            }
        }
    }

    public C7155v(a aVar) {
        super(aVar);
        this.f47657m = aVar.f47658k;
    }

    public final void a() {
        double optDouble = this.f47657m.optDouble("vl", 0.0d);
        V v10 = V.f144353a;
        String format = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(optDouble)}, 1));
        C17542s.i(format, "format(locale, format, *args)");
        int optInt = this.f47657m.optInt("cu", 0);
        String optString = this.f47657m.optString("id", "");
        c cVar = C7162y0.f47731l;
        cVar.j("Transaction - Value: " + format + " - Currency: " + optInt + " - ID: " + optString);
    }
}

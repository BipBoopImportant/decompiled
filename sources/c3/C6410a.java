package C3;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t3.N;
import t3.q;

/* renamed from: C3.a  reason: case insensitive filesystem */
final class C6410a {
    public static byte[] a(byte[] bArr) {
        return N.f29462a >= 27 ? bArr : N.s0(c(N.H(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (N.f29462a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(N.H(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return N.s0(sb2.toString());
        } catch (JSONException e10) {
            q.d("ClearKeyUtil", "Failed to adjust response data: " + N.H(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}

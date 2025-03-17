package EE;

import org.json.JSONObject;

/* renamed from: EE.d  reason: case insensitive filesystem */
class C12849d implements C12852g {
    C12849d() {
    }

    public <T> String a(T t10) {
        String jSONObject = new JSONObject(t10).toString();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < jSONObject.length()) {
            char charAt = jSONObject.charAt(i10);
            Character valueOf = Character.valueOf(charAt);
            i10++;
            Character valueOf2 = i10 < jSONObject.length() ? Character.valueOf(jSONObject.charAt(i10)) : null;
            if ((Character.isLetter(charAt) || Character.isDigit(charAt)) && Character.isUpperCase(charAt) && (Character.isLetter(valueOf2.charValue()) || Character.isDigit(valueOf2.charValue()))) {
                sb2.append('_');
                sb2.append(Character.toLowerCase(charAt));
            } else {
                sb2.append(valueOf);
            }
        }
        return sb2.toString();
    }
}

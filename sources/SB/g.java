package Sb;

import Qb.C9251i;
import com.adjust.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class g {

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f63280b = Charset.forName(Constants.ENCODING);

    /* renamed from: a  reason: collision with root package name */
    private final Wb.g f63281a;

    class a extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f63282a;

        a(String str) {
            this.f63282a = str;
            put("userId", str);
        }
    }

    public g(Wb.g gVar) {
        this.f63281a = gVar;
    }

    private static Map<String, String> e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, p(jSONObject, next));
        }
        return hashMap;
    }

    private static List<j> f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                Nb.g f10 = Nb.g.f();
                f10.l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return p(new JSONObject(str), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<j> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f63308a.b(list.get(i10))));
            } catch (JSONException e10) {
                Nb.g.f().l("Exception parsing rollout assignment!", e10);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            Nb.g f10 = Nb.g.f();
            f10.g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            Nb.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", new Object[]{file.getAbsolutePath(), str}));
        }
    }

    private static String o(String str) {
        return new a(str).toString();
    }

    private static String p(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    public File a(String str) {
        return this.f63281a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f63281a.q(str, "keys");
    }

    public File c(String str) {
        return this.f63281a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f63281a.q(str, "user-data");
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> i(String str, boolean z10) {
        FileInputStream fileInputStream;
        Exception e10;
        File a10 = z10 ? a(str) : b(str);
        if (!a10.exists() || a10.length() == 0) {
            n(a10, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        try {
            fileInputStream = new FileInputStream(a10);
            try {
                Map<String, String> e11 = e(C9251i.A(fileInputStream));
                C9251i.f(fileInputStream, "Failed to close user metadata file.");
                return e11;
            } catch (Exception e12) {
                e10 = e12;
                try {
                    Nb.g.f().l("Error deserializing user metadata.", e10);
                    m(a10);
                    C9251i.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    C9251i.f(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e13) {
            Exception exc = e13;
            fileInputStream = null;
            e10 = exc;
            Nb.g.f().l("Error deserializing user metadata.", e10);
            m(a10);
            C9251i.f(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            C9251i.f(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List<j> j(String str) {
        File c10 = c(str);
        if (!c10.exists() || c10.length() == 0) {
            n(c10, "The file has a length of zero for session: " + str);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(c10);
            try {
                List<j> f10 = f(C9251i.A(fileInputStream2));
                Nb.g f11 = Nb.g.f();
                f11.b("Loaded rollouts state:\n" + f10 + "\nfor session " + str);
                C9251i.f(fileInputStream2, "Failed to close rollouts state file.");
                return f10;
            } catch (Exception e10) {
                e = e10;
                fileInputStream = fileInputStream2;
                try {
                    Nb.g.f().l("Error deserializing rollouts state.", e);
                    m(c10);
                    C9251i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th2) {
                    th = th2;
                    C9251i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C9251i.f(fileInputStream, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Nb.g.f().l("Error deserializing rollouts state.", e);
            m(c10);
            C9251i.f(fileInputStream, "Failed to close rollouts state file.");
            return Collections.emptyList();
        }
    }

    public String k(String str) {
        FileInputStream fileInputStream;
        File d10 = d(str);
        FileInputStream fileInputStream2 = null;
        if (!d10.exists() || d10.length() == 0) {
            Nb.g.f().b("No userId set for session " + str);
            m(d10);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(d10);
            try {
                String g10 = g(C9251i.A(fileInputStream));
                Nb.g.f().b("Loaded userId " + g10 + " for session " + str);
                C9251i.f(fileInputStream, "Failed to close user metadata file.");
                return g10;
            } catch (Exception e10) {
                e = e10;
                try {
                    Nb.g.f().l("Error deserializing user metadata.", e);
                    m(d10);
                    C9251i.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C9251i.f(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Nb.g.f().l("Error deserializing user metadata.", e);
            m(d10);
            C9251i.f(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            C9251i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void q(String str, Map<String, String> map) {
        r(str, map, false);
    }

    public void r(String str, Map<String, String> map, boolean z10) {
        File a10 = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String h10 = h(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a10), f63280b));
            try {
                bufferedWriter2.write(h10);
                bufferedWriter2.flush();
                C9251i.f(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e10) {
                e = e10;
                bufferedWriter = bufferedWriter2;
                try {
                    Nb.g.f().l("Error serializing key/value metadata.", e);
                    m(a10);
                    C9251i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    C9251i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
                C9251i.f(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Nb.g.f().l("Error serializing key/value metadata.", e);
            m(a10);
            C9251i.f(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    public void s(String str, List<j> list) {
        BufferedWriter bufferedWriter;
        Exception e10;
        File c10 = c(str);
        if (list.isEmpty()) {
            n(c10, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            String l10 = l(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c10), f63280b));
            try {
                bufferedWriter.write(l10);
                bufferedWriter.flush();
            } catch (Exception e11) {
                e10 = e11;
                try {
                    Nb.g.f().l("Error serializing rollouts state.", e10);
                    m(c10);
                    C9251i.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
            Nb.g.f().l("Error serializing rollouts state.", e10);
            m(c10);
            C9251i.f(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            C9251i.f(bufferedWriter, "Failed to close rollouts state file.");
            throw th;
        }
        C9251i.f(bufferedWriter, "Failed to close rollouts state file.");
    }

    public void t(String str, String str2) {
        File d10 = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            String o10 = o(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d10), f63280b));
            try {
                bufferedWriter2.write(o10);
                bufferedWriter2.flush();
                C9251i.f(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e10) {
                e = e10;
                bufferedWriter = bufferedWriter2;
                try {
                    Nb.g.f().l("Error serializing user metadata.", e);
                    C9251i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    C9251i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
                C9251i.f(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Nb.g.f().l("Error serializing user metadata.", e);
            C9251i.f(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}

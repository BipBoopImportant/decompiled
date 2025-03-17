package Yb;

import Qb.C9251i;
import Wb.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final File f64895a;

    public a(g gVar) {
        this.f64895a = gVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f64895a;
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Nb.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a10 = a();
            if (a10.exists()) {
                fileInputStream = new FileInputStream(a10);
                try {
                    jSONObject = new JSONObject(C9251i.A(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e10) {
                    e = e10;
                    try {
                        Nb.g.f().e("Failed to fetch cached settings", e);
                        C9251i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        C9251i.f(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                Nb.g.f().i("Settings file does not exist.");
                jSONObject = null;
            }
            C9251i.f(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Nb.g.f().e("Failed to fetch cached settings", e);
            C9251i.f(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            C9251i.f(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j10, JSONObject jSONObject) {
        Nb.g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C9251i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    try {
                        Nb.g.f().e("Failed to cache settings", e);
                        C9251i.f(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th2) {
                        th = th2;
                        C9251i.f(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter = fileWriter2;
                    C9251i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                Nb.g.f().e("Failed to cache settings", e);
                C9251i.f(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}

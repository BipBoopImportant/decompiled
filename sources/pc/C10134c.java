package pc;

import Fb.f;
import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pc.c  reason: case insensitive filesystem */
public class C10134c {

    /* renamed from: a  reason: collision with root package name */
    private File f75831a;

    /* renamed from: b  reason: collision with root package name */
    private final f f75832b;

    /* renamed from: pc.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C10134c(f fVar) {
        this.f75832b = fVar;
    }

    private File a() {
        if (this.f75831a == null) {
            synchronized (this) {
                try {
                    if (this.f75831a == null) {
                        File filesDir = this.f75832b.k().getFilesDir();
                        this.f75831a = new File(filesDir, "PersistedInstallation." + this.f75832b.o() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f75831a;
    }

    private JSONObject c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public d b(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f75832b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public d d() {
        JSONObject c10 = c();
        String optString = c10.optString("Fid", (String) null);
        int optInt = c10.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c10.optString("AuthToken", (String) null);
        String optString3 = c10.optString("RefreshToken", (String) null);
        long optLong = c10.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c10.optLong("ExpiresInSecs", 0);
        return d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c10.optString("FisError", (String) null)).a();
    }
}

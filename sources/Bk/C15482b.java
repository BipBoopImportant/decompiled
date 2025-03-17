package BK;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: BK.b  reason: case insensitive filesystem */
public class C15482b {

    /* renamed from: a  reason: collision with root package name */
    public final String f133414a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f133415b;

    /* renamed from: c  reason: collision with root package name */
    public final String f133416c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f133417d;

    public C15482b(PackageInfo packageInfo, boolean z10) {
        this(packageInfo.packageName, b(packageInfo.signatures), packageInfo.versionName, z10);
    }

    public static String a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set<String> b(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature a10 : signatureArr) {
            hashSet.add(a(a10));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C15482b)) {
            return false;
        }
        C15482b bVar = (C15482b) obj;
        return this.f133414a.equals(bVar.f133414a) && this.f133416c.equals(bVar.f133416c) && this.f133417d == bVar.f133417d && this.f133415b.equals(bVar.f133415b);
    }

    public int hashCode() {
        int hashCode = (((this.f133414a.hashCode() * 92821) + this.f133416c.hashCode()) * 92821) + (this.f133417d.booleanValue() ? 1 : 0);
        for (String hashCode2 : this.f133415b) {
            hashCode = (hashCode * 92821) + hashCode2.hashCode();
        }
        return hashCode;
    }

    public C15482b(String str, Set<String> set, String str2, boolean z10) {
        this.f133414a = str;
        this.f133415b = set;
        this.f133416c = str2;
        this.f133417d = Boolean.valueOf(z10);
    }
}

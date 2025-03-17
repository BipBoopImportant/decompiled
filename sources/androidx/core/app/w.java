package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public class w {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f21126a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f21127b;

    /* renamed from: c  reason: collision with root package name */
    String f21128c;

    /* renamed from: d  reason: collision with root package name */
    String f21129d;

    /* renamed from: e  reason: collision with root package name */
    boolean f21130e;

    /* renamed from: f  reason: collision with root package name */
    boolean f21131f;

    static class a {
        static PersistableBundle a(w wVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = wVar.f21126a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", wVar.f21128c);
            persistableBundle.putString("key", wVar.f21129d);
            persistableBundle.putBoolean("isBot", wVar.f21130e);
            persistableBundle.putBoolean("isImportant", wVar.f21131f);
            return persistableBundle;
        }
    }

    static class b {
        static Person a(w wVar) {
            return new Person.Builder().setName(wVar.c()).setIcon(wVar.a() != null ? wVar.a().o() : null).setUri(wVar.d()).setKey(wVar.b()).setBot(wVar.e()).setImportant(wVar.f()).build();
        }
    }

    public IconCompat a() {
        return this.f21127b;
    }

    public String b() {
        return this.f21129d;
    }

    public CharSequence c() {
        return this.f21126a;
    }

    public String d() {
        return this.f21128c;
    }

    public boolean e() {
        return this.f21130e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        String b10 = b();
        String b11 = wVar.b();
        return (b10 == null && b11 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(wVar.c())) && Objects.equals(d(), wVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(wVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(wVar.f())) : Objects.equals(b10, b11);
    }

    public boolean f() {
        return this.f21131f;
    }

    public String g() {
        String str = this.f21128c;
        if (str != null) {
            return str;
        }
        if (this.f21126a == null) {
            return "";
        }
        return "name:" + this.f21126a;
    }

    public Person h() {
        return b.a(this);
    }

    public int hashCode() {
        String b10 = b();
        return b10 != null ? b10.hashCode() : Objects.hash(new Object[]{c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f())});
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f21126a);
        IconCompat iconCompat = this.f21127b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.n() : null);
        bundle.putString("uri", this.f21128c);
        bundle.putString("key", this.f21129d);
        bundle.putBoolean("isBot", this.f21130e);
        bundle.putBoolean("isImportant", this.f21131f);
        return bundle;
    }

    public PersistableBundle j() {
        return a.a(this);
    }
}

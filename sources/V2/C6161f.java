package v2;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.w;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u2.C6013b;

/* renamed from: v2.f  reason: case insensitive filesystem */
public class C6161f {

    /* renamed from: a  reason: collision with root package name */
    Context f31003a;

    /* renamed from: b  reason: collision with root package name */
    String f31004b;

    /* renamed from: c  reason: collision with root package name */
    Intent[] f31005c;

    /* renamed from: d  reason: collision with root package name */
    ComponentName f31006d;

    /* renamed from: e  reason: collision with root package name */
    CharSequence f31007e;

    /* renamed from: f  reason: collision with root package name */
    CharSequence f31008f;

    /* renamed from: g  reason: collision with root package name */
    CharSequence f31009g;

    /* renamed from: h  reason: collision with root package name */
    IconCompat f31010h;

    /* renamed from: i  reason: collision with root package name */
    w[] f31011i;

    /* renamed from: j  reason: collision with root package name */
    Set<String> f31012j;

    /* renamed from: k  reason: collision with root package name */
    C6013b f31013k;

    /* renamed from: l  reason: collision with root package name */
    boolean f31014l;

    /* renamed from: m  reason: collision with root package name */
    int f31015m;

    /* renamed from: n  reason: collision with root package name */
    PersistableBundle f31016n;

    /* renamed from: o  reason: collision with root package name */
    boolean f31017o = true;

    /* renamed from: p  reason: collision with root package name */
    int f31018p;

    /* renamed from: v2.f$a */
    private static class a {
        static void a(ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    /* renamed from: v2.f$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C6161f f31019a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31020b;

        /* renamed from: c  reason: collision with root package name */
        private Set<String> f31021c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Map<String, List<String>>> f31022d;

        /* renamed from: e  reason: collision with root package name */
        private Uri f31023e;

        public b(Context context, String str) {
            C6161f fVar = new C6161f();
            this.f31019a = fVar;
            fVar.f31003a = context;
            fVar.f31004b = str;
        }

        public C6161f a() {
            if (!TextUtils.isEmpty(this.f31019a.f31007e)) {
                C6161f fVar = this.f31019a;
                Intent[] intentArr = fVar.f31005c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f31020b) {
                    if (fVar.f31013k == null) {
                        fVar.f31013k = new C6013b(fVar.f31004b);
                    }
                    this.f31019a.f31014l = true;
                }
                if (this.f31021c != null) {
                    C6161f fVar2 = this.f31019a;
                    if (fVar2.f31012j == null) {
                        fVar2.f31012j = new HashSet();
                    }
                    this.f31019a.f31012j.addAll(this.f31021c);
                }
                if (this.f31022d != null) {
                    C6161f fVar3 = this.f31019a;
                    if (fVar3.f31016n == null) {
                        fVar3.f31016n = new PersistableBundle();
                    }
                    for (String next : this.f31022d.keySet()) {
                        Map map = this.f31022d.get(next);
                        this.f31019a.f31016n.putStringArray(next, (String[]) map.keySet().toArray(new String[0]));
                        for (String str : map.keySet()) {
                            List list = (List) map.get(str);
                            PersistableBundle persistableBundle = this.f31019a.f31016n;
                            persistableBundle.putStringArray(next + "/" + str, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                        }
                    }
                }
                if (this.f31023e != null) {
                    C6161f fVar4 = this.f31019a;
                    if (fVar4.f31016n == null) {
                        fVar4.f31016n = new PersistableBundle();
                    }
                    this.f31019a.f31016n.putString("extraSliceUri", C2.b.a(this.f31023e));
                }
                return this.f31019a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public b b(IconCompat iconCompat) {
            this.f31019a.f31010h = iconCompat;
            return this;
        }

        public b c(Intent intent) {
            return d(new Intent[]{intent});
        }

        public b d(Intent[] intentArr) {
            this.f31019a.f31005c = intentArr;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.f31019a.f31007e = charSequence;
            return this;
        }
    }

    C6161f() {
    }

    private PersistableBundle a() {
        if (this.f31016n == null) {
            this.f31016n = new PersistableBundle();
        }
        w[] wVarArr = this.f31011i;
        if (wVarArr != null && wVarArr.length > 0) {
            this.f31016n.putInt("extraPersonCount", wVarArr.length);
            int i10 = 0;
            while (i10 < this.f31011i.length) {
                PersistableBundle persistableBundle = this.f31016n;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f31011i[i10].j());
                i10 = i11;
            }
        }
        C6013b bVar = this.f31013k;
        if (bVar != null) {
            this.f31016n.putString("extraLocusId", bVar.a());
        }
        this.f31016n.putBoolean("extraLongLived", this.f31014l);
        return this.f31016n;
    }

    public String b() {
        return this.f31004b;
    }

    public int c() {
        return this.f31015m;
    }

    public boolean d(int i10) {
        return (i10 & this.f31018p) != 0;
    }

    public ShortcutInfo e() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f31003a, this.f31004b).setShortLabel(this.f31007e).setIntents(this.f31005c);
        IconCompat iconCompat = this.f31010h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.p(this.f31003a));
        }
        if (!TextUtils.isEmpty(this.f31008f)) {
            intents.setLongLabel(this.f31008f);
        }
        if (!TextUtils.isEmpty(this.f31009g)) {
            intents.setDisabledMessage(this.f31009g);
        }
        ComponentName componentName = this.f31006d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f31012j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f31015m);
        PersistableBundle persistableBundle = this.f31016n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            w[] wVarArr = this.f31011i;
            if (wVarArr != null && wVarArr.length > 0) {
                int length = wVarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f31011i[i10].h();
                }
                ShortcutInfo.Builder unused = intents.setPersons(personArr);
            }
            C6013b bVar = this.f31013k;
            if (bVar != null) {
                ShortcutInfo.Builder unused2 = intents.setLocusId(bVar.c());
            }
            ShortcutInfo.Builder unused3 = intents.setLongLived(this.f31014l);
        } else {
            intents.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.f31018p);
        }
        return intents.build();
    }
}

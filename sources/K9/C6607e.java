package K9;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import j0.C5446b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: K9.e  reason: case insensitive filesystem */
public final class C6607e {

    /* renamed from: a  reason: collision with root package name */
    private final Account f37826a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f37827b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f37828c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f37829d;

    /* renamed from: e  reason: collision with root package name */
    private final int f37830e;

    /* renamed from: f  reason: collision with root package name */
    private final View f37831f;

    /* renamed from: g  reason: collision with root package name */
    private final String f37832g;

    /* renamed from: h  reason: collision with root package name */
    private final String f37833h;

    /* renamed from: i  reason: collision with root package name */
    private final ua.a f37834i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f37835j;

    /* renamed from: K9.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f37836a;

        /* renamed from: b  reason: collision with root package name */
        private C5446b f37837b;

        /* renamed from: c  reason: collision with root package name */
        private String f37838c;

        /* renamed from: d  reason: collision with root package name */
        private String f37839d;

        /* renamed from: e  reason: collision with root package name */
        private final ua.a f37840e = ua.a.f56880j;

        public C6607e a() {
            return new C6607e(this.f37836a, this.f37837b, (Map) null, 0, (View) null, this.f37838c, this.f37839d, this.f37840e, false);
        }

        public a b(String str) {
            this.f37838c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f37837b == null) {
                this.f37837b = new C5446b();
            }
            this.f37837b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f37836a = account;
            return this;
        }

        public final a e(String str) {
            this.f37839d = str;
            return this;
        }
    }

    public C6607e(Account account, Set set, Map map, int i10, View view, String str, String str2, ua.a aVar, boolean z10) {
        this.f37826a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f37827b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f37829d = map;
        this.f37831f = view;
        this.f37830e = i10;
        this.f37832g = str;
        this.f37833h = str2;
        this.f37834i = aVar == null ? ua.a.f56880j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (E e10 : map.values()) {
            hashSet.addAll(e10.f37759a);
        }
        this.f37828c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f37826a;
    }

    @Deprecated
    public String b() {
        Account account = this.f37826a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f37826a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> d() {
        return this.f37828c;
    }

    public Set<Scope> e(com.google.android.gms.common.api.a<?> aVar) {
        E e10 = (E) this.f37829d.get(aVar);
        if (e10 == null || e10.f37759a.isEmpty()) {
            return this.f37827b;
        }
        HashSet hashSet = new HashSet(this.f37827b);
        hashSet.addAll(e10.f37759a);
        return hashSet;
    }

    public String f() {
        return this.f37832g;
    }

    public Set<Scope> g() {
        return this.f37827b;
    }

    public final ua.a h() {
        return this.f37834i;
    }

    public final Integer i() {
        return this.f37835j;
    }

    public final String j() {
        return this.f37833h;
    }

    public final void k(Integer num) {
        this.f37835j = num;
    }
}

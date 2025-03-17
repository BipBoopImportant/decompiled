package x7;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b#\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\t\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u0010\u001b¨\u00063"}, d2 = {"Lx7/a;", "Ljava/io/Serializable;", "", "id", "name", "nickname", "pictureURL", "email", "", "isEmailVerified", "familyName", "Ljava/util/Date;", "createdAt", "", "", "identities", "", "extraInfo", "userMetadata", "appMetadata", "givenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "getName", "()Ljava/lang/String;", "c", "getNickname", "d", "getPictureURL", "e", "getEmail", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "getFamilyName", "h", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "i", "Ljava/util/List;", "j", "Ljava/util/Map;", "k", "l", "m", "getGivenName", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x7.a  reason: case insensitive filesystem */
public final class C8956a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f57727a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57728b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57729c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57730d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57731e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f57732f;

    /* renamed from: g  reason: collision with root package name */
    private final String f57733g;

    /* renamed from: h  reason: collision with root package name */
    private final Date f57734h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Object> f57735i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Object> f57736j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f57737k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, Object> f57738l;

    /* renamed from: m  reason: collision with root package name */
    private final String f57739m;

    public C8956a(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Date date, List<Object> list, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, String str7) {
        this.f57727a = str;
        this.f57728b = str2;
        this.f57729c = str3;
        this.f57730d = str4;
        this.f57731e = str5;
        this.f57732f = bool;
        this.f57733g = str6;
        this.f57734h = date;
        this.f57735i = list;
        this.f57736j = map;
        this.f57737k = map2;
        this.f57738l = map3;
        this.f57739m = str7;
    }
}

package t9;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import o9.C8611a;
import t9.M;

/* renamed from: t9.t  reason: case insensitive filesystem */
public final /* synthetic */ class C8871t implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f56738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f56739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f56740c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C8611a.C0887a f56741d;

    public /* synthetic */ C8871t(M m10, String str, Map map, C8611a.C0887a aVar) {
        this.f56738a = m10;
        this.f56739b = str;
        this.f56740c = map;
        this.f56741d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f56738a.L1(this.f56739b, this.f56740c, this.f56741d, (SQLiteDatabase) obj);
    }
}

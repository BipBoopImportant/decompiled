package xE;

import GE.C12939d;
import HE.C12998c;
import com.optimizely.ab.Optimizely;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.d;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

/* renamed from: xE.a  reason: case insensitive filesystem */
public class C15211a {

    /* renamed from: a  reason: collision with root package name */
    private final Logger f131876a;

    /* renamed from: b  reason: collision with root package name */
    private Optimizely f131877b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, ?> f131878c = new HashMap();

    C15211a(Optimizely optimizely, Logger logger) {
        this.f131877b = optimizely;
        this.f131876a = logger;
    }

    public d a(String str, Map<String, Object> map) {
        Optimizely optimizely = this.f131877b;
        if (optimizely != null) {
            return optimizely.createUserContext(str, map);
        }
        this.f131876a.warn("Optimizely is not initialized, could not create a user context");
        return null;
    }

    public Double b(String str, String str2, String str3, Map<String, ?> map) {
        if (i()) {
            return this.f131877b.getFeatureVariableDouble(str, str2, str3, map);
        }
        this.f131876a.warn("Optimizely is not initialized, could not get feature {} variable {} double for user {} with attributes", str, str2, str3);
        return null;
    }

    public Integer c(String str, String str2, String str3, Map<String, ?> map) {
        if (i()) {
            return this.f131877b.getFeatureVariableInteger(str, str2, str3, map);
        }
        this.f131876a.warn("Optimizely is not initialized, could not get feature {} variable {} integer for user {} with attributes", str, str2, str3);
        return null;
    }

    public String d(String str, String str2, String str3, Map<String, ?> map) {
        if (i()) {
            return this.f131877b.getFeatureVariableString(str, str2, str3, map);
        }
        this.f131876a.warn("Optimizely is not initialized, could not get feature {} variable {} string for user {} with attributes", str, str2, str3);
        return null;
    }

    public C12939d e() {
        if (i()) {
            return this.f131877b.notificationCenter;
        }
        this.f131876a.warn("Optimizely is not initialized, could not get the notification listener");
        return null;
    }

    public C12998c f() {
        if (i()) {
            return this.f131877b.getOptimizelyConfig();
        }
        this.f131876a.error("Optimizely instance is not valid, failing getOptimizelyConfig call.");
        return null;
    }

    public ProjectConfig g() {
        if (i()) {
            return this.f131877b.getProjectConfig();
        }
        this.f131876a.warn("Optimizely is not initialized, could not get project config");
        return null;
    }

    public Boolean h(String str, String str2, Map<String, ?> map) {
        if (i()) {
            return this.f131877b.isFeatureEnabled(str, str2, map);
        }
        this.f131876a.warn("Optimizely is not initialized, could not enable feature {} for user {} with attributes", (Object) str, (Object) str2);
        return Boolean.FALSE;
    }

    public boolean i() {
        Optimizely optimizely = this.f131877b;
        if (optimizely != null) {
            return optimizely.isValid();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void j(Map<String, ?> map) {
        this.f131878c = map;
    }
}

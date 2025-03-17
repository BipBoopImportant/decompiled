package org.maplibre.android;

import AL.C15449c;
import WL.C16784a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import androidx.annotation.Keep;
import org.maplibre.android.net.b;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.util.DefaultStyle;
import org.maplibre.android.util.TileServerOptions;
import org.maplibre.android.utils.g;
import zL.C18771a;

@SuppressLint({"StaticFieldLeak"})
@Keep
public final class MapLibre {
    private static MapLibre INSTANCE = null;
    private static final String TAG = "Mbgl-MapLibre";
    private static e moduleProvider;
    private String apiKey;
    private Context context;
    private TileServerOptions tileServerOptions;

    MapLibre(Context context2, String str) {
        this.context = context2;
        this.apiKey = str;
    }

    public static String getApiKey() {
        validateMapLibre();
        return INSTANCE.apiKey;
    }

    public static Context getApplicationContext() {
        validateMapLibre();
        return INSTANCE.context;
    }

    private static AssetManager getAssetManager() {
        return getApplicationContext().getResources().getAssets();
    }

    public static synchronized MapLibre getInstance(Context context2) {
        MapLibre mapLibre;
        synchronized (MapLibre.class) {
            try {
                g.b(context2);
                g.a(TAG);
                if (INSTANCE == null) {
                    Context applicationContext = context2.getApplicationContext();
                    FileSource.f(applicationContext);
                    INSTANCE = new MapLibre(applicationContext, (String) null);
                    b.b(applicationContext);
                }
                TileServerOptions a10 = TileServerOptions.a(n.MapLibre);
                MapLibre mapLibre2 = INSTANCE;
                mapLibre2.tileServerOptions = a10;
                mapLibre2.apiKey = null;
                FileSource c10 = FileSource.c(context2);
                c10.setTileServerOptions(a10);
                c10.setApiKey((String) null);
                mapLibre = INSTANCE;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return mapLibre;
    }

    public static e getModuleProvider() {
        if (moduleProvider == null) {
            moduleProvider = new f();
        }
        return moduleProvider;
    }

    public static DefaultStyle getPredefinedStyle(String str) {
        validateMapLibre();
        TileServerOptions tileServerOptions2 = INSTANCE.tileServerOptions;
        if (tileServerOptions2 == null) {
            return null;
        }
        for (DefaultStyle defaultStyle : tileServerOptions2.b()) {
            if (defaultStyle.a().equalsIgnoreCase(str)) {
                return defaultStyle;
            }
        }
        return null;
    }

    public static DefaultStyle[] getPredefinedStyles() {
        validateMapLibre();
        TileServerOptions tileServerOptions2 = INSTANCE.tileServerOptions;
        if (tileServerOptions2 != null) {
            return tileServerOptions2.b();
        }
        return null;
    }

    public static TileServerOptions getTileServerOptions() {
        validateMapLibre();
        return INSTANCE.tileServerOptions;
    }

    public static boolean hasInstance() {
        return INSTANCE != null;
    }

    static boolean isApiKeyValid(String str) {
        if (str == null) {
            return false;
        }
        return !str.trim().toLowerCase(C18771a.f152883a).isEmpty();
    }

    public static synchronized Boolean isConnected() {
        Boolean valueOf;
        synchronized (MapLibre.class) {
            validateMapLibre();
            valueOf = Boolean.valueOf(b.b(INSTANCE.context).c());
        }
        return valueOf;
    }

    public static void setApiKey(String str) {
        validateMapLibre();
        throwIfApiKeyInvalid(str);
        INSTANCE.apiKey = str;
        FileSource.c(getApplicationContext()).setApiKey(str);
    }

    public static synchronized void setConnected(Boolean bool) {
        synchronized (MapLibre.class) {
            validateMapLibre();
            b.b(INSTANCE.context).f(bool);
        }
    }

    public static void setModuleProvider(e eVar) {
        moduleProvider = eVar;
    }

    public static void throwIfApiKeyInvalid(String str) {
        if (!isApiKeyValid(str)) {
            throw new C15449c("A valid API key is required, currently provided key is: " + str);
        }
    }

    private static void validateMapLibre() {
        if (INSTANCE == null) {
            throw new C15449c();
        }
    }

    MapLibre(Context context2, String str, TileServerOptions tileServerOptions2) {
        this.context = context2;
        this.apiKey = str;
        this.tileServerOptions = tileServerOptions2;
    }

    public static synchronized MapLibre getInstance(Context context2, String str, n nVar) {
        MapLibre mapLibre;
        synchronized (MapLibre.class) {
            try {
                g.b(context2);
                g.a(TAG);
                MapLibre mapLibre2 = INSTANCE;
                if (mapLibre2 == null) {
                    C16784a.e(new C16784a.b[0]);
                    Context applicationContext = context2.getApplicationContext();
                    FileSource.f(applicationContext);
                    INSTANCE = new MapLibre(applicationContext, str);
                    b.b(applicationContext);
                } else {
                    mapLibre2.apiKey = str;
                }
                TileServerOptions a10 = TileServerOptions.a(nVar);
                INSTANCE.tileServerOptions = a10;
                FileSource c10 = FileSource.c(context2);
                c10.setTileServerOptions(a10);
                c10.setApiKey(str);
                mapLibre = INSTANCE;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return mapLibre;
    }
}

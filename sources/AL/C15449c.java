package AL;

/* renamed from: AL.c  reason: case insensitive filesystem */
public class C15449c extends RuntimeException {
    public C15449c() {
        super("\nUsing MapView requires calling MapLibre.getInstance(Context context, String apiKey, WellKnownTileServer wellKnownTileServer) before inflating or creating the view.");
    }

    public C15449c(String str) {
        super(str);
    }
}

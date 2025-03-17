package EE;

import com.fasterxml.jackson.annotation.JsonInclude$Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/* renamed from: EE.c  reason: case insensitive filesystem */
class C12848c implements C12852g {

    /* renamed from: a  reason: collision with root package name */
    private ObjectMapper f109418a = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

    C12848c() {
    }

    public <T> String a(T t10) {
        this.f109418a.setSerializationInclusion(JsonInclude$Include.NON_NULL);
        try {
            return this.f109418a.writeValueAsString(t10);
        } catch (JsonProcessingException e10) {
            throw new C12851f("Unable to serialize payload", e10);
        }
    }
}

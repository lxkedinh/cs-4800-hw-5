package bridge.media;

public abstract class Media {
   protected MediaType mediaType;

   protected Media() {}

    public String getMediaType() {
        return mediaType.name();
    }
}

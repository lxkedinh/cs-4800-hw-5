package bridge.media;

public class ImageMedia extends Media {
    public ImageMedia() {
        this.mediaType = MediaType.Image;
    }

    @Override
    public String toString() {
        return "Image";
    }
}

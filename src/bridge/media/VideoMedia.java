package bridge.media;

public class VideoMedia extends Media {
    public VideoMedia() {
        this.mediaType = MediaType.Video;
    }

    @Override
    public String toString() {
        return "Video";
    }
}

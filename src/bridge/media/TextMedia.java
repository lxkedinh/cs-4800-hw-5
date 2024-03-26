package bridge.media;

public class TextMedia extends Media {
    private String textContent;

    public TextMedia(String textContent) {
        this.mediaType = MediaType.Text;
        this.textContent = textContent;
    }

    @Override
    public String toString() {
        return textContent;
    }
}

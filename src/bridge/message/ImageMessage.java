package bridge.message;

import bridge.media.Media;
import bridge.messaging_app.MessagingApp;

public class ImageMessage implements MessageType {
    private MessagingApp messagingApp;
    private Media content;

    public ImageMessage() {}

    @Override
    public void setMessagingApp(MessagingApp messagingApp) {
        this.messagingApp = messagingApp;
    }

    @Override
    public void setContent(Media content) {
        this.content = content;
    }

    @Override
    public String getMediaType() {
        return "Image";
    }

    @Override
    public <MediaType> MediaType getContent() {
        return null;
    }

    @Override
    public void sendMessage() {
        System.out.println("Image message sent using " + messagingApp.getAppName());
    }
}

package bridge.message;

import bridge.media.Media;
import bridge.messaging_app.MessagingApp;

public class VideoMessage implements MessageType {
    private MessagingApp messagingApp;
    private Media content;

    public VideoMessage() {}

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
        return "Video";
    }

    @Override
    public <MediaType> MediaType getContent() {
        return null;
    }

    @Override
    public void sendMessage() {
        System.out.println("Video message sent using " + messagingApp.getAppName());
    }
}

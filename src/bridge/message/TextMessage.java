package bridge.message;

import bridge.media.Media;
import bridge.media.TextMedia;
import bridge.messaging_app.MessagingApp;

public class TextMessage implements MessageType {
    private MessagingApp messagingApp;
    private Media content;

    public TextMessage() {}

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
        return content.getMediaType();
    }

    @Override
    public <MediaType> MediaType getContent() {
        return null;
    }

    @Override
    public void sendMessage() {
        System.out.println("Text message with content \"" + content + "\" sent using " + messagingApp.getAppName());
    }
}

package bridge.message;

import bridge.media.Media;
import bridge.media.TextMedia;
import bridge.messaging_app.MessagingApp;

public interface MessageType {
    public void setMessagingApp(MessagingApp messagingApp);
    public void setContent(Media content);
    public String getMediaType();
    <MediaType> MediaType getContent();
    public void sendMessage();
}

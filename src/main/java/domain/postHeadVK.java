package domain;

public class postHeadVK {
    int postId;
    int userId;
    int ownerId;
    int fromId;
    int createdBy;
    int date;
    int replyPostId;
    int signerId;
    int postPonedId;
    boolean canPin;
    boolean canDelete;
    boolean canEdit;
    boolean markedAsAdd;
    boolean friendsOnly;
    boolean isFavourite;
    String userName;
    String userProfilePic;
    int countViews;
    public void comments() {
        int count;
        boolean canPost;
        boolean groupsCanPost;
        boolean canClose;
        boolean canOpen;
    }
    public void copyright() {
        int id;
        String link;
        String name;
        String type;
    }
    public void likes() {
        int count;
        boolean userLikes;
        boolean canLike;
        boolean canPublish;
    }
    public void reposts() {
        int count;
        boolean userReposted;
    }
    public void geo() {
        String type;
        String coordinates;
        String place;
    }
}
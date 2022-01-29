package domain;

public class donutVK {
    private boolean isDonut;
    private int payDuration;
    private int placeholder;
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPayDuration() {
        return payDuration;
    }

    public void setPayDuration(int payDuration) {
        this.payDuration = payDuration;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(int placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}

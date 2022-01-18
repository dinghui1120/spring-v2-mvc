package bridge.course;

/**
 * Created by Tom.
 */
public class AbstractCourse implements ICourse {
    private INote note;
    private IVideo video;

    public void setNote(INote note) {
        this.note = note;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }
}

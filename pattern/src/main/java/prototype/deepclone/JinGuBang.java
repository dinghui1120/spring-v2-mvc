package prototype.deepclone;

import java.io.Serializable;

public class JinGuBang implements Serializable {
    private Double height = 10.0;
    private Double weight = 2.0;

    public void big() {
        this.height*=2;
        this.weight*=2;
    }

    public void small() {
        this.height/=2;
        this.weight/=2;
    }


}

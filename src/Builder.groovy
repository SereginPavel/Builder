/**
 * Created by SerP on 30.10.2017.
 */
class OneBuild implements Serializable, Runnable{
    def props;
    OneBuild() {
    }

    OneBuild(props) {
        this.props = props
    }

    void run(){
        build job: "$props.JobName", wait: true
    }
}
return new OneBuild()


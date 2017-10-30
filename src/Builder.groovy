/**
 * Created by SerP on 30.10.2017.
 */
class OneBuild implements Serializable, Runnable{
    OneBuild() {
    }

    void run(){
        build job: 'pipeline-jenkins-example', wait: true
    }
}
return new OneBuild()


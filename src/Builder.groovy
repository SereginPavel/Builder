import groovyx.gpars.GParsPool

/**
 * Created by SerP on 30.10.2017.
 */
class OneBuild implements Serializable, Runnable{
    def rfcList = '123;432;231'.tokenize(';')
    void run(){
        GParsPool.withPool (100 ,{
            rfcList.eachParallel { x ->
                build job: 'pipeline-jenkins-example', wait: true
            }
        })
    }
}
return new OneBuild()


/**
 * Created by SerP on 30.10.2017.
 */
import groovyx.gpars.GParsPool
class Build {
    def rfcList = '123;432;231'.tokenize(';')
    void runTest(){
        println rfcList
    }
}

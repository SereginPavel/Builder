/**
 * Created by SerP on 30.10.2017.
 */
class Build implements Serializable{
    def rfcList = '123;432;231'.tokenize(';')
    void runTest(){
        println rfcList
    }
}
